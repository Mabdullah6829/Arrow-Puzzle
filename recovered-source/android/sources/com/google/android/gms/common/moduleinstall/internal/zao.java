package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zao extends zaa {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4575s;

    public zao(TaskCompletionSource taskCompletionSource) {
        this.f4575s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    /* JADX INFO: renamed from: V0 */
    public final void mo3618V0(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.m3487b(status, moduleInstallIntentResponse, this.f4575s);
    }
}
