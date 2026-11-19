package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zas implements PendingResult.StatusListener {
    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* JADX INFO: renamed from: a */
    public final void mo3428a(Status status) {
        if (status.m3433w()) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            throw null;
        }
        ApiExceptionUtil.m3527a(status);
        throw null;
    }
}
