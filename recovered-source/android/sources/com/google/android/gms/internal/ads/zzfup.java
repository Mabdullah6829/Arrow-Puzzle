package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfup extends zzccv {

    /* JADX INFO: renamed from: s */
    public zzfke f16592s;

    /* JADX INFO: renamed from: t */
    public zzfsz f16593t;

    /* JADX INFO: renamed from: u */
    public String f16594u;

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: a */
    public final void mo5338a() {
        zzfsz zzfszVar = this.f16593t;
        zzfke zzfkeVar = this.f16592s;
        if (zzfkeVar == null || zzfszVar == null) {
            return;
        }
        zzfszVar.f16455a.m7320c(zzfkeVar);
        this.f16592s = null;
        this.f16593t = null;
        this.f16594u = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: o */
    public final void mo5339o(int i2) {
        this.f16592s = null;
        this.f16593t = null;
        this.f16594u = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    /* JADX INFO: renamed from: q */
    public final void mo5340q(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsz zzfszVar = this.f16593t;
        if (this.f16592s == null || zzfszVar == null) {
            return;
        }
        String string = zzeVar.m2925H().toString();
        String str = this.f16594u;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(sb.toString());
        ((zzfty) zzfszVar).f16530b.m6698c(zzeVar);
        this.f16592s = null;
        this.f16593t = null;
        this.f16594u = null;
    }
}
