package com.instagram.common.viewpoint.core;

import android.net.Uri;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4911nn implements InterfaceC2812FL, InterfaceC2656Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C22355i A01;
    public InterfaceC2953Hd A02;
    public boolean A04;
    public final Uri A06;
    public final C213748 A07;
    public final C2499AG A08;
    public final InterfaceC2680DD A09;
    public final InterfaceC2924HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C24739p A0D;
    public final C2945HV A0B = new C2945HV();
    public boolean A03 = true;
    public final long A05 = C2657Cq.A00();

    public C4911nn(C24739p c24739p, Uri uri, InterfaceC5000pF interfaceC5000pF, InterfaceC2680DD interfaceC2680DD, InterfaceC2924HA interfaceC2924HA, C213748 c213748) {
        this.A0D = c24739p;
        this.A06 = uri;
        this.A08 = new C2499AG(interfaceC5000pF);
        this.A09 = interfaceC2680DD;
        this.A0A = interfaceC2924HA;
        this.A07 = c213748;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j2, long j3) {
        this.A0B.A00 = j2;
        this.A00 = j3;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2812FL
    public final void A4r() {
        this.A0C = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011b */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2812FL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAr() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C4911nn.AAr():void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2656Cp
    public final void AE5(C21864v c21864v) {
        long jMax;
        if (this.A04) {
            jMax = Math.max(this.A0D.A03(true), this.A00);
        } else {
            jMax = this.A00;
        }
        int iA07 = c21864v.A07();
        InterfaceC2953Hd interfaceC2953Hd = (InterfaceC2953Hd) AbstractC21273y.A01(this.A02);
        interfaceC2953Hd.AIr(c21864v, iA07);
        interfaceC2953Hd.AIu(jMax, 1, iA07, 0, null);
        this.A04 = true;
    }
}
