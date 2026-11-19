package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoa extends zzqm implements zzrr {
    private static final zzoa zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzoa zzoaVar = new zzoa();
        zzb = zzoaVar;
        zzqm.m9220k(zzoa.class, zzoaVar);
    }

    private zzoa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzob.f21696a, "zzf", zzoc.f21697a});
        }
        if (i3 == 3) {
            return new zzoa();
        }
        if (i3 == 4) {
            return new zznz(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
