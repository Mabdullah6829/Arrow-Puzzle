package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkw extends zzqm implements zzrr {
    private static final zzkw zzb;
    private zzqq zzd = zzqn.f21744w;

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzqm.m9220k(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzkv.f21679a});
        }
        if (i3 == 3) {
            return new zzkw();
        }
        if (i3 == 4) {
            return new zzku(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
