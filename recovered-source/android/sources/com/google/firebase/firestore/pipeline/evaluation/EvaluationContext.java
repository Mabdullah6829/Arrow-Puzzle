package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.RealtimePipeline;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class EvaluationContext {
    private final RealtimePipeline pipeline;

    public EvaluationContext(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        this.pipeline = pipeline;
    }

    public final RealtimePipeline getPipeline() {
        return this.pipeline;
    }
}
