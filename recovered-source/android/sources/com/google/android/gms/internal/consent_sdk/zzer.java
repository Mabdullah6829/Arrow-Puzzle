package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer extends zzqm implements zzrr {
    private static final zzer zzb;
    private int zzd;
    private zzeq zze;
    private zzhl zzf;

    static {
        zzer zzerVar = new zzer();
        zzb = zzerVar;
        zzqm.m9220k(zzer.class, zzerVar);
    }

    private zzer() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzer();
        }
        if (i3 == 4) {
            return new zzeo(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
