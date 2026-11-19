package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy extends zzqm implements zzrr {
    private static final zzfy zzb;

    static {
        zzfy zzfyVar = new zzfy();
        zzb = zzfyVar;
        zzqm.m9220k(zzfy.class, zzfyVar);
    }

    private zzfy() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0000", null);
        }
        if (i3 == 3) {
            return new zzfy();
        }
        if (i3 == 4) {
            return new zzfw(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
