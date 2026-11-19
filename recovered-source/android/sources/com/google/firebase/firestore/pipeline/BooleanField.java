package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanField extends BooleanExpression {
    private final Field field;

    public BooleanField(Field field) {
        AbstractC6452k.m12181e(field, "field");
        this.field = field;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return this.field.canonicalId$com_google_firebase_firebase_firestore();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BooleanField) {
            return AbstractC6452k.m12177a(this.field, ((BooleanField) obj).field);
        }
        if (obj instanceof Field) {
            return AbstractC6452k.m12177a(this.field, obj);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return this.field.evaluateFunction$com_google_firebase_firebase_firestore(context);
    }

    public final Field getField() {
        return this.field;
    }

    public int hashCode() {
        return this.field.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return this.field.toProto$com_google_firebase_firebase_firestore(userDataReader);
    }

    public String toString() {
        return this.field.toString();
    }
}
