package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzme extends zzqm implements zzrr {
    private static final zzme zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzqq zzi = zzqn.f21744w;
    private String zzj = "";
    private zzmc zzk;

    static {
        zzme zzmeVar = new zzme();
        zzb = zzmeVar;
        zzqm.m9220k(zzme.class, zzmeVar);
    }

    private zzme() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ࠬ\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"zzd", "zze", "zzf", zzor.f21700a, "zzg", zzov.f21702a, "zzh", zzot.f21701a, "zzi", zzop.f21699a, "zzk", "zzj"});
        }
        if (i3 == 3) {
            return new zzme();
        }
        if (i3 == 4) {
            return new zzma(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
