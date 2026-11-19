package com.google.firebase.firestore.pipeline.evaluation;

import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class EvaluateResultValue extends EvaluateResult {
    private final boolean isError;
    private final boolean isSuccess;
    private final boolean isUnset;
    private final C0393Z0 value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluateResultValue(C0393Z0 value) {
        super(null);
        AbstractC6452k.m12181e(value, "value");
        this.value = value;
        this.isSuccess = true;
    }

    public static /* synthetic */ EvaluateResultValue copy$default(EvaluateResultValue evaluateResultValue, C0393Z0 c0393z0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c0393z0 = evaluateResultValue.value;
        }
        return evaluateResultValue.copy(c0393z0);
    }

    public final C0393Z0 component1() {
        return this.value;
    }

    public final EvaluateResultValue copy(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        return new EvaluateResultValue(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EvaluateResultValue) && AbstractC6452k.m12177a(this.value, ((EvaluateResultValue) obj).value);
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public C0393Z0 getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isError() {
        return this.isError;
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isSuccess() {
        return this.isSuccess;
    }

    @Override // com.google.firebase.firestore.pipeline.evaluation.EvaluateResult
    public boolean isUnset() {
        return this.isUnset;
    }

    public String toString() {
        return "EvaluateResultValue(value=" + this.value + ')';
    }
}
