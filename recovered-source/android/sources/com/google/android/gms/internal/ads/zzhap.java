package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
final class zzhap extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: s */
    public final int[] f18433s;

    /* JADX INFO: renamed from: t */
    public final int f18434t;

    /* JADX INFO: renamed from: u */
    public final int f18435u;

    public zzhap(int[] iArr, int i2, int i3) {
        this.f18433s = iArr;
        this.f18434t = i2;
        this.f18435u = i3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f18434t;
        while (i2 < this.f18435u) {
            if (this.f18433s[i2] == iIntValue) {
                if (i2 != -1) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhap)) {
            return super.equals(obj);
        }
        zzhap zzhapVar = (zzhap) obj;
        int i2 = zzhapVar.f18435u;
        int i3 = zzhapVar.f18434t;
        int i4 = i2 - i3;
        int i5 = this.f18435u;
        int i6 = this.f18434t;
        int i7 = i5 - i6;
        if (i4 != i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f18433s[i6 + i8] != zzhapVar.f18433s[i3 + i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3 = this.f18435u;
        int i4 = this.f18434t;
        zzgtr.m7136i(i2, i3 - i4);
        return Integer.valueOf(this.f18433s[i4 + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = this.f18434t; i2 < this.f18435u; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f18433s[i2]);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f18434t;
            int i3 = i2;
            while (i3 < this.f18435u) {
                if (this.f18433s[i3] != iIntValue) {
                    i3++;
                } else if (i3 >= 0) {
                    return i3 - i2;
                }
            }
            i3 = -1;
            if (i3 >= 0) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i2;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i3 = this.f18435u - 1;
            while (true) {
                i2 = this.f18434t;
                if (i3 < i2) {
                    i3 = -1;
                    break;
                }
                if (this.f18433s[i3] == iIntValue) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int i3 = this.f18435u;
        int i4 = this.f18434t;
        Integer num = (Integer) obj;
        zzgtr.m7136i(i2, i3 - i4);
        int i5 = i4 + i2;
        int[] iArr = this.f18433s;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18435u - this.f18434t;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f18433s, this.f18434t, this.f18435u, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        int i4 = this.f18435u;
        int i5 = this.f18434t;
        zzgtr.m7138k(i2, i3, i4 - i5);
        if (i2 == i3) {
            return Collections.EMPTY_LIST;
        }
        return new zzhap(this.f18433s, i2 + i5, i5 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i2 = this.f18435u;
        int i3 = this.f18434t;
        StringBuilder sb = new StringBuilder((i2 - i3) * 5);
        sb.append('[');
        int[] iArr = this.f18433s;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i3]);
        }
    }
}
