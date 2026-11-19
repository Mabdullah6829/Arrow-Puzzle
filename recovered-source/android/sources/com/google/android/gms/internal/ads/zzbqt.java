package com.google.android.gms.internal.ads;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqt extends WebViewClient {
    /* JADX INFO: renamed from: a */
    public abstract WebViewClient mo2774a();

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return false;
        }
        return webViewClientMo2774a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i2, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onSafeBrowsingHit(webView, webResourceRequest, i2, safeBrowsingResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f2, float f3) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onScaleChanged(webView, f2, f3);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return null;
        }
        return webViewClientMo2774a.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return false;
        }
        return webViewClientMo2774a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return false;
        }
        return webViewClientMo2774a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return;
        }
        webViewClientMo2774a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return null;
        }
        return webViewClientMo2774a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClientMo2774a = mo2774a();
        if (webViewClientMo2774a == null) {
            return false;
        }
        return webViewClientMo2774a.shouldOverrideUrlLoading(webView, str);
    }
}
