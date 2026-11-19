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
final class zzfxw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final zzfys f16780s;

    /* JADX INFO: renamed from: t */
    public final String f16781t;

    /* JADX INFO: renamed from: u */
    public final String f16782u;

    /* JADX INFO: renamed from: v */
    public final LinkedBlockingQueue f16783v;

    /* JADX INFO: renamed from: w */
    public final HandlerThread f16784w;

    public zzfxw(Context context, String str, String str2) {
        this.f16781t = str;
        this.f16782u = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f16784w = handlerThread;
        handlerThread.start();
        zzfys zzfysVar = new zzfys(9200000, context, handlerThread.getLooper(), this, this);
        this.f16780s = zzfysVar;
        this.f16783v = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    /* JADX INFO: renamed from: b */
    public static zzayt m6771b() {
        zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
        zzaxtVarM4561F0.m4531r(32768L);
        return (zzayt) zzaxtVarM4561F0.m8328o();
    }

    /* JADX INFO: renamed from: a */
    public final void m6772a() {
        zzfys zzfysVar = this.f16780s;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVar;
        LinkedBlockingQueue linkedBlockingQueue = this.f16783v;
        HandlerThread handlerThread = this.f16784w;
        try {
            zzfyxVar = (zzfyx) this.f16780s.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzfyxVar = null;
        }
        if (zzfyxVar != null) {
            try {
                try {
                    zzfyt zzfytVar = new zzfyt(1, this.f16781t, this.f16782u);
                    Parcel parcelM4810u = zzfyxVar.m4810u();
                    zzben.m4815c(parcelM4810u, zzfytVar);
                    Parcel parcelM4809k0 = zzfyxVar.m4809k0(1, parcelM4810u);
                    zzfyv zzfyvVar = (zzfyv) zzben.m4814b(parcelM4809k0, zzfyv.CREATOR);
                    parcelM4809k0.recycle();
                    if (zzfyvVar.f16817t == null) {
                        try {
                            byte[] bArr = zzfyvVar.f16818u;
                            zzidz zzidzVar = zzidz.f19758b;
                            int i2 = zzicy.f19697a;
                            zzfyvVar.f16817t = zzayt.m4560E0(bArr, zzidz.f19759c);
                            zzfyvVar.f16818u = null;
                        } catch (zzifh | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    zzfyvVar.m6789w();
                    linkedBlockingQueue.put(zzfyvVar.f16817t);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(m6771b());
                }
            } catch (InterruptedException unused3) {
            } finally {
                m6772a();
                handlerThread.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.f16783v.put(m6771b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            this.f16783v.put(m6771b());
        } catch (InterruptedException unused) {
        }
    }
}
