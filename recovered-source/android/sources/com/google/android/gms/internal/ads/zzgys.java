package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgys extends zzgwt {

    /* JADX INFO: renamed from: u */
    public final transient Object[] f18364u;

    /* JADX INFO: renamed from: v */
    public final transient int f18365v;

    /* JADX INFO: renamed from: w */
    public final transient int f18366w;

    public zzgys(Object[] objArr, int i2, int i3) {
        this.f18364u = objArr;
        this.f18365v = i2;
        this.f18366w = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgtr.m7136i(i2, this.f18366w);
        Object obj = this.f18364u[i2 + i2 + this.f18365v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: j */
    public final boolean mo7212j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18366w;
    }
}
