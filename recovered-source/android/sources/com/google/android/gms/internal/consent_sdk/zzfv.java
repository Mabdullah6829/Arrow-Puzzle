package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfv extends zzqm implements zzrr {
    private static final zzfv zzb;
    private int zzd;
    private int zze;

    static {
        zzfv zzfvVar = new zzfv();
        zzb = zzfvVar;
        zzqm.m9220k(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzft.f21657a});
        }
        if (i3 == 3) {
            return new zzfv();
        }
        if (i3 == 4) {
            return new zzfs(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
