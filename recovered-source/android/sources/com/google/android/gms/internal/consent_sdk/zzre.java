package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzre extends zzpb implements RandomAccess, zzqr {

    /* JADX INFO: renamed from: v */
    public static final long[] f21765v;

    /* JADX INFO: renamed from: t */
    public long[] f21766t;

    /* JADX INFO: renamed from: u */
    public int f21767u;

    static {
        long[] jArr = new long[0];
        f21765v = jArr;
        new zzre(jArr, 0, false);
    }

    public zzre() {
        this(f21765v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21767u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21767u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        long[] jArr = this.f21766t;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i2, jArr, i4, i3 - i2);
        } else {
            long[] jArr2 = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21766t, 0, jArr2, 0, i2);
            System.arraycopy(this.f21766t, i2, jArr2, i4, this.f21767u - i2);
            this.f21766t = jArr2;
        }
        this.f21766t[i2] = jLongValue;
        this.f21767u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9145a();
        Charset charset = zzqs.f21747a;
        collection.getClass();
        if (!(collection instanceof zzre)) {
            return super.addAll(collection);
        }
        zzre zzreVar = (zzre) collection;
        int i2 = zzreVar.f21767u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21767u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f21766t;
        if (i4 > jArr.length) {
            this.f21766t = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzreVar.f21766t, 0, this.f21766t, this.f21767u, zzreVar.f21767u);
        this.f21767u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m9232b(int i2) {
        m9233d(i2);
        return this.f21766t[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9233d(int i2) {
        if (i2 < 0 || i2 >= this.f21767u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21767u, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzre)) {
            return super.equals(obj);
        }
        zzre zzreVar = (zzre) obj;
        if (this.f21767u != zzreVar.f21767u) {
            return false;
        }
        long[] jArr = zzreVar.f21766t;
        for (int i2 = 0; i2 < this.f21767u; i2++) {
            if (this.f21766t[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9233d(i2);
        return Long.valueOf(this.f21766t[i2]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21767u; i3++) {
            long j2 = this.f21766t[i3];
            Charset charset = zzqs.f21747a;
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
        int i2 = this.f21767u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21766t[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9145a();
        m9233d(i2);
        long[] jArr = this.f21766t;
        long j2 = jArr[i2];
        int i3 = this.f21767u;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f21767u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9145a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f21766t;
        System.arraycopy(jArr, i3, jArr, i2, this.f21767u - i3);
        this.f21767u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m9145a();
        m9233d(i2);
        long[] jArr = this.f21766t;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21767u;
    }

    public zzre(long[] jArr, int i2, boolean z) {
        super(z);
        this.f21766t = jArr;
        this.f21767u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m9145a();
        int i2 = this.f21767u;
        int length = this.f21766t.length;
        if (i2 == length) {
            long[] jArr = new long[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21766t, 0, jArr, 0, this.f21767u);
            this.f21766t = jArr;
        }
        long[] jArr2 = this.f21766t;
        int i3 = this.f21767u;
        this.f21767u = i3 + 1;
        jArr2[i3] = jLongValue;
        return true;
    }
}
