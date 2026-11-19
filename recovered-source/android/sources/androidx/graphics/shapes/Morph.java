package androidx.graphics.shapes;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p060f0.C6335c;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class Morph {
    public static final Companion Companion = new Companion(null);
    private final List<C6283e> _morphMatch;
    private final RoundedPolygon end;
    private final RoundedPolygon start;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final List<C6283e> match$graphics_shapes_release(RoundedPolygon p1, RoundedPolygon p2) {
            C6283e c6283eCutAtProgress;
            C6283e c6283eCutAtProgress2;
            AbstractC6452k.m12181e(p1, "p1");
            AbstractC6452k.m12181e(p2, "p2");
            MeasuredPolygon.Companion companion = MeasuredPolygon.Companion;
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p1.getCenterX(), p1.getCenterY()), p1);
            MeasuredPolygon measuredPolygonMeasurePolygon$graphics_shapes_release2 = companion.measurePolygon$graphics_shapes_release(new AngleMeasurer(p2.getCenterX(), p2.getCenterY()), p2);
            DoubleMapper doubleMapperFeatureMapper = FeatureMappingKt.featureMapper(measuredPolygonMeasurePolygon$graphics_shapes_release.getFeatures(), measuredPolygonMeasurePolygon$graphics_shapes_release2.getFeatures());
            float map = doubleMapperFeatureMapper.map(0.0f);
            String unused = MorphKt.LOG_TAG;
            MeasuredPolygon measuredPolygonCutAndShift = measuredPolygonMeasurePolygon$graphics_shapes_release2.cutAndShift(map);
            ArrayList arrayList = new ArrayList();
            MeasuredPolygon.MeasuredCubic measuredCubic = (MeasuredPolygon.MeasuredCubic) AbstractC6305m.m12117y(measuredPolygonMeasurePolygon$graphics_shapes_release, 0);
            MeasuredPolygon.MeasuredCubic measuredCubic2 = (MeasuredPolygon.MeasuredCubic) AbstractC6305m.m12117y(measuredPolygonCutAndShift, 0);
            int i2 = 1;
            int i3 = 1;
            while (measuredCubic != null && measuredCubic2 != null) {
                float endOutlineProgress = i2 == measuredPolygonMeasurePolygon$graphics_shapes_release.size() ? 1.0f : measuredCubic.getEndOutlineProgress();
                float fMapBack = i3 == measuredPolygonCutAndShift.size() ? 1.0f : doubleMapperFeatureMapper.mapBack(Utils.positiveModulo(measuredCubic2.getEndOutlineProgress() + map, 1.0f));
                float fMin = Math.min(endOutlineProgress, fMapBack);
                String unused2 = MorphKt.LOG_TAG;
                float f2 = 1.0E-6f + fMin;
                if (endOutlineProgress > f2) {
                    String unused3 = MorphKt.LOG_TAG;
                    c6283eCutAtProgress = measuredCubic.cutAtProgress(fMin);
                } else {
                    C6283e c6283e = new C6283e(measuredCubic, AbstractC6305m.m12117y(measuredPolygonMeasurePolygon$graphics_shapes_release, i2));
                    i2++;
                    c6283eCutAtProgress = c6283e;
                }
                MeasuredPolygon.MeasuredCubic measuredCubic3 = (MeasuredPolygon.MeasuredCubic) c6283eCutAtProgress.f24308s;
                measuredCubic = (MeasuredPolygon.MeasuredCubic) c6283eCutAtProgress.f24309t;
                if (fMapBack > f2) {
                    String unused4 = MorphKt.LOG_TAG;
                    c6283eCutAtProgress2 = measuredCubic2.cutAtProgress(Utils.positiveModulo(doubleMapperFeatureMapper.map(fMin) - map, 1.0f));
                } else {
                    C6283e c6283e2 = new C6283e(measuredCubic2, AbstractC6305m.m12117y(measuredPolygonCutAndShift, i3));
                    i3++;
                    c6283eCutAtProgress2 = c6283e2;
                }
                MeasuredPolygon.MeasuredCubic measuredCubic4 = (MeasuredPolygon.MeasuredCubic) c6283eCutAtProgress2.f24308s;
                measuredCubic2 = (MeasuredPolygon.MeasuredCubic) c6283eCutAtProgress2.f24309t;
                String unused5 = MorphKt.LOG_TAG;
                arrayList.add(new C6283e(measuredCubic3.getCubic(), measuredCubic4.getCubic()));
            }
            if (measuredCubic == null && measuredCubic2 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        private Companion() {
        }
    }

    public Morph(RoundedPolygon start, RoundedPolygon end) {
        AbstractC6452k.m12181e(start, "start");
        AbstractC6452k.m12181e(end, "end");
        this.start = start;
        this.end = end;
        this._morphMatch = Companion.match$graphics_shapes_release(start, end);
    }

    public static /* synthetic */ float[] calculateBounds$default(Morph morph, float[] fArr, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return morph.calculateBounds(fArr, z);
    }

    public static /* synthetic */ float[] calculateMaxBounds$default(Morph morph, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = new float[4];
        }
        return morph.calculateMaxBounds(fArr);
    }

    public static void forEachCubic$default(Morph morph, float f2, MutableCubic mutableCubic, InterfaceC6498l callback, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableCubic = new MutableCubic();
        }
        AbstractC6452k.m12181e(mutableCubic, "mutableCubic");
        AbstractC6452k.m12181e(callback, "callback");
        int size = morph.getMorphMatch().size();
        for (int i3 = 0; i3 < size; i3++) {
            mutableCubic.interpolate((Cubic) morph.getMorphMatch().get(i3).f24308s, (Cubic) morph.getMorphMatch().get(i3).f24309t, f2);
            callback.invoke(mutableCubic);
        }
    }

    public static /* synthetic */ void getMorphMatch$annotations() {
    }

    public final List<Cubic> asCubics(float f2) {
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        int size = this._morphMatch.size();
        Cubic cubic = null;
        Cubic cubic2 = null;
        int i2 = 0;
        while (i2 < size) {
            float[] fArr = new float[8];
            for (int i3 = 0; i3 < 8; i3++) {
                fArr[i3] = Utils.interpolate(((Cubic) this._morphMatch.get(i2).f24308s).getPoints$graphics_shapes_release()[i3], ((Cubic) this._morphMatch.get(i2).f24309t).getPoints$graphics_shapes_release()[i3], f2);
            }
            Cubic cubic3 = new Cubic(fArr);
            if (cubic2 == null) {
                cubic2 = cubic3;
            }
            if (cubic != null) {
                c6335cM1747f.add(cubic);
            }
            i2++;
            cubic = cubic3;
        }
        if (cubic != null && cubic2 != null) {
            c6335cM1747f.add(CubicKt.Cubic(cubic.getAnchor0X(), cubic.getAnchor0Y(), cubic.getControl0X(), cubic.getControl0Y(), cubic.getControl1X(), cubic.getControl1Y(), cubic2.getAnchor0X(), cubic2.getAnchor0Y()));
        }
        return AbstractC0846b.m1744c(c6335cM1747f);
    }

    public final float[] calculateBounds() {
        return calculateBounds$default(this, null, false, 3, null);
    }

    public final float[] calculateMaxBounds(float[] bounds) {
        AbstractC6452k.m12181e(bounds, "bounds");
        this.start.calculateMaxBounds(bounds);
        float f2 = bounds[0];
        float f3 = bounds[1];
        float f4 = bounds[2];
        float f5 = bounds[3];
        this.end.calculateMaxBounds(bounds);
        bounds[0] = Math.min(f2, bounds[0]);
        bounds[1] = Math.min(f3, bounds[1]);
        bounds[2] = Math.max(f4, bounds[2]);
        bounds[3] = Math.max(f5, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float f2, MutableCubic mutableCubic, InterfaceC6498l callback) {
        AbstractC6452k.m12181e(mutableCubic, "mutableCubic");
        AbstractC6452k.m12181e(callback, "callback");
        int size = getMorphMatch().size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableCubic.interpolate((Cubic) getMorphMatch().get(i2).f24308s, (Cubic) getMorphMatch().get(i2).f24309t, f2);
            callback.invoke(mutableCubic);
        }
    }

    public final List<C6283e> getMorphMatch() {
        return this._morphMatch;
    }

    public final float[] calculateBounds(float[] bounds) {
        AbstractC6452k.m12181e(bounds, "bounds");
        return calculateBounds$default(this, bounds, false, 2, null);
    }

    public final float[] calculateBounds(float[] bounds, boolean z) {
        AbstractC6452k.m12181e(bounds, "bounds");
        this.start.calculateBounds(bounds, z);
        float f2 = bounds[0];
        float f3 = bounds[1];
        float f4 = bounds[2];
        float f5 = bounds[3];
        this.end.calculateBounds(bounds, z);
        bounds[0] = Math.min(f2, bounds[0]);
        bounds[1] = Math.min(f3, bounds[1]);
        bounds[2] = Math.max(f4, bounds[2]);
        bounds[3] = Math.max(f5, bounds[3]);
        return bounds;
    }

    public final void forEachCubic(float f2, InterfaceC6498l callback) {
        AbstractC6452k.m12181e(callback, "callback");
        MutableCubic mutableCubic = new MutableCubic();
        int size = getMorphMatch().size();
        for (int i2 = 0; i2 < size; i2++) {
            mutableCubic.interpolate((Cubic) getMorphMatch().get(i2).f24308s, (Cubic) getMorphMatch().get(i2).f24309t, f2);
            callback.invoke(mutableCubic);
        }
    }
}
