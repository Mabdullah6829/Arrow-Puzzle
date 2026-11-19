package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl extends zzdn {
    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    /* JADX INFO: renamed from: b */
    public final int mo9127b(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    /* JADX INFO: renamed from: c */
    public final int mo9128c(int i2) {
        String str = this.f21627u;
        int length = str.length();
        zzdj.m9124b(i2, length);
        while (i2 < length) {
            if (str.charAt(i2) == ',') {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
