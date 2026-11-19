package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqo {

    /* JADX INFO: renamed from: a */
    public final zzgfs f18069a;

    public zzgqo(zzgcy zzgcyVar, zzgfs zzgfsVar) {
        this.f18069a = zzgfsVar;
    }

    /* JADX INFO: renamed from: a */
    public final zzgqm m7060a(int i2) {
        return new zzgqm(i2, this.f18069a);
    }

    /* JADX INFO: renamed from: b */
    public final void m7061b(int i2) {
        this.f18069a.mo6973b(i2 - 1, -1L, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m7062c(int i2, String str) {
        this.f18069a.mo6973b(i2 - 1, -1L, str, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m7063d(Throwable th, int i2) {
        this.f18069a.mo6973b(i2 - 1, -1L, null, th);
    }

    /* JADX INFO: renamed from: e */
    public final void m7064e(int i2, ListenableFuture listenableFuture) {
        zzgqm zzgqmVarM7060a = m7060a(i2);
        zzgqmVarM7060a.m7057a();
        listenableFuture.addListener(new zzhcd(listenableFuture, new zzgqn(this, zzgqmVarM7060a)), zzhbu.f18506s);
    }

    /* JADX INFO: renamed from: f */
    public final void m7065f(int i2, Runnable runnable) {
        zzgqm zzgqmVarM7060a = m7060a(i2);
        try {
            zzgqmVarM7060a.m7057a();
            runnable.run();
            zzgqmVarM7060a.m7059c();
        } catch (Throwable th) {
            try {
                zzgqmVarM7060a.m7058b(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarM7060a.m7059c();
                throw th2;
            }
        }
    }
}
