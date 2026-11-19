package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzems implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14244a;

    /* JADX INFO: renamed from: b */
    public final zzcvg f14245b;

    public zzems(Context context, zzcvg zzcvgVar) {
        this.f14244a = context;
        this.f14245b = zzcvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.f14192b, AdFormat.APP_OPEN_AD);
        zzcvd zzcvdVarMo5743b = this.f14245b.mo5743b(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdml(zzenyVar, null), new zzcve(zzfknVar.f15917a0));
        zzenyVar.f14357d = zzcvdVarMo5743b.mo5734c();
        ((zzenp) zzemdVar.f14193c).m6294l4(zzcvdVarMo5743b.mo5736f());
        return zzcvdVarMo5743b.mo5737g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.f14192b;
            zzbxiVar.mo5240I2(zzfknVar.f15915Z);
            zzbxiVar.mo5253t3(zzfknVar.f15910U, zzfknVar.f15958v.toString(), zzfkyVar.f16005a.f15998a.f16040d, new ObjectWrapper(this.f14244a), new zzemr(zzemdVar), (zzbvp) zzemdVar.f14193c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Remote exception loading an app open RTB ad", e);
            throw new zzfln(e);
        }
    }
}
