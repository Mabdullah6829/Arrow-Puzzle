package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzfxy implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final zzfys f16785s;

    /* JADX INFO: renamed from: t */
    public final String f16786t;

    /* JADX INFO: renamed from: u */
    public final String f16787u;

    /* JADX INFO: renamed from: v */
    public final zzbdz f16788v;

    /* JADX INFO: renamed from: w */
    public final LinkedBlockingQueue f16789w;

    /* JADX INFO: renamed from: x */
    public final HandlerThread f16790x;

    /* JADX INFO: renamed from: y */
    public final zzfxq f16791y;

    /* JADX INFO: renamed from: z */
    public final long f16792z;

    public zzfxy(Context context, zzbdz zzbdzVar, String str, String str2, zzfxq zzfxqVar) {
        this.f16786t = str;
        this.f16788v = zzbdzVar;
        this.f16787u = str2;
        this.f16791y = zzfxqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f16790x = handlerThread;
        handlerThread.start();
        this.f16792z = System.currentTimeMillis();
        zzfys zzfysVar = new zzfys(19621000, context, handlerThread.getLooper(), this, this);
        this.f16785s = zzfysVar;
        this.f16789w = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    /* JADX INFO: renamed from: a */
    public final void m6774a() {
        zzfys zzfysVar = this.f16785s;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6775b(int i2, long j2, Exception exc) {
        zzfxq zzfxqVar = this.f16791y;
        if (zzfxqVar != null) {
            zzfxqVar.mo6762c(i2, System.currentTimeMillis() - j2, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVar;
        long j2 = this.f16792z;
        HandlerThread handlerThread = this.f16790x;
        try {
            zzfyxVar = (zzfyx) this.f16785s.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfyxVar = null;
        }
        if (zzfyxVar != null) {
            try {
                zzfzc zzfzcVar = new zzfzc(this.f16786t, 1, this.f16787u, 1, this.f16788v.f7672s);
                Parcel parcelM4810u = zzfyxVar.m4810u();
                zzben.m4815c(parcelM4810u, zzfzcVar);
                Parcel parcelM4809k0 = zzfyxVar.m4809k0(3, parcelM4810u);
                zzfze zzfzeVar = (zzfze) zzben.m4814b(parcelM4809k0, zzfze.CREATOR);
                parcelM4809k0.recycle();
                m6775b(5011, j2, null);
                this.f16789w.put(zzfzeVar);
            } catch (Throwable th) {
                try {
                    m6775b(2010, j2, new Exception(th));
                } finally {
                    m6774a();
                    handlerThread.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            m6775b(4012, this.f16792z, null);
            this.f16789w.put(new zzfze());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            m6775b(4011, this.f16792z, null);
            this.f16789w.put(new zzfze());
        } catch (InterruptedException unused) {
        }
    }
}
