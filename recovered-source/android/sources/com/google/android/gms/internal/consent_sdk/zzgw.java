package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgw extends zzqm implements zzrr {
    private static final zzgw zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzgw zzgwVar = new zzgw();
        zzb = zzgwVar;
        zzqm.m9220k(zzgw.class, zzgwVar);
    }

    private zzgw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzgw();
        }
        if (i3 == 4) {
            return new zzgv(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
