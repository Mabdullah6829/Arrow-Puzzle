package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zam extends zaa {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4573s;

    public zam(TaskCompletionSource taskCompletionSource) {
        this.f4573s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    /* JADX INFO: renamed from: T1 */
    public final void mo3617T1(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            throw null;
        }
        TaskUtil.m3487b(status, null, this.f4573s);
        if (!status.m3433w() || (moduleInstallResponse != null && moduleInstallResponse.f4559t)) {
            Preconditions.m3545i(null, "Listener must not be null");
            throw null;
        }
    }
}
