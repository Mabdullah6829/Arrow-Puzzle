package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13785a;

    /* JADX INFO: renamed from: b */
    public final zzini f13786b;

    public zzefd(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f13785a = zzimyVar;
        this.f13786b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.f13785a.zzb();
        final CookieManager cookieManagerM3237h = com.google.android.gms.ads.internal.zzt.f3698C.f3706f.m3237h();
        Objects.requireNonNull(zzfpsVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerM3237h;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8794v1));
            }
        };
        zzhcp zzhcpVar = zzfpsVar.f16242a;
        zzfpj zzfpjVar = new zzfpj(zzfpsVar, zzfpm.WEBVIEW_COOKIE, null, zzfpk.f16241d, Collections.EMPTY_LIST, zzhcpVar.submit(callable));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzfpj zzfpjVarM6554c = zzfpjVar.m6554c(1L);
        int i2 = zzeev.f13771a;
        zzfpg zzfpgVar = new zzfpg();
        zzfpk zzfpkVar = zzfpjVarM6554c.f16240f;
        zzhcp zzhcpVar2 = zzfpkVar.f16242a;
        return new zzfpj(zzfpkVar, zzfpjVarM6554c.f16235a, zzfpjVarM6554c.f16236b, zzfpjVarM6554c.f16237c, zzfpjVarM6554c.f16238d, zzhcf.m7372f(zzfpjVarM6554c.f16239e, Exception.class, zzfpgVar, zzhcpVar2)).m6555d();
    }
}
