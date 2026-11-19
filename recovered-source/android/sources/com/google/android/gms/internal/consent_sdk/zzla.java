package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzla extends zzqm implements zzrr {
    private static final zzla zzb;
    private int zzd;
    private zzkh zze;
    private zzkr zzf;
    private zzkj zzg;
    private zzkt zzh;
    private zzke zzi;
    private zzky zzj;
    private zzkw zzk;

    static {
        zzla zzlaVar = new zzla();
        zzb = zzlaVar;
        zzqm.m9220k(zzla.class, zzlaVar);
    }

    private zzla() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzla();
        }
        if (i3 == 4) {
            return new zzkf(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
