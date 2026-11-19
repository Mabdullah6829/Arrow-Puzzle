package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuu implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f14933a;

    public zzeuu(String str) {
        this.f14933a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f14933a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
