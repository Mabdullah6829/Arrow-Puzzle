package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.48 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C213748 {
    public boolean A00;
    public final InterfaceC213445 A01;

    public C213748() {
        this(InterfaceC213445.A00);
    }

    public C213748(InterfaceC213445 interfaceC213445) {
        this.A01 = interfaceC213445;
    }

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized void A01() {
        boolean z = false;
        while (true) {
            boolean wasInterrupted = this.A00;
            if (wasInterrupted) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean A02() {
        boolean z;
        z = this.A00;
        this.A00 = false;
        return z;
    }

    public final synchronized boolean A03() {
        return this.A00;
    }

    public final synchronized boolean A04() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean A05(long j2) throws InterruptedException {
        try {
            if (j2 <= 0) {
                return this.A00;
            }
            long nowMs = this.A01.A6J();
            long j3 = nowMs + j2;
            if (j3 < nowMs) {
                A00();
            } else {
                while (!this.A00 && nowMs < j3) {
                    long endMs = j3 - nowMs;
                    wait(endMs);
                    nowMs = this.A01.A6J();
                }
            }
            return this.A00;
        } catch (Throwable th) {
            throw th;
        }
    }
}
