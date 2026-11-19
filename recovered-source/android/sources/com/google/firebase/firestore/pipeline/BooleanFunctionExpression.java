package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p034T.C0783s0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanFunctionExpression extends BooleanExpression {
    private final Expression expr;

    public BooleanFunctionExpression(Expression expr) {
        AbstractC6452k.m12181e(expr, "expr");
        this.expr = expr;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return this.expr.canonicalId$com_google_firebase_firebase_firestore();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BooleanFunctionExpression) {
            return AbstractC6452k.m12177a(this.expr, ((BooleanFunctionExpression) obj).expr);
        }
        if (obj instanceof FunctionExpression) {
            return AbstractC6452k.m12177a(this.expr, obj);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return this.expr.evaluateFunction$com_google_firebase_firebase_firestore(context);
    }

    public final Expression getExpr() {
        return this.expr;
    }

    public int hashCode() {
        return this.expr.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return this.expr.toProto$com_google_firebase_firebase_firestore(userDataReader);
    }

    public String toString() {
        return this.expr.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanFunctionExpression(String name, InterfaceC6498l function, Expression[] params) {
        this(new FunctionExpression(name, function, params, null, 8, null));
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(params, "params");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanFunctionExpression(String name, InterfaceC6498l function, Expression param) {
        this(name, function, new Expression[]{param});
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param, "param");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanFunctionExpression(String name, InterfaceC6498l function, Expression param1, Object param2) {
        this(name, function, new Expression[]{param1, Expression.Companion.toExprOrConstant$com_google_firebase_firebase_firestore(param2)});
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param1, "param1");
        AbstractC6452k.m12181e(param2, "param2");
    }

    public BooleanFunctionExpression(String name, InterfaceC6498l function, Expression param, Object... params) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param, "param");
        AbstractC6452k.m12181e(params, "params");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(param);
        c0783s0.m1658b(Expression.Companion.toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(params));
        ArrayList arrayList = c0783s0.f2033b;
        this(name, function, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanFunctionExpression(String name, InterfaceC6498l function, Expression param1, Expression param2) {
        this(name, function, new Expression[]{param1, param2});
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param1, "param1");
        AbstractC6452k.m12181e(param2, "param2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BooleanFunctionExpression(String name, InterfaceC6498l function, String fieldName) {
        this(name, function, new Field[]{Expression.Companion.field(fieldName)});
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(fieldName, "fieldName");
    }

    public BooleanFunctionExpression(String name, InterfaceC6498l function, String fieldName, Object... params) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(fieldName, "fieldName");
        AbstractC6452k.m12181e(params, "params");
        C0783s0 c0783s0 = new C0783s0(2);
        Expression.Companion companion = Expression.Companion;
        c0783s0.m1657a(companion.field(fieldName));
        c0783s0.m1658b(companion.toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(params));
        ArrayList arrayList = c0783s0.f2033b;
        this(name, function, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]));
    }
}
