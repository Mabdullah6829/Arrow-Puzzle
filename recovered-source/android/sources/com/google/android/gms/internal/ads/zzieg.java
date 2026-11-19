package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzieg extends zzicx implements RandomAccess, zziew, zzigi {

    /* JADX INFO: renamed from: v */
    public static final float[] f19775v;

    /* JADX INFO: renamed from: t */
    public float[] f19776t;

    /* JADX INFO: renamed from: u */
    public int f19777u;

    static {
        float[] fArr = new float[0];
        f19775v = fArr;
        new zzieg(fArr, 0, false);
    }

    public zzieg() {
        this(f19775v, 0, true);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19777u)) {
            throw new IndexOutOfBoundsException(m8319g(i2));
        }
        int i4 = i2 + 1;
        float[] fArr = this.f19776t;
        int length = fArr.length;
        if (i3 < length) {
            System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
        } else {
            float[] fArr2 = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19776t, 0, fArr2, 0, i2);
            System.arraycopy(this.f19776t, i2, fArr2, i4, this.f19777u - i2);
            this.f19776t = fArr2;
        }
        this.f19776t[i2] = fFloatValue;
        this.f19777u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8108a();
        collection.getClass();
        if (!(collection instanceof zzieg)) {
            return super.addAll(collection);
        }
        zzieg zziegVar = (zzieg) collection;
        int i2 = zziegVar.f19777u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f19777u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f19776t;
        if (i4 > fArr.length) {
            this.f19776t = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zziegVar.f19776t, 0, this.f19776t, this.f19777u, zziegVar.f19777u);
        this.f19777u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8316b(float f2) {
        m8108a();
        int i2 = this.f19777u;
        int length = this.f19776t.length;
        if (i2 == length) {
            float[] fArr = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19776t, 0, fArr, 0, this.f19777u);
            this.f19776t = fArr;
        }
        float[] fArr2 = this.f19776t;
        int i3 = this.f19777u;
        this.f19777u = i3 + 1;
        fArr2[i3] = f2;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: c */
    public final zziew mo8128l(int i2) {
        if (i2 >= this.f19777u) {
            return new zzieg(i2 == 0 ? f19775v : Arrays.copyOf(this.f19776t, i2), this.f19777u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8318d(int i2) {
        if (i2 < 0 || i2 >= this.f19777u) {
            throw new IndexOutOfBoundsException(m8319g(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzieg)) {
            return super.equals(obj);
        }
        zzieg zziegVar = (zzieg) obj;
        if (this.f19777u != zziegVar.f19777u) {
            return false;
        }
        float[] fArr = zziegVar.f19776t;
        for (int i2 = 0; i2 < this.f19777u; i2++) {
            if (Float.floatToIntBits(this.f19776t[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m8319g(int i2) {
        int i3 = this.f19777u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m8318d(i2);
        return Float.valueOf(this.f19776t[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f19777u; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f19776t[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f19777u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f19776t[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8108a();
        m8318d(i2);
        float[] fArr = this.f19776t;
        float f2 = fArr[i2];
        int i3 = this.f19777u;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f19777u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m8108a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f19776t;
        System.arraycopy(fArr, i3, fArr, i2, this.f19777u - i3);
        this.f19777u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m8108a();
        m8318d(i2);
        float[] fArr = this.f19776t;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19777u;
    }

    public zzieg(float[] fArr, int i2, boolean z) {
        super(z);
        this.f19776t = fArr;
        this.f19777u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8316b(((Float) obj).floatValue());
        return true;
    }
}
