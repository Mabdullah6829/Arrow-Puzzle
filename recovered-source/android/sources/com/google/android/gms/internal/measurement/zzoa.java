package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
class zzoa extends zzof {

    /* JADX INFO: renamed from: w */
    public volatile double f22683w;

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo10573a() {
        return Double.valueOf(this.f22683w);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo10574b(Object obj) {
        this.f22683w = ((Double) obj).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object mo10562e(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo10563f(Object obj) {
        return (Double) obj;
    }
}
