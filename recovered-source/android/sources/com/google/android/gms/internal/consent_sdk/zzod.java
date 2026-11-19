package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzod extends zzqm implements zzrr {
    private static final zzod zzb;
    private int zzd;
    private zzqr zze = zzry.f21795w;
    private zzsn zzf;

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzqm.m9220k(zzod.class, zzodVar);
    }

    private zzod() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzoa.class, "zzf"});
        }
        if (i3 == 3) {
            return new zzod();
        }
        if (i3 == 4) {
            return new zzny(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
