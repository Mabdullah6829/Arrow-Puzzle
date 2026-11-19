package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznu extends zzqm implements zzrr {
    private static final zznu zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznu zznuVar = new zznu();
        zzb = zznuVar;
        zzqm.m9220k(zznu.class, zznuVar);
    }

    private zznu() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zznr.f21694a, "zzf", zzns.f21695a});
        }
        if (i3 == 3) {
            return new zznu();
        }
        if (i3 == 4) {
            return new zznq(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
