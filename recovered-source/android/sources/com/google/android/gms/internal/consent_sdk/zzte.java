package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzte extends zzqm implements zzrr {
    private static final zzte zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zzqm.m9220k(zzte.class, zzteVar);
    }

    private zzte() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzte();
        }
        if (i3 == 4) {
            return new zztc(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
