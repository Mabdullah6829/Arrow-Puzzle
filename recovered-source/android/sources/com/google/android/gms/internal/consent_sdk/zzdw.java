package com.google.android.gms.internal.consent_sdk;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdw extends zzds implements Set {

    /* JADX INFO: renamed from: t */
    public transient zzdv f21638t;

    /* JADX INFO: renamed from: j */
    public static zzdw m9139j(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzdz.f21644A;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzea(obj);
        }
        int iM9140o = m9140o(i2);
        Object[] objArr2 = new Object[iM9140o];
        int i3 = iM9140o - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0271e0.m396d(i6, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i7 = iRotateLeft & i3;
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
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzea(obj4);
        }
        if (m9140o(i5) < iM9140o / 2) {
            return m9139j(i5, objArr);
        }
        if (i5 < 3) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzdz(i4, i3, i5, objArr, objArr2);
    }

    /* JADX INFO: renamed from: o */
    public static int m9140o(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return BasicMeasure.EXACTLY;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdw) && (this instanceof zzdz)) {
            zzdw zzdwVar = (zzdw) obj;
            zzdwVar.getClass();
            if ((zzdwVar instanceof zzdz) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
