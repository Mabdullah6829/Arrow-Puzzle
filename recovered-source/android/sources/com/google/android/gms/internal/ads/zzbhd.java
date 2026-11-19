package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhd implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbhe f7841s;

    public zzbhd(zzbhe zzbheVar) {
        this.f7841s = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbhe zzbheVar = this.f7841s;
        synchronized (zzbheVar.f7844c) {
            try {
                zzbheVar.f7847f = null;
                if (zzbheVar.f7845d != null) {
                    zzbheVar.f7845d = null;
                }
                zzbheVar.f7844c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
