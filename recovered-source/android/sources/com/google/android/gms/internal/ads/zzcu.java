package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcu {

    /* JADX INFO: renamed from: a */
    public final int f11418a;

    /* JADX INFO: renamed from: b */
    public final int f11419b;

    /* JADX INFO: renamed from: c */
    public final float f11420c;

    /* JADX INFO: renamed from: d */
    public final float f11421d;

    /* JADX INFO: renamed from: e */
    public final float f11422e;

    /* JADX INFO: renamed from: f */
    public final int f11423f;

    /* JADX INFO: renamed from: g */
    public final int f11424g;

    /* JADX INFO: renamed from: h */
    public final int f11425h;

    /* JADX INFO: renamed from: i */
    public final zzcs f11426i;

    /* JADX INFO: renamed from: j */
    public int f11427j;

    /* JADX INFO: renamed from: k */
    public int f11428k;

    /* JADX INFO: renamed from: l */
    public int f11429l;

    /* JADX INFO: renamed from: m */
    public int f11430m;

    /* JADX INFO: renamed from: n */
    public int f11431n;

    /* JADX INFO: renamed from: o */
    public int f11432o;

    /* JADX INFO: renamed from: p */
    public int f11433p;

    /* JADX INFO: renamed from: q */
    public double f11434q;

    public zzcu(int i2, int i3, float f2, float f3, int i4, boolean z) {
        this.f11418a = i2;
        this.f11419b = i3;
        this.f11420c = f2;
        this.f11421d = f3;
        this.f11422e = i2 / i4;
        this.f11423f = i2 / 400;
        int i5 = i2 / 65;
        this.f11424g = i5;
        this.f11425h = i5 + i5;
        this.f11426i = z ? new zzcr(this) : new zzct(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m5831a(int i2, int i3) {
        zzcs zzcsVar = this.f11426i;
        zzcsVar.mo5797E(i3);
        Object objMo5812n = zzcsVar.mo5812n();
        Object objMo5804f = zzcsVar.mo5804f();
        int i4 = this.f11428k;
        int i5 = this.f11419b;
        System.arraycopy(objMo5812n, i2 * i5, objMo5804f, i4 * i5, i3 * i5);
        this.f11428k += i3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX INFO: renamed from: b */
    public final void m5832b() {
        int i2;
        float f2;
        int iMo5809k;
        int i3;
        int i4;
        double d;
        int i5;
        double d2;
        int i6;
        double d3;
        int i7;
        double d4;
        int i8;
        int iRound;
        float f3;
        int i9;
        int i10;
        long j2;
        long j3;
        float f4 = this.f11420c;
        float f5 = this.f11421d;
        double d5 = f4 / f5;
        int i11 = this.f11428k;
        int i12 = this.f11418a;
        int i13 = this.f11419b;
        zzcs zzcsVar = this.f11426i;
        int i14 = 1;
        if (d5 > 1.0000100135803223d || d5 < 0.9999899864196777d) {
            int i15 = this.f11427j;
            int i16 = this.f11425h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.f11432o;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        m5831a(i17, iMin);
                        this.f11432o -= iMin;
                        i17 += iMin;
                        f2 = f5;
                        d2 = d5;
                        i6 = i16;
                    } else {
                        int i19 = i12 > 4000 ? i12 / 4000 : i14;
                        int i20 = this.f11424g;
                        int i21 = this.f11423f;
                        if (i13 == i14) {
                            if (i19 == i14) {
                                iMo5809k = zzcsVar.mo5799a(i17, i21, i20);
                                f2 = f5;
                                i2 = i14;
                            } else {
                                i2 = i14;
                            }
                            if (zzcsVar.zzc()) {
                                i3 = this.f11433p;
                            } else {
                                i3 = iMo5809k;
                            }
                            i4 = i17 + i3;
                            zzcsVar.zzi();
                            this.f11433p = iMo5809k;
                            d = i3;
                            if (d5 > 1.0d) {
                                d4 = d5 - 1.0d;
                                if (d5 >= 2.0d) {
                                    d2 = d5;
                                    int i22 = i3;
                                    double d6 = (d / d4) + this.f11434q;
                                    iRound = (int) Math.round(d6);
                                    i8 = i22;
                                    this.f11434q = d6 - ((double) iRound);
                                } else {
                                    i8 = i3;
                                    d2 = d5;
                                    double d7 = ((d * (2.0d - d2)) / d4) + this.f11434q;
                                    int iRound2 = (int) Math.round(d7);
                                    this.f11432o = iRound2;
                                    this.f11434q = d7 - ((double) iRound2);
                                    iRound = i8;
                                }
                                zzcsVar.mo5797E(iRound);
                                int i23 = i16;
                                int i24 = iRound;
                                zzcsVar.mo5803e(i24, i2, this.f11428k, i17, i4);
                                this.f11428k += i24;
                                i6 = i23;
                                i17 = i8 + i24 + i17;
                            } else {
                                i5 = i3;
                                d2 = d5;
                                i6 = i16;
                                d3 = 1.0d - d2;
                                if (d2 < 0.5d) {
                                    double d8 = ((d * d2) / d3) + this.f11434q;
                                    int iRound3 = (int) Math.round(d8);
                                    this.f11434q = d8 - ((double) iRound3);
                                    i7 = iRound3;
                                } else {
                                    double d9 = ((d * ((d2 + d2) - 1.0d)) / d3) + this.f11434q;
                                    int iRound4 = (int) Math.round(d9);
                                    this.f11432o = iRound4;
                                    this.f11434q = d9 - ((double) iRound4);
                                    i7 = i5;
                                }
                                int i25 = i5 + i7;
                                zzcsVar.mo5797E(i25);
                                System.arraycopy(zzcsVar.mo5812n(), i17 * i2, zzcsVar.mo5804f(), this.f11428k * i2, i5 * i2);
                                int i26 = i17;
                                zzcsVar.mo5803e(i7, i2, this.f11428k + i5, i4, i26);
                                this.f11428k += i25;
                                i17 = i26 + i7;
                            }
                        } else {
                            i2 = i13;
                        }
                        zzcsVar.mo5805g(i17, i19);
                        f2 = f5;
                        int iMo5809k2 = zzcsVar.mo5809k(i21 / i19, i20 / i19);
                        if (i19 != 1) {
                            int i27 = iMo5809k2 * i19;
                            int i28 = i19 * 4;
                            int i29 = i27 - i28;
                            if (i29 >= i21) {
                                i21 = i29;
                            }
                            int i30 = i27 + i28;
                            if (i30 <= i20) {
                                i20 = i30;
                            }
                            if (i2 == 1) {
                                iMo5809k = zzcsVar.mo5799a(i17, i21, i20);
                            } else {
                                zzcsVar.mo5805g(i17, 1);
                                iMo5809k = zzcsVar.mo5809k(i21, i20);
                            }
                        } else {
                            iMo5809k = iMo5809k2;
                        }
                        if (zzcsVar.zzc()) {
                            i3 = this.f11433p;
                        } else {
                            i3 = iMo5809k;
                        }
                        i4 = i17 + i3;
                        zzcsVar.zzi();
                        this.f11433p = iMo5809k;
                        d = i3;
                        if (d5 > 1.0d) {
                            d4 = d5 - 1.0d;
                            if (d5 >= 2.0d) {
                                d2 = d5;
                                int i210 = i3;
                                double d10 = (d / d4) + this.f11434q;
                                iRound = (int) Math.round(d10);
                                i8 = i210;
                                this.f11434q = d10 - ((double) iRound);
                            } else {
                                i8 = i3;
                                d2 = d5;
                                double d11 = ((d * (2.0d - d2)) / d4) + this.f11434q;
                                int iRound5 = (int) Math.round(d11);
                                this.f11432o = iRound5;
                                this.f11434q = d11 - ((double) iRound5);
                                iRound = i8;
                            }
                            zzcsVar.mo5797E(iRound);
                            int i211 = i16;
                            int i212 = iRound;
                            zzcsVar.mo5803e(i212, i2, this.f11428k, i17, i4);
                            this.f11428k += i212;
                            i6 = i211;
                            i17 = i8 + i212 + i17;
                        } else {
                            i5 = i3;
                            d2 = d5;
                            i6 = i16;
                            d3 = 1.0d - d2;
                            if (d2 < 0.5d) {
                                double d12 = ((d * d2) / d3) + this.f11434q;
                                int iRound6 = (int) Math.round(d12);
                                this.f11434q = d12 - ((double) iRound6);
                                i7 = iRound6;
                            } else {
                                double d13 = ((d * ((d2 + d2) - 1.0d)) / d3) + this.f11434q;
                                int iRound7 = (int) Math.round(d13);
                                this.f11432o = iRound7;
                                this.f11434q = d13 - ((double) iRound7);
                                i7 = i5;
                            }
                            int i213 = i5 + i7;
                            zzcsVar.mo5797E(i213);
                            System.arraycopy(zzcsVar.mo5812n(), i17 * i2, zzcsVar.mo5804f(), this.f11428k * i2, i5 * i2);
                            int i214 = i17;
                            zzcsVar.mo5803e(i7, i2, this.f11428k + i5, i4, i214);
                            this.f11428k += i213;
                            i17 = i214 + i7;
                        }
                    }
                    if (i17 + i6 > i15) {
                        break;
                    }
                    f5 = f2;
                    i16 = i6;
                    d5 = d2;
                    i14 = 1;
                }
                int i31 = this.f11427j - i17;
                System.arraycopy(zzcsVar.mo5812n(), i17 * i13, zzcsVar.mo5812n(), 0, i31 * i13);
                this.f11427j = i31;
            }
            f3 = this.f11422e * f2;
            if (f3 != 1.0f || this.f11428k == i11) {
            }
            long j4 = (long) (i12 / f3);
            long j5 = i12;
            while (j4 != 0 && j5 != 0 && j4 % 2 == 0 && j5 % 2 == 0) {
                j4 /= 2;
                j5 /= 2;
            }
            int i32 = this.f11428k - i11;
            zzcsVar.mo5802d(i32);
            System.arraycopy(zzcsVar.mo5804f(), i11 * i13, zzcsVar.mo5807i(), this.f11429l * i13, i32 * i13);
            this.f11428k = i11;
            this.f11429l += i32;
            int i33 = 0;
            while (true) {
                i9 = this.f11429l - 1;
                if (i33 >= i9) {
                    break;
                }
                while (true) {
                    i10 = this.f11430m + 1;
                    j2 = i10;
                    long j6 = j2 * j4;
                    j3 = this.f11431n;
                    if (j6 <= j3 * j5) {
                        break;
                    }
                    zzcsVar.mo5797E(1);
                    zzcsVar.mo5800b(i33, j5, j4);
                    this.f11431n++;
                    this.f11428k++;
                }
                this.f11430m = i10;
                if (j2 == j5) {
                    this.f11430m = 0;
                    zzgtr.m7133f(j3 == j4);
                    this.f11431n = 0;
                }
                i33++;
            }
            if (i9 != 0) {
                System.arraycopy(zzcsVar.mo5807i(), i9 * i13, zzcsVar.mo5807i(), 0, (this.f11429l - i9) * i13);
                this.f11429l -= i9;
                return;
            }
            return;
        }
        m5831a(0, this.f11427j);
        this.f11427j = 0;
        f2 = f5;
        f3 = this.f11422e * f2;
        if (f3 != 1.0f) {
        }
    }
}
