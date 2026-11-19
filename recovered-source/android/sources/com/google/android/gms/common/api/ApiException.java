package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    public ApiException(Status status) {
        int i2 = status.f4210s;
        String str = status.f4211t;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 2 + String.valueOf(str).length());
        sb.append(i2);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f4210s;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f4211t;
    }
}
