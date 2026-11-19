package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

/* JADX INFO: loaded from: classes.dex */
final class zal implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ OnConnectionFailedListener f4495s;

    public zal(OnConnectionFailedListener onConnectionFailedListener) {
        this.f4495s = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f4495s.onConnectionFailed(connectionResult);
    }
}
