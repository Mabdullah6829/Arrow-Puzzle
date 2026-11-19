package androidx.graphics.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6316x;
import p060f0.C6335c;
import p087v0.C6544c;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureMappingKt {
    private static final String LOG_TAG = "FeatureMapping";

    public static final List<ProgressableFeature> doMapping(List<ProgressableFeature> f1, List<ProgressableFeature> f2) {
        AbstractC6452k.m12181e(f1, "f1");
        AbstractC6452k.m12181e(f2, "f2");
        Iterator it = new C6545d(0, f2.size() - 1, 1).iterator();
        C6544c c6544c = (C6544c) it;
        if (!c6544c.f24772u) {
            throw new NoSuchElementException();
        }
        AbstractC6316x abstractC6316x = (AbstractC6316x) it;
        int iNextInt = abstractC6316x.nextInt();
        if (c6544c.f24772u) {
            float fFeatureDistSquared = featureDistSquared(f1.get(0).getFeature(), f2.get(iNextInt).getFeature());
            do {
                int iNextInt2 = abstractC6316x.nextInt();
                float fFeatureDistSquared2 = featureDistSquared(f1.get(0).getFeature(), f2.get(iNextInt2).getFeature());
                if (Float.compare(fFeatureDistSquared, fFeatureDistSquared2) > 0) {
                    iNextInt = iNextInt2;
                    fFeatureDistSquared = fFeatureDistSquared2;
                }
            } while (c6544c.f24772u);
        }
        int size = f1.size();
        int size2 = f2.size();
        ArrayList arrayListM12121s = AbstractC6306n.m12121s(f2.get(iNextInt));
        int i2 = iNextInt;
        for (int i3 = 1; i3 < size; i3++) {
            int i4 = iNextInt - (size - i3);
            if (i4 <= i2) {
                i4 += size2;
            }
            Iterator it2 = new C6545d(i2 + 1, i4, 1).iterator();
            C6544c c6544c2 = (C6544c) it2;
            if (!c6544c2.f24772u) {
                throw new NoSuchElementException();
            }
            AbstractC6316x abstractC6316x2 = (AbstractC6316x) it2;
            int iNextInt3 = abstractC6316x2.nextInt();
            if (c6544c2.f24772u) {
                float fFeatureDistSquared3 = featureDistSquared(f1.get(i3).getFeature(), f2.get(iNextInt3 % size2).getFeature());
                do {
                    int iNextInt4 = abstractC6316x2.nextInt();
                    float fFeatureDistSquared4 = featureDistSquared(f1.get(i3).getFeature(), f2.get(iNextInt4 % size2).getFeature());
                    if (Float.compare(fFeatureDistSquared3, fFeatureDistSquared4) > 0) {
                        iNextInt3 = iNextInt4;
                        fFeatureDistSquared3 = fFeatureDistSquared4;
                    }
                } while (c6544c2.f24772u);
            }
            i2 = iNextInt3;
            arrayListM12121s.add(f2.get(i2 % size2));
        }
        return arrayListM12121s;
    }

    public static final float featureDistSquared(Feature f1, Feature f2) {
        AbstractC6452k.m12181e(f1, "f1");
        AbstractC6452k.m12181e(f2, "f2");
        if ((f1 instanceof Feature.Corner) && (f2 instanceof Feature.Corner) && ((Feature.Corner) f1).getConvex() != ((Feature.Corner) f2).getConvex()) {
            return Float.MAX_VALUE;
        }
        float anchor1X = (((Cubic) AbstractC6305m.m12106B(f1.getCubics())).getAnchor1X() + ((Cubic) AbstractC6305m.m12116x(f1.getCubics())).getAnchor0X()) / 2.0f;
        float anchor1Y = (((Cubic) AbstractC6305m.m12106B(f1.getCubics())).getAnchor1Y() + ((Cubic) AbstractC6305m.m12116x(f1.getCubics())).getAnchor0Y()) / 2.0f;
        float anchor1X2 = (((Cubic) AbstractC6305m.m12106B(f2.getCubics())).getAnchor1X() + ((Cubic) AbstractC6305m.m12116x(f2.getCubics())).getAnchor0X()) / 2.0f;
        float f3 = anchor1X - anchor1X2;
        float anchor1Y2 = anchor1Y - ((((Cubic) AbstractC6305m.m12106B(f2.getCubics())).getAnchor1Y() + ((Cubic) AbstractC6305m.m12116x(f2.getCubics())).getAnchor0Y()) / 2.0f);
        return (anchor1Y2 * anchor1Y2) + (f3 * f3);
    }

    public static final DoubleMapper featureMapper(List<ProgressableFeature> features1, List<ProgressableFeature> features2) {
        AbstractC6452k.m12181e(features1, "features1");
        AbstractC6452k.m12181e(features2, "features2");
        C6335c c6335cM1747f = AbstractC0846b.m1747f();
        int size = features1.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (features1.get(i2).getFeature() instanceof Feature.Corner) {
                c6335cM1747f.add(features1.get(i2));
            }
        }
        C6335c c6335cM1744c = AbstractC0846b.m1744c(c6335cM1747f);
        C6335c c6335cM1747f2 = AbstractC0846b.m1747f();
        int size2 = features2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (features2.get(i3).getFeature() instanceof Feature.Corner) {
                c6335cM1747f2.add(features2.get(i3));
            }
        }
        C6335c c6335cM1744c2 = AbstractC0846b.m1744c(c6335cM1747f2);
        C6283e c6283e = c6335cM1744c.mo12081a() > c6335cM1744c2.mo12081a() ? new C6283e(doMapping(c6335cM1744c2, c6335cM1744c), c6335cM1744c2) : new C6283e(c6335cM1744c, doMapping(c6335cM1744c, c6335cM1744c2));
        List list = (List) c6283e.f24308s;
        List list2 = (List) c6283e.f24309t;
        C6335c c6335cM1747f3 = AbstractC0846b.m1747f();
        int size3 = list.size();
        for (int i4 = 0; i4 < size3 && i4 != list2.size(); i4++) {
            c6335cM1747f3.add(new C6283e(Float.valueOf(((ProgressableFeature) list.get(i4)).getProgress()), Float.valueOf(((ProgressableFeature) list2.get(i4)).getProgress())));
        }
        C6283e[] c6283eArr = (C6283e[]) AbstractC0846b.m1744c(c6335cM1747f3).toArray(new C6283e[0]);
        return new DoubleMapper((C6283e[]) Arrays.copyOf(c6283eArr, c6283eArr.length));
    }
}
