package io.grpc;

import p030R.C0589w0;

/* JADX INFO: loaded from: classes.dex */
public class StatusRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: s */
    public final C0589w0 f24448s;

    /* JADX INFO: renamed from: t */
    public final boolean f24449t;

    public StatusRuntimeException(C0589w0 c0589w0) {
        super(C0589w0.m1348b(c0589w0), c0589w0.f1289c);
        this.f24448s = c0589w0;
        this.f24449t = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f24449t ? super.fillInStackTrace() : this;
    }
}
