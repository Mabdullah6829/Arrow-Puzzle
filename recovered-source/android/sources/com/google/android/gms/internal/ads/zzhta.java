package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzhta implements zziet {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f19179s;

    zzhta(int i2) {
        this.f19179s = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19179s);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f19179s;
        }
        zzifc.m8355a();
        throw null;
    }
}
