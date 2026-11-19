package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewg implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15015a;

    /* JADX INFO: renamed from: b */
    public final int f15016b;

    public zzewg(String str, int i2) {
        this.f15015a = str;
        this.f15016b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        int i2;
        Bundle bundle = (Bundle) obj;
        String str = this.f15015a;
        if (TextUtils.isEmpty(str) || (i2 = this.f15016b) == -1) {
            return;
        }
        Bundle bundleM6493a = zzflv.m6493a(bundle, "pii");
        bundle.putBundle("pii", bundleM6493a);
        bundleM6493a.putString("pvid", str);
        bundleM6493a.putInt("pvid_s", i2);
    }
}
