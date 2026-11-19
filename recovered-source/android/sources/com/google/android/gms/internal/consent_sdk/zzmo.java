package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmo extends zzqm implements zzrr {
    private static final zzmo zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzte zzg;
    private zzte zzh;
    private int zzi;

    static {
        zzmo zzmoVar = new zzmo();
        zzb = zzmoVar;
        zzqm.m9220k(zzmo.class, zzmoVar);
    }

    private zzmo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    /* JADX INFO: renamed from: e */
    public final Object mo9141e(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzrz(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u00047\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", zzmn.f21684a, zzqa.class});
        }
        if (i3 == 3) {
            return new zzmo();
        }
        if (i3 == 4) {
            return new zzmm(zzb);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }
}
