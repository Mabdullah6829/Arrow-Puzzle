package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.AbstractC5152f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzqn extends zzpb implements RandomAccess, zzqq {

    /* JADX INFO: renamed from: v */
    public static final int[] f21743v;

    /* JADX INFO: renamed from: w */
    public static final zzqn f21744w;

    /* JADX INFO: renamed from: t */
    public int[] f21745t;

    /* JADX INFO: renamed from: u */
    public int f21746u;

    static {
        int[] iArr = new int[0];
        f21743v = iArr;
        f21744w = new zzqn(iArr, 0, false);
    }

    public zzqn() {
        this(f21743v, 0, true);
    }

    /* JADX INFO: renamed from: I */
    public final void m9227I(int i2) {
        if (i2 < 0 || i2 >= this.f21746u) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21746u, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        m9145a();
        if (i2 < 0 || i2 > (i3 = this.f21746u)) {
            throw new IndexOutOfBoundsException(AbstractC1456a.m2443j(i2, this.f21746u, "Index:", ", Size:"));
        }
        int i4 = i2 + 1;
        int[] iArr = this.f21745t;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
        } else {
            int[] iArr2 = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21745t, 0, iArr2, 0, i2);
            System.arraycopy(this.f21745t, i2, iArr2, i4, this.f21746u - i2);
            this.f21745t = iArr2;
        }
        this.f21745t[i2] = iIntValue;
        this.f21746u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m9145a();
        Charset charset = zzqs.f21747a;
        collection.getClass();
        if (!(collection instanceof zzqn)) {
            return super.addAll(collection);
        }
        zzqn zzqnVar = (zzqn) collection;
        int i2 = zzqnVar.f21746u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21746u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f21745t;
        if (i4 > iArr.length) {
            this.f21745t = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(zzqnVar.f21745t, 0, this.f21745t, this.f21746u, zzqnVar.f21746u);
        this.f21746u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final int m9228b(int i2) {
        m9227I(i2);
        return this.f21745t[i2];
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
        if (!(obj instanceof zzqn)) {
            return super.equals(obj);
        }
        zzqn zzqnVar = (zzqn) obj;
        if (this.f21746u != zzqnVar.f21746u) {
            return false;
        }
        int[] iArr = zzqnVar.f21745t;
        for (int i2 = 0; i2 < this.f21746u; i2++) {
            if (this.f21745t[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        m9227I(i2);
        return Integer.valueOf(this.f21745t[i2]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21746u; i3++) {
            i2 = (i2 * 31) + this.f21745t[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f21746u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21745t[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9145a();
        m9227I(i2);
        int[] iArr = this.f21745t;
        int i3 = iArr[i2];
        int i4 = this.f21746u;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f21746u--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m9145a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21745t;
        System.arraycopy(iArr, i3, iArr, i2, this.f21746u - i3);
        this.f21746u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m9145a();
        m9227I(i2);
        int[] iArr = this.f21745t;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21746u;
    }

    public zzqn(int[] iArr, int i2, boolean z) {
        super(z);
        this.f21745t = iArr;
        this.f21746u = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m9145a();
        int i2 = this.f21746u;
        int length = this.f21745t.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC5152f.m3771c(length, 3, 2, 1, 10)];
            System.arraycopy(this.f21745t, 0, iArr, 0, this.f21746u);
            this.f21745t = iArr;
        }
        int[] iArr2 = this.f21745t;
        int i3 = this.f21746u;
        this.f21746u = i3 + 1;
        iArr2[i3] = iIntValue;
        return true;
    }
}
