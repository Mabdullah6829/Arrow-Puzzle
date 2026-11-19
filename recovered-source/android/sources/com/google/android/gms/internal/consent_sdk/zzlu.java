package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlu extends zzqm implements zzrr {
    private static final zzlu zzb;
    private int zzd;
    private zzlt zze;
    private zzhl zzf;

    static {
        zzlu zzluVar = new zzlu();
        zzb = zzluVar;
        zzqm.m9220k(zzlu.class, zzluVar);
    }

    private zzlu() {
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
            return new zzlu();
        }
        if (i3 == 4) {
            return new zzlr(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
