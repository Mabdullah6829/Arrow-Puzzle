package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zap extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4576s;

    public zap(TaskCompletionSource taskCompletionSource) {
        this.f4576s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    /* JADX INFO: renamed from: D1 */
    public final void mo3464D1(Status status) {
        TaskUtil.m3487b(status, null, this.f4576s);
    }
}
