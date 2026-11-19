package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcjl extends zzcjh {
    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: f */
    public final boolean mo5505f(String str) {
        String strM3035d = com.google.android.gms.ads.internal.util.client.zzf.m3035d(str, "MD5");
        zzchu zzchuVar = (zzchu) this.f10226u.get();
        if (zzchuVar != null && strM3035d != null) {
            zzchuVar.mo5478u(strM3035d, this);
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("VideoStreamNoopCache is doing nothing.");
        m5513p(str, strM3035d, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    /* JADX INFO: renamed from: o */
    public final void mo5512o() {
    }
}
