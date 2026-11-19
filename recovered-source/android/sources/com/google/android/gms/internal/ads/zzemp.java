package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemp implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14238a;

    /* JADX INFO: renamed from: b */
    public final zzcvg f14239b;

    /* JADX INFO: renamed from: c */
    public final Executor f14240c;

    public zzemp(Context context, zzcvg zzcvgVar, Executor executor) {
        this.f14238a = context;
        this.f14239b = zzcvgVar;
        this.f14240c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzcvd zzcvdVarMo5743b = this.f14239b.mo5743b(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdml(new zzemo(this, zzemdVar, zzfknVar), null), new zzcve(zzfknVar.f15917a0));
        zzcvdVarMo5743b.mo5733a().m5924Y(new zzctg((zzfme) zzemdVar.f14192b), this.f14240c);
        ((zzenp) zzemdVar.f14193c).m6294l4(zzcvdVarMo5743b.mo5735e());
        return zzcvdVarMo5743b.mo5737g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.f14192b;
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        String string = zzfknVar.f15958v.toString();
        Context context = this.f14238a;
        zzbvp zzbvpVar = (zzbvp) zzemdVar.f14193c;
        try {
            zzfmeVar.f16105a.mo5181s2(new ObjectWrapper(context), zzflgVar.f16040d, string, zzbvpVar);
        } catch (Throwable th) {
            throw new zzfln(th);
        }
    }
}
