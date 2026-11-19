package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgr extends zzqm implements zzrr {
    private static final zzgr zzb;
    private int zzd;
    private int zze;
    private zzgp zzf;

    static {
        zzgr zzgrVar = new zzgr();
        zzb = zzgrVar;
        zzqm.m9220k(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", zzgl.f21659a, "zzf"});
        }
        if (i3 == 3) {
            return new zzgr();
        }
        if (i3 == 4) {
            return new zzgk(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
