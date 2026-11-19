package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgeu implements zzgeo {

    /* JADX INFO: renamed from: a */
    public final int f17111a;

    /* JADX INFO: renamed from: b */
    public final byte[] f17112b;

    public zzgeu(int i2, byte[] bArr) {
        this.f17111a = i2;
        this.f17112b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final int zza() {
        return this.f17111a;
    }

    @Override // com.google.android.gms.internal.ads.zzgeo
    public final String zzb() {
        return new String(this.f17112b);
    }
}
