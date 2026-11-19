package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3278Mt {
    public static byte[] A04;
    public InterfaceC3276Mr A00;
    public final C4494gi A01;
    public final InterfaceC3784VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_transitionPathRotate);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC3275Mq A0G(String str);

    public AbstractC3278Mt(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str) {
        this.A01 = c4494gi;
        this.A02 = interfaceC3784VA;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, 125);
    }

    public static String A0C(AbstractC3278Mt abstractC3278Mt) {
        if (abstractC3278Mt instanceof C238184) {
            return A0B(6, 10, C1137R.styleable.ConstraintSet_transitionPathRotate);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC3276Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC3276Mr interfaceC3276Mr) {
        this.A00 = interfaceC3276Mr;
    }
}
