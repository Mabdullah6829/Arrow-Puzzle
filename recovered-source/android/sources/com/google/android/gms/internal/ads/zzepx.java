package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzepx implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzemd f14585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkn f14586b;

    public zzepx(zzepy zzepyVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.f14585a = zzemdVar;
        this.f14586b = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.f14585a.f14192b;
            zzfmeVar.m6529b(z);
            try {
                zzfmeVar.f16105a.mo5170a2(new ObjectWrapper(context));
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } catch (zzfln e) {
            throw new zzdnv(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14586b;
    }
}
