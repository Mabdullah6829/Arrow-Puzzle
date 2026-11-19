package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4209c6 {
    public boolean A00;
    public View A03;
    public AbstractC3278Mt A04;
    public C3792VI A05;
    public C3732UK A06;
    public InterfaceC3936Xh A07;
    public AbstractC3992Yb A08;
    public InterfaceC4313dm A09;
    public C2702DZ A0A;
    public String A0B;
    public final View A0C;
    public final AbstractC4669jd A0D;
    public final C4494gi A0E;
    public final InterfaceC3784VA A0F;
    public final C3957Y2 A0G;
    public final InterfaceC3998Yh A0H;
    public final C4439fp A0I;
    public int A02 = 0;
    public int A01 = 1;

    public C4209c6(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, InterfaceC3998Yh interfaceC3998Yh, AbstractC4669jd abstractC4669jd, View view, C4439fp c4439fp, C3957Y2 c3957y2) {
        this.A0E = c4494gi;
        this.A0F = interfaceC3784VA;
        this.A0H = interfaceC3998Yh;
        this.A0D = abstractC4669jd;
        this.A0C = view;
        this.A0I = c4439fp;
        this.A0G = c3957y2;
    }

    public final C4209c6 A0I(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C4209c6 A0J(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C4209c6 A0K(View view) {
        this.A03 = view;
        return this;
    }

    public final C4209c6 A0L(AbstractC3278Mt abstractC3278Mt) {
        this.A04 = abstractC3278Mt;
        return this;
    }

    public final C4209c6 A0M(C3792VI c3792vi) {
        this.A05 = c3792vi;
        return this;
    }

    public final C4209c6 A0N(C3732UK c3732uk) {
        this.A06 = c3732uk;
        return this;
    }

    public final C4209c6 A0O(InterfaceC3936Xh interfaceC3936Xh) {
        this.A07 = interfaceC3936Xh;
        return this;
    }

    public final C4209c6 A0P(AbstractC3992Yb abstractC3992Yb) {
        this.A08 = abstractC3992Yb;
        return this;
    }

    public final C4209c6 A0Q(InterfaceC4313dm interfaceC4313dm) {
        this.A09 = interfaceC4313dm;
        return this;
    }

    public final C4209c6 A0R(C2702DZ c2702dz) {
        this.A0A = c2702dz;
        return this;
    }

    public final C4209c6 A0S(String str) {
        this.A0B = str;
        return this;
    }

    public final C4209c6 A0T(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C4210c7 A0U() {
        return new C4210c7(this);
    }
}
