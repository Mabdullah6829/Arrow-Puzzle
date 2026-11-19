package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
abstract class zza extends zzc {

    /* JADX INFO: renamed from: d */
    public final int f4507d;

    /* JADX INFO: renamed from: e */
    public final Bundle f4508e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BaseGmsClient f4509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient);
        this.f4509f = baseGmsClient;
        this.f4507d = i2;
        this.f4508e = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    /* JADX INFO: renamed from: a */
    public final void mo3605a(Object obj) {
        BaseGmsClient baseGmsClient = this.f4509f;
        int i2 = this.f4507d;
        if (i2 != 0) {
            baseGmsClient.zzd(1, null);
            Bundle bundle = this.f4508e;
            mo3607c(new ConnectionResult(null, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null, i2));
        } else {
            if (mo3606b()) {
                return;
            }
            baseGmsClient.zzd(1, null);
            mo3607c(new ConnectionResult(null, null, 8));
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo3606b();

    /* JADX INFO: renamed from: c */
    public abstract void mo3607c(ConnectionResult connectionResult);
}
