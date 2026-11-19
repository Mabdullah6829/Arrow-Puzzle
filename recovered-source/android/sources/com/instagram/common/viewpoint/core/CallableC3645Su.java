package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3645Su implements Callable<Boolean> {
    public static byte[] A02;
    public final C3644St A00;
    public final /* synthetic */ C3648Sx A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC3645Su(C3648Sx c3648Sx, C3644St c3644St) {
        this.A01 = c3648Sx;
        this.A00 = c3644St;
    }

    private final Boolean A00() throws Throwable {
        String strA01;
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                strA01 = A01(0, 6, 72);
            } else {
                strA01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            C3194LX c3194lx = new C3194LX(str, creativeType, this.A00.A06, strA01, this.A00.A02, this.A00.A05);
            c3194lx.A04 = this.A00.A03;
            c3194lx.A02 = this.A00.A01;
            c3194lx.A05 = this.A00.A04;
            if (C3651T0.A06(this.A01.A04)) {
                C3648Sx.A0F.put(this.A00.A08, c3194lx);
            }
            return Boolean.valueOf(C3648Sx.A03(this.A01.A04.A02()).AIg(c3194lx) != null);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
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
