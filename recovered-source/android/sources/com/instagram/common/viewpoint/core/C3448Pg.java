package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3448Pg {
    public static Field A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"02HXzqXk73QVshK", "Vd3PIQVGbymKr1peOQp46bHqBe5g9xLl", "HcoaSp9EGPDRlMz", "LE49K9mUXs4bvL0Dhr0uWsVmH5LUwBm4", "LDPLoHz6UrHGmx6GMbvpIivkJ6REIOLV", "AJsKzOma0c3h", "nSSDOEXzoGvtoIqz4QDa0TtkmnPlbH1G", "jHxdDI4CDuwq"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28, -72, -38, -38, -36, -22, -22, -32, -39, -32, -29, -32, -21, -16, -69, -36, -29, -36, -34, -40, -21, -36};
    }

    public abstract int A02(View view);

    public abstract int A03(View view);

    public abstract int A04(View view);

    public abstract int A05(View view);

    public abstract Display A06(View view);

    public abstract C3465Py A07(View view, C3465Py c3465Py);

    public abstract C3465Py A08(View view, C3465Py c3465Py);

    public abstract void A09(View view);

    public abstract void A0A(View view);

    public abstract void A0B(View view, int i2);

    public abstract void A0C(View view, Drawable drawable);

    public abstract void A0E(View view, InterfaceC3434PR interfaceC3434PR);

    public abstract void A0F(View view, Runnable runnable);

    public abstract void A0G(View view, Runnable runnable, long j2);

    public abstract boolean A0I(View view);

    public abstract boolean A0J(View view);

    static {
        A01();
        A01 = false;
    }

    public final void A0D(View view, AbstractC3428PL abstractC3428PL) {
        view.setAccessibilityDelegate(abstractC3428PL == null ? null : abstractC3428PL.A00());
    }

    public final boolean A0H(View view) {
        if (A01) {
            return false;
        }
        Field field = A00;
        if (A03[6].charAt(21) == 'T') {
            A03[1] = "Q1ruOHxOk6WILPvKf2GjHGHRzmp539Hk";
            if (field == null) {
                try {
                    A00 = View.class.getDeclaredField(A00(0, 22, 90));
                    A00.setAccessible(true);
                } catch (Throwable unused) {
                    A01 = true;
                    if (A03[6].charAt(21) == 'T') {
                        String[] strArr = A03;
                        strArr[0] = "nDS37f2fXP1nkU7";
                        strArr[2] = "CEc31ZmnNMQB0dp";
                        return false;
                    }
                }
            }
            try {
                return A00.get(view) != null;
            } catch (Throwable unused2) {
                A01 = true;
                return false;
            }
        }
        throw new RuntimeException();
    }
}
