package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class ComparisonKt {
    private static final InterfaceC6498l evaluateNot;
    private static final InterfaceC6498l evaluateEq = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$binaryValueValueFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$binaryValueValueFunction$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        return EvaluateResult.Companion.m12330boolean(Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore(evaluateResult.getValue(), evaluateResult2.getValue()));
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateNeq = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$binaryValueValueFunction$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$binaryValueValueFunction$2.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        return EvaluateResult.Companion.m12329boolean(Boolean.valueOf(!Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore(evaluateResult.getValue(), evaluateResult2.getValue())));
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateGt = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        C0393Z0 value = evaluateResult.getValue();
                        C0393Z0 value2 = evaluateResult2.getValue();
                        EvaluateResult.Companion companion = EvaluateResult.Companion;
                        Values.Enterprise.CompareResult compareResultStrictCompare$com_google_firebase_firebase_firestore = Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(value, value2);
                        boolean z = true;
                        if (ComparisonKt.WhenMappings.$EnumSwitchMapping$0[compareResultStrictCompare$com_google_firebase_firebase_firestore.ordinal()] != 1) {
                            z = false;
                        }
                        return companion.m12330boolean(z);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateGte = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$2.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        C0393Z0 value = evaluateResult.getValue();
                        C0393Z0 value2 = evaluateResult2.getValue();
                        EvaluateResult.Companion companion = EvaluateResult.Companion;
                        int i2 = ComparisonKt.WhenMappings.$EnumSwitchMapping$0[Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(value, value2).ordinal()];
                        boolean z = true;
                        if (i2 != 1 && i2 != 2) {
                            z = false;
                        }
                        return companion.m12330boolean(z);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateLt = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$3
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$3.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        return EvaluateResult.Companion.m12330boolean(ComparisonKt.WhenMappings.$EnumSwitchMapping$0[Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(evaluateResult.getValue(), evaluateResult2.getValue()).ordinal()] == 3);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateLte = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$4
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$comparison$4.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                    if (evaluateResult.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                    if (evaluateResult2.isError()) {
                        return EvaluateResultError.INSTANCE;
                    }
                    try {
                        C0393Z0 value = evaluateResult.getValue();
                        C0393Z0 value2 = evaluateResult2.getValue();
                        EvaluateResult.Companion companion = EvaluateResult.Companion;
                        int i2 = ComparisonKt.WhenMappings.$EnumSwitchMapping$0[Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(value, value2).ordinal()];
                        boolean z = true;
                        if (i2 != 2 && i2 != 3) {
                            z = false;
                        }
                        return companion.m12330boolean(z);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Values.Enterprise.CompareResult.values().length];
            try {
                iArr[Values.Enterprise.CompareResult.GREATER_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Values.Enterprise.CompareResult.EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Values.Enterprise.CompareResult.LESS_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f734t;
        evaluateNot = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$unaryBooleanFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ComparisonKt$special$$inlined$unaryBooleanFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        try {
                            EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 != -1 && i2 != 1) {
                                if (enumC0391Y0M737G != enumC0391Y1) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                try {
                                    return EvaluateResult.Companion.m12330boolean(!value.m746u());
                                } catch (Exception unused) {
                                    return EvaluateResultError.INSTANCE;
                                }
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l getEvaluateEq() {
        return evaluateEq;
    }

    public static final InterfaceC6498l getEvaluateGt() {
        return evaluateGt;
    }

    public static final InterfaceC6498l getEvaluateGte() {
        return evaluateGte;
    }

    public static final InterfaceC6498l getEvaluateLt() {
        return evaluateLt;
    }

    public static final InterfaceC6498l getEvaluateLte() {
        return evaluateLte;
    }

    public static final InterfaceC6498l getEvaluateNeq() {
        return evaluateNeq;
    }

    public static final InterfaceC6498l getEvaluateNot() {
        return evaluateNot;
    }
}
