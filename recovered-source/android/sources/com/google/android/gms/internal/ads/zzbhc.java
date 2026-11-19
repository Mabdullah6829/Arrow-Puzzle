package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhc implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbhe f7840s;

    public zzbhc(zzbhe zzbheVar) {
        this.f7840s = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhe zzbheVar = this.f7840s;
        synchronized (zzbheVar.f7844c) {
            try {
                zzbhh zzbhhVar = zzbheVar.f7845d;
                if (zzbhhVar != null) {
                    zzbheVar.f7847f = (zzbhk) zzbhhVar.getService();
                }
            } catch (DeadObjectException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to obtain a cache service instance.", e);
                this.f7840s.m4883c();
            }
            this.f7840s.f7844c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        zzbhe zzbheVar = this.f7840s;
        synchronized (zzbheVar.f7844c) {
            zzbheVar.f7847f = null;
            zzbheVar.f7844c.notifyAll();
        }
    }
}
