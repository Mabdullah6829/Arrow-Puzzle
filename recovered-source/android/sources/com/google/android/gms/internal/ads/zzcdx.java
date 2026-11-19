package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdx {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f9803a;

    public zzcdx(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.f9803a = zzgVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5355a(int i2, long j2) {
        zzbio zzbioVar = zzbix.f8438a1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.f9803a;
        if (j2 - zzgVar.mo3174w() < 0) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8455b1)).booleanValue()) {
            zzgVar.mo3168f0(i2);
            zzgVar.mo3167e0(j2);
        } else {
            zzgVar.mo3168f0(-1);
            zzgVar.mo3167e0(j2);
        }
    }
}
