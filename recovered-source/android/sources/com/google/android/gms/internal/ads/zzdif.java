package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdif implements zzdgf {

    /* JADX INFO: renamed from: s */
    public int f12208s;

    /* JADX INFO: renamed from: t */
    public int f12209t;

    @VisibleForTesting
    public zzdif() {
        zzbio zzbioVar = zzbix.f8242O1;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        this.f12208s = ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue();
        this.f12209t = ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8722qe)).intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final synchronized void mo5866s(zzfky zzfkyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8259P1)).booleanValue()) {
            try {
                zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
                this.f12208s = zzfkqVar.f15974c;
                this.f12209t = zzfkqVar.f15975d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
    }
}
