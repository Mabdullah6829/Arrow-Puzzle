package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzezj implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15222a;

    /* JADX INFO: renamed from: b */
    public final String f15223b;

    /* JADX INFO: renamed from: c */
    public final Bundle f15224c;

    public /* synthetic */ zzezj(String str, String str2, Bundle bundle) {
        this.f15222a = str;
        this.f15223b = str2;
        this.f15224c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f15222a);
        bundle.putString("fc_consent", this.f15223b);
        Bundle bundle2 = this.f15224c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
