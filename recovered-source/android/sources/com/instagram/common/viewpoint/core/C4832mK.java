package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4832mK implements InterfaceC3021Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C4832mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void A4i(int i2, int i3, InterfaceC4855ms interfaceC4855ms) throws IOException {
        this.A00.A0U(i2, i3, interfaceC4855ms);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void A6N(int i2) throws C20883K {
        this.A00.A0S(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void A6a(int i2, double d) throws C20883K {
        this.A00.A0T(i2, d);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final int A7u(int i2) {
        return this.A00.A0R(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void AAH(int i2, long j2) throws C20883K {
        this.A00.A0V(i2, j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final boolean AAW(int i2) {
        return this.A00.A0Y(i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void AK9(int i2, long j2, long j3) throws C20883K {
        this.A00.A0W(i2, j2, j3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3021Ik
    public final void AKK(int i2, String str) throws C20883K {
        this.A00.A0X(i2, str);
    }
}
