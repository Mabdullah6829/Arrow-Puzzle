package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class BatchResult implements Result {

    /* JADX INFO: renamed from: s */
    public final Status f4183s;

    public BatchResult(Status status) {
        this.f4183s = status;
    }

    @Override // com.google.android.gms.common.api.Result
    /* JADX INFO: renamed from: n */
    public final Status mo3424n() {
        return this.f4183s;
    }
}
