package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdf implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15479a;

    /* JADX INFO: renamed from: b */
    public final int f15480b;

    /* JADX INFO: renamed from: c */
    public final int f15481c;

    /* JADX INFO: renamed from: d */
    public final int f15482d;

    /* JADX INFO: renamed from: e */
    public final boolean f15483e;

    /* JADX INFO: renamed from: f */
    public final int f15484f;

    public zzfdf(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.f15479a = str;
        this.f15480b = i2;
        this.f15481c = i3;
        this.f15482d = i4;
        this.f15483e = z;
        this.f15484f = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f15479a;
        zzflv.m6494b(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i2 = this.f15480b;
        zzflv.m6495c(bundle, "cnt", i2, i2 != -2);
        bundle.putInt("gnt", this.f15481c);
        bundle.putInt("pt", this.f15482d);
        Bundle bundleM6493a = zzflv.m6493a(bundle, "device");
        bundle.putBundle("device", bundleM6493a);
        Bundle bundleM6493a2 = zzflv.m6493a(bundleM6493a, "network");
        bundleM6493a.putBundle("network", bundleM6493a2);
        bundleM6493a2.putInt("active_network_state", this.f15484f);
        bundleM6493a2.putBoolean("active_network_metered", this.f15483e);
    }
}
