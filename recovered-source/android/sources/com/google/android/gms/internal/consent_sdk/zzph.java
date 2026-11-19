package com.google.android.gms.internal.consent_sdk;

import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzph extends zzpk {
    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: a */
    public final byte mo9148a(int i2) {
        if (((47 - (i2 + 1)) | i2) >= 0) {
            return this.f21712u[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0271e0.m396d(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0271e0.m397e(i2, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: b */
    public final byte mo9149b(int i2) {
        return this.f21712u[i2];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    /* JADX INFO: renamed from: d */
    public final int mo9150d() {
        return 47;
    }
}
