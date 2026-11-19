package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhp extends zzqm implements zzrr {
    private static final zzhp zzb;

    static {
        zzhp zzhpVar = new zzhp();
        zzb = zzhpVar;
        zzqm.m9220k(zzhp.class, zzhpVar);
    }

    private zzhp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0000", null);
        }
        if (i3 == 3) {
            return new zzhp();
        }
        if (i3 == 4) {
            return new zzho(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
