package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2501AI implements InterfaceC5000pF {
    public static byte[] A00;
    public static final InterfaceC22255Y A01;
    public static final C2501AI A02;

    public static /* synthetic */ C2501AI A00() {
        return new C2501AI();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, 20, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final /* synthetic */ Map A8t() {
        return AbstractC22245X.A00(this);
    }

    static {
        A02();
        A02 = new C2501AI();
        A01 = new InterfaceC22255Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.instagram.common.viewpoint.core.InterfaceC22255Y
            public final InterfaceC5000pF A5I() {
                return C2501AI.A00();
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final long AGi(C22355i c22355i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) {
        throw new UnsupportedOperationException();
    }
}
