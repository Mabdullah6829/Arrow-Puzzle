package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgy extends zzqm implements zzrr {
    private static final zzgy zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzgy zzgyVar = new zzgy();
        zzb = zzgyVar;
        zzqm.m9220k(zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzgy();
        }
        if (i3 == 4) {
            return new zzgx(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
