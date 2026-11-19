package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3659T8 extends ContextWrapper {
    public final InterfaceC3661TA A00;
    public final AtomicReference<String> A01;

    public C3659T8(Context context, InterfaceC3661TA interfaceC3661TA) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = interfaceC3661TA;
    }

    public final InterfaceC3220Lx A00(C3659T8 c3659t8) {
        return this.A00.A8C(c3659t8);
    }

    public final InterfaceC3652T1 A01() {
        return this.A00.A7G();
    }

    public final C4490ge A02() {
        return this.A00.A8z(this);
    }

    public final InterfaceC3660T9 A03() {
        return this.A00.A74(this);
    }

    public final InterfaceC3662TB A04() {
        return this.A00.A7x(this);
    }

    public final InterfaceC3664TD A05() {
        return this.A00.A8y(this);
    }

    public final InterfaceC3665TE A06() {
        return this.A00.A9F();
    }

    public final InterfaceC3676TP A07() {
        return this.A00.A7l(this);
    }

    public final InterfaceC3689Tc A08() {
        return this.A00.A7n(this);
    }

    public final C3719U7 A09() {
        return this.A00.A96();
    }

    public final InterfaceC3784VA A0A() {
        return this.A00.A6n(A02());
    }

    public final InterfaceC3796VM A0B() {
        return this.A00.A90(A02());
    }

    public final String A0C() {
        return this.A01.get();
    }

    public final void A0D(String str) {
        this.A01.set(str);
    }
}
