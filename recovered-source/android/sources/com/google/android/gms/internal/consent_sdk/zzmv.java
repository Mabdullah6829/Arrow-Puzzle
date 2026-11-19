package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmv extends zzqm implements zzrr {
    private static final zzmv zzb;
    private int zzd;
    private int zze;

    static {
        zzmv zzmvVar = new zzmv();
        zzb = zzmvVar;
        zzqm.m9220k(zzmv.class, zzmvVar);
    }

    private zzmv() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzmu.f21687a});
        }
        if (i3 == 3) {
            return new zzmv();
        }
        if (i3 == 4) {
            return new zzmt(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
