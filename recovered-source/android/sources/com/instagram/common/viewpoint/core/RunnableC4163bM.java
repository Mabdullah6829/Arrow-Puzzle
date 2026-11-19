package com.instagram.common.viewpoint.core;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC4163bM implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C22836U A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{12, 1, 29, 5, 12};
    }

    public RunnableC4163bM(C22836U c22836u) {
        this.A00 = c22836u;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA00 = A00(0, 5, 64);
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0U.A0F().AKi();
            ObjectAnimator.ofFloat(this.A00.A0Q, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator.ofFloat(this.A00.A0P, strA00, 1.0f, 0.0f).setDuration(100L).start();
            ObjectAnimator duration = ObjectAnimator.ofFloat(((AbstractC4156bF) this.A00).A09, strA00, 1.0f, 0.0f).setDuration(100L);
            duration.addListener(new C4162bL(this));
            duration.start();
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
