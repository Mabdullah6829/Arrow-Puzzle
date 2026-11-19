package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzke extends zzqm implements zzrr {
    private static final zzke zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzqm.m9220k(zzke.class, zzkeVar);
    }

    private zzke() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzke();
        }
        if (i3 == 4) {
            return new zzkd(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
