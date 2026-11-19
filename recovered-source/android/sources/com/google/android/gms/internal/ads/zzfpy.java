package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpy implements zzdkl, zzddp, zzdkp {

    /* JADX INFO: renamed from: s */
    public final zzfqq f16281s;

    /* JADX INFO: renamed from: t */
    public final zzfqg f16282t;

    public zzfpy(Context context, zzfqq zzfqqVar) {
        this.f16281s = zzfqqVar;
        this.f16282t = zzfqg.m6562l(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    /* JADX INFO: renamed from: c */
    public final void mo5890c() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    /* JADX INFO: renamed from: j */
    public final void mo5837j(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkq.f9010d.m5057c()).booleanValue()) {
            String string = zzeVar.m2926w().toString();
            zzfqg zzfqgVar = this.f16282t;
            zzfqgVar.mo6565g(string);
            zzfqgVar.mo6563L(false);
            this.f16281s.m6578a(zzfqgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    /* JADX INFO: renamed from: u */
    public final void mo5934u() {
        if (((Boolean) zzbkq.f9010d.m5057c()).booleanValue()) {
            zzfqg zzfqgVar = this.f16282t;
            zzfqgVar.mo6563L(true);
            this.f16281s.m6578a(zzfqgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
        if (((Boolean) zzbkq.f9010d.m5057c()).booleanValue()) {
            this.f16282t.zza();
        }
    }
}
