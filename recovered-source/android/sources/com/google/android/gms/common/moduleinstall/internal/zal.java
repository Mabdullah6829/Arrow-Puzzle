package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zal extends zaa {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4572s;

    public zal(TaskCompletionSource taskCompletionSource) {
        this.f4572s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    /* JADX INFO: renamed from: T1 */
    public final void mo3617T1(Status status, ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.m3487b(status, moduleInstallResponse, this.f4572s);
    }
}
