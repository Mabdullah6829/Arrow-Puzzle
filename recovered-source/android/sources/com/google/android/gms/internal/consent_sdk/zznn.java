package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznn extends zzqm implements zzrr {
    private static final zznn zzb;
    private zzqq zzd = zzqn.f21744w;

    static {
        zznn zznnVar = new zznn();
        zzb = zznnVar;
        zzqm.m9220k(zznn.class, zznnVar);
    }

    private zznn() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zznd.f21689a});
        }
        if (i3 == 3) {
            return new zznn();
        }
        if (i3 == 4) {
            return new zznm(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
