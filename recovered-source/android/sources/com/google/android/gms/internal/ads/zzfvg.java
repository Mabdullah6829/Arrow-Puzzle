package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvg {

    /* JADX INFO: renamed from: a */
    public final zzfvi f16643a;

    /* JADX INFO: renamed from: b */
    public final WebView f16644b;

    /* JADX INFO: renamed from: c */
    public final zzfxj f16645c;

    /* JADX INFO: renamed from: d */
    public final HashMap f16646d;

    /* JADX INFO: renamed from: e */
    public final zzfvw f16647e;

    /* JADX WARN: Multi-variable type inference failed */
    public zzfvg(zzfvi zzfviVar, WebView webView) {
        HashMap map = new HashMap();
        this.f16646d = map;
        this.f16647e = new zzfvw();
        if (!zzfus.f16595a.f16596a) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        this.f16643a = zzfviVar;
        this.f16644b = webView;
        zzfxj zzfxjVar = this.f16645c;
        if ((zzfxjVar == null ? null : (View) zzfxjVar.get()) != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfuu) it.next()).mo6721a(webView);
            }
            this.f16645c = new zzfxj(webView);
        }
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        WebViewCompat.removeWebMessageListener(this.f16644b, "omidJsSessionService");
        WebViewCompat.addWebMessageListener(this.f16644b, "omidJsSessionService", new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new zzfve(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m6729a(String str) {
        zzfuz zzfuzVar = zzfuz.DEFINED_BY_JAVASCRIPT;
        zzfvc zzfvcVar = zzfvc.DEFINED_BY_JAVASCRIPT;
        zzfvh zzfvhVar = zzfvh.JAVASCRIPT;
        int i2 = 0;
        zzfuy zzfuyVar = new zzfuy(zzfuv.m6724a(zzfuzVar, zzfvcVar, zzfvhVar, zzfvhVar, false), new zzfuw(this.f16643a, this.f16644b, null, null, zzfux.HTML), str);
        this.f16646d.put(str, zzfuyVar);
        zzfxj zzfxjVar = this.f16645c;
        zzfuyVar.mo6721a(zzfxjVar == null ? null : (View) zzfxjVar.get());
        ArrayList arrayList = this.f16647e.f16682a;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zzfvv zzfvvVar = (zzfvv) obj;
            zzfuyVar.mo6723c((View) zzfvvVar.f16677a.get(), zzfvvVar.f16679c);
        }
        zzfuyVar.m6725d();
    }
}
