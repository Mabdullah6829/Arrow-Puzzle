package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.So */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3639So {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C4490ge A00;
    public String A01;
    public final C3940Xl A02 = new C3940Xl(300000000000L, new C4501gp(this));

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, -50, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, -64, -78, -64, -64, -74, -68, -69, -52, -63, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static InterfaceC3725UD A00(C4490ge c4490ge) {
        if (C3763Up.A1B(c4490ge)) {
            return C3726UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return C3726UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C4490ge c4490ge;
        synchronized (this) {
            c4490ge = this.A00;
        }
        if (c4490ge == null) {
            return;
        }
        String strA05 = C3728UG.A00().A01(c4490ge, true).A05(A00(c4490ge));
        synchronized (this) {
            this.A01 = strA05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C4490ge c4490ge) {
        this.A00 = c4490ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c4490ge);
        if (this.A00.A07().AJw() || ((A04.get() && C3763Up.A21(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
