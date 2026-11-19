package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznh extends zzqm implements zzrr {
    private static final zznh zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private zzte zzi;
    private zzte zzj;
    private int zzk;

    static {
        zznh zznhVar = new zznh();
        zzb = zznhVar;
        zzqm.m9220k(zznh.class, zznhVar);
    }

    private zznh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u00067\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zznd.f21689a, "zzh", zzne.f21690a, "zzi", "zzj", "zzk", zzng.f21691a, zzqa.class});
        }
        if (i3 == 3) {
            return new zznh();
        }
        if (i3 == 4) {
            return new zznf(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
