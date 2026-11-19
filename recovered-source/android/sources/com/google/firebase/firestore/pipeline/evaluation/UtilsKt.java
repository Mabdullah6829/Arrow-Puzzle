package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.C6197S0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6462u;
import p000A0.C0068x;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p057d0.C6283e;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    private static final InterfaceC6498l notImplemented = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$notImplemented$1
        @Override // p078p0.InterfaceC6498l
        public final Void invoke(List<? extends InterfaceC6498l> list) {
            AbstractC6452k.m12181e(list, "<unused var>");
            throw new C0068x("An operation is not implemented.");
        }
    };

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0391Y0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[9] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InterfaceC6498l arithmetic(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f736v;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$arithmetic$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                final InterfaceC6498l interfaceC6498l2 = function;
                final InterfaceC6498l interfaceC6498l3 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$arithmetic$2.1
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
                                return (EvaluateResult) interfaceC6498l3.invoke(Double.valueOf(value.m732B()));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l2.invoke(Double.valueOf(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l arithmeticNumberLong(final InterfaceC6502p intOp, final InterfaceC6502p doubleOp) {
        AbstractC6452k.m12181e(intOp, "intOp");
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$binaryValueValueFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = intOp;
                final InterfaceC6502p interfaceC6502p2 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$binaryValueValueFunction$2.1
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
                                    return (EvaluateResult) interfaceC6502p.invoke(Long.valueOf(((LongValue) longValue).getValue()), lValueOf);
                                }
                                if (longValue instanceof DoubleValue) {
                                    return (EvaluateResult) interfaceC6502p2.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), lValueOf);
                                }
                                throw new NoWhenBranchMatchedException();
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

    public static final InterfaceC6498l arithmeticPrimitive(final InterfaceC6498l intOp, final InterfaceC6498l doubleOp) {
        AbstractC6452k.m12181e(intOp, "intOp");
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f736v;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmeticPrimitive$$inlined$arithmetic$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                final InterfaceC6498l interfaceC6498l2 = intOp;
                final InterfaceC6498l interfaceC6498l3 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmeticPrimitive$$inlined$arithmetic$2.1
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
                                return EvaluateResult.Companion.m12333long(((Number) interfaceC6498l2.invoke(Long.valueOf(value.m732B()))).longValue());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return EvaluateResult.Companion.m12331double(((Number) interfaceC6498l3.invoke(Double.valueOf(value.m748x()))).doubleValue());
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryArrayArrayFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$7
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$7.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$7$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[9] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        List valuesList;
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) params.get(0).invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EvaluateResult evaluateResult2 = (EvaluateResult) params.get(1).invoke(input);
                        if (evaluateResult2.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value2 = evaluateResult2.getValue();
                        List valuesList2 = null;
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            valuesList = null;
                        } else {
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            valuesList = value.m745t().getValuesList();
                        }
                        EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (i3 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            valuesList2 = value2.m745t().getValuesList();
                        }
                        return (valuesList == null || valuesList2 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) interfaceC6502p.invoke(valuesList, valuesList2);
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryArrayValueFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$2.1
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
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            InterfaceC6502p interfaceC6502p2 = interfaceC6502p;
                            List valuesList = value.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return (EvaluateResult) interfaceC6502p2.invoke(valuesList, value2);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final <T1, T2> InterfaceC6498l binaryFunctionConstructorType(final EnumC0391Y0 valueTypeCase1, final InterfaceC6498l valueExtractor1, final EnumC0391Y0 valueTypeCase2, final InterfaceC6498l valueExtractor2, final InterfaceC6487a functionConstructor) {
        AbstractC6452k.m12181e(valueTypeCase1, "valueTypeCase1");
        AbstractC6452k.m12181e(valueExtractor1, "valueExtractor1");
        AbstractC6452k.m12181e(valueTypeCase2, "valueTypeCase2");
        AbstractC6452k.m12181e(valueExtractor2, "valueExtractor2");
        AbstractC6452k.m12181e(functionConstructor, "functionConstructor");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.binaryFunctionConstructorType.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = (InterfaceC6502p) functionConstructor.invoke();
                final EnumC0391Y0 enumC0391Y0 = valueTypeCase1;
                final EnumC0391Y0 enumC0391Y1 = valueTypeCase2;
                final InterfaceC6498l interfaceC6498l3 = valueExtractor1;
                final InterfaceC6498l interfaceC6498l4 = valueExtractor2;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.binaryFunctionConstructorType.1.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunctionConstructorType$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        C0393Z0 value;
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498l2.invoke(input);
                        if (evaluateResult2.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value2 = evaluateResult.getValue();
                        C0393Z0 value3 = null;
                        EnumC0391Y0 enumC0391Y0M737G = value2 != null ? value2.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y0) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y1) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) interfaceC6502p.invoke(interfaceC6498l3.invoke(value), interfaceC6498l4.invoke(value3));
                    }
                };
            }
        };
    }

    public static final <T1, T2> InterfaceC6498l binaryFunctionType(final EnumC0391Y0 valueTypeCase1, final InterfaceC6498l valueExtractor1, final EnumC0391Y0 valueTypeCase2, final InterfaceC6498l valueExtractor2, final InterfaceC6502p function) {
        AbstractC6452k.m12181e(valueTypeCase1, "valueTypeCase1");
        AbstractC6452k.m12181e(valueExtractor1, "valueExtractor1");
        AbstractC6452k.m12181e(valueTypeCase2, "valueTypeCase2");
        AbstractC6452k.m12181e(valueExtractor2, "valueExtractor2");
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.binaryFunctionType.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final EnumC0391Y0 enumC0391Y0 = valueTypeCase1;
                final EnumC0391Y0 enumC0391Y1 = valueTypeCase2;
                final InterfaceC6502p interfaceC6502p = function;
                final InterfaceC6498l interfaceC6498l = valueExtractor1;
                final InterfaceC6498l interfaceC6498l2 = valueExtractor2;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.binaryFunctionType.1.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunctionType$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) params.get(0).invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EvaluateResult evaluateResult2 = (EvaluateResult) params.get(1).invoke(input);
                        if (evaluateResult2.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value2 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G != enumC0391Y0) {
                            return EvaluateResultError.INSTANCE;
                        }
                        EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 == -1 || i3 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G2 != enumC0391Y1) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6502p.invoke(interfaceC6498l.invoke(value), interfaceC6498l2.invoke(value2));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryStringStringFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f738x;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryFunctionType$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryFunctionType$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) params.get(0)).invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) params.get(1)).invoke(input);
                        if (evaluateResult2.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value2 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59061.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G != enumC0391Y1) {
                            return EvaluateResultError.INSTANCE;
                        }
                        EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59061.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 == -1 || i3 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G2 != enumC0391Y2) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6502p.invoke(value.m735E(), value2.m735E());
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryValueArrayFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$1.1
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
                            EnumC0391Y0 enumC0391Y0M737G = value2 != null ? value2.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            InterfaceC6502p interfaceC6502p2 = interfaceC6502p;
                            List valuesList = value2.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return (EvaluateResult) interfaceC6502p2.invoke(value, valuesList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryValueValueFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$1.1
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
                            return (EvaluateResult) interfaceC6502p.invoke(evaluateResult.getValue(), evaluateResult2.getValue());
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l binaryVectorVectorFunction(final InterfaceC6502p function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$binaryFunction$$inlined$binaryValueValueFunction$3.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        double[] vectorValue;
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
                            double[] vectorValue2 = null;
                            if (value == null || Values.isNullValue(value)) {
                                vectorValue = null;
                            } else {
                                if (!Values.isVectorValue(value)) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                vectorValue = Values.getVectorValue(value);
                            }
                            if (value2 != null && !Values.isNullValue(value2)) {
                                if (!Values.isVectorValue(value2)) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                vectorValue2 = Values.getVectorValue(value2);
                            }
                            if (vectorValue == null || vectorValue2 == null) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            try {
                                return (EvaluateResult) interfaceC6502p.invoke(vectorValue, vectorValue2);
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final <T> InterfaceC6498l cache(final InterfaceC6498l ifAbsent) {
        AbstractC6452k.m12181e(ifAbsent, "ifAbsent");
        final C6462u c6462u = new C6462u();
        c6462u.f24636s = new C6283e(null, null);
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.cache.1
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
            @Override // p078p0.InterfaceC6498l
            public final T invoke(String s2) {
                AbstractC6452k.m12181e(s2, "s");
                C6283e c6283e = (C6283e) c6462u.f24636s;
                String str = (String) c6283e.f24308s;
                ?? r0 = c6283e.f24309t;
                if (AbstractC6452k.m12177a(str, s2)) {
                    return r0;
                }
                ?? Invoke = ifAbsent.invoke(s2);
                c6462u.f24636s = new C6283e(s2, Invoke);
                return Invoke;
            }
        };
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final EvaluateResult m12334catch(InterfaceC6487a f2) {
        AbstractC6452k.m12181e(f2, "f");
        try {
            return (EvaluateResult) f2.invoke();
        } catch (Exception unused) {
            return EvaluateResultError.INSTANCE;
        }
    }

    public static final InterfaceC6498l comparison(final InterfaceC6502p f2) {
        AbstractC6452k.m12181e(f2, "f");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$comparison$$inlined$binaryValueValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = f2;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$comparison$$inlined$binaryValueValueFunction$1.1
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
                            return EvaluateResult.Companion.m12330boolean(((Boolean) interfaceC6502p.invoke(evaluateResult.getValue(), evaluateResult2.getValue())).booleanValue());
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l getNotImplemented() {
        return notImplemented;
    }

    public static final InterfaceC6498l ternaryLazyFunction(final InterfaceC6503q function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.ternaryLazyFunction.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 3) {
                    throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6498l interfaceC6498l3 = params.get(2);
                final InterfaceC6503q interfaceC6503q = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.ternaryLazyFunction.1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(final MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        InterfaceC6503q interfaceC6503q2 = interfaceC6503q;
                        final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                        final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                        final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                        try {
                            return (EvaluateResult) interfaceC6503q2.invoke(new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryLazyFunction$1$1$1$1
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l4.invoke(input);
                                }
                            }, new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryLazyFunction$1$1$1$2
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l5.invoke(input);
                                }
                            }, new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryLazyFunction$1$1$1$3
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l6.invoke(input);
                                }
                            });
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l ternaryNullableValueFunction(final InterfaceC6503q function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryNullableValueFunction$$inlined$ternaryLazyFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 3) {
                    throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6498l interfaceC6498l3 = params.get(2);
                final InterfaceC6503q interfaceC6503q = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryNullableValueFunction$$inlined$ternaryLazyFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(final MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                        final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                        final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                        try {
                            InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryNullableValueFunction$.inlined.ternaryLazyFunction.1.1.1
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l4.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryNullableValueFunction$.inlined.ternaryLazyFunction.1.1.2
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l5.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryNullableValueFunction$.inlined.ternaryLazyFunction.1.1.3
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l6.invoke(input);
                                }
                            };
                            if (((EvaluateResult) interfaceC6487a.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = ((EvaluateResult) interfaceC6487a.invoke()).getValue();
                            if (((EvaluateResult) interfaceC6487a2.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value2 = ((EvaluateResult) interfaceC6487a2.invoke()).getValue();
                            if (((EvaluateResult) interfaceC6487a3.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            return (EvaluateResult) interfaceC6503q.invoke(value, value2, ((EvaluateResult) interfaceC6487a3.invoke()).getValue());
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l ternaryTimestampFunction(final InterfaceC6503q function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryTimestampFunction$$inlined$ternaryNullableValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 3) {
                    throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6498l interfaceC6498l3 = params.get(2);
                final InterfaceC6503q interfaceC6503q = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryTimestampFunction$$inlined$ternaryNullableValueFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(final MutableDocument input) {
                        C6197S0 c6197s0M736F;
                        AbstractC6452k.m12181e(input, "input");
                        final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                        final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                        final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                        try {
                            InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryTimestampFunction$.inlined.ternaryNullableValueFunction.1.1.1
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l4.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryTimestampFunction$.inlined.ternaryNullableValueFunction.1.1.2
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l5.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$ternaryTimestampFunction$.inlined.ternaryNullableValueFunction.1.1.3
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l6.invoke(input);
                                }
                            };
                            if (((EvaluateResult) interfaceC6487a.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = ((EvaluateResult) interfaceC6487a.invoke()).getValue();
                            if (((EvaluateResult) interfaceC6487a2.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value2 = ((EvaluateResult) interfaceC6487a2.invoke()).getValue();
                            if (((EvaluateResult) interfaceC6487a3.invoke()).isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value3 = ((EvaluateResult) interfaceC6487a3.invoke()).getValue();
                            Long lValueOf = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                c6197s0M736F = null;
                            } else {
                                if (i2 != 3) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                c6197s0M736F = value.m736F();
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            if ((enumC0391Y0M737G2 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()]) != 4) {
                                return EvaluateResultError.INSTANCE;
                            }
                            String strM735E = value2.m735E();
                            AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                            EnumC0391Y0 enumC0391Y0M737G3 = value3 != null ? value3.m737G() : null;
                            int i3 = enumC0391Y0M737G3 == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G3.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 != 5) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                lValueOf = Long.valueOf(value3.m732B());
                            }
                            if (c6197s0M736F != null && lValueOf != null) {
                                return (EvaluateResult) interfaceC6503q.invoke(c6197s0M736F, strM735E, lValueOf);
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

    public static final InterfaceC6498l unaryArrayFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        try {
                            C0393Z0 value = ((EvaluateResult) interfaceC6498l.invoke(input)).getValue();
                            if (value == null) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            EnumC0391Y0 enumC0391Y0M737G = value.m737G();
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            InterfaceC6498l interfaceC6498l3 = interfaceC6498l2;
                            List valuesList = value.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return (EvaluateResult) interfaceC6498l3.invoke(valuesList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l unaryBooleanFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f734t;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$1.1
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
                                    return (EvaluateResult) interfaceC6498l2.invoke(Boolean.valueOf(value.m746u()));
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

    public static final InterfaceC6498l unaryFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.unaryFunction.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.unaryFunction.1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        try {
                            return (EvaluateResult) interfaceC6498l2.invoke(interfaceC6498l.invoke(input));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final <T1, T2> InterfaceC6498l unaryFunctionType(final EnumC0391Y0 valueTypeCase1, final InterfaceC6498l valueExtractor1, final InterfaceC6498l function1, final EnumC0391Y0 valueTypeCase2, final InterfaceC6498l valueExtractor2, final InterfaceC6498l function2) {
        AbstractC6452k.m12181e(valueTypeCase1, "valueTypeCase1");
        AbstractC6452k.m12181e(valueExtractor1, "valueExtractor1");
        AbstractC6452k.m12181e(function1, "function1");
        AbstractC6452k.m12181e(valueTypeCase2, "valueTypeCase2");
        AbstractC6452k.m12181e(valueExtractor2, "valueExtractor2");
        AbstractC6452k.m12181e(function2, "function2");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.unaryFunctionType.2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y0 = valueTypeCase1;
                final EnumC0391Y0 enumC0391Y1 = valueTypeCase2;
                final InterfaceC6498l interfaceC6498l2 = function1;
                final InterfaceC6498l interfaceC6498l3 = valueExtractor1;
                final InterfaceC6498l interfaceC6498l4 = function2;
                final InterfaceC6498l interfaceC6498l5 = valueExtractor2;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.unaryFunctionType.2.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunctionType$2$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498l.invoke(input);
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        if (enumC0391Y0M737G == enumC0391Y0) {
                            try {
                                return (EvaluateResult) interfaceC6498l2.invoke(interfaceC6498l3.invoke(value));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y1) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l4.invoke(interfaceC6498l5.invoke(value));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l unaryLongFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$5
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$5.1
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
                                    return (EvaluateResult) interfaceC6498l2.invoke(Long.valueOf(value.m732B()));
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

    public static final InterfaceC6498l unaryStringFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f738x;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$3.1
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
                                    return (EvaluateResult) interfaceC6498l2.invoke(value.m735E());
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

    public static final InterfaceC6498l unaryStringFunctionPrimitive(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f738x;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunctionPrimitive$$inlined$unaryStringFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunctionPrimitive$$inlined$unaryStringFunction$1.1
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
                                    return EvaluateResult.Companion.string((String) interfaceC6498l2.invoke(value.m735E()));
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

    public static final InterfaceC6498l unaryTimestampFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f737w;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$4
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$4.1
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
                                    return (EvaluateResult) interfaceC6498l2.invoke(value.m736F());
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

    public static final InterfaceC6498l unaryValueFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunction$2.1
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
                            if (i2 == -1 || i2 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            InterfaceC6498l interfaceC6498l3 = interfaceC6498l2;
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            return (EvaluateResult) interfaceC6498l3.invoke(value2);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l variadicBooleanFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final InterfaceC6498l interfaceC6498l = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunction$2.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunction$2$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[1] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        boolean[] zArr = new boolean[params.size()];
                        boolean z = false;
                        int i2 = 0;
                        for (Object obj : params) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC6306n.m12122t();
                                throw null;
                            }
                            EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) obj).invoke(input);
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i4 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i4 == -1 || i4 == 1) {
                                z = true;
                            } else {
                                if (i4 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                zArr[i2] = value.m746u();
                            }
                            i2 = i3;
                        }
                        if (z) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l.invoke(zArr);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final <T> InterfaceC6498l variadicFunctionType(final EnumC0391Y0 valueTypeCase, final InterfaceC6498l valueExtractor, final InterfaceC6498l function) {
        AbstractC6452k.m12181e(valueTypeCase, "valueTypeCase");
        AbstractC6452k.m12181e(valueExtractor, "valueExtractor");
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.variadicFunctionType.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final EnumC0391Y0 enumC0391Y0 = valueTypeCase;
                final InterfaceC6498l interfaceC6498l = valueExtractor;
                final InterfaceC6498l interfaceC6498l2 = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.variadicFunctionType.1.1

                    /* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunctionType$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[EnumC0391Y0.values().length];
                            try {
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        ArrayList arrayList = new ArrayList(params.size());
                        Iterator<InterfaceC6498l> it = params.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            EvaluateResult evaluateResult = (EvaluateResult) it.next().invoke(input);
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                z = true;
                            } else {
                                if (enumC0391Y0M737G != enumC0391Y0) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                InterfaceC6498l interfaceC6498l3 = interfaceC6498l;
                                C0393Z0 value2 = evaluateResult.getValue();
                                AbstractC6452k.m12178b(value2);
                                arrayList.add(interfaceC6498l3.invoke(value2));
                            }
                        }
                        if (z) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l2.invoke(arrayList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l variadicNullableValueFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicNullableValueFunction$$inlined$variadicResultFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final InterfaceC6498l interfaceC6498l = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicNullableValueFunction$$inlined$variadicResultFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        List list = params;
                        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input));
                        }
                        try {
                            InterfaceC6498l interfaceC6498l2 = interfaceC6498l;
                            ArrayList arrayList2 = new ArrayList(AbstractC6307o.m12123u(arrayList, 10));
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                C0393Z0 value = ((EvaluateResult) obj).getValue();
                                if (value == null) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                arrayList2.add(value);
                            }
                            return (EvaluateResult) interfaceC6498l2.invoke(arrayList2);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l variadicResultFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.variadicResultFunction.1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final InterfaceC6498l interfaceC6498l = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt.variadicResultFunction.1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        List<InterfaceC6498l> list = params;
                        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input));
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l.invoke(arrayList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l variadicStringFunction(final InterfaceC6498l function) {
        AbstractC6452k.m12181e(function, "function");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f738x;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunction$$inlined$variadicFunctionType$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final InterfaceC6498l interfaceC6498l = function;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$variadicFunction$$inlined$variadicFunctionType$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        ArrayList arrayList = new ArrayList(params.size());
                        Iterator it = params.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input);
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59251.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                z = true;
                            } else {
                                if (enumC0391Y0M737G != enumC0391Y1) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                C0393Z0 value2 = evaluateResult.getValue();
                                AbstractC6452k.m12178b(value2);
                                arrayList.add(value2.m735E());
                            }
                        }
                        if (z) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l.invoke(arrayList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l arithmetic(final InterfaceC6498l intOp, final InterfaceC6498l doubleOp) {
        AbstractC6452k.m12181e(intOp, "intOp");
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f736v;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$unaryFunctionType$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                final InterfaceC6498l interfaceC6498l2 = intOp;
                final InterfaceC6498l interfaceC6498l3 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$unaryFunctionType$1.1
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
                                return (EvaluateResult) interfaceC6498l2.invoke(Long.valueOf(value.m732B()));
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l3.invoke(Double.valueOf(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final InterfaceC6498l arithmeticPrimitive(final InterfaceC6502p intOp, final InterfaceC6502p doubleOp) {
        AbstractC6452k.m12181e(intOp, "intOp");
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmeticPrimitive$$inlined$arithmetic$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = intOp;
                final InterfaceC6502p interfaceC6502p2 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmeticPrimitive$$inlined$arithmetic$1.1
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
                                        return EvaluateResult.Companion.m12333long(((Number) interfaceC6502p.invoke(Long.valueOf(((LongValue) longValue).getValue()), Long.valueOf(((LongValue) longValue2).getValue()))).longValue());
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return EvaluateResult.Companion.m12331double(((Number) interfaceC6502p2.invoke(Double.valueOf(((LongValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()))).doubleValue());
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return EvaluateResult.Companion.m12331double(((Number) interfaceC6502p2.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()))).doubleValue());
                                }
                                if (longValue2 instanceof LongValue) {
                                    return EvaluateResult.Companion.m12331double(((Number) interfaceC6502p2.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((LongValue) longValue2).getValue()))).doubleValue());
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

    public static final InterfaceC6498l unaryFunction(final InterfaceC6498l byteOp, final InterfaceC6498l stringOp) {
        AbstractC6452k.m12181e(byteOp, "byteOp");
        AbstractC6452k.m12181e(stringOp, "stringOp");
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f739y;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f738x;
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                final InterfaceC6498l interfaceC6498l2 = byteOp;
                final InterfaceC6498l interfaceC6498l3 = stringOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunction$$inlined$unaryFunctionType$2.1
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
                                return (EvaluateResult) interfaceC6498l2.invoke(value.m747v());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return (EvaluateResult) interfaceC6498l3.invoke(value.m735E());
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
    }

    public static final <T> InterfaceC6498l unaryFunctionType(final EnumC0391Y0 valueTypeCase, final InterfaceC6498l valueExtractor, final InterfaceC6498l function) {
        AbstractC6452k.m12181e(valueTypeCase, "valueTypeCase");
        AbstractC6452k.m12181e(valueExtractor, "valueExtractor");
        AbstractC6452k.m12181e(function, "function");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunctionType$$inlined$unaryFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y0 = valueTypeCase;
                final InterfaceC6498l interfaceC6498l2 = function;
                final InterfaceC6498l interfaceC6498l3 = valueExtractor;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$unaryFunctionType$$inlined$unaryFunction$1.1
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
                                if (enumC0391Y0M737G != enumC0391Y0) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                try {
                                    return (EvaluateResult) interfaceC6498l2.invoke(interfaceC6498l3.invoke(value));
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

    public static final InterfaceC6498l arithmetic(final InterfaceC6502p intOp, final InterfaceC6502p doubleOp) {
        AbstractC6452k.m12181e(intOp, "intOp");
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$binaryValueValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = intOp;
                final InterfaceC6502p interfaceC6502p2 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$binaryValueValueFunction$1.1
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
                                        return (EvaluateResult) interfaceC6502p.invoke(Long.valueOf(((LongValue) longValue).getValue()), Long.valueOf(((LongValue) longValue2).getValue()));
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return (EvaluateResult) interfaceC6502p2.invoke(Double.valueOf(((LongValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()));
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return (EvaluateResult) interfaceC6502p2.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()));
                                }
                                return longValue2 instanceof LongValue ? (EvaluateResult) interfaceC6502p2.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((LongValue) longValue2).getValue())) : EvaluateResultError.INSTANCE;
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

    public static final InterfaceC6498l arithmetic(final InterfaceC6502p doubleOp) {
        AbstractC6452k.m12181e(doubleOp, "doubleOp");
        return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$arithmetic$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6502p interfaceC6502p = doubleOp;
                final InterfaceC6502p interfaceC6502p2 = doubleOp;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.UtilsKt$arithmetic$$inlined$arithmetic$1.1
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
                                        return (EvaluateResult) interfaceC6502p2.invoke(Double.valueOf(((LongValue) longValue).getValue()), Double.valueOf(((LongValue) longValue2).getValue()));
                                    }
                                    if (longValue2 instanceof DoubleValue) {
                                        return (EvaluateResult) interfaceC6502p.invoke(Double.valueOf(((LongValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()));
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (!(longValue instanceof DoubleValue)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (longValue2 instanceof DoubleValue) {
                                    return (EvaluateResult) interfaceC6502p.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((DoubleValue) longValue2).getValue()));
                                }
                                return longValue2 instanceof LongValue ? (EvaluateResult) interfaceC6502p.invoke(Double.valueOf(((DoubleValue) longValue).getValue()), Double.valueOf(((LongValue) longValue2).getValue())) : EvaluateResultError.INSTANCE;
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
}
