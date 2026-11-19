package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanConstant extends BooleanExpression {
    private final Expression.Constant constant;

    public BooleanConstant(Expression.Constant constant) {
        AbstractC6452k.m12181e(constant, "constant");
        this.constant = constant;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return this.constant.canonicalId$com_google_firebase_firebase_firestore();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BooleanConstant) {
            return AbstractC6452k.m12177a(this.constant, ((BooleanConstant) obj).constant);
        }
        if (obj instanceof Expression.Constant) {
            return AbstractC6452k.m12177a(this.constant, obj);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return this.constant.evaluateFunction$com_google_firebase_firebase_firestore(context);
    }

    public final Expression.Constant getConstant() {
        return this.constant;
    }

    public int hashCode() {
        return this.constant.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return this.constant.getValue();
    }

    public String toString() {
        return this.constant.toString();
    }
}
