package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkr extends zzqm implements zzrr {
    private static final zzkr zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private boolean zzg;

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzqm.m9220k(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzkm.class, zzkq.class});
        }
        if (i3 == 3) {
            return new zzkr();
        }
        if (i3 == 4) {
            return new zzkk(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
