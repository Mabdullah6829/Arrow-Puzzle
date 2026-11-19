package com.instagram.common.viewpoint.core;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.RU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3558RU extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C3560RW A02;
    public final C4494gi A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, 68, 85, 68, 66, 85, 78, 83, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C3558RU.class.getName();
    }

    public C3558RU(C4494gi c4494gi, C3560RW c3560rw) {
        this(c4494gi, c3560rw, C3763Up.A08(c4494gi));
    }

    public C3558RU(C4494gi c4494gi, C3560RW c3560rw, int i2) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new RunnableC3557RT(this);
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i2;
        this.A03 = c4494gi;
        this.A02 = c3560rw;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            long j2 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z = interval == 0;
                this.A05 = j2;
                if (z) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j2);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        String strA03 = this.A02.A03();
                        if (strA03 != null) {
                            this.A03.A08().ABC(A01(15, 7, 8), AbstractC3690Td.A1D, new C3691Te(this.A02.A04(strA03)));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
