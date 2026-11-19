package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzejj implements zzden, zzddc {

    /* JADX INFO: renamed from: u */
    public static final Object f14019u = new Object();

    /* JADX INFO: renamed from: v */
    public static int f14020v;

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.ads.internal.util.zzg f14021s;

    /* JADX INFO: renamed from: t */
    public final zzejt f14022t;

    public zzejj(zzejt zzejtVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f14022t = zzejtVar;
        this.f14021s = zzjVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6234a(boolean z) {
        int i2;
        int iIntValue;
        zzbio zzbioVar = zzbix.f8512e7;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && !this.f14021s.mo3172s()) {
            Object obj = f14019u;
            synchronized (obj) {
                i2 = f14020v;
                iIntValue = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8529f7)).intValue();
            }
            if (i2 < iIntValue) {
                zzejt zzejtVar = this.f14022t;
                zzfoz zzfozVarM5894a = zzejtVar.f14049d.m5894a(new Bundle());
                zzfozVarM5894a.addListener(new zzhcd(zzfozVarM5894a, new zzejs(zzejtVar, z)), zzcfy.f9953h);
                synchronized (obj) {
                    f14020v++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        m6234a(true);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        m6234a(false);
    }
}
