package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC3871Wc implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC3861WS> A04;
    public final C3859WQ A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, 11, 16, 16, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC3871Wc() {
        if (A03.get()) {
            this.A00 = C3876Wh.A01(new C3875Wg(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, InterfaceC3861WS interfaceC3861WS) {
        A02.set(z);
        A04.set(interfaceC3861WS);
    }

    public final C3859WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C3876Wh.A03(this);
            }
            try {
                A07();
            } catch (Throwable th) {
                if (A02.get()) {
                    AbstractC3878Wj.A00().AAx(3301, th);
                    InterfaceC3861WS interfaceC3861WS = A04.get();
                    if (interfaceC3861WS != null) {
                        interfaceC3861WS.AIZ(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C3876Wh.A04(this);
            }
        } catch (Throwable th2) {
            AbstractC3863WU.A00(th2, this);
        }
    }
}
