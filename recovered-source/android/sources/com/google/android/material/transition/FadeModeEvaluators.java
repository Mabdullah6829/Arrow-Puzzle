package com.google.android.material.transition;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
class FadeModeEvaluators {

    /* JADX INFO: renamed from: IN */
    private static final FadeModeEvaluator f23525IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4, float f5) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f3, f4, f2));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4, float f5) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f4, f2), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4, float f5) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, f4, f2), TransitionUtils.lerp(0, 255, f3, f4, f2));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f2, float f3, float f4, float f5) {
            float fM394b = AbstractC0271e0.m394b(f4, f3, f5, f3);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f3, fM394b, f2), TransitionUtils.lerp(0, 255, fM394b, f4, f2));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i2, boolean z) {
        if (i2 == 0) {
            return z ? f23525IN : OUT;
        }
        if (i2 == 1) {
            return z ? OUT : f23525IN;
        }
        if (i2 == 2) {
            return CROSS;
        }
        if (i2 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(i2, "Invalid fade mode: "));
    }
}
