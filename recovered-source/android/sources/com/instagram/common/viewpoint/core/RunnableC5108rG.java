package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC5108rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C5107rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, 25, 56, 49, 60, 36};
    }

    public RunnableC5108rG(C5107rF c5107rF, int i2, Exception exc) {
        this.A01 = c5107rF;
        this.A00 = i2;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            try {
                if (this.A01.A01) {
                    if (!C2533Ao.A07 || !this.A01.A0B()) {
                        this.A01.A08(this.A01.A05.ACf());
                        C5107rF.A03(this.A01);
                        if (0 == 0) {
                            int delay = this.A00;
                            this.A01.A04.postDelayed(this.A01.A0C, delay);
                            return;
                        } else {
                            C5107rF.A03(this.A01);
                            throw new NullPointerException(A00(0, 8, 12));
                        }
                    }
                    this.A01.A0F();
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
