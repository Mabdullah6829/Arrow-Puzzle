package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvr implements zzbqp {

    /* JADX INFO: renamed from: s */
    public final zzdeg f13119s;

    /* JADX INFO: renamed from: t */
    public final zzcci f13120t;

    /* JADX INFO: renamed from: u */
    public final String f13121u;

    /* JADX INFO: renamed from: v */
    public final String f13122v;

    public zzdvr(zzdeg zzdegVar, zzfkn zzfknVar) {
        this.f13119s = zzdegVar;
        this.f13120t = zzfknVar.f15938l;
        this.f13121u = zzfknVar.f15934j;
        this.f13122v = zzfknVar.f15936k;
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    /* JADX INFO: renamed from: u */
    public final void mo5116u() {
        zzdeg zzdegVar = this.f13119s;
        zzdegVar.getClass();
        zzdegVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdec
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzdcz) obj).mo5825a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    /* JADX INFO: renamed from: x */
    public final void mo5117x(zzcci zzcciVar) {
        int i2;
        String str;
        zzcci zzcciVar2 = this.f13120t;
        if (zzcciVar2 != null) {
            zzcciVar = zzcciVar2;
        }
        if (zzcciVar != null) {
            str = zzcciVar.f9740s;
            i2 = zzcciVar.f9741t;
        } else {
            i2 = 1;
            str = "";
        }
        final zzcbt zzcbtVar = new zzcbt(str, i2);
        zzdeg zzdegVar = this.f13119s;
        zzdegVar.getClass();
        final String str2 = this.f13121u;
        final String str3 = this.f13122v;
        zzdegVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzded
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzdcz) obj).mo5827l(zzcbtVar, str2, str3);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzc() {
        zzdeg zzdegVar = this.f13119s;
        zzdegVar.getClass();
        zzdegVar.m5923J0(zzdee.f12096a);
    }
}
