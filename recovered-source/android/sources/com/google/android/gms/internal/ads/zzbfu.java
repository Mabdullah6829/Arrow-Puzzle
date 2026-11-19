package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbfu implements ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbfv f7776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbfn f7777b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WebView f7778c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f7779d;

    public /* synthetic */ zzbfu(zzbfv zzbfvVar, zzbfn zzbfnVar, WebView webView, boolean z) {
        this.f7776a = zzbfvVar;
        this.f7777b = zzbfnVar;
        this.f7778c = webView;
        this.f7779d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        zzbfx zzbfxVar = this.f7776a.f7782u;
        zzbfn zzbfnVar = this.f7777b;
        WebView webView = this.f7778c;
        String str = (String) obj;
        boolean z = this.f7779d;
        zzbfxVar.getClass();
        synchronized (zzbfnVar.f7746g) {
            zzbfnVar.f7752m--;
        }
        try {
            boolean z2 = true;
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (zzbfxVar.f7790F || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfnVar.m4845a(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    zzbfnVar.m4845a(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (zzbfnVar.f7746g) {
                if (zzbfnVar.f7752m != 0) {
                    z2 = false;
                }
            }
            if (z2) {
                zzbfxVar.f7795v.m4848a(zzbfnVar);
            }
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3068a("Json string may be malformed.");
        } catch (Throwable th) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3069b("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
