package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeqt implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14668a;

    /* JADX INFO: renamed from: b */
    public final Executor f14669b;

    /* JADX INFO: renamed from: c */
    public final zzdvz f14670c;

    public zzeqt(Context context, Executor executor, zzdvz zzdvzVar) {
        this.f14668a = context;
        this.f14669b = executor;
        this.f14670c = zzdvzVar;
    }

    /* JADX INFO: renamed from: c */
    public static final void m6314c(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        try {
            zzfme zzfmeVar = (zzfme) zzemdVar.f14192b;
            try {
                zzfmeVar.f16105a.mo5163L0(zzfkyVar.f16005a.f15998a.f16040d, zzfknVar.f15958v.toString());
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } catch (Exception e) {
            String str = zzemdVar.f14191a;
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzdvv zzdvvVarMo5795b = this.f14670c.mo5795b(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdvw(new zzeqr(this, zzemdVar, zzfknVar), null));
        zzdvvVarMo5795b.mo5733a().m5924Y(new zzctg((zzfme) zzemdVar.f14192b), this.f14669b);
        zzcqg zzcqgVar = (zzcqg) zzdvvVarMo5795b;
        zzdeg zzdegVar = (zzdeg) zzcqgVar.f11161l.zzb();
        zzdcx zzdcxVarMo5767b = zzdvvVarMo5795b.mo5767b();
        zzdfk zzdfkVar = (zzdfk) zzcqgVar.f11167r.zzb();
        zzdlp zzdlpVarMo5790i = zzdvvVarMo5795b.mo5790i();
        zzenq zzenqVar = (zzenq) zzemdVar.f14193c;
        zzeqs zzeqsVar = new zzeqs(this, zzdfkVar, zzdcxVarMo5767b, zzdegVar, zzdlpVarMo5790i);
        synchronized (zzenqVar) {
            zzenqVar.f14314s = zzeqsVar;
        }
        return zzdvvVarMo5795b.mo5788g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.f14192b;
        if (zzfmeVar.m6528a()) {
            m6314c(zzfkyVar, zzfknVar, zzemdVar);
            return;
        }
        zzeqq zzeqqVar = new zzeqq(this, zzfkyVar, zzfknVar, zzemdVar);
        IInterface iInterface = zzemdVar.f14193c;
        zzenq zzenqVar = (zzenq) iInterface;
        synchronized (zzenqVar) {
            zzenqVar.f14316u = zzeqqVar;
        }
        Context context = this.f14668a;
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        zzcch zzcchVar = (zzcch) iInterface;
        String string = zzfknVar.f15958v.toString();
        try {
            zzfmeVar.f16105a.mo5158A2(new ObjectWrapper(context), zzflgVar.f16040d, zzcchVar, string);
        } catch (Throwable th) {
            throw new zzfln(th);
        }
    }
}
