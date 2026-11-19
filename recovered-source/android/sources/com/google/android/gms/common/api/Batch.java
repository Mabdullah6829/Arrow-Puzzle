package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    public static final class Builder {
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    public final Result mo3423a(Status status) {
        return new BatchResult(status);
    }
}
