package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzbdz implements zziet {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* JADX INFO: renamed from: s */
    public final int f7672s;

    zzbdz(int i2) {
        this.f7672s = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzbdz m4775b(int i2) {
        if (i2 == 0) {
            return UNSUPPORTED;
        }
        if (i2 == 2) {
            return ARM7;
        }
        if (i2 == 999) {
            return UNKNOWN;
        }
        if (i2 == 4) {
            return X86;
        }
        if (i2 == 5) {
            return ARM64;
        }
        if (i2 == 6) {
            return X86_64;
        }
        if (i2 != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7672s);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza() {
        return this.f7672s;
    }
}
