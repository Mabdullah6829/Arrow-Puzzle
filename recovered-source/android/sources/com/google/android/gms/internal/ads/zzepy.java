package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepy implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14587a;

    /* JADX INFO: renamed from: b */
    public final Executor f14588b;

    /* JADX INFO: renamed from: c */
    public final zzdvz f14589c;

    public zzepy(Context context, Executor executor, zzdvz zzdvzVar) {
        this.f14587a = context;
        this.f14588b = executor;
        this.f14589c = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzdvv zzdvvVarMo5795b = this.f14589c.mo5795b(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdvw(new zzepx(this, zzemdVar, zzfknVar), null));
        zzdvvVarMo5795b.mo5733a().m5924Y(new zzctg((zzfme) zzemdVar.f14192b), this.f14588b);
        ((zzenp) zzemdVar.f14193c).m6294l4((zzeqd) ((zzcqg) zzdvvVarMo5795b).f11175z.zzb());
        return zzdvvVarMo5795b.mo5788g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        JSONObject jSONObject = zzfknVar.f15958v;
        IInterface iInterface = zzemdVar.f14193c;
        Object obj = zzemdVar.f14192b;
        try {
            zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
            zzfku zzfkuVar = zzflgVar.f16052p;
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflgVar.f16040d;
            int i2 = zzfkuVar.f15997a;
            Context context = this.f14587a;
            if (i2 == 3) {
                zzfme zzfmeVar = (zzfme) obj;
                try {
                    zzfmeVar.f16105a.mo5166Q1(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbvp) iInterface);
                    return;
                } catch (Throwable th) {
                    throw new zzfln(th);
                }
            }
            zzfme zzfmeVar2 = (zzfme) obj;
            try {
                zzfmeVar2.f16105a.mo5173c4(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbvp) iInterface);
                return;
            } catch (Throwable th2) {
                throw new zzfln(th2);
            }
        } catch (Exception e) {
            String str = zzemdVar.f14191a;
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
        String str2 = zzemdVar.f14191a;
        int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to load ad from adapter ".concat(String.valueOf(str2)), e);
    }
}
