package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3647Sw implements Callable<Boolean> {
    public static byte[] A02;
    public final C3646Sv A00;
    public final /* synthetic */ C3648Sx A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-35, -31, -43, -37, -39};
    }

    public CallableC3647Sw(C3648Sx c3648Sx, C3646Sv c3646Sv) {
        this.A01 = c3648Sx;
        this.A00 = c3646Sv;
    }

    private final Boolean A00() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            C3194LX c3194lx = new C3194LX(this.A00.A08, this.A00.A07, this.A00.A06, A01(0, 5, 114), this.A00.A02, this.A00.A03);
            c3194lx.A01 = this.A00.A05;
            c3194lx.A00 = this.A00.A04;
            if (C3651T0.A06(this.A01.A04)) {
                C3648Sx.A0F.put(this.A00.A08, c3194lx);
            }
            boolean precacheResult = false;
            if (this.A01.A08) {
                precacheResult = C3648Sx.A03(this.A01.A04.A02()).AIe(c3194lx, false).A01();
            } else if (this.A01.A03.A0F(this.A00) != null) {
                precacheResult = true;
            }
            C3654T3 c3654t3 = this.A00.A01;
            if (c3654t3 != null && c3654t3.A02()) {
                int iA00 = c3654t3.A00();
                int iA01 = c3654t3.A01();
                if (iA00 <= 0 || iA01 <= 0) {
                    if (this.A01.A08) {
                        A04(this.A00.A08, c3194lx);
                    } else {
                        A03(this.A00.A04, this.A00.A05);
                    }
                } else if (this.A01.A08) {
                    c3194lx.A00 = iA00;
                    c3194lx.A01 = iA01;
                    A04(this.A00.A08, c3194lx);
                } else {
                    A03(iA00, iA01);
                }
            }
            return Boolean.valueOf(precacheResult);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    private void A03(int i2, int i3) {
        Bitmap bitmapA0G = this.A01.A03.A0G(this.A01.A04, this.A00.A08, i2, i3, this.A00.A02);
        if (bitmapA0G == null) {
            return;
        }
        this.A01.A07.put(this.A00.A08, bitmapA0G);
    }

    private void A04(String str, C3194LX c3194lx) {
        Bitmap bitmapA00 = C3648Sx.A03(this.A01.A04.A02()).AIe(c3194lx, true).A00();
        if (bitmapA00 == null) {
            return;
        }
        this.A01.A07.put(str, bitmapA00);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }
}
