package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzic extends zzqm implements zzrr {
    private static final zzic zzb;
    private int zzd;
    private zzhx zze;
    private zzia zzf;

    static {
        zzic zzicVar = new zzic();
        zzb = zzicVar;
        zzqm.m9220k(zzic.class, zzicVar);
    }

    private zzic() {
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
            return new zzic();
        }
        if (i3 == 4) {
            return new zzhm(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
