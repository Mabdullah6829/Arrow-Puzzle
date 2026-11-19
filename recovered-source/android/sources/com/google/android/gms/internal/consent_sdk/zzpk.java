package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class zzpk extends zzpj {

    /* JADX INFO: renamed from: u */
    public final byte[] f21712u;

    public zzpk(byte[] bArr) {
        bArr.getClass();
        this.f21712u = bArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: a */
    public byte mo9148a(int i2) {
        return this.f21712u[i2];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: b */
    public byte mo9149b(int i2) {
        return this.f21712u[i2];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: d */
    public int mo9150d() {
        return this.f21712u.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: g */
    public final int mo9151g(int i2, int i3) {
        Charset charset = zzqs.f21747a;
        for (int i4 = 0; i4 < i3; i4++) {
            i2 = (i2 * 31) + this.f21712u[i4];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: h */
    public final zzpm mo9152h() {
        zzpm.m9155I(mo9150d());
        byte[] bArr = this.f21712u;
        zzph zzphVar = new zzph(bArr);
        zzpm.m9155I(bArr.length);
        return zzphVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: j */
    public final void mo9153j(zzpv zzpvVar) {
        zzpvVar.mo9147a(mo9150d(), this.f21712u);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: k */
    public final boolean mo9154k(zzpm zzpmVar) {
        if (!(zzpmVar instanceof zzpk)) {
            return zzpmVar.mo9154k(this);
        }
        int iMo9150d = mo9150d();
        if (iMo9150d > zzpmVar.mo9150d()) {
            throw new IllegalArgumentException("Length too large: " + iMo9150d + mo9150d());
        }
        if (iMo9150d > zzpmVar.mo9150d()) {
            throw new IllegalArgumentException(AbstractC1456a.m2443j(iMo9150d, zzpmVar.mo9150d(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = ((zzpk) zzpmVar).f21712u;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iMo9150d) {
            if (this.f21712u[i2] != bArr[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }
}
