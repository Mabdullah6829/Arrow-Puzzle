package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjm extends zzqm implements zzrr {
    private static final zzjm zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzjm zzjmVar = new zzjm();
        zzb = zzjmVar;
        zzqm.m9220k(zzjm.class, zzjmVar);
    }

    private zzjm() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0007᠌\u0005", new Object[]{"zzd", "zze", zzjk.f21674a, "zzf", "zzg", "zzh", zzjl.f21675a, "zzi", zzjj.f21673a, "zzj", zzji.f21672a});
        }
        if (i3 == 3) {
            return new zzjm();
        }
        if (i3 == 4) {
            return new zzjh(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
