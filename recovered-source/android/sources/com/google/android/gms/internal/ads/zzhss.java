package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzhss implements zziet {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: s */
    public final int f19171s;

    zzhss(int i2) {
        this.f19171s = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzhss m7764b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 == 4) {
            return SHA512;
        }
        if (i2 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19171s);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f19171s;
        }
        zzifc.m8355a();
        throw null;
    }
}
