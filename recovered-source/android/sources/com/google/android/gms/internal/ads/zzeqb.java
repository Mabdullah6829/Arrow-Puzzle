package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqb implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14596a;

    /* JADX INFO: renamed from: b */
    public final zzdvz f14597b;

    public zzeqb(Context context, zzdvz zzdvzVar) {
        this.f14596a = context;
        this.f14597b = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzeny zzenyVar = new zzeny(zzfknVar, (zzbxi) zzemdVar.f14192b, AdFormat.REWARDED);
        zzdvv zzdvvVarMo5795b = this.f14597b.mo5795b(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdvw(zzenyVar, null));
        zzenyVar.f14357d = zzdvvVarMo5795b.mo5734c();
        zzcqg zzcqgVar = (zzcqg) zzdvvVarMo5795b;
        ((zzenp) zzemdVar.f14193c).m6294l4(new zzeqx((zzdcx) zzcqgVar.f11162m.zzb(), (zzdle) zzcqgVar.f11164o.zzb(), (zzddr) zzcqgVar.f11158i.zzb(), (zzdeg) zzcqgVar.f11161l.zzb(), (zzdel) zzcqgVar.f11165p.zzb(), (zzddm) zzcqgVar.f11171v.zzb(), (zzdid) zzcqgVar.f11153d.f11204X.zzb(), (zzdmc) zzcqgVar.f11168s.zzb(), (zzdfk) zzcqgVar.f11167r.zzb(), (zzdlp) zzcqgVar.f11173x.zzb(), (zzdhz) zzcqgVar.f11169t.zzb()));
        return zzdvvVarMo5795b.mo5788g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        try {
            Object obj = zzemdVar.f14192b;
            IInterface iInterface = zzemdVar.f14193c;
            zzbxi zzbxiVar = (zzbxi) obj;
            String str = zzfknVar.f15915Z;
            JSONObject jSONObject = zzfknVar.f15958v;
            zzbxiVar.mo5240I2(str);
            zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
            int i2 = zzflgVar.f16052p.f15997a;
            Context context = this.f14596a;
            if (i2 == 3) {
                zzbxiVar.mo5239I1(zzfknVar.f15910U, jSONObject.toString(), zzflgVar.f16040d, new ObjectWrapper(context), new zzeqa(this, zzemdVar), (zzbvp) iInterface);
            } else {
                zzbxiVar.mo5252s3(zzfknVar.f15910U, jSONObject.toString(), zzflgVar.f16040d, new ObjectWrapper(context), new zzeqa(this, zzemdVar), (zzbvp) iInterface);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
