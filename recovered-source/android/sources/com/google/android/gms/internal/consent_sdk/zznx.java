package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznx extends zzqm implements zzrr {
    private static final zznx zzb;
    private int zzd;
    private String zze = "";

    static {
        zznx zznxVar = new zznx();
        zzb = zznxVar;
        zzqm.m9220k(zznx.class, zznxVar);
    }

    private zznx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zznx();
        }
        if (i3 == 4) {
            return new zznw(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
