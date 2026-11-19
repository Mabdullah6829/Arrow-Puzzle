package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm extends zzqm implements zzrr {
    private static final zzfm zzb;
    private int zzd;
    private zzfl zze;
    private zzgj zzf;

    static {
        zzfm zzfmVar = new zzfm();
        zzb = zzfmVar;
        zzqm.m9220k(zzfm.class, zzfmVar);
    }

    private zzfm() {
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
            return new zzfm();
        }
        if (i3 == 4) {
            return new zzfj(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
