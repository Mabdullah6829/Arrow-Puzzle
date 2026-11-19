package com.google.firebase.firestore.pipeline.evaluation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorKt {
    private static final InterfaceC6498l evaluateVectorLength = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$unaryValueFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 1) {
                throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$unaryValueFunction$1.1
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
                        C0393Z0 value2 = evaluateResult.getValue();
                        AbstractC6452k.m12178b(value2);
                        return (value2.m737G() == EnumC0391Y0.f726C && Values.isVectorValue(value2)) ? EvaluateResult.Companion.m12333long(GenericsKt.vectorLengthImpl(value2)) : EvaluateResultError.INSTANCE;
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateCosineDistance = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$1.1
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
                            return VectorKt.cosineDistance(vectorValue, vectorValue2);
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
    private static final InterfaceC6498l evaluateDotProductDistance = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$2.1
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
                            return VectorKt.dotProductDistance(vectorValue, vectorValue2);
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
    private static final InterfaceC6498l evaluateEuclideanDistance = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$3
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 2) {
                throw Assert.fail("Function should have exactly 2 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.VectorKt$special$$inlined$binaryVectorVectorFunction$3.1
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
                            return VectorKt.euclideanDistance(vectorValue, vectorValue2);
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

    public static final EvaluateResult cosineDistance(double[] vector1, double[] vector2) {
        AbstractC6452k.m12181e(vector1, "vector1");
        AbstractC6452k.m12181e(vector2, "vector2");
        if (vector1.length != vector2.length) {
            return EvaluateResultError.INSTANCE;
        }
        int length = vector1.length & (-4);
        double dFma = 0.0d;
        double dFma2 = 0.0d;
        double dFma3 = 0.0d;
        double dFma4 = 0.0d;
        double dFma5 = 0.0d;
        double dFma6 = 0.0d;
        double dFma7 = 0.0d;
        double dFma8 = 0.0d;
        double dFma9 = 0.0d;
        double dFma10 = 0.0d;
        double dFma11 = 0.0d;
        double dFma12 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            dFma2 = fma(vector1[i2], vector2[i2], dFma2);
            int i3 = i2 + 1;
            dFma = fma(vector1[i3], vector2[i3], dFma);
            int i4 = i2 + 2;
            int i5 = i2;
            dFma3 = fma(vector1[i4], vector2[i4], dFma3);
            int i6 = i5 + 3;
            dFma4 = fma(vector1[i6], vector2[i6], dFma4);
            double d = vector1[i5];
            dFma5 = fma(d, d, dFma5);
            double d2 = vector1[i3];
            dFma6 = fma(d2, d2, dFma6);
            double d3 = vector1[i4];
            dFma7 = fma(d3, d3, dFma7);
            double d4 = vector1[i6];
            dFma8 = fma(d4, d4, dFma8);
            double d5 = vector2[i5];
            dFma9 = fma(d5, d5, dFma9);
            double d6 = vector2[i3];
            dFma10 = fma(d6, d6, dFma10);
            double d7 = vector2[i4];
            dFma11 = fma(d7, d7, dFma11);
            double d8 = vector2[i6];
            dFma12 = fma(d8, d8, dFma12);
            i2 = i5 + 4;
        }
        double d9 = dFma2 + dFma + dFma3 + dFma4;
        double d10 = dFma5 + dFma6 + dFma7 + dFma8;
        double d11 = dFma9 + dFma10 + dFma11 + dFma12;
        int length2 = vector1.length;
        while (length < length2) {
            double d12 = vector1[length];
            double d13 = vector2[length];
            d9 += d12 * d13;
            d10 = (d12 * d12) + d10;
            d11 = (d13 * d13) + d11;
            length++;
        }
        double dSqrt = 1.0d - (d9 / Math.sqrt(d10 * d11));
        return Double.isNaN(dSqrt) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12331double(dSqrt);
    }

    public static final EvaluateResult dotProductDistance(double[] vector1, double[] vector2) {
        AbstractC6452k.m12181e(vector1, "vector1");
        AbstractC6452k.m12181e(vector2, "vector2");
        if (vector1.length != vector2.length) {
            return EvaluateResultError.INSTANCE;
        }
        int length = vector1.length & (-4);
        double dFma = 0.0d;
        double dFma2 = 0.0d;
        double dFma3 = 0.0d;
        double dFma4 = 0.0d;
        int i2 = 0;
        while (i2 < length) {
            dFma2 = fma(vector1[i2], vector2[i2], dFma2);
            int i3 = i2 + 1;
            dFma = fma(vector1[i3], vector2[i3], dFma);
            int i4 = i2 + 2;
            double d = vector1[i4];
            double d2 = vector2[i4];
            int i5 = i2;
            dFma3 = fma(d, d2, dFma3);
            int i6 = i5 + 3;
            dFma4 = fma(vector1[i6], vector2[i6], dFma4);
            i2 = i5 + 4;
        }
        double d3 = dFma2 + dFma + dFma3 + dFma4;
        int length2 = vector1.length;
        while (length < length2) {
            d3 += vector1[length] * vector2[length];
            length++;
        }
        return EvaluateResult.Companion.m12331double(d3);
    }

    public static final EvaluateResult euclideanDistance(double[] vector1, double[] vector2) {
        AbstractC6452k.m12181e(vector1, "vector1");
        AbstractC6452k.m12181e(vector2, "vector2");
        if (vector1.length != vector2.length) {
            return EvaluateResultError.INSTANCE;
        }
        int length = vector1.length & (-4);
        double dFma = 0.0d;
        double dFma2 = 0.0d;
        double dFma3 = 0.0d;
        double dFma4 = 0.0d;
        for (int i2 = 0; i2 < length; i2 += 4) {
            double d = vector1[i2] - vector2[i2];
            int i3 = i2 + 1;
            double d2 = vector1[i3] - vector2[i3];
            int i4 = i2 + 2;
            double d3 = vector1[i4] - vector2[i4];
            int i5 = i2 + 3;
            double d4 = vector1[i5] - vector2[i5];
            dFma2 = fma(d, d, dFma2);
            dFma = fma(d2, d2, dFma);
            dFma3 = fma(d3, d3, dFma3);
            dFma4 = fma(d4, d4, dFma4);
        }
        double d5 = dFma2 + dFma + dFma3 + dFma4;
        int length2 = vector1.length;
        double dFma5 = d5;
        while (length < length2) {
            double d6 = vector1[length] - vector2[length];
            dFma5 = fma(d6, d6, dFma5);
            length++;
        }
        return EvaluateResult.Companion.m12331double(Math.sqrt(dFma5));
    }

    private static final double fma(double d, double d2, double d3) {
        return Build.VERSION.SDK_INT >= 33 ? nativeFma(d, d2, d3) : (d * d2) + d3;
    }

    public static final InterfaceC6498l getEvaluateCosineDistance() {
        return evaluateCosineDistance;
    }

    public static final InterfaceC6498l getEvaluateDotProductDistance() {
        return evaluateDotProductDistance;
    }

    public static final InterfaceC6498l getEvaluateEuclideanDistance() {
        return evaluateEuclideanDistance;
    }

    public static final InterfaceC6498l getEvaluateVectorLength() {
        return evaluateVectorLength;
    }

    @RequiresApi(33)
    private static final double nativeFma(double d, double d2, double d3) {
        return Math.fma(d, d2, d3);
    }
}
