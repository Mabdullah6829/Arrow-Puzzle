package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnn {

    /* JADX INFO: renamed from: a */
    public String f10605a;

    /* JADX INFO: renamed from: b */
    public zziid f10606b;

    /* JADX INFO: renamed from: c */
    public zzilv f10607c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f10608d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f10609e = new AtomicBoolean(false);

    public zzcnn(ScheduledExecutorService scheduledExecutorService) {
        this.f10608d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m5678a() {
        try {
            String variationsHeader = WebViewFeature.isFeatureSupported(WebViewFeature.GET_VARIATIONS_HEADER) ? WebViewCompat.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.f10605a = variationsHeader;
                byte[] bArrDecode = Base64.decode(variationsHeader, 10);
                this.f10606b = zziid.m8492D(bArrDecode, zzidz.m8304a());
                zzbio zzbioVar = zzbix.f8498da;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                zzbiv zzbivVar = zzbaVar.f3098c;
                zzbiv zzbivVar2 = zzbaVar.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    this.f10607c = zzilv.m8538D(bArrDecode, zzidz.m8304a());
                }
                if (((Boolean) zzbivVar2.m5030a(zzbix.f8464ba)).booleanValue() && ((Boolean) zzbivVar2.m5030a(zzbix.f8447aa)).booleanValue()) {
                    this.f10608d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnm
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f10604s.m5678a();
                        }
                    }, ((Integer) zzbivVar2.m5030a(zzbix.f8481ca)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (zzifh e) {
            e = e;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("ChromeVariations", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("ChromeVariations", e);
        }
    }
}
