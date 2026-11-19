package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4710kJ implements InterfaceC3281Mw {
    public final /* synthetic */ C4494gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C4710kJ(JSONObject jSONObject, C4494gi c4494gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c4494gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final Collection<String> A7p() {
        return AbstractC3282Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3281Mw
    public final EnumC3280Mv A8K() {
        return AbstractC3282Mx.A00(this.A02);
    }
}
