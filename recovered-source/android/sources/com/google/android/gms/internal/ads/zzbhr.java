package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhr implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgd f7874s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbhs f7875t;

    public zzbhr(zzbhs zzbhsVar, zzcgd zzcgdVar) {
        this.f7874s = zzcgdVar;
        this.f7875t = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.f7875t.f7878c) {
            this.f7874s.m5398b(new RuntimeException("Connection failed."));
        }
    }
}
