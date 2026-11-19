package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzpd extends zzpb implements RandomAccess, zzqr {

    /* JADX INFO: renamed from: v */
    public static final boolean[] f21706v;

    /* JADX INFO: renamed from: t */
    public boolean[] f21707t;

    /* JADX INFO: renamed from: u */
    public int f21708u;

    static {
        boolean[] zArr = new boolean[0];
        f21706v = zArr;
        new zzpd(zArr, 0, false);
    }

    public zzpd() {
        this(f21706v, 0, true);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21708u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21708u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.f21707t;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21707t, 0, zArr2, 0, i2);
            System.arraycopy(this.f21707t, i2, zArr2, i4, this.f21708u - i2);
            this.f21707t = zArr2;
        }
        this.f21707t[i2] = zBooleanValue;
        this.f21708u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9145a();
        Charset charset = zzqs.f21747a;
        collection.getClass();
        if (!(collection instanceof zzpd)) {
            return super.addAll(collection);
        }
        zzpd zzpdVar = (zzpd) collection;
        int i2 = zzpdVar.f21708u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21708u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f21707t;
        if (i4 > zArr.length) {
            this.f21707t = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzpdVar.f21707t, 0, this.f21707t, this.f21708u, zzpdVar.f21708u);
        this.f21708u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m9146b(int i2) {
        if (i2 < 0 || i2 >= this.f21708u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21708u, "Index:", ", Size:"));
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
        if (!(obj instanceof zzpd)) {
            return super.equals(obj);
        }
        zzpd zzpdVar = (zzpd) obj;
        if (this.f21708u != zzpdVar.f21708u) {
            return false;
        }
        boolean[] zArr = zzpdVar.f21707t;
        for (int i2 = 0; i2 < this.f21708u; i2++) {
            if (this.f21707t[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9146b(i2);
        return Boolean.valueOf(this.f21707t[i2]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21708u; i3++) {
            int i4 = i2 * 31;
            boolean z = this.f21707t[i3];
            Charset charset = zzqs.f21747a;
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
        int i2 = this.f21708u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21707t[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9145a();
        m9146b(i2);
        boolean[] zArr = this.f21707t;
        boolean z = zArr[i2];
        int i3 = this.f21708u;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f21708u--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9145a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21707t;
        System.arraycopy(zArr, i3, zArr, i2, this.f21708u - i3);
        this.f21708u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m9145a();
        m9146b(i2);
        boolean[] zArr = this.f21707t;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21708u;
    }

    public zzpd(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.f21707t = zArr;
        this.f21708u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m9145a();
        int i2 = this.f21708u;
        int length = this.f21707t.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21707t, 0, zArr, 0, this.f21708u);
            this.f21707t = zArr;
        }
        boolean[] zArr2 = this.f21707t;
        int i3 = this.f21708u;
        this.f21708u = i3 + 1;
        zArr2[i3] = zBooleanValue;
        return true;
    }
}
