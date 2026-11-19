package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevs implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f14990a;

    /* JADX INFO: renamed from: b */
    public final boolean f14991b;

    public zzevs(String str, boolean z) {
        this.f14990a = str;
        this.f14991b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f14990a;
        if (str != null) {
            Bundle bundleM6493a = zzflv.m6493a(bundle, "pii");
            bundleM6493a.putString("afai", str);
            bundleM6493a.putBoolean("is_afai_lat", this.f14991b);
        }
    }
}
