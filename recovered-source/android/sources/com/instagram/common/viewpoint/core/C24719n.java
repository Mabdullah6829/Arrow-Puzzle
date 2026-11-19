package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9n */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24719n extends AbstractC4919nv implements InterfaceC2685DI {
    public long A00;
    public InterfaceC22465t A01;
    public InterfaceC4745ku<InterfaceExecutorC2828Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C207232 A07;
    public final C5053q7 A08;
    public final InterfaceC22255Y A09;
    public final InterfaceC2489A6 A0A;
    public final InterfaceC2679DC A0B;
    public final InterfaceC2806FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C24719n(C5053q7 c5053q7, InterfaceC22255Y interfaceC22255Y, InterfaceC2679DC interfaceC2679DC, InterfaceC2489A6 interfaceC2489A6, InterfaceC2806FF interfaceC2806FF, int i2, InterfaceC4745ku<InterfaceExecutorC2828Fb> interfaceC4745ku) {
        this.A07 = (C207232) AbstractC21273y.A01(c5053q7.A03);
        this.A08 = c5053q7;
        this.A09 = interfaceC22255Y;
        this.A0B = interfaceC2679DC;
        this.A0A = interfaceC2489A6 == null ? InterfaceC2489A6.A00 : interfaceC2489A6;
        this.A0C = interfaceC2806FF;
        this.A06 = i2;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC4745ku;
    }

    private void A00() {
        final Timeline c24709m = new C24709m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new AbstractC24779t(c24709m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.AbstractC24779t, com.facebook.ads.androidx.media3.common.Timeline
                public final C5031pl A0I(int i2, C5031pl c5031pl, boolean z) {
                    super.A0I(i2, c5031pl, z);
                    c5031pl.A05 = true;
                    return c5031pl;
                }

                @Override // com.instagram.common.viewpoint.core.AbstractC24779t, com.facebook.ads.androidx.media3.common.Timeline
                public final C5029pj A0L(int i2, C5029pj c5029pj, long j2) {
                    super.A0L(i2, c5029pj, j2);
                    c5029pj.A0F = true;
                    return c5029pj;
                }
            };
            c24709m = timeline;
        }
        A05(c24709m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4919nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4919nv
    public final void A0A(InterfaceC22465t interfaceC22465t) {
        this.A01 = interfaceC22465t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC21273y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC4913np A5W(C4912no c4912no, InterfaceC2791F0 interfaceC2791F0, long j2) {
        InterfaceExecutorC2828Fb interfaceExecutorC2828Fb;
        InterfaceC5000pF interfaceC5000pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC5000pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        InterfaceC2680DD interfaceC2680DDA5X = this.A0B.A5X(C24018O.A03);
        InterfaceC2489A6 interfaceC2489A6 = this.A0A;
        C2484A1 c2484a1A01 = A01(c4912no);
        InterfaceC2806FF interfaceC2806FF = this.A0C;
        C2675D8 c2675d8A02 = A02(c4912no);
        String str = this.A07.A04;
        int i2 = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC2828Fb = this.A02.get();
        } else {
            interfaceExecutorC2828Fb = null;
        }
        return new C24739p(uri, interfaceC5000pFA5I, interfaceC2680DDA5X, interfaceC2489A6, c2484a1A01, interfaceC2806FF, c2675d8A02, this, interfaceC2791F0, str, i2, interfaceExecutorC2828Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2685DI
    public final void AG0(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.A00;
        }
        if (!this.A04 && this.A00 == j2 && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2664Cx
    public final void AHk(InterfaceC4913np interfaceC4913np) {
        ((C24739p) interfaceC4913np).A0a();
    }
}
