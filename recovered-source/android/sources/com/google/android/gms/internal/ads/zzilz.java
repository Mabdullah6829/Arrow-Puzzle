package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzilz extends zziep implements zziga {
    private static final zzilz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzifb zze = zzigk.f19864w;

    static {
        zzilz zzilzVar = new zzilz();
        zzf = zzilzVar;
        zziep.m8338y(zzilz.class, zzilzVar);
    }

    private zzilz() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzilz();
        }
        if (iOrdinal == 4) {
            return new zzily(zzf);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzilz.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
