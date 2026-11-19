package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.WindowManager;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4864n2 implements InterfaceC2857G5 {
    public static byte[] A01;
    public final WindowManager A00;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, -21, -16, -26, -15, -7};
    }

    public C4864n2(WindowManager windowManager) {
        this.A00 = windowManager;
    }

    public static C4864n2 A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 15));
        if (windowManager != null) {
            return new C4864n2(windowManager);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2857G5
    public final void AHX(InterfaceC2856G4 interfaceC2856G4) {
        interfaceC2856G4.ADd(this.A00.getDefaultDisplay());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2857G5
    public final void AKW() {
    }
}
