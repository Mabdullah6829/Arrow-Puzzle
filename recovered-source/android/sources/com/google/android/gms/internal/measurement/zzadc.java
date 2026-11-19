package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzadc extends zzace implements RandomAccess, zzadx, zzafk {

    /* JADX INFO: renamed from: v */
    public static final double[] f22007v;

    /* JADX INFO: renamed from: t */
    public double[] f22008t;

    /* JADX INFO: renamed from: u */
    public int f22009u;

    static {
        double[] dArr = new double[0];
        f22007v = dArr;
        new zzadc(dArr, 0, false);
    }

    public zzadc() {
        this(f22007v, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f22009u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22009u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        double[] dArr = this.f22008t;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22008t, 0, dArr2, 0, i2);
            System.arraycopy(this.f22008t, i2, dArr2, i4, this.f22009u - i2);
            this.f22008t = dArr2;
        }
        this.f22008t[i2] = dDoubleValue;
        this.f22009u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9351a();
        collection.getClass();
        if (!(collection instanceof zzadc)) {
            return super.addAll(collection);
        }
        zzadc zzadcVar = (zzadc) collection;
        int i2 = zzadcVar.f22009u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f22009u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f22008t;
        if (i4 > dArr.length) {
            this.f22008t = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzadcVar.f22008t, 0, this.f22008t, this.f22009u, zzadcVar.f22009u);
        this.f22009u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9532b(double d) {
        m9351a();
        int i2 = this.f22009u;
        int length = this.f22008t.length;
        if (i2 == length) {
            double[] dArr = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22008t, 0, dArr, 0, this.f22009u);
            this.f22008t = dArr;
        }
        double[] dArr2 = this.f22008t;
        int i3 = this.f22009u;
        this.f22009u = i3 + 1;
        dArr2[i3] = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9533d(int i2) {
        if (i2 < 0 || i2 >= this.f22009u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22009u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: e */
    public final zzadx mo9370p(int i2) {
        if (i2 >= this.f22009u) {
            return new zzadc(i2 == 0 ? f22007v : Arrays.copyOf(this.f22008t, i2), this.f22009u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadc)) {
            return super.equals(obj);
        }
        zzadc zzadcVar = (zzadc) obj;
        if (this.f22009u != zzadcVar.f22009u) {
            return false;
        }
        double[] dArr = zzadcVar.f22008t;
        for (int i2 = 0; i2 < this.f22009u; i2++) {
            if (Double.doubleToLongBits(this.f22008t[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9533d(i2);
        return Double.valueOf(this.f22008t[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f22009u; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f22008t[i3]);
            byte[] bArr = zzaed.f22038a;
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
        int i2 = this.f22009u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f22008t[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9351a();
        m9533d(i2);
        double[] dArr = this.f22008t;
        double d = dArr[i2];
        int i3 = this.f22009u;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f22009u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9351a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f22008t;
        System.arraycopy(dArr, i3, dArr, i2, this.f22009u - i3);
        this.f22009u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m9351a();
        m9533d(i2);
        double[] dArr = this.f22008t;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22009u;
    }

    public zzadc(double[] dArr, int i2, boolean z) {
        super(z);
        this.f22008t = dArr;
        this.f22009u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9532b(((Double) obj).doubleValue());
        return true;
    }
}
