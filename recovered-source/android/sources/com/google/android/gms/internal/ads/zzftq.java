package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftq extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzftr f16503a;

    public zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.f16503a = zzftrVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f16503a.m6688b(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f16503a.m6688b(false);
    }
}
