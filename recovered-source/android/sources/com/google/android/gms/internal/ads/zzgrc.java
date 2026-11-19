package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrc extends zzgse {

    /* JADX INFO: renamed from: a */
    public String f18104a;

    /* JADX INFO: renamed from: b */
    public String f18105b;

    @Override // com.google.android.gms.internal.ads.zzgse
    /* JADX INFO: renamed from: a */
    public final zzgse mo7097a(String str) {
        this.f18104a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    /* JADX INFO: renamed from: b */
    public final zzgse mo7098b(String str) {
        this.f18105b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    /* JADX INFO: renamed from: c */
    public final zzgsf mo7099c() {
        return new zzgrd(this.f18104a, this.f18105b);
    }
}
