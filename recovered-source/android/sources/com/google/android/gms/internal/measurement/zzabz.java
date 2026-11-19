package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public enum zzabz implements zzady {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);


    /* JADX INFO: renamed from: s */
    public final int f21952s;

    zzabz(int i2) {
        this.f21952s = i2;
    }

    /* JADX INFO: renamed from: b */
    public static zzabz m9336b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case 2:
                return CONTENT_PROVIDER;
            case 3:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case 4:
                return TIKTOK;
            case 5:
                return DEVICE_CONFIG;
            case 6:
                return FILE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21952s);
    }

    @Override // com.google.android.gms.internal.measurement.zzady
    public final int zza() {
        return this.f21952s;
    }
}
