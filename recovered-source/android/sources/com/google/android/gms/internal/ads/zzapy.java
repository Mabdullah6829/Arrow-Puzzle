package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapy implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzeu f6482a;

    /* JADX INFO: renamed from: c */
    public final String f6484c;

    /* JADX INFO: renamed from: d */
    public final int f6485d;

    /* JADX INFO: renamed from: f */
    public String f6487f;

    /* JADX INFO: renamed from: g */
    public zzahm f6488g;

    /* JADX INFO: renamed from: i */
    public int f6490i;

    /* JADX INFO: renamed from: j */
    public int f6491j;

    /* JADX INFO: renamed from: k */
    public long f6492k;

    /* JADX INFO: renamed from: l */
    public zzv f6493l;

    /* JADX INFO: renamed from: m */
    public int f6494m;

    /* JADX INFO: renamed from: n */
    public int f6495n;

    /* JADX INFO: renamed from: h */
    public int f6489h = 0;

    /* JADX INFO: renamed from: q */
    public long f6498q = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f6483b = new AtomicInteger();

    /* JADX INFO: renamed from: o */
    public int f6496o = -1;

    /* JADX INFO: renamed from: p */
    public int f6497p = -1;

    /* JADX INFO: renamed from: e */
    public final String f6486e = "video/mp2t";

    public zzapy(String str, int i2, int i3) {
        this.f6482a = new zzeu(new byte[i3]);
        this.f6484c = str;
        this.f6485d = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) throws zzat {
        long jM6521w;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM6345h;
        int iM6345h2;
        long jM6521w2;
        int i6;
        int i7;
        byte b;
        int i8;
        byte b2;
        this.f6488g.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i9 = this.f6489h;
            zzeu zzeuVar2 = this.f6482a;
            if (i9 == 0) {
                while (zzeuVar.m6360B() > 0) {
                    int i10 = this.f6491j << 8;
                    this.f6491j = i10;
                    int iM6369K = i10 | zzeuVar.m6369K();
                    this.f6491j = iM6369K;
                    int iM4099a = zzafz.m4099a(iM6369K);
                    this.f6495n = iM4099a;
                    if (iM4099a != 0) {
                        byte[] bArr = zzeuVar2.f14887a;
                        int i11 = this.f6491j;
                        bArr[0] = (byte) ((i11 >> 24) & 255);
                        bArr[1] = (byte) ((i11 >> 16) & 255);
                        bArr[2] = (byte) ((i11 >> 8) & 255);
                        bArr[3] = (byte) (i11 & 255);
                        this.f6490i = 4;
                        this.f6491j = 0;
                        if (iM4099a != 3 && iM4099a != 4) {
                            if (iM4099a == 1) {
                                this.f6489h = 1;
                                break;
                            } else {
                                this.f6489h = 2;
                                break;
                            }
                        }
                        this.f6489h = 4;
                        break;
                    }
                }
            } else if (i9 != 1) {
                if (i9 != 2) {
                    int iM6345h3 = -2147483647;
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                int iMin = Math.min(zzeuVar.m6360B(), this.f6494m - this.f6490i);
                                this.f6488g.mo4121a(iMin, zzeuVar);
                                int i12 = this.f6490i + iMin;
                                this.f6490i = i12;
                                if (i12 == this.f6494m) {
                                    zzgtr.m7133f(this.f6498q != -9223372036854775807L);
                                    this.f6488g.mo4095b(this.f6498q, this.f6495n == 4 ? 0 : 1, this.f6494m, 0, null);
                                    this.f6498q += this.f6492k;
                                    this.f6489h = 0;
                                }
                            } else if (m4308e(zzeuVar, zzeuVar2.f14887a, this.f6497p)) {
                                byte[] bArr2 = zzeuVar2.f14887a;
                                zzet zzetVarM4102d = zzafz.m4102d(bArr2);
                                int iM6345h4 = zzetVarM4102d.m6345h(32);
                                int iM4101c = zzafz.m4101c(zzetVarM4102d, zzafz.f5235e);
                                int i13 = iM4101c + 1;
                                char c = iM6345h4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c == 0) {
                                    jM6521w = -9223372036854775807L;
                                } else {
                                    if (!zzetVarM4102d.m6344g()) {
                                        throw zzat.m4384b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i14 = iM4101c - 1;
                                    int i15 = bArr2[i14] << 8;
                                    int i16 = bArr2[iM4101c] & 255;
                                    String str = zzfm.f16091a;
                                    char c2 = 65535;
                                    for (int i17 = 0; i17 < i14; i17++) {
                                        byte b3 = bArr2[i17];
                                        int[] iArr = zzfm.f16098h;
                                        char c3 = (char) (iArr[((c2 >> '\f') ^ ((b3 & 255) >> 4)) & 255] ^ ((char) (c2 << 4)));
                                        c2 = (char) (((char) (c3 << 4)) ^ iArr[((b3 & 15) ^ (c3 >> '\f')) & 255]);
                                    }
                                    if ((((char) i15) | i16) != c2) {
                                        throw zzat.m4383a(null, "CRC check failed");
                                    }
                                    int iM6345h5 = zzetVarM4102d.m6345h(2);
                                    if (iM6345h5 != 0) {
                                        if (iM6345h5 == 1) {
                                            i3 = 480;
                                        } else {
                                            if (iM6345h5 != 2) {
                                                StringBuilder sb = new StringBuilder(String.valueOf(iM6345h5).length() + 51);
                                                sb.append("Unsupported base duration index in DTS UHD header: ");
                                                sb.append(iM6345h5);
                                                throw zzat.m4383a(null, sb.toString());
                                            }
                                            i3 = 384;
                                        }
                                        i2 = 3;
                                    } else {
                                        i2 = 3;
                                        i3 = 512;
                                    }
                                    int iM6345h6 = zzetVarM4102d.m6345h(i2) + 1;
                                    int iM6345h7 = zzetVarM4102d.m6345h(2);
                                    if (iM6345h7 == 0) {
                                        i4 = 32000;
                                    } else if (iM6345h7 == 1) {
                                        i4 = 44100;
                                    } else {
                                        if (iM6345h7 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iM6345h7).length() + 48);
                                            sb2.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb2.append(iM6345h7);
                                            throw zzat.m4383a(null, sb2.toString());
                                        }
                                        i4 = 48000;
                                    }
                                    if (zzetVarM4102d.m6344g()) {
                                        zzetVarM4102d.m6343f(36);
                                    }
                                    iM6345h3 = i4 * (1 << zzetVarM4102d.m6345h(2));
                                    jM6521w = zzfm.m6521w(i3 * iM6345h6, 1000000L, i4, RoundingMode.DOWN);
                                }
                                int i18 = iM6345h3;
                                int iM4101c2 = 0;
                                for (char c4 = 0; c4 < c; c4 = 1) {
                                    iM4101c2 += zzafz.m4101c(zzetVarM4102d, zzafz.f5236f);
                                }
                                for (int i19 = 0; i19 <= 0; i19++) {
                                    AtomicInteger atomicInteger = this.f6483b;
                                    if (c != 0) {
                                        atomicInteger.set(zzafz.m4101c(zzetVarM4102d, zzafz.f5237g));
                                    }
                                    iM4101c2 += atomicInteger.get() != 0 ? zzafz.m4101c(zzetVarM4102d, zzafz.f5238h) : 0;
                                }
                                int i20 = i13 + iM4101c2;
                                long j2 = jM6521w;
                                zzafy zzafyVar = new zzafy("audio/vnd.dts.uhd;profile=p2", 2, i18, i20, j2);
                                if (this.f6495n == 3) {
                                    m4309f(zzafyVar);
                                }
                                this.f6494m = i20;
                                if (j2 == -9223372036854775807L) {
                                    j2 = 0;
                                }
                                this.f6492k = j2;
                                zzeuVar2.m6363E(0);
                                this.f6488g.mo4121a(this.f6497p, zzeuVar2);
                                this.f6489h = 6;
                            } else {
                                continue;
                            }
                        } else if (m4308e(zzeuVar, zzeuVar2.f14887a, 6)) {
                            zzet zzetVarM4102d2 = zzafz.m4102d(zzeuVar2.f14887a);
                            zzetVarM4102d2.m6343f(32);
                            int iM4101c3 = zzafz.m4101c(zzetVarM4102d2, zzafz.f5239i) + 1;
                            this.f6497p = iM4101c3;
                            int i21 = this.f6490i;
                            if (i21 > iM4101c3) {
                                int i22 = i21 - iM4101c3;
                                this.f6490i = i21 - i22;
                                zzeuVar.m6363E(zzeuVar.f14888b - i22);
                            }
                            this.f6489h = 5;
                        }
                    } else if (m4308e(zzeuVar, zzeuVar2.f14887a, this.f6496o)) {
                        zzet zzetVarM4102d3 = zzafz.m4102d(zzeuVar2.f14887a);
                        zzetVarM4102d3.m6343f(40);
                        int iM6345h8 = zzetVarM4102d3.m6345h(2);
                        boolean zM6344g = zzetVarM4102d3.m6344g();
                        int i23 = true != zM6344g ? 16 : 20;
                        zzetVarM4102d3.m6343f(true != zM6344g ? 8 : 12);
                        int iM6345h9 = zzetVarM4102d3.m6345h(i23) + 1;
                        boolean zM6344g2 = zzetVarM4102d3.m6344g();
                        if (zM6344g2) {
                            iM6345h = zzetVarM4102d3.m6345h(2);
                            int iM6345h10 = zzetVarM4102d3.m6345h(3) + 1;
                            if (zzetVarM4102d3.m6344g()) {
                                zzetVarM4102d3.m6343f(36);
                            }
                            int iM6345h11 = zzetVarM4102d3.m6345h(3) + 1;
                            int iM6345h12 = zzetVarM4102d3.m6345h(3) + 1;
                            if (iM6345h11 != 1 || iM6345h12 != 1) {
                                throw zzat.m4384b("Multiple audio presentations or assets not supported");
                            }
                            int i24 = iM6345h8 + 1;
                            int iM6345h13 = zzetVarM4102d3.m6345h(i24);
                            for (int i25 = 0; i25 < i24; i25++) {
                                if (((iM6345h13 >> i25) & 1) == 1) {
                                    zzetVarM4102d3.m6343f(8);
                                }
                            }
                            i5 = iM6345h10 * 512;
                            if (zzetVarM4102d3.m6344g()) {
                                zzetVarM4102d3.m6343f(2);
                                int iM6345h14 = (zzetVarM4102d3.m6345h(2) + 1) << 2;
                                int iM6345h15 = zzetVarM4102d3.m6345h(2) + 1;
                                for (int i26 = 0; i26 < iM6345h15; i26++) {
                                    zzetVarM4102d3.m6343f(iM6345h14);
                                }
                            }
                        } else {
                            i5 = 0;
                            iM6345h = -1;
                        }
                        zzetVarM4102d3.m6343f(i23);
                        zzetVarM4102d3.m6343f(12);
                        if (zM6344g2) {
                            if (zzetVarM4102d3.m6344g()) {
                                zzetVarM4102d3.m6343f(4);
                            }
                            if (zzetVarM4102d3.m6344g()) {
                                zzetVarM4102d3.m6343f(24);
                            }
                            if (zzetVarM4102d3.m6344g()) {
                                zzetVarM4102d3.m6349l(zzetVarM4102d3.m6345h(10) + 1);
                            }
                            zzetVarM4102d3.m6343f(5);
                            iM6345h3 = zzafz.f5234d[zzetVarM4102d3.m6345h(4)];
                            iM6345h2 = zzetVarM4102d3.m6345h(8) + 1;
                        } else {
                            iM6345h2 = -1;
                        }
                        int i27 = iM6345h3;
                        if (zM6344g2) {
                            if (iM6345h == 0) {
                                i6 = 32000;
                            } else if (iM6345h == 1) {
                                i6 = 44100;
                            } else {
                                if (iM6345h != 2) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iM6345h).length() + 51);
                                    sb3.append("Unsupported reference clock code in DTS HD header: ");
                                    sb3.append(iM6345h);
                                    throw zzat.m4383a(null, sb3.toString());
                                }
                                i6 = 48000;
                            }
                            jM6521w2 = zzfm.m6521w(i5, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jM6521w2 = -9223372036854775807L;
                        }
                        m4309f(new zzafy("audio/vnd.dts.hd;profile=lbr", iM6345h2, i27, iM6345h9, jM6521w2));
                        this.f6494m = iM6345h9;
                        this.f6492k = jM6521w2 == -9223372036854775807L ? 0L : jM6521w2;
                        zzeuVar2.m6363E(0);
                        this.f6488g.mo4121a(this.f6496o, zzeuVar2);
                        this.f6489h = 6;
                    } else {
                        continue;
                    }
                } else if (m4308e(zzeuVar, zzeuVar2.f14887a, 7)) {
                    zzet zzetVarM4102d4 = zzafz.m4102d(zzeuVar2.f14887a);
                    zzetVarM4102d4.m6343f(42);
                    this.f6496o = zzetVarM4102d4.m6345h(true == zzetVarM4102d4.m6344g() ? 12 : 8) + 1;
                    this.f6489h = 3;
                }
            } else if (m4308e(zzeuVar, zzeuVar2.f14887a, 18)) {
                byte[] bArr3 = zzeuVar2.f14887a;
                if (this.f6493l == null) {
                    String str2 = this.f6487f;
                    zzet zzetVarM4102d5 = zzafz.m4102d(bArr3);
                    zzetVarM4102d5.m6343f(60);
                    int i28 = zzafz.f5231a[zzetVarM4102d5.m6345h(6)];
                    int i29 = zzafz.f5232b[zzetVarM4102d5.m6345h(4)];
                    int iM6345h16 = zzetVarM4102d5.m6345h(5);
                    int i30 = iM6345h16 >= 29 ? -1 : (zzafz.f5233c[iM6345h16] * 1000) / 2;
                    zzetVarM4102d5.m6343f(10);
                    int i31 = i28 + (zzetVarM4102d5.m6345h(2) > 0 ? 1 : 0);
                    zzt zztVar = new zzt();
                    zztVar.f20789a = str2;
                    zztVar.m8852d("video/mp2t");
                    zztVar.m8853e("audio/vnd.dts");
                    zztVar.f20796h = i30;
                    zztVar.f20780F = i31;
                    zztVar.f20782H = i29;
                    zztVar.f20806r = null;
                    zztVar.f20792d = this.f6484c;
                    zztVar.f20794f = this.f6485d;
                    zzv zzvVar = new zzv(zztVar);
                    this.f6493l = zzvVar;
                    this.f6488g.mo4097e(zzvVar);
                }
                this.f6494m = zzafz.m4100b(bArr3);
                byte b4 = bArr3[0];
                if (b4 != -2) {
                    if (b4 == -1) {
                        i7 = (bArr3[4] & 7) << 4;
                        b2 = bArr3[7];
                    } else if (b4 != 31) {
                        i7 = (bArr3[4] & 1) << 6;
                        b = bArr3[5];
                    } else {
                        i7 = (bArr3[5] & 7) << 4;
                        b2 = bArr3[6];
                    }
                    i8 = b2 & 60;
                    this.f6492k = zzhaq.m7304a(zzfm.m6520v(this.f6493l.f21039I, (((i8 >> 2) | i7) + 1) * 32));
                    zzeuVar2.m6363E(0);
                    this.f6488g.mo4121a(18, zzeuVar2);
                    this.f6489h = 6;
                } else {
                    i7 = (bArr3[5] & 1) << 6;
                    b = bArr3[4];
                }
                i8 = b & 252;
                this.f6492k = zzhaq.m7304a(zzfm.m6520v(this.f6493l.f21039I, (((i8 >> 2) | i7) + 1) * 32));
                zzeuVar2.m6363E(0);
                this.f6488g.mo4121a(18, zzeuVar2);
                this.f6489h = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6498q = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6487f = zzaroVar.f6773e;
        zzaroVar.m4340b();
        this.f6488g = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4308e(zzeu zzeuVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzeuVar.m6360B(), i2 - this.f6490i);
        zzeuVar.m6366H(bArr, this.f6490i, iMin);
        int i3 = this.f6490i + iMin;
        this.f6490i = i3;
        return i3 == i2;
    }

    /* JADX INFO: renamed from: f */
    public final void m4309f(zzafy zzafyVar) {
        int i2;
        int i3 = zzafyVar.f5229b;
        String str = zzafyVar.f5228a;
        if (i3 == -2147483647 || (i2 = zzafyVar.f5230c) == -1) {
            return;
        }
        zzv zzvVar = this.f6493l;
        if (zzvVar != null && i2 == zzvVar.f21037G && i3 == zzvVar.f21039I && str.equals(zzvVar.f21061o)) {
            return;
        }
        zzv zzvVar2 = this.f6493l;
        zzt zztVar = zzvVar2 == null ? new zzt() : new zzt(zzvVar2);
        zztVar.f20789a = this.f6487f;
        zztVar.m8852d(this.f6486e);
        zztVar.m8853e(str);
        zztVar.f20780F = i2;
        zztVar.f20782H = i3;
        zztVar.f20792d = this.f6484c;
        zztVar.f20794f = this.f6485d;
        zzv zzvVar3 = new zzv(zztVar);
        this.f6493l = zzvVar3;
        this.f6488g.mo4097e(zzvVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6489h = 0;
        this.f6490i = 0;
        this.f6491j = 0;
        this.f6498q = -9223372036854775807L;
        this.f6483b.set(0);
    }
}
