package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfap implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final zzfkm f15279a;

    public zzfap(zzfkm zzfkmVar) {
        this.f15279a = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        boolean z;
        boolean z2;
        Bundle bundle = (Bundle) obj;
        zzfkm zzfkmVar = this.f15279a;
        if (zzfkmVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8755sd)).booleanValue()) {
                return;
            }
            synchronized (zzfkmVar.f15878c) {
                zzfkmVar.m6479b();
                z = zzfkmVar.f15880e == 2;
            }
            bundle.putBoolean("render_in_browser", z);
            synchronized (zzfkmVar.f15878c) {
                zzfkmVar.m6479b();
                z2 = zzfkmVar.f15880e == 3;
            }
            bundle.putBoolean("disable_ml", z2);
        }
    }
}
