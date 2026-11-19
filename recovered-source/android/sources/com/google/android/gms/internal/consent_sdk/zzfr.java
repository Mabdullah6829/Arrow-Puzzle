package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfr extends zzqm implements zzrr {
    private static final zzfr zzb;
    private int zzd;
    private zzfy zze;
    private zzfv zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zzb = zzfrVar;
        zzqm.m9220k(zzfr.class, zzfrVar);
    }

    private zzfr() {
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
            return new zzfr();
        }
        if (i3 == 4) {
            return new zzfp(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
