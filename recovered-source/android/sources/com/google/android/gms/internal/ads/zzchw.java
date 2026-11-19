package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzchw implements Runnable {

    /* JADX INFO: renamed from: s */
    public final zzchi f10112s;

    /* JADX INFO: renamed from: t */
    public boolean f10113t = false;

    public zzchw(zzchi zzchiVar) {
        this.f10112s = zzchiVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5484a() {
        this.f10113t = true;
        this.f10112s.m5433b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10113t) {
            return;
        }
        this.f10112s.m5433b();
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
        zzfVar.removeCallbacks(this);
        zzfVar.postDelayed(this, 250L);
    }
}
