package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqa extends zzqm implements zzrr {
    private static final zzqa zzb;
    private long zzd;
    private int zze;

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzqm.m9220k(zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzqa();
        }
        if (i3 == 4) {
            return new zzpy(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
