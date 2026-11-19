package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeod implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14372a;

    /* JADX INFO: renamed from: b */
    public final zzdno f14373b;

    public zzeod(Context context, zzdno zzdnoVar) {
        this.f14372a = context;
        this.f14373b = zzdnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.f14192b, AdFormat.INTERSTITIAL);
        zzdmi zzdmiVarMo5777d = this.f14373b.mo5777d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdml(zzenyVar, null));
        zzenyVar.f14357d = zzdmiVarMo5777d.mo5734c();
        ((zzenp) zzemdVar.f14193c).m6294l4(zzdmiVarMo5777d.mo5736f());
        return zzdmiVarMo5777d.mo5769g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        try {
            zzbxi zzbxiVar = (zzbxi) zzemdVar.f14192b;
            zzbxiVar.mo5240I2(zzfknVar.f15915Z);
            zzbxiVar.mo5250m2(zzfknVar.f15910U, zzfknVar.f15958v.toString(), zzfkyVar.f16005a.f15998a.f16040d, new ObjectWrapper(this.f14372a), new zzeoc(this, zzemdVar), (zzbvp) zzemdVar.f14193c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Remote exception loading a interstitial RTB ad", e);
            throw new zzfln(e);
        }
    }
}
