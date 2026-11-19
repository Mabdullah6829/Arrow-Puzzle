package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.webkit.ProxyConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgxd<E> extends zzgwp<E> implements Set<E> {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f18323u = 0;

    /* JADX INFO: renamed from: t */
    public transient zzgwt f18324t;

    /* JADX INFO: renamed from: m */
    public static zzgxd m7238m() {
        return new zzgze(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    /* JADX INFO: renamed from: n */
    public static zzgxd m7239n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i2 = length + 6;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m7244v(i2, objArr2);
    }

    /* JADX INFO: renamed from: q */
    public static int m7240q(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            zzgtr.m7129b("collection too large", iMax < 1073741824);
            return BasicMeasure.EXACTLY;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: r */
    public static zzgxd m7241r(Set set) {
        if ((set instanceof zzgxd) && !(set instanceof SortedSet)) {
            zzgxd zzgxdVar = (zzgxd) set;
            if (!zzgxdVar.mo7212j()) {
                return zzgxdVar;
            }
        }
        Object[] array = set.toArray();
        return m7244v(array.length, array);
    }

    /* JADX INFO: renamed from: s */
    public static zzgxd m7242s(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m7244v(length, (Object[]) objArr.clone()) : new zzgze(objArr[0]);
        }
        return zzgyu.f18372B;
    }

    /* JADX INFO: renamed from: u */
    public static zzgxc m7243u(int i2) {
        zzgvp.m7175b(i2, "expectedSize");
        zzgxc zzgxcVar = new zzgxc(i2);
        zzgxcVar.f18321d = new Object[m7240q(i2)];
        return zzgxcVar;
    }

    /* JADX INFO: renamed from: v */
    public static zzgxd m7244v(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzgyu.f18372B;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgze(obj);
        }
        int iM7240q = m7240q(i2);
        Object[] objArr2 = new Object[iM7240q];
        int i3 = iM7240q - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            zzgym.m7264b(i6, obj2);
            int iHashCode = obj2.hashCode();
            int iM7200a = zzgwm.m7200a(iHashCode);
            while (true) {
                int i7 = iM7200a & i3;
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
                iM7200a++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgze(obj4);
        }
        if (m7240q(i5) < iM7240q / 2) {
            return m7244v(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzgyu(i4, i3, i5, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgxd) && (this instanceof zzgyu)) {
            zzgxd zzgxdVar = (zzgxd) obj;
            zzgxdVar.getClass();
            if ((zzgxdVar instanceof zzgyu) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return zzgzd.m7271d(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: h */
    public zzgwt mo7211h() {
        zzgwt zzgwtVar = this.f18324t;
        if (zzgwtVar != null) {
            return zzgwtVar;
        }
        zzgwt zzgwtVarMo7245t = mo7245t();
        this.f18324t = zzgwtVarMo7245t;
        return zzgwtVarMo7245t;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgzd.m7270c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: renamed from: t */
    public zzgwt mo7245t() {
        Object[] array = toArray(zzgwp.f18298s);
        zzgzi zzgziVar = zzgwt.f18303t;
        return zzgwt.m7222v(array.length, array);
    }
}
