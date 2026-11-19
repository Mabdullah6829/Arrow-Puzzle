package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzflq implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdlg f16071a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzctq f16072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfsm f16073c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzeko f16074d;

    public /* synthetic */ zzflq(zzdlg zzdlgVar, zzctq zzctqVar, zzfsm zzfsmVar, zzeko zzekoVar) {
        this.f16071a = zzdlgVar;
        this.f16072b = zzctqVar;
        this.f16073c = zzfsmVar;
        this.f16074d = zzekoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        zzbpw.m5099b(map, this.f16071a);
        String str = (String) map.get("u");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL missing from click GMSG.");
        } else {
            ListenableFuture listenableFutureM5098a = zzbpw.m5098a(zzclbVar, str);
            zzflo zzfloVar = new zzflo(zzclbVar, this.f16072b, this.f16073c, this.f16074d);
            listenableFutureM5098a.addListener(new zzhcd(listenableFutureM5098a, zzfloVar), zzcfy.f9946a);
        }
    }
}
