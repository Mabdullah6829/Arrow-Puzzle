package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public class TaskUtil {
    /* JADX INFO: renamed from: a */
    public static void m3486a(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m3433w()) {
            taskCompletionSource.m10768b(obj);
        } else {
            taskCompletionSource.m10767a(ApiExceptionUtil.m3527a(status));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3487b(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m3433w()) {
            taskCompletionSource.m10770d(obj);
        } else {
            taskCompletionSource.m10769c(ApiExceptionUtil.m3527a(status));
        }
    }
}
