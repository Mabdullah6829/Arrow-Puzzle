package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zznb extends zzqm implements zzrr {
    private static final zznb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zznb zznbVar = new zznb();
        zzb = zznbVar;
        zzqm.m9220k(zznb.class, zznbVar);
    }

    private zznb() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzor.f21700a, "zzf", zzmz.f21688a});
        }
        if (i3 == 3) {
            return new zznb();
        }
        if (i3 == 4) {
            return new zzmy(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
