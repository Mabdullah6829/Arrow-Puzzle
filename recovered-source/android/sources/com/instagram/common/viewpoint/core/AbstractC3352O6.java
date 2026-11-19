package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.O6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3352O6 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 76, 80, 73, 72, 121, 126, 100, 117, 98, 99, 100, 121, 100, 121, 113, 124, 101, 114, 96, 118, 101, 115, 114, 115, 72, 97, 126, 115, 114, 120};
    }

    public static void A02(C4494gi c4494gi, C3648Sx c3648Sx, C23627l c23627l) {
        c3648Sx.A0d(new C3646Sv(c23627l.A2C().A01(), C4331e4.A04, C4331e4.A04, c23627l.A1D(), A00(17, 14, 113)));
        boolean zA1g = c23627l.A1g();
        String strA00 = A00(17, 14, 113);
        if (zA1g) {
            C3644St c3644St = new C3644St(c23627l.A0x(), c23627l.A1D(), strA00);
            c3644St.A04 = true;
            c3644St.A03 = A00(0, 5, 66);
            c3648Sx.A0Y(c3644St);
        }
        boolean zA30 = C3763Up.A30(c4494gi, C4421fX.A03());
        C3644St c3644St2 = new C3644St(c23627l.A29().A0H().A09(), c23627l.A1D(), A00(17, 14, 113), c23627l.A29().A0H().A06());
        if (zA1g && !zA30) {
            c3648Sx.A0Y(c3644St2);
        } else {
            c3648Sx.A0b(c3644St2);
        }
        c3648Sx.A0d(new C3646Sv(c23627l.A29().A0H().A08(), AbstractC3347O1.A00(c23627l.A29().A0H()), AbstractC3347O1.A01(c23627l.A29().A0H()), c23627l.A1D(), A00(17, 14, 113)));
        AbstractC3346O0.A00(c23627l, c3648Sx, strA00);
        Iterator<String> it = c23627l.A29().A0K().A02().iterator();
        while (isDSL) {
            String url = it.next();
            c3648Sx.A0d(new C3646Sv(url, -1, -1, c23627l.A1D(), A00(17, 14, 113)));
        }
    }

    public static void A03(C4494gi c4494gi, C3648Sx c3648Sx, C23627l c23627l) {
        int i2 = 0;
        for (C3311NR c3311nr : c23627l.A2G()) {
            C3646Sv c3646Sv = new C3646Sv(c3311nr.A0H().A08(), AbstractC3347O1.A00(c3311nr.A0H()), AbstractC3347O1.A01(c3311nr.A0H()), c23627l.A1D(), A00(5, 12, C1137R.styleable.ConstraintSet_polarRelativeTo));
            if (i2 == 0) {
                c3648Sx.A0c(c3646Sv);
            } else {
                c3648Sx.A0d(c3646Sv);
            }
            AbstractC3346O0.A00(c23627l, c3648Sx, A00(17, 14, 113));
            Iterator<String> it = c3311nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c3648Sx.A0d(new C3646Sv(it.next(), -1, -1, c23627l.A1D(), A00(5, 12, C1137R.styleable.ConstraintSet_polarRelativeTo)));
            }
            if (!TextUtils.isEmpty(c3311nr.A0H().A09())) {
                new C3644St(c3311nr.A0H().A09(), c23627l.A1D(), A00(5, 12, C1137R.styleable.ConstraintSet_polarRelativeTo), c3311nr.A0H().A06()).A04 = false;
            }
            i2++;
        }
    }
}
