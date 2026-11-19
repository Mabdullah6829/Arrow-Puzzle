package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2829Fc extends AbstractC4438fo {
    public final /* synthetic */ InterfaceC3784VA A00;
    public final /* synthetic */ C3957Y2 A01;
    public final /* synthetic */ C4332e5 A02;
    public final /* synthetic */ C2825FY A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C2829Fc(C2825FY c2825fy, String str, C4332e5 c4332e5, InterfaceC3784VA interfaceC3784VA, Map map, C3957Y2 c3957y2) {
        this.A03 = c2825fy;
        this.A04 = str;
        this.A02 = c4332e5;
        this.A00 = interfaceC3784VA;
        this.A05 = map;
        this.A01 = c3957y2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        if (!this.A03.A02.A0Z() && !TextUtils.isEmpty(this.A04) && !this.A03.A08.get(this.A02.A02())) {
            this.A00.ABJ(this.A04, new C4150b9(this.A05).A03(this.A03.A03).A02(this.A01).A05());
            C3326Ng.A07(this.A03.A00, this.A03.A09);
            this.A03.A08.put(this.A02.A02(), true);
        }
    }
}
