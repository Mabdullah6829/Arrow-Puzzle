package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.AbstractC6251n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p058e0.AbstractC6307o;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class GenericsKt {
    private static final InterfaceC6498l evaluateLength = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.GenericsKt$special$$inlined$unaryValueFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 1) {
                throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.GenericsKt$special$$inlined$unaryValueFunction$1.1
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
                            i2 = GenericsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()];
                        }
                        if (i2 == 1) {
                            EvaluateResult.Companion companion = EvaluateResult.Companion;
                            String strM735E = value2.m735E();
                            AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                            return companion.m12332long(strM735E.codePointCount(0, value2.m735E().length()));
                        }
                        if (i2 == 2) {
                            return EvaluateResult.Companion.m12332long(value2.m747v().size());
                        }
                        if (i2 == 3) {
                            return EvaluateResult.Companion.m12332long(value2.m745t().m800j());
                        }
                        if (i2 != 4) {
                            return EvaluateResultError.INSTANCE;
                        }
                        return Values.isVectorValue(value2) ? EvaluateResult.Companion.m12333long(GenericsKt.vectorLengthImpl(value2)) : EvaluateResult.Companion.m12332long(value2.m733C().m648h().size());
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateConcat = new C0059r(19);

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
            try {
                iArr[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final EvaluateResultValue bytesConcat(List<? extends AbstractC6251n> list) {
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC6251n) it.next()).m11897w());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byte[] bArr2 = (byte[]) next;
            AbstractC6452k.m12178b(bArr2);
            AbstractC6452k.m12178b(bArr);
            int length = bArr2.length;
            int length2 = bArr.length;
            next = Arrays.copyOf(bArr2, length + length2);
            System.arraycopy(bArr, 0, next, length, length2);
            AbstractC6452k.m12178b(next);
        }
        AbstractC6452k.m12180d(next, "reduce(...)");
        return companion.value(Values.encodeValue((byte[]) next));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateConcat$lambda$6(List params) {
        AbstractC6452k.m12181e(params, "params");
        return new C5932a(params, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateConcat$lambda$6$lambda$5(List list, MutableDocument input) {
        int i2;
        AbstractC6452k.m12181e(input, "input");
        if (list.size() < 2) {
            throw Assert.fail("Function should have at least 2 params, but %d were given.", Integer.valueOf(list.size()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i3 = 0;
        C0393Z0 value = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (z) {
                    return EvaluateResult.Companion.getNULL();
                }
                EnumC0391Y0 enumC0391Y0M737G = value != null ? value.m737G() : null;
                i2 = enumC0391Y0M737G != null ? WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()] : -1;
                if (i2 == 1) {
                    EvaluateResult.Companion companion = EvaluateResult.Companion;
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        sb.append(((C0393Z0) obj).m735E());
                    }
                    String string = sb.toString();
                    AbstractC6452k.m12180d(string, "toString(...)");
                    return companion.string(string);
                }
                if (i2 == 2) {
                    ArrayList arrayList2 = new ArrayList(AbstractC6307o.m12123u(arrayList, 10));
                    int size2 = arrayList.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(((C0393Z0) obj2).m747v());
                    }
                    return bytesConcat(arrayList2);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("Unreachable");
                }
                ArrayList arrayList3 = new ArrayList(AbstractC6307o.m12123u(arrayList, 10));
                int size3 = arrayList.size();
                while (i3 < size3) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    arrayList3.add(((C0393Z0) obj3).m745t().getValuesList());
                }
                return ArrayKt.arrayConcatImpl(arrayList3);
            }
            EvaluateResult evaluateResult = (EvaluateResult) ((InterfaceC6498l) it.next()).invoke(input);
            if (evaluateResult instanceof EvaluateResultError) {
                return EvaluateResultError.INSTANCE;
            }
            if ((evaluateResult instanceof EvaluateResultUnset) || AbstractC6452k.m12177a(evaluateResult, EvaluateResult.Companion.getNULL())) {
                z = true;
            } else {
                if (value == null) {
                    C0393Z0 value2 = evaluateResult.getValue();
                    EnumC0391Y0 enumC0391Y0M737G2 = value2 != null ? value2.m737G() : null;
                    i2 = enumC0391Y0M737G2 != null ? WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G2.ordinal()] : -1;
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        return EvaluateResultError.INSTANCE;
                    }
                    value = evaluateResult.getValue();
                } else {
                    EnumC0391Y0 enumC0391Y0M737G3 = value.m737G();
                    C0393Z0 value3 = evaluateResult.getValue();
                    if (enumC0391Y0M737G3 != (value3 != null ? value3.m737G() : null)) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
                C0393Z0 value4 = evaluateResult.getValue();
                AbstractC6452k.m12178b(value4);
                arrayList.add(value4);
            }
        }
    }

    public static final InterfaceC6498l getEvaluateConcat() {
        return evaluateConcat;
    }

    public static final InterfaceC6498l getEvaluateLength() {
        return evaluateLength;
    }

    public static final long vectorLengthImpl(C0393Z0 value) {
        AbstractC6452k.m12181e(value, "value");
        Object obj = value.m733C().m648h().get("value");
        AbstractC6452k.m12178b(obj);
        return ((C0393Z0) obj).m745t().m800j();
    }
}
