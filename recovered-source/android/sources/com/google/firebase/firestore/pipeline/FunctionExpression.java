package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.firebase.firestore.pipeline.evaluation.UtilsKt;
import com.google.protobuf.AbstractC6185M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p022N.C0357H;
import p022N.C0361J;
import p022N.C0389X0;
import p022N.C0393Z0;
import p034T.C0783s0;
import p058e0.AbstractC6305m;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionExpression extends Expression {
    private final InterfaceC6498l function;
    private final String name;
    private final InternalOptions options;
    private final Expression[] params;

    public /* synthetic */ FunctionExpression(String str, InterfaceC6498l interfaceC6498l, Expression[] expressionArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(str, interfaceC6498l, expressionArr, (i2 & 8) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        Expression[] expressionArr = this.params;
        ArrayList arrayList = new ArrayList(expressionArr.length);
        for (Expression expression : expressionArr) {
            arrayList.add(expression.canonicalId$com_google_firebase_firebase_firestore());
        }
        StringBuilder sb = new StringBuilder("fn(");
        sb.append(this.name);
        sb.append('[');
        return AbstractC0271e0.m403k(sb, AbstractC6305m.m12105A(arrayList, ",", null, null, null, 62), "])");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionExpression)) {
            return false;
        }
        FunctionExpression functionExpression = (FunctionExpression) obj;
        return AbstractC6452k.m12177a(this.name, functionExpression.name) && Arrays.equals(this.params, functionExpression.params) && AbstractC6452k.m12177a(this.options, functionExpression.options);
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public final InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        InterfaceC6498l interfaceC6498l = this.function;
        Expression[] expressionArr = this.params;
        ArrayList arrayList = new ArrayList(expressionArr.length);
        for (Expression expression : expressionArr) {
            arrayList.add(expression.evaluateFunction$com_google_firebase_firebase_firestore(context));
        }
        return (InterfaceC6498l) interfaceC6498l.invoke(arrayList);
    }

    public final String getName$com_google_firebase_firebase_firestore() {
        return this.name;
    }

    public final Expression[] getParams$com_google_firebase_firebase_firestore() {
        return this.params;
    }

    public int hashCode() {
        return this.options.hashCode() + ((Arrays.hashCode(this.params) + (this.name.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0357H c0357hM578j = C0361J.m578j();
        c0357hM578j.m567d(this.name);
        for (Expression expression : this.params) {
            c0357hM578j.m565b(expression.toProto$com_google_firebase_firebase_firestore(userDataReader));
        }
        this.options.forEach$com_google_firebase_firebase_firestore(new FunctionExpression$toProto$1(c0357hM578j));
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m693k(c0357hM578j);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public FunctionExpression(String name, InterfaceC6498l function, Expression[] params, InternalOptions options) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(params, "params");
        AbstractC6452k.m12181e(options, "options");
        this.name = name;
        this.function = function;
        this.params = params;
        this.options = options;
    }

    public /* synthetic */ FunctionExpression(String str, List list, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(str, (List<? extends Expression>) list, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FunctionExpression(String name, List<? extends Expression> params, InternalOptions options) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(params, "params");
        AbstractC6452k.m12181e(options, "options");
        InterfaceC6498l interfaceC6498l = FunctionRegistry.INSTANCE.getFunctions().get(name);
        this(name, interfaceC6498l == null ? UtilsKt.getNotImplemented() : interfaceC6498l, (Expression[]) params.toArray(new Expression[0]), options);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionExpression(String name, InterfaceC6498l function) {
        this(name, function, new Expression[0], null, 8, null);
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionExpression(String name, InterfaceC6498l function, Expression param) {
        this(name, function, new Expression[]{param}, null, 8, null);
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param, "param");
    }

    public FunctionExpression(String name, InterfaceC6498l function, Expression param, Object... params) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param, "param");
        AbstractC6452k.m12181e(params, "params");
        C0783s0 c0783s0 = new C0783s0(2);
        c0783s0.m1657a(param);
        c0783s0.m1658b(Expression.Companion.toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(params));
        ArrayList arrayList = c0783s0.f2033b;
        this(name, function, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]), null, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionExpression(String name, InterfaceC6498l function, Expression param1, Expression param2) {
        this(name, function, new Expression[]{param1, param2}, null, 8, null);
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param1, "param1");
        AbstractC6452k.m12181e(param2, "param2");
    }

    public FunctionExpression(String name, InterfaceC6498l function, Expression param1, Expression param2, Object... params) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(param1, "param1");
        AbstractC6452k.m12181e(param2, "param2");
        AbstractC6452k.m12181e(params, "params");
        C0783s0 c0783s0 = new C0783s0(3);
        c0783s0.m1657a(param1);
        c0783s0.m1657a(param2);
        c0783s0.m1658b(Expression.Companion.toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(params));
        ArrayList arrayList = c0783s0.f2033b;
        this(name, function, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]), null, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FunctionExpression(String name, InterfaceC6498l function, String fieldName) {
        this(name, function, new Field[]{Expression.Companion.field(fieldName)}, null, 8, null);
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(fieldName, "fieldName");
    }

    public FunctionExpression(String name, InterfaceC6498l function, String fieldName, Object... params) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(function, "function");
        AbstractC6452k.m12181e(fieldName, "fieldName");
        AbstractC6452k.m12181e(params, "params");
        C0783s0 c0783s0 = new C0783s0(2);
        Expression.Companion companion = Expression.Companion;
        c0783s0.m1657a(companion.field(fieldName));
        c0783s0.m1658b(companion.toArrayOfExprOrConstant$com_google_firebase_firebase_firestore(params));
        ArrayList arrayList = c0783s0.f2033b;
        this(name, function, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]), null, 8, null);
    }
}
