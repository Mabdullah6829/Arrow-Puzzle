package com.google.firebase.firestore.core;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class Target {
    public static final long NO_LIMIT = -1;

    @Nullable
    private final String collectionGroup;

    @Nullable
    private final Bound endAt;
    private final List<Filter> filters;
    private final long limit;

    @Nullable
    private String memoizedCanonicalId;
    private final List<OrderBy> orderBys;
    private final ResourcePath path;

    @Nullable
    private final Bound startAt;

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.Target$1 */
    public static /* synthetic */ class C57501 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator */
        static final /* synthetic */ int[] f23664x833e630d;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f23664x833e630d = iArr;
            try {
                iArr[FieldFilter.Operator.ARRAY_CONTAINS_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.ARRAY_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.NOT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.NOT_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.LESS_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.LESS_THAN_OR_EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23664x833e630d[FieldFilter.Operator.GREATER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Target(ResourcePath resourcePath, @Nullable String str, List<Filter> list, List<OrderBy> list2, long j2, @Nullable Bound bound, @Nullable Bound bound2) {
        this.path = resourcePath;
        this.collectionGroup = str;
        this.orderBys = list2;
        this.filters = list;
        this.limit = j2;
        this.startAt = bound;
        this.endAt = bound2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Pair<C0393Z0, Boolean> getAscendingBound(FieldIndex.Segment segment, @Nullable Bound bound) {
        C0393Z0 c0393z0 = Values.MIN_VALUE;
        Iterator<FieldFilter> it = getFieldFiltersForPath(segment.getFieldPath()).iterator();
        boolean zIsInclusive = true;
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                if (bound != null) {
                    for (int i2 = 0; i2 < this.orderBys.size(); i2++) {
                        if (this.orderBys.get(i2).getField().equals(segment.getFieldPath())) {
                            C0393Z0 c0393z1 = bound.getPosition().get(i2);
                            if (Values.lowerBoundCompare(c0393z0, zIsInclusive, c0393z1, bound.isInclusive()) < 0) {
                                zIsInclusive = bound.isInclusive();
                                c0393z0 = c0393z1;
                            }
                        }
                    }
                }
                return new Pair<>(c0393z0, Boolean.valueOf(zIsInclusive));
            }
            FieldFilter next = it.next();
            C0393Z0 value = Values.MIN_VALUE;
            switch (C57501.f23664x833e630d[next.getOperator().ordinal()]) {
                case 3:
                case 4:
                case 9:
                    value = next.getValue();
                    z = true;
                    break;
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                case 8:
                    value = Values.getLowerBound(next.getValue());
                    z = true;
                    break;
                case 10:
                    value = next.getValue();
                    break;
            }
            if (Values.lowerBoundCompare(c0393z0, zIsInclusive, value, z) < 0) {
                zIsInclusive = z;
                c0393z0 = value;
            }
        }
    }

    private Pair<C0393Z0, Boolean> getDescendingBound(FieldIndex.Segment segment, @Nullable Bound bound) {
        C0393Z0 c0393z0 = Values.MAX_VALUE;
        Iterator<FieldFilter> it = getFieldFiltersForPath(segment.getFieldPath()).iterator();
        boolean zIsInclusive = true;
        while (true) {
            z = false;
            boolean z = false;
            if (!it.hasNext()) {
                if (bound != null) {
                    for (int i2 = 0; i2 < this.orderBys.size(); i2++) {
                        if (this.orderBys.get(i2).getField().equals(segment.getFieldPath())) {
                            C0393Z0 c0393z1 = bound.getPosition().get(i2);
                            if (Values.upperBoundCompare(c0393z0, zIsInclusive, c0393z1, bound.isInclusive()) > 0) {
                                zIsInclusive = bound.isInclusive();
                                c0393z0 = c0393z1;
                            }
                        }
                    }
                }
                return new Pair<>(c0393z0, Boolean.valueOf(zIsInclusive));
            }
            FieldFilter next = it.next();
            C0393Z0 value = Values.MAX_VALUE;
            switch (C57501.f23664x833e630d[next.getOperator().ordinal()]) {
                case 3:
                case 4:
                case 8:
                    value = next.getValue();
                case 5:
                case 6:
                default:
                    z = true;
                    break;
                case 7:
                    value = next.getValue();
                    break;
                case 9:
                case 10:
                    value = Values.getUpperBound(next.getValue());
                    break;
            }
            if (Values.upperBoundCompare(c0393z0, zIsInclusive, value, z) > 0) {
                zIsInclusive = z;
                c0393z0 = value;
            }
        }
    }

    private List<FieldFilter> getFieldFiltersForPath(FieldPath fieldPath) {
        ArrayList arrayList = new ArrayList();
        for (Filter filter : this.filters) {
            if (filter instanceof FieldFilter) {
                FieldFilter fieldFilter = (FieldFilter) filter;
                if (fieldFilter.getField().equals(fieldPath)) {
                    arrayList.add(fieldFilter);
                }
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Target.class == obj.getClass()) {
            Target target = (Target) obj;
            String str = this.collectionGroup;
            if (str == null ? target.collectionGroup != null : !str.equals(target.collectionGroup)) {
                return false;
            }
            if (this.limit != target.limit || !this.orderBys.equals(target.orderBys) || !this.filters.equals(target.filters) || !this.path.equals(target.path)) {
                return false;
            }
            Bound bound = this.startAt;
            if (bound == null ? target.startAt != null : !bound.equals(target.startAt)) {
                return false;
            }
            Bound bound2 = this.endAt;
            Bound bound3 = target.endAt;
            if (bound2 != null) {
                return bound2.equals(bound3);
            }
            if (bound3 == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public List<C0393Z0> getArrayValues(FieldIndex fieldIndex) {
        FieldIndex.Segment arraySegment = fieldIndex.getArraySegment();
        if (arraySegment == null) {
            return null;
        }
        for (FieldFilter fieldFilter : getFieldFiltersForPath(arraySegment.getFieldPath())) {
            int i2 = C57501.f23664x833e630d[fieldFilter.getOperator().ordinal()];
            if (i2 == 1) {
                return fieldFilter.getValue().m745t().getValuesList();
            }
            if (i2 == 2) {
                return Collections.singletonList(fieldFilter.getValue());
            }
        }
        return null;
    }

    public String getCanonicalId() {
        String str = this.memoizedCanonicalId;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getPath().canonicalString());
        if (this.collectionGroup != null) {
            sb.append("|cg:");
            sb.append(this.collectionGroup);
        }
        sb.append("|f:");
        Iterator<Filter> it = getFilters().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getCanonicalId());
        }
        sb.append("|ob:");
        for (OrderBy orderBy : getOrderBy()) {
            sb.append(orderBy.getField().canonicalString());
            sb.append(orderBy.getDirection().equals(OrderBy.Direction.ASCENDING) ? "asc" : "desc");
        }
        if (hasLimit()) {
            sb.append("|l:");
            sb.append(getLimit());
        }
        if (this.startAt != null) {
            sb.append("|lb:");
            sb.append(this.startAt.isInclusive() ? "b:" : "a:");
            sb.append(this.startAt.positionString());
        }
        if (this.endAt != null) {
            sb.append("|ub:");
            sb.append(this.endAt.isInclusive() ? "a:" : "b:");
            sb.append(this.endAt.positionString());
        }
        String string = sb.toString();
        this.memoizedCanonicalId = string;
        return string;
    }

    @Nullable
    public String getCollectionGroup() {
        return this.collectionGroup;
    }

    @Nullable
    public Bound getEndAt() {
        return this.endAt;
    }

    public List<Filter> getFilters() {
        return this.filters;
    }

    public OrderBy.Direction getKeyOrder() {
        List<OrderBy> list = this.orderBys;
        return list.get(list.size() - 1).getDirection();
    }

    public long getLimit() {
        return this.limit;
    }

    public Bound getLowerBound(FieldIndex fieldIndex) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            Pair<C0393Z0, Boolean> ascendingBound = segment.getKind().equals(FieldIndex.Segment.Kind.ASCENDING) ? getAscendingBound(segment, this.startAt) : getDescendingBound(segment, this.startAt);
            arrayList.add((C0393Z0) ascendingBound.first);
            zBooleanValue &= ((Boolean) ascendingBound.second).booleanValue();
        }
        return new Bound(arrayList, zBooleanValue);
    }

    @Nullable
    public Collection<C0393Z0> getNotInValues(FieldIndex fieldIndex) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            for (FieldFilter fieldFilter : getFieldFiltersForPath(segment.getFieldPath())) {
                int i2 = C57501.f23664x833e630d[fieldFilter.getOperator().ordinal()];
                if (i2 == 3 || i2 == 4) {
                    linkedHashMap.put(segment.getFieldPath(), fieldFilter.getValue());
                } else if (i2 == 5 || i2 == 6) {
                    linkedHashMap.put(segment.getFieldPath(), fieldFilter.getValue());
                    return linkedHashMap.values();
                }
            }
        }
        return null;
    }

    public List<OrderBy> getOrderBy() {
        return this.orderBys;
    }

    public ResourcePath getPath() {
        return this.path;
    }

    public int getSegmentCount() {
        HashSet hashSet = new HashSet();
        Iterator<Filter> it = this.filters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            for (FieldFilter fieldFilter : it.next().getFlattenedFilters()) {
                if (!fieldFilter.getField().isKeyField()) {
                    if (fieldFilter.getOperator().equals(FieldFilter.Operator.ARRAY_CONTAINS) || fieldFilter.getOperator().equals(FieldFilter.Operator.ARRAY_CONTAINS_ANY)) {
                        i2 = 1;
                    } else {
                        hashSet.add(fieldFilter.getField());
                    }
                }
            }
        }
        for (OrderBy orderBy : this.orderBys) {
            if (!orderBy.getField().isKeyField()) {
                hashSet.add(orderBy.getField());
            }
        }
        return hashSet.size() + i2;
    }

    @Nullable
    public Bound getStartAt() {
        return this.startAt;
    }

    public Bound getUpperBound(FieldIndex fieldIndex) {
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue = true;
        for (FieldIndex.Segment segment : fieldIndex.getDirectionalSegments()) {
            Pair<C0393Z0, Boolean> descendingBound = segment.getKind().equals(FieldIndex.Segment.Kind.ASCENDING) ? getDescendingBound(segment, this.endAt) : getAscendingBound(segment, this.endAt);
            arrayList.add((C0393Z0) descendingBound.first);
            zBooleanValue &= ((Boolean) descendingBound.second).booleanValue();
        }
        return new Bound(arrayList, zBooleanValue);
    }

    public boolean hasLimit() {
        return this.limit != -1;
    }

    public int hashCode() {
        int iHashCode = this.orderBys.hashCode() * 31;
        String str = this.collectionGroup;
        int iHashCode2 = (this.path.hashCode() + ((this.filters.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.limit;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Bound bound = this.startAt;
        int iHashCode3 = (i2 + (bound != null ? bound.hashCode() : 0)) * 31;
        Bound bound2 = this.endAt;
        return iHashCode3 + (bound2 != null ? bound2.hashCode() : 0);
    }

    public boolean isDocumentQuery() {
        return DocumentKey.isDocumentKey(this.path) && this.collectionGroup == null && this.filters.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Query(");
        sb.append(this.path.canonicalString());
        if (this.collectionGroup != null) {
            sb.append(" collectionGroup=");
            sb.append(this.collectionGroup);
        }
        if (!this.filters.isEmpty()) {
            sb.append(" where ");
            for (int i2 = 0; i2 < this.filters.size(); i2++) {
                if (i2 > 0) {
                    sb.append(" and ");
                }
                sb.append(this.filters.get(i2));
            }
        }
        if (!this.orderBys.isEmpty()) {
            sb.append(" order by ");
            for (int i3 = 0; i3 < this.orderBys.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(this.orderBys.get(i3));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
