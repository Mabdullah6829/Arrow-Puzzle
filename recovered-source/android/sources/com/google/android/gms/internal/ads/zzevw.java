package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevw implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.client.zzx f14997a;

    /* JADX INFO: renamed from: b */
    public final boolean f14998b;

    public zzevw(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.f14997a = zzxVar;
        this.f14998b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8731r6)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f14998b);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.f14997a;
        if (zzxVar != null) {
            int i2 = zzxVar.f3277s;
            if (i2 == 1) {
                bundle.putString("avo", "p");
            } else if (i2 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
