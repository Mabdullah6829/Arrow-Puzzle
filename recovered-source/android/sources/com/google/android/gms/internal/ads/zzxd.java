package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxd implements zzxj, zzxi {

    /* JADX INFO: renamed from: s */
    public final zzxl f21255s;

    /* JADX INFO: renamed from: t */
    public final long f21256t;

    /* JADX INFO: renamed from: u */
    public final zzabm f21257u;

    /* JADX INFO: renamed from: v */
    public zzxn f21258v;

    /* JADX INFO: renamed from: w */
    public zzxj f21259w;

    /* JADX INFO: renamed from: x */
    public zzxi f21260x;

    /* JADX INFO: renamed from: y */
    public long f21261y = -9223372036854775807L;

    public zzxd(zzxl zzxlVar, zzabm zzabmVar, long j2) {
        this.f21255s = zzxlVar;
        this.f21257u = zzabmVar;
        this.f21256t = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9004a() {
        zzxj zzxjVar = this.f21259w;
        return zzxjVar != null && zzxjVar.mo9004a();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: b */
    public final void mo9005b(long j2) {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        zzxjVar.mo9005b(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8668c(zzzf zzzfVar) {
        zzxi zzxiVar = this.f21260x;
        String str = zzfm.f16091a;
        zzxiVar.mo8668c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    /* JADX INFO: renamed from: d */
    public final void mo8669d(zzxj zzxjVar) {
        zzxi zzxiVar = this.f21260x;
        String str = zzfm.f16091a;
        zzxiVar.mo8669d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: e */
    public final void mo9007e() {
        zzxj zzxjVar = this.f21259w;
        if (zzxjVar != null) {
            zzxjVar.mo9007e();
            return;
        }
        zzxn zzxnVar = this.f21258v;
        if (zzxnVar != null) {
            zzxnVar.mo9003k();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9008f(zzxl zzxlVar) {
        long j2 = this.f21261y;
        if (j2 == -9223372036854775807L) {
            j2 = this.f21256t;
        }
        zzxn zzxnVar = this.f21258v;
        zzxnVar.getClass();
        zzxj zzxjVarMo9022y = zzxnVar.mo9022y(zzxlVar, this.f21257u, j2);
        this.f21259w = zzxjVarMo9022y;
        if (this.f21260x != null) {
            zzxjVarMo9022y.mo9011j(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: g */
    public final zzzo mo9009g() {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.mo9009g();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: h */
    public final long mo9010h(long j2, zznk zznkVar) {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.mo9010h(j2, zznkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: i */
    public final boolean mo9006i(zzmc zzmcVar) {
        zzxj zzxjVar = this.f21259w;
        return zzxjVar != null && zzxjVar.mo9006i(zzmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: j */
    public final void mo9011j(zzxi zzxiVar, long j2) {
        this.f21260x = zzxiVar;
        zzxj zzxjVar = this.f21259w;
        if (zzxjVar != null) {
            long j3 = this.f21261y;
            if (j3 == -9223372036854775807L) {
                j3 = this.f21256t;
            }
            zzxjVar.mo9011j(this, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: k */
    public final long mo9012k(long j2) {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.mo9012k(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: l */
    public final long mo9013l(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j2) {
        long j3 = this.f21261y;
        long j4 = (j3 == -9223372036854775807L || j2 != this.f21256t) ? j2 : j3;
        this.f21261y = -9223372036854775807L;
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.mo9013l(zzabbVarArr, zArr, zzzdVarArr, zArr2, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: m */
    public final void mo9014m(long j2) {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        zzxjVar.mo9014m(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: n */
    public final long mo9015n() {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.mo9015n();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        zzxj zzxjVar = this.f21259w;
        String str = zzfm.f16091a;
        return zzxjVar.zzc();
    }
}
