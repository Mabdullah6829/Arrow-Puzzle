package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.Pipeline;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.protobuf.AbstractC6185M;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0389X0;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
final class PipelineValueExpression extends Expression {
    private final Pipeline pipeline;

    public PipelineValueExpression(Pipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        this.pipeline = pipeline;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return "pipeline(${pipeline.hashCode()})";
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.PipelineValueExpression$evaluateFunction$1
            @Override // p078p0.InterfaceC6498l
            public final Void invoke(MutableDocument mutableDocument) {
                AbstractC6452k.m12181e(mutableDocument, "<unused var>");
                throw new C0068x("Pipeline evaluation not implemented");
            }
        };
    }

    public final Pipeline getPipeline() {
        return this.pipeline;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m699r(this.pipeline.toPipelineProto$com_google_firebase_firebase_firestore(userDataReader));
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }

    public String toString() {
        return "Pipeline(...)";
    }
}
