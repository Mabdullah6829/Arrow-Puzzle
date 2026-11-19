package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6233h extends AbstractC6221d implements InterfaceC6196S, RandomAccess, InterfaceC6164B0 {

    /* JADX INFO: renamed from: v */
    public static final C6233h f24179v = new C6233h(new boolean[0], 0, false);

    /* JADX INFO: renamed from: t */
    public boolean[] f24180t;

    /* JADX INFO: renamed from: u */
    public int f24181u;

    public C6233h(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.f24180t = zArr;
        this.f24181u = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m11859a();
        if (i2 < 0 || i2 > (i3 = this.f24181u)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24181u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        boolean[] zArr = this.f24180t;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f24180t, i2, zArr2, i2 + 1, this.f24181u - i2);
            this.f24180t = zArr2;
        }
        this.f24180t[i2] = zBooleanValue;
        this.f24181u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11859a();
        Charset charset = AbstractC6213a0.f24134a;
        collection.getClass();
        if (!(collection instanceof C6233h)) {
            return super.addAll(collection);
        }
        C6233h c6233h = (C6233h) collection;
        int i2 = c6233h.f24181u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24181u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f24180t;
        if (i4 > zArr.length) {
            this.f24180t = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(c6233h.f24180t, 0, this.f24180t, this.f24181u, c6233h.f24181u);
        this.f24181u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z) {
        m11859a();
        int i2 = this.f24181u;
        boolean[] zArr = this.f24180t;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC1456a.m2436c(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f24180t = zArr2;
        }
        boolean[] zArr3 = this.f24180t;
        int i3 = this.f24181u;
        this.f24181u = i3 + 1;
        zArr3[i3] = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m11887b(int i2) {
        if (i2 < 0 || i2 >= this.f24181u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24181u);
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
        if (!(obj instanceof C6233h)) {
            return super.equals(obj);
        }
        C6233h c6233h = (C6233h) obj;
        if (this.f24181u != c6233h.f24181u) {
            return false;
        }
        boolean[] zArr = c6233h.f24180t;
        for (int i2 = 0; i2 < this.f24181u; i2++) {
            if (this.f24180t[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m11887b(i2);
        return Boolean.valueOf(this.f24180t[i2]);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f24181u; i3++) {
            int i4 = i2 * 31;
            boolean z = this.f24180t[i3];
            Charset charset = AbstractC6213a0.f24134a;
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
        int i2 = this.f24181u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24180t[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24181u) {
            return new C6233h(Arrays.copyOf(this.f24180t, i2), this.f24181u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m11887b(i2);
        boolean[] zArr = this.f24180t;
        boolean z = zArr[i2];
        int i3 = this.f24181u;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f24181u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m11859a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f24180t;
        System.arraycopy(zArr, i3, zArr, i2, this.f24181u - i3);
        this.f24181u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m11859a();
        m11887b(i2);
        boolean[] zArr = this.f24180t;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24181u;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
