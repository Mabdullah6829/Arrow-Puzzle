package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkj extends zzqm implements zzrr {
    private static final zzkj zzb;
    private int zzd;
    private boolean zze;

    static {
        zzkj zzkjVar = new zzkj();
        zzb = zzkjVar;
        zzqm.m9220k(zzkj.class, zzkjVar);
    }

    private zzkj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzkj();
        }
        if (i3 == 4) {
            return new zzki(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
