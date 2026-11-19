package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaii implements zzaga {

    /* JADX INFO: renamed from: a */
    public final byte[] f5414a;

    /* JADX INFO: renamed from: b */
    public final zzeu f5415b;

    /* JADX INFO: renamed from: c */
    public final zzagh f5416c;

    /* JADX INFO: renamed from: d */
    public zzagd f5417d;

    /* JADX INFO: renamed from: e */
    public zzahm f5418e;

    /* JADX INFO: renamed from: f */
    public int f5419f;

    /* JADX INFO: renamed from: g */
    public zzap f5420g;

    /* JADX INFO: renamed from: h */
    public zzagn f5421h;

    /* JADX INFO: renamed from: i */
    public int f5422i;

    /* JADX INFO: renamed from: j */
    public int f5423j;

    /* JADX INFO: renamed from: k */
    public zzaig f5424k;

    /* JADX INFO: renamed from: l */
    public int f5425l;

    /* JADX INFO: renamed from: m */
    public long f5426m;

    public zzaii() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        if (j2 == 0) {
            this.f5419f = 0;
        } else {
            zzaig zzaigVar = this.f5424k;
            if (zzaigVar != null) {
                zzaigVar.m4069a(j3);
            }
        }
        this.f5426m = j3 != 0 ? -1L : 0L;
        this.f5425l = 0;
        this.f5415b.m6396y(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        zzap zzapVarM4126a = new zzagv().m4126a(zzagbVar, zzajr.f5553a, 0);
        if (zzapVarM4126a != null) {
            int length = zzapVarM4126a.f6355a.length;
        }
        zzeu zzeuVar = new zzeu(4);
        ((zzafr) zzagbVar).mo4081K(zzeuVar.f14887a, 0, 4, false);
        return zzeuVar.m6374P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5417d = zzagdVar;
        this.f5418e = zzagdVar.mo4109f(0, 1);
        zzagdVar.mo4110v();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        zzahd zzahcVar;
        long j2;
        boolean z;
        long j3;
        boolean zM4113a;
        int i2 = this.f5419f;
        zzap zzapVar = null;
        int i3 = 0;
        if (i2 == 0) {
            zzagbVar.zzl();
            long jMo4084e = zzagbVar.mo4084e();
            zzap zzapVarM4126a = new zzagv().m4126a(zzagbVar, null, 0);
            if (zzapVarM4126a != null && zzapVarM4126a.f6355a.length != 0) {
                zzapVar = zzapVarM4126a;
            }
            zzagbVar.mo4091o((int) (zzagbVar.mo4084e() - jMo4084e));
            this.f5420g = zzapVar;
            this.f5419f = 1;
            return 0;
        }
        byte[] bArr = this.f5414a;
        if (i2 == 1) {
            zzagbVar.mo4078H(bArr, 0, 42);
            zzagbVar.zzl();
            this.f5419f = 2;
            return 0;
        }
        int i4 = 3;
        int i5 = 4;
        if (i2 == 2) {
            zzeu zzeuVar = new zzeu(4);
            zzagbVar.mo4076F(zzeuVar.f14887a, 0, 4);
            if (zzeuVar.m6374P() != 1716281667) {
                throw zzat.m4383a(null, "Failed to read FLAC stream marker.");
            }
            this.f5419f = 3;
            return 0;
        }
        int i6 = 7;
        if (i2 != 3) {
            if (i2 == 4) {
                zzagbVar.zzl();
                zzeu zzeuVar2 = new zzeu(2);
                zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 2);
                int iM6370L = zzeuVar2.m6370L();
                if ((iM6370L >> 2) != 16382) {
                    zzagbVar.zzl();
                    throw zzat.m4383a(null, "First frame does not start with sync code.");
                }
                zzagbVar.zzl();
                this.f5423j = iM6370L;
                zzagd zzagdVar = this.f5417d;
                String str = zzfm.f16091a;
                long jMo4086g = zzagbVar.mo4086g();
                long jMo4089j = zzagbVar.mo4089j();
                final zzagn zzagnVar = this.f5421h;
                zzagnVar.getClass();
                zzagm zzagmVar = zzagnVar.f5260k;
                if (zzagmVar != null && zzagmVar.f5248a.length > 0) {
                    zzahcVar = new zzagl(zzagnVar, jMo4086g);
                    i3 = 0;
                } else if (jMo4089j == -1 || zzagnVar.f5259j <= 0) {
                    i3 = 0;
                    zzahcVar = new zzahc(zzagnVar.m4119a(), 0L);
                } else {
                    int i7 = this.f5423j;
                    int i8 = zzagnVar.f5252c;
                    zzafj zzafjVar = new zzafj() { // from class: com.google.android.gms.internal.ads.zzaie
                        @Override // com.google.android.gms.internal.ads.zzafj
                        /* JADX INFO: renamed from: e */
                        public final long mo4065e(long j4) {
                            zzagn zzagnVar2 = zzagnVar;
                            zzagnVar2.getClass();
                            String str2 = zzfm.f16091a;
                            return Math.max(0L, Math.min((j4 * ((long) zzagnVar2.f5254e)) / 1000000, zzagnVar2.f5259j - 1));
                        }
                    };
                    zzaif zzaifVar = new zzaif(zzagnVar, i7);
                    long jM4119a = zzagnVar.m4119a();
                    long j4 = zzagnVar.f5259j;
                    int i9 = zzagnVar.f5253d;
                    if (i9 > 0) {
                        j2 = ((((long) i9) + ((long) i8)) / 2) + 1;
                    } else {
                        int i10 = zzagnVar.f5250a;
                        long j5 = 4096;
                        if (i10 == zzagnVar.f5251b && i10 > 0) {
                            j5 = i10;
                        }
                        j2 = (((((long) zzagnVar.f5256g) * j5) * ((long) zzagnVar.f5257h)) / 8) + 64;
                    }
                    zzaig zzaigVar = new zzaig(zzafjVar, zzaifVar, jM4119a, j4, jMo4086g, jMo4089j, j2, Math.max(6, i8));
                    this.f5424k = zzaigVar;
                    zzahcVar = zzaigVar.f5193a;
                }
                zzagdVar.mo4108d(zzahcVar);
                this.f5419f = 5;
                return i3;
            }
            this.f5418e.getClass();
            zzagn zzagnVar2 = this.f5421h;
            zzagnVar2.getClass();
            zzaig zzaigVar2 = this.f5424k;
            if (zzaigVar2 != null && zzaigVar2.f5195c != null) {
                return zzaigVar2.m4070b(zzagbVar, zzahaVar);
            }
            if (this.f5426m == -1) {
                zzagbVar.zzl();
                zzagbVar.mo4075E(1);
                byte[] bArr2 = new byte[1];
                zzagbVar.mo4078H(bArr2, 0, 1);
                int i11 = bArr2[0] & 1;
                boolean z2 = 1 == i11;
                zzagbVar.mo4075E(2);
                i6 = 1 != i11 ? 6 : 7;
                zzeu zzeuVar3 = new zzeu(i6);
                byte[] bArr3 = zzeuVar3.f14887a;
                int i12 = 0;
                while (i12 < i6) {
                    int iMo4080J = zzagbVar.mo4080J(bArr3, i12, i6 - i12);
                    if (iMo4080J == -1) {
                        break;
                    }
                    i12 += iMo4080J;
                }
                zzeuVar3.m6361C(i12);
                zzagbVar.zzl();
                zzagh zzaghVar = new zzagh();
                if (!zzagi.m4115c(zzeuVar3, zzagnVar2, z2, zzaghVar)) {
                    throw zzat.m4383a(null, null);
                }
                this.f5426m = zzaghVar.f5244a;
                return 0;
            }
            zzeu zzeuVar4 = this.f5415b;
            int i13 = zzeuVar4.f14889c;
            if (i13 < 32768) {
                int iMo4082b = zzagbVar.mo4082b(zzeuVar4.f14887a, i13, 32768 - i13);
                z = iMo4082b == -1;
                if (!z) {
                    zzeuVar4.m6361C(i13 + iMo4082b);
                } else if (zzeuVar4.m6360B() == 0) {
                    long j6 = this.f5426m * 1000000;
                    zzagn zzagnVar3 = this.f5421h;
                    String str2 = zzfm.f16091a;
                    this.f5418e.mo4095b(j6 / ((long) zzagnVar3.f5254e), 1, this.f5425l, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i14 = zzeuVar4.f14888b;
            int i15 = this.f5425l;
            int i16 = this.f5422i;
            if (i15 < i16) {
                zzeuVar4.m6365G(Math.min(i16 - i15, zzeuVar4.m6360B()));
            }
            this.f5421h.getClass();
            int i17 = zzeuVar4.f14888b;
            while (true) {
                int i18 = zzeuVar4.f14889c - 16;
                zzagh zzaghVar2 = this.f5416c;
                if (i17 > i18) {
                    if (z) {
                        while (true) {
                            int i19 = zzeuVar4.f14889c;
                            if (i17 <= i19 - this.f5422i) {
                                zzeuVar4.m6363E(i17);
                                try {
                                    zM4113a = zzagi.m4113a(zzeuVar4, this.f5421h, this.f5423j, zzaghVar2);
                                } catch (IndexOutOfBoundsException unused) {
                                    zM4113a = false;
                                }
                                if (zzeuVar4.f14888b <= zzeuVar4.f14889c && zM4113a) {
                                    zzeuVar4.m6363E(i17);
                                    j3 = zzaghVar2.f5244a;
                                    break;
                                }
                                i17++;
                            } else {
                                zzeuVar4.m6363E(i19);
                            }
                        }
                    } else {
                        zzeuVar4.m6363E(i17);
                    }
                    j3 = -1;
                    break;
                }
                zzeuVar4.m6363E(i17);
                if (zzagi.m4113a(zzeuVar4, this.f5421h, this.f5423j, zzaghVar2)) {
                    zzeuVar4.m6363E(i17);
                    j3 = zzaghVar2.f5244a;
                    break;
                }
                i17++;
            }
            int i20 = zzeuVar4.f14888b - i14;
            zzeuVar4.m6363E(i14);
            this.f5418e.mo4121a(i20, zzeuVar4);
            int i21 = this.f5425l + i20;
            this.f5425l = i21;
            if (j3 != -1) {
                long j7 = this.f5426m * 1000000;
                zzagn zzagnVar4 = this.f5421h;
                String str3 = zzfm.f16091a;
                this.f5418e.mo4095b(j7 / ((long) zzagnVar4.f5254e), 1, i21, 0, null);
                this.f5425l = 0;
                this.f5426m = j3;
            }
            int length = zzeuVar4.f14887a.length - zzeuVar4.f14889c;
            if (zzeuVar4.m6360B() < 16 && length < 16) {
                int iM6360B = zzeuVar4.m6360B();
                byte[] bArr4 = zzeuVar4.f14887a;
                System.arraycopy(bArr4, zzeuVar4.f14888b, bArr4, 0, iM6360B);
                zzeuVar4.m6363E(0);
                zzeuVar4.m6361C(iM6360B);
            }
            return 0;
        }
        int i22 = 0;
        zzagn zzagnVar5 = this.f5421h;
        zzagj zzagjVar = new zzagj();
        zzagjVar.f5245a = zzagnVar5;
        while (true) {
            zzagbVar.zzl();
            byte[] bArr5 = new byte[i5];
            zzet zzetVar = new zzet(bArr5, i5);
            int i23 = i22;
            zzagbVar.mo4078H(bArr5, i23, i5);
            boolean zM6344g = zzetVar.m6344g();
            int iM6345h = zzetVar.m6345h(i6);
            int iM6345h2 = zzetVar.m6345h(24) + i5;
            if (iM6345h == 0) {
                byte[] bArr6 = new byte[38];
                zzagbVar.mo4076F(bArr6, i23, 38);
                zzagjVar.f5245a = new zzagn(bArr6, i5);
            } else {
                zzagn zzagnVar6 = zzagjVar.f5245a;
                if (zzagnVar6 == null) {
                    throw new IllegalArgumentException();
                }
                zzap zzapVar2 = zzagnVar6.f5261l;
                if (iM6345h == i4) {
                    zzeu zzeuVar5 = new zzeu(iM6345h2);
                    zzagbVar.mo4076F(zzeuVar5.f14887a, 0, iM6345h2);
                    zzagjVar.f5245a = new zzagn(zzagnVar6.f5250a, zzagnVar6.f5251b, zzagnVar6.f5252c, zzagnVar6.f5253d, zzagnVar6.f5254e, zzagnVar6.f5256g, zzagnVar6.f5257h, zzagnVar6.f5259j, zzagk.m4116a(zzeuVar5), zzagnVar6.f5261l);
                } else {
                    int i24 = i5;
                    if (iM6345h == i24) {
                        zzeu zzeuVar6 = new zzeu(iM6345h2);
                        zzagbVar.mo4076F(zzeuVar6.f14887a, 0, iM6345h2);
                        zzeuVar6.m6365G(i24);
                        zzap zzapVarM4132a = zzaho.m4132a(Arrays.asList(zzhg.m7443b(zzeuVar6, false, false).f18534a));
                        if (zzapVar2 != null) {
                            zzapVarM4132a = zzapVar2.m4288c(zzapVarM4132a);
                        }
                        zzagjVar.f5245a = new zzagn(zzagnVar6.f5250a, zzagnVar6.f5251b, zzagnVar6.f5252c, zzagnVar6.f5253d, zzagnVar6.f5254e, zzagnVar6.f5256g, zzagnVar6.f5257h, zzagnVar6.f5259j, zzagnVar6.f5260k, zzapVarM4132a);
                    } else if (iM6345h == 6) {
                        zzeu zzeuVar7 = new zzeu(iM6345h2);
                        zzagbVar.mo4076F(zzeuVar7.f14887a, 0, iM6345h2);
                        zzeuVar7.m6365G(4);
                        zzap zzapVar3 = new zzap(zzgwt.m7216n(zzajg.m4148b(zzeuVar7)));
                        if (zzapVar2 != null) {
                            zzapVar3 = zzapVar2.m4288c(zzapVar3);
                        }
                        zzagjVar.f5245a = new zzagn(zzagnVar6.f5250a, zzagnVar6.f5251b, zzagnVar6.f5252c, zzagnVar6.f5253d, zzagnVar6.f5254e, zzagnVar6.f5256g, zzagnVar6.f5257h, zzagnVar6.f5259j, zzagnVar6.f5260k, zzapVar3);
                    } else {
                        zzagbVar.mo4091o(iM6345h2);
                    }
                }
            }
            zzagn zzagnVar7 = zzagjVar.f5245a;
            String str4 = zzfm.f16091a;
            this.f5421h = zzagnVar7;
            if (zM6344g) {
                zzagnVar7.getClass();
                this.f5422i = Math.max(zzagnVar7.f5252c, 6);
                zzv zzvVarM4120b = this.f5421h.m4120b(bArr, this.f5420g);
                zzahm zzahmVar = this.f5418e;
                zzt zztVar = new zzt(zzvVarM4120b);
                zztVar.m8852d("audio/flac");
                zzahmVar.mo4097e(new zzv(zztVar));
                zzahm zzahmVar2 = this.f5418e;
                this.f5421h.m4119a();
                zzahmVar2.getClass();
                this.f5419f = 4;
                return 0;
            }
            i4 = 3;
            i5 = 4;
            i6 = 7;
            i22 = 0;
        }
    }

    public zzaii(int i2) {
        this.f5414a = new byte[42];
        this.f5415b = new zzeu(new byte[32768], 0);
        this.f5416c = new zzagh();
        this.f5419f = 0;
    }
}
