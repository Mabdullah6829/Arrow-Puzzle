package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbq implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15342a;

    public zzfbq(String str) {
        this.f15342a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        ((Bundle) obj).putString("request_id", this.f15342a);
    }
}
