package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p022N.AbstractC0355G;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class MapsKt {
    private static final InterfaceC6498l evaluateMapGet = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.MapsKt$special$$inlined$binaryValueValueFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.MapsKt$special$$inlined$binaryValueValueFunction$1.1
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
                        Map mapM648h = (value == null || !Values.isMapValue(value) || Values.isVectorValue(value)) ? null : value.m733C().m648h();
                        EnumC0391Y0 enumC0391Y0M737G = value2 != null ? value2.m737G() : null;
                        if ((enumC0391Y0M737G == null ? -1 : MapsKt.WhenMappings.$EnumSwitchMapping$0[enumC0391Y0M737G.ordinal()]) != 1) {
                            return EvaluateResultError.INSTANCE;
                        }
                        C0393Z0 c0393z0 = mapM648h != null ? (C0393Z0) mapM648h.get(value2.m735E()) : null;
                        return c0393z0 == null ? EvaluateResultUnset.INSTANCE : new EvaluateResultValue(c0393z0);
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateMap = new C0059r(24);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0391Y0.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6498l evaluateMap$lambda$2(List params) {
        AbstractC6452k.m12181e(params, "params");
        if (params.size() % 2 == 0) {
            return new C5932a(params, 16);
        }
        throw Assert.fail("Function should have even number of params, but %d were given.", Integer.valueOf(params.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateMap$lambda$2$lambda$1(List list, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        HashMap map = new HashMap(list.size() / 2);
        int i2 = 0;
        int iM555i = AbstractC0355G.m555i(0, list.size() - 1, 2);
        if (iM555i >= 0) {
            while (true) {
                C0393Z0 value = ((EvaluateResult) ((InterfaceC6498l) list.get(i2)).invoke(input)).getValue();
                if (value == null) {
                    return EvaluateResultError.INSTANCE;
                }
                if (!value.m744N()) {
                    return EvaluateResultError.INSTANCE;
                }
                C0393Z0 value2 = ((EvaluateResult) ((InterfaceC6498l) list.get(i2 + 1)).invoke(input)).getValue();
                if (value2 == null) {
                    return EvaluateResultError.INSTANCE;
                }
                String strM735E = value.m735E();
                AbstractC6452k.m12180d(strM735E, "getStringValue(...)");
                if (map.put(strM735E, value2) != null) {
                    return EvaluateResultError.INSTANCE;
                }
                if (i2 != iM555i) {
                    i2 += 2;
                }
            }
        }
        return new EvaluateResultValue(Values.encodeValue(map));
    }

    public static final InterfaceC6498l getEvaluateMap() {
        return evaluateMap;
    }

    public static final InterfaceC6498l getEvaluateMapGet() {
        return evaluateMapGet;
    }
}
