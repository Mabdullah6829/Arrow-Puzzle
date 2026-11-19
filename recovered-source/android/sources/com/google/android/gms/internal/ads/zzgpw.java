package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpw extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzgpy f18011a;

    public zzgpw(zzgpy zzgpyVar) {
        this.f18011a = zzgpyVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgpy zzgpyVar = this.f18011a;
        synchronized (zzgpyVar) {
            zzgpyVar.f18015c = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgpy zzgpyVar = this.f18011a;
        synchronized (zzgpyVar) {
            zzgpyVar.f18015c = null;
        }
    }
}
