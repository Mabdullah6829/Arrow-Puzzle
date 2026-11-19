package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzpr extends zzpv {

    /* JADX INFO: renamed from: d */
    public final byte[] f21717d;

    /* JADX INFO: renamed from: e */
    public final int f21718e;

    /* JADX INFO: renamed from: f */
    public int f21719f;

    public zzpr(byte[] bArr, int i2) {
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC1456a.m2443j(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f21717d = bArr;
        this.f21719f = 0;
        this.f21718e = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    /* JADX INFO: renamed from: a */
    public final void mo9147a(int i2, byte[] bArr) throws zzps {
        m9179y(i2, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: f */
    public final void mo9160f(byte b) throws zzps {
        int i2 = this.f21719f;
        try {
            int i3 = i2 + 1;
            try {
                this.f21717d[i2] = b;
                this.f21719f = i3;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i2 = i3;
                throw new zzps(i2, this.f21718e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: g */
    public final void mo9161g(int i2, boolean z) throws zzps {
        mo9176v(i2 << 3);
        mo9160f(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: h */
    public final void mo9162h(int i2, byte[] bArr) throws zzps {
        mo9176v(i2);
        m9179y(i2, bArr);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: i */
    public final void mo9163i(int i2, zzpm zzpmVar) throws zzps {
        mo9176v((i2 << 3) | 2);
        mo9164j(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: j */
    public final void mo9164j(zzpm zzpmVar) throws zzps {
        mo9176v(zzpmVar.mo9150d());
        zzpmVar.mo9153j(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: k */
    public final void mo9165k(int i2, int i3) throws zzps {
        mo9176v((i2 << 3) | 5);
        mo9166l(i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: l */
    public final void mo9166l(int i2) throws zzps {
        int i3 = this.f21719f;
        try {
            byte[] bArr = this.f21717d;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.f21719f = i3 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(i3, this.f21718e, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: m */
    public final void mo9167m(int i2, long j2) throws zzps {
        mo9176v((i2 << 3) | 1);
        mo9168n(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: n */
    public final void mo9168n(long j2) throws zzps {
        int i2 = this.f21719f;
        try {
            byte[] bArr = this.f21717d;
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            this.f21719f = i2 + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(i2, this.f21718e, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: o */
    public final void mo9169o(int i2, int i3) throws zzps {
        mo9176v(i2 << 3);
        mo9170p(i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: p */
    public final void mo9170p(int i2) throws zzps {
        if (i2 >= 0) {
            mo9176v(i2);
        } else {
            mo9178x(i2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: q */
    public final void mo9171q(zzrq zzrqVar) throws zzps {
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
        int i2 = this.f21719f;
        try {
            int iM9184c = zzpv.m9184c(str.length() * 3);
            int iM9184c2 = zzpv.m9184c(str.length());
            int i3 = this.f21718e;
            byte[] bArr = this.f21717d;
            if (iM9184c2 != iM9184c) {
                mo9176v(zzsy.m9298b(str));
                int i4 = this.f21719f;
                this.f21719f = zzsy.m9297a(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + iM9184c2;
                this.f21719f = i5;
                int iM9297a = zzsy.m9297a(str, bArr, i5, i3 - i5);
                this.f21719f = i2;
                mo9176v((iM9297a - i2) - iM9184c2);
                this.f21719f = iM9297a;
            }
        } catch (zzsx e) {
            this.f21719f = i2;
            m9186e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzps(e2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: t */
    public final void mo9174t(int i2, int i3) throws zzps {
        mo9176v((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: u */
    public final void mo9175u(int i2, int i3) throws zzps {
        mo9176v(i2 << 3);
        mo9176v(i3);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: v */
    public final void mo9176v(int i2) throws zzps {
        int i3;
        int i4 = this.f21719f;
        while (true) {
            int i5 = i2 & (-128);
            byte[] bArr = this.f21717d;
            if (i5 == 0) {
                i3 = i4 + 1;
                bArr[i4] = (byte) i2;
                this.f21719f = i3;
                return;
            } else {
                i3 = i4 + 1;
                try {
                    bArr[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzps(i3, this.f21718e, 1, e);
                }
            }
            throw new zzps(i3, this.f21718e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: w */
    public final void mo9177w(int i2, long j2) throws zzps {
        mo9176v(i2 << 3);
        mo9178x(j2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    /* JADX INFO: renamed from: x */
    public final void mo9178x(long j2) throws zzps {
        int i2;
        int i3 = this.f21719f;
        boolean z = zzpv.f21721c;
        int i4 = this.f21718e;
        byte[] bArr = this.f21717d;
        if (!z || i4 - i3 < 10) {
            long j3 = j2;
            while ((j3 & (-128)) != 0) {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzps(i2, i4, 1, e);
                }
            }
            i2 = i3 + 1;
            bArr[i3] = (byte) j3;
        } else {
            long j4 = j2;
            while ((j4 & (-128)) != 0) {
                zzsw.m9292j(bArr, i3, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzsw.m9292j(bArr, i3, (byte) j4);
        }
        this.f21719f = i2;
    }

    /* JADX INFO: renamed from: y */
    public final void m9179y(int i2, byte[] bArr) throws zzps {
        try {
            System.arraycopy(bArr, 0, this.f21717d, this.f21719f, i2);
            this.f21719f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(this.f21719f, this.f21718e, i2, e);
        }
    }
}
