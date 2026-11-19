package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzegk implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final zzcgd f13877s = new zzcgd();

    /* JADX INFO: renamed from: t */
    public final Object f13878t = new Object();

    /* JADX INFO: renamed from: u */
    public boolean f13879u = false;

    /* JADX INFO: renamed from: v */
    public boolean f13880v = false;

    /* JADX INFO: renamed from: w */
    public zzcbk f13881w;

    /* JADX INFO: renamed from: x */
    public zzcam f13882x;

    /* JADX INFO: renamed from: b */
    public static void m6205b(Context context, zzcgd zzcgdVar, Executor executor) {
        if (((Boolean) zzbkp.f9006j.m5057c()).booleanValue() || ((Boolean) zzbkp.f9004h.m5057c()).booleanValue()) {
            zzcgdVar.addListener(new zzhcd(zzcgdVar, new zzegh(context)), executor);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6206a() {
        synchronized (this.f13878t) {
            try {
                this.f13880v = true;
                if (this.f13882x.isConnected() || this.f13882x.isConnecting()) {
                    this.f13882x.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Disconnected from remote ad request service.");
        this.f13877s.m5398b(new zzegz(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i2) {
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Cannot connect to remote service, fallback to local instance.");
    }
}
