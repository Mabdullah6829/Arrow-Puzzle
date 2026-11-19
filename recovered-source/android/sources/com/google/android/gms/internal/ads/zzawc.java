package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawc {

    /* JADX INFO: renamed from: a */
    public int f7164a;

    /* JADX INFO: renamed from: b */
    public zzavx f7165b;

    /* JADX INFO: renamed from: c */
    public zzavl f7166c;

    /* JADX INFO: renamed from: d */
    public zzavo f7167d;

    public zzawc() {
        this(new zzavo(1));
    }

    /* JADX INFO: renamed from: g */
    public static final void m4452g(long j2) throws zzawa {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        if (j2 % (((((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzawa();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4453a(long j2) {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        m4452g(j2);
        long j11 = j2 / (((((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9) ^ (j10 % 899334107));
        if (j11 < 0 || j11 > this.f7165b.f7096a.length) {
            throw new zzawb();
        }
        this.f7164a = (int) j11;
    }

    /* JADX INFO: renamed from: b */
    public final long m4454b() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        return ((long) this.f7164a) * (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    /* JADX INFO: renamed from: c */
    public final long m4455c() throws zzawb {
        try {
            zzavl zzavlVar = this.f7166c;
            zzavx zzavxVar = this.f7165b;
            int i2 = this.f7164a;
            this.f7164a = i2 + 1;
            return zzavlVar.mo4439a(zzavxVar, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new zzawb(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m4456d() {
        try {
            zzavl zzavlVar = this.f7166c;
            zzavx zzavxVar = this.f7165b;
            int i2 = this.f7164a;
            this.f7164a = i2 + 1;
            int iMo4439a = zzavlVar.mo4439a(zzavxVar, i2) & 255;
            zzavl zzavlVar2 = this.f7166c;
            zzavx zzavxVar2 = this.f7165b;
            int i3 = this.f7164a;
            this.f7164a = i3 + 1;
            int iMo4439a2 = iMo4439a | ((zzavlVar2.mo4439a(zzavxVar2, i3) & 255) << 8);
            zzavl zzavlVar3 = this.f7166c;
            zzavx zzavxVar3 = this.f7165b;
            int i4 = this.f7164a;
            this.f7164a = i4 + 1;
            int iMo4439a3 = iMo4439a2 | ((zzavlVar3.mo4439a(zzavxVar3, i4) & 255) << 16);
            zzavl zzavlVar4 = this.f7166c;
            zzavx zzavxVar4 = this.f7165b;
            int i5 = this.f7164a;
            this.f7164a = i5 + 1;
            return iMo4439a3 | (zzavlVar4.mo4439a(zzavxVar4, i5) << 24);
        } catch (IndexOutOfBoundsException e) {
            throw new zzawb(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m4457e() throws zzavz, zzawb {
        int i2 = 0;
        long j2 = 0;
        while (i2 < 64) {
            try {
                zzavl zzavlVar = this.f7166c;
                zzavx zzavxVar = this.f7165b;
                int i3 = this.f7164a;
                this.f7164a = i3 + 1;
                byte bMo4439a = zzavlVar.mo4439a(zzavxVar, i3);
                j2 |= ((long) (bMo4439a & 127)) << i2;
                if (i2 == 63) {
                    if (bMo4439a > 1) {
                        throw new zzavz();
                    }
                    i2 = 63;
                }
                if ((bMo4439a & 128) == 0) {
                    return (-(j2 & 1)) ^ (j2 >>> 1);
                }
                i2 += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzawb(e);
            }
        }
        throw new zzavz();
    }

    /* JADX INFO: renamed from: f */
    public final zzavx m4458f(long j2) throws zzawb, zzawa {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iM3770b = AbstractC5152f.m3770b((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        m4452g(m4454b() + j2);
        int i10 = this.f7164a;
        long j3 = i10;
        zzavx zzavxVar = this.f7165b;
        long j4 = (j2 >> ((i9 % 774318984) ^ iM3770b)) + j3;
        if (j4 > zzavxVar.f7096a.length || j4 < j3) {
            throw new zzawb();
        }
        try {
            int i11 = (int) j4;
            zzavx zzavxVarMo4440b = this.f7166c.mo4440b(zzavxVar, i10, i11);
            this.f7164a = i11;
            return zzavxVarMo4440b;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(zzavv.m4444a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public zzawc(zzavo zzavoVar) {
        this(zzavx.f7094b, 0, new zzavm());
        this.f7167d = zzavoVar;
    }

    public zzawc(zzavx zzavxVar, int i2, zzavl zzavlVar) {
        this.f7165b = zzavxVar;
        this.f7164a = i2;
        this.f7166c = zzavlVar;
    }
}
