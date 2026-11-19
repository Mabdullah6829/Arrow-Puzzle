package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3514Qm {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final AbstractC3530R2 A02;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i2);

    public AbstractC3514Qm(AbstractC3530R2 abstractC3530R2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = abstractC3530R2;
    }

    public /* synthetic */ AbstractC3514Qm(AbstractC3530R2 abstractC3530R2, C4562hp c4562hp) {
        this(abstractC3530R2);
    }

    public static C4562hp A00(AbstractC3530R2 abstractC3530R2) {
        return new C4562hp(abstractC3530R2);
    }

    public static C4561ho A01(AbstractC3530R2 abstractC3530R2) {
        return new C4561ho(abstractC3530R2);
    }

    public static AbstractC3514Qm A02(AbstractC3530R2 abstractC3530R2, int i2) {
        switch (i2) {
            case 0:
                return A00(abstractC3530R2);
            case 1:
                return A01(abstractC3530R2);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
