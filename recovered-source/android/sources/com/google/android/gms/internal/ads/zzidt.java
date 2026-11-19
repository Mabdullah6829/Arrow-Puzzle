package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zzidt extends zzidu {

    /* JADX INFO: renamed from: c */
    public final byte[] f19746c;

    /* JADX INFO: renamed from: d */
    public final int f19747d;

    /* JADX INFO: renamed from: e */
    public int f19748e;

    /* JADX INFO: renamed from: f */
    public final OutputStream f19749f;

    public zzidt(OutputStream outputStream, int i2) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f19749f = outputStream;
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.f19746c = bArr;
        this.f19747d = bArr.length;
    }

    /* JADX INFO: renamed from: A */
    public final void m8273A(long j2) {
        boolean z = zzidu.f19750b;
        byte[] bArr = this.f19746c;
        if (z) {
            while (true) {
                int i2 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    int i3 = this.f19748e;
                    this.f19748e = i3 + 1;
                    zzihk.m8479m(bArr, i3, (byte) i2);
                    return;
                } else {
                    int i4 = this.f19748e;
                    this.f19748e = i4 + 1;
                    zzihk.m8479m(bArr, i4, (byte) (i2 | 128));
                    j2 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i5 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    int i6 = this.f19748e;
                    this.f19748e = i6 + 1;
                    bArr[i6] = (byte) i5;
                    return;
                } else {
                    int i7 = this.f19748e;
                    this.f19748e = i7 + 1;
                    bArr[i7] = (byte) (i5 | 128);
                    j2 >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8274B(int i2) {
        int i3 = this.f19748e;
        byte[] bArr = this.f19746c;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.f19748e = i3 + 4;
    }

    /* JADX INFO: renamed from: C */
    public final void m8275C(long j2) {
        int i2 = this.f19748e;
        byte[] bArr = this.f19746c;
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >> 8);
        bArr[i2 + 2] = (byte) (j2 >> 16);
        bArr[i2 + 3] = (byte) (j2 >> 24);
        bArr[i2 + 4] = (byte) (j2 >> 32);
        bArr[i2 + 5] = (byte) (j2 >> 40);
        bArr[i2 + 6] = (byte) (j2 >> 48);
        bArr[i2 + 7] = (byte) (j2 >> 56);
        this.f19748e = i2 + 8;
    }

    /* JADX INFO: renamed from: D */
    public final void m8276D(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f19748e;
        int i5 = this.f19747d;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f19746c;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f19748e += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        this.f19748e = i5;
        m8278F();
        int i8 = i3 - i6;
        if (i8 > i5) {
            this.f19749f.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f19748e = i8;
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8277E(int i2) {
        if (this.f19747d - this.f19748e < i2) {
            m8278F();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8278F() {
        this.f19749f.write(this.f19746c, 0, this.f19748e);
        this.f19748e = 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m8279G(int i2) {
        boolean z = zzidu.f19750b;
        byte[] bArr = this.f19746c;
        if (z) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f19748e;
                this.f19748e = i3 + 1;
                zzihk.m8479m(bArr, i3, (byte) (i2 | 128));
                i2 >>>= 7;
            }
            int i4 = this.f19748e;
            this.f19748e = i4 + 1;
            zzihk.m8479m(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f19748e;
            this.f19748e = i5 + 1;
            bArr[i5] = (byte) (i2 | 128);
            i2 >>>= 7;
        }
        int i6 = this.f19748e;
        this.f19748e = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* JADX INFO: renamed from: a */
    public final void mo8129a(byte[] bArr, int i2, int i3) throws IOException {
        m8276D(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: e */
    public final void mo8251e(int i2, int i3) {
        mo8267u((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: f */
    public final void mo8252f(int i2, int i3) {
        m8277E(20);
        m8279G(i2 << 3);
        if (i3 >= 0) {
            m8279G(i3);
        } else {
            m8273A(i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: g */
    public final void mo8253g(int i2, int i3) {
        m8277E(20);
        m8279G(i2 << 3);
        m8279G(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: h */
    public final void mo8254h(int i2, int i3) {
        m8277E(14);
        m8279G((i2 << 3) | 5);
        m8274B(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: i */
    public final void mo8255i(int i2, long j2) {
        m8277E(20);
        m8279G(i2 << 3);
        m8273A(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: j */
    public final void mo8256j(int i2, long j2) {
        m8277E(18);
        m8279G((i2 << 3) | 1);
        m8275C(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: k */
    public final void mo8257k(int i2, boolean z) {
        m8277E(11);
        m8279G(i2 << 3);
        int i3 = this.f19748e;
        this.f19746c[i3] = z ? (byte) 1 : (byte) 0;
        this.f19748e = i3 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: l */
    public final void mo8258l(int i2, String str) throws IOException {
        mo8267u((i2 << 3) | 2);
        mo8271y(str);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: m */
    public final void mo8259m(int i2, zzidl zzidlVar) {
        mo8267u((i2 << 3) | 2);
        mo8260n(zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: n */
    public final void mo8260n(zzidl zzidlVar) {
        mo8267u(zzidlVar.mo8132h());
        zzidlVar.mo8137q(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: o */
    public final void mo8261o(int i2, byte[] bArr) throws IOException {
        mo8267u(i2);
        m8276D(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: p */
    public final void mo8262p(int i2, zzifz zzifzVar) {
        mo8267u(11);
        mo8253g(2, i2);
        mo8267u(26);
        mo8264r(zzifzVar);
        mo8267u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: q */
    public final void mo8263q(int i2, zzidl zzidlVar) {
        mo8267u(11);
        mo8253g(2, i2);
        mo8259m(3, zzidlVar);
        mo8267u(12);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: r */
    public final void mo8264r(zzifz zzifzVar) {
        mo8267u(zzifzVar.mo8339a());
        zzifzVar.mo8104f(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: s */
    public final void mo8265s(byte b) {
        if (this.f19748e == this.f19747d) {
            m8278F();
        }
        int i2 = this.f19748e;
        this.f19746c[i2] = b;
        this.f19748e = i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: t */
    public final void mo8266t(int i2) {
        if (i2 >= 0) {
            mo8267u(i2);
        } else {
            mo8269w(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: u */
    public final void mo8267u(int i2) {
        m8277E(5);
        m8279G(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: v */
    public final void mo8268v(int i2) {
        m8277E(4);
        m8274B(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: w */
    public final void mo8269w(long j2) {
        m8277E(10);
        m8273A(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: x */
    public final void mo8270x(long j2) {
        m8277E(8);
        m8275C(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: y */
    public final void mo8271y(String str) throws IOException {
        int length = str.length() * 3;
        int iM8280b = zzidu.m8280b(length);
        int i2 = iM8280b + length;
        int i3 = this.f19747d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iM8488c = zzihp.m8488c(str, bArr, 0, length);
            mo8267u(iM8488c);
            m8276D(bArr, 0, iM8488c);
            return;
        }
        if (i2 > i3 - this.f19748e) {
            m8278F();
        }
        int iM8280b2 = zzidu.m8280b(str.length());
        int i4 = this.f19748e;
        byte[] bArr2 = this.f19746c;
        try {
            if (iM8280b2 == iM8280b) {
                int i5 = i4 + iM8280b2;
                this.f19748e = i5;
                int iM8488c2 = zzihp.m8488c(str, bArr2, i5, i3 - i5);
                this.f19748e = i4;
                m8279G((iM8488c2 - i4) - iM8280b2);
                this.f19748e = iM8488c2;
            } else {
                int iM8487b = zzihp.m8487b(str);
                m8279G(iM8487b);
                this.f19748e = zzihp.m8488c(str, bArr2, this.f19748e, iM8487b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzids(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidu
    /* JADX INFO: renamed from: z */
    public final int mo8272z() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
