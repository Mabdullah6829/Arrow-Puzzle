package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fs */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2844Fs extends AbstractC4438fo {
    public final /* synthetic */ InterfaceC3784VA A00;
    public final /* synthetic */ C3957Y2 A01;
    public final /* synthetic */ C4332e5 A02;
    public final /* synthetic */ C2842Fq A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C2844Fs(C2842Fq c2842Fq, String str, C4332e5 c4332e5, InterfaceC3784VA interfaceC3784VA, Map map, C3957Y2 c3957y2) {
        this.A03 = c2842Fq;
        this.A04 = str;
        this.A02 = c4332e5;
        this.A00 = interfaceC3784VA;
        this.A05 = map;
        this.A01 = c3957y2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A05.get(this.A02.A02())) {
            this.A00.ABJ(this.A04, new C4150b9(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C3326Ng.A07(this.A03.A00, this.A03.A06);
            this.A03.A05.put(this.A02.A02(), true);
        }
    }
}
