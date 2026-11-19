package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzftj extends com.google.android.gms.ads.internal.client.zzbj {

    /* JADX INFO: renamed from: s */
    public zzets f16492s;

    /* JADX INFO: renamed from: t */
    public zzfsz f16493t;

    /* JADX INFO: renamed from: u */
    public String f16494u;

    @Override // com.google.android.gms.ads.internal.client.zzbk
    /* JADX INFO: renamed from: l0 */
    public final void mo2823l0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.f16493t;
        if (this.f16492s == null || zzfszVar == null) {
            return;
        }
        String string = zzeVar.m2925H().toString();
        String str = this.f16494u;
        StringBuilder sb = new StringBuilder(string.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        ((zzfty) zzfszVar).f16530b.m6698c(zzeVar);
        this.f16492s = null;
        this.f16493t = null;
        this.f16494u = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        zzfsz zzfszVar = this.f16493t;
        zzets zzetsVar = this.f16492s;
        if (zzetsVar == null || zzfszVar == null) {
            return;
        }
        zzfszVar.f16455a.m7320c(zzetsVar);
        this.f16492s = null;
        this.f16493t = null;
        this.f16494u = null;
    }
}
