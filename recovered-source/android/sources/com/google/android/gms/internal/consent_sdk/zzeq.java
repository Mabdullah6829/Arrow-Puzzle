package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeq extends zzqm implements zzrr {
    private static final zzeq zzb;

    static {
        zzeq zzeqVar = new zzeq();
        zzb = zzeqVar;
        zzqm.m9220k(zzeq.class, zzeqVar);
    }

    private zzeq() {
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
            return new zzeq();
        }
        if (i3 == 4) {
            return new zzep(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
