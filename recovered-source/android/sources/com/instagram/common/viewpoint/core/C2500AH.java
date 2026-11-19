package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2500AH implements InterfaceC5000pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC21073d A01;
    public final InterfaceC5000pF A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public C2500AH(InterfaceC5000pF interfaceC5000pF, AbstractC21073d abstractC21073d, int i2) {
        this.A02 = (InterfaceC5000pF) AbstractC21273y.A01(interfaceC5000pF);
        AbstractC21273y.A01(abstractC21073d);
        this.A01 = null;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
        AbstractC21273y.A01(interfaceC22465t);
        this.A02.A43(interfaceC22465t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final long AGi(C22355i c22355i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
