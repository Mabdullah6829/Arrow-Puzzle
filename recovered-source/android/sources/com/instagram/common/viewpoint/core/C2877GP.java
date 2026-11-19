package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2877GP {
    public final Handler A00;
    public final InterfaceC2878GQ A01;

    public C2877GP(Handler handler, InterfaceC2878GQ interfaceC2878GQ) {
        this.A00 = interfaceC2878GQ != null ? (Handler) AbstractC21273y.A01(handler) : null;
        this.A01 = interfaceC2878GQ;
    }

    public final void A00(final int i2, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GL
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A02(i2, j2);
                }
            });
        }
    }

    public final void A01(final int i2, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A03(i2, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i2, long j2) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).ADU(i2, j2);
    }

    public final /* synthetic */ void A03(int i2, long j2) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).ADl(i2, j2);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i2, C5064qI c5064qI) {
        if (this.A01 != null) {
            this.A00.post(new RunnableC2876GO(this, i2, c5064qI));
        }
    }

    public final void A05(final C5064qI c5064qI, final C22746L c22746l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GI
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c5064qI, c22746l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C5064qI c5064qI, C22746L c22746l) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGU(c5064qI);
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGV(c5064qI, c22746l);
    }

    public final void A07(final C5017pW c5017pW) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GK
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A08(c5017pW);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C5017pW c5017pW) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGb(c5017pW);
    }

    public final void A09(final C22716I c22716i) {
        c22716i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GM
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0B(c22716i);
                }
            });
        }
    }

    public final void A0A(final C22716I c22716i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GG
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0C(c22716i);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C22716I c22716i) {
        c22716i.A02();
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGO(c22716i);
    }

    public final /* synthetic */ void A0C(C22716I c22716i) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGP(c22716i);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GH
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0E(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j2) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AFf(obj, j2);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GJ
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j2, final long j3) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GF
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j2, j3);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j2, long j3) {
        ((InterfaceC2878GQ) AbstractC22035C.A0f(this.A01)).AGN(str, j2, j3);
    }
}
