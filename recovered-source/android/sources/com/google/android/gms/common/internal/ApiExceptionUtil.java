package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class ApiExceptionUtil {
    /* JADX INFO: renamed from: a */
    public static ApiException m3527a(Status status) {
        return status.f4212u != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
