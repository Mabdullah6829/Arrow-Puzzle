package com.google.firebase.firestore;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p011H.AbstractC0271e0;
import p022N.C0389X0;
import p022N.C0393Z0;
import p022N.C0403d;
import p022N.C0406e;

/* JADX INFO: loaded from: classes2.dex */
public class Query {
    final FirebaseFirestore firestore;
    final com.google.firebase.firestore.core.Query query;

    /* JADX INFO: renamed from: com.google.firebase.firestore.Query$2 */
    public static /* synthetic */ class C57332 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator */
        static final /* synthetic */ int[] f23646x833e630d;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f23646x833e630d = iArr;
            try {
                iArr[FieldFilter.Operator.NOT_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23646x833e630d[FieldFilter.Operator.ARRAY_CONTAINS_ANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23646x833e630d[FieldFilter.Operator.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23646x833e630d[FieldFilter.Operator.NOT_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Direction {
        ASCENDING,
        DESCENDING
    }

    public Query(com.google.firebase.firestore.core.Query query, FirebaseFirestore firebaseFirestore) {
        this.query = (com.google.firebase.firestore.core.Query) Preconditions.checkNotNull(query);
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
    }

    private ListenerRegistration addSnapshotListenerInternal(Executor executor, EventManager.ListenOptions listenOptions, @Nullable Activity activity, EventListener<QuerySnapshot> eventListener) {
        validateHasExplicitOrderByForLimitToLast();
        return (ListenerRegistration) this.firestore.callClient(new C5763f(this, listenOptions, new AsyncEventListener(executor, new C5762e(this, eventListener, 1)), activity, 1));
    }

    private Bound boundFromDocumentSnapshot(String str, DocumentSnapshot documentSnapshot, boolean z) {
        Preconditions.checkNotNull(documentSnapshot, "Provided snapshot must not be null.");
        if (!documentSnapshot.exists()) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Can't use a DocumentSnapshot for a document that doesn't exist for ", str, "()."));
        }
        Document document = documentSnapshot.getDocument();
        ArrayList arrayList = new ArrayList();
        for (OrderBy orderBy : this.query.getNormalizedOrderBy()) {
            if (orderBy.getField().equals(com.google.firebase.firestore.model.FieldPath.KEY_PATH)) {
                arrayList.add(Values.refValue(this.firestore.getDatabaseId(), document.getKey()));
            } else {
                C0393Z0 field = document.getField(orderBy.getField());
                if (ServerTimestamps.isServerTimestamp(field)) {
                    throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + orderBy.getField() + "' is an uncommitted server timestamp. (Since the value of this field is unknown, you cannot start/end a query with it.)");
                }
                if (field == null) {
                    throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + orderBy.getField() + "' (used as the orderBy) does not exist.");
                }
                arrayList.add(field);
            }
        }
        return new Bound(arrayList, z);
    }

    private Bound boundFromFields(String str, Object[] objArr, boolean z) {
        List<OrderBy> explicitOrderBy = this.query.getExplicitOrderBy();
        if (objArr.length > explicitOrderBy.size()) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Too many arguments provided to ", str, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (!explicitOrderBy.get(i2).getField().equals(com.google.firebase.firestore.model.FieldPath.KEY_PATH)) {
                arrayList.add(this.firestore.getUserDataReader().parseQueryValue(obj));
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (!this.query.isCollectionGroupQuery() && str2.contains("/")) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                ResourcePath resourcePathAppend = this.query.getPath().append(ResourcePath.fromString(str2));
                if (!DocumentKey.isDocumentKey(resourcePathAppend)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + resourcePathAppend + "' is not because it contains an odd number of segments.");
                }
                arrayList.add(Values.refValue(this.firestore.getDatabaseId(), DocumentKey.fromPath(resourcePathAppend)));
            }
        }
        return new Bound(arrayList, z);
    }

    private List<FieldFilter.Operator> conflictingOps(FieldFilter.Operator operator) {
        int i2 = C57332.f23646x833e630d[operator.ordinal()];
        if (i2 == 1) {
            return Arrays.asList(FieldFilter.Operator.NOT_EQUAL, FieldFilter.Operator.NOT_IN);
        }
        if (i2 == 2 || i2 == 3) {
            return Arrays.asList(FieldFilter.Operator.NOT_IN);
        }
        return i2 != 4 ? new ArrayList() : Arrays.asList(FieldFilter.Operator.ARRAY_CONTAINS_ANY, FieldFilter.Operator.IN, FieldFilter.Operator.NOT_IN, FieldFilter.Operator.NOT_EQUAL);
    }

    @Nullable
    private FieldFilter.Operator findOpInsideFilters(List<com.google.firebase.firestore.core.Filter> list, List<FieldFilter.Operator> list2) {
        Iterator<com.google.firebase.firestore.core.Filter> it = list.iterator();
        while (it.hasNext()) {
            for (FieldFilter fieldFilter : it.next().getFlattenedFilters()) {
                if (list2.contains(fieldFilter.getOperator())) {
                    return fieldFilter.getOperator();
                }
            }
        }
        return null;
    }

    private Task<QuerySnapshot> getViaSnapshotListener(Source source) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.includeDocumentMetadataChanges = true;
        listenOptions.includeQueryMetadataChanges = true;
        listenOptions.waitForSyncWhenOnline = true;
        taskCompletionSource2.m10768b(addSnapshotListenerInternal(Executors.DIRECT_EXECUTOR, listenOptions, null, new C5764g(taskCompletionSource, taskCompletionSource2, source, 1)));
        return taskCompletionSource.f23216a;
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges) {
        return internalOptions(metadataChanges, ListenSource.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotListenerInternal$3(EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.onEvent(null, firebaseFirestoreException);
        } else {
            Assert.hardAssert(viewSnapshot != null, "Got event without value or error set", new Object[0]);
            eventListener.onEvent(new QuerySnapshot(this, viewSnapshot, this.firestore), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotListenerInternal$4(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener) {
        asyncEventListener.mute();
        firestoreClient.stopListening(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ListenerRegistration lambda$addSnapshotListenerInternal$5(EventManager.ListenOptions listenOptions, AsyncEventListener asyncEventListener, Activity activity, FirestoreClient firestoreClient) {
        return ActivityScope.bind(activity, new C5765h(asyncEventListener, firestoreClient, firestoreClient.listen(new QueryOrPipeline.QueryWrapper(this.query), listenOptions, asyncEventListener), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$0(FirestoreClient firestoreClient) {
        return firestoreClient.getDocumentsFromLocalCache(new QueryOrPipeline.QueryWrapper(this.query));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ QuerySnapshot lambda$get$1(Task task) {
        return new QuerySnapshot(new Query(this.query, this.firestore), (ViewSnapshot) task.getResult(), this.firestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getViaSnapshotListener$2(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            taskCompletionSource.m10767a(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) Tasks.m10771a(taskCompletionSource2.f23216a)).remove();
            if (querySnapshot.getMetadata().isFromCache() && source == Source.SERVER) {
                taskCompletionSource.m10767a(new FirebaseFirestoreException("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else {
                taskCompletionSource.m10768b(querySnapshot);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw Assert.fail(e, "Failed to register a listener for a query result", new Object[0]);
        } catch (ExecutionException e2) {
            throw Assert.fail(e2, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    private com.google.firebase.firestore.core.Filter parseCompositeFilter(Filter.CompositeFilter compositeFilter) {
        ArrayList arrayList = new ArrayList();
        Iterator<Filter> it = compositeFilter.getFilters().iterator();
        while (it.hasNext()) {
            com.google.firebase.firestore.core.Filter filter = parseFilter(it.next());
            if (!filter.getFilters().isEmpty()) {
                arrayList.add(filter);
            }
        }
        return arrayList.size() == 1 ? (com.google.firebase.firestore.core.Filter) arrayList.get(0) : new CompositeFilter(arrayList, compositeFilter.getOperator());
    }

    private C0393Z0 parseDocumentIdValue(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof DocumentReference) {
                return Values.refValue(getFirestore().getDatabaseId(), ((DocumentReference) obj).getKey());
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + Util.typeName(obj));
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        if (!this.query.isCollectionGroupQuery() && str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
        }
        ResourcePath resourcePathAppend = this.query.getPath().append(ResourcePath.fromString(str));
        if (DocumentKey.isDocumentKey(resourcePathAppend)) {
            return Values.refValue(getFirestore().getDatabaseId(), DocumentKey.fromPath(resourcePathAppend));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + resourcePathAppend + "' is not because it has an odd number of segments (" + resourcePathAppend.length() + ").");
    }

    private FieldFilter parseFieldFilter(Filter.UnaryFilter unaryFilter) {
        C0393Z0 queryValue;
        FieldPath field = unaryFilter.getField();
        FieldFilter.Operator operator = unaryFilter.getOperator();
        Object value = unaryFilter.getValue();
        Preconditions.checkNotNull(field, "Provided field path must not be null.");
        Preconditions.checkNotNull(operator, "Provided op must not be null.");
        if (!field.getInternalPath().isKeyField()) {
            FieldFilter.Operator operator2 = FieldFilter.Operator.IN;
            if (operator == operator2 || operator == FieldFilter.Operator.NOT_IN || operator == FieldFilter.Operator.ARRAY_CONTAINS_ANY) {
                validateDisjunctiveFilterElements(value, operator);
            }
            queryValue = this.firestore.getUserDataReader().parseQueryValue(value, operator == operator2 || operator == FieldFilter.Operator.NOT_IN);
        } else {
            if (operator == FieldFilter.Operator.ARRAY_CONTAINS || operator == FieldFilter.Operator.ARRAY_CONTAINS_ANY) {
                throw new IllegalArgumentException("Invalid query. You can't perform '" + operator.toString() + "' queries on FieldPath.documentId().");
            }
            if (operator == FieldFilter.Operator.IN || operator == FieldFilter.Operator.NOT_IN) {
                validateDisjunctiveFilterElements(value, operator);
                C0403d c0403dM798k = C0406e.m798k();
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    c0403dM798k.m788c(parseDocumentIdValue(it.next()));
                }
                C0389X0 c0389x0M714O = C0393Z0.m714O();
                c0389x0M714O.m687c(c0403dM798k);
                queryValue = (C0393Z0) c0389x0M714O.m12341build();
            } else {
                queryValue = parseDocumentIdValue(value);
            }
        }
        return FieldFilter.create(field.getInternalPath(), operator, queryValue);
    }

    private com.google.firebase.firestore.core.Filter parseFilter(Filter filter) {
        boolean z = filter instanceof Filter.UnaryFilter;
        Assert.hardAssert(z || (filter instanceof Filter.CompositeFilter), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        return z ? parseFieldFilter((Filter.UnaryFilter) filter) : parseCompositeFilter((Filter.CompositeFilter) filter);
    }

    private void validateDisjunctiveFilterElements(Object obj, FieldFilter.Operator operator) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + operator.toString() + "' filters.");
        }
    }

    private void validateHasExplicitOrderByForLimitToLast() {
        if (this.query.getLimitType().equals(com.google.firebase.firestore.core.Query.LimitType.LIMIT_TO_LAST) && this.query.getExplicitOrderBy().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    private void validateNewFieldFilter(com.google.firebase.firestore.core.Query query, FieldFilter fieldFilter) {
        FieldFilter.Operator operator = fieldFilter.getOperator();
        FieldFilter.Operator operatorFindOpInsideFilters = findOpInsideFilters(query.getFilters(), conflictingOps(operator));
        if (operatorFindOpInsideFilters != null) {
            if (operatorFindOpInsideFilters == operator) {
                throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + operator.toString() + "' filter.");
            }
            throw new IllegalArgumentException("Invalid Query. You cannot use '" + operator.toString() + "' filters with '" + operatorFindOpInsideFilters.toString() + "' filters.");
        }
    }

    private void validateNewFilter(com.google.firebase.firestore.core.Filter filter) {
        com.google.firebase.firestore.core.Query queryFilter = this.query;
        for (FieldFilter fieldFilter : filter.getFlattenedFilters()) {
            validateNewFieldFilter(queryFilter, fieldFilter);
            queryFilter = queryFilter.filter(fieldFilter);
        }
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public AggregateQuery aggregate(@NonNull AggregateField aggregateField, @NonNull AggregateField... aggregateFieldArr) {
        ArrayList<AggregateField> arrayList = new ArrayList<AggregateField>(aggregateField) { // from class: com.google.firebase.firestore.Query.1
            final /* synthetic */ AggregateField val$aggregateField;

            {
                this.val$aggregateField = aggregateField;
                add(aggregateField);
            }
        };
        arrayList.addAll(Arrays.asList(aggregateFieldArr));
        return new AggregateQuery(this, arrayList);
    }

    @NonNull
    public AggregateQuery count() {
        return new AggregateQuery(this, Collections.singletonList(AggregateField.count()));
    }

    @NonNull
    public Query endAt(@NonNull DocumentSnapshot documentSnapshot) {
        return new Query(this.query.endAt(boundFromDocumentSnapshot("endAt", documentSnapshot, true)), this.firestore);
    }

    @NonNull
    public Query endBefore(@NonNull DocumentSnapshot documentSnapshot) {
        return new Query(this.query.endAt(boundFromDocumentSnapshot("endBefore", documentSnapshot, false)), this.firestore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Query query = (Query) obj;
        return this.query.equals(query.query) && this.firestore.equals(query.firestore);
    }

    @NonNull
    public Task<QuerySnapshot> get() {
        return get(Source.DEFAULT);
    }

    @NonNull
    public FirebaseFirestore getFirestore() {
        return this.firestore;
    }

    public int hashCode() {
        return this.firestore.hashCode() + (this.query.hashCode() * 31);
    }

    @NonNull
    public Query limit(long j2) {
        if (j2 > 0) {
            return new Query(this.query.limitToFirst(j2), this.firestore);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j2 + ") is invalid. Limit must be positive.");
    }

    @NonNull
    public Query limitToLast(long j2) {
        if (j2 > 0) {
            return new Query(this.query.limitToLast(j2), this.firestore);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j2 + ") is invalid. Limit must be positive.");
    }

    @NonNull
    public Query orderBy(@NonNull String str) {
        return orderBy(FieldPath.fromDotSeparatedPath(str), Direction.ASCENDING);
    }

    @NonNull
    public Query startAfter(@NonNull DocumentSnapshot documentSnapshot) {
        return new Query(this.query.startAt(boundFromDocumentSnapshot("startAfter", documentSnapshot, false)), this.firestore);
    }

    @NonNull
    public Query startAt(@NonNull DocumentSnapshot documentSnapshot) {
        return new Query(this.query.startAt(boundFromDocumentSnapshot("startAt", documentSnapshot, true)), this.firestore);
    }

    @NonNull
    public Query where(@NonNull Filter filter) {
        com.google.firebase.firestore.core.Filter filter2 = parseFilter(filter);
        if (filter2.getFilters().isEmpty()) {
            return this;
        }
        validateNewFilter(filter2);
        return new Query(this.query.filter(filter2), this.firestore);
    }

    @NonNull
    public Query whereArrayContains(@NonNull String str, @NonNull Object obj) {
        return where(Filter.arrayContains(str, obj));
    }

    @NonNull
    public Query whereArrayContainsAny(@NonNull String str, @NonNull List<? extends Object> list) {
        return where(Filter.arrayContainsAny(str, list));
    }

    @NonNull
    public Query whereEqualTo(@NonNull String str, @Nullable Object obj) {
        return where(Filter.equalTo(str, obj));
    }

    @NonNull
    public Query whereGreaterThan(@NonNull String str, @NonNull Object obj) {
        return where(Filter.greaterThan(str, obj));
    }

    @NonNull
    public Query whereGreaterThanOrEqualTo(@NonNull String str, @NonNull Object obj) {
        return where(Filter.greaterThanOrEqualTo(str, obj));
    }

    @NonNull
    public Query whereIn(@NonNull String str, @NonNull List<? extends Object> list) {
        return where(Filter.inArray(str, list));
    }

    @NonNull
    public Query whereLessThan(@NonNull String str, @NonNull Object obj) {
        return where(Filter.lessThan(str, obj));
    }

    @NonNull
    public Query whereLessThanOrEqualTo(@NonNull String str, @NonNull Object obj) {
        return where(Filter.lessThanOrEqualTo(str, obj));
    }

    @NonNull
    public Query whereNotEqualTo(@NonNull String str, @Nullable Object obj) {
        return where(Filter.notEqualTo(str, obj));
    }

    @NonNull
    public Query whereNotIn(@NonNull String str, @NonNull List<? extends Object> list) {
        return where(Filter.notInArray(str, list));
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges, ListenSource listenSource) {
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
        listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.includeQueryMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.waitForSyncWhenOnline = false;
        listenOptions.source = listenSource;
        return listenOptions;
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Executor executor, @NonNull EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(executor, MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public Task<QuerySnapshot> get(@NonNull Source source) {
        validateHasExplicitOrderByForLimitToLast();
        return source == Source.CACHE ? ((Task) this.firestore.callClient(new C5739a(this, 4))).continueWith(Executors.DIRECT_EXECUTOR, new C5819n(this, 1)) : getViaSnapshotListener(source);
    }

    @NonNull
    public Query orderBy(@NonNull FieldPath fieldPath) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        return orderBy(fieldPath.getInternalPath(), Direction.ASCENDING);
    }

    @NonNull
    public Query whereArrayContains(@NonNull FieldPath fieldPath, @NonNull Object obj) {
        return where(Filter.arrayContains(fieldPath, obj));
    }

    @NonNull
    public Query whereArrayContainsAny(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return where(Filter.arrayContainsAny(fieldPath, list));
    }

    @NonNull
    public Query whereEqualTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return where(Filter.equalTo(fieldPath, obj));
    }

    @NonNull
    public Query whereGreaterThan(@NonNull FieldPath fieldPath, @NonNull Object obj) {
        return where(Filter.greaterThan(fieldPath, obj));
    }

    @NonNull
    public Query whereGreaterThanOrEqualTo(@NonNull FieldPath fieldPath, @NonNull Object obj) {
        return where(Filter.greaterThanOrEqualTo(fieldPath, obj));
    }

    @NonNull
    public Query whereIn(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return where(Filter.inArray(fieldPath, list));
    }

    @NonNull
    public Query whereLessThan(@NonNull FieldPath fieldPath, @NonNull Object obj) {
        return where(Filter.lessThan(fieldPath, obj));
    }

    @NonNull
    public Query whereLessThanOrEqualTo(@NonNull FieldPath fieldPath, @NonNull Object obj) {
        return where(Filter.lessThanOrEqualTo(fieldPath, obj));
    }

    @NonNull
    public Query whereNotEqualTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return where(Filter.notEqualTo(fieldPath, obj));
    }

    @NonNull
    public Query whereNotIn(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return where(Filter.notInArray(fieldPath, list));
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Activity activity, @NonNull EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(activity, MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public Query endAt(Object... objArr) {
        return new Query(this.query.endAt(boundFromFields("endAt", objArr, true)), this.firestore);
    }

    @NonNull
    public Query endBefore(Object... objArr) {
        return new Query(this.query.endAt(boundFromFields("endBefore", objArr, false)), this.firestore);
    }

    @NonNull
    public Query startAfter(Object... objArr) {
        return new Query(this.query.startAt(boundFromFields("startAfter", objArr, false)), this.firestore);
    }

    @NonNull
    public Query startAt(Object... objArr) {
        return new Query(this.query.startAt(boundFromFields("startAt", objArr, true)), this.firestore);
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull MetadataChanges metadataChanges, @NonNull EventListener<QuerySnapshot> eventListener) {
        return addSnapshotListener(Executors.DEFAULT_CALLBACK_EXECUTOR, metadataChanges, eventListener);
    }

    @NonNull
    public Query orderBy(@NonNull String str, @NonNull Direction direction) {
        return orderBy(FieldPath.fromDotSeparatedPath(str), direction);
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Executor executor, @NonNull MetadataChanges metadataChanges, @NonNull EventListener<QuerySnapshot> eventListener) {
        Preconditions.checkNotNull(executor, "Provided executor must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(executor, internalOptions(metadataChanges), null, eventListener);
    }

    @NonNull
    public Query orderBy(@NonNull FieldPath fieldPath, @NonNull Direction direction) {
        Preconditions.checkNotNull(fieldPath, "Provided field path must not be null.");
        return orderBy(fieldPath.getInternalPath(), direction);
    }

    private Query orderBy(@NonNull com.google.firebase.firestore.model.FieldPath fieldPath, @NonNull Direction direction) {
        OrderBy.Direction direction2;
        Preconditions.checkNotNull(direction, "Provided direction must not be null.");
        if (this.query.getStartAt() == null) {
            if (this.query.getEndAt() == null) {
                if (direction == Direction.ASCENDING) {
                    direction2 = OrderBy.Direction.ASCENDING;
                } else {
                    direction2 = OrderBy.Direction.DESCENDING;
                }
                return new Query(this.query.orderBy(OrderBy.getInstance(direction2, fieldPath)), this.firestore);
            }
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Activity activity, @NonNull MetadataChanges metadataChanges, @NonNull EventListener<QuerySnapshot> eventListener) {
        Preconditions.checkNotNull(activity, "Provided activity must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(Executors.DEFAULT_CALLBACK_EXECUTOR, internalOptions(metadataChanges), activity, eventListener);
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull SnapshotListenOptions snapshotListenOptions, @NonNull EventListener<QuerySnapshot> eventListener) {
        Preconditions.checkNotNull(snapshotListenOptions, "Provided options value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(snapshotListenOptions.getExecutor(), internalOptions(snapshotListenOptions.getMetadataChanges(), snapshotListenOptions.getSource()), snapshotListenOptions.getActivity(), eventListener);
    }
}
