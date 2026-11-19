package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.collection.MutableFloatList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6316x;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedPolygonKt {
    public static final RoundedPolygon RoundedPolygon(int i2) {
        return RoundedPolygon$default(i2, 0.0f, 0.0f, 0.0f, null, null, 62, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(int i2, float f2, float f3, float f4, CornerRounding cornerRounding, List list, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i3 & 16) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i3 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return RoundedPolygon(i2, f2, f3, f4, cornerRounding, list2);
    }

    private static final long calculateCenter(float[] fArr) {
        float f2 = 0.0f;
        int i2 = 0;
        float f3 = 0.0f;
        while (i2 < fArr.length) {
            int i3 = i2 + 1;
            f2 += fArr[i2];
            i2 += 2;
            f3 += fArr[i3];
        }
        float f4 = 2;
        return FloatFloatPair.m12249constructorimpl((f2 / fArr.length) / f4, (f3 / fArr.length) / f4);
    }

    private static final float[] verticesFromNumVerts(int i2, float f2, float f3, float f4) {
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            float f5 = f2;
            long jM12304plusybeJwSQ = PointKt.m12304plusybeJwSQ(Utils.m12320radialToCartesianL6JJ3z0$default(f5, (Utils.getFloatPi() / i2) * 2 * i3, 0L, 4, null), FloatFloatPair.m12249constructorimpl(f3, f4));
            int i5 = i4 + 1;
            fArr[i4] = PointKt.m12300getXDnnuFBc(jM12304plusybeJwSQ);
            i4 += 2;
            fArr[i5] = PointKt.m12301getYDnnuFBc(jM12304plusybeJwSQ);
            i3++;
            f2 = f5;
        }
        return fArr;
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2) {
        return RoundedPolygon$default(i2, f2, 0.0f, 0.0f, null, null, 60, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3) {
        return RoundedPolygon$default(i2, f2, f3, 0.0f, null, null, 56, null);
    }

    public static /* synthetic */ RoundedPolygon RoundedPolygon$default(float[] fArr, CornerRounding cornerRounding, List list, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cornerRounding = CornerRounding.Unrounded;
        }
        if ((i2 & 4) != 0) {
            list = null;
        }
        if ((i2 & 8) != 0) {
            f2 = Float.MIN_VALUE;
        }
        if ((i2 & 16) != 0) {
            f3 = Float.MIN_VALUE;
        }
        return RoundedPolygon(fArr, cornerRounding, (List<CornerRounding>) list, f2, f3);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4) {
        return RoundedPolygon$default(i2, f2, f3, f4, null, null, 48, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4, CornerRounding rounding) {
        AbstractC6452k.m12181e(rounding, "rounding");
        return RoundedPolygon$default(i2, f2, f3, f4, rounding, null, 32, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices) {
        AbstractC6452k.m12181e(vertices, "vertices");
        return RoundedPolygon$default(vertices, null, null, 0.0f, 0.0f, 30, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding) {
        AbstractC6452k.m12181e(vertices, "vertices");
        AbstractC6452k.m12181e(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, null, 0.0f, 0.0f, 28, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list) {
        AbstractC6452k.m12181e(vertices, "vertices");
        AbstractC6452k.m12181e(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, 0.0f, 0.0f, 24, null);
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list, float f2) {
        AbstractC6452k.m12181e(vertices, "vertices");
        AbstractC6452k.m12181e(rounding, "rounding");
        return RoundedPolygon$default(vertices, rounding, list, f2, 0.0f, 16, null);
    }

    public static final RoundedPolygon RoundedPolygon(int i2, float f2, float f3, float f4, CornerRounding rounding, List<CornerRounding> list) {
        AbstractC6452k.m12181e(rounding, "rounding");
        return RoundedPolygon(verticesFromNumVerts(i2, f2, f3, f4), rounding, list, f3, f4);
    }

    public static final RoundedPolygon RoundedPolygon(RoundedPolygon source) {
        AbstractC6452k.m12181e(source, "source");
        return new RoundedPolygon(source.getFeatures$graphics_shapes_release(), source.getCenterX(), source.getCenterY());
    }

    public static final RoundedPolygon RoundedPolygon(float[] vertices, CornerRounding rounding, List<CornerRounding> list, float f2, float f3) {
        long jCalculateCenter;
        C6283e c6283e;
        CornerRounding cornerRounding;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC6452k.m12181e(vertices, "vertices");
        AbstractC6452k.m12181e(rounding, "rounding");
        if (vertices.length >= 6) {
            int i2 = 2;
            int i3 = 1;
            if (vertices.length % 2 != 1) {
                if (list != null && list.size() * 2 != vertices.length) {
                    throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                }
                ArrayList arrayList = new ArrayList();
                int length = vertices.length / 2;
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    CornerRounding cornerRounding2 = (list == null || (cornerRounding = list.get(i5)) == null) ? rounding : cornerRounding;
                    int i6 = (((i5 + length) - i3) % length) * 2;
                    int i7 = i5 + 1;
                    int i8 = (i7 % length) * 2;
                    int i9 = i5 * 2;
                    arrayList2.add(new RoundedCorner(FloatFloatPair.m12249constructorimpl(vertices[i6], vertices[i6 + i3]), FloatFloatPair.m12249constructorimpl(vertices[i9], vertices[i9 + i3]), FloatFloatPair.m12249constructorimpl(vertices[i8], vertices[i8 + 1]), cornerRounding2, null));
                    i5 = i7;
                    i3 = i3;
                }
                int i10 = i3;
                C6545d c6545dM1757p = AbstractC0846b.m1757p(0, length);
                ArrayList arrayList3 = new ArrayList(AbstractC6307o.m12123u(c6545dM1757p, 10));
                Iterator it = c6545dM1757p.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((AbstractC6316x) it).nextInt();
                    int i11 = (iNextInt + 1) % length;
                    float expectedRoundCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedRoundCut() + ((RoundedCorner) arrayList2.get(i11)).getExpectedRoundCut();
                    float expectedCut = ((RoundedCorner) arrayList2.get(iNextInt)).getExpectedCut() + ((RoundedCorner) arrayList2.get(i11)).getExpectedCut();
                    int i12 = iNextInt * 2;
                    int i13 = i11 * 2;
                    float fDistance = Utils.distance(vertices[i12] - vertices[i13], vertices[i12 + 1] - vertices[i13 + 1]);
                    if (expectedRoundCut > fDistance) {
                        c6283e = new C6283e(Float.valueOf(fDistance / expectedRoundCut), Float.valueOf(0.0f));
                    } else if (expectedCut > fDistance) {
                        c6283e = new C6283e(fValueOf, Float.valueOf((fDistance - expectedRoundCut) / (expectedCut - expectedRoundCut)));
                    } else {
                        c6283e = new C6283e(fValueOf, fValueOf);
                    }
                    arrayList3.add(c6283e);
                }
                for (int i14 = 0; i14 < length; i14++) {
                    MutableFloatList mutableFloatList = new MutableFloatList(2);
                    for (int i15 = 0; i15 < 2; i15++) {
                        C6283e c6283e2 = (C6283e) arrayList3.get((((i14 + length) - 1) + i15) % length);
                        mutableFloatList.add(((((RoundedCorner) arrayList2.get(i14)).getExpectedCut() - ((RoundedCorner) arrayList2.get(i14)).getExpectedRoundCut()) * ((Number) c6283e2.f24309t).floatValue()) + (((RoundedCorner) arrayList2.get(i14)).getExpectedRoundCut() * ((Number) c6283e2.f24308s).floatValue()));
                    }
                    arrayList.add(((RoundedCorner) arrayList2.get(i14)).getCubics(mutableFloatList.get(0), mutableFloatList.get(i10)));
                }
                ArrayList arrayList4 = new ArrayList();
                while (i4 < length) {
                    int i16 = i4 + 1;
                    int i17 = i16 % length;
                    int i18 = i4 * 2;
                    long jM12249constructorimpl = FloatFloatPair.m12249constructorimpl(vertices[i18], vertices[i18 + i10]);
                    int i19 = (((i4 + length) - i10) % length) * i2;
                    long jM12249constructorimpl2 = FloatFloatPair.m12249constructorimpl(vertices[i19], vertices[i19 + i10]);
                    int i20 = i17 * 2;
                    arrayList4.add(new Feature.Corner((List) arrayList.get(i4), jM12249constructorimpl, ((RoundedCorner) arrayList2.get(i4)).m12312getCenter1ufDz9w(), PointKt.m12291clockwiseybeJwSQ(PointKt.m12303minusybeJwSQ(jM12249constructorimpl, jM12249constructorimpl2), PointKt.m12303minusybeJwSQ(FloatFloatPair.m12249constructorimpl(vertices[i20], vertices[i20 + i10]), jM12249constructorimpl)), null));
                    arrayList4.add(new Feature.Edge(AbstractC0846b.m1752k(Cubic.Companion.straightLine(((Cubic) AbstractC6305m.m12106B((List) arrayList.get(i4))).getAnchor1X(), ((Cubic) AbstractC6305m.m12106B((List) arrayList.get(i4))).getAnchor1Y(), ((Cubic) AbstractC6305m.m12116x((List) arrayList.get(i17))).getAnchor0X(), ((Cubic) AbstractC6305m.m12116x((List) arrayList.get(i17))).getAnchor0Y()))));
                    i4 = i16;
                    i2 = 2;
                }
                if (f2 == Float.MIN_VALUE || f3 == Float.MIN_VALUE) {
                    jCalculateCenter = calculateCenter(vertices);
                } else {
                    jCalculateCenter = FloatFloatPair.m12249constructorimpl(f2, f3);
                }
                return new RoundedPolygon(arrayList4, Float.intBitsToFloat((int) (jCalculateCenter >> 32)), Float.intBitsToFloat((int) (jCalculateCenter & 4294967295L)));
            }
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        throw new IllegalArgumentException("Polygons must have at least 3 vertices");
    }
}
