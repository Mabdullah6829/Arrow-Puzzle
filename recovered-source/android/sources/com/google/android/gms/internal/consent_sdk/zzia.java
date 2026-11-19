package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzia extends zzqm implements zzrr {
    private static final zzia zzb;
    private int zzd;
    private int zze;

    static {
        zzia zziaVar = new zzia();
        zzb = zziaVar;
        zzqm.m9220k(zzia.class, zziaVar);
    }

    private zzia() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"zzd", "zze", zzhz.f21663a});
        }
        if (i3 == 3) {
            return new zzia();
        }
        if (i3 == 4) {
            return new zzhy(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
