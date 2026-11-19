package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pd */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3445Pd implements InterfaceC4131aq {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC23126x A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -55, -36, -51, -51, -52, -39, -52, -53, -58, -54, -45, -48, -54, -46, -58, -48, -56, -55, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43};
    }

    public C3445Pd(ViewOnClickListenerC23126x viewOnClickListenerC23126x) {
        this.A00 = viewOnClickListenerC23126x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF7(String str) {
        this.A00.A0C.setProgress(100);
        ((C3441PZ) this.A00).A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AF9(String str) {
        ((C3441PZ) this.A00).A05 = true;
        this.A00.A0F.setUrl(str);
        if (this.A00.A00 > 1) {
            this.A00.A0I(A00(0, 34, 31));
        }
        ViewOnClickListenerC23126x.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFY(int i2) {
        if (((C3441PZ) this.A00).A05) {
            this.A00.A0C.setProgress(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFb(String str) {
        this.A00.A0F.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4131aq
    public final void AFe() {
        this.A00.A0B.ADJ(14);
    }
}
