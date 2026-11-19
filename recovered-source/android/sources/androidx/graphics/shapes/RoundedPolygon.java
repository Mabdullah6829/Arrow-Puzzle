package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p060f0.C6335c;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedPolygon {
    public static final Companion Companion = new Companion(null);
    private final float centerX;
    private final float centerY;
    private final List<Cubic> cubics;
    private final List<Feature> features;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RoundedPolygon(List<? extends Feature> features, float f2, float f3) {
        ArrayList arrayListM12121s;
        ArrayList arrayListM12121s2;
        Cubic cubic;
        List<Cubic> cubics;
        AbstractC6452k.m12181e(features, "features");
        this.features = features;
        this.centerX = f2;
        this.centerY = f3;
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        int i2 = 0;
        Cubic cubic2 = null;
        if (features.size() <= 0 || ((Feature) features.get(0)).getCubics().size() != 3) {
            arrayListM12121s = null;
            arrayListM12121s2 = null;
        } else {
            C6283e c6283eSplit = ((Feature) features.get(0)).getCubics().get(1).split(0.5f);
            Cubic cubic3 = (Cubic) c6283eSplit.f24308s;
            Cubic cubic4 = (Cubic) c6283eSplit.f24309t;
            arrayListM12121s2 = AbstractC6306n.m12121s(((Feature) features.get(0)).getCubics().get(0), cubic3);
            arrayListM12121s = AbstractC6306n.m12121s(cubic4, ((Feature) features.get(0)).getCubics().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i3 = 0;
            Cubic cubic5 = null;
            while (true) {
                if (i3 == 0 && arrayListM12121s != null) {
                    cubics = arrayListM12121s;
                } else if (i3 != this.features.size()) {
                    cubics = this.features.get(i3).getCubics();
                } else if (arrayListM12121s2 == null) {
                    break;
                } else {
                    cubics = arrayListM12121s2;
                }
                int size2 = cubics.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Cubic cubic6 = cubics.get(i4);
                    if (!cubic6.zeroLength$graphics_shapes_release()) {
                        if (cubic5 != null) {
                            c6335cM1747f.add(cubic5);
                        }
                        if (cubic2 == null) {
                            cubic2 = cubic6;
                            cubic5 = cubic2;
                        } else {
                            cubic5 = cubic6;
                        }
                    } else if (cubic5 != null) {
                        cubic5.getPoints$graphics_shapes_release()[6] = cubic6.getAnchor1X();
                        cubic5.getPoints$graphics_shapes_release()[7] = cubic6.getAnchor1Y();
                    }
                }
                if (i3 == size) {
                    break;
                } else {
                    i3++;
                }
            }
            cubic = cubic2;
            cubic2 = cubic5;
        } else {
            cubic = null;
        }
        if (cubic2 != null && cubic != null) {
            c6335cM1747f.add(CubicKt.Cubic(cubic2.getAnchor0X(), cubic2.getAnchor0Y(), cubic2.getControl0X(), cubic2.getControl0Y(), cubic2.getControl1X(), cubic2.getControl1Y(), cubic.getAnchor0X(), cubic.getAnchor0Y()));
        }
        C6335c c6335cM1744c = AbstractC0846b.m1744c(c6335cM1747f);
        this.cubics = c6335cM1744c;
        Object obj = c6335cM1744c.get(c6335cM1744c.mo12081a() - 1);
        int iMo12081a = c6335cM1744c.mo12081a();
        while (i2 < iMo12081a) {
            Cubic cubic7 = this.cubics.get(i2);
            Cubic cubic8 = (Cubic) obj;
            if (Math.abs(cubic7.getAnchor0X() - cubic8.getAnchor1X()) > 1.0E-4f || Math.abs(cubic7.getAnchor0Y() - cubic8.getAnchor1Y()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i2++;
            obj = cubic7;
        }
    }

    public static /* synthetic */ float[] calculateBounds$default(RoundedPolygon roundedPolygon, float[] fArr, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return roundedPolygon.calculateBounds(fArr, z);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(RoundedPolygon roundedPolygon, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        return roundedPolygon.calculateMaxBounds(fArr);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public final float[] calculateMaxBounds(float[] bounds) {
        AbstractC6452k.m12181e(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            Cubic cubic = this.cubics.get(i2);
            float fDistanceSquared = Utils.distanceSquared(cubic.getAnchor0X() - this.centerX, cubic.getAnchor0Y() - this.centerY);
            long jM12288pointOnCurveOOQOV4g$graphics_shapes_release = cubic.m12288pointOnCurveOOQOV4g$graphics_shapes_release(0.5f);
            fMax = Math.max(fMax, Math.max(fDistanceSquared, Utils.distanceSquared(PointKt.m12300getXDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerX, PointKt.m12301getYDnnuFBc(jM12288pointOnCurveOOQOV4g$graphics_shapes_release) - this.centerY)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f2 = this.centerX;
        bounds[0] = f2 - fSqrt;
        float f3 = this.centerY;
        bounds[1] = f3 - fSqrt;
        bounds[2] = f2 + fSqrt;
        bounds[3] = f3 + fSqrt;
        return bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedPolygon) {
            return AbstractC6452k.m12177a(this.features, ((RoundedPolygon) obj).features);
        }
        return false;
    }

    public final float getCenterX() {
        return this.centerX;
    }

    public final float getCenterY() {
        return this.centerY;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public final List<Feature> getFeatures$graphics_shapes_release() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public final RoundedPolygon normalized() {
        float[] fArrCalculateBounds$default = calculateBounds$default(this, null, false, 3, null);
        float f2 = fArrCalculateBounds$default[2] - fArrCalculateBounds$default[0];
        float f3 = fArrCalculateBounds$default[3] - fArrCalculateBounds$default[1];
        final float fMax = Math.max(f2, f3);
        float f4 = 2;
        final float f5 = ((fMax - f2) / f4) - fArrCalculateBounds$default[0];
        final float f6 = ((fMax - f3) / f4) - fArrCalculateBounds$default[1];
        return transformed(new PointTransformer() { // from class: androidx.graphics.shapes.RoundedPolygon.normalized.1
            @Override // androidx.graphics.shapes.PointTransformer
            /* JADX INFO: renamed from: transform-XgqJiTY */
            public final long mo12309transformXgqJiTY(float f7, float f8) {
                float f9 = f7 + f5;
                float f10 = fMax;
                return FloatFloatPair.m12249constructorimpl(f9 / f10, (f8 + f6) / f10);
            }
        });
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + AbstractC6305m.m12105A(this.cubics, null, null, null, null, 63) + " || Features = " + AbstractC6305m.m12105A(this.features, null, null, null, null, 63) + " || Center = (" + this.centerX + ", " + this.centerY + ")]";
    }

    public final RoundedPolygon transformed(PointTransformer f2) {
        AbstractC6452k.m12181e(f2, "f");
        long jM12307transformedso9K2fw = PointKt.m12307transformedso9K2fw(FloatFloatPair.m12249constructorimpl(this.centerX, this.centerY), f2);
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        int size = this.features.size();
        for (int i2 = 0; i2 < size; i2++) {
            c6335cM1747f.add(this.features.get(i2).transformed$graphics_shapes_release(f2));
        }
        return new RoundedPolygon(AbstractC0846b.m1744c(c6335cM1747f), PointKt.m12300getXDnnuFBc(jM12307transformedso9K2fw), PointKt.m12301getYDnnuFBc(jM12307transformedso9K2fw));
    }

    public final float[] calculateBounds(float[] bounds) {
        AbstractC6452k.m12181e(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    public final float[] calculateBounds(float[] bounds, boolean z) {
        AbstractC6452k.m12181e(bounds, "bounds");
        if (bounds.length >= 4) {
            int size = this.cubics.size();
            float fMax = Float.MIN_VALUE;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax2 = Float.MIN_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                this.cubics.get(i2).calculateBounds$graphics_shapes_release(bounds, z);
                fMin = Math.min(fMin, bounds[0]);
                fMin2 = Math.min(fMin2, bounds[1]);
                fMax = Math.max(fMax, bounds[2]);
                fMax2 = Math.max(fMax2, bounds[3]);
            }
            bounds[0] = fMin;
            bounds[1] = fMin2;
            bounds[2] = fMax;
            bounds[3] = fMax2;
            return bounds;
        }
        throw new IllegalArgumentException("Required bounds size of 4");
    }
}
