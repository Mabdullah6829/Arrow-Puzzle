package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfh extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcfk f9884a;

    public zzcfh(zzcfk zzcfkVar) {
        Objects.requireNonNull(zzcfkVar);
        this.f9884a = zzcfkVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f9884a.f9904p.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f9884a.f9904p.set(false);
    }
}
