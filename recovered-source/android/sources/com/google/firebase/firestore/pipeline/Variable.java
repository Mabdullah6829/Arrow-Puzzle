package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.protobuf.AbstractC6185M;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p011H.AbstractC0271e0;
import p022N.C0389X0;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
final class Variable extends Expression {
    private final String name;

    public Variable(String name) {
        AbstractC6452k.m12181e(name, "name");
        this.name = name;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return AbstractC0271e0.m401i(new StringBuilder("var("), this.name, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Variable) {
            return AbstractC6452k.m12177a(this.name, ((Variable) obj).name);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.Variable$evaluateFunction$1
            @Override // p078p0.InterfaceC6498l
            public final Void invoke(MutableDocument mutableDocument) {
                AbstractC6452k.m12181e(mutableDocument, "<unused var>");
                throw new C0068x("Variable evaluation not implemented");
            }
        };
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m704x(this.name);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }
}
