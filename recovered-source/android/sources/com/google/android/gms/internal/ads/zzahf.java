package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahf implements zzaga {

    /* JADX INFO: renamed from: a */
    public final int f5311a;

    /* JADX INFO: renamed from: b */
    public final int f5312b;

    /* JADX INFO: renamed from: c */
    public final String f5313c;

    /* JADX INFO: renamed from: d */
    public int f5314d;

    /* JADX INFO: renamed from: e */
    public int f5315e;

    /* JADX INFO: renamed from: f */
    public zzagd f5316f;

    /* JADX INFO: renamed from: g */
    public zzahm f5317g;

    public zzahf(int i2, int i3, String str) {
        this.f5311a = i2;
        this.f5312b = i3;
        this.f5313c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        if (j2 == 0 || this.f5315e == 1) {
            this.f5315e = 1;
            this.f5314d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        int i2 = this.f5312b;
        int i3 = this.f5311a;
        zzgtr.m7133f((i3 == -1 || i2 == -1) ? false : true);
        zzeu zzeuVar = new zzeu(i2);
        ((zzafr) zzagbVar).mo4081K(zzeuVar.f14887a, 0, i2, false);
        return zzeuVar.m6370L() == i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5316f = zzagdVar;
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(1024, 4);
        this.f5317g = zzahmVarMo4109f;
        zzt zztVar = new zzt();
        String str = this.f5313c;
        zztVar.m8852d(str);
        zztVar.m8853e(str);
        zzahmVarMo4109f.mo4097e(new zzv(zztVar));
        this.f5316f.mo4110v();
        this.f5316f.mo4108d(new zzahg());
        this.f5315e = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) {
        int i2 = this.f5315e;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzahm zzahmVar = this.f5317g;
        zzahmVar.getClass();
        int iMo4122d = zzahmVar.mo4122d(zzagbVar, 1024, true);
        if (iMo4122d != -1) {
            this.f5314d += iMo4122d;
            return 0;
        }
        this.f5315e = 2;
        this.f5317g.mo4095b(0L, 1, this.f5314d, 0, null);
        this.f5314d = 0;
        return 0;
    }
}
