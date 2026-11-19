package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.Values;
import com.google.protobuf.C6197S0;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EvaluateResult {
    public static final Companion Companion;
    private static final EvaluateResultValue DOUBLE_ZERO;
    private static final EvaluateResultValue FALSE;
    private static final EvaluateResultValue LONG_ZERO;
    private static final EvaluateResultValue NULL;
    private static final EvaluateResultValue TRUE;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final EvaluateResultValue m12329boolean(Boolean bool) {
            return bool == null ? getNULL() : m12330boolean(bool.booleanValue());
        }

        /* JADX INFO: renamed from: double, reason: not valid java name */
        public final EvaluateResultValue m12331double(double d) {
            return new EvaluateResultValue(Values.encodeValue(d));
        }

        public final EvaluateResultValue getDOUBLE_ZERO() {
            return EvaluateResult.DOUBLE_ZERO;
        }

        public final EvaluateResultValue getFALSE() {
            return EvaluateResult.FALSE;
        }

        public final EvaluateResultValue getLONG_ZERO() {
            return EvaluateResult.LONG_ZERO;
        }

        public final EvaluateResultValue getNULL() {
            return EvaluateResult.NULL;
        }

        public final EvaluateResultValue getTRUE() {
            return EvaluateResult.TRUE;
        }

        public final EvaluateResultValue list(List<C0393Z0> list) {
            AbstractC6452k.m12181e(list, "list");
            return new EvaluateResultValue(Values.encodeValue(list));
        }

        /* JADX INFO: renamed from: long, reason: not valid java name */
        public final EvaluateResultValue m12333long(long j2) {
            return new EvaluateResultValue(Values.encodeValue(j2));
        }

        public final EvaluateResultValue string(String string) {
            AbstractC6452k.m12181e(string, "string");
            return new EvaluateResultValue(Values.encodeValue(string));
        }

        public final EvaluateResult timestamp(C6197S0 timestamp) {
            AbstractC6452k.m12181e(timestamp, "timestamp");
            return new EvaluateResultValue(Values.encodeValue(timestamp));
        }

        public final EvaluateResultValue value(C0393Z0 value) {
            AbstractC6452k.m12181e(value, "value");
            return new EvaluateResultValue(value);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final EvaluateResultValue m12330boolean(boolean z) {
            return z ? getTRUE() : getFALSE();
        }

        /* JADX INFO: renamed from: long, reason: not valid java name */
        public final EvaluateResultValue m12332long(int i2) {
            return new EvaluateResultValue(Values.encodeValue(i2));
        }

        public final EvaluateResult timestamp(long j2, int i2) {
            try {
                return timestamp(Values.timestamp(j2, i2));
            } catch (IllegalArgumentException unused) {
                return EvaluateResultError.INSTANCE;
            }
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        TRUE = new EvaluateResultValue(Values.TRUE_VALUE);
        FALSE = new EvaluateResultValue(Values.FALSE_VALUE);
        NULL = new EvaluateResultValue(Values.NULL_VALUE);
        DOUBLE_ZERO = companion.m12331double(0.0d);
        LONG_ZERO = companion.m12332long(0);
    }

    public /* synthetic */ EvaluateResult(AbstractC6447f abstractC6447f) {
        this();
    }

    public abstract C0393Z0 getValue();

    public abstract boolean isError();

    public abstract boolean isSuccess();

    public abstract boolean isUnset();

    private EvaluateResult() {
    }
}
