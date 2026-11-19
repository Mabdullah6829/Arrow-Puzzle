package com.instagram.common.viewpoint.core;

import android.media.MediaFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4975oq implements InterfaceC2854G2, InterfaceC2879GR, InterfaceC23537c {
    public static byte[] A04;
    public static String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public InterfaceC2854G2 A00;
    public InterfaceC2854G2 A01;
    public InterfaceC2879GR A02;
    public InterfaceC2879GR A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, 12, 1, 0, 10, 35, 23, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, 41, 12, 22, 17, 0, 11, 0, 23};
    }

    static {
        A01();
    }

    public C4975oq() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC23537c
    public final void A9i(int i2, Object obj) {
        switch (i2) {
            case 7:
                this.A01 = (InterfaceC2854G2) obj;
                return;
            case 8:
                this.A02 = (InterfaceC2879GR) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2854G2
    public final void AGS(long j2, long j3, C5064qI c5064qI, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            InterfaceC2854G2 interfaceC2854G2 = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            interfaceC2854G2.AGS(j2, j3, c5064qI, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AGS(j2, j3, c5064qI, mediaFormat);
        }
    }
}
