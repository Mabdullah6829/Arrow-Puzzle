package com.google.firebase.firestore.pipeline.evaluation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.android.material.floatingactionbutton.AbstractC5333a;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.C6197S0;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p022N.C0393Z0;
import p022N.EnumC0391Y0;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class TimestampKt {
    private static final int I_MICROS_PER_SECOND = 1000000;
    private static final int I_MILLIS_PER_SECOND = 1000;
    private static final int I_NANOS_PER_SECOND = 1000000000;
    private static final long L_MICROS_PER_SECOND = 1000000;
    private static final long L_MILLIS_PER_SECOND = 1000;
    private static final long L_NANOS_PER_SECOND = 1000000000;
    private static final long TIMESTAMP_MAX_MICROSECONDS = 253402300799999999L;
    private static final long TIMESTAMP_MAX_MILLISECONDS = 253402300799999L;
    private static final long TIMESTAMP_MAX_SECONDS = 253402300799L;
    private static final long TIMESTAMP_MIN_MICROSECONDS = -62135596800000000L;
    private static final long TIMESTAMP_MIN_MILLISECONDS = -62135596800000L;
    private static final long TIMESTAMP_MIN_SECONDS = -62135596800L;
    private static final InterfaceC6498l evaluateTimestampToUnixMicros;
    private static final InterfaceC6498l evaluateTimestampToUnixMillis;
    private static final InterfaceC6498l evaluateTimestampToUnixSeconds;
    private static final InterfaceC6498l evaluateUnixMicrosToTimestamp;
    private static final InterfaceC6498l evaluateUnixMillisToTimestamp;
    private static final InterfaceC6498l evaluateUnixSecondsToTimestamp;
    private static final InterfaceC6498l evaluateTimestampAdd = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$ternaryTimestampFunction$1
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 3) {
                throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            final InterfaceC6498l interfaceC6498l3 = params.get(2);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$ternaryTimestampFunction$1.1
                /* JADX WARN: Code duplicated, block: B:95:0x01af A[Catch: Exception -> 0x01c3, TryCatch #0 {Exception -> 0x01c3, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x0029, B:9:0x003f, B:11:0x0042, B:13:0x0058, B:15:0x005b, B:17:0x0068, B:28:0x0083, B:30:0x0086, B:33:0x008e, B:40:0x00a3, B:42:0x00ae, B:51:0x00c7, B:53:0x00ca, B:57:0x00d8, B:59:0x00e2, B:61:0x0109, B:63:0x010c, B:65:0x011b, B:66:0x011f, B:90:0x0194, B:68:0x0124, B:71:0x012e, B:93:0x01a1, B:95:0x01af, B:97:0x01b2, B:72:0x013d, B:75:0x0146, B:76:0x0151, B:79:0x015a, B:80:0x0166, B:83:0x016f, B:84:0x017e, B:87:0x0187, B:88:0x018c, B:92:0x0197, B:99:0x01b9, B:46:0x00b8, B:101:0x01c0, B:37:0x0098, B:22:0x0073), top: B:105:0x000b }] */
                /* JADX WARN: Code duplicated, block: B:97:0x01b2 A[Catch: Exception -> 0x01c3, TryCatch #0 {Exception -> 0x01c3, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x0029, B:9:0x003f, B:11:0x0042, B:13:0x0058, B:15:0x005b, B:17:0x0068, B:28:0x0083, B:30:0x0086, B:33:0x008e, B:40:0x00a3, B:42:0x00ae, B:51:0x00c7, B:53:0x00ca, B:57:0x00d8, B:59:0x00e2, B:61:0x0109, B:63:0x010c, B:65:0x011b, B:66:0x011f, B:90:0x0194, B:68:0x0124, B:71:0x012e, B:93:0x01a1, B:95:0x01af, B:97:0x01b2, B:72:0x013d, B:75:0x0146, B:76:0x0151, B:79:0x015a, B:80:0x0166, B:83:0x016f, B:84:0x017e, B:87:0x0187, B:88:0x018c, B:92:0x0197, B:99:0x01b9, B:46:0x00b8, B:101:0x01c0, B:37:0x0098, B:22:0x0073), top: B:105:0x000b }] */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(final MutableDocument input) {
                    C6197S0 c6197s0M736F;
                    C6197S0 c6197s0Plus;
                    AbstractC6452k.m12181e(input, "input");
                    final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                    final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                    final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                    try {
                        InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.1.1.1
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l4.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.1.1.2
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l5.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.1.1.3
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
                            long jLongValue = lValueOf.longValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                Instant instantPlus = Instant.ofEpochSecond(c6197s0M736F.m11820i(), c6197s0M736F.m11819h()).plus(jLongValue, AbstractC5333a.m11001k(TimestampKt.convertUnit(strM735E)));
                                return !TimestampKt.isTimestampInBounds(instantPlus.getEpochSecond(), instantPlus.getNano()) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(instantPlus.getEpochSecond(), instantPlus.getNano());
                            }
                            switch (strM735E.hashCode()) {
                                case -1074026988:
                                    if (strM735E.equals("minute")) {
                                        c6197s0Plus = TimestampKt.plus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 60L));
                                        return !TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h()) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(c6197s0Plus);
                                    }
                                    return EvaluateResultError.INSTANCE;
                                case -906279820:
                                    if (!strM735E.equals("second")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Plus = TimestampKt.plus(c6197s0M736F, jLongValue);
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h())) {
                                    }
                                case -368353224:
                                    if (!strM735E.equals("microsecond")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Plus = TimestampKt.plus(c6197s0M736F, jLongValue / 1000000, (jLongValue % 1000000) * ((long) 1000));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h())) {
                                    }
                                case 99228:
                                    if (!strM735E.equals("day")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Plus = TimestampKt.plus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 86400L));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h())) {
                                    }
                                case 3208676:
                                    if (!strM735E.equals("hour")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Plus = TimestampKt.plus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 3600L));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h())) {
                                    }
                                case 1942410881:
                                    if (!strM735E.equals("millisecond")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Plus = TimestampKt.plus(c6197s0M736F, jLongValue / 1000, (jLongValue % 1000) * ((long) 1000000));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Plus.m11820i(), c6197s0Plus.m11819h())) {
                                    }
                                default:
                                    return EvaluateResultError.INSTANCE;
                            }
                        }
                        return EvaluateResult.Companion.getNULL();
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateTimestampSub = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$ternaryTimestampFunction$2
        @Override // p078p0.InterfaceC6498l
        public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
            AbstractC6452k.m12181e(params, "params");
            if (params.size() != 3) {
                throw Assert.fail("Function should have exactly 3 params, but %d were given.", Integer.valueOf(params.size()));
            }
            final InterfaceC6498l interfaceC6498l = params.get(0);
            final InterfaceC6498l interfaceC6498l2 = params.get(1);
            final InterfaceC6498l interfaceC6498l3 = params.get(2);
            return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$ternaryTimestampFunction$2.1
                /* JADX WARN: Code duplicated, block: B:95:0x01af A[Catch: Exception -> 0x01c3, TryCatch #0 {Exception -> 0x01c3, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x0029, B:9:0x003f, B:11:0x0042, B:13:0x0058, B:15:0x005b, B:17:0x0068, B:28:0x0083, B:30:0x0086, B:33:0x008e, B:40:0x00a3, B:42:0x00ae, B:51:0x00c7, B:53:0x00ca, B:57:0x00d8, B:59:0x00e2, B:61:0x0109, B:63:0x010c, B:65:0x011b, B:66:0x011f, B:90:0x0194, B:68:0x0124, B:71:0x012e, B:93:0x01a1, B:95:0x01af, B:97:0x01b2, B:72:0x013d, B:75:0x0146, B:76:0x0151, B:79:0x015a, B:80:0x0166, B:83:0x016f, B:84:0x017e, B:87:0x0187, B:88:0x018c, B:92:0x0197, B:99:0x01b9, B:46:0x00b8, B:101:0x01c0, B:37:0x0098, B:22:0x0073), top: B:105:0x000b }] */
                /* JADX WARN: Code duplicated, block: B:97:0x01b2 A[Catch: Exception -> 0x01c3, TryCatch #0 {Exception -> 0x01c3, blocks: (B:3:0x000b, B:5:0x0026, B:7:0x0029, B:9:0x003f, B:11:0x0042, B:13:0x0058, B:15:0x005b, B:17:0x0068, B:28:0x0083, B:30:0x0086, B:33:0x008e, B:40:0x00a3, B:42:0x00ae, B:51:0x00c7, B:53:0x00ca, B:57:0x00d8, B:59:0x00e2, B:61:0x0109, B:63:0x010c, B:65:0x011b, B:66:0x011f, B:90:0x0194, B:68:0x0124, B:71:0x012e, B:93:0x01a1, B:95:0x01af, B:97:0x01b2, B:72:0x013d, B:75:0x0146, B:76:0x0151, B:79:0x015a, B:80:0x0166, B:83:0x016f, B:84:0x017e, B:87:0x0187, B:88:0x018c, B:92:0x0197, B:99:0x01b9, B:46:0x00b8, B:101:0x01c0, B:37:0x0098, B:22:0x0073), top: B:105:0x000b }] */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // p078p0.InterfaceC6498l
                public final EvaluateResult invoke(final MutableDocument input) {
                    C6197S0 c6197s0M736F;
                    C6197S0 c6197s0Minus;
                    AbstractC6452k.m12181e(input, "input");
                    final InterfaceC6498l interfaceC6498l4 = interfaceC6498l;
                    final InterfaceC6498l interfaceC6498l5 = interfaceC6498l2;
                    final InterfaceC6498l interfaceC6498l6 = interfaceC6498l3;
                    try {
                        InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.2.1.1
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l4.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a2 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.2.1.2
                            @Override // p078p0.InterfaceC6487a
                            public final EvaluateResult invoke() {
                                return (EvaluateResult) interfaceC6498l5.invoke(input);
                            }
                        };
                        InterfaceC6487a interfaceC6487a3 = new InterfaceC6487a() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$.inlined.ternaryTimestampFunction.2.1.3
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
                            long jLongValue = lValueOf.longValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                Instant instantMinus = Instant.ofEpochSecond(c6197s0M736F.m11820i(), c6197s0M736F.m11819h()).minus(jLongValue, AbstractC5333a.m11001k(TimestampKt.convertUnit(strM735E)));
                                return !TimestampKt.isTimestampInBounds(instantMinus.getEpochSecond(), instantMinus.getNano()) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(instantMinus.getEpochSecond(), instantMinus.getNano());
                            }
                            switch (strM735E.hashCode()) {
                                case -1074026988:
                                    if (strM735E.equals("minute")) {
                                        c6197s0Minus = TimestampKt.minus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 60L));
                                        return !TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h()) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(c6197s0Minus);
                                    }
                                    return EvaluateResultError.INSTANCE;
                                case -906279820:
                                    if (!strM735E.equals("second")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Minus = TimestampKt.minus(c6197s0M736F, jLongValue);
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h())) {
                                    }
                                case -368353224:
                                    if (!strM735E.equals("microsecond")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Minus = TimestampKt.minus(c6197s0M736F, jLongValue / 1000000, (jLongValue % 1000000) * ((long) 1000));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h())) {
                                    }
                                case 99228:
                                    if (!strM735E.equals("day")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Minus = TimestampKt.minus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 86400L));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h())) {
                                    }
                                case 3208676:
                                    if (!strM735E.equals("hour")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Minus = TimestampKt.minus(c6197s0M736F, AbstractC0242F.m348c(jLongValue, 3600L));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h())) {
                                    }
                                case 1942410881:
                                    if (!strM735E.equals("millisecond")) {
                                        return EvaluateResultError.INSTANCE;
                                    }
                                    c6197s0Minus = TimestampKt.minus(c6197s0M736F, jLongValue / 1000, (jLongValue % 1000) * ((long) 1000000));
                                    if (!TimestampKt.isTimestampInBounds(c6197s0Minus.m11820i(), c6197s0Minus.m11819h())) {
                                    }
                                default:
                                    return EvaluateResultError.INSTANCE;
                            }
                        }
                        return EvaluateResult.Companion.getNULL();
                    } catch (Exception unused) {
                        return EvaluateResultError.INSTANCE;
                    }
                }
            };
        }
    };
    private static final InterfaceC6498l evaluateTimestampTrunc = UtilsKt.getNotImplemented();

    static {
        final EnumC0391Y0 enumC0391Y0 = EnumC0391Y0.f737w;
        evaluateTimestampToUnixMicros = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$1.1
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
                                    C6197S0 c6197s0M736F = value.m736F();
                                    if (TimestampKt.isTimestampInBounds(c6197s0M736F.m11820i(), c6197s0M736F.m11819h())) {
                                        return EvaluateResult.Companion.m12333long(c6197s0M736F.m11820i() < -9223372036854L ? AbstractC0242F.m347b(AbstractC0242F.m348c(c6197s0M736F.m11820i() + 1, 1000000L), (((long) c6197s0M736F.m11819h()) / 1000) - 1000000) : AbstractC0242F.m347b(AbstractC0242F.m348c(c6197s0M736F.m11820i(), 1000000L), ((long) c6197s0M736F.m11819h()) / 1000));
                                    }
                                    return EvaluateResultError.INSTANCE;
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
        evaluateTimestampToUnixMillis = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$2.1
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
                                    C6197S0 c6197s0M736F = value.m736F();
                                    if (TimestampKt.isTimestampInBounds(c6197s0M736F.m11820i(), c6197s0M736F.m11819h())) {
                                        return EvaluateResult.Companion.m12333long((c6197s0M736F.m11820i() >= 0 || c6197s0M736F.m11819h() <= 0) ? AbstractC0242F.m347b(AbstractC0242F.m348c(c6197s0M736F.m11820i(), 1000L), ((long) c6197s0M736F.m11819h()) / 1000000) : AbstractC0242F.m347b(AbstractC0242F.m348c(c6197s0M736F.m11820i() + 1, 1000L), (((long) c6197s0M736F.m11819h()) / 1000000) - 1000));
                                    }
                                    return EvaluateResultError.INSTANCE;
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
        evaluateTimestampToUnixSeconds = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y1 = enumC0391Y0;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryTimestampFunction$3.1
                    @Override // p078p0.InterfaceC6498l
                    public final EvaluateResult invoke(MutableDocument input) {
                        EvaluateResult evaluateResultM12333long;
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
                                    C6197S0 c6197s0M736F = value.m736F();
                                    if (TimestampKt.isTimestampInBounds(c6197s0M736F.m11820i(), c6197s0M736F.m11819h())) {
                                        long jM11819h = c6197s0M736F.m11819h();
                                        evaluateResultM12333long = (0 > jM11819h || jM11819h >= 1000000000) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.m12333long(c6197s0M736F.m11820i());
                                    } else {
                                        evaluateResultM12333long = EvaluateResultError.INSTANCE;
                                    }
                                    return evaluateResultM12333long;
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
        final EnumC0391Y0 enumC0391Y1 = EnumC0391Y0.f735u;
        evaluateUnixMicrosToTimestamp = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$1
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$1.1
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
                                    long jM732B = value.m732B();
                                    return !TimestampKt.isMicrosecondsInTimestampBounds(jM732B) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(Math.floorDiv(jM732B, 1000000L), ((int) Math.floorMod(jM732B, 1000000)) * 1000);
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
        evaluateUnixMillisToTimestamp = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$2
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$2.1
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
                                    long jM732B = value.m732B();
                                    return !TimestampKt.isMillisecondsInTimestampBounds(jM732B) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(Math.floorDiv(jM732B, 1000L), ((int) Math.floorMod(jM732B, 1000)) * 1000000);
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
        evaluateUnixSecondsToTimestamp = new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$3
            @Override // p078p0.InterfaceC6498l
            public final InterfaceC6498l invoke(List<? extends InterfaceC6498l> params) {
                AbstractC6452k.m12181e(params, "params");
                if (params.size() != 1) {
                    throw Assert.fail("Function should have exactly 1 params, but %d were given.", Integer.valueOf(params.size()));
                }
                final InterfaceC6498l interfaceC6498l = params.get(0);
                final EnumC0391Y0 enumC0391Y2 = enumC0391Y1;
                return new InterfaceC6498l() { // from class: com.google.firebase.firestore.pipeline.evaluation.TimestampKt$special$$inlined$unaryLongFunction$3.1
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
                                    long jM732B = value.m732B();
                                    return !TimestampKt.isSecondsInTimestampBounds(jM732B) ? EvaluateResultError.INSTANCE : EvaluateResult.Companion.timestamp(jM732B, 0);
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @RequiresApi(26)
    public static final ChronoUnit convertUnit(String unit) {
        AbstractC6452k.m12181e(unit, "unit");
        switch (unit.hashCode()) {
            case -1074026988:
                if (unit.equals("minute")) {
                    return ChronoUnit.MINUTES;
                }
                break;
            case -906279820:
                if (unit.equals("second")) {
                    return ChronoUnit.SECONDS;
                }
                break;
            case -368353224:
                if (unit.equals("microsecond")) {
                    return ChronoUnit.MICROS;
                }
                break;
            case 99228:
                if (unit.equals("day")) {
                    return ChronoUnit.DAYS;
                }
                break;
            case 3208676:
                if (unit.equals("hour")) {
                    return ChronoUnit.HOURS;
                }
                break;
            case 1942410881:
                if (unit.equals("millisecond")) {
                    return ChronoUnit.MILLIS;
                }
                break;
        }
        throw new IllegalArgumentException("Unexpected timestamp unit: ".concat(unit));
    }

    public static final InterfaceC6498l getEvaluateTimestampAdd() {
        return evaluateTimestampAdd;
    }

    public static final InterfaceC6498l getEvaluateTimestampSub() {
        return evaluateTimestampSub;
    }

    public static final InterfaceC6498l getEvaluateTimestampToUnixMicros() {
        return evaluateTimestampToUnixMicros;
    }

    public static final InterfaceC6498l getEvaluateTimestampToUnixMillis() {
        return evaluateTimestampToUnixMillis;
    }

    public static final InterfaceC6498l getEvaluateTimestampToUnixSeconds() {
        return evaluateTimestampToUnixSeconds;
    }

    public static final InterfaceC6498l getEvaluateTimestampTrunc() {
        return evaluateTimestampTrunc;
    }

    public static final InterfaceC6498l getEvaluateUnixMicrosToTimestamp() {
        return evaluateUnixMicrosToTimestamp;
    }

    public static final InterfaceC6498l getEvaluateUnixMillisToTimestamp() {
        return evaluateUnixMillisToTimestamp;
    }

    public static final InterfaceC6498l getEvaluateUnixSecondsToTimestamp() {
        return evaluateUnixSecondsToTimestamp;
    }

    public static final boolean isMicrosecondsInTimestampBounds(long j2) {
        return j2 >= TIMESTAMP_MIN_MICROSECONDS && j2 <= TIMESTAMP_MAX_MICROSECONDS;
    }

    public static final boolean isMillisecondsInTimestampBounds(long j2) {
        return j2 >= TIMESTAMP_MIN_MILLISECONDS && j2 <= TIMESTAMP_MAX_MILLISECONDS;
    }

    public static final boolean isSecondsInTimestampBounds(long j2) {
        return j2 >= TIMESTAMP_MIN_SECONDS && j2 <= TIMESTAMP_MAX_SECONDS;
    }

    public static final boolean isTimestampInBounds(long j2, int i2) {
        return j2 >= TIMESTAMP_MIN_SECONDS && j2 <= TIMESTAMP_MAX_SECONDS && i2 >= 0 && ((long) i2) < L_NANOS_PER_SECOND;
    }

    public static final C6197S0 minus(C6197S0 t, long j2, long j3) {
        AbstractC6452k.m12181e(t, "t");
        if (j3 == 0) {
            return minus(t, j2);
        }
        long jM11819h = ((long) t.m11819h()) - j3;
        return Values.timestamp(AbstractC0242F.m349d(t.m11820i(), AbstractC0242F.m349d(j2, jM11819h / L_NANOS_PER_SECOND)), (int) (jM11819h % ((long) I_NANOS_PER_SECOND)));
    }

    public static final C6197S0 plus(C6197S0 t, long j2, long j3) {
        AbstractC6452k.m12181e(t, "t");
        if (j3 == 0) {
            return plus(t, j2);
        }
        long jM11819h = ((long) t.m11819h()) + j3;
        return Values.timestamp(AbstractC0242F.m347b(AbstractC0242F.m347b(t.m11820i(), j2), jM11819h / L_NANOS_PER_SECOND), (int) (jM11819h % ((long) I_NANOS_PER_SECOND)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6197S0 minus(C6197S0 c6197s0, long j2) {
        return j2 == 0 ? c6197s0 : Values.timestamp(AbstractC0242F.m349d(c6197s0.m11820i(), j2), c6197s0.m11819h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6197S0 plus(C6197S0 c6197s0, long j2) {
        return j2 == 0 ? c6197s0 : Values.timestamp(AbstractC0242F.m347b(c6197s0.m11820i(), j2), c6197s0.m11819h());
    }
}
