package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4688jw implements InterfaceC3640Sp {
    public static byte[] A04;
    public final /* synthetic */ InterfaceC3293N9 A00;
    public final /* synthetic */ C237780 A01;
    public final /* synthetic */ C232176 A02;
    public final /* synthetic */ C4019Z2 A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-109, -82, -74, -71, -78, -79, 109, -63, -68, 109, -79, -68, -60, -69, -71, -68, -82, -79, 109, -82, 109, -70, -78, -79, -74, -82, 123};
    }

    public C4688jw(C237780 c237780, C4019Z2 c4019z2, InterfaceC3293N9 interfaceC3293N9, C232176 c232176) {
        this.A01 = c237780;
        this.A03 = c4019z2;
        this.A00 = interfaceC3293N9;
        this.A02 = c232176;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADL() {
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 69);
        this.A02.A0F().A3N(C3956Y1.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        this.A00.AEN(this.A01, C3821Vm.A01(adErrorType, strA00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3640Sp
    public final void ADT() {
        this.A03.A0J();
        this.A00.ADD(this.A01, this.A03);
        this.A02.A0F().A4O(this.A01.A01 != null);
    }
}
