package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: t */
    public volatile boolean f4364t;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: d */
    public final void mo3469d(int i2, int i3, Intent intent) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: e */
    public final void mo3470e(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean("resolving_error", false)) {
                new zam(new ConnectionResult(null, (PendingIntent) bundle.getParcelable("failed_resolution"), bundle.getInt("failed_status")), bundle.getInt("failed_client_id", -1));
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: h */
    public final void mo3473h(Bundle bundle) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: i */
    public void mo3474i() {
        this.f4364t = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: j */
    public void mo3475j() {
        this.f4364t = false;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo3489k(ConnectionResult connectionResult, int i2);

    /* JADX INFO: renamed from: l */
    public abstract void mo3490l();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        new ConnectionResult(null, null, 13);
        throw null;
    }
}
