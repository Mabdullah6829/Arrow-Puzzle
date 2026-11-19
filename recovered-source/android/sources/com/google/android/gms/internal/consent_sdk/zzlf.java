package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlf extends zzqm implements zzrr {
    private static final zzlf zzb;
    private int zzd;
    private zzrk zzh = zzrk.f21774t;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzqm.m9220k(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzle.f21681a});
        }
        if (i3 == 3) {
            return new zzlf();
        }
        if (i3 == 4) {
            return new zzld(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
