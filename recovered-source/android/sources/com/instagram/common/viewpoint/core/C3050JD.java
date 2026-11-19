package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3050JD extends FrameLayout implements InterfaceC3999Yi {
    public static String[] A03 = {"wtXzJScKRPxajxCcdRbPmb0KadlxC", "7nKoFE8ui8VEpuvPlBMmVCUEP2sqkB6T", "33CWdOtYDTa7rzeiAlLBu", "lc", "strpzcWL7DajPBiGDWIDQH24h3nkF6Q8", "KD2NqWHNK6oFw2qGkV253wUFP2DdgfCk", "fVTYPEGDbO1sEyo8c0rX1ThQbYeRG1Ca", "mBAzb1XhvrptTGzmv2edBpTADNq"};
    public String A00;
    public final InterfaceC3998Yh A01;
    public final C4277dC A02;

    public C3050JD(C4494gi c4494gi, InterfaceC3998Yh interfaceC3998Yh, C4277dC c4277dC, String str) {
        super(c4494gi);
        this.A02 = c4277dC;
        this.A01 = interfaceC3998Yh;
        this.A00 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AAu(Intent intent, Bundle bundle, C3568Re c3568Re) {
        C4277dC.A0B().incrementAndGet();
        this.A02.A0V();
        AbstractC3966YB.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A45(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFA(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AFi(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3999Yi
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().AE2();
        }
        AtomicInteger atomicIntegerA0B = C4277dC.A0B();
        String[] strArr = A03;
        if (strArr[7].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[7] = "U60adJ6O15pnx6aeoiW8dFURNXF";
        strArr2[0] = "aGZEm4xR2YGCAhvP8isAV9os5hRSz";
        atomicIntegerA0B.decrementAndGet();
    }

    public void setListener(InterfaceC3998Yh interfaceC3998Yh) {
    }
}
