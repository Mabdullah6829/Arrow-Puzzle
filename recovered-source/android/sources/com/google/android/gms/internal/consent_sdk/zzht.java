package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzht extends zzqm implements zzrr {
    private static final zzht zzb;

    static {
        zzht zzhtVar = new zzht();
        zzb = zzhtVar;
        zzqm.m9220k(zzht.class, zzhtVar);
    }

    private zzht() {
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
            return new zzht();
        }
        if (i3 == 4) {
            return new zzhs(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
