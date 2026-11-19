package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzpx extends zzpb implements RandomAccess, zzqr {

    /* JADX INFO: renamed from: v */
    public static final double[] f21724v;

    /* JADX INFO: renamed from: t */
    public double[] f21725t;

    /* JADX INFO: renamed from: u */
    public int f21726u;

    static {
        double[] dArr = new double[0];
        f21724v = dArr;
        new zzpx(dArr, 0, false);
    }

    public zzpx() {
        this(f21724v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21726u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21726u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        double[] dArr = this.f21725t;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21725t, 0, dArr2, 0, i2);
            System.arraycopy(this.f21725t, i2, dArr2, i4, this.f21726u - i2);
            this.f21725t = dArr2;
        }
        this.f21725t[i2] = dDoubleValue;
        this.f21726u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9145a();
        Charset charset = zzqs.f21747a;
        collection.getClass();
        if (!(collection instanceof zzpx)) {
            return super.addAll(collection);
        }
        zzpx zzpxVar = (zzpx) collection;
        int i2 = zzpxVar.f21726u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21726u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f21725t;
        if (i4 > dArr.length) {
            this.f21725t = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzpxVar.f21725t, 0, this.f21725t, this.f21726u, zzpxVar.f21726u);
        this.f21726u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9206b(int i2) {
        if (i2 < 0 || i2 >= this.f21726u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21726u, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpx)) {
            return super.equals(obj);
        }
        zzpx zzpxVar = (zzpx) obj;
        if (this.f21726u != zzpxVar.f21726u) {
            return false;
        }
        double[] dArr = zzpxVar.f21725t;
        for (int i2 = 0; i2 < this.f21726u; i2++) {
            if (Double.doubleToLongBits(this.f21725t[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9206b(i2);
        return Double.valueOf(this.f21725t[i2]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21726u; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f21725t[i3]);
            Charset charset = zzqs.f21747a;
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
        int i2 = this.f21726u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21725t[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9145a();
        m9206b(i2);
        double[] dArr = this.f21725t;
        double d = dArr[i2];
        int i3 = this.f21726u;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f21726u--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9145a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f21725t;
        System.arraycopy(dArr, i3, dArr, i2, this.f21726u - i3);
        this.f21726u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m9145a();
        m9206b(i2);
        double[] dArr = this.f21725t;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21726u;
    }

    public zzpx(double[] dArr, int i2, boolean z) {
        super(z);
        this.f21725t = dArr;
        this.f21726u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m9145a();
        int i2 = this.f21726u;
        int length = this.f21725t.length;
        if (i2 == length) {
            double[] dArr = new double[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21725t, 0, dArr, 0, this.f21726u);
            this.f21725t = dArr;
        }
        double[] dArr2 = this.f21725t;
        int i3 = this.f21726u;
        this.f21726u = i3 + 1;
        dArr2[i3] = dDoubleValue;
        return true;
    }
}
