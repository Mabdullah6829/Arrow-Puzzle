package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfab implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Boolean f15257a;

    public zzfab(Boolean bool) {
        this.f15257a = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f15257a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
