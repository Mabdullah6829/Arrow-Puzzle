package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzait implements zzaga {

    /* JADX INFO: renamed from: a */
    public final zzahf f5473a;

    /* JADX INFO: renamed from: b */
    public final zzaga f5474b;

    /* JADX INFO: renamed from: c */
    public zzagd f5475c;

    /* JADX INFO: renamed from: d */
    public zzaga f5476d;

    /* JADX INFO: renamed from: e */
    public Pair f5477e;

    public zzait() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        zzaga zzagaVar = this.f5476d;
        if (zzagaVar != null) {
            zzagaVar.mo4104g(j2, j3);
        } else {
            this.f5477e = Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        if (((zzaiu) this.f5474b).mo4105h(zzagbVar)) {
            return true;
        }
        ((zzafr) zzagbVar).f5216f = 0;
        return this.f5473a.mo4105h(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5475c = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        if (this.f5476d == null) {
            zzaga zzagaVar = (zzaiu) this.f5474b;
            if (!zzagaVar.mo4105h(zzagbVar)) {
                zzagaVar = this.f5473a;
            }
            this.f5476d = zzagaVar;
            zzagbVar.zzl();
            Pair pair = this.f5477e;
            if (pair != null) {
                this.f5476d.mo4104g(((Long) pair.first).longValue(), ((Long) this.f5477e.second).longValue());
                this.f5477e = null;
            }
            zzaga zzagaVar2 = this.f5476d;
            zzagd zzagdVar = this.f5475c;
            zzagdVar.getClass();
            zzagaVar2.mo4106i(zzagdVar);
        }
        return this.f5476d.mo4107j(zzagbVar, zzahaVar);
    }

    public zzait(int i2) {
        this.f5473a = new zzahf(65496, 2, "image/jpeg");
        this.f5474b = new zzaiu();
    }
}
