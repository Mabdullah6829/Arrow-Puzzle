package p003C;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p001B.AbstractC0076b;
import p011H.AbstractC0271e0;
import p022N.AbstractC0355G;
import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: C.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0120k extends AbstractC0111b implements Set {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f179u = 0;

    /* JADX INFO: renamed from: t */
    public transient AbstractC0116g f180t;

    /* JADX INFO: renamed from: m */
    public static int m203m(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            AbstractC0076b.m131f(iMax < 1073741824, "collection too large");
            return BasicMeasure.EXACTLY;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC0120k m204n(int i2, Object... objArr) {
        if (i2 == 0) {
            return C0135z.f209B;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C0107B(obj);
        }
        int iM203m = m203m(i2);
        Object[] objArr2 = new Object[iM203m];
        int i3 = iM203m - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0271e0.m396d(i6, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM1755n = AbstractC0846b.m1755n(iHashCode);
            while (true) {
                int i7 = iM1755n & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM1755n++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C0107B(obj4);
        }
        if (m203m(i5) < iM203m / 2) {
            return m204n(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new C0135z(i4, i3, i5, objArr, objArr2);
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC0120k m205q(Set set) {
        if ((set instanceof AbstractC0120k) && !(set instanceof SortedSet)) {
            AbstractC0120k abstractC0120k = (AbstractC0120k) set;
            if (!abstractC0120k.mo179j()) {
                return abstractC0120k;
            }
        }
        Object[] array = set.toArray();
        return m204n(array.length, array);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: a */
    public AbstractC0116g mo174a() {
        AbstractC0116g abstractC0116g = this.f180t;
        if (abstractC0116g != null) {
            return abstractC0116g;
        }
        AbstractC0116g abstractC0116gMo206r = mo206r();
        this.f180t = abstractC0116gMo206r;
        return abstractC0116gMo206r;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0120k) && (this instanceof C0135z)) {
            AbstractC0120k abstractC0120k = (AbstractC0120k) obj;
            abstractC0120k.getClass();
            if ((abstractC0120k instanceof C0135z) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0355G.m556j(this);
    }

    /* JADX INFO: renamed from: r */
    public AbstractC0116g mo206r() {
        Object[] array = toArray(AbstractC0111b.f160s);
        C0113d c0113d = AbstractC0116g.f168t;
        return AbstractC0116g.m191m(array.length, array);
    }
}
