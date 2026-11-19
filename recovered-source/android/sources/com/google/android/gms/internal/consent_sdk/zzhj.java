package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhj extends zzqm implements zzrr {
    private static final zzhj zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzqm.m9220k(zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzhi.class, zzhg.class});
        }
        if (i3 == 3) {
            return new zzhj();
        }
        if (i3 == 4) {
            return new zzhe(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
