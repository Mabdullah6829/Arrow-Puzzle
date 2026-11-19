package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzml extends zzqm implements zzrr {
    private static final zzml zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzml zzmlVar = new zzml();
        zzb = zzmlVar;
        zzqm.m9220k(zzml.class, zzmlVar);
    }

    private zzml() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", zzmj.f21683a, "zzf"});
        }
        if (i3 == 3) {
            return new zzml();
        }
        if (i3 == 4) {
            return new zzmk(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
