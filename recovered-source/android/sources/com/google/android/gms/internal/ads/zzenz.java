package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzenz implements zzdnw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzemd f14358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfkn f14359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzeoa f14360c;

    public zzenz(zzeoa zzeoaVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.f14358a = zzemdVar;
        this.f14359b = zzfknVar;
        this.f14360c = zzeoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    /* JADX INFO: renamed from: a */
    public final void mo5941a(boolean z, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.f14358a.f14192b;
            zzfmeVar.m6529b(z);
            zzbvm zzbvmVar = zzfmeVar.f16105a;
            if (this.f14360c.f14366c.f3398u < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8675o1)).intValue()) {
                try {
                    zzbvmVar.zzh();
                    return;
                } catch (Throwable th) {
                    throw new zzfln(th);
                }
            } else {
                try {
                    zzbvmVar.mo5176k1(new ObjectWrapper(context));
                    return;
                } catch (Throwable th2) {
                    throw new zzfln(th2);
                }
            }
        } catch (zzfln e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3072e("Cannot show interstitial.");
            throw new zzdnv(e.getCause());
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3072e("Cannot show interstitial.");
        throw new zzdnv(e.getCause());
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.f14359b;
    }
}
