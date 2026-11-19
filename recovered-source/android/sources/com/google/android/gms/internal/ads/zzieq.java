package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzieq extends zzicx implements RandomAccess, zziex, zzigi {

    /* JADX INFO: renamed from: v */
    public static final int[] f19790v;

    /* JADX INFO: renamed from: w */
    public static final zzieq f19791w;

    /* JADX INFO: renamed from: t */
    public int[] f19792t;

    /* JADX INFO: renamed from: u */
    public int f19793u;

    static {
        int[] iArr = new int[0];
        f19790v = iArr;
        f19791w = new zzieq(iArr, 0, false);
    }

    public zzieq() {
        this(f19790v, 0, true);
    }

    @Override // com.google.android.gms.internal.ads.zziex
    /* JADX INFO: renamed from: I */
    public final void mo8348I(int i2) {
        m8108a();
        int i3 = this.f19793u;
        int length = this.f19792t.length;
        if (i3 == length) {
            int[] iArr = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19792t, 0, iArr, 0, this.f19793u);
            this.f19792t = iArr;
        }
        int[] iArr2 = this.f19792t;
        int i4 = this.f19793u;
        this.f19793u = i4 + 1;
        iArr2[i4] = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19793u)) {
            throw new IndexOutOfBoundsException(m8351d(i2));
        }
        int i4 = i2 + 1;
        int[] iArr = this.f19792t;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
        } else {
            int[] iArr2 = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19792t, 0, iArr2, 0, i2);
            System.arraycopy(this.f19792t, i2, iArr2, i4, this.f19793u - i2);
            this.f19792t = iArr2;
        }
        this.f19792t[i2] = iIntValue;
        this.f19793u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8108a();
        collection.getClass();
        if (!(collection instanceof zzieq)) {
            return super.addAll(collection);
        }
        zzieq zzieqVar = (zzieq) collection;
        int i2 = zzieqVar.f19793u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19793u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f19792t;
        if (i4 > iArr.length) {
            this.f19792t = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzieqVar.f19792t, 0, this.f19792t, this.f19793u, zzieqVar.f19793u);
        this.f19793u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8349b(int i2) {
        if (i2 < 0 || i2 >= this.f19793u) {
            throw new IndexOutOfBoundsException(m8351d(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: c */
    public final zziex mo8128l(int i2) {
        if (i2 >= this.f19793u) {
            return new zzieq(i2 == 0 ? f19790v : Arrays.copyOf(this.f19792t, i2), this.f19793u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final String m8351d(int i2) {
        int i3 = this.f19793u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzieq)) {
            return super.equals(obj);
        }
        zzieq zzieqVar = (zzieq) obj;
        if (this.f19793u != zzieqVar.f19793u) {
            return false;
        }
        int[] iArr = zzieqVar.f19792t;
        for (int i2 = 0; i2 < this.f19793u; i2++) {
            if (this.f19792t[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8349b(i2);
        return Integer.valueOf(this.f19792t[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19793u; i3++) {
            i2 = (i2 * 31) + this.f19792t[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f19793u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f19792t[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public final int m8352o(int i2) {
        m8349b(i2);
        return this.f19792t[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8108a();
        m8349b(i2);
        int[] iArr = this.f19792t;
        int i3 = iArr[i2];
        int i4 = this.f19793u;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f19793u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8108a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19792t;
        System.arraycopy(iArr, i3, iArr, i2, this.f19793u - i3);
        this.f19793u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m8108a();
        m8349b(i2);
        int[] iArr = this.f19792t;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19793u;
    }

    public zzieq(int[] iArr, int i2, boolean z) {
        super(z);
        this.f19792t = iArr;
        this.f19793u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo8348I(((Integer) obj).intValue());
        return true;
    }
}
