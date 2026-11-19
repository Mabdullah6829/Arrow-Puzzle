package com.google.firebase.firestore.pipeline.evaluation;

import androidx.core.location.LocationRequestCompat;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p022N.AbstractC0355G;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class ArithmeticKt {
    private static final InterfaceC6498l evaluateAbs;
    private static final InterfaceC6498l evaluateAdd = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    Object longValue;
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
                        Object longValue2 = null;
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            longValue = null;
                        } else if (i2 == 5) {
                            longValue = new LongValue(value.m732B());
                        } else {
                            if (i2 != 6) {
                                return EvaluateResultError.INSTANCE;
                            }
                            longValue = new DoubleValue(value.m748x());
                        }
                        EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (i3 == 5) {
                                longValue2 = new LongValue(value2.m732B());
                            } else {
                                if (i3 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue2 = new DoubleValue(value2.m748x());
                            }
                        }
                        if (longValue != null && longValue2 != null) {
                            if (longValue instanceof LongValue) {
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12333long(AbstractC0242F.m347b(((LongValue) longValue).getValue(), ((LongValue) longValue2).getValue()));
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((LongValue) longValue).getValue() + ((DoubleValue) longValue2).getValue());
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!(longValue instanceof DoubleValue)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (longValue2 instanceof DoubleValue) {
                                return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() + ((DoubleValue) longValue2).getValue());
                            }
                            if (longValue2 instanceof LongValue) {
                                return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() + ((LongValue) longValue2).getValue());
                            }
                            return EvaluateResultError.INSTANCE;
                        }
                        return EvaluateResult.Companion.getNULL();
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateCeil;
    private static final InterfaceC6498l evaluateDivide;
    private static final InterfaceC6498l evaluateExp;
    private static final InterfaceC6498l evaluateFloor;
    private static final InterfaceC6498l evaluateLn;
    private static final InterfaceC6498l evaluateLog;
    private static final InterfaceC6498l evaluateLog10;
    private static final InterfaceC6498l evaluateMod;
    private static final InterfaceC6498l evaluateMultiply;
    private static final InterfaceC6498l evaluatePow;
    private static final InterfaceC6498l evaluateRound;
    private static final InterfaceC6498l evaluateRoundToPrecision;
    private static final InterfaceC6498l evaluateSqrt;
    private static final InterfaceC6498l evaluateSubtract;

    static {
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f736v;
        evaluateCeil = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$2.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                return EvaluateResult.Companion.m12333long(value.m732B());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return EvaluateResult.Companion.m12331double(Math.ceil(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateDivide = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$3.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
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
                            Object longValue2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    longValue2 = new LongValue(value2.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    longValue2 = new DoubleValue(value2.m748x());
                                }
                            }
                            if (longValue != null && longValue2 != null) {
                                if (longValue instanceof LongValue) {
                                    if (longValue2 instanceof LongValue) {
                                        return EvaluateResult.Companion.m12333long(((LongValue) longValue).getValue() / ((LongValue) longValue2).getValue());
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return EvaluateResult.Companion.m12331double(((LongValue) longValue).getValue() / ((DoubleValue) longValue2).getValue());
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() / ((DoubleValue) longValue2).getValue());
                                }
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() / ((LongValue) longValue2).getValue());
                                }
                                return EvaluateResultError.INSTANCE;
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateFloor = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$4
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$4.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                return EvaluateResult.Companion.m12333long(value.m732B());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return EvaluateResult.Companion.m12331double(Math.floor(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateMod = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$5
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$5.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
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
                            Object longValue2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    longValue2 = new LongValue(value2.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    longValue2 = new DoubleValue(value2.m748x());
                                }
                            }
                            if (longValue != null && longValue2 != null) {
                                if (longValue instanceof LongValue) {
                                    if (longValue2 instanceof LongValue) {
                                        return EvaluateResult.Companion.m12333long(((LongValue) longValue).getValue() % ((LongValue) longValue2).getValue());
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return EvaluateResult.Companion.m12331double(((LongValue) longValue).getValue() % ((DoubleValue) longValue2).getValue());
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() % ((DoubleValue) longValue2).getValue());
                                }
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() % ((LongValue) longValue2).getValue());
                                }
                                return EvaluateResultError.INSTANCE;
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateMultiply = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$6
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$6.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
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
                            Object longValue2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    longValue2 = new LongValue(value2.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    longValue2 = new DoubleValue(value2.m748x());
                                }
                            }
                            if (longValue != null && longValue2 != null) {
                                if (longValue instanceof LongValue) {
                                    if (longValue2 instanceof LongValue) {
                                        return EvaluateResult.Companion.m12333long(AbstractC0242F.m348c(((LongValue) longValue).getValue(), ((LongValue) longValue2).getValue()));
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return EvaluateResult.Companion.m12331double(((LongValue) longValue).getValue() * ((DoubleValue) longValue2).getValue());
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() * ((DoubleValue) longValue2).getValue());
                                }
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() * ((LongValue) longValue2).getValue());
                                }
                                return EvaluateResultError.INSTANCE;
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluatePow = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1.1
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
                    
                        if (r3 < 0.0d) goto L82;
                     */
                    @Override // p078p0.InterfaceC6498l
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.firebase.firestore.pipeline.evaluation.EvaluateResult invoke(com.google.firebase.firestore.model.MutableDocument r18) {
                        /*
                            Method dump skipped, instruction units count: 598
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$1.C58251.invoke(com.google.firebase.firestore.model.MutableDocument):com.google.firebase.firestore.pipeline.evaluation.EvaluateResult");
                    }
                };
            }
        };
        evaluateRound = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$7
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$7.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = -1;
                        int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i3 == -1 || i3 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                return EvaluateResult.Companion.m12333long(value.m732B());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            double dM748x = value.m748x();
                            EvaluateResult.Companion companion = EvaluateResult.Companion;
                            if (!Double.isInfinite(dM748x) && !Double.isNaN(dM748x)) {
                                double d = dM748x % ((double) 1);
                                double d2 = dM748x - d;
                                if (Math.abs(d) >= 0.5d) {
                                    if (dM748x >= 0.0d) {
                                        i2 = 1;
                                    }
                                    dM748x = d2 + ((double) i2);
                                } else {
                                    dM748x = d2;
                                }
                            }
                            return companion.m12331double(dM748x);
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateRoundToPrecision = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticNumberLong$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticNumberLong$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
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
                            Long lValueOf = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    lValueOf = Long.valueOf(value2.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    lValueOf = Long.valueOf((long) value2.m748x());
                                }
                            }
                            if (longValue != null && lValueOf != null) {
                                if (longValue instanceof LongValue) {
                                    long value3 = ((LongValue) longValue).getValue();
                                    long jLongValue = lValueOf.longValue();
                                    if (jLongValue >= 0) {
                                        return EvaluateResult.Companion.m12333long(value3);
                                    }
                                    if ((-jLongValue) >= ((long) Math.floor(Math.log10(Math.abs(value3)))) + 1) {
                                        return EvaluateResult.Companion.getLONG_ZERO();
                                    }
                                    long jPow = (long) Math.pow(10.0d, -jLongValue);
                                    long j2 = value3 - (value3 % jPow);
                                    if (Math.abs(j2) < Math.abs(jPow / ((long) 2))) {
                                        return EvaluateResult.Companion.m12333long(j2);
                                    }
                                    if (value3 < 0) {
                                        return value3 < (-9223372036854775807L) + jPow ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12333long(j2 - jPow);
                                    }
                                    return value3 > LocationRequestCompat.PASSIVE_INTERVAL - jPow ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12333long(j2 + jPow);
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                double value4 = ((DoubleValue) longValue).getValue();
                                long jLongValue2 = lValueOf.longValue();
                                if (jLongValue2 >= 16 || Double.isInfinite(value4) || Double.isNaN(value4)) {
                                    return EvaluateResult.Companion.m12331double(value4);
                                }
                                if ((-jLongValue2) >= ((long) Math.floor(Math.log10(Math.abs(value4)))) + 1) {
                                    return EvaluateResult.Companion.getDOUBLE_ZERO();
                                }
                                BigDecimal scale = BigDecimal.valueOf(value4).setScale((int) jLongValue2, RoundingMode.HALF_UP);
                                AbstractC6452k.m12180d(scale, "setScale(...)");
                                double dDoubleValue = scale.doubleValue();
                                return (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(dDoubleValue);
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateAbs = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$8
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$8.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G != enumC0391Y2) {
                            if (enumC0391Y0M737G != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            try {
                                return EvaluateResult.Companion.m12331double(Math.abs(value.m748x()));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        try {
                            long jM732B = value.m732B();
                            EvaluateResult.Companion companion = EvaluateResult.Companion;
                            if (jM732B != Long.MIN_VALUE) {
                                return companion.m12333long(Math.abs(jM732B));
                            }
                            throw new ArithmeticException("long overflow");
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateExp = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$2.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                double dM732B = value.m732B();
                                if (Math.exp(dM732B) == Double.POSITIVE_INFINITY && dM732B != Double.POSITIVE_INFINITY) {
                                    throw new Exception("exp(...) exponent overflow");
                                }
                                return EvaluateResult.Companion.m12331double(Math.exp(dM732B));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            double dM748x = value.m748x();
                            if (Math.exp(dM748x) == Double.POSITIVE_INFINITY && dM748x != Double.POSITIVE_INFINITY) {
                                throw new Exception("exp(...) exponent overflow");
                            }
                            return EvaluateResult.Companion.m12331double(Math.exp(dM748x));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateLn = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$3.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                double dM732B = value.m732B();
                                return dM732B <= 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.log(dM732B));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            double dM748x = value.m748x();
                            return dM748x <= 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.log(dM748x));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateLog = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$4
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$4.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
                        double value;
                        double value2;
                        EvaluateResult.Companion companion;
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
                            C0393Z0 value3 = evaluateResult.getValue();
                            C0393Z0 value4 = evaluateResult2.getValue();
                            Object longValue2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value3 != null ? value3.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value3.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value3.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    longValue2 = new LongValue(value4.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    longValue2 = new DoubleValue(value4.m748x());
                                }
                            }
                            if (longValue != null && longValue2 != null) {
                                if (longValue instanceof LongValue) {
                                    if (longValue2 instanceof LongValue) {
                                        value = ((LongValue) longValue).getValue();
                                        value2 = ((LongValue) longValue2).getValue();
                                        if (value != Double.NEGATIVE_INFINITY) {
                                            if (value2 != Double.POSITIVE_INFINITY) {
                                                if (value2 > 0.0d && value > 0.0d && value2 != 1.0d) {
                                                    companion = EvaluateResult.Companion;
                                                    return companion.m12331double(AbstractC0355G.m557k(value, value2));
                                                }
                                                return EvaluateResultError.INSTANCE;
                                            }
                                            return EvaluateResult.Companion.m12331double(Double.NaN);
                                        }
                                        return EvaluateResult.Companion.m12331double(Double.NaN);
                                    }
                                    if (!(longValue2 instanceof DoubleValue)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    value = ((LongValue) longValue).getValue();
                                    value2 = ((DoubleValue) longValue2).getValue();
                                    if (value == Double.NEGATIVE_INFINITY) {
                                        return EvaluateResult.Companion.m12331double(Double.NaN);
                                    }
                                    if (value2 == Double.POSITIVE_INFINITY) {
                                        return EvaluateResult.Companion.m12331double(Double.NaN);
                                    }
                                    if (value2 > 0.0d && value > 0.0d && value2 != 1.0d) {
                                        companion = EvaluateResult.Companion;
                                        return companion.m12331double(AbstractC0355G.m557k(value, value2));
                                    }
                                    return EvaluateResultError.INSTANCE;
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    value = ((DoubleValue) longValue).getValue();
                                    value2 = ((DoubleValue) longValue2).getValue();
                                    if (value == Double.NEGATIVE_INFINITY) {
                                        return EvaluateResult.Companion.m12331double(Double.NaN);
                                    }
                                    if (value2 == Double.POSITIVE_INFINITY) {
                                        return EvaluateResult.Companion.m12331double(Double.NaN);
                                    }
                                    if (value2 > 0.0d && value > 0.0d && value2 != 1.0d) {
                                        companion = EvaluateResult.Companion;
                                        return companion.m12331double(AbstractC0355G.m557k(value, value2));
                                    }
                                    return EvaluateResultError.INSTANCE;
                                }
                                if (!(longValue2 instanceof LongValue)) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                value = ((DoubleValue) longValue).getValue();
                                value2 = ((LongValue) longValue2).getValue();
                                if (value == Double.NEGATIVE_INFINITY) {
                                    return EvaluateResult.Companion.m12331double(Double.NaN);
                                }
                                if (value2 == Double.POSITIVE_INFINITY) {
                                    return EvaluateResult.Companion.m12331double(Double.NaN);
                                }
                                if (value2 > 0.0d && value > 0.0d && value2 != 1.0d) {
                                    companion = EvaluateResult.Companion;
                                    return companion.m12331double(AbstractC0355G.m557k(value, value2));
                                }
                                return EvaluateResultError.INSTANCE;
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateLog10 = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$5
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$5.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                double dM732B = value.m732B();
                                return dM732B <= 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.log10(dM732B));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            double dM748x = value.m748x();
                            return dM748x <= 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.log10(dM748x));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateSqrt = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$6
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmetic$6.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59222.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y2) {
                            try {
                                double dM732B = value.m732B();
                                return dM732B < 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.sqrt(dM732B));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            double dM748x = value.m748x();
                            return dM748x < 0.0d ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(Math.sqrt(dM748x));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateSubtract = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$9
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArithmeticKt$special$$inlined$arithmeticPrimitive$9.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        Object longValue;
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
                            Object longValue2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                longValue = null;
                            } else if (i2 == 5) {
                                longValue = new LongValue(value.m732B());
                            } else {
                                if (i2 != 6) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                longValue = new DoubleValue(value.m748x());
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 == 5) {
                                    longValue2 = new LongValue(value2.m732B());
                                } else {
                                    if (i3 != 6) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    longValue2 = new DoubleValue(value2.m748x());
                                }
                            }
                            if (longValue != null && longValue2 != null) {
                                if (longValue instanceof LongValue) {
                                    if (longValue2 instanceof LongValue) {
                                        return EvaluateResult.Companion.m12333long(AbstractC0242F.m349d(((LongValue) longValue).getValue(), ((LongValue) longValue2).getValue()));
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return EvaluateResult.Companion.m12331double(((LongValue) longValue).getValue() - ((DoubleValue) longValue2).getValue());
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() - ((DoubleValue) longValue2).getValue());
                                }
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12331double(((DoubleValue) longValue).getValue() - ((LongValue) longValue2).getValue());
                                }
                                return EvaluateResultError.INSTANCE;
                            }
                            return EvaluateResult.Companion.getNULL();
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l getEvaluateAbs() {
        return evaluateAbs;
    }

    public static final InterfaceC6498l getEvaluateAdd() {
        return evaluateAdd;
    }

    public static final InterfaceC6498l getEvaluateCeil() {
        return evaluateCeil;
    }

    public static final InterfaceC6498l getEvaluateDivide() {
        return evaluateDivide;
    }

    public static final InterfaceC6498l getEvaluateExp() {
        return evaluateExp;
    }

    public static final InterfaceC6498l getEvaluateFloor() {
        return evaluateFloor;
    }

    public static final InterfaceC6498l getEvaluateLn() {
        return evaluateLn;
    }

    public static final InterfaceC6498l getEvaluateLog() {
        return evaluateLog;
    }

    public static final InterfaceC6498l getEvaluateLog10() {
        return evaluateLog10;
    }

    public static final InterfaceC6498l getEvaluateMod() {
        return evaluateMod;
    }

    public static final InterfaceC6498l getEvaluateMultiply() {
        return evaluateMultiply;
    }

    public static final InterfaceC6498l getEvaluatePow() {
        return evaluatePow;
    }

    public static final InterfaceC6498l getEvaluateRound() {
        return evaluateRound;
    }

    public static final InterfaceC6498l getEvaluateRoundToPrecision() {
        return evaluateRoundToPrecision;
    }

    public static final InterfaceC6498l getEvaluateSqrt() {
        return evaluateSqrt;
    }

    public static final InterfaceC6498l getEvaluateSubtract() {
        return evaluateSubtract;
    }
}
