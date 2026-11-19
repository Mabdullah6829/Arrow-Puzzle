package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzidb extends zzicx implements RandomAccess, zzier, zzigi {

    /* JADX INFO: renamed from: v */
    public static final boolean[] f19703v;

    /* JADX INFO: renamed from: t */
    public boolean[] f19704t;

    /* JADX INFO: renamed from: u */
    public int f19705u;

    static {
        boolean[] zArr = new boolean[0];
        f19703v = zArr;
        new zzidb(zArr, 0, false);
    }

    public zzidb() {
        this(f19703v, 0, true);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19705u)) {
            throw new IndexOutOfBoundsException(m8127g(i2));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.f19704t;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19704t, 0, zArr2, 0, i2);
            System.arraycopy(this.f19704t, i2, zArr2, i4, this.f19705u - i2);
            this.f19704t = zArr2;
        }
        this.f19704t[i2] = zBooleanValue;
        this.f19705u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8108a();
        collection.getClass();
        if (!(collection instanceof zzidb)) {
            return super.addAll(collection);
        }
        zzidb zzidbVar = (zzidb) collection;
        int i2 = zzidbVar.f19705u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19705u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f19704t;
        if (i4 > zArr.length) {
            this.f19704t = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzidbVar.f19704t, 0, this.f19704t, this.f19705u, zzidbVar.f19705u);
        this.f19705u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8124b(boolean z) {
        m8108a();
        int i2 = this.f19705u;
        int length = this.f19704t.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19704t, 0, zArr, 0, this.f19705u);
            this.f19704t = zArr;
        }
        boolean[] zArr2 = this.f19704t;
        int i3 = this.f19705u;
        this.f19705u = i3 + 1;
        zArr2[i3] = z;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: c */
    public final zzier mo8128l(int i2) {
        if (i2 >= this.f19705u) {
            return new zzidb(i2 == 0 ? f19703v : Arrays.copyOf(this.f19704t, i2), this.f19705u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8126d(int i2) {
        if (i2 < 0 || i2 >= this.f19705u) {
            throw new IndexOutOfBoundsException(m8127g(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzidb)) {
            return super.equals(obj);
        }
        zzidb zzidbVar = (zzidb) obj;
        if (this.f19705u != zzidbVar.f19705u) {
            return false;
        }
        boolean[] zArr = zzidbVar.f19704t;
        for (int i2 = 0; i2 < this.f19705u; i2++) {
            if (this.f19704t[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m8127g(int i2) {
        int i3 = this.f19705u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8126d(i2);
        return Boolean.valueOf(this.f19704t[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19705u; i3++) {
            int i4 = i2 * 31;
            boolean z = this.f19704t[i3];
            byte[] bArr = zzifc.f19794a;
            i2 = i4 + (z ? 1231 : 1237);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f19705u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f19704t[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8108a();
        m8126d(i2);
        boolean[] zArr = this.f19704t;
        boolean z = zArr[i2];
        int i3 = this.f19705u;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f19705u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8108a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19704t;
        System.arraycopy(zArr, i3, zArr, i2, this.f19705u - i3);
        this.f19705u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8108a();
        m8126d(i2);
        boolean[] zArr = this.f19704t;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19705u;
    }

    public zzidb(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.f19704t = zArr;
        this.f19705u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8124b(((Boolean) obj).booleanValue());
        return true;
    }
}
