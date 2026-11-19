package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfam implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Bundle f15277a;

    public zzfam(Bundle bundle) {
        this.f15277a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM6493a = zzflv.m6493a(bundle, "device");
        bundleM6493a.putBundle("android_mem_info", this.f15277a);
        bundle.putBundle("device", bundleM6493a);
    }
}
