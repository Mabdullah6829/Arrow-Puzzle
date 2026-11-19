package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class zzcmp extends zzcmo {
    public zzcmp(zzclx zzclxVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        super(zzclxVar, zzbhwVar, z, new zzbym(zzclxVar, ((zzcme) zzclxVar.f10483s).mo5581J(), new zzbie(zzclxVar.getContext())), zzekzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            String string = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (!(webView instanceof zzclb)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return null;
            }
            zzclb zzclbVar = (zzclb) webView;
            zzcdu zzcduVar = this.f10434Q;
            if (zzcduVar != null) {
                zzcduVar.mo5351c(string, requestHeaders, 1);
            }
            zzfzv zzfzvVar = zzfzu.f16872a;
            int i3 = zzfzz.f16873a;
            if (!"mraid.js".equalsIgnoreCase(new File(string).getName())) {
                if (requestHeaders == null) {
                    requestHeaders = Collections.EMPTY_MAP;
                }
                return m5636e(string, requestHeaders);
            }
            if (zzclbVar.mo5582K() != null) {
                final zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
                synchronized (zzclmVarMo5582K.f10447v) {
                    zzclmVarMo5582K.f10421D = false;
                    zzclmVarMo5582K.f10426I = true;
                    ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcli
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzclx zzclxVar = zzclmVarMo5582K.f10444s;
                            zzclxVar.mo5579I();
                            com.google.android.gms.ads.internal.overlay.zzm zzmVarMo5585O = ((zzcme) zzclxVar.f10483s).mo5585O();
                            if (zzmVarMo5585O != null) {
                                zzmVarMo5585O.f3348D.removeView(zzmVarMo5585O.f3365x);
                                zzmVarMo5585O.m3009q4(true);
                            }
                        }
                    });
                }
            }
            if (zzclbVar.mo5609p().m5677b()) {
                str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8827x0);
            } else if (zzclbVar.mo5614s0()) {
                str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8810w0);
            } else {
                str = (String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8793v0);
            }
            com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
            com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
            Context context = zzclbVar.getContext();
            String str2 = zzclbVar.mo5472h().f3396s;
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            try {
                HashMap map = new HashMap();
                map.put("User-Agent", zztVar.f3703c.m3231E(context, str2));
                map.put("Cache-Control", "max-stale=3600");
                ListenableFuture listenableFutureM3116a = new com.google.android.gms.ads.internal.util.zzbl(context).m3116a(0, str, map, null);
                String str3 = (String) ((zzcgd) listenableFutureM3116a).f9959s.get(60L, TimeUnit.SECONDS);
                if (str3 != null) {
                    return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not fetch MRAID JS.", e);
            }
        }
        return null;
    }
}
