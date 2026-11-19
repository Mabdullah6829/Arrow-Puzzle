package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvf {

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.zza f13064b;

    /* JADX INFO: renamed from: c */
    public final Context f13065c;

    /* JADX INFO: renamed from: d */
    public final zzdzt f13066d;

    /* JADX INFO: renamed from: e */
    public final Executor f13067e;

    /* JADX INFO: renamed from: f */
    public final zzbaw f13068f;

    /* JADX INFO: renamed from: g */
    public final VersionInfoParcel f13069g;

    /* JADX INFO: renamed from: i */
    public final zzeko f13071i;

    /* JADX INFO: renamed from: j */
    public final zzfsm f13072j;

    /* JADX INFO: renamed from: k */
    public final zzekz f13073k;

    /* JADX INFO: renamed from: l */
    public final zzflk f13074l;

    /* JADX INFO: renamed from: m */
    public ListenableFuture f13075m;

    /* JADX INFO: renamed from: a */
    public final zzdut f13063a = new zzdut();

    /* JADX INFO: renamed from: h */
    public final zzbqo f13070h = new zzbqo();

    public zzdvf(zzdvd zzdvdVar) {
        this.f13065c = zzdvdVar.f13050b;
        this.f13067e = zzdvdVar.f13053e;
        this.f13068f = zzdvdVar.f13054f;
        this.f13069g = zzdvdVar.f13055g;
        this.f13064b = zzdvdVar.f13049a;
        this.f13071i = zzdvdVar.f13052d;
        this.f13072j = zzdvdVar.f13056h;
        this.f13066d = zzdvdVar.f13051c;
        this.f13073k = zzdvdVar.f13057i;
        this.f13074l = zzdvdVar.f13058j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ListenableFuture m6068a(final JSONObject jSONObject, final String str) {
        ListenableFuture listenableFuture = this.f13075m;
        if (listenableFuture == null) {
            return zzhcj.f18518t;
        }
        return zzhcf.m7374h(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdvb
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                zzclb zzclbVar = (zzclb) obj;
                zzbqo zzbqoVar = this.f13045a.f13070h;
                zzbqoVar.getClass();
                zzcgd zzcgdVar = new zzcgd();
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                String string = UUID.randomUUID().toString();
                zzbqoVar.m5115b(string, new zzbqm(zzbqoVar, zzcgdVar));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", string);
                    jSONObject3.put("args", jSONObject2);
                    zzclbVar.mo5131j(jSONObject3, str2);
                    return zzcgdVar;
                } catch (Exception e) {
                    zzcgdVar.m5398b(e);
                    return zzcgdVar;
                }
            }
        }, this.f13067e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6069b(String str, zzbpx zzbpxVar) {
        ListenableFuture listenableFuture = this.f13075m;
        if (listenableFuture == null) {
            return;
        }
        zzduv zzduvVar = new zzduv(this, str, zzbpxVar);
        Executor executor = this.f13067e;
        ((zzhay) listenableFuture).addListener(new zzhcd(listenableFuture, zzduvVar), executor);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6070c(String str, zzbpx zzbpxVar) {
        ListenableFuture listenableFuture = this.f13075m;
        if (listenableFuture == null) {
            return;
        }
        zzduw zzduwVar = new zzduw(this, str, zzbpxVar);
        Executor executor = this.f13067e;
        ((zzhay) listenableFuture).addListener(new zzhcd(listenableFuture, zzduwVar), executor);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6071d(Map map) {
        ListenableFuture listenableFuture = this.f13075m;
        if (listenableFuture == null) {
            return;
        }
        zzdux zzduxVar = new zzdux(this, map);
        Executor executor = this.f13067e;
        ((zzhay) listenableFuture).addListener(new zzhcd(listenableFuture, zzduxVar), executor);
    }
}
