package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzfcm implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Bundle f15418a;

    public zzfcm(Bundle bundle) {
        this.f15418a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f15418a;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("shared_pref", bundle2);
    }
}
