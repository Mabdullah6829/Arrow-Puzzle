package com.google.firebase.firestore.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Pipeline;
import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.pipeline.BooleanExpression;
import com.google.firebase.firestore.pipeline.CollectionGroupOptions;
import com.google.firebase.firestore.pipeline.CollectionGroupSource;
import com.google.firebase.firestore.pipeline.CollectionSource;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.pipeline.InternalOptions;
import com.google.firebase.firestore.pipeline.LimitStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.WhereStage;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BiFunction;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.IntFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import p001B.C0099y;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class Query {
    private static final OrderBy KEY_ORDERING_ASC;
    private static final OrderBy KEY_ORDERING_DESC;

    @Nullable
    private final String collectionGroup;

    @Nullable
    private final Bound endAt;
    private final List<OrderBy> explicitSortOrder;
    private final List<Filter> filters;
    private final long limit;
    private final LimitType limitType;

    @Nullable
    private Target memoizedAggregateTarget;
    private List<OrderBy> memoizedNormalizedOrderBys;

    @Nullable
    private Target memoizedTarget;
    private final ResourcePath path;

    @Nullable
    private final Bound startAt;

    public enum LimitType {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    public static class QueryComparator implements Comparator<Document> {
        private final List<OrderBy> sortOrder;

        public QueryComparator(List<OrderBy> list) {
            boolean z;
            Iterator<OrderBy> it = list.iterator();
            loop0: while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else {
                        z = (z || it.next().getField().equals(FieldPath.KEY_PATH)) ? true : z;
                    }
                }
            }
            if (!z) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.sortOrder = list;
        }

        @Override // java.util.Comparator
        public int compare(Document document, Document document2) {
            Iterator<OrderBy> it = this.sortOrder.iterator();
            while (it.hasNext()) {
                int iCompare = it.next().compare(document, document2);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return 0;
        }
    }

    static {
        OrderBy.Direction direction = OrderBy.Direction.ASCENDING;
        FieldPath fieldPath = FieldPath.KEY_PATH;
        KEY_ORDERING_ASC = OrderBy.getInstance(direction, fieldPath);
        KEY_ORDERING_DESC = OrderBy.getInstance(OrderBy.Direction.DESCENDING, fieldPath);
    }

    public Query(ResourcePath resourcePath, @Nullable String str, List<Filter> list, List<OrderBy> list2, long j2, LimitType limitType, @Nullable Bound bound, @Nullable Bound bound2) {
        this.path = resourcePath;
        this.collectionGroup = str;
        this.explicitSortOrder = list2;
        this.filters = list;
        this.limit = j2;
        this.limitType = limitType;
        this.startAt = bound;
        this.endAt = bound2;
    }

    public static Query atPath(ResourcePath resourcePath) {
        return new Query(resourcePath, null);
    }

    private List<Stage<?>> convertToStages(UserDataReader userDataReader) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pipelineSource(userDataReader.getDatabaseId()));
        Iterator<Filter> it = this.filters.iterator();
        while (it.hasNext()) {
            arrayList.add(new WhereStage(it.next().toPipelineExpr(), InternalOptions.EMPTY));
        }
        List<OrderBy> normalizedOrderBy = getNormalizedOrderBy();
        ArrayList arrayList2 = new ArrayList(normalizedOrderBy.size());
        ArrayList arrayList3 = new ArrayList(normalizedOrderBy.size());
        for (OrderBy orderBy : normalizedOrderBy) {
            Field field = new Field(orderBy.getField());
            arrayList2.add(field);
            if (orderBy.getDirection() == OrderBy.Direction.ASCENDING) {
                arrayList3.add(field.ascending());
            } else {
                arrayList3.add(field.descending());
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<OrderBy> it2 = this.explicitSortOrder.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new Field(it2.next().getField()));
        }
        if (arrayList4.size() == 1) {
            arrayList.add(new WhereStage(((Field) arrayList4.get(0)).exists(), InternalOptions.EMPTY));
        } else if (arrayList4.size() > 1) {
            C0099y c0099y = new C0099y(20);
            final Expression.Companion companion = Expression.Companion;
            Objects.requireNonNull(companion);
            arrayList.add(new WhereStage(Expression.and(((Field) arrayList4.get(0)).exists(), (BooleanExpression[]) skipFirstToArray(arrayList4, c0099y, new Function() { // from class: com.google.firebase.firestore.core.g
                @Override // com.google.firebase.firestore.util.Function
                public final Object apply(Object obj) {
                    return companion.exists((Field) obj);
                }
            })), InternalOptions.EMPTY));
        }
        if (this.startAt != null) {
            arrayList.add(new WhereStage(whereConditionsFromCursor(this.startAt, arrayList2, new C0099y(21)), InternalOptions.EMPTY));
        }
        if (this.endAt != null) {
            arrayList.add(new WhereStage(whereConditionsFromCursor(this.endAt, arrayList2, new C0099y(22)), InternalOptions.EMPTY));
        }
        if (!hasLimit()) {
            arrayList.add(new SortStage((Ordering[]) arrayList3.toArray(new Ordering[0]), InternalOptions.EMPTY));
            return arrayList;
        }
        if (this.limitType == LimitType.LIMIT_TO_FIRST) {
            Ordering[] orderingArr = (Ordering[]) arrayList3.toArray(new Ordering[0]);
            InternalOptions internalOptions = InternalOptions.EMPTY;
            arrayList.add(new SortStage(orderingArr, internalOptions));
            arrayList.add(new LimitStage((int) this.limit, internalOptions));
            return arrayList;
        }
        if (this.explicitSortOrder.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            Ordering ordering = (Ordering) obj;
            arrayList5.add(ordering.getDir() == Ordering.Direction.ASCENDING ? ordering.getExpr().descending() : ordering.getExpr().ascending());
        }
        Ordering[] orderingArr2 = (Ordering[]) arrayList5.toArray(new Ordering[0]);
        InternalOptions internalOptions2 = InternalOptions.EMPTY;
        arrayList.add(new SortStage(orderingArr2, internalOptions2));
        arrayList.add(new LimitStage((int) this.limit, internalOptions2));
        arrayList.add(new SortStage((Ordering[]) arrayList3.toArray(new Ordering[0]), internalOptions2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BooleanExpression[] lambda$convertToStages$0(int i2) {
        return new BooleanExpression[i2];
    }

    private boolean matchesBounds(Document document) {
        Bound bound = this.startAt;
        if (bound != null && !bound.sortsBeforeDocument(getNormalizedOrderBy(), document)) {
            return false;
        }
        Bound bound2 = this.endAt;
        return bound2 == null || bound2.sortsAfterDocument(getNormalizedOrderBy(), document);
    }

    private boolean matchesFilters(Document document) {
        Iterator<Filter> it = this.filters.iterator();
        while (it.hasNext()) {
            if (!it.next().matches(document)) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesOrderBy(Document document) {
        for (OrderBy orderBy : getNormalizedOrderBy()) {
            if (!orderBy.getField().equals(FieldPath.KEY_PATH) && document.getField(orderBy.field) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean matchesPathAndCollectionGroup(Document document) {
        ResourcePath path = document.getKey().getPath();
        if (this.collectionGroup != null) {
            return document.getKey().hasCollectionId(this.collectionGroup) && this.path.isPrefixOf(path);
        }
        if (DocumentKey.isDocumentKey(this.path)) {
            return this.path.equals(path);
        }
        return this.path.isPrefixOf(path) && this.path.length() == path.length() - 1;
    }

    @NonNull
    private Stage<?> pipelineSource(DatabaseId databaseId) {
        if (isDocumentQuery()) {
            return new DocumentsSource(this.path.canonicalString());
        }
        return isCollectionGroupQuery() ? new CollectionGroupSource(this.collectionGroup, new CollectionGroupOptions()) : new CollectionSource(this.path, new RemoteSerializer(databaseId), InternalOptions.EMPTY);
    }

    private static <T, R> R[] skipFirstToArray(List<T> list, IntFunction<R[]> intFunction, Function<T, R> function) {
        int size = list.size();
        R[] rArrApply = intFunction.apply(size - 1);
        for (int i2 = 1; i2 < size; i2++) {
            rArrApply[i2 - 1] = function.apply(list.get(i2));
        }
        return rArrApply;
    }

    private static BooleanExpression whereConditionsFromCursor(Bound bound, List<Field> list, BiFunction<Expression, Object, BooleanExpression> biFunction) {
        List<C0393Z0> position = bound.getPosition();
        int size = position.size();
        Assert.hardAssert(size <= list.size(), "Bound positions must not exceed order fields.", new Object[0]);
        int i2 = size - 1;
        BooleanExpression booleanExpressionApply = biFunction.apply(list.get(i2), position.get(i2));
        if (bound.isInclusive()) {
            booleanExpressionApply = Expression.m11444or(booleanExpressionApply, Expression.equal(list.get(i2), position.get(i2)));
        }
        for (int i3 = size - 2; i3 >= 0; i3--) {
            Field field = list.get(i3);
            C0393Z0 c0393z0 = position.get(i3);
            booleanExpressionApply = Expression.m11444or(biFunction.apply(field, c0393z0), Expression.and(field.equal(c0393z0), booleanExpressionApply));
        }
        return booleanExpressionApply;
    }

    public Query asCollectionQueryAtPath(ResourcePath resourcePath) {
        return new Query(resourcePath, null, this.filters, this.explicitSortOrder, this.limit, this.limitType, this.startAt, this.endAt);
    }

    public Comparator<Document> comparator() {
        return new QueryComparator(getNormalizedOrderBy());
    }

    public Query endAt(Bound bound) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, this.limit, this.limitType, this.startAt, bound);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        Query query = (Query) obj;
        if (this.limitType != query.limitType) {
            return false;
        }
        return toTarget().equals(query.toTarget());
    }

    public Query filter(Filter filter) {
        Assert.hardAssert(!isDocumentQuery(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.filters);
        arrayList.add(filter);
        return new Query(this.path, this.collectionGroup, arrayList, this.explicitSortOrder, this.limit, this.limitType, this.startAt, this.endAt);
    }

    public String getCanonicalId() {
        return toTarget().getCanonicalId() + "|lt:" + this.limitType;
    }

    @Nullable
    public String getCollectionGroup() {
        return this.collectionGroup;
    }

    @Nullable
    public Bound getEndAt() {
        return this.endAt;
    }

    public List<OrderBy> getExplicitOrderBy() {
        return this.explicitSortOrder;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public SortedSet<FieldPath> getInequalityFilterFields() {
        TreeSet treeSet = new TreeSet();
        Iterator<Filter> it = getFilters().iterator();
        while (it.hasNext()) {
            for (FieldFilter fieldFilter : it.next().getFlattenedFilters()) {
                if (fieldFilter.isInequality()) {
                    treeSet.add(fieldFilter.getField());
                }
            }
        }
        return treeSet;
    }

    public long getLimit() {
        return this.limit;
    }

    public LimitType getLimitType() {
        return this.limitType;
    }

    public synchronized List<OrderBy> getNormalizedOrderBy() {
        OrderBy.Direction direction;
        try {
            if (this.memoizedNormalizedOrderBys == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (OrderBy orderBy : this.explicitSortOrder) {
                    arrayList.add(orderBy);
                    hashSet.add(orderBy.field.canonicalString());
                }
                if (this.explicitSortOrder.size() > 0) {
                    List<OrderBy> list = this.explicitSortOrder;
                    direction = list.get(list.size() - 1).getDirection();
                } else {
                    direction = OrderBy.Direction.ASCENDING;
                }
                for (FieldPath fieldPath : getInequalityFilterFields()) {
                    if (!hashSet.contains(fieldPath.canonicalString()) && !fieldPath.isKeyField()) {
                        arrayList.add(OrderBy.getInstance(direction, fieldPath));
                    }
                }
                if (!hashSet.contains(FieldPath.KEY_PATH.canonicalString())) {
                    arrayList.add(direction.equals(OrderBy.Direction.ASCENDING) ? KEY_ORDERING_ASC : KEY_ORDERING_DESC);
                }
                this.memoizedNormalizedOrderBys = Collections.unmodifiableList(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.memoizedNormalizedOrderBys;
    }

    public ResourcePath getPath() {
        return this.path;
    }

    @Nullable
    public Bound getStartAt() {
        return this.startAt;
    }

    public boolean hasLimit() {
        return this.limit != -1;
    }

    public int hashCode() {
        return this.limitType.hashCode() + (toTarget().hashCode() * 31);
    }

    public boolean isCollectionGroupQuery() {
        return this.collectionGroup != null;
    }

    public boolean isDocumentQuery() {
        return DocumentKey.isDocumentKey(this.path) && this.collectionGroup == null && this.filters.isEmpty();
    }

    public Query limitToFirst(long j2) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, j2, LimitType.LIMIT_TO_FIRST, this.startAt, this.endAt);
    }

    public Query limitToLast(long j2) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, j2, LimitType.LIMIT_TO_LAST, this.startAt, this.endAt);
    }

    public boolean matches(Document document) {
        return document.isFoundDocument() && matchesPathAndCollectionGroup(document) && matchesOrderBy(document) && matchesFilters(document) && matchesBounds(document);
    }

    public boolean matchesAllDocuments() {
        return this.filters.isEmpty() && this.limit == -1 && this.startAt == null && this.endAt == null && (getExplicitOrderBy().isEmpty() || (getExplicitOrderBy().size() == 1 && getExplicitOrderBy().get(0).field.isKeyField()));
    }

    public Query orderBy(OrderBy orderBy) {
        Assert.hardAssert(!isDocumentQuery(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.explicitSortOrder);
        arrayList.add(orderBy);
        return new Query(this.path, this.collectionGroup, this.filters, arrayList, this.limit, this.limitType, this.startAt, this.endAt);
    }

    public Query startAt(Bound bound) {
        return new Query(this.path, this.collectionGroup, this.filters, this.explicitSortOrder, this.limit, this.limitType, bound, this.endAt);
    }

    public synchronized Target toAggregateTarget() {
        try {
            if (this.memoizedAggregateTarget == null) {
                this.memoizedAggregateTarget = toTarget(this.explicitSortOrder);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.memoizedAggregateTarget;
    }

    @NonNull
    public Pipeline toPipeline(FirebaseFirestore firebaseFirestore, UserDataReader userDataReader) {
        return new Pipeline(firebaseFirestore, userDataReader, convertToStages(userDataReader));
    }

    @NonNull
    public RealtimePipeline toRealtimePipeline(FirebaseFirestore firebaseFirestore, UserDataReader userDataReader) {
        return new RealtimePipeline(firebaseFirestore, new RemoteSerializer(userDataReader.getDatabaseId()), userDataReader, convertToStages(userDataReader), null);
    }

    public String toString() {
        return "Query(target=" + toTarget().toString() + ";limitType=" + this.limitType.toString() + ")";
    }

    public synchronized Target toTarget() {
        try {
            if (this.memoizedTarget == null) {
                this.memoizedTarget = toTarget(getNormalizedOrderBy());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.memoizedTarget;
    }

    @VisibleForTesting
    public synchronized Target toTarget(List<OrderBy> list) {
        if (this.limitType == LimitType.LIMIT_TO_FIRST) {
            return new Target(getPath(), getCollectionGroup(), getFilters(), list, this.limit, getStartAt(), getEndAt());
        }
        ArrayList arrayList = new ArrayList();
        for (OrderBy orderBy : list) {
            OrderBy.Direction direction = orderBy.getDirection();
            OrderBy.Direction direction2 = OrderBy.Direction.DESCENDING;
            if (direction == direction2) {
                direction2 = OrderBy.Direction.ASCENDING;
            }
            arrayList.add(OrderBy.getInstance(direction2, orderBy.getField()));
        }
        Bound bound = this.endAt;
        Bound bound2 = bound != null ? new Bound(bound.getPosition(), this.endAt.isInclusive()) : null;
        Bound bound3 = this.startAt;
        return new Target(getPath(), getCollectionGroup(), getFilters(), arrayList, this.limit, bound2, bound3 != null ? new Bound(bound3.getPosition(), this.startAt.isInclusive()) : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Query(ResourcePath resourcePath, @Nullable String str) {
        List list = Collections.EMPTY_LIST;
        this(resourcePath, str, list, list, -1L, LimitType.LIMIT_TO_FIRST, null, null);
    }
}
