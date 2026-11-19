package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzafm<E> extends zzace<E> implements RandomAccess {

    /* JADX INFO: renamed from: v */
    public static final Object[] f22096v;

    /* JADX INFO: renamed from: w */
    public static final zzafm f22097w;

    /* JADX INFO: renamed from: t */
    public Object[] f22098t;

    /* JADX INFO: renamed from: u */
    public int f22099u;

    static {
        Object[] objArr = new Object[0];
        f22096v = objArr;
        f22097w = new zzafm(objArr, 0, false);
    }

    public zzafm() {
        this(f22096v, 0, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f22099u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22099u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.f22098t;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22098t, 0, objArr2, 0, i2);
            System.arraycopy(this.f22098t, i2, objArr2, i4, this.f22099u - i2);
            this.f22098t = objArr2;
        }
        this.f22098t[i2] = obj;
        this.f22099u++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m9650b(int i2) {
        if (i2 < 0 || i2 >= this.f22099u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f22099u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i2 = this.f22099u;
        if (i2 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzafm)) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (!this.f22098t[i3].equals(list.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        zzafm zzafmVar = (zzafm) obj;
        for (int i4 = 0; i4 < i2; i4++) {
            if (!this.f22098t[i4].equals(zzafmVar.f22098t[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m9650b(i2);
        return this.f22098t[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = this.f22099u;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + this.f22098t[i3].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ zzaef mo9370p(int i2) {
        if (i2 >= this.f22099u) {
            return new zzafm(i2 == 0 ? f22096v : Arrays.copyOf(this.f22098t, i2), this.f22099u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m9351a();
        m9650b(i2);
        Object[] objArr = this.f22098t;
        Object obj = objArr[i2];
        int i3 = this.f22099u;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f22099u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m9351a();
        m9650b(i2);
        Object[] objArr = this.f22098t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22099u;
    }

    public zzafm(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f22098t = objArr;
        this.f22099u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m9351a();
        int i2 = this.f22099u;
        int length = this.f22098t.length;
        if (i2 == length) {
            this.f22098t = Arrays.copyOf(this.f22098t, AbstractC5152f.m3771c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f22098t;
        int i3 = this.f22099u;
        this.f22099u = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
