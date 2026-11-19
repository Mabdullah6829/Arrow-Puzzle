package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class Utils {
    public static final float AngleEpsilon = 1.0E-6f;
    public static final boolean DEBUG = false;
    public static final float DistanceEpsilon = 1.0E-4f;
    private static final long Zero = FloatFloatPair.m12249constructorimpl(0.0f, 0.0f);
    private static final float FloatPi = 3.1415927f;
    private static final float TwoPi = 6.2831855f;

    public static final float angle(float f2, float f3) {
        float fAtan2 = (float) Math.atan2(f3, f2);
        float f4 = TwoPi;
        return (fAtan2 + f4) % f4;
    }

    public static final void debugLog(String tag, InterfaceC6487a messageFactory) {
        AbstractC6452k.m12181e(tag, "tag");
        AbstractC6452k.m12181e(messageFactory, "messageFactory");
    }

    public static final long directionVector(float f2, float f3) {
        float fDistance = distance(f2, f3);
        if (fDistance > 0.0f) {
            return FloatFloatPair.m12249constructorimpl(f2 / fDistance, f3 / fDistance);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float distance(float f2, float f3) {
        return (float) Math.sqrt((f3 * f3) + (f2 * f2));
    }

    public static final float distanceSquared(float f2, float f3) {
        return (f3 * f3) + (f2 * f2);
    }

    public static final float findMinimum(float f2, float f3, float f4, FindMinimumFunction f5) {
        AbstractC6452k.m12181e(f5, "f");
        while (f3 - f2 > f4) {
            float f6 = 2;
            float f7 = 3;
            float f8 = ((f6 * f2) + f3) / f7;
            float f9 = ((f6 * f3) + f2) / f7;
            if (f5.invoke(f8) < f5.invoke(f9)) {
                f3 = f9;
            } else {
                f2 = f8;
            }
        }
        return (f2 + f3) / 2;
    }

    public static /* synthetic */ float findMinimum$default(float f2, float f3, float f4, FindMinimumFunction findMinimumFunction, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f4 = 0.001f;
        }
        return findMinimum(f2, f3, f4, findMinimumFunction);
    }

    public static final float getFloatPi() {
        return FloatPi;
    }

    public static final float getTwoPi() {
        return TwoPi;
    }

    public static final long getZero() {
        return Zero;
    }

    public static final float interpolate(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final float positiveModulo(float f2, float f3) {
        return ((f2 % f3) + f3) % f3;
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0, reason: not valid java name */
    public static final long m12319radialToCartesianL6JJ3z0(float f2, float f3, long j2) {
        return PointKt.m12304plusybeJwSQ(PointKt.m12306timesso9K2fw(directionVector(f3), f2), j2);
    }

    /* JADX INFO: renamed from: radialToCartesian-L6JJ3z0$default, reason: not valid java name */
    public static /* synthetic */ long m12320radialToCartesianL6JJ3z0$default(float f2, float f3, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = Zero;
        }
        return m12319radialToCartesianL6JJ3z0(f2, f3, j2);
    }

    /* JADX INFO: renamed from: rotate90-DnnuFBc, reason: not valid java name */
    public static final long m12321rotate90DnnuFBc(long j2) {
        return FloatFloatPair.m12249constructorimpl(-PointKt.m12301getYDnnuFBc(j2), PointKt.m12300getXDnnuFBc(j2));
    }

    public static final float square(float f2) {
        return f2 * f2;
    }

    public static final long directionVector(float f2) {
        double d = f2;
        return FloatFloatPair.m12249constructorimpl((float) Math.cos(d), (float) Math.sin(d));
    }
}
