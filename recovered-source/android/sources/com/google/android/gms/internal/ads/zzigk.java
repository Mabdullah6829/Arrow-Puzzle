package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzigk extends zzicx implements RandomAccess {

    /* JADX INFO: renamed from: v */
    public static final Object[] f19863v;

    /* JADX INFO: renamed from: w */
    public static final zzigk f19864w;

    /* JADX INFO: renamed from: t */
    public Object[] f19865t;

    /* JADX INFO: renamed from: u */
    public int f19866u;

    static {
        Object[] objArr = new Object[0];
        f19863v = objArr;
        f19864w = new zzigk(objArr, 0, false);
    }

    public zzigk() {
        this(f19863v, 0, true);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        m8108a();
        if (i2 < 0 || i2 > (i3 = this.f19866u)) {
            throw new IndexOutOfBoundsException(m8413d(i2));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.f19865t;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f19865t, 0, objArr2, 0, i2);
            System.arraycopy(this.f19865t, i2, objArr2, i4, this.f19866u - i2);
            this.f19865t = objArr2;
        }
        this.f19865t[i2] = obj;
        this.f19866u++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m8412b(int i2) {
        if (i2 < 0 || i2 >= this.f19866u) {
            throw new IndexOutOfBoundsException(m8413d(i2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m8413d(int i2) {
        int i3 = this.f19866u;
        return AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), "Index:", i2, ", Size:", i3);
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i2 = this.f19866u;
        if (i2 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzigk)) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (!this.f19865t[i3].equals(list.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        zzigk zzigkVar = (zzigk) obj;
        for (int i4 = 0; i4 < i2; i4++) {
            if (!this.f19865t[i4].equals(zzigkVar.f19865t[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m8412b(i2);
        return this.f19865t[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = this.f19866u;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + this.f19865t[i3].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzifb, com.google.android.gms.internal.ads.zzier
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ zzifb mo8128l(int i2) {
        if (i2 >= this.f19866u) {
            return new zzigk(i2 == 0 ? f19863v : Arrays.copyOf(this.f19865t, i2), this.f19866u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m8108a();
        m8412b(i2);
        Object[] objArr = this.f19865t;
        Object obj = objArr[i2];
        int i3 = this.f19866u;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f19866u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m8108a();
        m8412b(i2);
        Object[] objArr = this.f19865t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19866u;
    }

    public zzigk(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f19865t = objArr;
        this.f19866u = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8108a();
        int i2 = this.f19866u;
        int length = this.f19865t.length;
        if (i2 == length) {
            this.f19865t = Arrays.copyOf(this.f19865t, AbstractC5152f.m3771c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f19865t;
        int i3 = this.f19866u;
        this.f19866u = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
