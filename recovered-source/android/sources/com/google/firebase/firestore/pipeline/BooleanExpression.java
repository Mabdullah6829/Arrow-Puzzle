package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.pipeline.evaluation.UtilsKt;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BooleanExpression extends Expression {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final BooleanExpression rawFunction(String name, Expression... expr) {
            AbstractC6452k.m12181e(name, "name");
            AbstractC6452k.m12181e(expr, "expr");
            return new BooleanFunctionExpression(name, UtilsKt.getNotImplemented(), expr);
        }

        private Companion() {
        }
    }

    public static final BooleanExpression rawFunction(String str, Expression... expressionArr) {
        return Companion.rawFunction(str, expressionArr);
    }

    public final Expression conditional(Expression thenExpr, Expression elseExpr) {
        AbstractC6452k.m12181e(thenExpr, "thenExpr");
        AbstractC6452k.m12181e(elseExpr, "elseExpr");
        return Expression.Companion.conditional(this, thenExpr, elseExpr);
    }

    public final AggregateFunction countIf() {
        return AggregateFunction.Companion.countIf(this);
    }

    public final BooleanExpression ifError$com_google_firebase_firebase_firestore(BooleanExpression catchExpr) {
        AbstractC6452k.m12181e(catchExpr, "catchExpr");
        return Expression.Companion.ifError(this, catchExpr);
    }

    public final BooleanExpression not() {
        return Expression.Companion.not(this);
    }

    public final Expression conditional(Object thenValue, Object elseValue) {
        AbstractC6452k.m12181e(thenValue, "thenValue");
        AbstractC6452k.m12181e(elseValue, "elseValue");
        return Expression.Companion.conditional(this, thenValue, elseValue);
    }
}
