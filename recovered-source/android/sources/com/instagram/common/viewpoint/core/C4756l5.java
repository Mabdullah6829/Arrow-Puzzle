package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4756l5 implements InterfaceC3169L8 {
    public final C21854u A00 = new C21854u(new byte[4]);
    public final /* synthetic */ C4754l3 A01;

    public C4756l5(C4754l3 c4754l3) {
        this.A01 = c4754l3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void A5A(C21864v c21864v) {
        int tableId = c21864v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c21864v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c21864v.A0g(6);
        int iA07 = c21864v.A07() / 4;
        for (int i2 = 0; i2 < iA07; i2++) {
            c21864v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C4760l9(new C4755l4(this.A01, iA04)));
                    C4754l3.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void AAA(C219453 c219453, InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
    }
}
