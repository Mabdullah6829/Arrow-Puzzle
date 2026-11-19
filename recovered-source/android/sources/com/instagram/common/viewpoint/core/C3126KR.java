package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3126KR implements InterfaceC4131aq {
    public static byte[] A01;
    public final /* synthetic */ C3113KE A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{73, 71, 57, 70, 51, 66, 53, 74, 61, 59, 53, 72, 61, 67, 66, 51, 61, 53, 54};
    }

    public C3126KR(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF7(String str) {
        this.A00.A0T = false;
        this.A00.setBrowserProgressBarValue(100);
        AbstractC3966YB.A0O(this.A00.A0H, 8);
        if (this.A00.A0E.A1l() && this.A00.A0I != null) {
            String strA14 = this.A00.A0E.A14();
            if (!TextUtils.isEmpty(strA14)) {
                this.A00.A0I.loadUrl(strA14);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF9(String str) {
        this.A00.A0T = true;
        AbstractC3966YB.A0O(this.A00.A0H, 0);
        this.A00.setUrlToBrowser(str);
        if (!this.A00.A0R && this.A00.A01 > 1) {
            this.A00.A0R = true;
            this.A00.A0h(A00(0, 19, 108));
        }
        C3113KE.A03(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFY(int i2) {
        if (this.A00.A0T) {
            this.A00.setBrowserProgressBarValue(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFb(String str) {
        this.A00.setTitleToBrowser(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFe() {
        this.A00.A0J.A0C().ADJ(14);
    }
}
