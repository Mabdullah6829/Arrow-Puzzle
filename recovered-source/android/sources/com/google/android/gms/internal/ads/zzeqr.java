package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzeqr implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzemd f14662a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkn f14663b;

    public zzeqr(zzeqt zzeqtVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.f14662a = zzemdVar;
        this.f14663b = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.f14662a.f14192b;
            zzfmeVar.m6529b(z);
            try {
                zzfmeVar.f16105a.mo5165Q();
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } catch (zzfln e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot show rewarded video.", e);
            throw new zzdnv(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14663b;
    }
}
