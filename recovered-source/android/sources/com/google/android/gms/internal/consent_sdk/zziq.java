package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zziq extends zzqm implements zzrr {
    private static final zziq zzb;
    private int zzd;
    private int zze;
    private zzik zzf;
    private zzip zzg;

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzqm.m9220k(zziq.class, zziqVar);
    }

    private zziq() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzil.f21665a, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zziq();
        }
        if (i3 == 4) {
            return new zzii(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
