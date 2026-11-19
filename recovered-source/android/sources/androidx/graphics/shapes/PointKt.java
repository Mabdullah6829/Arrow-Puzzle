package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class PointKt {
    /* JADX INFO: renamed from: clockwise-ybeJwSQ, reason: not valid java name */
    public static final boolean m12291clockwiseybeJwSQ(long j2, long j3) {
        return (m12301getYDnnuFBc(j3) * m12300getXDnnuFBc(j2)) - (m12300getXDnnuFBc(j3) * m12301getYDnnuFBc(j2)) > 0.0f;
    }

    /* JADX INFO: renamed from: copy-5P9i7ZU, reason: not valid java name */
    public static final long m12292copy5P9i7ZU(long j2, float f2, float f3) {
        return FloatFloatPair.m12249constructorimpl(f2, f3);
    }

    /* JADX INFO: renamed from: copy-5P9i7ZU$default, reason: not valid java name */
    public static /* synthetic */ long m12293copy5P9i7ZU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (4294967295L & j2));
        }
        return m12292copy5P9i7ZU(j2, f2, f3);
    }

    /* JADX INFO: renamed from: div-so9K2fw, reason: not valid java name */
    public static final long m12294divso9K2fw(long j2, float f2) {
        return FloatFloatPair.m12249constructorimpl(m12300getXDnnuFBc(j2) / f2, m12301getYDnnuFBc(j2) / f2);
    }

    /* JADX INFO: renamed from: dotProduct-5P9i7ZU, reason: not valid java name */
    public static final float m12295dotProduct5P9i7ZU(long j2, float f2, float f3) {
        return (m12301getYDnnuFBc(j2) * f3) + (m12300getXDnnuFBc(j2) * f2);
    }

    /* JADX INFO: renamed from: dotProduct-ybeJwSQ, reason: not valid java name */
    public static final float m12296dotProductybeJwSQ(long j2, long j3) {
        return (m12301getYDnnuFBc(j3) * m12301getYDnnuFBc(j2)) + (m12300getXDnnuFBc(j3) * m12300getXDnnuFBc(j2));
    }

    /* JADX INFO: renamed from: getDirection-DnnuFBc, reason: not valid java name */
    public static final long m12297getDirectionDnnuFBc(long j2) {
        float fM12298getDistanceDnnuFBc = m12298getDistanceDnnuFBc(j2);
        if (fM12298getDistanceDnnuFBc > 0.0f) {
            return m12294divso9K2fw(j2, fM12298getDistanceDnnuFBc);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    /* JADX INFO: renamed from: getDistance-DnnuFBc, reason: not valid java name */
    public static final float m12298getDistanceDnnuFBc(long j2) {
        return (float) Math.sqrt((m12301getYDnnuFBc(j2) * m12301getYDnnuFBc(j2)) + (m12300getXDnnuFBc(j2) * m12300getXDnnuFBc(j2)));
    }

    /* JADX INFO: renamed from: getDistanceSquared-DnnuFBc, reason: not valid java name */
    public static final float m12299getDistanceSquaredDnnuFBc(long j2) {
        return (m12301getYDnnuFBc(j2) * m12301getYDnnuFBc(j2)) + (m12300getXDnnuFBc(j2) * m12300getXDnnuFBc(j2));
    }

    /* JADX INFO: renamed from: getX-DnnuFBc, reason: not valid java name */
    public static final float m12300getXDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX INFO: renamed from: getY-DnnuFBc, reason: not valid java name */
    public static final float m12301getYDnnuFBc(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: interpolate-dLqxh1s, reason: not valid java name */
    public static final long m12302interpolatedLqxh1s(long j2, long j3, float f2) {
        return FloatFloatPair.m12249constructorimpl(Utils.interpolate(m12300getXDnnuFBc(j2), m12300getXDnnuFBc(j3), f2), Utils.interpolate(m12301getYDnnuFBc(j2), m12301getYDnnuFBc(j3), f2));
    }

    /* JADX INFO: renamed from: minus-ybeJwSQ, reason: not valid java name */
    public static final long m12303minusybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m12249constructorimpl(m12300getXDnnuFBc(j2) - m12300getXDnnuFBc(j3), m12301getYDnnuFBc(j2) - m12301getYDnnuFBc(j3));
    }

    /* JADX INFO: renamed from: plus-ybeJwSQ, reason: not valid java name */
    public static final long m12304plusybeJwSQ(long j2, long j3) {
        return FloatFloatPair.m12249constructorimpl(m12300getXDnnuFBc(j3) + m12300getXDnnuFBc(j2), m12301getYDnnuFBc(j3) + m12301getYDnnuFBc(j2));
    }

    /* JADX INFO: renamed from: rem-so9K2fw, reason: not valid java name */
    public static final long m12305remso9K2fw(long j2, float f2) {
        return FloatFloatPair.m12249constructorimpl(m12300getXDnnuFBc(j2) % f2, m12301getYDnnuFBc(j2) % f2);
    }

    /* JADX INFO: renamed from: times-so9K2fw, reason: not valid java name */
    public static final long m12306timesso9K2fw(long j2, float f2) {
        return FloatFloatPair.m12249constructorimpl(m12300getXDnnuFBc(j2) * f2, m12301getYDnnuFBc(j2) * f2);
    }

    /* JADX INFO: renamed from: transformed-so9K2fw, reason: not valid java name */
    public static final long m12307transformedso9K2fw(long j2, PointTransformer f2) {
        AbstractC6452k.m12181e(f2, "f");
        long jMo12309transformXgqJiTY = f2.mo12309transformXgqJiTY(m12300getXDnnuFBc(j2), m12301getYDnnuFBc(j2));
        return FloatFloatPair.m12249constructorimpl(Float.intBitsToFloat((int) (jMo12309transformXgqJiTY >> 32)), Float.intBitsToFloat((int) (jMo12309transformXgqJiTY & 4294967295L)));
    }

    /* JADX INFO: renamed from: unaryMinus-DnnuFBc, reason: not valid java name */
    public static final long m12308unaryMinusDnnuFBc(long j2) {
        return FloatFloatPair.m12249constructorimpl(-m12300getXDnnuFBc(j2), -m12301getYDnnuFBc(j2));
    }
}
