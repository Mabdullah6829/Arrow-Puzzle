package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
class zzoc extends zzof {

    /* JADX INFO: renamed from: w */
    public volatile long f22685w;

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo10573a() {
        return Long.valueOf(this.f22685w);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo10574b(Object obj) {
        this.f22685w = ((Long) obj).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object mo10562e(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo10563f(Object obj) {
        return (Long) obj;
    }
}
