package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6271x extends AbstractC6221d implements InterfaceC6198T, RandomAccess, InterfaceC6164B0 {

    /* JADX INFO: renamed from: v */
    public static final C6271x f24295v = new C6271x(new double[0], 0, false);

    /* JADX INFO: renamed from: t */
    public double[] f24296t;

    /* JADX INFO: renamed from: u */
    public int f24297u;

    public C6271x(double[] dArr, int i2, boolean z) {
        super(z);
        this.f24296t = dArr;
        this.f24297u = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        m11859a();
        if (i2 < 0 || i2 > (i3 = this.f24297u)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24297u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        double[] dArr = this.f24296t;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f24296t, i2, dArr2, i2 + 1, this.f24297u - i2);
            this.f24296t = dArr2;
        }
        this.f24296t[i2] = dDoubleValue;
        this.f24297u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11859a();
        Charset charset = AbstractC6213a0.f24134a;
        collection.getClass();
        if (!(collection instanceof C6271x)) {
            return super.addAll(collection);
        }
        C6271x c6271x = (C6271x) collection;
        int i2 = c6271x.f24297u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24297u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f24296t;
        if (i4 > dArr.length) {
            this.f24296t = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(c6271x.f24296t, 0, this.f24296t, this.f24297u, c6271x.f24297u);
        this.f24297u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d) {
        m11859a();
        int i2 = this.f24297u;
        double[] dArr = this.f24296t;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[AbstractC1456a.m2436c(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f24296t = dArr2;
        }
        double[] dArr3 = this.f24296t;
        int i3 = this.f24297u;
        this.f24297u = i3 + 1;
        dArr3[i3] = d;
    }

    /* JADX INFO: renamed from: b */
    public final void m12074b(int i2) {
        if (i2 < 0 || i2 >= this.f24297u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24297u);
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
        if (!(obj instanceof C6271x)) {
            return super.equals(obj);
        }
        C6271x c6271x = (C6271x) obj;
        if (this.f24297u != c6271x.f24297u) {
            return false;
        }
        double[] dArr = c6271x.f24296t;
        for (int i2 = 0; i2 < this.f24297u; i2++) {
            if (Double.doubleToLongBits(this.f24296t[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m12074b(i2);
        return Double.valueOf(this.f24296t[i2]);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM11833b = 1;
        for (int i2 = 0; i2 < this.f24297u; i2++) {
            iM11833b = (iM11833b * 31) + AbstractC6213a0.m11833b(Double.doubleToLongBits(this.f24296t[i2]));
        }
        return iM11833b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f24297u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24296t[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24297u) {
            return new C6271x(Arrays.copyOf(this.f24296t, i2), this.f24297u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m12074b(i2);
        double[] dArr = this.f24296t;
        double d = dArr[i2];
        int i3 = this.f24297u;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f24297u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m11859a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f24296t;
        System.arraycopy(dArr, i3, dArr, i2, this.f24297u - i3);
        this.f24297u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m11859a();
        m12074b(i2);
        double[] dArr = this.f24296t;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24297u;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
