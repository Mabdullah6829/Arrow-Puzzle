package com.google.firebase.firestore.core;

import androidx.annotation.NonNull;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.BooleanExpression;
import com.google.firebase.firestore.pipeline.Expression;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class FieldFilter extends Filter {
    private final FieldPath field;
    private final Operator operator;
    private final C0393Z0 value;

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.FieldFilter$1 */
    public static /* synthetic */ class C57471 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$FieldFilter$Operator */
        static final /* synthetic */ int[] f23661x833e630d;

        static {
            int[] iArr = new int[Operator.values().length];
            f23661x833e630d = iArr;
            try {
                iArr[Operator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23661x833e630d[Operator.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23661x833e630d[Operator.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23661x833e630d[Operator.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23661x833e630d[Operator.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23661x833e630d[Operator.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23661x833e630d[Operator.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23661x833e630d[Operator.ARRAY_CONTAINS_ANY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23661x833e630d[Operator.IN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23661x833e630d[Operator.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum Operator {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");

        private final String text;

        Operator(String str) {
            this.text = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public FieldFilter(FieldPath fieldPath, Operator operator, C0393Z0 c0393z0) {
        this.field = fieldPath;
        this.operator = operator;
        this.value = c0393z0;
    }

    public static FieldFilter create(FieldPath fieldPath, Operator operator, C0393Z0 c0393z0) {
        if (!fieldPath.isKeyField()) {
            if (operator == Operator.ARRAY_CONTAINS) {
                return new ArrayContainsFilter(fieldPath, c0393z0);
            }
            if (operator == Operator.IN) {
                return new InFilter(fieldPath, c0393z0);
            }
            if (operator == Operator.ARRAY_CONTAINS_ANY) {
                return new ArrayContainsAnyFilter(fieldPath, c0393z0);
            }
            return operator == Operator.NOT_IN ? new NotInFilter(fieldPath, c0393z0) : new FieldFilter(fieldPath, operator, c0393z0);
        }
        if (operator == Operator.IN) {
            return new KeyFieldInFilter(fieldPath, c0393z0);
        }
        if (operator == Operator.NOT_IN) {
            return new KeyFieldNotInFilter(fieldPath, c0393z0);
        }
        Assert.hardAssert((operator == Operator.ARRAY_CONTAINS || operator == Operator.ARRAY_CONTAINS_ANY) ? false : true, operator.toString() + "queries don't make sense on document keys", new Object[0]);
        return new KeyFieldFilter(fieldPath, operator, c0393z0);
    }

    @NonNull
    private static List<C0393Z0> filterNaN(List<C0393Z0> list) {
        ArrayList arrayList = new ArrayList(list.size() - 1);
        for (C0393Z0 c0393z0 : list) {
            if (!Values.isNanValue(c0393z0)) {
                arrayList.add(c0393z0);
            }
        }
        return arrayList;
    }

    private static boolean hasNaN(List<C0393Z0> list) {
        Iterator<C0393Z0> it = list.iterator();
        while (it.hasNext()) {
            if (Values.isNanValue(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FieldFilter)) {
            FieldFilter fieldFilter = (FieldFilter) obj;
            if (this.operator == fieldFilter.operator && this.field.equals(fieldFilter.field) && this.value.equals(fieldFilter.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public String getCanonicalId() {
        return getField().canonicalString() + getOperator().toString() + Values.canonicalId(getValue());
    }

    public FieldPath getField() {
        return this.field;
    }

    @Override // com.google.firebase.firestore.core.Filter
    public List<Filter> getFilters() {
        return Collections.singletonList(this);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public List<FieldFilter> getFlattenedFilters() {
        return Collections.singletonList(this);
    }

    public Operator getOperator() {
        return this.operator;
    }

    public C0393Z0 getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.field.hashCode() + ((this.operator.hashCode() + 1147) * 31)) * 31);
    }

    public boolean isInequality() {
        return Arrays.asList(Operator.LESS_THAN, Operator.LESS_THAN_OR_EQUAL, Operator.GREATER_THAN, Operator.GREATER_THAN_OR_EQUAL, Operator.NOT_EQUAL, Operator.NOT_IN).contains(this.operator);
    }

    @Override // com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        C0393Z0 field = document.getField(this.field);
        if (this.operator == Operator.NOT_EQUAL) {
            return (field == null || field.m742L() || !matchesComparison(Values.compare(field, this.value))) ? false : true;
        }
        return field != null && Values.typeOrder(field) == Values.typeOrder(this.value) && matchesComparison(Values.compare(field, this.value));
    }

    public boolean matchesComparison(int i2) {
        switch (C57471.f23661x833e630d[this.operator.ordinal()]) {
            case 1:
                return i2 < 0;
            case 2:
                return i2 <= 0;
            case 3:
                return i2 == 0;
            case 4:
                return i2 != 0;
            case 5:
                return i2 > 0;
            case 6:
                return i2 >= 0;
            default:
                throw Assert.fail("Unknown FieldFilter operator: %s", this.operator);
        }
    }

    @Override // com.google.firebase.firestore.core.Filter
    public BooleanExpression toPipelineExpr() {
        Field field = new Field(this.field);
        BooleanExpression booleanExpressionExists = field.exists();
        switch (C57471.f23661x833e630d[this.operator.ordinal()]) {
            case 1:
                return Expression.and(booleanExpressionExists, field.lessThan(this.value));
            case 2:
                return Expression.and(booleanExpressionExists, field.lessThanOrEqual(this.value));
            case 3:
                return Expression.and(booleanExpressionExists, field.equal(this.value));
            case 4:
                return field.notEqual(this.value);
            case 5:
                return Expression.and(booleanExpressionExists, field.greaterThan(this.value));
            case 6:
                return Expression.and(booleanExpressionExists, field.greaterThanOrEqual(this.value));
            case 7:
                return Expression.and(booleanExpressionExists, field.arrayContains(this.value));
            case 8:
                return Expression.and(booleanExpressionExists, field.arrayContainsAny((List<? extends Object>) this.value.m745t().getValuesList()));
            case 9:
                return Expression.and(booleanExpressionExists, field.equalAny((List<? extends Object>) this.value.m745t().getValuesList()));
            case 10:
                return field.notEqualAny((List<? extends Object>) this.value.m745t().getValuesList());
            default:
                throw new IllegalArgumentException("Unsupported operator: " + this.operator);
        }
    }

    public String toString() {
        return getCanonicalId();
    }
}
