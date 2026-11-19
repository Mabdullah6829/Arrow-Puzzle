package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrt implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgd f9304s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbrv f9305t;

    public zzbrt(zzbrv zzbrvVar, zzcgd zzcgdVar) {
        this.f9304s = zzcgdVar;
        this.f9305t = zzbrvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.f9304s.m5397a((zzbrp) this.f9305t.f9307a.getService());
        } catch (DeadObjectException e) {
            this.f9304s.m5398b(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.f9304s.m5398b(new RuntimeException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 23), "onConnectionSuspended: ", i2)));
    }
}
