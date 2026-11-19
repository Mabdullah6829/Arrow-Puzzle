package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlo extends zzqm implements zzrr {
    private static final zzlo zzb;
    private int zzd;
    private zzlm zze;

    static {
        zzlo zzloVar = new zzlo();
        zzb = zzloVar;
        zzqm.m9220k(zzlo.class, zzloVar);
    }

    private zzlo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzlo();
        }
        if (i3 == 4) {
            return new zzlk(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
