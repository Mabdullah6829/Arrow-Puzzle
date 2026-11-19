package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8o */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24268o {
    public final Handler A00;
    public final InterfaceC24278p A01;

    public C24268o(Handler handler, InterfaceC24278p interfaceC24278p) {
        this.A00 = interfaceC24278p != null ? (Handler) AbstractC21273y.A01(handler) : null;
        this.A01 = interfaceC24278p;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i2, final long j2, final long j3) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    this.A03.A02(i2, j2, j3);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i2, long j2, long j3) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD9(i2, j2, j3);
    }

    public final void A03(final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A04(j2);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j2) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD5(j2);
    }

    public final void A05(final C5064qI c5064qI, final C22746L c22746l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A06(c5064qI, c22746l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C5064qI c5064qI, C22746L c22746l) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD3(c5064qI);
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD4(c5064qI, c22746l);
    }

    public final void A07(final C22716I c22716i) {
        c22716i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A09(c22716i);
                }
            });
        }
    }

    public final void A08(final C22716I c22716i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0A(c22716i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C22716I c22716i) {
        c22716i.A02();
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD1(c22716i);
    }

    public final /* synthetic */ void A0A(C22716I c22716i) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD2(c22716i);
    }

    public final void A0B(final C24288r c24288r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C24288r c24288r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD6(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j2, final long j3) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0H(str, j2, j3);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j2, long j3) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AD0(str, j2, j3);
    }

    public final void A0I(final boolean z) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A0J(z);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z) {
        ((InterfaceC24278p) AbstractC22035C.A0f(this.A01)).AFy(z);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
