package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhc extends zzqm implements zzrr {
    private static final zzhc zzb;
    private int zzd;
    private zzgy zze;
    private zzha zzg;
    private zzgw zzh;
    private zzgt zzi;
    private String zzf = "";
    private zzqr zzj = zzry.f21795w;

    static {
        zzhc zzhcVar = new zzhc();
        zzb = zzhcVar;
        zzqm.m9220k(zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzhc();
        }
        if (i3 == 4) {
            return new zzgu(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
