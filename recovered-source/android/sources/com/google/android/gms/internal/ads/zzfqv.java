package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzfqv implements zziet {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f16369s;

    zzfqv(int i2) {
        this.f16369s = i2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16369s);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f16369s;
        }
        zzifc.m8355a();
        throw null;
    }
}
