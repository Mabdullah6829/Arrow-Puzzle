package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzhtx implements zziet {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f19188s;

    zzhtx(int i2) {
        this.f19188s = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzhtx m7860b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 == 4) {
            return CRUNCHY;
        }
        if (i2 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19188s);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f19188s;
        }
        zzifc.m8355a();
        throw null;
    }
}
