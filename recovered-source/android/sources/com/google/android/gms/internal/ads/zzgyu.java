package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyu extends zzgxd {

    /* JADX INFO: renamed from: A */
    public static final Object[] f18371A;

    /* JADX INFO: renamed from: B */
    public static final zzgyu f18372B;

    /* JADX INFO: renamed from: v */
    public final transient Object[] f18373v;

    /* JADX INFO: renamed from: w */
    public final transient int f18374w;

    /* JADX INFO: renamed from: x */
    public final transient Object[] f18375x;

    /* JADX INFO: renamed from: y */
    public final transient int f18376y;

    /* JADX INFO: renamed from: z */
    public final transient int f18377z;

    static {
        Object[] objArr = new Object[0];
        f18371A = objArr;
        f18372B = new zzgyu(0, 0, 0, objArr, objArr);
    }

    public zzgyu(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.f18373v = objArr;
        this.f18374w = i2;
        this.f18375x = objArr2;
        this.f18376y = i3;
        this.f18377z = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: a */
    public final zzgzh iterator() {
        return mo7211h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: b */
    public final Object[] mo7208b() {
        return this.f18373v;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f18375x;
            if (objArr.length != 0) {
                int iM7201b = zzgwm.m7201b(obj);
                while (true) {
                    int i2 = iM7201b & this.f18376y;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM7201b = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: d */
    public final int mo7209d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: g */
    public final int mo7210g() {
        return this.f18377z;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f18374w;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return mo7211h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public final int mo7213k(int i2, Object[] objArr) {
        Object[] objArr2 = this.f18373v;
        int i3 = this.f18377z;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18377z;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    /* JADX INFO: renamed from: t */
    public final zzgwt mo7245t() {
        return zzgwt.m7222v(this.f18377z, this.f18373v);
    }
}
