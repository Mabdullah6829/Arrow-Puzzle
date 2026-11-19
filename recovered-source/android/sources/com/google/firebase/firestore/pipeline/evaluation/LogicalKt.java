package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class LogicalKt {
    private static final InterfaceC6498l evaluateIsNaN;
    private static final InterfaceC6498l evaluateIsNotNaN;
    private static final InterfaceC6498l evaluateIsNotNull;
    private static final InterfaceC6498l evaluateIsNull;
    private static final InterfaceC6498l evaluateAnd = new C0059r(20);
    private static final InterfaceC6498l evaluateOr = new C0059r(21);
    private static final InterfaceC6498l evaluateXor = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicBooleanFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicBooleanFunction$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    int size = params.size();
                    boolean[] zArr = new boolean[size];
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
                        int i4 = enumC0391Y0M737G == null ? -1 : UtilsKt$variadicFunction$2.C59241.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
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
                        EvaluateResult.Companion companion = EvaluateResult.Companion;
                        Boolean boolValueOf = Boolean.FALSE;
                        for (int i5 = 0; i5 < size; i5++) {
                            boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() ^ zArr[i5]);
                        }
                        return companion.m12330boolean(boolValueOf.booleanValue());
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateCond = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$ternaryLazyFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 3) {
                throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            final InterfaceC6498l interfaceC6498l3 = params.get(2);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$ternaryLazyFunction$1.1
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(final MutableDocument input) {
                    AbstractC6452k.m12181e(input, "input");
                    final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                    final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                    final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                    try {
                        InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$.inlined.ternaryLazyFunction.1.1.1
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l4.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$.inlined.ternaryLazyFunction.1.1.2
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l5.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$.inlined.ternaryLazyFunction.1.1.3
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l6.invoke(input);
                            }
                        };
                        EvaluateResult evaluateResult = (EvaluateResult) interfaceC6487a.invoke();
                        if (evaluateResult.isError()) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 value = evaluateResult.getValue();
                        EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                        int i2 = enumC0391Y0M737G == null ? -1 : LogicalKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            return (EvaluateResult) interfaceC6487a3.invoke();
                        }
                        if (i2 != 2) {
                            return EvaluateResultError.INSTANCE;
                        }
                        return (EvaluateResult) (value.m746u() ? interfaceC6487a2.invoke() : interfaceC6487a3.invoke());
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateLogicalMaximum = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicResultFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicResultFunction$1.1
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
                        if (arrayList.size() < 2) {
                            return EvaluateResultError.INSTANCE;
                        }
                        LogicalKt$evaluateLogicalMaximum$1$maximum$1 logicalKt$evaluateLogicalMaximum$1$maximum$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$evaluateLogicalMaximum$1$maximum$1
                            @Override // p078p0.InterfaceC6502p
                            public final C0393Z0 invoke(C0393Z0 c0393z0, C0393Z0 b) {
                                int iIntValue;
                                AbstractC6452k.m12181e(b, "b");
                                return (c0393z0 != null && ((iIntValue = ((Number) ((InterfaceC6502p) Values.Enterprise.INSTANCE.getCompare$com_google_firebase_firebase_firestore()).invoke(c0393z0, b)).intValue()) == 0 || iIntValue > 0)) ? c0393z0 : b;
                            }
                        };
                        int size = arrayList.size();
                        int i2 = 0;
                        C0393Z0 c0393z0 = null;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            EvaluateResult evaluateResult = (EvaluateResult) obj;
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i3 = enumC0391Y0M737G == null ? -1 : LogicalKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                c0393z0 = (C0393Z0) logicalKt$evaluateLogicalMaximum$1$maximum$1.invoke((Object) c0393z0, (Object) value);
                            }
                        }
                        return c0393z0 == null ? EvaluateResult.Companion.getNULL() : EvaluateResult.Companion.value(c0393z0);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateLogicalMinimum = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicResultFunction$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$variadicResultFunction$2.1
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
                        if (arrayList.size() < 2) {
                            return EvaluateResultError.INSTANCE;
                        }
                        LogicalKt$evaluateLogicalMinimum$1$minimum$1 logicalKt$evaluateLogicalMinimum$1$minimum$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$evaluateLogicalMinimum$1$minimum$1
                            @Override // p078p0.InterfaceC6502p
                            public final C0393Z0 invoke(C0393Z0 c0393z0, C0393Z0 b) {
                                int iIntValue;
                                AbstractC6452k.m12181e(b, "b");
                                return (c0393z0 != null && ((iIntValue = ((Number) ((InterfaceC6502p) Values.Enterprise.INSTANCE.getCompare$com_google_firebase_firebase_firestore()).invoke(c0393z0, b)).intValue()) == 0 || iIntValue <= 0)) ? c0393z0 : b;
                            }
                        };
                        int size = arrayList.size();
                        int i2 = 0;
                        C0393Z0 c0393z0 = null;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            EvaluateResult evaluateResult = (EvaluateResult) obj;
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i3 = enumC0391Y0M737G == null ? -1 : LogicalKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                c0393z0 = (C0393Z0) logicalKt$evaluateLogicalMinimum$1$minimum$1.invoke((Object) c0393z0, (Object) value);
                            }
                        }
                        return c0393z0 == null ? EvaluateResult.Companion.getNULL() : EvaluateResult.Companion.value(c0393z0);
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

    static {
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f735u;
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f736v;
        evaluateIsNaN = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$arithmetic$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$arithmetic$1.1
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
                                value.m732B();
                                return EvaluateResult.Companion.getFALSE();
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return EvaluateResult.Companion.m12330boolean(Double.isNaN(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateIsNotNaN = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$arithmetic$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.LogicalKt$special$$inlined$arithmetic$2.1
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
                                value.m732B();
                                return EvaluateResult.Companion.getTRUE();
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            return EvaluateResult.Companion.m12330boolean(!Double.isNaN(value.m748x()));
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateIsNull = new C0059r(22);
        evaluateIsNotNull = new C0059r(23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateAnd$lambda$1(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateAnd$lambda$1$lambda$0(List<? extends InterfaceC6498l> list, MutableDocument mutableDocument) {
        Iterator<? extends InterfaceC6498l> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            EvaluateResult evaluateResult = (EvaluateResult) it.next().invoke(mutableDocument);
            if (evaluateResult.isError()) {
                return EvaluateResultError.INSTANCE;
            }
            C0393Z0 value = evaluateResult.getValue();
            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
            int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
            if (i2 == -1 || i2 == 1) {
                z = true;
            } else {
                if (i2 != 2) {
                    return EvaluateResultError.INSTANCE;
                }
                if (!value.m746u()) {
                    return EvaluateResult.Companion.getFALSE();
                }
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        return z ? companion.getNULL() : companion.getTRUE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateIsNotNull$lambda$15(List params) {
        AbstractC6452k.m12181e(params, "params");
        if (params.size() != 1) {
            throw Assert.fail("IsNotNull function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
        return new C5933b(0, (InterfaceC6498l) params.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateIsNotNull$lambda$15$lambda$14(InterfaceC6498l interfaceC6498l, MutableDocument mutableDocument) {
        C0393Z0 value = ((EvaluateResult) interfaceC6498l.invoke(mutableDocument)).getValue();
        return value == null ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12330boolean(!value.m742L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateIsNull$lambda$13(List params) {
        AbstractC6452k.m12181e(params, "params");
        if (params.size() != 1) {
            throw Assert.fail("IsNull function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
        }
        return new C5933b(1, (InterfaceC6498l) params.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateIsNull$lambda$13$lambda$12(InterfaceC6498l interfaceC6498l, MutableDocument mutableDocument) {
        C0393Z0 value = ((EvaluateResult) interfaceC6498l.invoke(mutableDocument)).getValue();
        return value == null ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12330boolean(value.m742L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateOr$lambda$3(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateOr$lambda$3$lambda$2(List<? extends InterfaceC6498l> list, MutableDocument mutableDocument) {
        Iterator<? extends InterfaceC6498l> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            EvaluateResult evaluateResult = (EvaluateResult) it.next().invoke(mutableDocument);
            if (evaluateResult.isError()) {
                return EvaluateResultError.INSTANCE;
            }
            C0393Z0 value = evaluateResult.getValue();
            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
            int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
            if (i2 == -1 || i2 == 1) {
                z = true;
            } else {
                if (i2 != 2) {
                    return EvaluateResultError.INSTANCE;
                }
                if (value.m746u()) {
                    return EvaluateResult.Companion.getTRUE();
                }
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        return z ? companion.getNULL() : companion.getFALSE();
    }

    public static final InterfaceC6498l getEvaluateAnd() {
        return evaluateAnd;
    }

    public static final InterfaceC6498l getEvaluateCond() {
        return evaluateCond;
    }

    public static final InterfaceC6498l getEvaluateIsNaN() {
        return evaluateIsNaN;
    }

    public static final InterfaceC6498l getEvaluateIsNotNaN() {
        return evaluateIsNotNaN;
    }

    public static final InterfaceC6498l getEvaluateIsNotNull() {
        return evaluateIsNotNull;
    }

    public static final InterfaceC6498l getEvaluateIsNull() {
        return evaluateIsNull;
    }

    public static final InterfaceC6498l getEvaluateLogicalMaximum() {
        return evaluateLogicalMaximum;
    }

    public static final InterfaceC6498l getEvaluateLogicalMinimum() {
        return evaluateLogicalMinimum;
    }

    public static final InterfaceC6498l getEvaluateOr() {
        return evaluateOr;
    }

    public static final InterfaceC6498l getEvaluateXor() {
        return evaluateXor;
    }
}
