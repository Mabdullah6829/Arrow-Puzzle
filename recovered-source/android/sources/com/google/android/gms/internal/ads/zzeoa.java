package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoa implements zzemg {

    /* JADX INFO: renamed from: a */
    public final Context f14364a;

    /* JADX INFO: renamed from: b */
    public final zzdno f14365b;

    /* JADX INFO: renamed from: c */
    public final VersionInfoParcel f14366c;

    /* JADX INFO: renamed from: d */
    public final Executor f14367d;

    public zzeoa(Context context, VersionInfoParcel versionInfoParcel, zzdno zzdnoVar, Executor executor) {
        this.f14364a = context;
        this.f14366c = versionInfoParcel;
        this.f14365b = zzdnoVar;
        this.f14367d = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6291a(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) {
        zzdmi zzdmiVarMo5777d = this.f14365b.mo5777d(new zzcyq(zzfkyVar, zzfknVar, zzemdVar.f14191a), new zzdml(new zzenz(this, zzemdVar, zzfknVar), null));
        zzdmiVarMo5777d.mo5733a().m5924Y(new zzctg((zzfme) zzemdVar.f14192b), this.f14367d);
        ((zzenp) zzemdVar.f14193c).m6294l4(zzdmiVarMo5777d.mo5735e());
        return zzdmiVarMo5777d.mo5769g();
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    /* JADX INFO: renamed from: b */
    public final void mo6292b(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        zzfme zzfmeVar = (zzfme) zzemdVar.f14192b;
        zzflg zzflgVar = zzfkyVar.f16005a.f15998a;
        String string = zzfknVar.f15958v.toString();
        String strM3125i = com.google.android.gms.ads.internal.util.zzbp.m3125i(zzfknVar.f15952s);
        Context context = this.f14364a;
        zzbvp zzbvpVar = (zzbvp) zzemdVar.f14193c;
        try {
            zzfmeVar.f16105a.mo5168V3(new ObjectWrapper(context), zzflgVar.f16040d, string, strM3125i, zzbvpVar);
        } catch (Throwable th) {
            throw new zzfln(th);
        }
    }
}
