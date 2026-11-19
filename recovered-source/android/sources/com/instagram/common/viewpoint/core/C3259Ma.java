package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ma */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3259Ma implements InterfaceC4343eG {
    public static byte[] A01;
    public static String[] A02 = {"eg4OuzmozbdBw8OpfnEQ9S5WXV0sj4Z8", "rcCmLv", "J9fwVwM4lsi34p", "AlJIDEMCKinwW9CsIljPKEg77fEpV28V", "eGLouwRxqegMv8vZbxB0WI", "SMn3POGOAwCpVf", "x8sqAERQ", "K7z6bhBLHSjzf8oEEyEGbL"};
    public final /* synthetic */ C3255MW A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-22, -24, -38, -25, -40, -31, -34, -40, -32};
    }

    static {
        A01();
    }

    public C3259Ma(C3255MW c3255mw) {
        this.A00 = c3255mw;
    }

    public /* synthetic */ C3259Ma(C3255MW c3255mw, C3271Mm c3271Mm) {
        this(c3255mw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void ADX() {
        this.A00.A0V(true, A00(0, 9, 3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AEA() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AEh() {
        if (!this.A00.A0H.A0b()) {
            this.A00.A0N();
            return;
        }
        C3255MW c3255mw = this.A00;
        String[] strArr = A02;
        if (strArr[3].charAt(22) == strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A02[1] = "uysARHPfhmw6aS";
        c3255mw.A0S.set(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AFQ() {
        this.A00.AFA(false);
        this.A00.A0Q.A0E(8);
        this.A00.A0J.A0F().AFH();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4343eG
    public final void AGg() {
        this.A00.A0O.ADJ(15);
    }
}
