package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzadv extends zzace implements RandomAccess, zzaeb, zzafk {

    /* JADX INFO: renamed from: v */
    public static final int[] f22032v;

    /* JADX INFO: renamed from: w */
    public static final zzadv f22033w;

    /* JADX INFO: renamed from: t */
    public int[] f22034t;

    /* JADX INFO: renamed from: u */
    public int f22035u;

    static {
        int[] iArr = new int[0];
        f22032v = iArr;
        f22033w = new zzadv(iArr, 0, false);
    }

    public zzadv() {
        this(f22032v, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f22035u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22035u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        int[] iArr = this.f22034t;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
        } else {
            int[] iArr2 = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22034t, 0, iArr2, 0, i2);
            System.arraycopy(this.f22034t, i2, iArr2, i4, this.f22035u - i2);
            this.f22034t = iArr2;
        }
        this.f22034t[i2] = iIntValue;
        this.f22035u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9351a();
        collection.getClass();
        if (!(collection instanceof zzadv)) {
            return super.addAll(collection);
        }
        zzadv zzadvVar = (zzadv) collection;
        int i2 = zzadvVar.f22035u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f22035u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f22034t;
        if (i4 > iArr.length) {
            this.f22034t = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzadvVar.f22034t, 0, this.f22034t, this.f22035u, zzadvVar.f22035u);
        this.f22035u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9575b(int i2) {
        m9351a();
        int i3 = this.f22035u;
        int length = this.f22034t.length;
        if (i3 == length) {
            int[] iArr = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22034t, 0, iArr, 0, this.f22035u);
            this.f22034t = iArr;
        }
        int[] iArr2 = this.f22034t;
        int i4 = this.f22035u;
        this.f22035u = i4 + 1;
        iArr2[i4] = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: c */
    public final zzaeb mo9370p(int i2) {
        if (i2 >= this.f22035u) {
            return new zzadv(i2 == 0 ? f22032v : Arrays.copyOf(this.f22034t, i2), this.f22035u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9577d(int i2) {
        if (i2 < 0 || i2 >= this.f22035u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22035u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadv)) {
            return super.equals(obj);
        }
        zzadv zzadvVar = (zzadv) obj;
        if (this.f22035u != zzadvVar.f22035u) {
            return false;
        }
        int[] iArr = zzadvVar.f22034t;
        for (int i2 = 0; i2 < this.f22035u; i2++) {
            if (this.f22034t[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9577d(i2);
        return Integer.valueOf(this.f22034t[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f22035u; i3++) {
            i2 = (i2 * 31) + this.f22034t[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f22035u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f22034t[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaeb
    /* JADX INFO: renamed from: o */
    public final int mo9578o(int i2) {
        m9577d(i2);
        return this.f22034t[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9351a();
        m9577d(i2);
        int[] iArr = this.f22034t;
        int i3 = iArr[i2];
        int i4 = this.f22035u;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f22035u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9351a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f22034t;
        System.arraycopy(iArr, i3, iArr, i2, this.f22035u - i3);
        this.f22035u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m9351a();
        m9577d(i2);
        int[] iArr = this.f22034t;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22035u;
    }

    public zzadv(int[] iArr, int i2, boolean z) {
        super(z);
        this.f22034t = iArr;
        this.f22035u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9575b(((Integer) obj).intValue());
        return true;
    }
}
