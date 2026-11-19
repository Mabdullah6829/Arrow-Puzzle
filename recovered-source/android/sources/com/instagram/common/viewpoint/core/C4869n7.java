package com.instagram.common.viewpoint.core;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4869n7 {
    public static byte[] A03;
    public static String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final C2810FJ A05;
    public static final C2810FJ A06;
    public static final C2810FJ A07;
    public static final C2810FJ A08;
    public HandlerC2811FK<? extends InterfaceC2812FL> A00;
    public IOException A01;
    public final InterfaceExecutorC2828Fb A02;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{62, 3, 20, 43, 23, 26, 2, 30, 9, 65, 55, 20, 26, 31, 30, 9, 65};
    }

    static {
        A07();
        A07 = A01(false, -9223372036854775807L);
        A08 = A01(true, -9223372036854775807L);
        A05 = new C2810FJ(2, -9223372036854775807L);
        A06 = new C2810FJ(3, -9223372036854775807L);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C4869n7(InterfaceExecutorC2828Fb interfaceExecutorC2828Fb) {
        this.A02 = interfaceExecutorC2828Fb;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C4869n7(String str) {
        this(AbstractC2827Fa.A00(AbstractC22035C.A0u(A06(0, 17, 64) + str), new InterfaceC213849() { // from class: com.facebook.ads.redexgen.X.n8
            @Override // com.instagram.common.viewpoint.core.InterfaceC213849
            public final void A39(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC2812FL> long A00(Looper looper, T t, InterfaceC2809FI<T> interfaceC2809FI, int i2) {
        AbstractC21273y.A08(looper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2811FK(this, looper, t, interfaceC2809FI, i2, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public static C2810FJ A01(boolean z, long j2) {
        return new C2810FJ(z ? 1 : 0, j2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.FI != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.FL> */
    public final <T extends InterfaceC2812FL> long A08(T t, InterfaceC2809FI<T> interfaceC2809FI, int i2) {
        Looper looper = (Looper) AbstractC21273y.A02(Looper.myLooper());
        return A00(looper, t, interfaceC2809FI, i2);
    }

    public final void A09() {
        ((HandlerC2811FK) AbstractC21273y.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i2) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC2811FK<? extends InterfaceC2812FL> handlerC2811FK = this.A00;
                if (i2 == Integer.MIN_VALUE) {
                    HandlerC2811FK<? extends InterfaceC2812FL> handlerC2811FK2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i2 = handlerC2811FK2.A06;
                }
                handlerC2811FK.A05(i2);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC2813FM interfaceC2813FM) {
        if (this.A00 != null) {
            HandlerC2811FK<? extends InterfaceC2812FL> handlerC2811FK = this.A00;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            handlerC2811FK.A07(true);
        }
        if (interfaceC2813FM != null) {
            this.A02.execute(new RunnableC2814FN(interfaceC2813FM));
        }
        this.A02.AHb();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
