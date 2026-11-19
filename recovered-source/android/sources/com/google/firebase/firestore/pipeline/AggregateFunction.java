package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.protobuf.AbstractC6185M;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0357H;
import p022N.C0361J;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateFunction {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private final InternalOptions options;
    private final Expression[] params;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AggregateFunction arrayAgg(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("array_agg", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction arrayAggDistinct(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("array_agg_distinct", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction average(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("average", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction count(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("count", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction countAll() {
            return new AggregateFunction("count", (AbstractC6447f) null);
        }

        public final AggregateFunction countDistinct(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("count_distinct", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction countIf(BooleanExpression condition) {
            AbstractC6452k.m12181e(condition, "condition");
            return new AggregateFunction("count_if", condition, (AbstractC6447f) null);
        }

        public final AggregateFunction first(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("first", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction last(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("last", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction maximum(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("maximum", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction minimum(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("minimum", fieldName, (AbstractC6447f) null);
        }

        public final AggregateFunction rawAggregate(String name, Expression... expr) {
            AbstractC6452k.m12181e(name, "name");
            AbstractC6452k.m12181e(expr, "expr");
            return new AggregateFunction(name, expr, null, 4, null);
        }

        public final AggregateFunction sum(String fieldName) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            return new AggregateFunction("sum", fieldName, (AbstractC6447f) null);
        }

        private Companion() {
        }

        public final AggregateFunction arrayAgg(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("array_agg", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction arrayAggDistinct(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("array_agg_distinct", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction average(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("average", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction count(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("count", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction countDistinct(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("count_distinct", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction first(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("first", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction last(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("last", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction maximum(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("maximum", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction minimum(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("minimum", expression, (AbstractC6447f) null);
        }

        public final AggregateFunction sum(Expression expression) {
            AbstractC6452k.m12181e(expression, "expression");
            return new AggregateFunction("sum", expression, (AbstractC6447f) null);
        }
    }

    public /* synthetic */ AggregateFunction(String str, Expression expression, AbstractC6447f abstractC6447f) {
        this(str, expression);
    }

    public static final AggregateFunction arrayAgg(Expression expression) {
        return Companion.arrayAgg(expression);
    }

    public static final AggregateFunction arrayAggDistinct(Expression expression) {
        return Companion.arrayAggDistinct(expression);
    }

    public static final AggregateFunction average(Expression expression) {
        return Companion.average(expression);
    }

    public static final AggregateFunction count(Expression expression) {
        return Companion.count(expression);
    }

    public static final AggregateFunction countAll() {
        return Companion.countAll();
    }

    public static final AggregateFunction countDistinct(Expression expression) {
        return Companion.countDistinct(expression);
    }

    public static final AggregateFunction countIf(BooleanExpression booleanExpression) {
        return Companion.countIf(booleanExpression);
    }

    public static final AggregateFunction first(Expression expression) {
        return Companion.first(expression);
    }

    public static final AggregateFunction last(Expression expression) {
        return Companion.last(expression);
    }

    public static final AggregateFunction maximum(Expression expression) {
        return Companion.maximum(expression);
    }

    public static final AggregateFunction minimum(Expression expression) {
        return Companion.minimum(expression);
    }

    public static final AggregateFunction rawAggregate(String str, Expression... expressionArr) {
        return Companion.rawAggregate(str, expressionArr);
    }

    public static final AggregateFunction sum(Expression expression) {
        return Companion.sum(expression);
    }

    public final AliasedAggregate alias(String alias) {
        AbstractC6452k.m12181e(alias, "alias");
        return new AliasedAggregate(alias, this);
    }

    public final C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0357H c0357hM578j = C0361J.m578j();
        c0357hM578j.m567d(this.name);
        for (Expression expression : this.params) {
            c0357hM578j.m565b(expression.toProto$com_google_firebase_firebase_firestore(userDataReader));
        }
        this.options.forEach$com_google_firebase_firebase_firestore(new AggregateFunction$toProto$1(c0357hM578j));
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m693k(c0357hM578j);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public /* synthetic */ AggregateFunction(String str, String str2, AbstractC6447f abstractC6447f) {
        this(str, str2);
    }

    public static final AggregateFunction arrayAgg(String str) {
        return Companion.arrayAgg(str);
    }

    public static final AggregateFunction arrayAggDistinct(String str) {
        return Companion.arrayAggDistinct(str);
    }

    public static final AggregateFunction average(String str) {
        return Companion.average(str);
    }

    public static final AggregateFunction count(String str) {
        return Companion.count(str);
    }

    public static final AggregateFunction countDistinct(String str) {
        return Companion.countDistinct(str);
    }

    public static final AggregateFunction first(String str) {
        return Companion.first(str);
    }

    public static final AggregateFunction last(String str) {
        return Companion.last(str);
    }

    public static final AggregateFunction maximum(String str) {
        return Companion.maximum(str);
    }

    public static final AggregateFunction minimum(String str) {
        return Companion.minimum(str);
    }

    public static final AggregateFunction sum(String str) {
        return Companion.sum(str);
    }

    public /* synthetic */ AggregateFunction(String str, AbstractC6447f abstractC6447f) {
        this(str);
    }

    private AggregateFunction(String str, Expression[] expressionArr, InternalOptions internalOptions) {
        this.name = str;
        this.params = expressionArr;
        this.options = internalOptions;
    }

    public /* synthetic */ AggregateFunction(String str, Expression[] expressionArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(str, expressionArr, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    private AggregateFunction(String str) {
        this(str, new Expression[0], null, 4, null);
    }

    private AggregateFunction(String str, Expression expression) {
        this(str, new Expression[]{expression}, null, 4, null);
    }

    private AggregateFunction(String str, String str2) {
        this(str, Expression.Companion.field(str2));
    }
}
