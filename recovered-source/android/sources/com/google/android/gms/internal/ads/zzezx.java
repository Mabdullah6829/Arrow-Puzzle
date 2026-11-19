package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezx implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final boolean f15241a;

    public zzezx(boolean z) {
        this.f15241a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.f15241a);
    }
}
