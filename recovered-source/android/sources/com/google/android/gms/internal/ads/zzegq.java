package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegq extends zzegk {

    /* JADX INFO: renamed from: y */
    public String f13889y;

    /* JADX INFO: renamed from: z */
    public int f13890z;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f13878t) {
            try {
                if (!this.f13880v) {
                    this.f13880v = true;
                    try {
                        try {
                            int i2 = this.f13890z;
                            if (i2 == 2) {
                                ((zzcax) this.f13882x.getService()).mo5296O1(this.f13881w, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8790ue)).booleanValue() ? new zzegj(this.f13877s, this.f13881w) : new zzegi(this));
                            } else if (i2 == 3) {
                                ((zzcax) this.f13882x.getService()).mo5298h3(this.f13889y, ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8790ue)).booleanValue() ? new zzegj(this.f13877s, this.f13881w) : new zzegi(this));
                            } else {
                                this.f13877s.m5398b(new zzegz(1));
                            }
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f13877s.m5398b(new zzegz(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f13877s.m5398b(new zzegz(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Cannot connect to remote service, fallback to local instance.");
        this.f13877s.m5398b(new zzegz(1));
    }
}
