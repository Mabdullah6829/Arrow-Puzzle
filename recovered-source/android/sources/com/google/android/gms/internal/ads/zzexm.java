package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexm implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15093a;

    /* JADX INFO: renamed from: b */
    public final zzdxp f15094b;

    /* JADX INFO: renamed from: c */
    public final String f15095c;

    /* JADX INFO: renamed from: d */
    public final zzflg f15096d;

    public zzexm(zzhcp zzhcpVar, zzdxp zzdxpVar, zzflg zzflgVar, String str) {
        this.f15093a = zzhcpVar;
        this.f15094b = zzdxpVar;
        this.f15096d = zzflgVar;
        this.f15095c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15093a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            /* JADX WARN: Code duplicated, block: B:22:0x0078  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject;
                zzexm zzexmVar = this.f15092a;
                zzflg zzflgVar = zzexmVar.f15096d;
                zzdxp zzdxpVar = zzexmVar.f15094b;
                String str = zzflgVar.f16043g;
                String str2 = zzexmVar.f15095c;
                zzdxpVar.getClass();
                zzbio zzbioVar = zzbix.f8345U4;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue() || str == null || str2 == null) {
                    jSONObject = null;
                } else {
                    if (!zzdxpVar.f13259d) {
                        zzdxpVar.m6084a();
                        if (((Boolean) zzbivVar.m5030a(zzbix.f8361V4)).booleanValue() && !zzdxpVar.f13261f.getAndSet(true)) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().f3587c.add(new zzdxm(zzdxpVar));
                        }
                    }
                    Map map = (Map) zzdxpVar.f13256a.get(str2);
                    if (map == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = (JSONObject) map.get(str);
                        if (jSONObject == null) {
                            String strM6085a = zzdxr.m6085a(zzdxpVar.f13260e, str, str2);
                            if (strM6085a != null) {
                                jSONObject = (JSONObject) map.get(strM6085a);
                            } else {
                                jSONObject = null;
                            }
                        }
                    }
                }
                return new zzexn(jSONObject, ((Boolean) zzbivVar.m5030a(zzbix.f8377W4)).booleanValue() ? zzdxpVar.f13257b : null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 17;
    }
}
