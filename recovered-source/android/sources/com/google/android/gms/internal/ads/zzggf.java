package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzggf implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzggj f17191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f17192b;

    public /* synthetic */ zzggf(zzggj zzggjVar, int i2) {
        this.f17191a = zzggjVar;
        this.f17192b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i2 = this.f17192b - 1;
        zzggj zzggjVar = this.f17191a;
        if (i2 == 1) {
            return (zzggc) zzggjVar.f17196a.zzb();
        }
        if (i2 == 2) {
            return (zzggc) zzggjVar.f17197b.zzb();
        }
        if (i2 == 3) {
            return (zzggc) zzggjVar.f17198c.zzb();
        }
        zzggjVar.getClass();
        throw new IllegalArgumentException();
    }
}
