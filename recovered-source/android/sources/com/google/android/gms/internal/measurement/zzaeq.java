package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeq extends zzace implements RandomAccess, zzaee, zzafk {

    /* JADX INFO: renamed from: v */
    public static final long[] f22058v;

    /* JADX INFO: renamed from: w */
    public static final zzaeq f22059w;

    /* JADX INFO: renamed from: t */
    public long[] f22060t;

    /* JADX INFO: renamed from: u */
    public int f22061u;

    static {
        long[] jArr = new long[0];
        f22058v = jArr;
        f22059w = new zzaeq(jArr, 0, false);
    }

    public zzaeq() {
        this(f22058v, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzaee
    /* JADX INFO: renamed from: A */
    public final long mo9596A(int i2) {
        m9603d(i2);
        return this.f22060t[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f22061u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22061u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        long[] jArr = this.f22060t;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i2, jArr, i4, i3 - i2);
        } else {
            long[] jArr2 = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22060t, 0, jArr2, 0, i2);
            System.arraycopy(this.f22060t, i2, jArr2, i4, this.f22061u - i2);
            this.f22060t = jArr2;
        }
        this.f22060t[i2] = jLongValue;
        this.f22061u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9351a();
        collection.getClass();
        if (!(collection instanceof zzaeq)) {
            return super.addAll(collection);
        }
        zzaeq zzaeqVar = (zzaeq) collection;
        int i2 = zzaeqVar.f22061u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f22061u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f22060t;
        if (i4 > jArr.length) {
            this.f22060t = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzaeqVar.f22060t, 0, this.f22060t, this.f22061u, zzaeqVar.f22061u);
        this.f22061u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9602b(long j2) {
        m9351a();
        int i2 = this.f22061u;
        int length = this.f22060t.length;
        if (i2 == length) {
            long[] jArr = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22060t, 0, jArr, 0, this.f22061u);
            this.f22060t = jArr;
        }
        long[] jArr2 = this.f22060t;
        int i3 = this.f22061u;
        this.f22061u = i3 + 1;
        jArr2[i3] = j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9603d(int i2) {
        if (i2 < 0 || i2 >= this.f22061u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22061u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: e */
    public final zzaee mo9370p(int i2) {
        if (i2 >= this.f22061u) {
            return new zzaeq(i2 == 0 ? f22058v : Arrays.copyOf(this.f22060t, i2), this.f22061u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaeq)) {
            return super.equals(obj);
        }
        zzaeq zzaeqVar = (zzaeq) obj;
        if (this.f22061u != zzaeqVar.f22061u) {
            return false;
        }
        long[] jArr = zzaeqVar.f22060t;
        for (int i2 = 0; i2 < this.f22061u; i2++) {
            if (this.f22060t[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9603d(i2);
        return Long.valueOf(this.f22060t[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f22061u; i3++) {
            long j2 = this.f22060t[i3];
            byte[] bArr = zzaed.f22038a;
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
        int i2 = this.f22061u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f22060t[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9351a();
        m9603d(i2);
        long[] jArr = this.f22060t;
        long j2 = jArr[i2];
        int i3 = this.f22061u;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f22061u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9351a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f22060t;
        System.arraycopy(jArr, i3, jArr, i2, this.f22061u - i3);
        this.f22061u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m9351a();
        m9603d(i2);
        long[] jArr = this.f22060t;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22061u;
    }

    public zzaeq(long[] jArr, int i2, boolean z) {
        super(z);
        this.f22060t = jArr;
        this.f22061u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9602b(((Long) obj).longValue());
        return true;
    }
}
