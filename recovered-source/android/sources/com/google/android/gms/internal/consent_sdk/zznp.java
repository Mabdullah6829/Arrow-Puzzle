package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznp extends zzqm implements zzrr {
    private static final zznp zzb;
    private int zzd;
    private zznl zze;
    private zznn zzf;
    private zznh zzg;
    private int zzh;

    static {
        zznp zznpVar = new zznp();
        zzb = zznpVar;
        zzqm.m9220k(zznp.class, zznpVar);
    }

    private zznp() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0005᠌\u0003", new Object[]{"zzd", "zzf", "zzg", "zze", "zzh", zzox.f21703a});
        }
        if (i3 == 3) {
            return new zznp();
        }
        if (i3 == 4) {
            return new zznc(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
