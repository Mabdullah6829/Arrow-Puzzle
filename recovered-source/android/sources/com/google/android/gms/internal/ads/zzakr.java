package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
final class zzakr implements zzaky {

    /* JADX INFO: renamed from: a */
    public final long[] f5746a;

    /* JADX INFO: renamed from: b */
    public final long[] f5747b;

    /* JADX INFO: renamed from: c */
    public final long f5748c;

    public zzakr(long j2, long[] jArr, long[] jArr2) {
        this.f5746a = jArr;
        this.f5747b = jArr2;
        this.f5748c = j2 == -9223372036854775807L ? zzfm.m6519u(jArr2[jArr2.length - 1]) : j2;
    }

    /* JADX INFO: renamed from: d */
    public static Pair m4183d(long j2, long[] jArr, long[] jArr2) {
        int iM6517s = zzfm.m6517s(jArr, j2, true);
        long j3 = jArr[iM6517s];
        long j4 = jArr2[iM6517s];
        int i2 = iM6517s + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j3), Long.valueOf(j4));
        }
        long j5 = jArr[i2];
        return Pair.create(Long.valueOf(j2), Long.valueOf(((long) ((j5 == j3 ? 0.0d : (j2 - j3) / (j5 - j3)) * (jArr2[i2] - j4))) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        String str = zzfm.f16091a;
        Pair pairM4183d = m4183d(zzfm.m6518t(Math.max(0L, Math.min(j2, this.f5748c))), this.f5747b, this.f5746a);
        zzahe zzaheVar = new zzahe(zzfm.m6519u(((Long) pairM4183d.first).longValue()), ((Long) pairM4183d.second).longValue());
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: b */
    public final long mo4181b(long j2) {
        return zzfm.m6519u(((Long) m4183d(j2, this.f5746a, this.f5747b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    /* JADX INFO: renamed from: c */
    public final long mo4182c() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5748c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return -2147483647;
    }
}
