package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcyk implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzhcc f11777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcyp f11778b;

    public zzcyk(zzcyp zzcypVar, zzhcc zzhccVar) {
        this.f11777a = zzhccVar;
        Objects.requireNonNull(zzcypVar);
        this.f11778b = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        zzcyp zzcypVar = this.f11778b;
        zzcypVar.getClass();
        ((zzcfx) zzcfy.f9951f).execute(new zzcyn(zzcypVar));
        ((zzeue) this.f11777a).mo3316a((zzcya) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzcyp zzcypVar = this.f11778b;
        zzcypVar.getClass();
        ((zzcfx) zzcfy.f9951f).execute(new zzcyn(zzcypVar));
        ((zzeue) this.f11777a).mo3317b(th);
    }
}
