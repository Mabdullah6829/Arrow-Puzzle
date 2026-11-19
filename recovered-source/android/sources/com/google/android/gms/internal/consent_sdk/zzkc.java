package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkc extends zzqm implements zzrr {
    private static final zzkc zzb;
    private int zzd;
    private zzka zze;
    private zzlj zzf;
    private int zzg;

    static {
        zzkc zzkcVar = new zzkc();
        zzb = zzkcVar;
        zzqm.m9220k(zzkc.class, zzkcVar);
    }

    private zzkc() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", zzig.f21664a, "zzf"});
        }
        if (i3 == 3) {
            return new zzkc();
        }
        if (i3 == 4) {
            return new zzjp(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
