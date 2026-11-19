package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes.dex */
final class zae extends zaa {

    /* JADX INFO: renamed from: s */
    public final BaseImplementation.ResultHolder f4472s;

    public zae(BaseImplementation.ResultHolder resultHolder) {
        this.f4472s = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zam
    /* JADX INFO: renamed from: R1 */
    public final void mo3591R1(int i2) {
        ((BaseImplementation.ApiMethodImpl) this.f4472s).m3453d(new Status(i2, null, null, null));
    }
}
