package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzamu implements zzahd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzamv f6044a;

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzamv zzamvVar = this.f6044a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) zzamvVar.f6048d.f6120i) * j2) / 1000000);
        long j3 = zzamvVar.f6047c;
        long j4 = zzamvVar.f6046b;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j3 - j4)).divide(BigInteger.valueOf(zzamvVar.f6050f)).longValue() + j4;
        String str = zzfm.f16091a;
        zzahe zzaheVar = new zzahe(j2, Math.max(j4, Math.min(jLongValue - 30000, j3 - 1)));
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        zzamv zzamvVar = this.f6044a;
        zzang zzangVar = zzamvVar.f6048d;
        return (zzamvVar.f6050f * 1000000) / ((long) zzangVar.f6120i);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
