package com.instagram.common.viewpoint.core;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3940Xl implements Closeable {
    public C3939Xk A00;
    public boolean A01;
    public final C3938Xj A02;
    public final Runnable A03;

    public C3940Xl(long j2, Runnable runnable) {
        this.A02 = new C3938Xj(j2);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C3939Xk(this);
        }
    }

    public final C3938Xj A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C3939Xk(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C3939Xk executing;
        synchronized (this) {
            this.A01 = true;
            executing = this.A00;
        }
        if (executing != null) {
            executing.close();
        }
    }
}
