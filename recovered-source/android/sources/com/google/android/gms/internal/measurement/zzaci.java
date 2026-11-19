package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaci extends zzace implements RandomAccess, zzadw, zzafk {

    /* JADX INFO: renamed from: v */
    public static final boolean[] f21962v;

    /* JADX INFO: renamed from: t */
    public boolean[] f21963t;

    /* JADX INFO: renamed from: u */
    public int f21964u;

    static {
        boolean[] zArr = new boolean[0];
        f21962v = zArr;
        new zzaci(zArr, 0, false);
    }

    public zzaci() {
        this(f21962v, 0, true);
    }

    /* JADX INFO: renamed from: I */
    public final void m9367I(int i2) {
        if (i2 < 0 || i2 >= this.f21964u) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f21964u, i2, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m9351a();
        if (i2 < 0 || i2 > (i3 = this.f21964u)) {
            throw new IndexOutOfBoundsException(zzacg.m9352a(this.f21964u, i2, (byte) 13, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.f21963t;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21963t, 0, zArr2, 0, i2);
            System.arraycopy(this.f21963t, i2, zArr2, i4, this.f21964u - i2);
            this.f21963t = zArr2;
        }
        this.f21963t[i2] = zBooleanValue;
        this.f21964u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9351a();
        collection.getClass();
        if (!(collection instanceof zzaci)) {
            return super.addAll(collection);
        }
        zzaci zzaciVar = (zzaci) collection;
        int i2 = zzaciVar.f21964u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21964u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f21963t;
        if (i4 > zArr.length) {
            this.f21963t = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzaciVar.f21963t, 0, this.f21963t, this.f21964u, zzaciVar.f21964u);
        this.f21964u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9368b(boolean z) {
        m9351a();
        int i2 = this.f21964u;
        int length = this.f21963t.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21963t, 0, zArr, 0, this.f21964u);
            this.f21963t = zArr;
        }
        boolean[] zArr2 = this.f21963t;
        int i3 = this.f21964u;
        this.f21964u = i3 + 1;
        zArr2[i3] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaef, com.google.android.gms.internal.measurement.zzadw
    /* JADX INFO: renamed from: e */
    public final zzadw mo9370p(int i2) {
        if (i2 >= this.f21964u) {
            return new zzaci(i2 == 0 ? f21962v : Arrays.copyOf(this.f21963t, i2), this.f21964u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaci)) {
            return super.equals(obj);
        }
        zzaci zzaciVar = (zzaci) obj;
        if (this.f21964u != zzaciVar.f21964u) {
            return false;
        }
        boolean[] zArr = zzaciVar.f21963t;
        for (int i2 = 0; i2 < this.f21964u; i2++) {
            if (this.f21963t[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9367I(i2);
        return Boolean.valueOf(this.f21963t[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21964u; i3++) {
            int i4 = i2 * 31;
            boolean z = this.f21963t[i3];
            byte[] bArr = zzaed.f22038a;
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
        int i2 = this.f21964u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21963t[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9351a();
        m9367I(i2);
        boolean[] zArr = this.f21963t;
        boolean z = zArr[i2];
        int i3 = this.f21964u;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f21964u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9351a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21963t;
        System.arraycopy(zArr, i3, zArr, i2, this.f21964u - i3);
        this.f21964u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m9351a();
        m9367I(i2);
        boolean[] zArr = this.f21963t;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21964u;
    }

    public zzaci(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.f21963t = zArr;
        this.f21964u = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzace, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9368b(((Boolean) obj).booleanValue());
        return true;
    }
}
