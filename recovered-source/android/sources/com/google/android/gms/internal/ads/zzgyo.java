package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyo extends zzgwt {

    /* JADX INFO: renamed from: w */
    public static final zzgwt f18355w = new zzgyo(0, new Object[0]);

    /* JADX INFO: renamed from: u */
    public final transient Object[] f18356u;

    /* JADX INFO: renamed from: v */
    public final transient int f18357v;

    public zzgyo(int i2, Object[] objArr) {
        this.f18356u = objArr;
        this.f18357v = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: b */
    public final Object[] mo7208b() {
        return this.f18356u;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: d */
    public final int mo7209d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: g */
    public final int mo7210g() {
        return this.f18357v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgtr.m7136i(i2, this.f18357v);
        Object obj = this.f18356u[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: k */
    public final int mo7213k(int i2, Object[] objArr) {
        Object[] objArr2 = this.f18356u;
        int i3 = this.f18357v;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18357v;
    }
}
