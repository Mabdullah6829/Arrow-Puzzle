package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxt implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13266a;

    /* JADX INFO: renamed from: b */
    public final zzefg f13267b;

    /* JADX INFO: renamed from: c */
    public final zzini f13268c;

    /* JADX INFO: renamed from: d */
    public final zzini f13269d;

    /* JADX INFO: renamed from: e */
    public final zzini f13270e;

    public zzdxt(zzcnz zzcnzVar, zzefg zzefgVar, zzcop zzcopVar, zzini zziniVar, zzimy zzimyVar) {
        this.f13266a = zzcnzVar;
        this.f13267b = zzefgVar;
        this.f13268c = zzcopVar;
        this.f13269d = zziniVar;
        this.f13270e = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = ((zzcnz) this.f13266a).m5709a();
        final String packageName = ((zzcnz) this.f13267b.f13789a).m5709a().getPackageName();
        zzinh.m8554a(packageName);
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f13268c).m5711a();
        final zzbic.zza.EnumC6586zza enumC6586zza = (zzbic.zza.EnumC6586zza) this.f13269d.zzb();
        final String str = (String) this.f13270e.zzb();
        zzbhw zzbhwVar = new zzbhw(new zzbib(contextM5709a));
        zzbic.zzar.zza zzaVarM4943F = zzbic.zzar.m4943F();
        int i2 = versionInfoParcelM5711a.f3397t;
        zzaVarM4943F.m8326l();
        ((zzbic.zzar) zzaVarM4943F.f19780t).m4945G(i2);
        int i3 = versionInfoParcelM5711a.f3398u;
        zzaVarM4943F.m8326l();
        ((zzbic.zzar) zzaVarM4943F.f19780t).m4946H(i3);
        int i4 = true != versionInfoParcelM5711a.f3399v ? 2 : 0;
        zzaVarM4943F.m8326l();
        ((zzbic.zzar) zzaVarM4943F.f19780t).m4944D(i4);
        final zzbic.zzar zzarVar = (zzbic.zzar) zzaVarM4943F.m8328o();
        zzbhwVar.m4894b(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVar = (zzbic.zza.zzb) ((zzbic.zzt) zzaVar.f19780t).m4995F().m8347w();
                zzbVar.m8326l();
                ((zzbic.zza) zzbVar.f19780t).m4901E(enumC6586zza);
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m5000L((zzbic.zza) zzbVar.m8328o());
                zzbic.zzm.zza zzaVar2 = (zzbic.zzm.zza) ((zzbic.zzt) zzaVar.f19780t).m4993D().m8347w();
                zzaVar2.m8326l();
                ((zzbic.zzm) zzaVar2.f19780t).m4987E(packageName);
                zzaVar2.m8326l();
                ((zzbic.zzm) zzaVar2.f19780t).m4988F(zzarVar);
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m4999K((zzbic.zzm) zzaVar2.m8328o());
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m4994E(str);
            }
        });
        return zzbhwVar;
    }
}
