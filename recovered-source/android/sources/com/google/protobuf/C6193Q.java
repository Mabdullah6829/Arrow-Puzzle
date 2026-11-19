package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C6193Q extends AbstractC6221d implements InterfaceC6206X, RandomAccess, InterfaceC6164B0 {

    /* JADX INFO: renamed from: v */
    public static final C6193Q f24120v = new C6193Q(new int[0], 0, false);

    /* JADX INFO: renamed from: t */
    public int[] f24121t;

    /* JADX INFO: renamed from: u */
    public int f24122u;

    public C6193Q(int[] iArr, int i2, boolean z) {
        super(z);
        this.f24121t = iArr;
        this.f24122u = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        m11859a();
        if (i2 < 0 || i2 > (i3 = this.f24122u)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24122u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        int[] iArr = this.f24121t;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f24121t, i2, iArr2, i2 + 1, this.f24122u - i2);
            this.f24121t = iArr2;
        }
        this.f24121t[i2] = iIntValue;
        this.f24122u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11859a();
        Charset charset = AbstractC6213a0.f24134a;
        collection.getClass();
        if (!(collection instanceof C6193Q)) {
            return super.addAll(collection);
        }
        C6193Q c6193q = (C6193Q) collection;
        int i2 = c6193q.f24122u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24122u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f24121t;
        if (i4 > iArr.length) {
            this.f24121t = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(c6193q.f24121t, 0, this.f24121t, this.f24122u, c6193q.f24122u);
        this.f24122u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i2) {
        m11859a();
        int i3 = this.f24122u;
        int[] iArr = this.f24121t;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f24121t = iArr2;
        }
        int[] iArr3 = this.f24121t;
        int i4 = this.f24122u;
        this.f24122u = i4 + 1;
        iArr3[i4] = i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m11811b(int i2) {
        if (i2 < 0 || i2 >= this.f24122u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24122u);
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
        if (!(obj instanceof C6193Q)) {
            return super.equals(obj);
        }
        C6193Q c6193q = (C6193Q) obj;
        if (this.f24122u != c6193q.f24122u) {
            return false;
        }
        int[] iArr = c6193q.f24121t;
        for (int i2 = 0; i2 < this.f24122u; i2++) {
            if (this.f24121t[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m11811b(i2);
        return Integer.valueOf(this.f24121t[i2]);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24122u; i3++) {
            i2 = (i2 * 31) + this.f24121t[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f24122u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24121t[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24122u) {
            return new C6193Q(Arrays.copyOf(this.f24121t, i2), this.f24122u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m11811b(i2);
        int[] iArr = this.f24121t;
        int i3 = iArr[i2];
        int i4 = this.f24122u;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f24122u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m11859a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24121t;
        System.arraycopy(iArr, i3, iArr, i2, this.f24122u - i3);
        this.f24122u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m11859a();
        m11811b(i2);
        int[] iArr = this.f24121t;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24122u;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
