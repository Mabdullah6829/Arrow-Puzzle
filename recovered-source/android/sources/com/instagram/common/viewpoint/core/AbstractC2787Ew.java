package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2787Ew {
    public InterfaceC2786Ev A00;
    public InterfaceC2797F6 A01;

    public abstract boolean A0Y();

    public abstract C2788Ex A0b(InterfaceC23667p[] interfaceC23667pArr, C4894nW c4894nW, C4912no c4912no, Timeline timeline) throws C2496AD;

    public abstract void A0c(Object obj);

    public final InterfaceC2797F6 A00() {
        return (InterfaceC2797F6) AbstractC21273y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC2786Ev interfaceC2786Ev, InterfaceC2797F6 interfaceC2797F6) {
        this.A00 = interfaceC2786Ev;
        this.A01 = interfaceC2797F6;
    }
}
