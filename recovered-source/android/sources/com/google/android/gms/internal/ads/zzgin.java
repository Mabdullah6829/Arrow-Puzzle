package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgin implements zzgjh {

    /* JADX INFO: renamed from: a */
    public final Map f17531a;

    /* JADX INFO: renamed from: b */
    public final zzaxt f17532b;

    /* JADX INFO: renamed from: c */
    public final zzgqm f17533c;

    /* JADX INFO: renamed from: d */
    public final long f17534d;

    public zzgin(zzaxt zzaxtVar, Map map, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        this.f17531a = map;
        this.f17532b = zzaxtVar;
        this.f17533c = zzgqoVar.m7060a(112);
        this.f17534d = zzgdqVar.m6928b0();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzayt zzaytVar;
        try {
            try {
                this.f17533c.m7057a();
                ListenableFuture listenableFuture = (ListenableFuture) this.f17531a.get("gs");
                if (listenableFuture != null && (zzaytVar = (zzayt) listenableFuture.get(this.f17534d, TimeUnit.MILLISECONDS)) != null) {
                    zzaxt zzaxtVar = this.f17532b;
                    synchronized (zzaxtVar) {
                        zzazi zzaziVarM4567D0 = zzaytVar.m4567D0();
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4622r0(zzaziVarM4567D0);
                        long jM4563A0 = zzaytVar.m4563A0();
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4605a0(jM4563A0);
                    }
                }
            } catch (Throwable th) {
                this.f17533c.m7059c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.f17533c.m7058b(e);
        }
        this.f17533c.m7059c();
        return null;
    }
}
