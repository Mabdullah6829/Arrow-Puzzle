package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkh extends zzqm implements zzrr {
    private static final zzkh zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        zzkh zzkhVar = new zzkh();
        zzb = zzkhVar;
        zzqm.m9220k(zzkh.class, zzkhVar);
    }

    private zzkh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0006\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0007\u000eဇ\b\u000fဇ\t\u0010ဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzk", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i3 == 3) {
            return new zzkh();
        }
        if (i3 == 4) {
            return new zzkg(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
