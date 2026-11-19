package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjd extends zzqm implements zzrr {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzqm.m9220k(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006င\u0002\t᠌\u0006\n᠌\u0007", new Object[]{"zzd", "zze", zzja.f21669a, "zzf", "zzh", "zzi", "zzj", zziz.f21668a, "zzg", "zzk", zzjb.f21670a, "zzl", zzjc.f21671a});
        }
        if (i3 == 3) {
            return new zzjd();
        }
        if (i3 == 4) {
            return new zziy(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
