package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbtv extends zzcgk {

    /* JADX INFO: renamed from: c */
    public final Object f9372c = new Object();

    /* JADX INFO: renamed from: d */
    public final zzbua f9373d;

    /* JADX INFO: renamed from: e */
    public boolean f9374e;

    public zzbtv(zzbua zzbuaVar) {
        this.f9373d = zzbuaVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m5136d() {
        com.google.android.gms.ads.internal.util.zze.m3150k("release: Trying to acquire lock");
        synchronized (this.f9372c) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("release: Lock acquired");
                if (this.f9374e) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("release: Lock already released");
                    return;
                }
                this.f9374e = true;
                m5399a(new zzbts(), new zzcgg());
                m5399a(new zzbtt(this), new zzbtu(this));
                com.google.android.gms.ads.internal.util.zze.m3150k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
