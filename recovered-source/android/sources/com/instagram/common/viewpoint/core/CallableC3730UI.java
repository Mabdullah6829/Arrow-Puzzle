package com.instagram.common.viewpoint.core;

import android.webkit.WebView;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC3730UI implements Callable<String> {
    public final /* synthetic */ C3659T8 A00;

    public CallableC3730UI(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String call() {
        String browserUserAgent = AbstractC3731UJ.A03.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        WebView webView = new WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new C3729UH(this));
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            AbstractC3731UJ.A03.set(userAgentString);
        }
        return userAgentString;
    }
}
