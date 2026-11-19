package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapt implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzet f6433a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6434b;

    /* JADX INFO: renamed from: c */
    public final String f6435c;

    /* JADX INFO: renamed from: d */
    public final int f6436d;

    /* JADX INFO: renamed from: e */
    public final String f6437e;

    /* JADX INFO: renamed from: f */
    public String f6438f;

    /* JADX INFO: renamed from: g */
    public zzahm f6439g;

    /* JADX INFO: renamed from: h */
    public int f6440h;

    /* JADX INFO: renamed from: i */
    public int f6441i;

    /* JADX INFO: renamed from: j */
    public boolean f6442j;

    /* JADX INFO: renamed from: k */
    public long f6443k;

    /* JADX INFO: renamed from: l */
    public zzv f6444l;

    /* JADX INFO: renamed from: m */
    public int f6445m;

    /* JADX INFO: renamed from: n */
    public long f6446n;

    public zzapt(String str, int i2, String str2) {
        zzet zzetVar = new zzet(new byte[16], 16);
        this.f6433a = zzetVar;
        this.f6434b = new zzeu(zzetVar.f14823a);
        this.f6440h = 0;
        this.f6441i = 0;
        this.f6442j = false;
        this.f6446n = -9223372036854775807L;
        this.f6435c = str;
        this.f6436d = i2;
        this.f6437e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        boolean z;
        this.f6439g.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i2 = this.f6440h;
            zzeu zzeuVar2 = this.f6434b;
            if (i2 == 0) {
                while (true) {
                    if (zzeuVar.m6360B() > 0) {
                        if (this.f6442j) {
                            int iM6369K = zzeuVar.m6369K();
                            this.f6442j = iM6369K == 172;
                            if (iM6369K == 64) {
                                if (iM6369K != 65) {
                                    z = false;
                                }
                                this.f6440h = 1;
                                byte[] bArr = zzeuVar2.f14887a;
                                bArr[0] = -84;
                                bArr[1] = true == z ? (byte) 65 : (byte) 64;
                                this.f6441i = 2;
                            } else if (iM6369K == 65) {
                            }
                            z = true;
                            this.f6440h = 1;
                            byte[] bArr2 = zzeuVar2.f14887a;
                            bArr2[0] = -84;
                            bArr2[1] = true == z ? (byte) 65 : (byte) 64;
                            this.f6441i = 2;
                        } else {
                            this.f6442j = zzeuVar.m6369K() == 172;
                        }
                    }
                }
            } else if (i2 != 1) {
                int iMin = Math.min(zzeuVar.m6360B(), this.f6445m - this.f6441i);
                this.f6439g.mo4121a(iMin, zzeuVar);
                int i3 = this.f6441i + iMin;
                this.f6441i = i3;
                if (i3 == this.f6445m) {
                    zzgtr.m7133f(this.f6446n != -9223372036854775807L);
                    this.f6439g.mo4095b(this.f6446n, 1, this.f6445m, 0, null);
                    this.f6446n += this.f6443k;
                    this.f6440h = 0;
                }
            } else {
                byte[] bArr3 = zzeuVar2.f14887a;
                int iMin2 = Math.min(zzeuVar.m6360B(), 16 - this.f6441i);
                zzeuVar.m6366H(bArr3, this.f6441i, iMin2);
                int i4 = this.f6441i + iMin2;
                this.f6441i = i4;
                if (i4 == 16) {
                    zzet zzetVar = this.f6433a;
                    zzetVar.m6341d(0);
                    zzafc zzafcVarM4057a = zzafd.m4057a(zzetVar);
                    int i5 = zzafcVarM4057a.f5154a;
                    zzv zzvVar = this.f6444l;
                    if (zzvVar == null || zzvVar.f21037G != 2 || i5 != zzvVar.f21039I || !"audio/ac4".equals(zzvVar.f21061o)) {
                        zzt zztVar = new zzt();
                        zztVar.f20789a = this.f6438f;
                        zztVar.m8852d(this.f6437e);
                        zztVar.m8853e("audio/ac4");
                        zztVar.f20780F = 2;
                        zztVar.f20782H = i5;
                        zztVar.f20792d = this.f6435c;
                        zztVar.f20794f = this.f6436d;
                        zzv zzvVar2 = new zzv(zztVar);
                        this.f6444l = zzvVar2;
                        this.f6439g.mo4097e(zzvVar2);
                    }
                    this.f6445m = zzafcVarM4057a.f5155b;
                    this.f6443k = (((long) zzafcVarM4057a.f5156c) * 1000000) / ((long) this.f6444l.f21039I);
                    zzeuVar2.m6363E(0);
                    this.f6439g.mo4121a(16, zzeuVar2);
                    this.f6440h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6446n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6438f = zzaroVar.f6773e;
        zzaroVar.m4340b();
        this.f6439g = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6440h = 0;
        this.f6441i = 0;
        this.f6442j = false;
        this.f6446n = -9223372036854775807L;
    }
}
