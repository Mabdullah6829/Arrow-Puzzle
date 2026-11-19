package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaql implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final String f6611a;

    /* JADX INFO: renamed from: b */
    public final int f6612b;

    /* JADX INFO: renamed from: c */
    public final zzeu f6613c;

    /* JADX INFO: renamed from: d */
    public final zzet f6614d;

    /* JADX INFO: renamed from: e */
    public zzahm f6615e;

    /* JADX INFO: renamed from: f */
    public String f6616f;

    /* JADX INFO: renamed from: g */
    public zzv f6617g;

    /* JADX INFO: renamed from: h */
    public int f6618h;

    /* JADX INFO: renamed from: i */
    public int f6619i;

    /* JADX INFO: renamed from: j */
    public int f6620j;

    /* JADX INFO: renamed from: k */
    public int f6621k;

    /* JADX INFO: renamed from: l */
    public long f6622l;

    /* JADX INFO: renamed from: m */
    public boolean f6623m;

    /* JADX INFO: renamed from: n */
    public int f6624n;

    /* JADX INFO: renamed from: o */
    public int f6625o;

    /* JADX INFO: renamed from: p */
    public int f6626p;

    /* JADX INFO: renamed from: q */
    public boolean f6627q;

    /* JADX INFO: renamed from: r */
    public long f6628r;

    /* JADX INFO: renamed from: s */
    public int f6629s;

    /* JADX INFO: renamed from: t */
    public long f6630t;

    /* JADX INFO: renamed from: u */
    public int f6631u;

    /* JADX INFO: renamed from: v */
    public String f6632v;

    public zzaql(String str, int i2) {
        this.f6611a = str;
        this.f6612b = i2;
        zzeu zzeuVar = new zzeu(1024);
        this.f6613c = zzeuVar;
        byte[] bArr = zzeuVar.f14887a;
        this.f6614d = new zzet(bArr, bArr.length);
        this.f6622l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) throws zzat {
        int iM6345h;
        int i2;
        int iM6345h2;
        boolean zM6344g;
        int i3;
        this.f6615e.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i4 = this.f6618h;
            if (i4 != 0) {
                int i5 = 2;
                if (i4 != 1) {
                    zzet zzetVar = this.f6614d;
                    zzeu zzeuVar2 = this.f6613c;
                    if (i4 != 2) {
                        int iMin = Math.min(zzeuVar.m6360B(), this.f6620j - this.f6619i);
                        zzeuVar.m6366H(zzetVar.f14823a, this.f6619i, iMin);
                        int i6 = this.f6619i + iMin;
                        this.f6619i = i6;
                        if (i6 == this.f6620j) {
                            zzetVar.m6341d(0);
                            if (zzetVar.m6344g()) {
                                if (this.f6623m) {
                                }
                                this.f6618h = 0;
                            } else {
                                this.f6623m = true;
                                int iM6345h3 = zzetVar.m6345h(1);
                                if (iM6345h3 == 1) {
                                    iM6345h2 = zzetVar.m6345h(1);
                                    i2 = 1;
                                } else {
                                    i2 = iM6345h3;
                                    iM6345h2 = 0;
                                }
                                this.f6624n = iM6345h2;
                                if (iM6345h2 != 0) {
                                    throw zzat.m4383a(null, null);
                                }
                                if (i2 == 1) {
                                    zzetVar.m6345h((zzetVar.m6345h(2) + 1) * 8);
                                    i2 = 1;
                                }
                                if (!zzetVar.m6344g()) {
                                    throw zzat.m4383a(null, null);
                                }
                                this.f6625o = zzetVar.m6345h(6);
                                int iM6345h4 = zzetVar.m6345h(4);
                                int iM6345h5 = zzetVar.m6345h(3);
                                if (iM6345h4 != 0 || iM6345h5 != 0) {
                                    throw zzat.m4383a(null, null);
                                }
                                if (i2 == 0) {
                                    int i7 = (zzetVar.f14824b * 8) + zzetVar.f14825c;
                                    int iM6339b = zzetVar.m6339b();
                                    zzaex zzaexVarM4054a = zzaey.m4054a(zzetVar, true);
                                    this.f6632v = zzaexVarM4054a.f5138c;
                                    this.f6629s = zzaexVarM4054a.f5136a;
                                    this.f6631u = zzaexVarM4054a.f5137b;
                                    int iM6339b2 = iM6339b - zzetVar.m6339b();
                                    zzetVar.m6341d(i7);
                                    byte[] bArr = new byte[(iM6339b2 + 7) / 8];
                                    zzetVar.m6347j(iM6339b2, bArr);
                                    zzt zztVar = new zzt();
                                    zztVar.f20789a = this.f6616f;
                                    zztVar.m8852d("video/mp2t");
                                    zztVar.m8853e("audio/mp4a-latm");
                                    zztVar.f20798j = this.f6632v;
                                    zztVar.f20780F = this.f6631u;
                                    zztVar.f20782H = this.f6629s;
                                    zztVar.f20805q = Collections.singletonList(bArr);
                                    zztVar.f20792d = this.f6611a;
                                    zztVar.f20794f = this.f6612b;
                                    zzv zzvVar = new zzv(zztVar);
                                    if (!zzvVar.equals(this.f6617g)) {
                                        this.f6617g = zzvVar;
                                        this.f6630t = 1024000000 / ((long) zzvVar.f21039I);
                                        this.f6615e.mo4097e(zzvVar);
                                    }
                                } else {
                                    int iM6345h6 = zzetVar.m6345h((zzetVar.m6345h(2) + 1) * 8);
                                    int iM6339b3 = zzetVar.m6339b();
                                    zzaex zzaexVarM4054a2 = zzaey.m4054a(zzetVar, true);
                                    this.f6632v = zzaexVarM4054a2.f5138c;
                                    this.f6629s = zzaexVarM4054a2.f5136a;
                                    this.f6631u = zzaexVarM4054a2.f5137b;
                                    zzetVar.m6343f(iM6345h6 - (iM6339b3 - zzetVar.m6339b()));
                                }
                                int iM6345h7 = zzetVar.m6345h(3);
                                this.f6626p = iM6345h7;
                                if (iM6345h7 == 0) {
                                    zzetVar.m6343f(8);
                                } else if (iM6345h7 == 1) {
                                    zzetVar.m6343f(9);
                                } else if (iM6345h7 == 3 || iM6345h7 == 4 || iM6345h7 == 5) {
                                    zzetVar.m6343f(6);
                                } else {
                                    if (iM6345h7 != 6 && iM6345h7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    zzetVar.m6343f(1);
                                }
                                boolean zM6344g2 = zzetVar.m6344g();
                                this.f6627q = zM6344g2;
                                this.f6628r = 0L;
                                if (zM6344g2) {
                                    if (i2 != 1) {
                                        do {
                                            zM6344g = zzetVar.m6344g();
                                            this.f6628r = (this.f6628r << 8) + ((long) zzetVar.m6345h(8));
                                        } while (zM6344g);
                                    } else {
                                        this.f6628r = zzetVar.m6345h((zzetVar.m6345h(2) + 1) * 8);
                                    }
                                }
                                if (zzetVar.m6344g()) {
                                    zzetVar.m6343f(8);
                                }
                            }
                            if (this.f6624n != 0) {
                                throw zzat.m4383a(null, null);
                            }
                            if (this.f6625o != 0) {
                                throw zzat.m4383a(null, null);
                            }
                            if (this.f6626p != 0) {
                                throw zzat.m4383a(null, null);
                            }
                            int i8 = 0;
                            do {
                                iM6345h = zzetVar.m6345h(8);
                                i8 += iM6345h;
                            } while (iM6345h == 255);
                            int i9 = (zzetVar.f14824b * 8) + zzetVar.f14825c;
                            if ((i9 & 7) == 0) {
                                zzeuVar2.m6363E(i9 >> 3);
                            } else {
                                zzetVar.m6347j(i8 * 8, zzeuVar2.f14887a);
                                zzeuVar2.m6363E(0);
                            }
                            this.f6615e.mo4121a(i8, zzeuVar2);
                            zzgtr.m7133f(this.f6622l != -9223372036854775807L);
                            this.f6615e.mo4095b(this.f6622l, 1, i8, 0, null);
                            this.f6622l += this.f6630t;
                            if (this.f6627q) {
                                zzetVar.m6343f((int) this.f6628r);
                            }
                            this.f6618h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iM6369K = ((this.f6621k & (-225)) << 8) | zzeuVar.m6369K();
                        this.f6620j = iM6369K;
                        if (iM6369K > zzeuVar2.f14887a.length) {
                            zzeuVar2.m6396y(iM6369K);
                            byte[] bArr2 = zzeuVar2.f14887a;
                            int length = bArr2.length;
                            zzetVar.f14823a = bArr2;
                            i3 = 0;
                            zzetVar.f14824b = 0;
                            zzetVar.f14825c = 0;
                            zzetVar.f14826d = length;
                        } else {
                            i3 = 0;
                        }
                        this.f6619i = i3;
                        this.f6618h = 3;
                    }
                } else {
                    int iM6369K2 = zzeuVar.m6369K();
                    if ((iM6369K2 & 224) == 224) {
                        this.f6621k = iM6369K2;
                    } else if (iM6369K2 != 86) {
                        i5 = 0;
                    }
                    this.f6618h = i5;
                }
            } else if (zzeuVar.m6369K() == 86) {
                this.f6618h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6622l = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6615e = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
        zzaroVar.m4340b();
        this.f6616f = zzaroVar.f6773e;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6618h = 0;
        this.f6622l = -9223372036854775807L;
        this.f6623m = false;
    }
}
