package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zziu extends zzqm implements zzrr {
    private static final zziu zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zziu zziuVar = new zziu();
        zzb = zziuVar;
        zzqm.m9220k(zziu.class, zziuVar);
    }

    private zziu() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzit.f21667a, "zzf", zzis.f21666a});
        }
        if (i3 == 3) {
            return new zziu();
        }
        if (i3 == 4) {
            return new zzir(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
