package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbru implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgd f9306s;

    public zzbru(zzbrv zzbrvVar, zzcgd zzcgdVar) {
        this.f9306s = zzcgdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f9306s.m5398b(new RuntimeException("Connection failed."));
    }
}
