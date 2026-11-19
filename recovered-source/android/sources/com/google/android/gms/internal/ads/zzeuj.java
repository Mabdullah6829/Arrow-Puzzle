package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuj implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final boolean f14908a;

    public zzeuj(boolean z) {
        this.f14908a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f14908a ? "0" : "1");
    }
}
