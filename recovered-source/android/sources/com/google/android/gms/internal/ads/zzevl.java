package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevl implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Bundle f14980a;

    public zzevl(Bundle bundle) {
        this.f14980a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f14980a;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", bundle2);
    }
}
