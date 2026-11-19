package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbj implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Bundle f15325a;

    public zzfbj(Bundle bundle) {
        this.f15325a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f15325a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
