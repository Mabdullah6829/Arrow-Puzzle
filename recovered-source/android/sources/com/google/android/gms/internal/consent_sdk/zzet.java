package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzet extends zzqm implements zzrr {
    private static final zzet zzb;
    private int zzd;
    private int zze;
    private zzer zzf;

    static {
        zzet zzetVar = new zzet();
        zzb = zzetVar;
        zzqm.m9220k(zzet.class, zzetVar);
    }

    private zzet() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzes.f21656a, "zzf"});
        }
        if (i3 == 3) {
            return new zzet();
        }
        if (i3 == 4) {
            return new zzen(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
