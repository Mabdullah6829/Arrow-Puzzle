package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbz implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15372a;

    /* JADX INFO: renamed from: b */
    public final Bundle f15373b;

    /* JADX INFO: renamed from: c */
    public final String f15374c;

    public zzfbz(String str, String str2, Bundle bundle) {
        this.f15372a = str;
        this.f15373b = bundle;
        this.f15374c = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f15372a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8476c5)).booleanValue()) {
            String str = this.f15374c;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.f15373b;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
