package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjx extends zzqm implements zzrr {
    private static final zzjx zzb;
    private int zzd;
    private zzjw zze;

    static {
        zzjx zzjxVar = new zzjx();
        zzb = zzjxVar;
        zzqm.m9220k(zzjx.class, zzjxVar);
    }

    private zzjx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzjx();
        }
        if (i3 == 4) {
            return new zzju(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
