package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes.dex */
final class zabj implements BaseGmsClient.SignOutCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zabk f4290a;

    public zabj(zabk zabkVar) {
        this.f4290a = zabkVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    /* JADX INFO: renamed from: a */
    public final void mo3495a() {
        this.f4290a.f4295E.f4244F.post(new zabi(this));
    }
}
