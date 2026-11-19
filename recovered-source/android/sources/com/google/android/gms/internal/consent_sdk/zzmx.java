package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmx extends zzqm implements zzrr {
    private static final zzmx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzmx zzmxVar = new zzmx();
        zzb = zzmxVar;
        zzqm.m9220k(zzmx.class, zzmxVar);
    }

    private zzmx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", zzop.f21699a, "zzi", zzmp.f21685a, zzmi.class, zzml.class, zzmv.class, zzmo.class, zzms.class});
        }
        if (i3 == 3) {
            return new zzmx();
        }
        if (i3 == 4) {
            return new zzmf(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
