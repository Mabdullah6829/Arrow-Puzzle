package com.google.firebase.firestore.pipeline.evaluation;

import com.google.android.material.button.C5241c;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.InterfaceC6210Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0057q;
import p000A0.C0059r;
import p022N.C0393Z0;
import p022N.C0406e;
import p022N.EnumC0391Y0;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6311s;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayKt {
    private static final InterfaceC6498l evaluateArray;
    private static final InterfaceC6498l evaluateArrayConcat;
    private static final InterfaceC6498l evaluateArrayContains;
    private static final InterfaceC6498l evaluateArrayContainsAll;
    private static final InterfaceC6498l evaluateArrayContainsAny;
    private static final InterfaceC6498l evaluateArrayFirst;
    private static final InterfaceC6498l evaluateArrayFirstN;
    private static final InterfaceC6498l evaluateArrayGet;
    private static final InterfaceC6498l evaluateArrayIndexOf;
    private static final InterfaceC6498l evaluateArrayIndexOfAll;
    private static final InterfaceC6498l evaluateArrayLast;
    private static final InterfaceC6498l evaluateArrayLastN;
    private static final InterfaceC6498l evaluateArrayLength;
    private static final InterfaceC6498l evaluateArrayMaximum;
    private static final InterfaceC6498l evaluateArrayMaximumN;
    private static final InterfaceC6498l evaluateArrayMinimum;
    private static final InterfaceC6498l evaluateArrayMinimumN;
    private static final InterfaceC6498l evaluateArrayReverse;
    private static final InterfaceC6498l evaluateEqAny;
    private static final InterfaceC6498l evaluateJoin;
    private static final InterfaceC6498l evaluateNotEqAny;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Values.Enterprise.CompareResult.values().length];
            try {
                iArr[Values.Enterprise.CompareResult.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Values.Enterprise.CompareResult.GREATER_THAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC0391Y0.values().length];
            try {
                iArr2[5] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[6] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        final EvaluateResult.Companion companion = EvaluateResult.Companion;
        evaluateArray = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$variadicNullableValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final EvaluateResult.Companion companion2 = companion;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$variadicNullableValueFunction$1.1
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
                            return companion2.list(arrayList2);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateEqAny = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryValueArrayFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryValueArrayFunction$1.1
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
                            List valuesList = value2.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return value == null ? EvaluateResult.Companion.getFALSE() : ArrayKt.equalAny(value, valuesList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateNotEqAny = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryValueArrayFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryValueArrayFunction$2.1
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
                            List valuesList = value2.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return value == null ? EvaluateResult.Companion.getFALSE() : ArrayKt.notEqualAny(value, valuesList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateArrayContains = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayValueFunction$1.1
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
                            List valuesList = value.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return value2 == null ? EvaluateResult.Companion.getFALSE() : ArrayKt.equalAny(value2, valuesList);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateArrayContainsAny = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayArrayFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() == 2) {
                    return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayArrayFunction$1.1
                        @Override // p078p0.InterfaceC6498l
                        public final EvaluateResult invoke(MutableDocument input) {
                            List<C0393Z0> valuesList;
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
                            List valuesList2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt$binaryFunction$7.C59041.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                valuesList = null;
                            } else {
                                if (i2 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                valuesList = value.m745t().getValuesList();
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt$binaryFunction$7.C59041.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                valuesList2 = value2.m745t().getValuesList();
                            }
                            if (valuesList == null || valuesList2 == null) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            for (C0393Z0 c0393z0 : valuesList) {
                                Iterator it = valuesList2.iterator();
                                while (it.hasNext()) {
                                    boolean zEquals$com_google_firebase_firebase_firestore = Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore(c0393z0, (C0393Z0) it.next());
                                    if (zEquals$com_google_firebase_firebase_firestore) {
                                        return EvaluateResult.Companion.getTRUE();
                                    }
                                    if (zEquals$com_google_firebase_firebase_firestore) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                            return EvaluateResult.Companion.getFALSE();
                        }
                    };
                }
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
        };
        evaluateArrayContainsAll = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayArrayFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() == 2) {
                    return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$binaryArrayArrayFunction$2.1
                        @Override // p078p0.InterfaceC6498l
                        public final EvaluateResult invoke(MutableDocument input) {
                            List valuesList;
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
                            List<C0393Z0> valuesList2 = null;
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt$binaryFunction$7.C59041.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 == -1 || i2 == 1) {
                                valuesList = null;
                            } else {
                                if (i2 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                valuesList = value.m745t().getValuesList();
                            }
                            EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                            int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt$binaryFunction$7.C59041.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            if (i3 != -1 && i3 != 1) {
                                if (i3 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                valuesList2 = value2.m745t().getValuesList();
                            }
                            if (valuesList == null || valuesList2 == null) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            for (C0393Z0 c0393z0 : valuesList2) {
                                Iterator it = valuesList.iterator();
                                while (it.hasNext()) {
                                    boolean zEquals$com_google_firebase_firebase_firestore = Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore((C0393Z0) it.next(), c0393z0);
                                    if (!zEquals$com_google_firebase_firebase_firestore) {
                                        if (zEquals$com_google_firebase_firebase_firestore) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                }
                                return EvaluateResult.Companion.getFALSE();
                            }
                            return EvaluateResult.Companion.getTRUE();
                        }
                    };
                }
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
        };
        evaluateArrayLength = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$unaryArrayFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$unaryArrayFunction$1.1
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
                            List valuesList = value.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return EvaluateResult.Companion.m12332long(valuesList.size());
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateArrayReverse = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$unaryArrayFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.ArrayKt$special$$inlined$unaryArrayFunction$2.1
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
                            List valuesList = value.m745t().getValuesList();
                            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                            return EvaluateResult.Companion.value(Values.encodeValue(AbstractC6305m.m12109E((InterfaceC6210Z) valuesList)));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateArrayFirst = new C0059r(4);
        evaluateArrayLast = new C0059r(8);
        evaluateArrayFirstN = new C0059r(9);
        evaluateArrayLastN = new C0059r(10);
        evaluateArrayMinimum = new C0059r(11);
        evaluateArrayMaximum = new C0059r(12);
        evaluateArrayMinimumN = new C0059r(13);
        evaluateArrayMaximumN = new C0059r(14);
        evaluateJoin = new C0059r(15);
        evaluateArrayGet = new C0059r(16);
        evaluateArrayConcat = new C0059r(5);
        evaluateArrayIndexOf = new C0059r(6);
        evaluateArrayIndexOfAll = new C0059r(7);
    }

    public static final EvaluateResultValue arrayConcatImpl(List<? extends List<C0393Z0>> arrays) {
        AbstractC6452k.m12181e(arrays, "arrays");
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = arrays.iterator();
        while (it.hasNext()) {
            AbstractC6311s.m12124v((Iterable) it.next(), arrayList);
        }
        return companion.value(Values.encodeValue(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult equalAny(C0393Z0 c0393z0, List<C0393Z0> list) {
        Iterator<C0393Z0> it = list.iterator();
        while (it.hasNext()) {
            boolean zEquals$com_google_firebase_firebase_firestore = Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore(c0393z0, it.next());
            if (zEquals$com_google_firebase_firebase_firestore) {
                return EvaluateResult.Companion.getTRUE();
            }
            if (zEquals$com_google_firebase_firebase_firestore) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EvaluateResult.Companion.getFALSE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayConcat$lambda$34(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayConcat$lambda$34$lambda$33(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() < 2) {
            throw Assert.fail("Function should have at least 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input);
            if (evaluateResult instanceof EvaluateResultValue) {
                EvaluateResultValue evaluateResultValue = (EvaluateResultValue) evaluateResult;
                C0393Z0 value = evaluateResultValue.getValue();
                if (value == null || !value.m738H()) {
                    C0393Z0 value2 = evaluateResultValue.getValue();
                    if (value2 == null || !value2.m742L()) {
                        return EvaluateResultError.INSTANCE;
                    }
                } else {
                    List valuesList = evaluateResultValue.getValue().m745t().getValuesList();
                    AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                    arrayList.add(valuesList);
                }
            } else if (!AbstractC6452k.m12177a(evaluateResult, EvaluateResultUnset.INSTANCE)) {
                EvaluateResultError evaluateResultError = EvaluateResultError.INSTANCE;
                if (AbstractC6452k.m12177a(evaluateResult, evaluateResultError)) {
                    return evaluateResultError;
                }
                throw new NoWhenBranchMatchedException();
            }
            z = true;
        }
        return z ? EvaluateResult.Companion.getNULL() : arrayConcatImpl(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayFirst$lambda$8(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayFirst$lambda$8$lambda$7(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 1) {
            throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        if (valuesList.isEmpty()) {
            return EvaluateResultUnset.INSTANCE;
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        Object objM12116x = AbstractC6305m.m12116x(valuesList);
        AbstractC6452k.m12180d(objM12116x, "first(...)");
        return companion.value((C0393Z0) objM12116x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayFirstN$lambda$12(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayFirstN$lambda$12$lambda$11(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        if (evaluateResult2.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value2 = evaluateResult2.getValue();
        if (value2 == null || !value2.m740J()) {
            return EvaluateResultError.INSTANCE;
        }
        int iM732B = (int) value2.m732B();
        if (iM732B < 0) {
            return EvaluateResultError.INSTANCE;
        }
        int size = valuesList.size();
        if (iM732B > size) {
            iM732B = size;
        }
        return EvaluateResult.Companion.list(valuesList.subList(0, iM732B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayGet$lambda$32(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayGet$lambda$32$lambda$31(List list, MutableDocument input) {
        C0393Z0 value;
        C0406e c0406eM745t;
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        C0393Z0 value2 = evaluateResult.getValue();
        List valuesList = (value2 == null || !value2.m738H() || (value = evaluateResult.getValue()) == null || (c0406eM745t = value.m745t()) == null) ? null : c0406eM745t.getValuesList();
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        C0393Z0 value3 = evaluateResult2.getValue();
        if (value3 == null || !value3.m740J()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value4 = evaluateResult2.getValue();
        Long lValueOf = value4 != null ? Long.valueOf(value4.m732B()) : null;
        if (valuesList == null) {
            return EvaluateResultUnset.INSTANCE;
        }
        AbstractC6452k.m12178b(lValueOf);
        long jLongValue = lValueOf.longValue();
        if (jLongValue >= valuesList.size() || jLongValue < (-valuesList.size())) {
            return EvaluateResultUnset.INSTANCE;
        }
        if (jLongValue < 0) {
            jLongValue += (long) valuesList.size();
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        Object obj = valuesList.get((int) jLongValue);
        AbstractC6452k.m12180d(obj, "get(...)");
        return companion.value((C0393Z0) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayIndexOf$lambda$36(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayIndexOf$lambda$36$lambda$35(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 3) {
            throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        EvaluateResult evaluateResult3 = (EvaluateResult) ((InterfaceC6498l) list.get(2)).invoke(input);
        if (evaluateResult.isError() || evaluateResult2.isError() || evaluateResult3.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value = evaluateResult3.getValue();
        if (value == null || !value.m744N()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value2 = evaluateResult3.getValue();
        String strM735E = value2 != null ? value2.m735E() : null;
        C0393Z0 value3 = evaluateResult.getValue();
        if (value3 == null || Values.isNullValue(value3)) {
            return EvaluateResult.Companion.value(Values.NULL_VALUE);
        }
        if (!value3.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value4 = evaluateResult2.getValue();
        if (value4 == null) {
            return EvaluateResult.Companion.value(Values.NULL_VALUE);
        }
        List valuesList = value3.m745t().getValuesList();
        int i2 = -1;
        if (AbstractC6452k.m12177a(strM735E, "last")) {
            int size = valuesList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore((C0393Z0) valuesList.get(size), value4)) {
                        i2 = size;
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
        } else {
            if (!AbstractC6452k.m12177a(strM735E, "first")) {
                return EvaluateResultError.INSTANCE;
            }
            int size2 = valuesList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                if (Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore((C0393Z0) valuesList.get(i4), value4)) {
                    i2 = i4;
                    break;
                }
            }
        }
        return EvaluateResult.Companion.value(Values.encodeValue(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayIndexOfAll$lambda$38(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayIndexOfAll$lambda$38$lambda$37(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        if (evaluateResult.isError() || evaluateResult2.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value = evaluateResult.getValue();
        if (value == null || Values.isNullValue(value)) {
            return EvaluateResult.Companion.value(Values.NULL_VALUE);
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value2 = evaluateResult2.getValue();
        if (value2 == null) {
            return EvaluateResult.Companion.value(Values.NULL_VALUE);
        }
        List valuesList = value.m745t().getValuesList();
        ArrayList arrayList = new ArrayList();
        int size = valuesList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore((C0393Z0) valuesList.get(i2), value2)) {
                arrayList.add(Values.encodeValue(i2));
            }
        }
        return EvaluateResult.Companion.list(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayLast$lambda$10(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayLast$lambda$10$lambda$9(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 1) {
            throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        if (valuesList.isEmpty()) {
            return EvaluateResultUnset.INSTANCE;
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        Object objM12106B = AbstractC6305m.m12106B(valuesList);
        AbstractC6452k.m12180d(objM12106B, "last(...)");
        return companion.value((C0393Z0) objM12106B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayLastN$lambda$14(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayLastN$lambda$14$lambda$13(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        if (evaluateResult2.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value2 = evaluateResult2.getValue();
        if (value2 == null || !value2.m740J()) {
            return EvaluateResultError.INSTANCE;
        }
        int iM732B = (int) value2.m732B();
        if (iM732B < 0) {
            return EvaluateResultError.INSTANCE;
        }
        int size = valuesList.size();
        if (iM732B > size) {
            iM732B = size;
        }
        return EvaluateResult.Companion.list(valuesList.subList(valuesList.size() - iM732B, valuesList.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayMaximum$lambda$18(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayMaximum$lambda$18$lambda$17(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 1) {
            throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        if (valuesList.isEmpty()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 c0393z0 = (C0393Z0) valuesList.get(0);
        int size = valuesList.size();
        for (int i2 = 1; i2 < size; i2++) {
            if (Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore((C0393Z0) valuesList.get(i2), c0393z0) == Values.Enterprise.CompareResult.GREATER_THAN) {
                c0393z0 = (C0393Z0) valuesList.get(i2);
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        AbstractC6452k.m12178b(c0393z0);
        return companion.value(c0393z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayMaximumN$lambda$26(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayMaximumN$lambda$26$lambda$25(List list, MutableDocument input) {
        C0393Z0 value;
        C0406e c0406eM745t;
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        C0393Z0 value2 = evaluateResult.getValue();
        List valuesList = (value2 == null || !value2.m738H() || (value = evaluateResult.getValue()) == null || (c0406eM745t = value.m745t()) == null) ? null : c0406eM745t.getValuesList();
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        C0393Z0 value3 = evaluateResult2.getValue();
        if (value3 == null || !value3.m740J()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value4 = evaluateResult2.getValue();
        Integer numValueOf = value4 != null ? Integer.valueOf((int) value4.m732B()) : null;
        if (valuesList == null) {
            return EvaluateResultUnset.INSTANCE;
        }
        AbstractC6452k.m12178b(numValueOf);
        if (numValueOf.intValue() < 0) {
            return EvaluateResultError.INSTANCE;
        }
        List listM12110F = AbstractC6305m.m12110F(valuesList, new C5241c(new C0057q(8), 2));
        int iIntValue = numValueOf.intValue();
        int size = listM12110F.size();
        if (iIntValue > size) {
            iIntValue = size;
        }
        return EvaluateResult.Companion.list(listM12110F.subList(0, iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int evaluateArrayMaximumN$lambda$26$lambda$25$lambda$23(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(c0393z0, c0393z1).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int evaluateArrayMaximumN$lambda$26$lambda$25$lambda$24(InterfaceC6502p interfaceC6502p, Object obj, Object obj2) {
        return ((Number) interfaceC6502p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayMinimum$lambda$16(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayMinimum$lambda$16$lambda$15(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 1) {
            throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult.isError()) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult.isUnset()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 value = evaluateResult.getValue();
        AbstractC6452k.m12178b(value);
        if (value.m742L()) {
            return EvaluateResult.Companion.getNULL();
        }
        if (!value.m738H()) {
            return EvaluateResultError.INSTANCE;
        }
        List valuesList = value.m745t().getValuesList();
        if (valuesList.isEmpty()) {
            return EvaluateResult.Companion.getNULL();
        }
        C0393Z0 c0393z0 = (C0393Z0) valuesList.get(0);
        int size = valuesList.size();
        for (int i2 = 1; i2 < size; i2++) {
            if (Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore((C0393Z0) valuesList.get(i2), c0393z0) == Values.Enterprise.CompareResult.LESS_THAN) {
                c0393z0 = (C0393Z0) valuesList.get(i2);
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        AbstractC6452k.m12178b(c0393z0);
        return companion.value(c0393z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateArrayMinimumN$lambda$22(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateArrayMinimumN$lambda$22$lambda$21(List list, MutableDocument input) {
        C0393Z0 value;
        C0406e c0406eM745t;
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        C0393Z0 value2 = evaluateResult.getValue();
        List valuesList = (value2 == null || !value2.m738H() || (value = evaluateResult.getValue()) == null || (c0406eM745t = value.m745t()) == null) ? null : c0406eM745t.getValuesList();
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        C0393Z0 value3 = evaluateResult2.getValue();
        if (value3 == null || !value3.m740J()) {
            return EvaluateResultError.INSTANCE;
        }
        C0393Z0 value4 = evaluateResult2.getValue();
        Integer numValueOf = value4 != null ? Integer.valueOf((int) value4.m732B()) : null;
        if (valuesList == null) {
            return EvaluateResultUnset.INSTANCE;
        }
        AbstractC6452k.m12178b(numValueOf);
        if (numValueOf.intValue() < 0) {
            return EvaluateResultError.INSTANCE;
        }
        List listM12110F = AbstractC6305m.m12110F(valuesList, new C5241c(new C0057q(7), 1));
        int iIntValue = numValueOf.intValue();
        int size = listM12110F.size();
        if (iIntValue > size) {
            iIntValue = size;
        }
        return EvaluateResult.Companion.list(listM12110F.subList(0, iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int evaluateArrayMinimumN$lambda$22$lambda$21$lambda$19(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[Values.Enterprise.INSTANCE.strictCompare$com_google_firebase_firebase_firestore(c0393z0, c0393z1).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int evaluateArrayMinimumN$lambda$22$lambda$21$lambda$20(InterfaceC6502p interfaceC6502p, Object obj, Object obj2) {
        return ((Number) interfaceC6502p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateJoin$lambda$28(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateJoin$lambda$28$lambda$27(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        if (list.size() != 2) {
            throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        boolean z = false;
        EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) list.get(0)).invoke(input);
        if (evaluateResult instanceof EvaluateResultError) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult instanceof EvaluateResultUnset) {
            return EvaluateResultError.INSTANCE;
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        if (AbstractC6452k.m12177a(evaluateResult, companion.getNULL())) {
            z = true;
        } else {
            C0393Z0 value = evaluateResult.getValue();
            if ((value != null ? value.m737G() : null) != EnumC0391Y0.f725B) {
                return EvaluateResultError.INSTANCE;
            }
        }
        EvaluateResult evaluateResult2 = (EvaluateResult) ((InterfaceC6498l) list.get(1)).invoke(input);
        if (evaluateResult2 instanceof EvaluateResultError) {
            return EvaluateResultError.INSTANCE;
        }
        if (evaluateResult2 instanceof EvaluateResultUnset) {
            return EvaluateResultError.INSTANCE;
        }
        if (AbstractC6452k.m12177a(evaluateResult2, companion.getNULL())) {
            return companion.getNULL();
        }
        C0393Z0 value2 = evaluateResult2.getValue();
        EnumC0391Y0 enumC0391Y0M737G = value2 != null ? value2.m737G() : null;
        int i2 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$1[enumC0391Y0M737G.ordinal()];
        if (i2 == 1) {
            if (z) {
                return companion.getNULL();
            }
            C0393Z0 value3 = evaluateResult.getValue();
            C0406e c0406eM745t = value3 != null ? value3.m745t() : null;
            AbstractC6452k.m12178b(c0406eM745t);
            List valuesList = c0406eM745t.getValuesList();
            AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
            C0393Z0 value4 = evaluateResult2.getValue();
            String strM735E = value4 != null ? value4.m735E() : null;
            AbstractC6452k.m12178b(strM735E);
            return joinStrings(valuesList, strM735E);
        }
        if (i2 != 2) {
            return EvaluateResultError.INSTANCE;
        }
        if (z) {
            return companion.getNULL();
        }
        C0393Z0 value5 = evaluateResult.getValue();
        C0406e c0406eM745t2 = value5 != null ? value5.m745t() : null;
        AbstractC6452k.m12178b(c0406eM745t2);
        List valuesList2 = c0406eM745t2.getValuesList();
        AbstractC6452k.m12180d(valuesList2, "getValuesList(...)");
        C0393Z0 value6 = evaluateResult2.getValue();
        AbstractC6251n abstractC6251nM747v = value6 != null ? value6.m747v() : null;
        AbstractC6452k.m12178b(abstractC6251nM747v);
        return joinBytes(valuesList2, abstractC6251nM747v);
    }

    public static final InterfaceC6498l getEvaluateArray() {
        return evaluateArray;
    }

    public static final InterfaceC6498l getEvaluateArrayConcat() {
        return evaluateArrayConcat;
    }

    public static final InterfaceC6498l getEvaluateArrayContains() {
        return evaluateArrayContains;
    }

    public static final InterfaceC6498l getEvaluateArrayContainsAll() {
        return evaluateArrayContainsAll;
    }

    public static final InterfaceC6498l getEvaluateArrayContainsAny() {
        return evaluateArrayContainsAny;
    }

    public static final InterfaceC6498l getEvaluateArrayFirst() {
        return evaluateArrayFirst;
    }

    public static final InterfaceC6498l getEvaluateArrayFirstN() {
        return evaluateArrayFirstN;
    }

    public static final InterfaceC6498l getEvaluateArrayGet() {
        return evaluateArrayGet;
    }

    public static final InterfaceC6498l getEvaluateArrayIndexOf() {
        return evaluateArrayIndexOf;
    }

    public static final InterfaceC6498l getEvaluateArrayIndexOfAll() {
        return evaluateArrayIndexOfAll;
    }

    public static final InterfaceC6498l getEvaluateArrayLast() {
        return evaluateArrayLast;
    }

    public static final InterfaceC6498l getEvaluateArrayLastN() {
        return evaluateArrayLastN;
    }

    public static final InterfaceC6498l getEvaluateArrayLength() {
        return evaluateArrayLength;
    }

    public static final InterfaceC6498l getEvaluateArrayMaximum() {
        return evaluateArrayMaximum;
    }

    public static final InterfaceC6498l getEvaluateArrayMaximumN() {
        return evaluateArrayMaximumN;
    }

    public static final InterfaceC6498l getEvaluateArrayMinimum() {
        return evaluateArrayMinimum;
    }

    public static final InterfaceC6498l getEvaluateArrayMinimumN() {
        return evaluateArrayMinimumN;
    }

    public static final InterfaceC6498l getEvaluateArrayReverse() {
        return evaluateArrayReverse;
    }

    public static final InterfaceC6498l getEvaluateEqAny() {
        return evaluateEqAny;
    }

    public static final InterfaceC6498l getEvaluateJoin() {
        return evaluateJoin;
    }

    public static final InterfaceC6498l getEvaluateNotEqAny() {
        return evaluateNotEqAny;
    }

    private static final EvaluateResult joinBytes(List<C0393Z0> list, AbstractC6251n abstractC6251n) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = true;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            EnumC0391Y0 enumC0391Y0M737G = list.get(i3).m737G();
            int i4 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$1[enumC0391Y0M737G.ordinal()];
            if (i4 == 2) {
                if (!z) {
                    Iterator it = abstractC6251n.iterator();
                    while (it.hasNext()) {
                        Byte b = (Byte) it.next();
                        AbstractC6452k.m12178b(b);
                        arrayList.add(b);
                    }
                }
                AbstractC6251n<Byte> abstractC6251nM747v = list.get(i3).m747v();
                AbstractC6452k.m12180d(abstractC6251nM747v, "getBytesValue(...)");
                for (Byte b2 : abstractC6251nM747v) {
                    AbstractC6452k.m12178b(b2);
                    arrayList.add(b2);
                }
                z = false;
            } else if (i4 != 3) {
                return EvaluateResultError.INSTANCE;
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        byte[] bArr = new byte[arrayList.size()];
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj = arrayList.get(i5);
            i5++;
            bArr[i2] = ((Number) obj).byteValue();
            i2++;
        }
        return companion.value(Values.encodeValue(bArr));
    }

    private static final EvaluateResult joinStrings(List<C0393Z0> list, String str) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            C0393Z0 c0393z0 = list.get(i2);
            EnumC0391Y0 enumC0391Y0M737G = c0393z0.m737G();
            int i3 = enumC0391Y0M737G == null ? -1 : WhenMappings.$EnumSwitchMapping$1[enumC0391Y0M737G.ordinal()];
            if (i3 == 1) {
                if (!z) {
                    sb.append(str);
                }
                sb.append(c0393z0.m735E());
                z = false;
            } else if (i3 != 3) {
                return EvaluateResultError.INSTANCE;
            }
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return companion.string(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult notEqualAny(C0393Z0 c0393z0, List<C0393Z0> list) {
        Iterator<C0393Z0> it = list.iterator();
        while (it.hasNext()) {
            boolean zEquals$com_google_firebase_firebase_firestore = Values.Enterprise.INSTANCE.equals$com_google_firebase_firebase_firestore(c0393z0, it.next());
            if (zEquals$com_google_firebase_firebase_firestore) {
                return EvaluateResult.Companion.getFALSE();
            }
            if (zEquals$com_google_firebase_firebase_firestore) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EvaluateResult.Companion.getTRUE();
    }
}
