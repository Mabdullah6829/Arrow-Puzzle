package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezp implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15231a;

    /* JADX INFO: renamed from: b */
    public final boolean f15232b;

    public zzezp(String str, boolean z) {
        this.f15231a = str;
        this.f15232b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f15231a);
        if (this.f15232b) {
            bundle.putString("de", "1");
        }
    }
}
