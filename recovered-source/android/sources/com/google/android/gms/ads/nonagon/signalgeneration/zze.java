package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzhcp;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends zzbqt {

    /* JADX INFO: renamed from: a */
    public final zza f3927a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f3928b;

    /* JADX INFO: renamed from: c */
    public final Object f3929c = new Object();

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f3930d;

    /* JADX INFO: renamed from: e */
    public WebViewClient f3931e;

    /* JADX INFO: renamed from: f */
    public WebView f3932f;

    public zze(WebView webView, zza zzaVar, zzhcp zzhcpVar) {
        this.f3932f = webView;
        this.f3927a = zzaVar;
        this.f3928b = zzhcpVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3332c() {
        if (((Boolean) zzblc.f9104a.m5057c()).booleanValue()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            if (allStackTraces != null && allStackTraces.containsKey(Thread.currentThread())) {
                boolean z = false;
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
                    if (stackTraceElement.getClassName().contains(zze.class.getName())) {
                        if (!z || !z2) {
                            z = true;
                        }
                    } else if (z) {
                        z2 = true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    /* JADX INFO: renamed from: a */
    public final WebViewClient mo2774a() {
        return this.f3931e;
    }

    /* JADX INFO: renamed from: b */
    public final void m3333b() {
        synchronized (this.f3929c) {
            try {
                WebView webView = this.f3932f;
                if (webView == null) {
                    return;
                }
                webView.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8584ib), this.f3927a.m3315b()), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (m3332c()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (m3332c()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (m3332c()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (m3332c()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (m3332c()) {
            return;
        }
        m3333b();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (m3332c()) {
            return;
        }
        m3333b();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (m3332c()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        if (m3332c()) {
            return;
        }
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (m3332c()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (m3332c()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (m3332c()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (m3332c()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!m3332c()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        synchronized (this.f3929c) {
            try {
                WebView webView2 = this.f3932f;
                if (webView2 != null) {
                    webView2.setWebViewClient(new WebViewClient());
                    this.f3932f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ScheduledFuture scheduledFuture = this.f3930d;
        if (scheduledFuture == null) {
            return true;
        }
        scheduledFuture.cancel(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        if (m3332c()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f2, float f3) {
        if (m3332c()) {
            return;
        }
        super.onScaleChanged(webView, f2, f3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (m3332c()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (m3332c()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (m3332c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (m3332c()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (m3332c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (m3332c()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (m3332c()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (m3332c()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
