package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdy extends zzdv {

    /* JADX INFO: renamed from: w */
    public static final zzdv f21641w = new zzdy(0, new Object[0]);

    /* JADX INFO: renamed from: u */
    public final transient Object[] f21642u;

    /* JADX INFO: renamed from: v */
    public final transient int f21643v;

    public zzdy(int i2, Object[] objArr) {
        this.f21642u = objArr;
        this.f21643v = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdv, com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: a */
    public final void mo9132a(Object[] objArr) {
        System.arraycopy(this.f21642u, 0, objArr, 0, this.f21643v);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: b */
    public final int mo9133b() {
        return this.f21643v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: d */
    public final int mo9134d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzdj.m9123a(i2, this.f21643v);
        Object obj = this.f21642u[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: h */
    public final Object[] mo9136h() {
        return this.f21642u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21643v;
    }
}
