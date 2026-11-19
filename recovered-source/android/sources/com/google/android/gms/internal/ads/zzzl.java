package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzzl implements zzxj, zzxi {

    /* JADX INFO: renamed from: s */
    public final zzxj f21485s;

    /* JADX INFO: renamed from: t */
    public final long f21486t;

    /* JADX INFO: renamed from: u */
    public Object f21487u;

    public zzzl(zzxj zzxjVar, long j2) {
        this.f21485s = zzxjVar;
        this.f21486t = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9004a() {
        return this.f21485s.mo9004a();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: b */
    public final void mo9005b(long j2) {
        this.f21485s.mo9005b(j2 - this.f21486t);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzze
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8668c(zzzf zzzfVar) {
        ?? r1 = this.f21487u;
        r1.getClass();
        r1.mo8668c(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzxi, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzxi
    /* JADX INFO: renamed from: d */
    public final void mo8669d(zzxj zzxjVar) {
        ?? r1 = this.f21487u;
        r1.getClass();
        r1.mo8669d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: e */
    public final void mo9007e() {
        this.f21485s.mo9007e();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: g */
    public final zzzo mo9009g() {
        return this.f21485s.mo9009g();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: h */
    public final long mo9010h(long j2, zznk zznkVar) {
        zzxj zzxjVar = this.f21485s;
        long j3 = this.f21486t;
        return zzxjVar.mo9010h(j2 - j3, zznkVar) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: i */
    public final boolean mo9006i(zzmc zzmcVar) {
        long j2 = zzmcVar.f20363a;
        zzmb zzmbVar = new zzmb();
        zzmbVar.f20361b = zzmcVar.f20364b;
        zzmbVar.f20362c = zzmcVar.f20365c;
        zzmbVar.f20360a = j2 - this.f21486t;
        return this.f21485s.mo9006i(new zzmc(zzmbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: j */
    public final void mo9011j(zzxi zzxiVar, long j2) {
        this.f21487u = zzxiVar;
        this.f21485s.mo9011j(this, j2 - this.f21486t);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: k */
    public final long mo9012k(long j2) {
        zzxj zzxjVar = this.f21485s;
        long j3 = this.f21486t;
        return zzxjVar.mo9012k(j2 - j3) + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: l */
    public final long mo9013l(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j2) {
        zzzd[] zzzdVarArr2 = new zzzd[zzzdVarArr.length];
        int i2 = 0;
        while (true) {
            zzzd zzzdVar = null;
            if (i2 >= zzzdVarArr.length) {
                break;
            }
            zzzk zzzkVar = (zzzk) zzzdVarArr[i2];
            if (zzzkVar != null) {
                zzzdVar = zzzkVar.f21483a;
            }
            zzzdVarArr2[i2] = zzzdVar;
            i2++;
        }
        long j3 = this.f21486t;
        long jMo9013l = this.f21485s.mo9013l(zzabbVarArr, zArr, zzzdVarArr2, zArr2, j2 - j3);
        for (int i3 = 0; i3 < zzzdVarArr.length; i3++) {
            zzzd zzzdVar2 = zzzdVarArr2[i3];
            if (zzzdVar2 == null) {
                zzzdVarArr[i3] = null;
            } else {
                zzzd zzzdVar3 = zzzdVarArr[i3];
                if (zzzdVar3 == null || ((zzzk) zzzdVar3).f21483a != zzzdVar2) {
                    zzzdVarArr[i3] = new zzzk(zzzdVar2, j3);
                }
            }
        }
        return jMo9013l + j3;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: m */
    public final void mo9014m(long j2) {
        this.f21485s.mo9014m(j2 - this.f21486t);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: n */
    public final long mo9015n() {
        long jMo9015n = this.f21485s.mo9015n();
        if (jMo9015n == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo9015n + this.f21486t;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jZzb = this.f21485s.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f21486t;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        long jZzc = this.f21485s.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f21486t;
    }
}
