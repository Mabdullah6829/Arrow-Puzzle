package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: a */
    public final void mo3467a() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: i */
    public final void mo3474i() {
        this.f4364t = true;
        boolean z = this.f4364t;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 13);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" null");
        Log.d("AutoManageHelper", sb.toString());
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: j */
    public final void mo3475j() {
        this.f4364t = false;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* JADX INFO: renamed from: k */
    public final void mo3489k(ConnectionResult connectionResult, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 >= 0) {
            throw null;
        }
        Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
    }

    @Override // com.google.android.gms.common.api.internal.zap
    /* JADX INFO: renamed from: l */
    public final void mo3490l() {
        throw null;
    }
}
