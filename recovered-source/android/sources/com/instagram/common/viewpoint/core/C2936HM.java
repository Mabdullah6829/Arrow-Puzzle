package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2936HM {
    public final C21864v A00 = new C21864v(10);

    public final Metadata A00(InterfaceC4855ms interfaceC4855ms, InterfaceC2990IE interfaceC2990IE) throws IOException {
        int tagLength = 0;
        Metadata metadataA0S = null;
        while (true) {
            try {
                interfaceC4855ms.AGt(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int iA0H = this.A00.A0H();
                int framesLength = iA0H + 10;
                if (metadataA0S == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC4855ms.AGt(bArr, 10, iA0H);
                    metadataA0S = new C24589U(interfaceC2990IE).A0S(bArr, framesLength);
                } else {
                    interfaceC4855ms.A47(iA0H);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC4855ms.AIl();
        interfaceC4855ms.A47(tagLength);
        return metadataA0S;
    }
}
