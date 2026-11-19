package com.instagram.common.viewpoint.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7d */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23547d {
    public int A00;
    public int A01;
    public Looper A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Timeline A0A;
    public final InterfaceC213445 A0B;
    public final InterfaceC23527b A0C;
    public final InterfaceC23537c A0D;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C23547d(InterfaceC23527b interfaceC23527b, InterfaceC23537c interfaceC23537c, Timeline timeline, int i2, InterfaceC213445 interfaceC213445, Looper looper) {
        this.A0C = interfaceC23527b;
        this.A0D = interfaceC23537c;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = interfaceC213445;
        this.A00 = i2;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Looper A03() {
        return this.A03;
    }

    public final Timeline A04() {
        return this.A0A;
    }

    public final InterfaceC23537c A05() {
        return this.A0D;
    }

    public final C23547d A06() {
        AbstractC21273y.A08(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC21273y.A07(this.A05);
        }
        this.A09 = true;
        this.A0C.AJC(this);
        return this;
    }

    public final C23547d A07(int i2) {
        AbstractC21273y.A08(!this.A09);
        this.A01 = i2;
        return this;
    }

    public final C23547d A08(Object obj) {
        AbstractC21273y.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC21273y.A08(this.A09);
        AbstractC21273y.A08(this.A03.getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
