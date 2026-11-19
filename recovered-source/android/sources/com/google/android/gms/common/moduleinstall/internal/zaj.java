package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zaj extends zaa {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4570s;

    public zaj(TaskCompletionSource taskCompletionSource) {
        this.f4570s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    /* JADX INFO: renamed from: e1 */
    public final void mo3619e1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.m3487b(status, moduleAvailabilityResponse, this.f4570s);
    }
}
