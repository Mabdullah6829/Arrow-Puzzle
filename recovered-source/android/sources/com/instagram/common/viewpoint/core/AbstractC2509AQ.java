package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.AQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2509AQ implements InterfaceC5000pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C22355i A01;
    public final ArrayList<InterfaceC22465t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public /* synthetic */ Map A8t() {
        return AbstractC22245X.A00(this);
    }

    public AbstractC2509AQ(boolean z) {
        this.A03 = z;
    }

    @MetaExoPlayerCustomization
    private final void A0D(C22355i c22355i, boolean z) {
        this.A01 = c22355i;
        for (int i2 = 0; i2 < i; i2++) {
            this.A02.get(i2).AGH(this, c22355i, this.A03, z);
        }
    }

    public final void A0E() {
        C22355i c22355i = (C22355i) AbstractC22035C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).AGG(this, c22355i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i2) {
        C22355i c22355i = (C22355i) AbstractC22035C.A0f(this.A01);
        for (int i3 = 0; i3 < this.A00; i3++) {
            this.A02.get(i3).ADK(this, c22355i, this.A03, i2);
        }
    }

    public final void A0G(C22355i c22355i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.A02.get(i2);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C22355i c22355i) {
        A0D(c22355i, false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC5000pF
    public final void A43(InterfaceC22465t interfaceC22465t) {
        AbstractC21273y.A01(interfaceC22465t);
        if (!this.A02.contains(interfaceC22465t)) {
            this.A02.add(interfaceC22465t);
            this.A00++;
        }
    }
}
