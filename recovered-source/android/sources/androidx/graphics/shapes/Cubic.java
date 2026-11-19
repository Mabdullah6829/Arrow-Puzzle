package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p057d0.C6283e;
import p058e0.AbstractC6302j;

/* JADX INFO: loaded from: classes.dex */
public class Cubic {
    public static final Companion Companion = new Companion(null);
    private final float[] points;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Cubic circularArc(float f2, float f3, float f4, float f5, float f6, float f7) {
            float f8 = f4 - f2;
            float f9 = f5 - f3;
            long jDirectionVector = Utils.directionVector(f8, f9);
            float f10 = f6 - f2;
            float f11 = f7 - f3;
            long jDirectionVector2 = Utils.directionVector(f10, f11);
            long jM12321rotate90DnnuFBc = Utils.m12321rotate90DnnuFBc(jDirectionVector);
            long jM12321rotate90DnnuFBc2 = Utils.m12321rotate90DnnuFBc(jDirectionVector2);
            boolean z = PointKt.m12295dotProduct5P9i7ZU(jM12321rotate90DnnuFBc, f10, f11) >= 0.0f;
            float fM12296dotProductybeJwSQ = PointKt.m12296dotProductybeJwSQ(jDirectionVector, jDirectionVector2);
            if (fM12296dotProductybeJwSQ > 0.999f) {
                return straightLine(f4, f5, f6, f7);
            }
            float f12 = 1;
            float f13 = f12 - fM12296dotProductybeJwSQ;
            float fSqrt = (((((float) Math.sqrt(2 * f13)) - ((float) Math.sqrt(f12 - (fM12296dotProductybeJwSQ * fM12296dotProductybeJwSQ)))) * ((Utils.distance(f8, f9) * 4.0f) / 3.0f)) / f13) * (z ? 1.0f : -1.0f);
            return CubicKt.Cubic(f4, f5, (PointKt.m12300getXDnnuFBc(jM12321rotate90DnnuFBc) * fSqrt) + f4, (PointKt.m12301getYDnnuFBc(jM12321rotate90DnnuFBc) * fSqrt) + f5, f6 - (PointKt.m12300getXDnnuFBc(jM12321rotate90DnnuFBc2) * fSqrt), f7 - (PointKt.m12301getYDnnuFBc(jM12321rotate90DnnuFBc2) * fSqrt), f6, f7);
        }

        public final Cubic straightLine(float f2, float f3, float f4, float f5) {
            return CubicKt.Cubic(f2, f3, Utils.interpolate(f2, f4, 0.33333334f), Utils.interpolate(f3, f5, 0.33333334f), Utils.interpolate(f2, f4, 0.6666667f), Utils.interpolate(f3, f5, 0.6666667f), f4, f5);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Cubic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void calculateBounds$graphics_shapes_release$default(Cubic cubic, float[] fArr, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateBounds");
        }
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        cubic.calculateBounds$graphics_shapes_release(fArr, z);
    }

    public static final Cubic circularArc(float f2, float f3, float f4, float f5, float f6, float f7) {
        return Companion.circularArc(f2, f3, f4, f5, f6, f7);
    }

    public static final Cubic straightLine(float f2, float f3, float f4, float f5) {
        return Companion.straightLine(f2, f3, f4, f5);
    }

    private final boolean zeroIsh(float f2) {
        return Math.abs(f2) < 1.0E-4f;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cb A[PHI: r3 r7
  0x01cb: PHI (r3v15 float) = (r3v12 float), (r3v21 float) binds: [B:85:0x021a, B:62:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cb: PHI (r7v14 float) = (r7v10 float), (r7v16 float) binds: [B:85:0x021a, B:62:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d A[PHI: r9 r13
  0x021d: PHI (r9v5 float) = (r9v2 float), (r9v3 float), (r9v3 float), (r9v2 float), (r9v2 float), (r9v2 float) binds: [B:65:0x01d4, B:77:0x0203, B:79:0x0207, B:51:0x01a8, B:54:0x01b2, B:56:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x021d: PHI (r13v13 float) = (r13v9 float), (r13v10 float), (r13v10 float), (r13v9 float), (r13v9 float), (r13v9 float) binds: [B:65:0x01d4, B:77:0x0203, B:79:0x0207, B:51:0x01a8, B:54:0x01b2, B:56:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    public final void calculateBounds$graphics_shapes_release(float[] bounds, boolean z) {
        char c;
        char c2;
        char c3;
        float f2;
        float anchor1Y;
        float control1Y;
        float control0Y;
        float f3;
        float fSqrt;
        float fSqrt2;
        float fM12301getYDnnuFBc;
        float f4;
        float fM12301getYDnnuFBc2;
        float f5;
        AbstractC6452k.m12181e(bounds, "bounds");
        if (zeroLength$graphics_shapes_release()) {
            bounds[0] = getAnchor0X();
            bounds[1] = getAnchor0Y();
            bounds[2] = getAnchor0X();
            bounds[3] = getAnchor0Y();
            return;
        }
        float fMin = Math.min(getAnchor0X(), getAnchor1X());
        float fMin2 = Math.min(getAnchor0Y(), getAnchor1Y());
        float fMax = Math.max(getAnchor0X(), getAnchor1X());
        float fMax2 = Math.max(getAnchor0Y(), getAnchor1Y());
        if (z) {
            bounds[0] = Math.min(fMin, Math.min(getControl0X(), getControl1X()));
            bounds[1] = Math.min(fMin2, Math.min(getControl0Y(), getControl1Y()));
            bounds[2] = Math.max(fMax, Math.max(getControl0X(), getControl1X()));
            bounds[3] = Math.max(fMax2, Math.max(getControl0Y(), getControl1Y()));
            return;
        }
        float f6 = 3;
        float anchor1X = getAnchor1X() + (((getControl0X() * f6) + (-getAnchor0X())) - (getControl1X() * f6));
        float f7 = 2;
        float f8 = 4;
        float control1X = (getControl1X() * f7) + ((getAnchor0X() * f7) - (getControl0X() * f8));
        float control0X = getControl0X() + (-getAnchor0X());
        if (!zeroIsh(anchor1X)) {
            float f9 = (control1X * control1X) - ((f8 * anchor1X) * control0X);
            if (f9 >= 0.0f) {
                float f10 = -control1X;
                c = 0;
                c2 = 3;
                double d = f9;
                c3 = 2;
                f2 = fMin2;
                float f11 = anchor1X * f7;
                float fSqrt3 = (((float) Math.sqrt(d)) + f10) / f11;
                if (0.0f <= fSqrt3 && fSqrt3 <= 1.0f) {
                    float fM12300getXDnnuFBc = PointKt.m12300getXDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt3));
                    if (fM12300getXDnnuFBc < fMin) {
                        fMin = fM12300getXDnnuFBc;
                    }
                    if (fM12300getXDnnuFBc > fMax) {
                        fMax = fM12300getXDnnuFBc;
                    }
                }
                float fSqrt4 = (f10 - ((float) Math.sqrt(d))) / f11;
                if (0.0f <= fSqrt4 && fSqrt4 <= 1.0f) {
                    float fM12300getXDnnuFBc2 = PointKt.m12300getXDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt4));
                    if (fM12300getXDnnuFBc2 < fMin) {
                        fMin = fM12300getXDnnuFBc2;
                    }
                    if (fM12300getXDnnuFBc2 > fMax) {
                        fMax = fM12300getXDnnuFBc2;
                    }
                }
            }
            anchor1Y = getAnchor1Y() + (((getControl0Y() * f6) + (-getAnchor0Y())) - (getControl1Y() * f6));
            control1Y = (getControl1Y() * f7) + ((getAnchor0Y() * f7) - (getControl0Y() * f8));
            control0Y = getControl0Y() + (-getAnchor0Y());
            if (zeroIsh(anchor1Y)) {
                f3 = (control1Y * control1Y) - ((f8 * anchor1Y) * control0Y);
                if (f3 >= 0.0f) {
                    float f12 = -control1Y;
                    double d2 = f3;
                    float f13 = f7 * anchor1Y;
                    fSqrt = (((float) Math.sqrt(d2)) + f12) / f13;
                    if (0.0f <= fSqrt && fSqrt <= 1.0f) {
                        fM12301getYDnnuFBc2 = PointKt.m12301getYDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt));
                        if (fM12301getYDnnuFBc2 < f2) {
                            f2 = fM12301getYDnnuFBc2;
                        }
                        if (fM12301getYDnnuFBc2 > fMax2) {
                            fMax2 = fM12301getYDnnuFBc2;
                        }
                    }
                    fSqrt2 = (f12 - ((float) Math.sqrt(d2))) / f13;
                    if (0.0f <= fSqrt2 || fSqrt2 > 1.0f) {
                        f4 = f2;
                    } else {
                        fM12301getYDnnuFBc = PointKt.m12301getYDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt2));
                        f4 = fM12301getYDnnuFBc < f2 ? fM12301getYDnnuFBc : f2;
                        if (fM12301getYDnnuFBc > fMax2) {
                            fMax2 = fM12301getYDnnuFBc;
                        }
                    }
                } else {
                    f4 = f2;
                }
            } else if (control1Y == 0.0f) {
                f4 = f2;
            } else {
                f5 = (f7 * control0Y) / ((-2) * control1Y);
                if (0.0f <= f5 || f5 > 1.0f) {
                    f4 = f2;
                } else {
                    fM12301getYDnnuFBc = PointKt.m12301getYDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(f5));
                    f4 = fM12301getYDnnuFBc < f2 ? fM12301getYDnnuFBc : f2;
                    if (fM12301getYDnnuFBc > fMax2) {
                        fMax2 = fM12301getYDnnuFBc;
                    }
                }
            }
            bounds[c] = fMin;
            bounds[1] = f4;
            bounds[c3] = fMax;
            bounds[c2] = fMax2;
        }
        if (control1X != 0.0f) {
            float f14 = (control0X * f7) / ((-2) * control1X);
            if (0.0f <= f14 && f14 <= 1.0f) {
                float fM12300getXDnnuFBc3 = PointKt.m12300getXDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(f14));
                if (fM12300getXDnnuFBc3 < fMin) {
                    fMin = fM12300getXDnnuFBc3;
                }
                if (fM12300getXDnnuFBc3 > fMax) {
                    fMax = fM12300getXDnnuFBc3;
                }
            }
        }
        c = 0;
        c2 = 3;
        c3 = 2;
        f2 = fMin2;
        anchor1Y = getAnchor1Y() + (((getControl0Y() * f6) + (-getAnchor0Y())) - (getControl1Y() * f6));
        control1Y = (getControl1Y() * f7) + ((getAnchor0Y() * f7) - (getControl0Y() * f8));
        control0Y = getControl0Y() + (-getAnchor0Y());
        if (zeroIsh(anchor1Y)) {
            f3 = (control1Y * control1Y) - ((f8 * anchor1Y) * control0Y);
            if (f3 >= 0.0f) {
                float f15 = -control1Y;
                double d3 = f3;
                float f16 = f7 * anchor1Y;
                fSqrt = (((float) Math.sqrt(d3)) + f15) / f16;
                if (0.0f <= fSqrt) {
                    fM12301getYDnnuFBc2 = PointKt.m12301getYDnnuFBc(m12288pointOnCurveOOQOV4g$graphics_shapes_release(fSqrt));
                    if (fM12301getYDnnuFBc2 < f2) {
                        f2 = fM12301getYDnnuFBc2;
                    }
                    if (fM12301getYDnnuFBc2 > fMax2) {
                        fMax2 = fM12301getYDnnuFBc2;
                    }
                }
                fSqrt2 = (f15 - ((float) Math.sqrt(d3))) / f16;
                if (0.0f <= fSqrt2) {
                    f4 = f2;
                } else {
                    f4 = f2;
                }
            } else {
                f4 = f2;
            }
        } else if (control1Y == 0.0f) {
            f4 = f2;
        } else {
            f5 = (f7 * control0Y) / ((-2) * control1Y);
            if (0.0f <= f5) {
                f4 = f2;
            } else {
                f4 = f2;
            }
        }
        bounds[c] = fMin;
        bounds[1] = f4;
        bounds[c3] = fMax;
        bounds[c2] = fMax2;
    }

    public final Cubic div(float f2) {
        return times(1.0f / f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cubic) {
            return Arrays.equals(this.points, ((Cubic) obj).points);
        }
        return false;
    }

    public final float getAnchor0X() {
        return this.points[0];
    }

    public final float getAnchor0Y() {
        return this.points[1];
    }

    public final float getAnchor1X() {
        return this.points[6];
    }

    public final float getAnchor1Y() {
        return this.points[7];
    }

    public final float getControl0X() {
        return this.points[2];
    }

    public final float getControl0Y() {
        return this.points[3];
    }

    public final float getControl1X() {
        return this.points[4];
    }

    public final float getControl1Y() {
        return this.points[5];
    }

    public final float[] getPoints$graphics_shapes_release() {
        return this.points;
    }

    public int hashCode() {
        return Arrays.hashCode(this.points);
    }

    public final Cubic plus(Cubic o) {
        AbstractC6452k.m12181e(o, "o");
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.points[i2] + o.points[i2];
        }
        return new Cubic(fArr);
    }

    /* JADX INFO: renamed from: pointOnCurve-OOQOV4g$graphics_shapes_release, reason: not valid java name */
    public final long m12288pointOnCurveOOQOV4g$graphics_shapes_release(float f2) {
        float f3 = 1 - f2;
        float f4 = f3 * f3 * f3;
        float f5 = 3 * f2;
        float f6 = f5 * f3 * f3;
        float f7 = f5 * f2 * f3;
        float f8 = f2 * f2 * f2;
        return FloatFloatPair.m12249constructorimpl((getAnchor1X() * f8) + (getControl1X() * f7) + (getControl0X() * f6) + (getAnchor0X() * f4), (getAnchor1Y() * f8) + (getControl1Y() * f7) + (getControl0Y() * f6) + (getAnchor0Y() * f4));
    }

    public final Cubic reverse() {
        return CubicKt.Cubic(getAnchor1X(), getAnchor1Y(), getControl1X(), getControl1Y(), getControl0X(), getControl0Y(), getAnchor0X(), getAnchor0Y());
    }

    public final C6283e split(float f2) {
        float f3 = 1 - f2;
        long jM12288pointOnCurveOOQOV4g$graphics_shapes_release = m12288pointOnCurveOOQOV4g$graphics_shapes_release(f2);
        float f4 = f3 * f3;
        float f5 = 2 * f3 * f2;
        float f6 = f2 * f2;
        return new C6283e(CubicKt.Cubic(getAnchor0X(), getAnchor0Y(), (getAnchor0X() * f3) + (getControl0X() * f2), (getAnchor0Y() * f3) + (getControl0Y() * f2), (getControl1X() * f6) + (getControl0X() * f5) + (getAnchor0X() * f4), (getControl1Y() * f6) + (getControl0Y() * f5) + (getAnchor0Y() * f4), PointKt.m12300getXDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m12301getYDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release)), CubicKt.Cubic(PointKt.m12300getXDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release), PointKt.m12301getYDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release), (getAnchor1X() * f6) + (getControl1X() * f5) + (getControl0X() * f4), (getAnchor1Y() * f6) + (getControl1Y() * f5) + (getControl0Y() * f4), (getAnchor1X() * f2) + (getControl1X() * f3), (getAnchor1Y() * f2) + (getControl1Y() * f3), getAnchor1X(), getAnchor1Y()));
    }

    public final Cubic times(float f2) {
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = this.points[i2] * f2;
        }
        return new Cubic(fArr);
    }

    public String toString() {
        return "anchor0: (" + getAnchor0X() + ", " + getAnchor0Y() + ") control0: (" + getControl0X() + ", " + getControl0Y() + "), control1: (" + getControl1X() + ", " + getControl1Y() + "), anchor1: (" + getAnchor1X() + ", " + getAnchor1Y() + ')';
    }

    public final Cubic transformed(PointTransformer f2) {
        AbstractC6452k.m12181e(f2, "f");
        MutableCubic mutableCubic = new MutableCubic();
        float[] fArr = this.points;
        AbstractC6302j.m12100v(fArr, 0, mutableCubic.getPoints$graphics_shapes_release(), 0, fArr.length);
        mutableCubic.transform(f2);
        return mutableCubic;
    }

    public final boolean zeroLength$graphics_shapes_release() {
        return Math.abs(getAnchor0X() - getAnchor1X()) < 1.0E-4f && Math.abs(getAnchor0Y() - getAnchor1Y()) < 1.0E-4f;
    }

    public /* synthetic */ Cubic(long j2, long j3, long j4, long j5, AbstractC6447f abstractC6447f) {
        this(j2, j3, j4, j5);
    }

    public final Cubic div(int i2) {
        return div(i2);
    }

    public final Cubic times(int i2) {
        return times(i2);
    }

    public Cubic(float[] points) {
        AbstractC6452k.m12181e(points, "points");
        this.points = points;
        if (points.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public /* synthetic */ Cubic(float[] fArr, int i2, AbstractC6447f abstractC6447f) {
        this((i2 & 1) != 0 ? new float[8] : fArr);
    }

    private Cubic(long j2, long j3, long j4, long j5) {
        this(new float[]{PointKt.m12300getXDnnuFBc(j2), PointKt.m12301getYDnnuFBc(j2), PointKt.m12300getXDnnuFBc(j3), PointKt.m12301getYDnnuFBc(j3), PointKt.m12300getXDnnuFBc(j4), PointKt.m12301getYDnnuFBc(j4), PointKt.m12300getXDnnuFBc(j5), PointKt.m12301getYDnnuFBc(j5)});
    }
}
