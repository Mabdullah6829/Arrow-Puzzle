package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaiq implements zzaga {

    /* JADX INFO: renamed from: b */
    public zzagd f5459b;

    /* JADX INFO: renamed from: c */
    public zzagb f5460c;

    /* JADX INFO: renamed from: d */
    public zzahi f5461d;

    /* JADX INFO: renamed from: e */
    public zzami f5462e;

    /* JADX INFO: renamed from: g */
    public int f5464g;

    /* JADX INFO: renamed from: h */
    public long f5465h;

    /* JADX INFO: renamed from: i */
    public int f5466i;

    /* JADX INFO: renamed from: a */
    public final zzeu f5458a = new zzeu(16);

    /* JADX INFO: renamed from: j */
    public long f5467j = -1;

    /* JADX INFO: renamed from: f */
    public int f5463f = 0;

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
        if (this.f5462e != null) {
            this.f5462e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        if (j2 != 0) {
            if (this.f5463f == 3) {
                zzami zzamiVar = this.f5462e;
                zzamiVar.getClass();
                zzamiVar.mo4104g(j2, j3);
                return;
            }
            return;
        }
        this.f5463f = 0;
        this.f5466i = 0;
        this.f5467j = -1L;
        if (this.f5462e != null) {
            this.f5462e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        return zzais.m4145a(zzagbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5459b = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        while (true) {
            int i2 = this.f5463f;
            if (i2 == 0) {
                int i3 = this.f5466i;
                zzeu zzeuVar = this.f5458a;
                if (i3 == 0) {
                    if (!zzagbVar.mo4079I(zzeuVar.f14887a, 0, 8, true)) {
                        zzagd zzagdVar = this.f5459b;
                        zzagdVar.getClass();
                        zzagdVar.mo4110v();
                        this.f5459b.mo4108d(new zzahc(-9223372036854775807L, 0L));
                        this.f5463f = 4;
                        return -1;
                    }
                    this.f5466i = 8;
                    zzeuVar.m6363E(0);
                    this.f5465h = zzeuVar.m6374P();
                    this.f5464g = zzeuVar.m6376b();
                }
                long jM6384j = this.f5465h;
                if (jM6384j == 1) {
                    zzagbVar.mo4076F(zzeuVar.f14887a, 8, 8);
                    this.f5466i += 8;
                    jM6384j = zzeuVar.m6384j();
                    this.f5465h = jM6384j;
                }
                if (this.f5464g == 1836086884) {
                    long jMo4086g = zzagbVar.mo4086g();
                    this.f5467j = jMo4086g;
                    long j2 = this.f5466i;
                    zzajb zzajbVar = new zzajb(0L, jMo4086g - j2, -9223372036854775807L, jMo4086g, jM6384j - j2);
                    zzagd zzagdVar2 = this.f5459b;
                    zzagdVar2.getClass();
                    zzahm zzahmVarMo4109f = zzagdVar2.mo4109f(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.m8852d("image/heic");
                    zztVar.f20799k = new zzap(zzajbVar);
                    zzahmVarMo4109f.mo4097e(new zzv(zztVar));
                    this.f5463f = 2;
                } else {
                    this.f5463f = 1;
                }
            } else if (i2 == 1) {
                zzagbVar.mo4091o((int) (this.f5465h - ((long) this.f5466i)));
                this.f5466i = 0;
                this.f5463f = 0;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return -1;
                    }
                    if (this.f5461d == null || zzagbVar != this.f5460c) {
                        this.f5460c = zzagbVar;
                        this.f5461d = new zzahi(zzagbVar, this.f5467j);
                    }
                    zzami zzamiVar = this.f5462e;
                    zzamiVar.getClass();
                    int iMo4107j = zzamiVar.mo4107j(this.f5461d, zzahaVar);
                    if (iMo4107j == 1) {
                        zzahaVar.f5303a += this.f5467j;
                    }
                    return iMo4107j;
                }
                if (this.f5462e == null) {
                    this.f5462e = new zzami(8, zzanq.f6138a);
                }
                zzahi zzahiVar = new zzahi(zzagbVar, this.f5467j);
                this.f5461d = zzahiVar;
                if (this.f5462e.mo4105h(zzahiVar)) {
                    zzami zzamiVar2 = this.f5462e;
                    long j3 = this.f5467j;
                    zzagd zzagdVar3 = this.f5459b;
                    zzagdVar3.getClass();
                    zzamiVar2.mo4106i(new zzahk(j3, zzagdVar3));
                    this.f5463f = 3;
                } else {
                    zzagd zzagdVar4 = this.f5459b;
                    zzagdVar4.getClass();
                    zzagdVar4.mo4110v();
                    this.f5459b.mo4108d(new zzahc(-9223372036854775807L, 0L));
                    this.f5463f = 4;
                }
            }
        }
    }
}
