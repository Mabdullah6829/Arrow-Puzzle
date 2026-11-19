package p032S;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: S.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0597a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0599c f1312a;

    public C0597a(C0599c c0599c) {
        this.f1312a = c0599c;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f1312a.f1315a.mo1277s();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        this.f1312a.f1315a.mo1277s();
    }
}
