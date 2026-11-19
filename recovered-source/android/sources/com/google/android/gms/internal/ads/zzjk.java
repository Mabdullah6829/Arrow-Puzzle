package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzjk implements zzmd {

    /* JADX INFO: renamed from: s */
    public final zznn f20128s;

    /* JADX INFO: renamed from: t */
    public final zzjj f20129t;

    /* JADX INFO: renamed from: u */
    public zznc f20130u;

    /* JADX INFO: renamed from: v */
    public zzmd f20131v;

    /* JADX INFO: renamed from: w */
    public boolean f20132w;

    /* JADX INFO: renamed from: x */
    public boolean f20133x;

    public zzjk(zzjj zzjjVar) {
        this.f20129t = zzjjVar;
        zznn zznnVar = new zznn();
        zznnVar.f20513v = zzav.f6969d;
        this.f20128s = zznnVar;
        this.f20132w = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m8617a(zznc zzncVar) throws zzjm {
        zzmd zzmdVar;
        zzmd zzmdVarMo8591d = zzncVar.mo8591d();
        if (zzmdVarMo8591d == null || zzmdVarMo8591d == (zzmdVar = this.f20131v)) {
            return;
        }
        if (zzmdVar != null) {
            throw new zzjm(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f20131v = zzmdVarMo8591d;
        this.f20130u = zzncVar;
        ((zzua) zzmdVarMo8591d).mo8619i(this.f20128s.f20513v);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: c */
    public final long mo8618c() {
        if (this.f20132w) {
            return this.f20128s.mo8618c();
        }
        zzmd zzmdVar = this.f20131v;
        zzmdVar.getClass();
        return zzmdVar.mo8618c();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    /* JADX INFO: renamed from: i */
    public final void mo8619i(zzav zzavVar) {
        zzmd zzmdVar = this.f20131v;
        if (zzmdVar != null) {
            zzmdVar.mo8619i(zzavVar);
            zzavVar = this.f20131v.zzj();
        }
        this.f20128s.mo8619i(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final boolean zzh() {
        if (this.f20132w) {
            return false;
        }
        zzmd zzmdVar = this.f20131v;
        zzmdVar.getClass();
        return zzmdVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final zzav zzj() {
        zzmd zzmdVar = this.f20131v;
        return zzmdVar != null ? zzmdVar.zzj() : this.f20128s.f20513v;
    }
}
