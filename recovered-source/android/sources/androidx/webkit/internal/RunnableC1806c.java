package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;

/* JADX INFO: renamed from: androidx.webkit.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1806c implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2852s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ WebViewRenderProcessClient f2853t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ WebView f2854u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ WebViewRenderProcess f2855v;

    public /* synthetic */ RunnableC1806c(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl, int i2) {
        this.f2852s = i2;
        this.f2853t = webViewRenderProcessClient;
        this.f2854u = webView;
        this.f2855v = webViewRenderProcessImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2852s) {
            case 0:
                this.f2853t.onRenderProcessResponsive(this.f2854u, this.f2855v);
                break;
            default:
                this.f2853t.onRenderProcessUnresponsive(this.f2854u, this.f2855v);
                break;
        }
    }
}
