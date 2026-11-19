package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzidw extends zzicx implements RandomAccess, zzies, zzigi {

    /* JADX INFO: renamed from: v */
    public static final double[] f19753v;

    /* JADX INFO: renamed from: t */
    public double[] f19754t;

    /* JADX INFO: renamed from: u */
    public int f19755u;

    static {
        double[] dArr = new double[0];
        f19753v = dArr;
        new zzidw(dArr, 0, false);
    }

    public zzidw() {
        this(f19753v, 0, true);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19755u)) {
            throw new IndexOutOfBoundsException(m8303g(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.f19754t;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19754t, 0, dArr2, 0, i2);
            System.arraycopy(this.f19754t, i2, dArr2, i4, this.f19755u - i2);
            this.f19754t = dArr2;
        }
        this.f19754t[i2] = dDoubleValue;
        this.f19755u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8108a();
        collection.getClass();
        if (!(collection instanceof zzidw)) {
            return super.addAll(collection);
        }
        zzidw zzidwVar = (zzidw) collection;
        int i2 = zzidwVar.f19755u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19755u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f19754t;
        if (i4 > dArr.length) {
            this.f19754t = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzidwVar.f19754t, 0, this.f19754t, this.f19755u, zzidwVar.f19755u);
        this.f19755u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8300b(double d) {
        m8108a();
        int i2 = this.f19755u;
        int length = this.f19754t.length;
        if (i2 == length) {
            double[] dArr = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19754t, 0, dArr, 0, this.f19755u);
            this.f19754t = dArr;
        }
        double[] dArr2 = this.f19754t;
        int i3 = this.f19755u;
        this.f19755u = i3 + 1;
        dArr2[i3] = d;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: c */
    public final zzies mo8128l(int i2) {
        if (i2 >= this.f19755u) {
            return new zzidw(i2 == 0 ? f19753v : Arrays.copyOf(this.f19754t, i2), this.f19755u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8302d(int i2) {
        if (i2 < 0 || i2 >= this.f19755u) {
            throw new IndexOutOfBoundsException(m8303g(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzidw)) {
            return super.equals(obj);
        }
        zzidw zzidwVar = (zzidw) obj;
        if (this.f19755u != zzidwVar.f19755u) {
            return false;
        }
        double[] dArr = zzidwVar.f19754t;
        for (int i2 = 0; i2 < this.f19755u; i2++) {
            if (Double.doubleToLongBits(this.f19754t[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m8303g(int i2) {
        int i3 = this.f19755u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8302d(i2);
        return Double.valueOf(this.f19754t[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f19755u; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f19754t[i3]);
            byte[] bArr = zzifc.f19794a;
            i2 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f19755u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f19754t[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8108a();
        m8302d(i2);
        double[] dArr = this.f19754t;
        double d = dArr[i2];
        int i3 = this.f19755u;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f19755u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8108a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f19754t;
        System.arraycopy(dArr, i3, dArr, i2, this.f19755u - i3);
        this.f19755u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m8108a();
        m8302d(i2);
        double[] dArr = this.f19754t;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19755u;
    }

    public zzidw(double[] dArr, int i2, boolean z) {
        super(z);
        this.f19754t = dArr;
        this.f19755u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8300b(((Double) obj).doubleValue());
        return true;
    }
}
