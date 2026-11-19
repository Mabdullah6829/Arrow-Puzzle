package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafr implements zzagb {

    /* JADX INFO: renamed from: b */
    public final zzj f5212b;

    /* JADX INFO: renamed from: c */
    public final long f5213c;

    /* JADX INFO: renamed from: d */
    public long f5214d;

    /* JADX INFO: renamed from: f */
    public int f5216f;

    /* JADX INFO: renamed from: g */
    public int f5217g;

    /* JADX INFO: renamed from: e */
    public byte[] f5215e = new byte[65536];

    /* JADX INFO: renamed from: a */
    public final byte[] f5211a = new byte[4096];

    static {
        zzal.m4188a("media3.extractor");
    }

    public zzafr(zzj zzjVar, long j2, long j3) {
        this.f5212b = zzjVar;
        this.f5214d = j2;
        this.f5213c = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: E */
    public final void mo4075E(int i2) throws EOFException, InterruptedIOException {
        m4085f(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: F */
    public final void mo4076F(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        mo4079I(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: G */
    public final boolean mo4077G(int i2, boolean z) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f5217g, i2);
        m4088i(iMin);
        int iM4090k = iMin;
        while (iM4090k < i2 && iM4090k != -1) {
            iM4090k = m4090k(this.f5211a, -iM4090k, Math.min(i2, iM4090k + 4096), iM4090k, z);
        }
        if (iM4090k != -1) {
            this.f5214d += (long) iM4090k;
        }
        return iM4090k != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: H */
    public final void mo4078H(byte[] bArr, int i2, int i3) {
        mo4081K(bArr, i2, i3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: I */
    public final boolean mo4079I(byte[] bArr, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        int iMin;
        int i4 = this.f5217g;
        if (i4 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i4, i3);
            System.arraycopy(this.f5215e, 0, bArr, i2, iMin);
            m4088i(iMin);
        }
        int iM4090k = iMin;
        while (iM4090k < i3 && iM4090k != -1) {
            iM4090k = m4090k(bArr, i2, i3, iM4090k, z);
        }
        if (iM4090k != -1) {
            this.f5214d += (long) iM4090k;
        }
        return iM4090k != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: J */
    public final int mo4080J(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        zzafr zzafrVar;
        int iMin;
        m4087h(i3);
        int i4 = this.f5217g;
        int i5 = this.f5216f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            zzafrVar = this;
            iMin = zzafrVar.m4090k(this.f5215e, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzafrVar.f5217g += iMin;
        } else {
            zzafrVar = this;
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(zzafrVar.f5215e, zzafrVar.f5216f, bArr, i2, iMin);
        zzafrVar.f5216f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: K */
    public final boolean mo4081K(byte[] bArr, int i2, int i3, boolean z) {
        if (!m4085f(i3, z)) {
            return false;
        }
        System.arraycopy(this.f5215e, this.f5216f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        zzafr zzafrVar;
        int i4 = this.f5217g;
        int iM4090k = 0;
        if (i4 != 0) {
            int iMin = Math.min(i4, i3);
            System.arraycopy(this.f5215e, 0, bArr, i2, iMin);
            m4088i(iMin);
            iM4090k = iMin;
        }
        if (iM4090k == 0) {
            zzafrVar = this;
            iM4090k = zzafrVar.m4090k(bArr, i2, i3, 0, true);
        } else {
            zzafrVar = this;
        }
        if (iM4090k != -1) {
            zzafrVar.f5214d += (long) iM4090k;
        }
        return iM4090k;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: d */
    public final int mo4083d() throws EOFException, InterruptedIOException {
        zzafr zzafrVar;
        int iMin = Math.min(this.f5217g, 1);
        m4088i(iMin);
        if (iMin == 0) {
            zzafrVar = this;
            iMin = zzafrVar.m4090k(this.f5211a, 0, Math.min(1, 4096), 0, true);
        } else {
            zzafrVar = this;
        }
        if (iMin != -1) {
            zzafrVar.f5214d += (long) iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: e */
    public final long mo4084e() {
        return this.f5214d + ((long) this.f5216f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4085f(int i2, boolean z) throws EOFException, InterruptedIOException {
        m4087h(i2);
        int iM4090k = this.f5217g - this.f5216f;
        while (iM4090k < i2) {
            int i3 = i2;
            boolean z2 = z;
            iM4090k = m4090k(this.f5215e, this.f5216f, i3, iM4090k, z2);
            if (iM4090k == -1) {
                return false;
            }
            this.f5217g = this.f5216f + iM4090k;
            i2 = i3;
            z = z2;
        }
        this.f5216f += i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: g */
    public final long mo4086g() {
        return this.f5214d;
    }

    /* JADX INFO: renamed from: h */
    public final void m4087h(int i2) {
        int i3 = this.f5216f + i2;
        int length = this.f5215e.length;
        if (i3 > length) {
            String str = zzfm.f16091a;
            this.f5215e = Arrays.copyOf(this.f5215e, Math.max(65536 + i3, Math.min(length + length, i3 + 524288)));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4088i(int i2) {
        int i3 = this.f5217g - i2;
        this.f5217g = i3;
        this.f5216f = 0;
        byte[] bArr = this.f5215e;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f5215e = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: j */
    public final long mo4089j() {
        return this.f5213c;
    }

    /* JADX INFO: renamed from: k */
    public final int m4090k(byte[] bArr, int i2, int i3, int i4, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo4082b = this.f5212b.mo4082b(bArr, i2 + i4, i3 - i4);
        if (iMo4082b != -1) {
            return i4 + iMo4082b;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    /* JADX INFO: renamed from: o */
    public final void mo4091o(int i2) throws EOFException, InterruptedIOException {
        mo4077G(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzl() {
        this.f5216f = 0;
    }
}
