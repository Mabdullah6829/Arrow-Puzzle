package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa extends zzqm implements zzrr {
    private static final zzfa zzb;
    private int zzd;
    private zzew zze;
    private zzey zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzfa zzfaVar = new zzfa();
        zzb = zzfaVar;
        zzqm.m9220k(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfa();
        }
        if (i3 == 4) {
            return new zzek(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
