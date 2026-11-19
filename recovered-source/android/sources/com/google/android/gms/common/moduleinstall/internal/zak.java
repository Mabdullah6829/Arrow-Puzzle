package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zak extends zaa {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ TaskCompletionSource f4571s;

    public zak(TaskCompletionSource taskCompletionSource) {
        this.f4571s = taskCompletionSource;
        throw null;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    /* JADX INFO: renamed from: r1 */
    public final void mo3620r1(Status status) {
        TaskUtil.m3487b(status, null, this.f4571s);
    }
}
