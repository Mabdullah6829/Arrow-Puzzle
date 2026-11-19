package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsl implements zzcsb {

    /* JADX INFO: renamed from: a */
    public final zzecz f11331a;

    public zzcsl(zzecz zzeczVar) {
        this.f11331a = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb
    /* JADX INFO: renamed from: n */
    public final void mo5815n(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8013Aa)).booleanValue()) {
            zzecz zzeczVar = this.f11331a;
            synchronized (zzeczVar) {
                zzeczVar.f13645p = jSONObject;
            }
        }
    }
}
