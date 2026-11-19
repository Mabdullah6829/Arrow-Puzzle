package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfte extends zzbgs {

    /* JADX INFO: renamed from: s */
    public zzfsz f16474s;

    /* JADX INFO: renamed from: t */
    public String f16475t;

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: A */
    public final void mo4871A(int i2) {
        this.f16474s = null;
        this.f16475t = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: S3 */
    public final void mo4872S3(zzbgq zzbgqVar) {
        zzfsz zzfszVar = this.f16474s;
        if (zzfszVar == null) {
            return;
        }
        zzfszVar.f16455a.m7320c(zzbgqVar);
        this.f16474s = null;
        this.f16475t = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    /* JADX INFO: renamed from: d0 */
    public final void mo4873d0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.f16474s;
        if (zzfszVar == null) {
            return;
        }
        String string = zzeVar.m2925H().toString();
        String str = this.f16475t;
        StringBuilder sb = new StringBuilder(string.length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        ((zzfty) zzfszVar).f16530b.m6698c(zzeVar);
        this.f16474s = null;
        this.f16475t = null;
    }
}
