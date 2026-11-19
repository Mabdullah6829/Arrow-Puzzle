package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzfyb implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final zzfys f16796s;

    /* JADX INFO: renamed from: t */
    public final zzfym f16797t;

    /* JADX INFO: renamed from: u */
    public final Object f16798u = new Object();

    /* JADX INFO: renamed from: v */
    public boolean f16799v = false;

    /* JADX INFO: renamed from: w */
    public boolean f16800w = false;

    public zzfyb(Context context, Looper looper, zzfym zzfymVar) {
        this.f16797t = zzfymVar;
        this.f16796s = new zzfys(12800000, context, looper, this, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m6778a() {
        synchronized (this.f16798u) {
            try {
                zzfys zzfysVar = this.f16796s;
                if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                    zzfysVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f16798u) {
            try {
                if (this.f16800w) {
                    return;
                }
                this.f16800w = true;
                try {
                    zzfyx zzfyxVar = (zzfyx) this.f16796s.getService();
                    zzfyq zzfyqVar = new zzfyq(1, this.f16797t.m8099h());
                    Parcel parcelM4810u = zzfyxVar.m4810u();
                    zzben.m4815c(parcelM4810u, zzfyqVar);
                    zzfyxVar.m4811u0(2, parcelM4810u);
                } catch (Exception unused) {
                } finally {
                    m6778a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
    }
}
