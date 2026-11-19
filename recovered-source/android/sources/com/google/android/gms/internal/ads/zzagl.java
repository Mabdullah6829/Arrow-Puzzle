package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagl implements zzahd {

    /* JADX INFO: renamed from: a */
    public final zzagn f5246a;

    /* JADX INFO: renamed from: b */
    public final long f5247b;

    public zzagl(zzagn zzagnVar, long j2) {
        this.f5246a = zzagnVar;
        this.f5247b = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzagn zzagnVar = this.f5246a;
        zzagm zzagmVar = zzagnVar.f5260k;
        zzagmVar.getClass();
        String str = zzfm.f16091a;
        long jMax = Math.max(0L, Math.min((((long) zzagnVar.f5254e) * j2) / 1000000, zzagnVar.f5259j - 1));
        long[] jArr = zzagmVar.f5248a;
        int iM6517s = zzfm.m6517s(jArr, jMax, false);
        long j3 = iM6517s == -1 ? 0L : jArr[iM6517s];
        long[] jArr2 = zzagmVar.f5249b;
        long j4 = iM6517s != -1 ? jArr2[iM6517s] : 0L;
        int i2 = zzagnVar.f5254e;
        long j5 = (j3 * 1000000) / ((long) i2);
        long j6 = this.f5247b;
        zzahe zzaheVar = new zzahe(j5, j4 + j6);
        if (j5 == j2 || iM6517s == jArr.length - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i3 = iM6517s + 1;
        return new zzahb(zzaheVar, new zzahe((jArr[i3] * 1000000) / ((long) i2), j6 + jArr2[i3]));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5246a.m4119a();
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
