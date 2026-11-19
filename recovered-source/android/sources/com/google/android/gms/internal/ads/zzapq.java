package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapq implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzet f6415a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6416b;

    /* JADX INFO: renamed from: c */
    public final String f6417c;

    /* JADX INFO: renamed from: d */
    public final int f6418d;

    /* JADX INFO: renamed from: e */
    public final String f6419e;

    /* JADX INFO: renamed from: f */
    public String f6420f;

    /* JADX INFO: renamed from: g */
    public zzahm f6421g;

    /* JADX INFO: renamed from: h */
    public int f6422h;

    /* JADX INFO: renamed from: i */
    public int f6423i;

    /* JADX INFO: renamed from: j */
    public boolean f6424j;

    /* JADX INFO: renamed from: k */
    public long f6425k;

    /* JADX INFO: renamed from: l */
    public zzv f6426l;

    /* JADX INFO: renamed from: m */
    public int f6427m;

    /* JADX INFO: renamed from: n */
    public long f6428n;

    public zzapq(String str, int i2, String str2) {
        zzet zzetVar = new zzet(new byte[128], 128);
        this.f6415a = zzetVar;
        this.f6416b = new zzeu(zzetVar.f14823a);
        this.f6422h = 0;
        this.f6428n = -9223372036854775807L;
        this.f6417c = str;
        this.f6418d = i2;
        this.f6419e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0209  */
    /* JADX WARN: Code duplicated, block: B:142:0x024d  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        byte b;
        int iM6345h;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f6421g.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i17 = this.f6422h;
            zzeu zzeuVar2 = this.f6416b;
            if (i17 == 0) {
                while (zzeuVar.m6360B() > 0) {
                    if (this.f6424j) {
                        int iM6369K = zzeuVar.m6369K();
                        if (iM6369K == 119) {
                            this.f6424j = false;
                            this.f6422h = 1;
                            byte[] bArr = zzeuVar2.f14887a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f6423i = 2;
                            break;
                        }
                        this.f6424j = iM6369K == 11;
                    } else {
                        this.f6424j = zzeuVar.m6369K() == 11;
                    }
                }
            } else if (i17 != 1) {
                int iMin = Math.min(zzeuVar.m6360B(), this.f6427m - this.f6423i);
                this.f6421g.mo4121a(iMin, zzeuVar);
                int i18 = this.f6423i + iMin;
                this.f6423i = i18;
                if (i18 == this.f6427m) {
                    zzgtr.m7133f(this.f6428n != -9223372036854775807L);
                    this.f6421g.mo4095b(this.f6428n, 1, this.f6427m, 0, null);
                    this.f6428n += this.f6425k;
                    this.f6422h = 0;
                }
            } else {
                byte[] bArr2 = zzeuVar2.f14887a;
                int iMin2 = Math.min(zzeuVar.m6360B(), 128 - this.f6423i);
                zzeuVar.m6366H(bArr2, this.f6423i, iMin2);
                int i19 = this.f6423i + iMin2;
                this.f6423i = i19;
                if (i19 == 128) {
                    zzet zzetVar = this.f6415a;
                    zzetVar.m6341d(0);
                    int i20 = (zzetVar.f14824b * 8) + zzetVar.f14825c;
                    zzetVar.m6343f(40);
                    int iM6345h2 = zzetVar.m6345h(5);
                    zzetVar.m6341d(i20);
                    int[] iArr = zzafa.f5144d;
                    int[] iArr2 = zzafa.f5142b;
                    if (iM6345h2 > 10) {
                        zzetVar.m6343f(16);
                        int iM6345h3 = zzetVar.m6345h(2);
                        if (iM6345h3 == 0) {
                            b = 0;
                        } else if (iM6345h3 != 1) {
                            b = iM6345h3 != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        zzetVar.m6343f(3);
                        int iM6345h4 = zzetVar.m6345h(11) + 1;
                        int iM6345h5 = zzetVar.m6345h(2);
                        if (iM6345h5 == 3) {
                            i7 = zzafa.f5143c[zzetVar.m6345h(2)];
                            iM6345h = 3;
                            i8 = 6;
                        } else {
                            iM6345h = zzetVar.m6345h(2);
                            int i21 = zzafa.f5141a[iM6345h];
                            i7 = iArr2[iM6345h5];
                            i8 = i21;
                        }
                        i6 = iM6345h4 + iM6345h4;
                        int i22 = (i6 * i7) / (i8 * 32);
                        int iM6345h6 = zzetVar.m6345h(3);
                        boolean zM6344g = zzetVar.m6344g();
                        i4 = iArr[iM6345h6] + (zM6344g ? 1 : 0);
                        zzetVar.m6343f(10);
                        if (zzetVar.m6344g()) {
                            zzetVar.m6343f(8);
                        }
                        if (iM6345h6 == 0) {
                            zzetVar.m6343f(5);
                            if (zzetVar.m6344g()) {
                                zzetVar.m6343f(8);
                            }
                            i9 = 0;
                            iM6345h6 = 0;
                        } else {
                            i9 = iM6345h6;
                        }
                        if (b == 1) {
                            if (zzetVar.m6344g()) {
                                zzetVar.m6343f(16);
                            }
                            b = 1;
                        }
                        if (zzetVar.m6344g()) {
                            if (i9 > 2) {
                                zzetVar.m6343f(2);
                            }
                            if ((i9 & 1) == 0 || i9 <= 2) {
                                i13 = 6;
                            } else {
                                i13 = 6;
                                zzetVar.m6343f(6);
                            }
                            if ((i9 & 4) != 0) {
                                zzetVar.m6343f(i13);
                            }
                            if (zM6344g && zzetVar.m6344g()) {
                                zzetVar.m6343f(5);
                            }
                            if (b == 0) {
                                if (zzetVar.m6344g()) {
                                    i14 = 6;
                                    zzetVar.m6343f(6);
                                } else {
                                    i14 = 6;
                                }
                                if (i9 == 0 && zzetVar.m6344g()) {
                                    zzetVar.m6343f(i14);
                                }
                                if (zzetVar.m6344g()) {
                                    zzetVar.m6343f(i14);
                                }
                                int iM6345h7 = zzetVar.m6345h(2);
                                if (iM6345h7 == 1) {
                                    zzetVar.m6343f(5);
                                    i15 = 2;
                                } else {
                                    if (iM6345h7 == 2) {
                                        zzetVar.m6343f(12);
                                    } else if (iM6345h7 == 3) {
                                        int iM6345h8 = zzetVar.m6345h(5);
                                        if (zzetVar.m6344g()) {
                                            zzetVar.m6343f(5);
                                            if (zzetVar.m6344g()) {
                                                i16 = 4;
                                                zzetVar.m6343f(4);
                                            } else {
                                                i16 = 4;
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(i16);
                                            }
                                            if (zzetVar.m6344g()) {
                                                if (zzetVar.m6344g()) {
                                                    zzetVar.m6343f(i16);
                                                }
                                                if (zzetVar.m6344g()) {
                                                    zzetVar.m6343f(i16);
                                                }
                                            }
                                        }
                                        if (zzetVar.m6344g()) {
                                            zzetVar.m6343f(5);
                                            if (zzetVar.m6344g()) {
                                                zzetVar.m6343f(7);
                                                if (zzetVar.m6344g()) {
                                                    zzetVar.m6343f(8);
                                                    i15 = 2;
                                                } else {
                                                    i15 = 2;
                                                }
                                            } else {
                                                i15 = 2;
                                            }
                                        } else {
                                            i15 = 2;
                                        }
                                        zzetVar.m6343f((iM6345h8 + i15) * 8);
                                        zzetVar.m6348k();
                                    }
                                    i15 = 2;
                                }
                                if (i9 < i15) {
                                    if (zzetVar.m6344g()) {
                                        zzetVar.m6343f(14);
                                    }
                                    if (iM6345h6 == 0 && zzetVar.m6344g()) {
                                        zzetVar.m6343f(14);
                                    }
                                }
                                if (!zzetVar.m6344g()) {
                                    i10 = iM6345h;
                                } else if (iM6345h == 0) {
                                    zzetVar.m6343f(5);
                                    i10 = 0;
                                } else {
                                    for (int i23 = 0; i23 < i8; i23++) {
                                        if (zzetVar.m6344g()) {
                                            zzetVar.m6343f(5);
                                        }
                                    }
                                    i10 = iM6345h;
                                }
                                b = 0;
                            } else {
                                i10 = iM6345h;
                            }
                        } else {
                            i10 = iM6345h;
                        }
                        if (zzetVar.m6344g()) {
                            zzetVar.m6343f(5);
                            if (i9 == 2) {
                                zzetVar.m6343f(4);
                                i9 = 2;
                            }
                            if (i9 >= 6) {
                                zzetVar.m6343f(2);
                            }
                            if (zzetVar.m6344g()) {
                                i12 = 8;
                                zzetVar.m6343f(8);
                            } else {
                                i12 = 8;
                            }
                            if (i9 == 0 && zzetVar.m6344g()) {
                                zzetVar.m6343f(i12);
                            }
                            if (iM6345h5 < 3) {
                                zzetVar.m6342e();
                            }
                        }
                        if (b == 0 && i10 != 3) {
                            zzetVar.m6342e();
                        }
                        if (b == 2 && (i10 == 3 || zzetVar.m6344g())) {
                            i11 = 6;
                            zzetVar.m6343f(6);
                        } else {
                            i11 = 6;
                        }
                        str = (zzetVar.m6344g() && zzetVar.m6345h(i11) == 1 && zzetVar.m6345h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i5 = i8 * 256;
                        i2 = i22;
                    } else {
                        zzetVar.m6343f(32);
                        int iM6345h9 = zzetVar.m6345h(2);
                        String str2 = iM6345h9 == 3 ? null : "audio/ac3";
                        int iM6345h10 = zzetVar.m6345h(6);
                        i2 = zzafa.f5145e[iM6345h10 / 2] * 1000;
                        int iM4056a = zzafa.m4056a(iM6345h9, iM6345h10);
                        zzetVar.m6343f(8);
                        int iM6345h11 = zzetVar.m6345h(3);
                        if ((iM6345h11 & 1) == 0 || iM6345h11 == 1) {
                            i3 = 2;
                        } else {
                            i3 = 2;
                            zzetVar.m6343f(2);
                        }
                        if ((iM6345h11 & 4) != 0) {
                            zzetVar.m6343f(i3);
                        }
                        if (iM6345h11 == i3) {
                            zzetVar.m6343f(i3);
                        }
                        int i24 = iM6345h9 < 3 ? iArr2[iM6345h9] : -1;
                        i4 = iArr[iM6345h11] + (zzetVar.m6344g() ? 1 : 0);
                        i5 = 1536;
                        str = str2;
                        i6 = iM4056a;
                        i7 = i24;
                    }
                    zzv zzvVar = this.f6426l;
                    if (zzvVar == null || i4 != zzvVar.f21037G || i7 != zzvVar.f21039I || !Objects.equals(str, zzvVar.f21061o)) {
                        zzt zztVar = new zzt();
                        zztVar.f20789a = this.f6420f;
                        zztVar.m8852d(this.f6419e);
                        zztVar.m8853e(str);
                        zztVar.f20780F = i4;
                        zztVar.f20782H = i7;
                        zztVar.f20792d = this.f6417c;
                        zztVar.f20794f = this.f6418d;
                        zztVar.f20797i = i2;
                        if ("audio/ac3".equals(str)) {
                            zztVar.f20796h = i2;
                        }
                        zzv zzvVar2 = new zzv(zztVar);
                        this.f6426l = zzvVar2;
                        this.f6421g.mo4097e(zzvVar2);
                    }
                    this.f6427m = i6;
                    this.f6425k = (((long) i5) * 1000000) / ((long) this.f6426l.f21039I);
                    zzeuVar2.m6363E(0);
                    this.f6421g.mo4121a(128, zzeuVar2);
                    this.f6422h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6428n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6420f = zzaroVar.f6773e;
        zzaroVar.m4340b();
        this.f6421g = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6422h = 0;
        this.f6423i = 0;
        this.f6424j = false;
        this.f6428n = -9223372036854775807L;
    }
}
