package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwm extends zzfwi {

    /* JADX INFO: renamed from: e */
    public WebView f16708e;

    /* JADX INFO: renamed from: f */
    public Long f16709f;

    /* JADX INFO: renamed from: g */
    public final Map f16710g;

    public zzfwm(String str, Map map) {
        super(str);
        this.f16709f = null;
        this.f16710g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfwi
    /* JADX INFO: renamed from: a */
    public final void mo6741a() {
        WebView webView = new WebView(zzfvx.f16683b.f16684a);
        this.f16708e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16708e.getSettings().setAllowContentAccess(false);
        this.f16708e.getSettings().setAllowFileAccess(false);
        this.f16708e.setWebViewClient(new zzfwk(this));
        this.f16703b = new zzfxk(this.f16708e);
        zzfvz.m6734b(this.f16708e, null);
        Map map = this.f16710g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.f16709f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfwi
    /* JADX INFO: renamed from: b */
    public final void mo6742b() {
        super.mo6742b();
        new Handler().postDelayed(new zzfwl(this), Math.max(4000 - (this.f16709f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f16709f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f16708e = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwi
    /* JADX INFO: renamed from: d */
    public final void mo6744d(zzfuy zzfuyVar, zzfuw zzfuwVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(zzfuwVar.f16605d);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        m6745e(zzfuyVar, zzfuwVar, jSONObject);
    }
}
