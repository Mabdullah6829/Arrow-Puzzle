package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzms extends zzqm implements zzrr {
    private static final zzms zzb;
    private int zzd;
    private int zze;

    static {
        zzms zzmsVar = new zzms();
        zzb = zzmsVar;
        zzqm.m9220k(zzms.class, zzmsVar);
    }

    private zzms() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzmq.f21686a});
        }
        if (i3 == 3) {
            return new zzms();
        }
        if (i3 == 4) {
            return new zzmr(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
