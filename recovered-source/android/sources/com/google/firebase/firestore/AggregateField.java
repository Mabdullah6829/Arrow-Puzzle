package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.firestore.pipeline.AggregateFunction;
import com.google.firebase.firestore.pipeline.AliasedAggregate;
import com.google.firebase.firestore.pipeline.Expression;
import java.util.Objects;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AggregateField {

    @NonNull
    private final String alias;

    @Nullable
    private final FieldPath fieldPath;

    @NonNull
    private final String operator;

    public static class AverageAggregateField extends AggregateField {
        @Override // com.google.firebase.firestore.AggregateField
        @NonNull
        public AliasedAggregate toPipeline() {
            return Expression.field(getFieldPath()).average().alias(getAlias());
        }

        private AverageAggregateField(@NonNull FieldPath fieldPath) {
            super(fieldPath, "average");
        }
    }

    public static class CountAggregateField extends AggregateField {
        @Override // com.google.firebase.firestore.AggregateField
        @NonNull
        public AliasedAggregate toPipeline() {
            return AggregateFunction.countAll().alias(getAlias());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private CountAggregateField() {
            super(null, "count");
        }
    }

    public static class SumAggregateField extends AggregateField {
        @Override // com.google.firebase.firestore.AggregateField
        @NonNull
        public AliasedAggregate toPipeline() {
            return Expression.field(getFieldPath()).sum().alias(getAlias());
        }

        private SumAggregateField(@NonNull FieldPath fieldPath) {
            super(fieldPath, "sum");
        }
    }

    @NonNull
    public static AverageAggregateField average(@NonNull String str) {
        return new AverageAggregateField(FieldPath.fromDotSeparatedPath(str));
    }

    @NonNull
    public static CountAggregateField count() {
        return new CountAggregateField();
    }

    @NonNull
    public static SumAggregateField sum(@NonNull String str) {
        return new SumAggregateField(FieldPath.fromDotSeparatedPath(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateField)) {
            return false;
        }
        AggregateField aggregateField = (AggregateField) obj;
        FieldPath fieldPath = this.fieldPath;
        if (fieldPath == null || aggregateField.fieldPath == null) {
            return fieldPath == null && aggregateField.fieldPath == null;
        }
        return this.operator.equals(aggregateField.getOperator()) && getFieldPath().equals(aggregateField.getFieldPath());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getAlias() {
        return this.alias;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getFieldPath() {
        FieldPath fieldPath = this.fieldPath;
        return fieldPath == null ? "" : fieldPath.toString();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return Objects.hash(getOperator(), getFieldPath());
    }

    @NonNull
    public abstract AliasedAggregate toPipeline();

    private AggregateField(@Nullable FieldPath fieldPath, @NonNull String str) {
        String str2;
        this.fieldPath = fieldPath;
        this.operator = str;
        StringBuilder sbM408p = AbstractC0271e0.m408p(str);
        if (fieldPath == null) {
            str2 = "";
        } else {
            str2 = "_" + fieldPath;
        }
        sbM408p.append(str2);
        this.alias = sbM408p.toString();
    }

    @NonNull
    public static AverageAggregateField average(@NonNull FieldPath fieldPath) {
        return new AverageAggregateField(fieldPath);
    }

    @NonNull
    public static SumAggregateField sum(@NonNull FieldPath fieldPath) {
        return new SumAggregateField(fieldPath);
    }
}
