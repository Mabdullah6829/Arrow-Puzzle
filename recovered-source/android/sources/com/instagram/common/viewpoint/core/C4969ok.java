package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ok */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Should be final")
public class C4969ok implements InterfaceC232378 {
    public static String[] A05 = {"hSbyIXWx35EcWpJ5mgpqJrodnP2zgUAj", "AVKvZ0FxnTaSPhab1fIF2iZ72kGLJbya", "jBX7iJXGD8JRWgbUYtK1siSQEeTEZwCL", "i2fIBHFmzda6l4Lh5IwFm1sKJFPGPiRM", "MPSpeSFedASltWD94wRgDX9C2oesADq", "pjPp4ZdncQK9eqjJ4SlffLD", "oopCB6d3Vy5GhBPVddSO0qnC65I08xM", "WPZc57Li25BnEd3F6sy7axVnNov0V"};
    public long A00;
    public long A01;
    public C5043px A02 = C5043px.A06;
    public boolean A03;
    public final InterfaceC213445 A04;

    public C4969ok(InterfaceC213445 interfaceC213445) {
        this.A04 = interfaceC213445;
    }

    public void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A6J();
            this.A03 = true;
        }
    }

    public void A01() {
        if (this.A03) {
            A02(A8p());
            this.A03 = false;
        }
    }

    public void A02(long j2) {
        this.A01 = j2;
        if (this.A03) {
            this.A00 = this.A04.A6J();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    public C5043px A8m() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    public long A8p() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA6J = this.A04.A6J();
            long positionUs = this.A00;
            long j2 = jA6J - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = AbstractC22035C.A0O(j2);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A03(j2);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC232378
    public void AJd(C5043px c5043px) {
        if (this.A03) {
            long jA8p = A8p();
            String[] strArr = A05;
            if (strArr[3].charAt(3) == strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            A05[7] = "MyAjQeitkUrtgk2AHovxe6SLNdU2U";
            A02(jA8p);
        }
        this.A02 = c5043px;
    }
}
