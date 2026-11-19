package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyj implements zzdgf, zzden, zzddc, zzddt, com.google.android.gms.ads.internal.client.zza, zzdiq {

    /* JADX INFO: renamed from: s */
    public final zzbhw f13284s;

    /* JADX INFO: renamed from: t */
    public boolean f13285t = false;

    public zzdyj(zzbhw zzbhwVar, zzfii zzfiiVar) {
        this.f13284s = zzbhwVar;
        zzbhwVar.m4895c(2);
        if (zzfiiVar != null) {
            zzbhwVar.m4895c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: L */
    public final void mo5878L(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m4996G(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.f13284s;
        zzbhwVar.m4894b(zzbhvVar);
        zzbhwVar.m4895c(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: X */
    public final void mo5879X(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyg
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m4996G(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.f13284s;
        zzbhwVar.m4894b(zzbhvVar);
        zzbhwVar.m4895c(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        this.f13284s.m4895c(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: g */
    public final void mo5880g(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m4996G(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.f13284s;
        zzbhwVar.m4894b(zzbhvVar);
        zzbhwVar.m4895c(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: i */
    public final void mo5881i(boolean z) {
        this.f13284s.m4895c(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: j */
    public final void mo5882j() {
        this.f13284s.m4895c(1109);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final synchronized void mo2730k() {
        if (this.f13285t) {
            this.f13284s.m4895c(8);
        } else {
            this.f13284s.m4895c(7);
            this.f13285t = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final synchronized void mo5838n() {
        this.f13284s.m4895c(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    /* JADX INFO: renamed from: r */
    public final void mo5883r(boolean z) {
        this.f13284s.m4895c(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: s */
    public final void mo5866s(final zzfky zzfkyVar) {
        this.f13284s.m4894b(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyi
            @Override // com.google.android.gms.internal.ads.zzbhv
            /* JADX INFO: renamed from: a */
            public final void mo4892a(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVar = (zzbic.zza.zzb) ((zzbic.zzt) zzaVar.f19780t).m4995F().m8347w();
                zzbic.zzi.zza zzaVar2 = (zzbic.zzi.zza) ((zzbic.zzt) zzaVar.f19780t).m4995F().m4903H().m8347w();
                String str = zzfkyVar.f16006b.f16002b.f15973b;
                zzaVar2.m8326l();
                ((zzbic.zzi) zzaVar2.f19780t).m4983E(str);
                zzbVar.m8326l();
                ((zzbic.zza) zzbVar.f19780t).m4902F((zzbic.zzi) zzaVar2.m8328o());
                zzaVar.m8326l();
                ((zzbic.zzt) zzaVar.f19780t).m5000L((zzbic.zza) zzbVar.m8328o());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    /* JADX INFO: renamed from: v */
    public final void mo5830v(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i2 = zzeVar.f3106s;
        zzbhw zzbhwVar = this.f13284s;
        switch (i2) {
            case 1:
                zzbhwVar.m4895c(101);
                break;
            case 2:
                zzbhwVar.m4895c(102);
                break;
            case 3:
                zzbhwVar.m4895c(5);
                break;
            case 4:
                zzbhwVar.m4895c(103);
                break;
            case 5:
                zzbhwVar.m4895c(104);
                break;
            case 6:
                zzbhwVar.m4895c(105);
                break;
            case 7:
                zzbhwVar.m4895c(106);
                break;
            default:
                zzbhwVar.m4895c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    /* JADX INFO: renamed from: z */
    public final void mo5867z(zzcbk zzcbkVar) {
    }
}
