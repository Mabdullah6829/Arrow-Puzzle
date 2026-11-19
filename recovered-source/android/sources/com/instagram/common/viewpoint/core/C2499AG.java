package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2499AG implements InterfaceC5000pF {
    public static String[] A04 = {"DnWOFrWNtrruVDlZPcn7mSzqB1u3fyA1", "4khCAmOyD7V9Z9fo", "Y1he90jrlOSSnjRb2RN33xbae", "sN3uyyiAo7qwm0FA39xGDer", "C", "MIilbOvYRfmfRo2RH", "W4KUp4d37G5W3qTHHFYFOJnsXzg3Y9", "7BjcD7lz4UoePoP5n6bqbpOg1qjeNk3c"};
    public long A00;
    public Uri A01 = Uri.EMPTY;
    public Map<String, List<String>> A02 = Collections.emptyMap();
    public final InterfaceC5000pF A03;

    public C2499AG(InterfaceC5000pF interfaceC5000pF) {
        this.A03 = (InterfaceC5000pF) AbstractC21273y.A01(interfaceC5000pF);
    }

    public final long A00() {
        return this.A00;
    }

    public final Uri A01() {
        return this.A01;
    }

    public final Map<String, List<String>> A02() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
        AbstractC21273y.A01(interfaceC22465t);
        this.A03.A43(interfaceC22465t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Map<String, List<String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final long AGi(C22355i c22355i) throws IOException {
        this.A01 = c22355i.A06;
        this.A02 = Collections.emptyMap();
        long jAGi = this.A03.AGi(c22355i);
        this.A01 = (Uri) AbstractC21273y.A01(A9P());
        this.A02 = A8t();
        return jAGi;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void close() throws IOException {
        this.A03.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC20482c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.A03.read(bArr, i2, i3);
        if (i4 != -1) {
            long j2 = this.A00;
            long j3 = i4;
            String[] strArr = A04;
            String str = strArr[2];
            String str2 = strArr[1];
            int length = str.length();
            int bytesRead = str2.length();
            if (length == bytesRead) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[2] = "l8Xa62wp4MYShhMptlDz52jvD";
            strArr2[1] = "PdriuKYg1yn0hjm9";
            this.A00 = j2 + j3;
        }
        return i4;
    }
}
