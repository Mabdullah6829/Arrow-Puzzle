package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmq extends zzcmp {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean zDidCrash = renderProcessGoneDetail.didCrash();
        return this.f10444s.mo5622z0(renderProcessGoneDetail.rendererPriorityAtExit(), zDidCrash);
    }
}
