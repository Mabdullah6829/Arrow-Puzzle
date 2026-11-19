package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlz extends zzqm implements zzrr {
    private static final zzlz zzb;
    private int zzd;
    private zzlx zze;
    private zzej zzf;
    private String zzg = "";

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzqm.m9220k(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzlz();
        }
        if (i3 == 4) {
            return new zzlp(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
