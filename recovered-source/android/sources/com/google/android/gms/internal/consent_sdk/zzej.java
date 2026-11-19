package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej extends zzqm implements zzrr {
    private static final zzej zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        zzej zzejVar = new zzej();
        zzb = zzejVar;
        zzqm.m9220k(zzej.class, zzejVar);
    }

    private zzej() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzej();
        }
        if (i3 == 4) {
            return new zzeh(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
