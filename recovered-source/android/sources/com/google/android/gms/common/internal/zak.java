package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;

/* JADX INFO: loaded from: classes.dex */
final class zak implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ConnectionCallbacks f4494s;

    public zak(ConnectionCallbacks connectionCallbacks) {
        this.f4494s = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f4494s.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.f4494s.onConnectionSuspended(i2);
    }
}
