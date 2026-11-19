package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewy implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final double f15072a;

    /* JADX INFO: renamed from: b */
    public final boolean f15073b;

    public zzewy(double d, boolean z) {
        this.f15072a = d;
        this.f15073b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleM6493a = zzflv.m6493a(bundle, "device");
        bundle.putBundle("device", bundleM6493a);
        Bundle bundleM6493a2 = zzflv.m6493a(bundleM6493a, "battery");
        bundleM6493a.putBundle("battery", bundleM6493a2);
        bundleM6493a2.putBoolean("is_charging", this.f15073b);
        bundleM6493a2.putDouble("battery_level", this.f15072a);
    }
}
