package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzadm extends zzace implements RandomAccess, zzaea, zzafk {

    /* JADX INFO: renamed from: v */
    public static final float[] f22025v;

    /* JADX INFO: renamed from: t */
    public float[] f22026t;

    /* JADX INFO: renamed from: u */
    public int f22027u;

    static {
        float[] fArr = new float[0];
        f22025v = fArr;
        new zzadm(fArr, 0, false);
    }

    public zzadm() {
        this(f22025v, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f22027u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22027u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        float[] fArr = this.f22026t;
        int length = fArr.length;
        if (i3 < length) {
            System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
        } else {
            float[] fArr2 = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22026t, 0, fArr2, 0, i2);
            System.arraycopy(this.f22026t, i2, fArr2, i4, this.f22027u - i2);
            this.f22026t = fArr2;
        }
        this.f22026t[i2] = fFloatValue;
        this.f22027u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9351a();
        collection.getClass();
        if (!(collection instanceof zzadm)) {
            return super.addAll(collection);
        }
        zzadm zzadmVar = (zzadm) collection;
        int i2 = zzadmVar.f22027u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f22027u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f22026t;
        if (i4 > fArr.length) {
            this.f22026t = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zzadmVar.f22026t, 0, this.f22026t, this.f22027u, zzadmVar.f22027u);
        this.f22027u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9545b(float f2) {
        m9351a();
        int i2 = this.f22027u;
        int length = this.f22026t.length;
        if (i2 == length) {
            float[] fArr = new float[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22026t, 0, fArr, 0, this.f22027u);
            this.f22026t = fArr;
        }
        float[] fArr2 = this.f22026t;
        int i3 = this.f22027u;
        this.f22027u = i3 + 1;
        fArr2[i3] = f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m9546d(int i2) {
        if (i2 < 0 || i2 >= this.f22027u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22027u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: e */
    public final zzaea mo9370p(int i2) {
        if (i2 >= this.f22027u) {
            return new zzadm(i2 == 0 ? f22025v : Arrays.copyOf(this.f22026t, i2), this.f22027u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadm)) {
            return super.equals(obj);
        }
        zzadm zzadmVar = (zzadm) obj;
        if (this.f22027u != zzadmVar.f22027u) {
            return false;
        }
        float[] fArr = zzadmVar.f22026t;
        for (int i2 = 0; i2 < this.f22027u; i2++) {
            if (Float.floatToIntBits(this.f22026t[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9546d(i2);
        return Float.valueOf(this.f22026t[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f22027u; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f22026t[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f22027u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f22026t[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9351a();
        m9546d(i2);
        float[] fArr = this.f22026t;
        float f2 = fArr[i2];
        int i3 = this.f22027u;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f22027u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9351a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f22026t;
        System.arraycopy(fArr, i3, fArr, i2, this.f22027u - i3);
        this.f22027u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m9351a();
        m9546d(i2);
        float[] fArr = this.f22026t;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22027u;
    }

    public zzadm(float[] fArr, int i2, boolean z) {
        super(z);
        this.f22026t = fArr;
        this.f22027u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9545b(((Float) obj).floatValue());
        return true;
    }
}
