package com.instagram.common.viewpoint.core;

import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3680TT implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C4490ge A00;
    public final InterfaceC3687Ta A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public C3680TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4490ge c4490ge, InterfaceC3679TS interfaceC3679TS) {
        this(uncaughtExceptionHandler, c4490ge, interfaceC3679TS, AbstractC3688Tb.A00());
    }

    public C3680TT(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4490ge c4490ge, InterfaceC3679TS interfaceC3679TS, InterfaceC3687Ta interfaceC3687Ta) {
        this.A02 = uncaughtExceptionHandler;
        if (c4490ge != null) {
            this.A00 = c4490ge;
            this.A03 = interfaceC3679TS.A97(c4490ge);
            this.A01 = interfaceC3687Ta;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            String strA03 = AbstractC3948Xt.A03(this.A00, th);
            if (!TextUtils.isEmpty(strA03)) {
                String stackTraceString = A00(17, 16, 7);
                if (strA03.contains(stackTraceString)) {
                    Map<String, String> mapA02 = new C3678TR(strA03, this.A03).A02();
                    String strA00 = A00(38, 7, 100);
                    String stackTraceString2 = A00(33, 5, 111);
                    mapA02.put(strA00, stackTraceString2);
                    Throwable thA00 = AbstractRunnableC3858WP.A00();
                    String strA01 = A00(45, 12, 73);
                    if (thA00 == th) {
                        String stackTraceString3 = A00(1, 1, 108);
                        mapA02.put(strA01, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 81);
                        mapA02.put(strA01, stackTraceString4);
                    }
                    this.A01.AL7(new C3694Th(this.A00.A09().A01(), this.A00.A09().A02(), mapA02), this.A00);
                    if (C3763Up.A2A(this.A00)) {
                        C3763Up.A0e(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th);
    }
}
