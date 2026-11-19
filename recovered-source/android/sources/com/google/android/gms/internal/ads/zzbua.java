package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbua extends zzcgk {

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.zzbc f9379d;

    /* JADX INFO: renamed from: c */
    public final Object f9378c = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f9380e = false;

    /* JADX INFO: renamed from: f */
    public int f9381f = 0;

    public zzbua(com.google.android.gms.ads.internal.util.zzbc zzbcVar) {
        this.f9379d = zzbcVar;
    }

    /* JADX INFO: renamed from: d */
    public final zzbtv m5137d() {
        zzbtv zzbtvVar = new zzbtv(this);
        com.google.android.gms.ads.internal.util.zze.m3150k("createNewReference: Trying to acquire lock");
        synchronized (this.f9378c) {
            com.google.android.gms.ads.internal.util.zze.m3150k("createNewReference: Lock acquired");
            m5399a(new zzbtw(this, zzbtvVar), new zzbtx(this, zzbtvVar));
            Preconditions.m3546j(this.f9381f >= 0);
            this.f9381f++;
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("createNewReference: Lock released");
        return zzbtvVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m5138e() {
        com.google.android.gms.ads.internal.util.zze.m3150k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f9378c) {
            com.google.android.gms.ads.internal.util.zze.m3150k("releaseOneReference: Lock acquired");
            Preconditions.m3546j(this.f9381f > 0);
            com.google.android.gms.ads.internal.util.zze.m3150k("Releasing 1 reference for JS Engine");
            this.f9381f--;
            m5140g();
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("releaseOneReference: Lock released");
    }

    /* JADX INFO: renamed from: f */
    public final void m5139f() {
        com.google.android.gms.ads.internal.util.zze.m3150k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f9378c) {
            com.google.android.gms.ads.internal.util.zze.m3150k("markAsDestroyable: Lock acquired");
            Preconditions.m3546j(this.f9381f >= 0);
            com.google.android.gms.ads.internal.util.zze.m3150k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f9380e = true;
            m5140g();
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("markAsDestroyable: Lock released");
    }

    /* JADX INFO: renamed from: g */
    public final void m5140g() {
        com.google.android.gms.ads.internal.util.zze.m3150k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f9378c) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("maybeDestroy: Lock acquired");
                Preconditions.m3546j(this.f9381f >= 0);
                if (this.f9380e && this.f9381f == 0) {
                    com.google.android.gms.ads.internal.util.zze.m3150k("No reference is left (including root). Cleaning up engine.");
                    m5399a(new zzbtz(), new zzcgg());
                } else {
                    com.google.android.gms.ads.internal.util.zze.m3150k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("maybeDestroy: Lock released");
    }
}
