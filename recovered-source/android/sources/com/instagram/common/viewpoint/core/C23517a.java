package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7a */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23517a extends AbstractC4632j0 {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C23517a(C4494gi c4494gi, C3353O7 c3353o7) {
        super(c4494gi, c3353o7);
    }

    private C4621ip A00(Runnable runnable) {
        return new C4621ip(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0P() {
        AbstractC4673jh abstractC4673jh = (AbstractC4673jh) this.A01;
        abstractC4673jh.A00(this.A08.A00);
        abstractC4673jh.A01(this.A08.A01);
        abstractC4673jh.A0J();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0R(InterfaceC3285N1 interfaceC3285N1, C3709Tw c3709Tw, C3707Tu c3707Tu, C3354O8 c3354o8) {
        C23737w c23737w = (C23737w) interfaceC3285N1;
        C4625it c4625it = new C4625it(this, c3354o8, c23737w);
        if (C3763Up.A2f(this.A0B)) {
            Handler handlerA0H = A0H();
            C3710Tx c3710TxA05 = c3709Tw.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            handlerA0H.postDelayed(c4625it, c3710TxA05.A05());
        }
        c23737w.A0K(this.A0B, A00(c4625it), c3354o8, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0a(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A8k() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC4673jh rewardedVideoAdapter = (AbstractC4673jh) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
