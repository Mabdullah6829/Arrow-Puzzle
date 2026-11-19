package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkq extends zzqm implements zzrr {
    private static final zzkq zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzkq zzkqVar = new zzkq();
        zzb = zzkqVar;
        zzqm.m9220k(zzkq.class, zzkqVar);
    }

    private zzkq() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzkp.f21678a, "zzf", zzkn.f21677a});
        }
        if (i3 == 3) {
            return new zzkq();
        }
        if (i3 == 4) {
            return new zzko(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
