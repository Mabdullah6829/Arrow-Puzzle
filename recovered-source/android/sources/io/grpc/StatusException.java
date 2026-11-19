package io.grpc;

import p030R.C0589w0;

/* JADX INFO: loaded from: classes.dex */
public class StatusException extends Exception {

    /* JADX INFO: renamed from: s */
    public final C0589w0 f24446s;

    /* JADX INFO: renamed from: t */
    public final boolean f24447t;

    public StatusException(C0589w0 c0589w0) {
        super(C0589w0.m1348b(c0589w0), c0589w0.f1289c);
        this.f24446s = c0589w0;
        this.f24447t = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f24447t ? super.fillInStackTrace() : this;
    }
}
