package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcz implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final int f15441a;

    /* JADX INFO: renamed from: b */
    public final int f15442b;

    public zzfcz(int i2, int i3) {
        this.f15441a = i2;
        this.f15442b = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        int i2;
        Bundle bundle = (Bundle) obj;
        int i3 = this.f15441a;
        if (i3 == -1 || (i2 = this.f15442b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i3);
        bundle.putInt("crashes_without_flags", i2);
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f3085g;
        if (com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.f8000j) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
