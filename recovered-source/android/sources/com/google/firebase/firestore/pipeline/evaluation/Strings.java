package com.google.firebase.firestore.pipeline.evaluation;

import android.icu.lang.UCharacter;
import com.google.firebase.firestore.Blob;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.RegexUtils;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.InterfaceC6210Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0080f;
import p003C.AbstractC0116g;
import p003C.C0112c;
import p003C.C0129t;
import p022N.AbstractC0355G;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p024O.C0461d;
import p024O.C0467j;
import p024O.C0470m;
import p024O.C0472o;
import p058e0.AbstractC6305m;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p091y0.AbstractC6571a;
import p091y0.AbstractC6574d;
import p091y0.AbstractC6582l;

/* JADX INFO: loaded from: classes2.dex */
public final class Strings {
    private static final InterfaceC6498l evaluateByteLength;
    private static final InterfaceC6498l evaluateCharLength;
    private static final InterfaceC6498l evaluateEndsWith;
    private static final InterfaceC6498l evaluateLike;
    private static final InterfaceC6498l evaluateRegexContains;
    private static final InterfaceC6498l evaluateRegexFind;
    private static final InterfaceC6498l evaluateRegexFindAll;
    private static final InterfaceC6498l evaluateRegexMatch;
    private static final InterfaceC6498l evaluateReverse;
    private static final InterfaceC6498l evaluateSplit;
    private static final InterfaceC6498l evaluateStartsWith;
    private static final InterfaceC6498l evaluateStrConcat;
    private static final InterfaceC6498l evaluateStrContains;
    private static final InterfaceC6498l evaluateStringReverse;
    private static final InterfaceC6498l evaluateSubstring;
    private static final InterfaceC6498l evaluateToLowercase;
    private static final InterfaceC6498l evaluateToUppercase;
    private static final InterfaceC6498l evaluateTrim;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0391Y0.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[9] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f738x;
        evaluateStrConcat = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$variadicStringFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$variadicStringFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        ArrayList arrayList = new ArrayList(params.size());
                        Iterator it = params.iterator();
                        int i2 = 0;
                        boolean z = false;
                        while (it.hasNext()) {
                            EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input);
                            if (evaluateResult.isError()) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = evaluateResult.getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59251.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
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
                            EvaluateResult.Companion companion = EvaluateResult.Companion;
                            StringBuilder sb = new StringBuilder();
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                sb.append((String) obj);
                            }
                            String string = sb.toString();
                            AbstractC6452k.m12180d(string, "toString(...)");
                            return companion.string(string);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateStrContains = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$1.1
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
                            return EvaluateResult.Companion.m12330boolean(AbstractC6574d.m12226v(value.m735E(), value2.m735E()));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateStartsWith = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$2.1
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
                            return EvaluateResult.Companion.m12330boolean(AbstractC6582l.m12236u(value.m735E(), value2.m735E()));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateEndsWith = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(final List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryStringStringFunction$3.1
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
                            return EvaluateResult.Companion.m12330boolean(AbstractC6582l.m12233r(value.m735E(), value2.m735E(), false));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f739y;
        evaluateByteLength = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y1;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryFunction$1.1
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
                                return EvaluateResult.Companion.m12332long(value.m747v().size());
                            } catch (Exception unused) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                        if (enumC0391Y0M737G != enumC0391Y3) {
                            return EvaluateResultError.INSTANCE;
                        }
                        try {
                            String strM735E = value.m735E();
                            EvaluateResult.Companion companion = EvaluateResult.Companion;
                            byte[] bytes = strM735E.getBytes(AbstractC6571a.f24799a);
                            AbstractC6452k.m12180d(bytes, "getBytes(...)");
                            return companion.m12332long(bytes.length);
                        } catch (Exception unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateCharLength = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryStringFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryStringFunction$1.1
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
                                if (enumC0391Y0M737G != enumC0391Y2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                try {
                                    String strM735E = value.m735E();
                                    return EvaluateResult.Companion.m12332long(strM735E.codePointCount(0, strM735E.length()));
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
        evaluateToLowercase = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$1.1
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
                            int i2 = -1;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            EnumC0391Y0 enumC0391Y0M737G2 = value2.m737G();
                            if (enumC0391Y0M737G2 != null) {
                                i2 = Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            }
                            if (i2 == 1) {
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                String strM735E = value2.m735E();
                                AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                                String lowerCase = strM735E.toLowerCase(Locale.ROOT);
                                AbstractC6452k.m12180d(lowerCase, "toLowerCase(...)");
                                return companion.string(lowerCase);
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            byte[] bArrM11897w = value2.m747v().m11897w();
                            AbstractC6452k.m12180d(bArrM11897w, "toByteArray(...)");
                            int length = bArrM11897w.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                bArrM11897w[i4] = Strings.isUpperCaseImpl(bArrM11897w[i4]) ? (byte) Strings.toLowerCaseImpl(bArrM11897w[i4]) : bArrM11897w[i4];
                            }
                            return EvaluateResult.Companion.value(Values.encodeValue(bArrM11897w));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateToUppercase = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$2.1
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
                            int i2 = -1;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            EnumC0391Y0 enumC0391Y0M737G2 = value2.m737G();
                            if (enumC0391Y0M737G2 != null) {
                                i2 = Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            }
                            if (i2 == 1) {
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                String strM735E = value2.m735E();
                                AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                                String upperCase = strM735E.toUpperCase(Locale.ROOT);
                                AbstractC6452k.m12180d(upperCase, "toUpperCase(...)");
                                return companion.string(upperCase);
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            byte[] bArrM11897w = value2.m747v().m11897w();
                            AbstractC6452k.m12180d(bArrM11897w, "toByteArray(...)");
                            int length = bArrM11897w.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                bArrM11897w[i4] = Strings.isLowerCaseImpl(bArrM11897w[i4]) ? (byte) Strings.toUpperCaseImpl(bArrM11897w[i4]) : bArrM11897w[i4];
                            }
                            return EvaluateResult.Companion.value(Values.encodeValue(bArrM11897w));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateReverse = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$3.1
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
                            int i2 = -1;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            EnumC0391Y0 enumC0391Y0M737G2 = value2.m737G();
                            if (enumC0391Y0M737G2 != null) {
                                i2 = Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            }
                            if (i2 == 1) {
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                String strM735E = value2.m735E();
                                AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                                return companion.string(Strings.stringReverse(strM735E));
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                EvaluateResult.Companion companion2 = EvaluateResult.Companion;
                                List valuesList = value2.m745t().getValuesList();
                                AbstractC6452k.m12180d(valuesList, "getValuesList(...)");
                                return companion2.value(Values.encodeValue(AbstractC6305m.m12109E((InterfaceC6210Z) valuesList)));
                            }
                            EvaluateResult.Companion companion3 = EvaluateResult.Companion;
                            AbstractC6251n abstractC6251nM747v = value2.m747v();
                            AbstractC6452k.m12180d(abstractC6251nM747v, "getBytesValue(...)");
                            Blob blobFromBytes = Blob.fromBytes(Strings.bytesReverse(abstractC6251nM747v));
                            AbstractC6452k.m12180d(blobFromBytes, "fromBytes(...)");
                            return companion3.value(Values.encodeValue(blobFromBytes));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateStringReverse = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$4
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$4.1
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
                            int i2 = -1;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            EnumC0391Y0 enumC0391Y0M737G2 = value2.m737G();
                            if (enumC0391Y0M737G2 != null) {
                                i2 = Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            }
                            if (i2 == 1) {
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                String strM735E = value2.m735E();
                                AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                                return companion.string(Strings.stringReverse(strM735E));
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            EvaluateResult.Companion companion2 = EvaluateResult.Companion;
                            AbstractC6251n abstractC6251nM747v = value2.m747v();
                            AbstractC6452k.m12180d(abstractC6251nM747v, "getBytesValue(...)");
                            Blob blobFromBytes = Blob.fromBytes(Strings.bytesReverse(abstractC6251nM747v));
                            AbstractC6452k.m12180d(blobFromBytes, "fromBytes(...)");
                            return companion2.value(Values.encodeValue(blobFromBytes));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateSplit = UtilsKt.getNotImplemented();
        evaluateSubstring = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$ternaryLazyFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 3) {
                    throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final InterfaceC6498l interfaceC6498l3 = params.get(2);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$ternaryLazyFunction$1.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(final MutableDocument input) {
                        AbstractC6452k.m12181e(input, "input");
                        final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                        final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                        final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                        try {
                            InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$.inlined.ternaryLazyFunction.1.1.1
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l4.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$.inlined.ternaryLazyFunction.1.1.2
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l5.invoke(input);
                                }
                            };
                            InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$.inlined.ternaryLazyFunction.1.1.3
                                @Override // p078p0.InterfaceC6487a
                                public final EvaluateResult invoke() {
                                    return (EvaluateResult) interfaceC6498l6.invoke(input);
                                }
                            };
                            Long integerOrElse = Strings.getIntegerOrElse((EvaluateResult) interfaceC6487a2.invoke());
                            if (integerOrElse == null) {
                                return EvaluateResultError.INSTANCE;
                            }
                            long jLongValue = integerOrElse.longValue();
                            Long integerOrElse2 = Strings.getIntegerOrElse((EvaluateResult) interfaceC6487a3.invoke());
                            if (integerOrElse2 == null) {
                                return EvaluateResultError.INSTANCE;
                            }
                            long jLongValue2 = integerOrElse2.longValue();
                            if (jLongValue2 < 0) {
                                return EvaluateResultError.INSTANCE;
                            }
                            C0393Z0 value = ((EvaluateResult) interfaceC6487a.invoke()).getValue();
                            EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                            int i2 = enumC0391Y0M737G == null ? -1 : Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    return EvaluateResultError.INSTANCE;
                                }
                                AbstractC6251n abstractC6251nM747v = value.m747v();
                                int size = abstractC6251nM747v.size();
                                int i3 = size - 1;
                                if (jLongValue < 0) {
                                    jLongValue = Math.max(0L, ((long) i3) + jLongValue + 1);
                                }
                                if (i3 < jLongValue) {
                                    return EvaluateResult.Companion.value(Values.encodeValue(new byte[0]));
                                }
                                int iMin = Math.min(Integer.MAX_VALUE, Math.min(AbstractC0355G.m559m(((long) AbstractC0355G.m559m(jLongValue)) + ((long) AbstractC0355G.m559m(jLongValue2))), size));
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                Blob blobFromByteString = Blob.fromByteString(abstractC6251nM747v.mo11728v((int) jLongValue, iMin));
                                AbstractC6452k.m12180d(blobFromByteString, "fromByteString(...)");
                                return companion.value(Values.encodeValue(blobFromByteString));
                            }
                            String strM735E = value.m735E();
                            if (jLongValue < 0) {
                                AbstractC6452k.m12178b(strM735E);
                                jLongValue = Math.max(0L, ((long) strM735E.codePointCount(0, strM735E.length())) + jLongValue);
                            }
                            AbstractC6452k.m12178b(strM735E);
                            if (jLongValue >= strM735E.codePointCount(0, strM735E.length())) {
                                return EvaluateResult.Companion.string("");
                            }
                            StringBuilder sb = new StringBuilder();
                            int iOffsetByCodePoints = strM735E.offsetByCodePoints(0, (int) Math.min(jLongValue, 2147483647L));
                            for (long j2 = 0; j2 < jLongValue2; j2++) {
                                if (iOffsetByCodePoints >= strM735E.length()) {
                                    EvaluateResult.Companion companion2 = EvaluateResult.Companion;
                                    String string = sb.toString();
                                    AbstractC6452k.m12180d(string, "toString(...)");
                                    return companion2.string(string);
                                }
                                sb.append(Character.toChars(strM735E.codePointAt(iOffsetByCodePoints)));
                                iOffsetByCodePoints = strM735E.offsetByCodePoints(iOffsetByCodePoints, 1);
                            }
                            EvaluateResult.Companion companion3 = EvaluateResult.Companion;
                            String string2 = sb.toString();
                            AbstractC6452k.m12180d(string2, "toString(...)");
                            return companion3.string(string2);
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateTrim = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$5
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$unaryValueFunction$5.1
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
                            int i2 = -1;
                            int i3 = enumC0391Y0M737G == null ? -1 : UtilsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                return EvaluateResult.Companion.getNULL();
                            }
                            C0393Z0 value2 = evaluateResult.getValue();
                            AbstractC6452k.m12178b(value2);
                            EnumC0391Y0 enumC0391Y0M737G2 = value2.m737G();
                            if (enumC0391Y0M737G2 != null) {
                                i2 = Strings.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                            }
                            int i4 = 0;
                            if (i2 == 1) {
                                EvaluateResult.Companion companion = EvaluateResult.Companion;
                                C0080f c0080f = C0080f.f106c;
                                String strM735E = value2.m735E();
                                c0080f.getClass();
                                int length = strM735E.length();
                                while (i4 < length && c0080f.mo145q(strM735E.charAt(i4))) {
                                    i4++;
                                }
                                int i5 = length - 1;
                                while (i5 > i4 && c0080f.mo145q(strM735E.charAt(i5))) {
                                    i5--;
                                }
                                String string = strM735E.subSequence(i4, i5 + 1).toString();
                                AbstractC6452k.m12180d(string, "trimFrom(...)");
                                return companion.string(string);
                            }
                            if (i2 != 2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            AbstractC6251n abstractC6251nM747v = value2.m747v();
                            while (i4 < abstractC6251nM747v.size() && Character.isWhitespace(abstractC6251nM747v.mo11719d(i4))) {
                                i4++;
                            }
                            int size = abstractC6251nM747v.size() - 1;
                            while (size >= i4 && Character.isWhitespace(abstractC6251nM747v.mo11719d(size))) {
                                size--;
                            }
                            if (i4 > size) {
                                EvaluateResult.Companion companion2 = EvaluateResult.Companion;
                                byte[] bArrM11897w = AbstractC6251n.f24219t.m11897w();
                                AbstractC6452k.m12180d(bArrM11897w, "toByteArray(...)");
                                return companion2.value(Values.encodeValue(bArrM11897w));
                            }
                            EvaluateResult.Companion companion3 = EvaluateResult.Companion;
                            byte[] bArrM11897w2 = abstractC6251nM747v.mo11728v(i4, size + 1).m11897w();
                            AbstractC6452k.m12180d(bArrM11897w2, "toByteArray(...)");
                            return companion3.value(Values.encodeValue(bArrM11897w2));
                        } catch (Exception unused) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
            }
        };
        evaluateRegexContains = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final Strings$evaluateRegexContains$3$1 strings$evaluateRegexContains$3$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$evaluateRegexContains$3$1
                    @Override // p078p0.InterfaceC6502p
                    public final EvaluateResult invoke(String value, String patternString) {
                        C0470m c0470mM1029a;
                        AbstractC6452k.m12181e(value, "value");
                        AbstractC6452k.m12181e(patternString, "patternString");
                        try {
                            c0470mM1029a = C0470m.m1029a(patternString);
                        } catch (Exception unused) {
                            c0470mM1029a = null;
                        }
                        if (c0470mM1029a == null) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0472o c0472o = c0470mM1029a.f833t;
                        EvaluateResult.Companion companion = EvaluateResult.Companion;
                        int[] iArr = new int[(c0472o.f841d * 2) + 2];
                        C0461d c0461d = new C0461d();
                        c0461d.f793a = value;
                        return companion.m12330boolean(c0472o.m1033a(c0461d, 0, value.length(), 0, iArr, 1));
                    }
                };
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$1.1
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
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) strings$evaluateRegexContains$3$1.invoke(value.m735E(), value3.m735E());
                    }
                };
            }
        };
        evaluateRegexMatch = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final Strings$evaluateRegexMatch$3$1 strings$evaluateRegexMatch$3$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$evaluateRegexMatch$3$1
                    @Override // p078p0.InterfaceC6502p
                    public final EvaluateResult invoke(String value, String patternString) {
                        C0470m c0470mM1029a;
                        AbstractC6452k.m12181e(value, "value");
                        AbstractC6452k.m12181e(patternString, "patternString");
                        try {
                            c0470mM1029a = C0470m.m1029a(patternString);
                        } catch (Exception unused) {
                            c0470mM1029a = null;
                        }
                        return c0470mM1029a == null ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12330boolean(c0470mM1029a.m1030b(value));
                    }
                };
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$2.1
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
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) strings$evaluateRegexMatch$3$1.invoke(value.m735E(), value3.m735E());
                    }
                };
            }
        };
        evaluateRegexFind = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final Strings$evaluateRegexFind$3$1 strings$evaluateRegexFind$3$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$evaluateRegexFind$3$1
                    @Override // p078p0.InterfaceC6502p
                    public final EvaluateResult invoke(String value, String patternString) {
                        C0470m c0470mM1029a;
                        AbstractC6452k.m12181e(value, "value");
                        AbstractC6452k.m12181e(patternString, "patternString");
                        try {
                            c0470mM1029a = C0470m.m1029a(patternString);
                        } catch (Exception unused) {
                            c0470mM1029a = null;
                        }
                        if (c0470mM1029a == null) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0467j c0467j = new C0467j(c0470mM1029a, value);
                        if (!c0470mM1029a.f833t.m1033a(c0467j.f820d, 0, c0467j.f821e, 0, c0467j.f818b, 1)) {
                            return EvaluateResult.Companion.getNULL();
                        }
                        c0467j.f822f = true;
                        c0467j.f823g = false;
                        c0467j.f824h = 0;
                        try {
                            return EvaluateResult.Companion.value(RegexUtils.Companion.handleMatch(c0467j));
                        } catch (IllegalArgumentException unused2) {
                            return EvaluateResultError.INSTANCE;
                        }
                    }
                };
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$3.1
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
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) strings$evaluateRegexFind$3$1.invoke(value.m735E(), value3.m735E());
                    }
                };
            }
        };
        evaluateRegexFindAll = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$4
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final Strings$evaluateRegexFindAll$3$1 strings$evaluateRegexFindAll$3$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$evaluateRegexFindAll$3$1
                    @Override // p078p0.InterfaceC6502p
                    public final EvaluateResult invoke(String value, String patternString) {
                        C0470m c0470mM1029a;
                        int i2;
                        AbstractC6452k.m12181e(value, "value");
                        AbstractC6452k.m12181e(patternString, "patternString");
                        try {
                            c0470mM1029a = C0470m.m1029a(patternString);
                        } catch (Exception unused) {
                            c0470mM1029a = null;
                        }
                        if (c0470mM1029a == null) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0112c c0112cM192n = AbstractC0116g.m192n();
                        C0467j c0467j = new C0467j(c0470mM1029a, value);
                        while (true) {
                            try {
                                int[] iArr = c0467j.f818b;
                                boolean z = true;
                                if (c0467j.f822f) {
                                    int i3 = iArr[1];
                                    if (iArr[0] == i3) {
                                        i3++;
                                    }
                                    i2 = i3;
                                } else {
                                    i2 = 0;
                                }
                                if (c0467j.f817a.f833t.m1033a(c0467j.f820d, i2, c0467j.f821e, 0, iArr, 1)) {
                                    c0467j.f822f = true;
                                    c0467j.f823g = false;
                                    c0467j.f824h = 0;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    EvaluateResult.Companion companion = EvaluateResult.Companion;
                                    C0129t c0129tM187d = c0112cM192n.m187d();
                                    AbstractC6452k.m12180d(c0129tM187d, "build(...)");
                                    return companion.list(c0129tM187d);
                                }
                                c0112cM192n.m185a(RegexUtils.Companion.handleMatch(c0467j));
                            } catch (IllegalArgumentException unused2) {
                                return EvaluateResultError.INSTANCE;
                            }
                        }
                    }
                };
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$4.1
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
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) strings$evaluateRegexFindAll$3$1.invoke(value.m735E(), value3.m735E());
                    }
                };
            }
        };
        evaluateLike = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$5
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 2) {
                    throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final InterfaceC6498l interfaceC6498l2 = params.get(1);
                final Strings$evaluateLike$3$1 strings$evaluateLike$3$1 = new InterfaceC6502p() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$evaluateLike$3$1
                    @Override // p078p0.InterfaceC6502p
                    public final EvaluateResult invoke(String value, String like) {
                        C0470m c0470mM1029a;
                        AbstractC6452k.m12181e(value, "value");
                        AbstractC6452k.m12181e(like, "like");
                        try {
                            c0470mM1029a = C0470m.m1029a(Strings.likeToRegex(like));
                        } catch (Exception unused) {
                            c0470mM1029a = null;
                        }
                        return c0470mM1029a == null ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12330boolean(c0470mM1029a.m1030b(value));
                    }
                };
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y0;
                final EnumC0391Y0 enumC0391Y3 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.Strings$special$$inlined$binaryFunctionConstructorType$5.1
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
                        int i2 = enumC0391Y0M737G == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()];
                        if (i2 == -1 || i2 == 1) {
                            value = null;
                        } else {
                            if (enumC0391Y0M737G != enumC0391Y2) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value = evaluateResult.getValue();
                        }
                        C0393Z0 value4 = evaluateResult2.getValue();
                        EnumC0391Y0 enumC0391Y0M737G2 = value4 != null ? value4.m737G() : null;
                        int i3 = enumC0391Y0M737G2 == null ? -1 : UtilsKt.C59051.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (enumC0391Y0M737G2 != enumC0391Y3) {
                                return EvaluateResultError.INSTANCE;
                            }
                            value3 = evaluateResult2.getValue();
                        }
                        return (value == null || value3 == null) ? EvaluateResult.Companion.getNULL() : (EvaluateResult) strings$evaluateLike$3$1.invoke(value.m735E(), value3.m735E());
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] bytesReverse(AbstractC6251n abstractC6251n) {
        byte[] bArrM11897w = abstractC6251n.m11897w();
        int length = bArrM11897w.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            byte b = bArrM11897w[i2];
            bArrM11897w[i2] = bArrM11897w[(bArrM11897w.length - i2) - 1];
            bArrM11897w[(bArrM11897w.length - i2) - 1] = b;
        }
        return bArrM11897w;
    }

    public static final InterfaceC6498l getEvaluateByteLength() {
        return evaluateByteLength;
    }

    public static final InterfaceC6498l getEvaluateCharLength() {
        return evaluateCharLength;
    }

    public static final InterfaceC6498l getEvaluateEndsWith() {
        return evaluateEndsWith;
    }

    public static final InterfaceC6498l getEvaluateLike() {
        return evaluateLike;
    }

    public static final InterfaceC6498l getEvaluateRegexContains() {
        return evaluateRegexContains;
    }

    public static final InterfaceC6498l getEvaluateRegexFind() {
        return evaluateRegexFind;
    }

    public static final InterfaceC6498l getEvaluateRegexFindAll() {
        return evaluateRegexFindAll;
    }

    public static final InterfaceC6498l getEvaluateRegexMatch() {
        return evaluateRegexMatch;
    }

    public static final InterfaceC6498l getEvaluateReverse() {
        return evaluateReverse;
    }

    public static final InterfaceC6498l getEvaluateSplit() {
        return evaluateSplit;
    }

    public static final InterfaceC6498l getEvaluateStartsWith() {
        return evaluateStartsWith;
    }

    public static final InterfaceC6498l getEvaluateStrConcat() {
        return evaluateStrConcat;
    }

    public static final InterfaceC6498l getEvaluateStrContains() {
        return evaluateStrContains;
    }

    public static final InterfaceC6498l getEvaluateStringReverse() {
        return evaluateStringReverse;
    }

    public static final InterfaceC6498l getEvaluateSubstring() {
        return evaluateSubstring;
    }

    public static final InterfaceC6498l getEvaluateToLowercase() {
        return evaluateToLowercase;
    }

    public static final InterfaceC6498l getEvaluateToUppercase() {
        return evaluateToUppercase;
    }

    public static final InterfaceC6498l getEvaluateTrim() {
        return evaluateTrim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getIntegerOrElse(EvaluateResult evaluateResult) {
        C0393Z0 value;
        if (!evaluateResult.isSuccess()) {
            return null;
        }
        C0393Z0 value2 = evaluateResult.getValue();
        if ((value2 != null ? value2.m737G() : null) == EnumC0391Y0.f735u && (value = evaluateResult.getValue()) != null) {
            return Long.valueOf(value.m732B());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLowerCaseImpl(int i2) {
        return UCharacter.isLowerCase(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUpperCaseImpl(int i2) {
        return UCharacter.isUpperCase(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String likeToRegex(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (z) {
                if (cCharAt == '\\') {
                    sb.append("\\");
                } else {
                    sb.append(cCharAt);
                }
                z = false;
            } else if (cCharAt == '$') {
                sb.append("\\$");
            } else if (cCharAt == '%') {
                sb.append(".*");
            } else if (cCharAt == '.') {
                sb.append("\\.");
            } else if (cCharAt != '?') {
                switch (cCharAt) {
                    case '(':
                        sb.append("\\(");
                        break;
                    case ')':
                        sb.append("\\)");
                        break;
                    case '*':
                        sb.append("\\*");
                        break;
                    case '+':
                        sb.append("\\+");
                        break;
                    default:
                        switch (cCharAt) {
                            case '[':
                                sb.append("\\[");
                                break;
                            case '\\':
                                z = true;
                                break;
                            case ']':
                                sb.append("\\]");
                                break;
                            case '^':
                                sb.append("\\^");
                                break;
                            case '_':
                                sb.append('.');
                                break;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                        sb.append("\\{");
                                        break;
                                    case '|':
                                        sb.append("\\|");
                                        break;
                                    case '}':
                                        sb.append("\\}");
                                        break;
                                    default:
                                        sb.append(cCharAt);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                sb.append("\\?");
            }
        }
        if (z) {
            throw new Exception("LIKE pattern ends in backslash");
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String stringReverse(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        while (length > 0) {
            length = str.offsetByCodePoints(length, -1);
            sb.append(Character.toChars(str.codePointAt(length)));
        }
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toLowerCaseImpl(int i2) {
        return UCharacter.toLowerCase(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toUpperCaseImpl(int i2) {
        return UCharacter.toUpperCase(i2);
    }
}
