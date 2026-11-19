package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzrz implements zzrn {

    /* JADX INFO: renamed from: a */
    public final zzrq f21798a;

    /* JADX INFO: renamed from: b */
    public final String f21799b;

    /* JADX INFO: renamed from: c */
    public final Object[] f21800c;

    /* JADX INFO: renamed from: d */
    public final int f21801d;

    public zzrz(zzrq zzrqVar, String str, Object[] objArr) {
        this.f21798a = zzrqVar;
        this.f21799b = str;
        this.f21800c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21801d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f21801d = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrn
    public final zzrq zza() {
        return this.f21798a;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrn
    public final boolean zzb() {
        return (this.f21801d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrn
    public final int zzc() {
        int i2 = this.f21801d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}
