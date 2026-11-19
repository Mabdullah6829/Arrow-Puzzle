package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzry extends zzpb implements RandomAccess {

    /* JADX INFO: renamed from: v */
    public static final Object[] f21794v;

    /* JADX INFO: renamed from: w */
    public static final zzry f21795w;

    /* JADX INFO: renamed from: t */
    public Object[] f21796t;

    /* JADX INFO: renamed from: u */
    public int f21797u;

    static {
        Object[] objArr = new Object[0];
        f21794v = objArr;
        f21795w = new zzry(objArr, 0, false);
    }

    public zzry() {
        this(f21794v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21797u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21797u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.f21796t;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21796t, 0, objArr2, 0, i2);
            System.arraycopy(this.f21796t, i2, objArr2, i4, this.f21797u - i2);
            this.f21796t = objArr2;
        }
        this.f21796t[i2] = obj;
        this.f21797u++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: b */
    public final void m9256b(int i2) {
        if (i2 < 0 || i2 >= this.f21797u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21797u, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m9256b(i2);
        return this.f21796t[i2];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m9145a();
        m9256b(i2);
        Object[] objArr = this.f21796t;
        Object obj = objArr[i2];
        int i3 = this.f21797u;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f21797u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m9145a();
        m9256b(i2);
        Object[] objArr = this.f21796t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21797u;
    }

    public zzry(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f21796t = objArr;
        this.f21797u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m9145a();
        int i2 = this.f21797u;
        int length = this.f21796t.length;
        if (i2 == length) {
            this.f21796t = Arrays.copyOf(this.f21796t, AbstractC5152f.m3771c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f21796t;
        int i3 = this.f21797u;
        this.f21797u = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
