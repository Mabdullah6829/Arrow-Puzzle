package com.instagram.common.viewpoint.core;

import android.provider.Settings;
import android.text.TextUtils;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4463gD {
    public static InterfaceC4443ft A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, 63, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, 61, 106, 101, 81, 105, 111, 64, 109, 32, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, 15, 7, 28, 30, 2, 15, 0, 11, 49, 3, 1, 10, 11, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, 63, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(C1137R.styleable.ConstraintSet_pathMotionArc, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC4445fv A00(C3659T8 c3659t8) {
        return A03(true, c3659t8);
    }

    public static InterfaceC4445fv A01(C3659T8 c3659t8) {
        return A02(true, c3659t8);
    }

    public static InterfaceC4445fv A02(boolean z, C3659T8 c3659t8) {
        C4449fz c4449fz = new C4449fz();
        C4452g2 networkModuleRequestConfigurationBuilder = A04(c3659t8);
        if (!A0B(c3659t8)) {
            c4449fz.A02(A03);
            c4449fz.A01(A02);
        }
        if (C3906XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(C3906XD.A02());
        }
        C2662Cv c2662CvA00 = AbstractC4447fx.A00();
        C4449fz networkModuleConfigurationBuilder = c4449fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return c2662CvA00.A00(networkModuleConfigurationBuilder.A03(z).A04(c3659t8.A05().AAO()).A05(), c3659t8.A08(), ExecutorC3971YG.A01());
    }

    public static InterfaceC4445fv A03(boolean z, C3659T8 c3659t8) {
        return AbstractC4447fx.A00().A00(new C4449fz().A03(z).A00(A04(c3659t8).A09()).A04(c3659t8.A05().AAO()).A05(), c3659t8.A08(), ExecutorC3971YG.A01());
    }

    public static C4452g2 A04(C3659T8 c3659t8) {
        A08(c3659t8);
        C4452g2 c4452g2 = new C4452g2();
        if (A0B(c3659t8) || C3906XD.A04()) {
            c4452g2.A02(360000).A04(120000);
        } else {
            c4452g2.A02(C3763Up.A09(c3659t8)).A04(C3763Up.A0B(c3659t8));
        }
        c4452g2.A03(C3763Up.A0A(c3659t8)).A05(C3763Up.A0C(c3659t8)).A06(C3763Up.A0D(c3659t8));
        synchronized (C4463gD.class) {
            if (A00 != null && (A00 instanceof InterfaceC4443ft)) {
                c4452g2.A07(A00);
            }
        }
        return c4452g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(C3659T8 c3659t8) {
        if (!A04.get()) {
            c3659t8.A08().ABC(A05(161, 7, 110), AbstractC3690Td.A21, new C3691Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC4443ft interfaceC4443ft) {
        A00 = interfaceC4443ft;
    }

    public static boolean A0A(C3659T8 c3659t8) {
        return Settings.Global.getInt(c3659t8.getContentResolver(), A05(145, 16, 115), 0) != 0;
    }

    public static boolean A0B(C3659T8 c3659t8) {
        String strA9Q = c3659t8.A05().A9Q();
        if (!TextUtils.isEmpty(strA9Q)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9Q.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
