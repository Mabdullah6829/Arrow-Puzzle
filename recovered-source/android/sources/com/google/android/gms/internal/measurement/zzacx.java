package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzacx extends zzada {

    /* JADX INFO: renamed from: c */
    public final byte[] f21995c;

    /* JADX INFO: renamed from: d */
    public final int f21996d;

    /* JADX INFO: renamed from: e */
    public int f21997e;

    public zzacx(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1456a.m2443j(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f21995c = bArr;
        this.f21997e = 0;
        this.f21996d = i2;
    }

    /* JADX INFO: renamed from: A */
    public final void m9480A(byte[] bArr, int i2, int i3) throws zzacy {
        try {
            System.arraycopy(bArr, i2, this.f21995c, this.f21997e, i3);
            this.f21997e += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(this.f21997e, this.f21996d, i3, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    /* JADX INFO: renamed from: a */
    public final void mo9371a(byte[] bArr, int i2, int i3) throws zzacy {
        m9480A(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: e */
    public final void mo9481e(int i2, int i3) throws zzacy {
        mo9497u((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: f */
    public final void mo9482f(int i2, int i3) throws zzacy {
        mo9497u(i2 << 3);
        mo9496t(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: g */
    public final void mo9483g(int i2, int i3) throws zzacy {
        mo9497u(i2 << 3);
        mo9497u(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: h */
    public final void mo9484h(int i2, int i3) throws zzacy {
        mo9497u((i2 << 3) | 5);
        mo9498v(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: i */
    public final void mo9485i(int i2, long j2) throws zzacy {
        mo9497u(i2 << 3);
        mo9499w(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: j */
    public final void mo9486j(int i2, long j2) throws zzacy {
        mo9497u((i2 << 3) | 1);
        mo9500x(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: k */
    public final void mo9487k(int i2, boolean z) throws zzacy {
        mo9497u(i2 << 3);
        mo9495s(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: l */
    public final void mo9488l(int i2, String str) throws zzacy {
        mo9497u((i2 << 3) | 2);
        mo9501y(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: m */
    public final void mo9489m(int i2, zzacr zzacrVar) throws zzacy {
        mo9497u((i2 << 3) | 2);
        mo9490n(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: n */
    public final void mo9490n(zzacr zzacrVar) throws zzacy {
        mo9497u(zzacrVar.mo9373b());
        zzacrVar.mo9376h(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: o */
    public final void mo9491o(int i2, byte[] bArr) throws zzacy {
        mo9497u(i2);
        m9480A(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: p */
    public final void mo9492p(int i2, zzafc zzafcVar) throws zzacy {
        mo9497u(11);
        mo9483g(2, i2);
        mo9497u(26);
        mo9494r(zzafcVar);
        mo9497u(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: q */
    public final void mo9493q(int i2, zzacr zzacrVar) throws zzacy {
        mo9497u(11);
        mo9483g(2, i2);
        mo9489m(3, zzacrVar);
        mo9497u(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: r */
    public final void mo9494r(zzafc zzafcVar) throws zzacy {
        mo9497u(zzafcVar.mo9567f());
        zzafcVar.mo9349g(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: s */
    public final void mo9495s(byte b) throws zzacy {
        int i2 = this.f21997e;
        try {
            int i3 = i2 + 1;
            try {
                this.f21995c[i2] = b;
                this.f21997e = i3;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i2 = i3;
                throw new zzacy(i2, this.f21996d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: t */
    public final void mo9496t(int i2) throws zzacy {
        if (i2 >= 0) {
            mo9497u(i2);
        } else {
            mo9499w(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: u */
    public final void mo9497u(int i2) throws zzacy {
        int i3;
        int i4 = this.f21997e;
        while (true) {
            int i5 = i2 & (-128);
            byte[] bArr = this.f21995c;
            if (i5 == 0) {
                i3 = i4 + 1;
                bArr[i4] = (byte) i2;
                this.f21997e = i3;
                return;
            } else {
                i3 = i4 + 1;
                try {
                    bArr[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzacy(i3, this.f21996d, 1, e);
                }
            }
            throw new zzacy(i3, this.f21996d, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: v */
    public final void mo9498v(int i2) throws zzacy {
        int i3 = this.f21997e;
        try {
            byte[] bArr = this.f21995c;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.f21997e = i3 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i3, this.f21996d, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: w */
    public final void mo9499w(long j2) throws zzacy {
        int i2;
        int i3 = this.f21997e;
        int i4 = this.f21996d;
        byte[] bArr = this.f21995c;
        if (!zzada.f22004b || i4 - i3 < 10) {
            long j3 = j2;
            while ((j3 & (-128)) != 0) {
                int i5 = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i3 = i5;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i2 = i5;
                    throw new zzacy(i2, i4, 1, e);
                }
            }
            i2 = i3 + 1;
            try {
                bArr[i3] = (byte) j3;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzacy(i2, i4, 1, e);
            }
        } else {
            long j4 = j2;
            while ((j4 & (-128)) != 0) {
                zzagg.m9708k(bArr, i3, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzagg.m9708k(bArr, i3, (byte) j4);
        }
        this.f21997e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: x */
    public final void mo9500x(long j2) throws zzacy {
        int i2 = this.f21997e;
        try {
            byte[] bArr = this.f21995c;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.f21997e = i2 + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i2, this.f21996d, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: y */
    public final void mo9501y(String str) throws zzacy {
        int i2 = this.f21997e;
        try {
            int iM9510b = zzada.m9510b(str.length() * 3);
            int iM9510b2 = zzada.m9510b(str.length());
            byte[] bArr = this.f21995c;
            if (iM9510b2 != iM9510b) {
                mo9497u(zzagl.m9717b(str));
                int i3 = this.f21997e;
                this.f21997e = zzagl.m9718c(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + iM9510b2;
                this.f21997e = i4;
                int iM9718c = zzagl.m9718c(str, bArr, i4, bArr.length - i4);
                this.f21997e = i2;
                mo9497u((iM9718c - i2) - iM9510b2);
                this.f21997e = iM9718c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    /* JADX INFO: renamed from: z */
    public final int mo9502z() {
        return this.f21996d - this.f21997e;
    }
}
