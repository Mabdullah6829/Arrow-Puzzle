package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaj extends zzah {

    /* JADX INFO: renamed from: w */
    public static final zzah f21579w = new zzaj(0, new Object[0]);

    /* JADX INFO: renamed from: u */
    public final transient Object[] f21580u;

    /* JADX INFO: renamed from: v */
    public final transient int f21581v;

    public zzaj(int i2, Object[] objArr) {
        this.f21580u = objArr;
        this.f21581v = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: b */
    public final Object[] mo9087b() {
        return this.f21580u;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: d */
    public final int mo9088d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: g */
    public final int mo9089g() {
        return this.f21581v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzr.m9108a(i2, this.f21581v);
        Object obj = this.f21580u[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: j */
    public final boolean mo9091j() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    /* JADX INFO: renamed from: k */
    public final void mo9092k(Object[] objArr) {
        System.arraycopy(this.f21580u, 0, objArr, 0, this.f21581v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21581v;
    }
}
