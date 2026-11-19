package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class AggregateQuerySnapshot {

    @NonNull
    private final Map<String, C0393Z0> data;

    @NonNull
    private final AggregateQuery query;

    public AggregateQuerySnapshot(@NonNull AggregateQuery aggregateQuery, @NonNull Map<String, C0393Z0> map) {
        Preconditions.checkNotNull(aggregateQuery);
        this.query = aggregateQuery;
        this.data = map;
    }

    @Nullable
    private <T> T castTypedValue(Object obj, @NonNull AggregateField aggregateField, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new RuntimeException("AggregateField '" + aggregateField.getAlias() + "' is not a " + cls.getName());
    }

    public static AggregateQuerySnapshot createWithCount(@NonNull AggregateQuery aggregateQuery, long j2) {
        String alias = AggregateField.count().getAlias();
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m695m(j2);
        return new AggregateQuerySnapshot(aggregateQuery, Collections.singletonMap(alias, (C0393Z0) c0389x0M714O.m12341build()));
    }

    @Nullable
    private Object getInternal(@NonNull AggregateField aggregateField) {
        if (this.data.containsKey(aggregateField.getAlias())) {
            return new UserDataWriter(this.query.getQuery().firestore, DocumentSnapshot.ServerTimestampBehavior.DEFAULT).convertValue(this.data.get(aggregateField.getAlias()));
        }
        throw new IllegalArgumentException("'" + aggregateField.getOperator() + "(" + aggregateField.getFieldPath() + ")' was not requested in the aggregation query.");
    }

    @Nullable
    private <T> T getTypedValue(@NonNull AggregateField aggregateField, Class<T> cls) {
        return (T) castTypedValue(getInternal(aggregateField), aggregateField, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateQuerySnapshot)) {
            return false;
        }
        AggregateQuerySnapshot aggregateQuerySnapshot = (AggregateQuerySnapshot) obj;
        return this.query.equals(aggregateQuerySnapshot.query) && this.data.equals(aggregateQuerySnapshot.data);
    }

    @Nullable
    public Object get(@NonNull AggregateField aggregateField) {
        return getInternal(aggregateField);
    }

    public long getCount() {
        return get(AggregateField.count());
    }

    @Nullable
    public Double getDouble(@NonNull AggregateField aggregateField) {
        Number number = (Number) getTypedValue(aggregateField, Number.class);
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    @Nullable
    public Long getLong(@NonNull AggregateField aggregateField) {
        Number number = (Number) getTypedValue(aggregateField, Number.class);
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    @NonNull
    public AggregateQuery getQuery() {
        return this.query;
    }

    public int hashCode() {
        return Objects.hash(this.query, this.data);
    }

    public long get(@NonNull AggregateField.CountAggregateField countAggregateField) {
        Long l2 = getLong(countAggregateField);
        if (l2 != null) {
            return l2.longValue();
        }
        throw new IllegalArgumentException("RunAggregationQueryResponse alias " + countAggregateField.getAlias() + " is null");
    }

    @Nullable
    public Double get(@NonNull AggregateField.AverageAggregateField averageAggregateField) {
        return getDouble(averageAggregateField);
    }
}
