package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwa implements zzfvt {

    /* JADX INFO: renamed from: d */
    public static zzfwa f16689d;

    /* JADX INFO: renamed from: a */
    public float f16690a;

    /* JADX INFO: renamed from: b */
    public zzfvo f16691b;

    /* JADX INFO: renamed from: c */
    public zzfvs f16692c;

    /* JADX INFO: renamed from: a */
    public static zzfwa m6737a() {
        if (f16689d == null) {
            new zzfvl();
            new zzfvp();
            zzfwa zzfwaVar = new zzfwa();
            zzfwaVar.f16690a = 0.0f;
            f16689d = zzfwaVar;
        }
        return f16689d;
    }

    @Override // com.google.android.gms.internal.ads.zzfvt
    /* JADX INFO: renamed from: L */
    public final void mo6730L(boolean z) {
        if (z) {
            zzfxc.f16735g.getClass();
            zzfxc.m6755b();
            return;
        }
        zzfxc.f16735g.getClass();
        Handler handler = zzfxc.f16737i;
        if (handler != null) {
            handler.removeCallbacks(zzfxc.f16739k);
            zzfxc.f16737i = null;
        }
    }
}
