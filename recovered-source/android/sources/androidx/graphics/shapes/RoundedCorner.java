package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6306n;

/* JADX INFO: loaded from: classes.dex */
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;

    /* JADX INFO: renamed from: d1 */
    private final long f2805d1;

    /* JADX INFO: renamed from: d2 */
    private final long f2806d2;
    private final float expectedRoundCut;

    /* JADX INFO: renamed from: p0 */
    private final long f2807p0;

    /* JADX INFO: renamed from: p1 */
    private final long f2808p1;

    /* JADX INFO: renamed from: p2 */
    private final long f2809p2;
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    public /* synthetic */ RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding, AbstractC6447f abstractC6447f) {
        this(j2, j3, j4, cornerRounding);
    }

    private final float calculateActualSmoothingValue(float f2) {
        if (f2 > getExpectedCut()) {
            return this.smoothing;
        }
        float f3 = this.expectedRoundCut;
        if (f2 <= f3) {
            return 0.0f;
        }
        return ((f2 - f3) * this.smoothing) / (getExpectedCut() - this.expectedRoundCut);
    }

    /* JADX INFO: renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m12310computeFlankingCurveoAJzIJU(float f2, float f3, long j2, long j3, long j4, long j5, long j6, float f4) {
        long jM12297getDirectionDnnuFBc = PointKt.m12297getDirectionDnnuFBc(PointKt.m12303minusybeJwSQ(j3, j2));
        long jM12304plusybeJwSQ = PointKt.m12304plusybeJwSQ(j2, PointKt.m12306timesso9K2fw(PointKt.m12306timesso9K2fw(jM12297getDirectionDnnuFBc, f2), 1 + f3));
        long jM12257unboximpl = j4;
        long jM12302interpolatedLqxh1s = PointKt.m12302interpolatedLqxh1s(jM12257unboximpl, PointKt.m12294divso9K2fw(PointKt.m12304plusybeJwSQ(j4, j5), 2.0f), f3);
        long jM12304plusybeJwSQ2 = PointKt.m12304plusybeJwSQ(j6, PointKt.m12306timesso9K2fw(Utils.directionVector(PointKt.m12300getXDnnuFBc(jM12302interpolatedLqxh1s) - PointKt.m12300getXDnnuFBc(j6), PointKt.m12301getYDnnuFBc(jM12302interpolatedLqxh1s) - PointKt.m12301getYDnnuFBc(j6)), f4));
        FloatFloatPair floatFloatPairM12311lineIntersectionCBFvKDc = m12311lineIntersectionCBFvKDc(j3, jM12297getDirectionDnnuFBc, jM12304plusybeJwSQ2, Utils.m12321rotate90DnnuFBc(PointKt.m12303minusybeJwSQ(jM12304plusybeJwSQ2, j6)));
        if (floatFloatPairM12311lineIntersectionCBFvKDc != null) {
            jM12257unboximpl = floatFloatPairM12311lineIntersectionCBFvKDc.m12257unboximpl();
        }
        return new Cubic(jM12304plusybeJwSQ, PointKt.m12294divso9K2fw(PointKt.m12304plusybeJwSQ(jM12304plusybeJwSQ, PointKt.m12306timesso9K2fw(jM12257unboximpl, 2.0f)), 3.0f), jM12257unboximpl, jM12304plusybeJwSQ2, null);
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return roundedCorner.getCubics(f2, f3);
    }

    /* JADX INFO: renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m12311lineIntersectionCBFvKDc(long j2, long j3, long j4, long j5) {
        long jM12321rotate90DnnuFBc = Utils.m12321rotate90DnnuFBc(j5);
        float fM12296dotProductybeJwSQ = PointKt.m12296dotProductybeJwSQ(j3, jM12321rotate90DnnuFBc);
        if (Math.abs(fM12296dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float fM12296dotProductybeJwSQ2 = PointKt.m12296dotProductybeJwSQ(PointKt.m12303minusybeJwSQ(j4, j2), jM12321rotate90DnnuFBc);
        if (Math.abs(fM12296dotProductybeJwSQ) < Math.abs(fM12296dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m12246boximpl(PointKt.m12304plusybeJwSQ(j2, PointKt.m12306timesso9K2fw(j3, fM12296dotProductybeJwSQ2 / fM12296dotProductybeJwSQ)));
    }

    /* JADX INFO: renamed from: getCenter-1ufDz9w, reason: not valid java name */
    public final long m12312getCenter1ufDz9w() {
        return this.center;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    public final List<Cubic> getCubics(float f2) {
        return getCubics$default(this, f2, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: getD1-1ufDz9w, reason: not valid java name */
    public final long m12313getD11ufDz9w() {
        return this.f2805d1;
    }

    /* JADX INFO: renamed from: getD2-1ufDz9w, reason: not valid java name */
    public final long m12314getD21ufDz9w() {
        return this.f2806d2;
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    /* JADX INFO: renamed from: getP0-1ufDz9w, reason: not valid java name */
    public final long m12315getP01ufDz9w() {
        return this.f2807p0;
    }

    /* JADX INFO: renamed from: getP1-1ufDz9w, reason: not valid java name */
    public final long m12316getP11ufDz9w() {
        return this.f2808p1;
    }

    /* JADX INFO: renamed from: getP2-1ufDz9w, reason: not valid java name */
    public final long m12317getP21ufDz9w() {
        return this.f2809p2;
    }

    public final CornerRounding getRounding() {
        return this.rounding;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    /* JADX INFO: renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m12318setCenterDnnuFBc(long j2) {
        this.center = j2;
    }

    private RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding) {
        this.f2807p0 = j2;
        this.f2808p1 = j3;
        this.f2809p2 = j4;
        this.rounding = cornerRounding;
        long jM12297getDirectionDnnuFBc = PointKt.m12297getDirectionDnnuFBc(PointKt.m12303minusybeJwSQ(j2, j3));
        this.f2805d1 = jM12297getDirectionDnnuFBc;
        long jM12297getDirectionDnnuFBc2 = PointKt.m12297getDirectionDnnuFBc(PointKt.m12303minusybeJwSQ(j4, j3));
        this.f2806d2 = jM12297getDirectionDnnuFBc2;
        float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
        float fM12296dotProductybeJwSQ = PointKt.m12296dotProductybeJwSQ(jM12297getDirectionDnnuFBc, jM12297getDirectionDnnuFBc2);
        this.cosAngle = fM12296dotProductybeJwSQ;
        float f2 = 1;
        float fSqrt = (float) Math.sqrt(f2 - Utils.square(fM12296dotProductybeJwSQ));
        this.sinAngle = fSqrt;
        this.expectedRoundCut = ((double) fSqrt) > 0.001d ? ((fM12296dotProductybeJwSQ + f2) * radius) / fSqrt : 0.0f;
        this.center = FloatFloatPair.m12249constructorimpl(0.0f, 0.0f);
    }

    public final List<Cubic> getCubics(float f2, float f3) {
        float fMin = Math.min(f2, f3);
        float f4 = this.expectedRoundCut;
        if (f4 < 1.0E-4f || fMin < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            long j2 = this.f2808p1;
            this.center = j2;
            return AbstractC0846b.m1752k(Cubic.Companion.straightLine(PointKt.m12300getXDnnuFBc(j2), PointKt.m12301getYDnnuFBc(this.f2808p1), PointKt.m12300getXDnnuFBc(this.f2808p1), PointKt.m12301getYDnnuFBc(this.f2808p1)));
        }
        float fMin2 = Math.min(fMin, f4);
        float fCalculateActualSmoothingValue = calculateActualSmoothingValue(f2);
        float fCalculateActualSmoothingValue2 = calculateActualSmoothingValue(f3);
        float f5 = (this.cornerRadius * fMin2) / this.expectedRoundCut;
        this.center = PointKt.m12304plusybeJwSQ(this.f2808p1, PointKt.m12306timesso9K2fw(PointKt.m12297getDirectionDnnuFBc(PointKt.m12294divso9K2fw(PointKt.m12304plusybeJwSQ(this.f2805d1, this.f2806d2), 2.0f)), (float) Math.sqrt(Utils.square(fMin2) + Utils.square(f5))));
        long jM12304plusybeJwSQ = PointKt.m12304plusybeJwSQ(this.f2808p1, PointKt.m12306timesso9K2fw(this.f2805d1, fMin2));
        long jM12304plusybeJwSQ2 = PointKt.m12304plusybeJwSQ(this.f2808p1, PointKt.m12306timesso9K2fw(this.f2806d2, fMin2));
        Cubic cubicM12310computeFlankingCurveoAJzIJU = m12310computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue, this.f2808p1, this.f2807p0, jM12304plusybeJwSQ, jM12304plusybeJwSQ2, this.center, f5);
        Cubic cubicReverse = m12310computeFlankingCurveoAJzIJU(fMin2, fCalculateActualSmoothingValue2, this.f2808p1, this.f2809p2, jM12304plusybeJwSQ2, jM12304plusybeJwSQ, this.center, f5).reverse();
        return AbstractC6306n.m12120r(cubicM12310computeFlankingCurveoAJzIJU, Cubic.Companion.circularArc(PointKt.m12300getXDnnuFBc(this.center), PointKt.m12301getYDnnuFBc(this.center), cubicM12310computeFlankingCurveoAJzIJU.getAnchor1X(), cubicM12310computeFlankingCurveoAJzIJU.getAnchor1Y(), cubicReverse.getAnchor0X(), cubicReverse.getAnchor0Y()), cubicReverse);
    }

    public /* synthetic */ RoundedCorner(long j2, long j3, long j4, CornerRounding cornerRounding, int i2, AbstractC6447f abstractC6447f) {
        this(j2, j3, j4, (i2 & 8) != 0 ? null : cornerRounding, null);
    }
}
