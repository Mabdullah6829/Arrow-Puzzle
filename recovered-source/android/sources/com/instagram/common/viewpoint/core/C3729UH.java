package com.instagram.common.viewpoint.core;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3729UH extends WebViewClient {
    public final /* synthetic */ CallableC3730UI A00;

    public C3729UH(CallableC3730UI callableC3730UI) {
        this.A00 = callableC3730UI;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC4139ay.A0D(AbstractC3690Td.A2j);
        return true;
    }
}
