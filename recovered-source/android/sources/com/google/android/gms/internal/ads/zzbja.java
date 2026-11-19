package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbja {

    /* JADX INFO: renamed from: a */
    public final String f8878a = (String) zzbkr.f9012a.m5057c();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f8879b;

    /* JADX INFO: renamed from: c */
    public final Context f8880c;

    /* JADX INFO: renamed from: d */
    public final String f8881d;

    public zzbja(Context context, String str) {
        this.f8880c = context;
        this.f8881d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8879b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        com.google.android.gms.ads.internal.util.zzs zzsVar = zztVar.f3703c;
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.m3199R());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.m3207f(context) ? "0" : "1");
        zzcbr zzcbrVar = zztVar.f3716p;
        zzcbrVar.getClass();
        ListenableFuture listenableFutureSubmit = ((zzhbb) zzcfy.f9946a).submit(new zzcbp(zzcbrVar, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbo) listenableFutureSubmit.get()).f9726j));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbo) listenableFutureSubmit.get()).f9727k));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CsiConfiguration.CsiConfiguration", e);
        }
        zzbio zzbioVar = zzbix.f8185Kc;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = this.f8879b;
            com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            linkedHashMap2.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.m3205d(context) ? "0" : "1");
        }
        if (((Boolean) zzbivVar2.m5030a(zzbix.f8200La)).booleanValue() && ((Boolean) zzbivVar2.m5030a(zzbix.f8474c3)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt zztVar2 = com.google.android.gms.ads.internal.zzt.f3698C;
            if (zzgtq.m7127a(zztVar2.f3708h.f9895g)) {
                return;
            }
            this.f8879b.put("plugin", zztVar2.f3708h.f9895g);
        }
    }
}
