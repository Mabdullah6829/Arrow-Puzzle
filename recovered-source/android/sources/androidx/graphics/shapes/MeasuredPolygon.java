package androidx.graphics.shapes;

import androidx.collection.FloatList;
import androidx.collection.MutableFloatList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p057d0.C6283e;
import p058e0.AbstractC6298f;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p060f0.C6335c;

/* JADX INFO: loaded from: classes.dex */
public final class MeasuredPolygon extends AbstractC6298f {
    public static final Companion Companion = new Companion(null);
    private final List<MeasuredCubic> cubics;
    private final List<ProgressableFeature> features;
    private final Measurer measurer;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final MeasuredPolygon measurePolygon$graphics_shapes_release(Measurer measurer, RoundedPolygon polygon) {
            List listM1752k;
            AbstractC6452k.m12181e(measurer, "measurer");
            AbstractC6452k.m12181e(polygon, "polygon");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = polygon.getFeatures$graphics_shapes_release().size();
            for (int i2 = 0; i2 < size; i2++) {
                Feature feature = polygon.getFeatures$graphics_shapes_release().get(i2);
                int size2 = feature.getCubics().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if ((feature instanceof Feature.Corner) && i3 == feature.getCubics().size() / 2) {
                        arrayList2.add(new C6283e(feature, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(feature.getCubics().get(i3));
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            int iM12123u = AbstractC6307o.m12123u(arrayList, 9);
            if (iM12123u == 0) {
                listM1752k = AbstractC0846b.m1752k(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iM12123u + 1);
                arrayList3.add(fValueOf);
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    float fFloatValue = fValueOf.floatValue();
                    float fMeasureCubic = measurer.measureCubic((Cubic) obj);
                    if (fMeasureCubic < 0.0f) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                    fValueOf = Float.valueOf(fFloatValue + fMeasureCubic);
                    arrayList3.add(fValueOf);
                }
                listM1752k = arrayList3;
            }
            float fFloatValue2 = ((Number) AbstractC6305m.m12106B(listM1752k)).floatValue();
            MutableFloatList mutableFloatList = new MutableFloatList(listM1752k.size());
            int size4 = listM1752k.size();
            for (int i5 = 0; i5 < size4; i5++) {
                mutableFloatList.add(((Number) listM1752k.get(i5)).floatValue() / fFloatValue2);
            }
            String unused = PolygonMeasureKt.LOG_TAG;
            C6335c c6335cM1747f = AbstractC0846b.m1747f();
            int size5 = arrayList2.size();
            for (int i6 = 0; i6 < size5; i6++) {
                int iIntValue = ((Number) ((C6283e) arrayList2.get(i6)).f24309t).intValue();
                c6335cM1747f.add(new ProgressableFeature((mutableFloatList.get(iIntValue + 1) + mutableFloatList.get(iIntValue)) / 2, (Feature) ((C6283e) arrayList2.get(i6)).f24308s));
            }
            return new MeasuredPolygon(measurer, AbstractC0846b.m1744c(c6335cM1747f), arrayList, mutableFloatList, null);
        }

        private Companion() {
        }
    }

    public final class MeasuredCubic {
        private final Cubic cubic;
        private float endOutlineProgress;
        private final float measuredSize;
        private float startOutlineProgress;
        final /* synthetic */ MeasuredPolygon this$0;

        public MeasuredCubic(MeasuredPolygon measuredPolygon, Cubic cubic, float f2, float f3) {
            AbstractC6452k.m12181e(cubic, "cubic");
            this.this$0 = measuredPolygon;
            this.cubic = cubic;
            if (f3 < f2) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.measuredSize = measuredPolygon.measurer.measureCubic(cubic);
            this.startOutlineProgress = f2;
            this.endOutlineProgress = f3;
        }

        public static /* synthetic */ void updateProgressRange$graphics_shapes_release$default(MeasuredCubic measuredCubic, float f2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = measuredCubic.startOutlineProgress;
            }
            if ((i2 & 2) != 0) {
                f3 = measuredCubic.endOutlineProgress;
            }
            measuredCubic.updateProgressRange$graphics_shapes_release(f2, f3);
        }

        public final C6283e cutAtProgress(float f2) {
            float f3 = this.startOutlineProgress;
            float f4 = this.endOutlineProgress;
            if (f3 > f4) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
            }
            if (f2 < f3) {
                f2 = f3;
            } else if (f2 > f4) {
                f2 = f4;
            }
            float fFindCubicCutPoint = this.this$0.measurer.findCubicCutPoint(this.cubic, ((f2 - f3) / (f4 - f3)) * this.measuredSize);
            if (0.0f > fFindCubicCutPoint || fFindCubicCutPoint > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
            }
            String unused = PolygonMeasureKt.LOG_TAG;
            C6283e c6283eSplit = this.cubic.split(fFindCubicCutPoint);
            return new C6283e(new MeasuredCubic(this.this$0, (Cubic) c6283eSplit.f24308s, this.startOutlineProgress, f2), new MeasuredCubic(this.this$0, (Cubic) c6283eSplit.f24309t, f2, this.endOutlineProgress));
        }

        public final Cubic getCubic() {
            return this.cubic;
        }

        public final float getEndOutlineProgress() {
            return this.endOutlineProgress;
        }

        public final float getMeasuredSize() {
            return this.measuredSize;
        }

        public final float getStartOutlineProgress() {
            return this.startOutlineProgress;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.startOutlineProgress + " .. " + this.endOutlineProgress + "], size=" + this.measuredSize + ", cubic=" + this.cubic + ')';
        }

        public final void updateProgressRange$graphics_shapes_release(float f2, float f3) {
            if (f3 < f2) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.startOutlineProgress = f2;
            this.endOutlineProgress = f3;
        }
    }

    public /* synthetic */ MeasuredPolygon(Measurer measurer, List list, List list2, FloatList floatList, AbstractC6447f abstractC6447f) {
        this(measurer, list, list2, floatList);
    }

    public /* bridge */ boolean contains(MeasuredCubic measuredCubic) {
        return super.contains((Object) measuredCubic);
    }

    public final MeasuredPolygon cutAndShift(float f2) {
        float fPositiveModulo;
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (f2 < 1.0E-4f) {
            return this;
        }
        Iterator<MeasuredCubic> it = this.cubics.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            MeasuredCubic next = it.next();
            float startOutlineProgress = next.getStartOutlineProgress();
            if (f2 <= next.getEndOutlineProgress() && startOutlineProgress <= f2) {
                break;
            }
            i2++;
        }
        C6283e c6283eCutAtProgress = this.cubics.get(i2).cutAtProgress(f2);
        MeasuredCubic measuredCubic = (MeasuredCubic) c6283eCutAtProgress.f24308s;
        MeasuredCubic measuredCubic2 = (MeasuredCubic) c6283eCutAtProgress.f24309t;
        String unused = PolygonMeasureKt.LOG_TAG;
        ArrayList arrayListM12121s = AbstractC6306n.m12121s(measuredCubic2.getCubic());
        int size = this.cubics.size();
        for (int i3 = 1; i3 < size; i3++) {
            List<MeasuredCubic> list = this.cubics;
            arrayListM12121s.add(list.get((i3 + i2) % list.size()).getCubic());
        }
        arrayListM12121s.add(measuredCubic.getCubic());
        MutableFloatList mutableFloatList = new MutableFloatList(this.cubics.size() + 2);
        int size2 = this.cubics.size() + 2;
        for (int i4 = 0; i4 < size2; i4++) {
            if (i4 == 0) {
                fPositiveModulo = 0.0f;
            } else if (i4 == this.cubics.size() + 1) {
                fPositiveModulo = 1.0f;
            } else {
                fPositiveModulo = Utils.positiveModulo(this.cubics.get(((i2 + i4) - 1) % this.cubics.size()).getEndOutlineProgress() - f2, 1.0f);
            }
            mutableFloatList.add(fPositiveModulo);
        }
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        int size3 = this.features.size();
        for (int i5 = 0; i5 < size3; i5++) {
            c6335cM1747f.add(new ProgressableFeature(Utils.positiveModulo(this.features.get(i5).getProgress() - f2, 1.0f), this.features.get(i5).getFeature()));
        }
        return new MeasuredPolygon(this.measurer, AbstractC0846b.m1744c(c6335cM1747f), arrayListM12121s, mutableFloatList);
    }

    public final List<ProgressableFeature> getFeatures() {
        return this.features;
    }

    @Override // p058e0.AbstractC6293a
    public int getSize() {
        return this.cubics.size();
    }

    public /* bridge */ int indexOf(MeasuredCubic measuredCubic) {
        return super.indexOf((Object) measuredCubic);
    }

    public /* bridge */ int lastIndexOf(MeasuredCubic measuredCubic) {
        return super.lastIndexOf((Object) measuredCubic);
    }

    private MeasuredPolygon(Measurer measurer, List<ProgressableFeature> list, List<? extends Cubic> list2, FloatList floatList) {
        if (floatList.getSize() != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (floatList.first() != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (floatList.last() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.measurer = measurer;
        this.features = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (floatList.get(i3) - floatList.get(i2) > 1.0E-4f) {
                arrayList.add(new MeasuredCubic(this, list2.get(i2), f2, floatList.get(i3)));
                f2 = floatList.get(i3);
            }
            i2 = i3;
        }
        MeasuredCubic.updateProgressRange$graphics_shapes_release$default((MeasuredCubic) arrayList.get(AbstractC6306n.m12119q(arrayList)), 0.0f, 1.0f, 1, null);
        this.cubics = arrayList;
    }

    @Override // p058e0.AbstractC6293a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return contains((MeasuredCubic) obj);
        }
        return false;
    }

    @Override // java.util.List
    public MeasuredCubic get(int i2) {
        return this.cubics.get(i2);
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return indexOf((MeasuredCubic) obj);
        }
        return -1;
    }

    @Override // p058e0.AbstractC6298f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MeasuredCubic) {
            return lastIndexOf((MeasuredCubic) obj);
        }
        return -1;
    }
}
