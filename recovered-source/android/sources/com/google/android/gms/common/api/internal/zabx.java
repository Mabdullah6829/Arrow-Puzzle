package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zabx extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: f */
    public final void mo3471f() {
        new CancellationException("Host activity was destroyed before Google Play services could be made available.");
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* JADX INFO: renamed from: k */
    public final void mo3489k(ConnectionResult connectionResult, int i2) {
        String str = connectionResult.f4144v;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        new ApiException(new Status(connectionResult.f4142t, str, connectionResult.f4143u, connectionResult));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.LifecycleFragment, java.lang.Object] */
    @Override // com.google.android.gms.common.api.internal.zap
    /* JADX INFO: renamed from: l */
    public final void mo3490l() {
        if (this.f4255s.mo3478c() != null) {
            int i2 = GoogleApiAvailabilityLight.f4156a;
            throw null;
        }
        new ApiException(new Status(8, null, null, null));
        throw null;
    }
}
