package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbuq implements zzcgh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbtv f9403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzcgd f9405c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbut f9406d;

    public zzbuq(zzbut zzbutVar, zzbtv zzbtvVar, Object obj, zzcgd zzcgdVar) {
        this.f9403a = zzbtvVar;
        this.f9404b = obj;
        this.f9405c = zzcgdVar;
        this.f9406d = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final void mo5135b(Object obj) {
        zzbuc zzbucVar = (zzbuc) obj;
        com.google.android.gms.ads.internal.util.zze.m3150k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f9404b;
        zzcgd zzcgdVar = this.f9405c;
        zzbtv zzbtvVar = this.f9403a;
        zzbut zzbutVar = this.f9406d;
        zzbutVar.getClass();
        try {
            com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
            String string = UUID.randomUUID().toString();
            zzbpw.f9235o.m5115b(string, new zzbus(zzbtvVar, zzbutVar, zzcgdVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbutVar.f9413b.mo5147a(obj2));
            zzbucVar.mo5131j(jSONObject, zzbutVar.f9415d);
        } catch (Exception e) {
            try {
                zzcgdVar.m5398b(e);
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to invokeJavascript", e);
            } finally {
                zzbtvVar.m5136d();
            }
        }
    }
}
