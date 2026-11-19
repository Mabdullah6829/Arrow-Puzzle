package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsb implements zzddt {

    /* JADX INFO: renamed from: s */
    public final zzdqb f12774s;

    /* JADX INFO: renamed from: t */
    public final zzdqf f12775t;

    /* JADX INFO: renamed from: u */
    public final Executor f12776u;

    /* JADX INFO: renamed from: v */
    public final Executor f12777v;

    public zzdsb(zzdqb zzdqbVar, zzdqf zzdqfVar, Executor executor, Executor executor2) {
        this.f12774s = zzdqbVar;
        this.f12775t = zzdqfVar;
        this.f12776u = executor;
        this.f12777v = executor2;
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        zzcgd zzcgdVar;
        if (this.f12775t.f12638e) {
            zzdqb zzdqbVar = this.f12774s;
            zzelv zzelvVarM6008k = zzdqbVar.m6008k();
            if (zzelvVarM6008k == null) {
                synchronized (zzdqbVar) {
                    listenableFuture = zzdqbVar.f12622m;
                }
                if (listenableFuture != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8680o6)).booleanValue()) {
                    synchronized (zzdqbVar) {
                        listenableFuture2 = zzdqbVar.f12622m;
                    }
                    synchronized (zzdqbVar) {
                        zzcgdVar = zzdqbVar.f12623n;
                    }
                    if (listenableFuture2 == null || zzcgdVar == null) {
                        return;
                    }
                    zzhbo zzhboVar = new zzhbo(zzgwt.m7221u(new ListenableFuture[]{listenableFuture2, zzcgdVar}), false);
                    zzhboVar.addListener(new zzhcd(zzhboVar, new zzdrz(this)), this.f12777v);
                    return;
                }
            }
            if (zzelvVarM6008k != null) {
                zzclb zzclbVarM6007j = zzdqbVar.m6007j();
                zzclb zzclbVarM6005h = zzdqbVar.m6005h();
                if (zzclbVarM6007j == null) {
                    zzclbVarM6007j = zzclbVarM6005h == null ? null : zzclbVarM6005h;
                }
                if (zzclbVarM6007j != null) {
                    this.f12776u.execute(new zzdsa(zzclbVarM6007j));
                }
            }
        }
    }
}
