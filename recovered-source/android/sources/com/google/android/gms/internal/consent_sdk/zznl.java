package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznl extends zzqm implements zzrr {
    private static final zznl zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznl zznlVar = new zznl();
        zzb = zznlVar;
        zzqm.m9220k(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zznj.f21692a, "zzf", zznk.f21693a});
        }
        if (i3 == 3) {
            return new zznl();
        }
        if (i3 == 4) {
            return new zzni(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
