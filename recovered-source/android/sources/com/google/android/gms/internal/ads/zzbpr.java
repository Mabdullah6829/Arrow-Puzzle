package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbpr implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdlg f9211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzctq f9212b;

    public /* synthetic */ zzbpr(zzdlg zzdlgVar, zzctq zzctqVar) {
        this.f9211a = zzdlgVar;
        this.f9212b = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        zzbpw.m5099b(map, this.f9211a);
        final String str = (String) map.get("u");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("URL missing from click GMSG.");
            return;
        }
        zzhbx zzhbxVarM7360q = zzhbx.m7360q(zzbpw.m5098a(zzclbVar, str));
        final zzctq zzctqVar = this.f9212b;
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbpu
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj2) {
                zzctq zzctqVar2;
                String str2 = (String) obj2;
                zzbpx zzbpxVar = zzbpw.f9221a;
                return (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8804vb)).booleanValue() && (zzctqVar2 = zzctqVar) != null && zzctq.m5821b(str)) ? zzctqVar2.m5822a(str2, com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e) : zzhcf.m7367a(str2);
            }
        };
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzhbx zzhbxVar = (zzhbx) zzhcf.m7374h(zzhbxVarM7360q, zzhbnVar, zzhcpVar);
        zzhbxVar.addListener(new zzhcd(zzhbxVar, new zzbpb(zzclbVar)), zzhcpVar);
    }
}
