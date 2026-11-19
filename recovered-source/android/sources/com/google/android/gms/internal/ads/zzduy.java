package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzduy implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfkn f13032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkq f13033b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzctq f13034c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzdvf f13035d;

    public zzduy(zzdvf zzdvfVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        this.f13032a = zzfknVar;
        this.f13033b = zzfkqVar;
        this.f13034c = zzctqVar;
        this.f13035d = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        zzfkq zzfkqVar = this.f13033b;
        zzfkn zzfknVar = this.f13032a;
        zzclbVar.mo5618w0(zzfknVar, zzfkqVar);
        zzclm zzclmVarMo5582K = zzclbVar.mo5582K();
        zzbio zzbioVar = zzbix.f8872zb;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && zzclmVarMo5582K != null) {
            zzdvf zzdvfVar = this.f13035d;
            zzeko zzekoVar = zzdvfVar.f13071i;
            zzfsm zzfsmVar = zzdvfVar.f13072j;
            zzctq zzctqVar = this.f13034c;
            zzclmVarMo5582K.m5644v(zzctqVar, zzekoVar, zzfsmVar);
            zzclmVarMo5582K.m5645x(zzctqVar, zzdvfVar.f13071i, zzdvfVar.f13066d);
        }
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8858ye)).booleanValue() || zzclmVarMo5582K == null) {
            return;
        }
        zzclx zzclxVar = zzclmVarMo5582K.f10444s;
        if (com.google.android.gms.ads.internal.zzt.f3698C.f3725y.m5361a(zzclxVar.getContext())) {
            zzclmVarMo5582K.m5634c("/logScionEvent");
            new HashMap();
            zzclmVarMo5582K.m5633b("/logScionEvent", new zzbqd(zzclxVar.getContext(), zzfknVar.f15961w0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
    }
}
