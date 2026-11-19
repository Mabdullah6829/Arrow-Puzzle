package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.FieldFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class Filter {

    public static class CompositeFilter extends Filter {
        private final List<Filter> filters;
        private final com.google.firebase.firestore.core.CompositeFilter.Operator operator;

        public CompositeFilter(@NonNull List<Filter> list, com.google.firebase.firestore.core.CompositeFilter.Operator operator) {
            this.filters = list;
            this.operator = operator;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                CompositeFilter compositeFilter = (CompositeFilter) obj;
                if (this.operator == compositeFilter.operator && Objects.equals(this.filters, compositeFilter.filters)) {
                    return true;
                }
            }
            return false;
        }

        public List<Filter> getFilters() {
            return this.filters;
        }

        public com.google.firebase.firestore.core.CompositeFilter.Operator getOperator() {
            return this.operator;
        }

        public int hashCode() {
            List<Filter> list = this.filters;
            int iHashCode = (list != null ? list.hashCode() : 0) * 31;
            com.google.firebase.firestore.core.CompositeFilter.Operator operator = this.operator;
            return iHashCode + (operator != null ? operator.hashCode() : 0);
        }
    }

    public static class UnaryFilter extends Filter {
        private final FieldPath field;
        private final FieldFilter.Operator operator;
        private final Object value;

        public UnaryFilter(FieldPath fieldPath, FieldFilter.Operator operator, @Nullable Object obj) {
            this.field = fieldPath;
            this.operator = operator;
            this.value = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                UnaryFilter unaryFilter = (UnaryFilter) obj;
                if (this.operator == unaryFilter.operator && Objects.equals(this.field, unaryFilter.field) && Objects.equals(this.value, unaryFilter.value)) {
                    return true;
                }
            }
            return false;
        }

        public FieldPath getField() {
            return this.field;
        }

        public FieldFilter.Operator getOperator() {
            return this.operator;
        }

        @Nullable
        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            FieldPath fieldPath = this.field;
            int iHashCode = (fieldPath != null ? fieldPath.hashCode() : 0) * 31;
            FieldFilter.Operator operator = this.operator;
            int iHashCode2 = (iHashCode + (operator != null ? operator.hashCode() : 0)) * 31;
            Object obj = this.value;
            return iHashCode2 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @NonNull
    public static Filter and(Filter... filterArr) {
        return new CompositeFilter(Arrays.asList(filterArr), com.google.firebase.firestore.core.CompositeFilter.Operator.AND);
    }

    @NonNull
    public static Filter arrayContains(@NonNull String str, @Nullable Object obj) {
        return arrayContains(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter arrayContainsAny(@NonNull String str, @NonNull List<? extends Object> list) {
        return arrayContainsAny(FieldPath.fromDotSeparatedPath(str), list);
    }

    @NonNull
    public static Filter equalTo(@NonNull String str, @Nullable Object obj) {
        return equalTo(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter greaterThan(@NonNull String str, @Nullable Object obj) {
        return greaterThan(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter greaterThanOrEqualTo(@NonNull String str, @Nullable Object obj) {
        return greaterThanOrEqualTo(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter inArray(@NonNull String str, @NonNull List<? extends Object> list) {
        return inArray(FieldPath.fromDotSeparatedPath(str), list);
    }

    @NonNull
    public static Filter lessThan(@NonNull String str, @Nullable Object obj) {
        return lessThan(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter lessThanOrEqualTo(@NonNull String str, @Nullable Object obj) {
        return lessThanOrEqualTo(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter notEqualTo(@NonNull String str, @Nullable Object obj) {
        return notEqualTo(FieldPath.fromDotSeparatedPath(str), obj);
    }

    @NonNull
    public static Filter notInArray(@NonNull String str, @NonNull List<? extends Object> list) {
        return notInArray(FieldPath.fromDotSeparatedPath(str), list);
    }

    @NonNull
    /* JADX INFO: renamed from: or */
    public static Filter m11256or(Filter... filterArr) {
        return new CompositeFilter(Arrays.asList(filterArr), com.google.firebase.firestore.core.CompositeFilter.Operator.OR);
    }

    @NonNull
    public static Filter arrayContains(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS, obj);
    }

    @NonNull
    public static Filter arrayContainsAny(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS_ANY, list);
    }

    @NonNull
    public static Filter equalTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.EQUAL, obj);
    }

    @NonNull
    public static Filter greaterThan(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.GREATER_THAN, obj);
    }

    @NonNull
    public static Filter greaterThanOrEqualTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.GREATER_THAN_OR_EQUAL, obj);
    }

    @NonNull
    public static Filter inArray(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.IN, list);
    }

    @NonNull
    public static Filter lessThan(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.LESS_THAN, obj);
    }

    @NonNull
    public static Filter lessThanOrEqualTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.LESS_THAN_OR_EQUAL, obj);
    }

    @NonNull
    public static Filter notEqualTo(@NonNull FieldPath fieldPath, @Nullable Object obj) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.NOT_EQUAL, obj);
    }

    @NonNull
    public static Filter notInArray(@NonNull FieldPath fieldPath, @NonNull List<? extends Object> list) {
        return new UnaryFilter(fieldPath, FieldFilter.Operator.NOT_IN, list);
    }
}
