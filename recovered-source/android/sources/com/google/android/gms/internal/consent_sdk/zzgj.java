package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgj extends zzqm implements zzrr {
    private static final zzgj zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgj zzgjVar = new zzgj();
        zzb = zzgjVar;
        zzqm.m9220k(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzed.f21653a, "zzf", zzef.f21654a});
        }
        if (i3 == 3) {
            return new zzgj();
        }
        if (i3 == 4) {
            return new zzgh(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
