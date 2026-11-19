package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfta extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzftc f16456a;

    public zzfta(zzftc zzftcVar) {
        Objects.requireNonNull(zzftcVar);
        this.f16456a = zzftcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        zzftc zzftcVar = this.f16456a;
        zzftcVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8036C)).booleanValue()) {
            zzftcVar.m6658a(true);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzftc zzftcVar = this.f16456a;
        zzftcVar.getClass();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8036C)).booleanValue()) {
            zzftcVar.m6658a(false);
        }
    }
}
