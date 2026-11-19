package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zza {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BaseGmsClient f4528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient, i2, bundle);
        this.f4528g = baseGmsClient;
    }

    @Override // com.google.android.gms.common.internal.zza
    /* JADX INFO: renamed from: b */
    public final boolean mo3606b() {
        this.f4528g.zzc.mo3491a(ConnectionResult.f4140x);
        return true;
    }

    @Override // com.google.android.gms.common.internal.zza
    /* JADX INFO: renamed from: c */
    public final void mo3607c(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.f4528g;
        if (baseGmsClient.enableLocalFallback() && baseGmsClient.zzg()) {
            baseGmsClient.zzf(16);
        } else {
            baseGmsClient.zzc.mo3491a(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
        }
    }
}
