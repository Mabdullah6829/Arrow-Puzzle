package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
final class zae<R extends Result> extends BasePendingResult<R> {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    public final Result mo3423a(Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
