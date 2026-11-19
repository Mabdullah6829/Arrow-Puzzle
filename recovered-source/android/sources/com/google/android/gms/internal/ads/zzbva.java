package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbva implements zzhbn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbvb f9429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9430b;

    public /* synthetic */ zzbva(zzbvb zzbvbVar, Object obj) {
        this.f9429a = zzbvbVar;
        this.f9430b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo3248b(Object obj) throws JSONException {
        zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        String string = UUID.randomUUID().toString();
        zzbpw.f9235o.m5115b(string, new zzbuz(this.f9429a, zzcgdVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) this.f9430b);
        ((zzbuc) obj).mo5131j(jSONObject, "google.afma.activeView.handleUpdate");
        return zzcgdVar;
    }
}
