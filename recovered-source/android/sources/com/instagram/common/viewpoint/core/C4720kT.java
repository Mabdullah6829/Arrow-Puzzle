package com.instagram.common.viewpoint.core;

import androidx.core.app.NotificationManagerCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4720kT implements InterfaceC22255Y {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC22225V A02;
    public InterfaceC22255Y A04;
    public InterfaceC3248MP A05;
    public boolean A07;
    public InterfaceC22255Y A03 = new C4996pB();
    public InterfaceC3257MY A06 = InterfaceC3257MY.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC22255Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C23888B A5I() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00, this.A01);
    }

    private C23888B A01(InterfaceC5000pF interfaceC5000pF, int i2, int i3) {
        C4721kU c4721kUA5H;
        InterfaceC3248MP interfaceC3248MP = (InterfaceC3248MP) AbstractC21273y.A01(this.A05);
        if (this.A07 || interfaceC5000pF == null) {
            c4721kUA5H = null;
        } else if (this.A02 != null) {
            InterfaceC22225V interfaceC22225V = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c4721kUA5H = interfaceC22225V.A5H();
        } else {
            c4721kUA5H = new C4722kV().A00(interfaceC3248MP).A5H();
        }
        return new C23888B(interfaceC3248MP, interfaceC5000pF, this.A03.A5I(), c4721kUA5H, this.A06, i2, null, i3, null);
    }

    public final AbstractC21073d A02() {
        return null;
    }

    public final C4720kT A03(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C4720kT A04(InterfaceC22255Y interfaceC22255Y) {
        this.A03 = interfaceC22255Y;
        return this;
    }

    public final C4720kT A05(InterfaceC22255Y interfaceC22255Y) {
        this.A04 = interfaceC22255Y;
        return this;
    }

    public final C4720kT A06(InterfaceC3248MP interfaceC3248MP) {
        this.A05 = interfaceC3248MP;
        return this;
    }

    public final C23888B A07() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00 | 1, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
    }
}
