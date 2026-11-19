package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzidr extends zzidu {

    /* JADX INFO: renamed from: c */
    public final byte[] f19743c;

    /* JADX INFO: renamed from: d */
    public final int f19744d;

    /* JADX INFO: renamed from: e */
    public int f19745e;

    public zzidr(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1456a.m2443j(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f19743c = bArr;
        this.f19745e = 0;
        this.f19744d = i2;
    }

    /* JADX INFO: renamed from: A */
    public final void m8250A(byte[] bArr, int i2, int i3) throws zzids {
        try {
            System.arraycopy(bArr, i2, this.f19743c, this.f19745e, i3);
            this.f19745e += i3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzids(this.f19745e, this.f19744d, i3, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* JADX INFO: renamed from: a */
    public final void mo8129a(byte[] bArr, int i2, int i3) throws zzids {
        m8250A(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: e */
    public final void mo8251e(int i2, int i3) throws zzids {
        mo8267u((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: f */
    public final void mo8252f(int i2, int i3) throws zzids {
        mo8267u(i2 << 3);
        mo8266t(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: g */
    public final void mo8253g(int i2, int i3) throws zzids {
        mo8267u(i2 << 3);
        mo8267u(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: h */
    public final void mo8254h(int i2, int i3) throws zzids {
        mo8267u((i2 << 3) | 5);
        mo8268v(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: i */
    public final void mo8255i(int i2, long j2) throws zzids {
        mo8267u(i2 << 3);
        mo8269w(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: j */
    public final void mo8256j(int i2, long j2) throws zzids {
        mo8267u((i2 << 3) | 1);
        mo8270x(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: k */
    public final void mo8257k(int i2, boolean z) throws zzids {
        mo8267u(i2 << 3);
        mo8265s(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: l */
    public final void mo8258l(int i2, String str) throws zzids {
        mo8267u((i2 << 3) | 2);
        mo8271y(str);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: m */
    public final void mo8259m(int i2, zzidl zzidlVar) throws zzids {
        mo8267u((i2 << 3) | 2);
        mo8260n(zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: n */
    public final void mo8260n(zzidl zzidlVar) throws zzids {
        mo8267u(zzidlVar.mo8132h());
        zzidlVar.mo8137q(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: o */
    public final void mo8261o(int i2, byte[] bArr) throws zzids {
        mo8267u(i2);
        m8250A(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: p */
    public final void mo8262p(int i2, zzifz zzifzVar) throws zzids {
        mo8267u(11);
        mo8253g(2, i2);
        mo8267u(26);
        mo8264r(zzifzVar);
        mo8267u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: q */
    public final void mo8263q(int i2, zzidl zzidlVar) throws zzids {
        mo8267u(11);
        mo8253g(2, i2);
        mo8259m(3, zzidlVar);
        mo8267u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: r */
    public final void mo8264r(zzifz zzifzVar) throws zzids {
        mo8267u(zzifzVar.mo8339a());
        zzifzVar.mo8104f(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: s */
    public final void mo8265s(byte b) throws zzids {
        int i2 = this.f19745e;
        try {
            int i3 = i2 + 1;
            try {
                this.f19743c[i2] = b;
                this.f19745e = i3;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i2 = i3;
                throw new zzids(i2, this.f19744d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: t */
    public final void mo8266t(int i2) throws zzids {
        if (i2 >= 0) {
            mo8267u(i2);
        } else {
            mo8269w(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: u */
    public final void mo8267u(int i2) throws zzids {
        int i3;
        int i4 = this.f19745e;
        while (true) {
            int i5 = i2 & (-128);
            byte[] bArr = this.f19743c;
            if (i5 == 0) {
                i3 = i4 + 1;
                bArr[i4] = (byte) i2;
                this.f19745e = i3;
                return;
            } else {
                i3 = i4 + 1;
                try {
                    bArr[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzids(i3, this.f19744d, 1, e);
                }
            }
            throw new zzids(i3, this.f19744d, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: v */
    public final void mo8268v(int i2) throws zzids {
        int i3 = this.f19745e;
        try {
            byte[] bArr = this.f19743c;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.f19745e = i3 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzids(i3, this.f19744d, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: w */
    public final void mo8269w(long j2) throws zzids {
        int i2;
        int i3 = this.f19745e;
        int i4 = this.f19744d;
        byte[] bArr = this.f19743c;
        if (!zzidu.f19750b || i4 - i3 < 10) {
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
                    throw new zzids(i2, i4, 1, e);
                }
            }
            i2 = i3 + 1;
            try {
                bArr[i3] = (byte) j3;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzids(i2, i4, 1, e);
            }
        } else {
            long j4 = j2;
            while ((j4 & (-128)) != 0) {
                zzihk.m8479m(bArr, i3, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzihk.m8479m(bArr, i3, (byte) j4);
        }
        this.f19745e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: x */
    public final void mo8270x(long j2) throws zzids {
        int i2 = this.f19745e;
        try {
            byte[] bArr = this.f19743c;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.f19745e = i2 + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzids(i2, this.f19744d, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: y */
    public final void mo8271y(String str) throws zzids {
        int i2 = this.f19745e;
        try {
            int iM8280b = zzidu.m8280b(str.length() * 3);
            int iM8280b2 = zzidu.m8280b(str.length());
            byte[] bArr = this.f19743c;
            if (iM8280b2 != iM8280b) {
                mo8267u(zzihp.m8487b(str));
                int i3 = this.f19745e;
                this.f19745e = zzihp.m8488c(str, bArr, i3, bArr.length - i3);
            } else {
                int i4 = i2 + iM8280b2;
                this.f19745e = i4;
                int iM8488c = zzihp.m8488c(str, bArr, i4, bArr.length - i4);
                this.f19745e = i2;
                mo8267u((iM8488c - i2) - iM8280b2);
                this.f19745e = iM8488c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzids(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: z */
    public final int mo8272z() {
        return this.f19744d - this.f19745e;
    }
}
