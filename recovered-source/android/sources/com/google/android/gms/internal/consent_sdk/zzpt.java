package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzpt extends zzpq {
    /* JADX INFO: renamed from: C */
    public final void m9180C() {
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public final void m9181D(int i2) {
        if (0 - this.f21716d < i2) {
            m9180C();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9182E(int i2, byte[] bArr) {
        int i3 = this.f21716d;
        int i4 = 0 - i3;
        if (i4 >= i2) {
            System.arraycopy(bArr, 0, null, i3, i2);
            this.f21716d += i2;
            return;
        }
        System.arraycopy(bArr, 0, null, i3, i4);
        this.f21716d = 0;
        m9180C();
        int i5 = i2 - i4;
        if (i5 > 0) {
            throw null;
        }
        System.arraycopy(bArr, i4, null, 0, i5);
        this.f21716d = i5;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    /* JADX INFO: renamed from: a */
    public final void mo9147a(int i2, byte[] bArr) {
        m9182E(i2, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: f */
    public final void mo9160f(byte b) {
        if (this.f21716d == 0) {
            m9180C();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: g */
    public final void mo9161g(int i2, boolean z) {
        m9181D(11);
        m9156A(i2 << 3);
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: h */
    public final void mo9162h(int i2, byte[] bArr) {
        mo9176v(i2);
        m9182E(i2, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: i */
    public final void mo9163i(int i2, zzpm zzpmVar) {
        mo9176v((i2 << 3) | 2);
        mo9164j(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: j */
    public final void mo9164j(zzpm zzpmVar) {
        mo9176v(zzpmVar.mo9150d());
        zzpmVar.mo9153j(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: k */
    public final void mo9165k(int i2, int i3) {
        m9181D(14);
        m9156A((i2 << 3) | 5);
        m9158y(i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: l */
    public final void mo9166l(int i2) {
        m9181D(4);
        m9158y(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: m */
    public final void mo9167m(int i2, long j2) {
        m9181D(18);
        m9156A((i2 << 3) | 1);
        m9159z(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: n */
    public final void mo9168n(long j2) {
        m9181D(8);
        m9159z(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: o */
    public final void mo9169o(int i2, int i3) {
        m9181D(20);
        m9156A(i2 << 3);
        if (i3 >= 0) {
            m9156A(i3);
        } else {
            m9157B(i3);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: p */
    public final void mo9170p(int i2) {
        if (i2 >= 0) {
            mo9176v(i2);
        } else {
            mo9178x(i2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: q */
    public final void mo9171q(zzrq zzrqVar) {
        mo9176v(zzrqVar.mo9224g());
        zzrqVar.mo9221a(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: r */
    public final void mo9172r(int i2, String str) throws zzps {
        mo9176v((i2 << 3) | 2);
        mo9173s(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: s */
    public final void mo9173s(String str) throws zzps {
        try {
            int length = str.length() * 3;
            int iM9184c = zzpv.m9184c(length);
            int i2 = iM9184c + length;
            if (i2 > 0) {
                byte[] bArr = new byte[length];
                int iM9297a = zzsy.m9297a(str, bArr, 0, length);
                mo9176v(iM9297a);
                m9182E(iM9297a, bArr);
                return;
            }
            if (i2 > 0 - this.f21716d) {
                m9180C();
            }
            int iM9184c2 = zzpv.m9184c(str.length());
            int i3 = this.f21716d;
            try {
                if (iM9184c2 == iM9184c) {
                    int i4 = i3 + iM9184c2;
                    this.f21716d = i4;
                    int iM9297a2 = zzsy.m9297a(str, null, i4, 0 - i4);
                    this.f21716d = i3;
                    m9156A((iM9297a2 - i3) - iM9184c2);
                    this.f21716d = iM9297a2;
                } else {
                    int iM9298b = zzsy.m9298b(str);
                    m9156A(iM9298b);
                    this.f21716d = zzsy.m9297a(str, null, this.f21716d, iM9298b);
                }
            } catch (zzsx e) {
                this.f21716d = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzps(e2);
            }
        } catch (zzsx e3) {
            m9186e(str, e3);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: t */
    public final void mo9174t(int i2, int i3) {
        mo9176v((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: u */
    public final void mo9175u(int i2, int i3) {
        m9181D(20);
        m9156A(i2 << 3);
        m9156A(i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: v */
    public final void mo9176v(int i2) {
        m9181D(5);
        m9156A(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: w */
    public final void mo9177w(int i2, long j2) {
        m9181D(20);
        m9156A(i2 << 3);
        m9157B(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: x */
    public final void mo9178x(long j2) {
        m9181D(10);
        m9157B(j2);
    }
}
