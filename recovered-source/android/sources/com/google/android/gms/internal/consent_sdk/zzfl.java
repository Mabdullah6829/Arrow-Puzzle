package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfl extends zzqm implements zzrr {
    private static final zzfl zzb;
    private int zzd;
    private boolean zze;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzqm.m9220k(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzfl();
        }
        if (i3 == 4) {
            return new zzfk(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
