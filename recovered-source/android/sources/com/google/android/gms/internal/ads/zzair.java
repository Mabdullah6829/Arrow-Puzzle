package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzair implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzahf f5468a;

    /* JADX INFO: renamed from: b */
    public final zzaga f5469b;

    /* JADX INFO: renamed from: c */
    public zzagd f5470c;

    /* JADX INFO: renamed from: d */
    public zzaga f5471d;

    /* JADX INFO: renamed from: e */
    public Pair f5472e;

    public zzair() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
        ((zzaiq) this.f5469b).mo4103b();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        zzaga zzagaVar = this.f5471d;
        if (zzagaVar != null) {
            zzagaVar.mo4104g(j2, j3);
        } else {
            this.f5472e = Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        if (zzais.m4145a(zzagbVar, true)) {
            return true;
        }
        ((zzafr) zzagbVar).f5216f = 0;
        return zzais.m4145a(zzagbVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5470c = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        if (this.f5471d == null) {
            zzaga zzagaVar = this.f5469b;
            ((zzaiq) zzagaVar).getClass();
            if (!zzais.m4145a(zzagbVar, true)) {
                zzagaVar = this.f5468a;
            }
            this.f5471d = zzagaVar;
            zzagbVar.zzl();
            Pair pair = this.f5472e;
            if (pair != null) {
                this.f5471d.mo4104g(((Long) pair.first).longValue(), ((Long) this.f5472e.second).longValue());
                this.f5472e = null;
            }
            zzaga zzagaVar2 = this.f5471d;
            zzagd zzagdVar = this.f5470c;
            zzagdVar.getClass();
            zzagaVar2.mo4106i(zzagdVar);
        }
        return this.f5471d.mo4107j(zzagbVar, zzahaVar);
    }

    public zzair(int i2) {
        this.f5468a = new zzahf(-1, -1, "image/heif");
        this.f5469b = new zzaiq();
    }
}
