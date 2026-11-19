package p032S;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: S.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0598b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public boolean f1313a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0599c f1314b;

    public C0598b(C0599c c0599c) {
        this.f1314b = c0599c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f1313a;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.f1313a = z2;
        if (!z2 || z) {
            return;
        }
        this.f1314b.f1315a.mo1277s();
    }
}
