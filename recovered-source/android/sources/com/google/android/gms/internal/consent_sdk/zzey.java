package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzey extends zzqm implements zzrr {
    private static final zzey zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzey zzeyVar = new zzey();
        zzb = zzeyVar;
        zzqm.m9220k(zzey.class, zzeyVar);
    }

    private zzey() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", zzel.f21655a, "zzf"});
        }
        if (i3 == 3) {
            return new zzey();
        }
        if (i3 == 4) {
            return new zzex(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
