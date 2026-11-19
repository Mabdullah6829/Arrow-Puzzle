package com.google.firebase.firestore.pipeline.evaluation;

import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class EvaluateResultError extends EvaluateResult {
    public static final EvaluateResultError INSTANCE = new EvaluateResultError();
    private static final boolean isError = true;
    private static final boolean isSuccess = false;
    private static final boolean isUnset = false;
    private static final C0393Z0 value = null;

    private EvaluateResultError() {
        super(null);
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public C0393Z0 getValue() {
        return value;
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isError() {
        return isError;
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isSuccess() {
        return isSuccess;
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isUnset() {
        return isUnset;
    }
}
