package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzifn extends zzicx implements RandomAccess, zzifa, zzigi {

    /* JADX INFO: renamed from: v */
    public static final long[] f19825v;

    /* JADX INFO: renamed from: w */
    public static final zzifn f19826w;

    /* JADX INFO: renamed from: t */
    public long[] f19827t;

    /* JADX INFO: renamed from: u */
    public int f19828u;

    static {
        long[] jArr = new long[0];
        f19825v = jArr;
        f19826w = new zzifn(jArr, 0, false);
    }

    public zzifn() {
        this(f19825v, 0, true);
    }

    /* JADX INFO: renamed from: A */
    public final long m8361A(int i2) {
        m8362b(i2);
        return this.f19827t[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19828u)) {
            throw new IndexOutOfBoundsException(m8363d(i2));
        }
        int i4 = i2 + 1;
        long[] jArr = this.f19827t;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i2, jArr, i4, i3 - i2);
        } else {
            long[] jArr2 = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19827t, 0, jArr2, 0, i2);
            System.arraycopy(this.f19827t, i2, jArr2, i4, this.f19828u - i2);
            this.f19827t = jArr2;
        }
        this.f19827t[i2] = jLongValue;
        this.f19828u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8108a();
        collection.getClass();
        if (!(collection instanceof zzifn)) {
            return super.addAll(collection);
        }
        zzifn zzifnVar = (zzifn) collection;
        int i2 = zzifnVar.f19828u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19828u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f19827t;
        if (i4 > jArr.length) {
            this.f19827t = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzifnVar.f19827t, 0, this.f19827t, this.f19828u, zzifnVar.f19828u);
        this.f19828u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8362b(int i2) {
        if (i2 < 0 || i2 >= this.f19828u) {
            throw new IndexOutOfBoundsException(m8363d(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final String m8363d(int i2) {
        int i3 = this.f19828u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzifn)) {
            return super.equals(obj);
        }
        zzifn zzifnVar = (zzifn) obj;
        if (this.f19828u != zzifnVar.f19828u) {
            return false;
        }
        long[] jArr = zzifnVar.f19827t;
        for (int i2 = 0; i2 < this.f19828u; i2++) {
            if (this.f19827t[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzifa
    /* JADX INFO: renamed from: f */
    public final void mo8353f(long j2) {
        m8108a();
        int i2 = this.f19828u;
        int length = this.f19827t.length;
        if (i2 == length) {
            long[] jArr = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19827t, 0, jArr, 0, this.f19828u);
            this.f19827t = jArr;
        }
        long[] jArr2 = this.f19827t;
        int i3 = this.f19828u;
        this.f19828u = i3 + 1;
        jArr2[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8362b(i2);
        return Long.valueOf(this.f19827t[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19828u; i3++) {
            long j2 = this.f19827t[i3];
            byte[] bArr = zzifc.f19794a;
            i2 = (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f19828u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f19827t[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: o */
    public final zzifa mo8128l(int i2) {
        if (i2 >= this.f19828u) {
            return new zzifn(i2 == 0 ? f19825v : Arrays.copyOf(this.f19827t, i2), this.f19828u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8108a();
        m8362b(i2);
        long[] jArr = this.f19827t;
        long j2 = jArr[i2];
        int i3 = this.f19828u;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f19828u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8108a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19827t;
        System.arraycopy(jArr, i3, jArr, i2, this.f19828u - i3);
        this.f19828u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8108a();
        m8362b(i2);
        long[] jArr = this.f19827t;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19828u;
    }

    public zzifn(long[] jArr, int i2, boolean z) {
        super(z);
        this.f19827t = jArr;
        this.f19828u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo8353f(((Long) obj).longValue());
        return true;
    }
}
