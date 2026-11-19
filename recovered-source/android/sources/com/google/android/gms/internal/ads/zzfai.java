package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfai implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15269a;

    /* JADX INFO: renamed from: b */
    public final boolean f15270b;

    /* JADX INFO: renamed from: c */
    public final boolean f15271c;

    /* JADX INFO: renamed from: d */
    public final boolean f15272d;

    /* JADX INFO: renamed from: e */
    public final boolean f15273e;

    public zzfai(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15269a = str;
        this.f15270b = z;
        this.f15271c = z2;
        this.f15272d = z3;
        this.f15273e = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f15269a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.f15270b;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.f15271c;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            zzbio zzbioVar = zzbix.f8013Aa;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                bundle.putInt("risd", !this.f15272d ? 1 : 0);
            }
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8081Ea)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f15273e);
            }
        }
    }
}
