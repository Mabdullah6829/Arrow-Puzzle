package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6237i0 extends AbstractC6221d implements InterfaceC6208Y, RandomAccess, InterfaceC6164B0 {

    /* JADX INFO: renamed from: v */
    public static final C6237i0 f24187v = new C6237i0(new long[0], 0, false);

    /* JADX INFO: renamed from: t */
    public long[] f24188t;

    /* JADX INFO: renamed from: u */
    public int f24189u;

    public C6237i0(long[] jArr, int i2, boolean z) {
        super(z);
        this.f24188t = jArr;
        this.f24189u = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        m11859a();
        if (i2 < 0 || i2 > (i3 = this.f24189u)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24189u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        long[] jArr = this.f24188t;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f24188t, i2, jArr2, i2 + 1, this.f24189u - i2);
            this.f24188t = jArr2;
        }
        this.f24188t[i2] = jLongValue;
        this.f24189u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11859a();
        Charset charset = AbstractC6213a0.f24134a;
        collection.getClass();
        if (!(collection instanceof C6237i0)) {
            return super.addAll(collection);
        }
        C6237i0 c6237i0 = (C6237i0) collection;
        int i2 = c6237i0.f24189u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24189u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f24188t;
        if (i4 > jArr.length) {
            this.f24188t = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(c6237i0.f24188t, 0, this.f24188t, this.f24189u, c6237i0.f24189u);
        this.f24189u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j2) {
        m11859a();
        int i2 = this.f24189u;
        long[] jArr = this.f24188t;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[AbstractC1456a.m2436c(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f24188t = jArr2;
        }
        long[] jArr3 = this.f24188t;
        int i3 = this.f24189u;
        this.f24189u = i3 + 1;
        jArr3[i3] = j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m11888b(int i2) {
        if (i2 < 0 || i2 >= this.f24189u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24189u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6237i0)) {
            return super.equals(obj);
        }
        C6237i0 c6237i0 = (C6237i0) obj;
        if (this.f24189u != c6237i0.f24189u) {
            return false;
        }
        long[] jArr = c6237i0.f24188t;
        for (int i2 = 0; i2 < this.f24189u; i2++) {
            if (this.f24188t[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m11888b(i2);
        return Long.valueOf(this.f24188t[i2]);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM11833b = 1;
        for (int i2 = 0; i2 < this.f24189u; i2++) {
            iM11833b = (iM11833b * 31) + AbstractC6213a0.m11833b(this.f24188t[i2]);
        }
        return iM11833b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f24189u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24188t[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24189u) {
            return new C6237i0(Arrays.copyOf(this.f24188t, i2), this.f24189u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m11888b(i2);
        long[] jArr = this.f24188t;
        long j2 = jArr[i2];
        int i3 = this.f24189u;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f24189u--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m11859a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f24188t;
        System.arraycopy(jArr, i3, jArr, i2, this.f24189u - i3);
        this.f24189u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m11859a();
        m11888b(i2);
        long[] jArr = this.f24188t;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24189u;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
