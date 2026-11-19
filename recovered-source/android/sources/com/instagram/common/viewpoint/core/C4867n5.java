package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4867n5 implements InterfaceC2544Az {
    public final /* synthetic */ C194810 A00;

    public C4867n5(C194810 c194810, InterfaceC2545B0 interfaceC2545B0) {
        this.A00 = c194810;
        interfaceC2545B0.AJa(this, new Handler());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2544Az
    public final void ADz(InterfaceC2545B0 interfaceC2545B0, long j2, long j3) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A27();
    }
}
