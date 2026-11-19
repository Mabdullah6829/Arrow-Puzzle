package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
class zzny extends zzof {

    /* JADX INFO: renamed from: w */
    public volatile boolean f22682w;

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo10573a() {
        return Boolean.valueOf(this.f22682w);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo10574b(Object obj) {
        this.f22682w = ((Boolean) obj).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object mo10562e(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.zznp
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo10563f(Object obj) {
        return (Boolean) obj;
    }
}
