package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class zacp implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    /* JADX INFO: renamed from: a */
    public final Object mo170a(Task task) throws ApiException {
        if (((Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered", null, null));
    }
}
