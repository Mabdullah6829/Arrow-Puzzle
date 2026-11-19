package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6311s;
import p058e0.AbstractC6316x;
import p087v0.C6544c;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public final class ShapesKt {
    public static final RoundedPolygon circle(RoundedPolygon.Companion companion) {
        AbstractC6452k.m12181e(companion, "<this>");
        return circle$default(companion, 0, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ RoundedPolygon circle$default(RoundedPolygon.Companion companion, int i2, float f2, float f3, float f4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 8;
        }
        if ((i3 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.0f;
        }
        return circle(companion, i2, f2, f3, f4);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pill$default(companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ RoundedPolygon pill$default(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 2.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return pill(companion, f2, f3, f4, f5, (i2 & 16) != 0 ? 0.0f : f6);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pillStar$default(companion, 0.0f, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2047, null);
    }

    public static /* synthetic */ RoundedPolygon pillStar$default(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f5, float f6, float f7, float f8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = 2.0f;
        }
        if ((i3 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i3 & 4) != 0) {
            i2 = 8;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.5f;
        }
        if ((i3 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i3 & 32) != 0) {
            cornerRounding2 = null;
        }
        if ((i3 & 64) != 0) {
            list = null;
        }
        if ((i3 & 128) != 0) {
            f5 = 0.5f;
        }
        if ((i3 & 256) != 0) {
            f6 = 0.0f;
        }
        if ((i3 & 512) != 0) {
            f7 = 0.0f;
        }
        return pillStar(companion, f2, f3, i2, f4, cornerRounding, cornerRounding2, list, f5, f6, f7, (i3 & 1024) != 0 ? 0.0f : f8);
    }

    private static final float[] pillStarVerticesFromNumVerts(int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9;
        float f10;
        long jM12249constructorimpl;
        float fMin = Math.min(f2, f3);
        float f11 = f3 - f2;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        float f12 = f2 - f3;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        float f13 = 2;
        float f14 = f11 / f13;
        float f15 = f12 / f13;
        float fInterpolate = Utils.interpolate(f4, 1.0f, f5) * Utils.getTwoPi() * fMin;
        float f16 = (f13 * f11) + (f13 * f12) + fInterpolate;
        float f17 = fInterpolate / 4;
        float f18 = f14 + f17;
        float f19 = f18 + f12;
        float f20 = f19 + f17;
        float f21 = f20 + f11;
        float f22 = f21 + f17;
        float f23 = f22 + f12;
        float f24 = f23 + f17;
        float[] fArr = {0.0f, f14, f18, f19, f20, f21, f22, f23, f24, f24 + f14, f16};
        int i3 = i2 * 2;
        float f25 = f16 / i3;
        float f26 = f6 * f16;
        float[] fArr2 = new float[i2 * 4];
        float f27 = f12;
        long jM12249constructorimpl2 = FloatFloatPair.m12249constructorimpl(f15, f14);
        float f28 = -f15;
        long jM12249constructorimpl3 = FloatFloatPair.m12249constructorimpl(f28, f14);
        float f29 = -f14;
        long jM12249constructorimpl4 = FloatFloatPair.m12249constructorimpl(f28, f29);
        long jM12249constructorimpl5 = FloatFloatPair.m12249constructorimpl(f15, f29);
        float f30 = f11;
        float f31 = f14;
        int i4 = 0;
        float f32 = 0.0f;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            float f33 = f26 % f16;
            if (f33 < f32) {
                i5 = 0;
            }
            while (true) {
                int i7 = (i5 + 1) % 11;
                float f34 = fArr[i7];
                if (f33 >= f34) {
                    f31 = fArr[(i7 + 1) % 11];
                    i5 = i7;
                    f32 = f34;
                } else {
                    float f35 = (f33 - f32) / (f31 - f32);
                    float f36 = z ? fMin * f4 : fMin;
                    switch (i5) {
                        case 0:
                            f9 = f14;
                            float f37 = f36;
                            f10 = f15;
                            jM12249constructorimpl = FloatFloatPair.m12249constructorimpl(f37, f35 * f9);
                            break;
                        case 1:
                            f9 = f14;
                            float f38 = f36;
                            f10 = f15;
                            jM12249constructorimpl = PointKt.m12304plusybeJwSQ(Utils.m12320radialToCartesianL6JJ3z0$default(f38, (Utils.getFloatPi() * f35) / f13, 0L, 4, null), jM12249constructorimpl2);
                            break;
                        case 2:
                            f9 = f14;
                            float f39 = f36;
                            f10 = f15;
                            jM12249constructorimpl = FloatFloatPair.m12249constructorimpl(f10 - (f35 * f27), f39);
                            break;
                        case 3:
                            f9 = f14;
                            float f40 = f36;
                            f10 = f15;
                            jM12249constructorimpl = PointKt.m12304plusybeJwSQ(Utils.m12320radialToCartesianL6JJ3z0$default(f40, ((Utils.getFloatPi() * f35) / f13) + (Utils.getFloatPi() / f13), 0L, 4, null), jM12249constructorimpl3);
                            break;
                        case 4:
                            f9 = f14;
                            float f41 = f36;
                            f10 = f15;
                            jM12249constructorimpl = FloatFloatPair.m12249constructorimpl(-f41, f9 - (f35 * f30));
                            break;
                        case 5:
                            f9 = f14;
                            float f42 = f36;
                            f10 = f15;
                            jM12249constructorimpl = PointKt.m12304plusybeJwSQ(Utils.m12320radialToCartesianL6JJ3z0$default(f42, ((Utils.getFloatPi() * f35) / f13) + Utils.getFloatPi(), 0L, 4, null), jM12249constructorimpl4);
                            break;
                        case 6:
                            f9 = f14;
                            float f43 = f36;
                            f10 = f15;
                            jM12249constructorimpl = FloatFloatPair.m12249constructorimpl((f35 * f27) + f28, -f43);
                            break;
                        case 7:
                            f9 = f14;
                            float f44 = f36;
                            f10 = f15;
                            jM12249constructorimpl = PointKt.m12304plusybeJwSQ(Utils.m12320radialToCartesianL6JJ3z0$default(f44, ((Utils.getFloatPi() * f35) / f13) + (Utils.getFloatPi() * 1.5f), 0L, 4, null), jM12249constructorimpl5);
                            break;
                        default:
                            f9 = f14;
                            jM12249constructorimpl = FloatFloatPair.m12249constructorimpl(f36, (f35 * f14) + f29);
                            f10 = f15;
                            break;
                    }
                    int i8 = i6 + 1;
                    fArr2[i6] = PointKt.m12300getXDnnuFBc(jM12249constructorimpl) + f7;
                    i6 += 2;
                    fArr2[i8] = PointKt.m12301getYDnnuFBc(jM12249constructorimpl) + f8;
                    f26 += f25;
                    z = !z;
                    f15 = f10;
                    i4++;
                    f14 = f9;
                }
            }
        }
        return fArr2;
    }

    public static final RoundedPolygon rectangle(RoundedPolygon.Companion companion, float f2, float f3, CornerRounding rounding, List<CornerRounding> list, float f4, float f5) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        float f6 = 2;
        float f7 = f2 / f6;
        float f8 = f4 - f7;
        float f9 = f3 / f6;
        float f10 = f5 - f9;
        float f11 = f7 + f4;
        float f12 = f9 + f5;
        return RoundedPolygonKt.RoundedPolygon(new float[]{f11, f12, f8, f12, f8, f10, f11, f10}, rounding, list, f4, f5);
    }

    public static /* synthetic */ RoundedPolygon rectangle$default(RoundedPolygon.Companion companion, float f2, float f3, CornerRounding cornerRounding, List list, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 2.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 2.0f;
        }
        if ((i2 & 4) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i2 & 8) != 0) {
            list = null;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f5 = 0.0f;
        }
        return rectangle(companion, f2, f3, cornerRounding, list, f4, f5);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return star$default(companion, i2, 0.0f, 0.0f, null, null, null, 0.0f, 0.0f, 254, null);
    }

    public static /* synthetic */ RoundedPolygon star$default(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding cornerRounding, CornerRounding cornerRounding2, List list, float f4, float f5, int i3, Object obj) {
        return star(companion, i2, (i3 & 2) != 0 ? 1.0f : f2, (i3 & 4) != 0 ? 0.5f : f3, (i3 & 8) != 0 ? CornerRounding.Unrounded : cornerRounding, (i3 & 16) != 0 ? null : cornerRounding2, (i3 & 32) == 0 ? list : null, (i3 & 64) != 0 ? 0.0f : f4, (i3 & 128) != 0 ? 0.0f : f5);
    }

    private static final float[] starVerticesFromNumVerts(int i2, float f2, float f3, float f4, float f5) {
        float[] fArr = new float[i2 * 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            float f6 = i2;
            long jM12320radialToCartesianL6JJ3z0$default = Utils.m12320radialToCartesianL6JJ3z0$default(f2, (Utils.getFloatPi() / f6) * 2 * i4, 0L, 4, null);
            fArr[i3] = PointKt.m12300getXDnnuFBc(jM12320radialToCartesianL6JJ3z0$default) + f4;
            fArr[i3 + 1] = PointKt.m12301getYDnnuFBc(jM12320radialToCartesianL6JJ3z0$default) + f5;
            long jM12320radialToCartesianL6JJ3z0$default2 = Utils.m12320radialToCartesianL6JJ3z0$default(f3, (Utils.getFloatPi() / f6) * ((i4 * 2) + 1), 0L, 4, null);
            int i5 = i3 + 3;
            fArr[i3 + 2] = PointKt.m12300getXDnnuFBc(jM12320radialToCartesianL6JJ3z0$default2) + f4;
            i3 += 4;
            fArr[i5] = PointKt.m12301getYDnnuFBc(jM12320radialToCartesianL6JJ3z0$default2) + f5;
        }
        return fArr;
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return circle$default(companion, i2, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pill$default(companion, f2, 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pillStar$default(companion, f2, 0.0f, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2046, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return star$default(companion, i2, f2, 0.0f, null, null, null, 0.0f, 0.0f, 252, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return circle$default(companion, i2, f2, 0.0f, 0.0f, 12, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pill$default(companion, f2, f3, 0.0f, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pillStar$default(companion, f2, f3, 0, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2044, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3) {
        AbstractC6452k.m12181e(companion, "<this>");
        return star$default(companion, i2, f2, f3, null, null, null, 0.0f, 0.0f, 248, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2, float f3) {
        AbstractC6452k.m12181e(companion, "<this>");
        return circle$default(companion, i2, f2, f3, 0.0f, 8, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pill$default(companion, f2, f3, f4, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pillStar$default(companion, f2, f3, i2, 0.0f, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2040, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding rounding) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return star$default(companion, i2, f2, f3, rounding, null, null, 0.0f, 0.0f, 240, null);
    }

    public static final RoundedPolygon circle(RoundedPolygon.Companion companion, int i2, float f2, float f3, float f4) {
        AbstractC6452k.m12181e(companion, "<this>");
        if (i2 >= 3) {
            return RoundedPolygonKt.RoundedPolygon$default(i2, f2 / ((float) Math.cos(Utils.getFloatPi() / i2)), f3, f4, new CornerRounding(f2, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pill$default(companion, f2, f3, f4, f5, 0.0f, 16, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4) {
        AbstractC6452k.m12181e(companion, "<this>");
        return pillStar$default(companion, f2, f3, i2, f4, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2032, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding rounding, CornerRounding cornerRounding) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return star$default(companion, i2, f2, f3, rounding, cornerRounding, null, 0.0f, 0.0f, 224, null);
    }

    public static final RoundedPolygon pill(RoundedPolygon.Companion companion, float f2, float f3, float f4, float f5, float f6) {
        AbstractC6452k.m12181e(companion, "<this>");
        if (f2 > 0.0f && f3 > 0.0f) {
            float f7 = 2;
            float f8 = f2 / f7;
            float f9 = f3 / f7;
            float f10 = f8 + f5;
            float f11 = f9 + f6;
            float f12 = (-f8) + f5;
            float f13 = (-f9) + f6;
            return RoundedPolygonKt.RoundedPolygon$default(new float[]{f10, f11, f12, f11, f12, f13, f10, f13}, new CornerRounding(Math.min(f8, f9), f4), null, f5, f6, 4, null);
        }
        throw new IllegalArgumentException("Pill shapes must have positive width and height");
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 2016, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return star$default(companion, i2, f2, f3, rounding, cornerRounding, list, 0.0f, 0.0f, 192, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, cornerRounding, null, 0.0f, 0.0f, 0.0f, 0.0f, 1984, null);
    }

    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f4) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return star$default(companion, i2, f2, f3, rounding, cornerRounding, list, f4, 0.0f, 128, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, cornerRounding, list, 0.0f, 0.0f, 0.0f, 0.0f, 1920, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List<androidx.graphics.shapes.CornerRounding>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final RoundedPolygon star(RoundedPolygon.Companion companion, int i2, float f2, float f3, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f4, float f5) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f3 < f2) {
            if (list == 0 && cornerRounding != null) {
                C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i2);
                list = new ArrayList<>();
                Iterator it = c6545dM1757p.iterator();
                while (((C6544c) it).f24772u) {
                    ((AbstractC6316x) it).nextInt();
                    AbstractC6311s.m12124v(AbstractC6306n.m12120r(rounding, cornerRounding), list);
                }
            }
            return RoundedPolygonKt.RoundedPolygon(starVerticesFromNumVerts(i2, f2, f3, f4, f5), rounding, (List<CornerRounding>) list, f4, f5);
        }
        throw new IllegalArgumentException("innerRadius must be less than radius");
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f5) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, cornerRounding, list, f5, 0.0f, 0.0f, 0.0f, 1792, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f5, float f6) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, cornerRounding, list, f5, f6, 0.0f, 0.0f, 1536, null);
    }

    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f5, float f6, float f7) {
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        return pillStar$default(companion, f2, f3, i2, f4, rounding, cornerRounding, list, f5, f6, f7, 0.0f, 1024, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final RoundedPolygon pillStar(RoundedPolygon.Companion companion, float f2, float f3, int i2, float f4, CornerRounding rounding, CornerRounding cornerRounding, List<CornerRounding> list, float f5, float f6, float f7, float f8) {
        ?? arrayList;
        AbstractC6452k.m12181e(companion, "<this>");
        AbstractC6452k.m12181e(rounding, "rounding");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            throw new IllegalArgumentException("Pill shapes must have positive width and height");
        }
        if (f4 > 0.0f && f4 <= 1.0f) {
            if (list != null || cornerRounding == null) {
                arrayList = list;
            } else {
                C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i2);
                arrayList = new ArrayList();
                Iterator it = c6545dM1757p.iterator();
                while (((C6544c) it).f24772u) {
                    ((AbstractC6316x) it).nextInt();
                    AbstractC6311s.m12124v(AbstractC6306n.m12120r(rounding, cornerRounding), arrayList);
                }
            }
            return RoundedPolygonKt.RoundedPolygon(pillStarVerticesFromNumVerts(i2, f2, f3, f4, f5, f6, f7, f8), rounding, (List<CornerRounding>) arrayList, f7, f8);
        }
        throw new IllegalArgumentException("innerRadius must be between 0 and 1");
    }
}
