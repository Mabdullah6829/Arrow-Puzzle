package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayb extends zziep implements zziga {
    private static final zzayb zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        zzayb zzaybVar = new zzayb();
        zzf = zzaybVar;
        zziep.m8338y(zzayb.class, zzaybVar);
    }

    private zzayb() {
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
            zziev zzievVar = zzazd.f7205a;
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", zzievVar, "zzc", zzievVar, "zzd", zzievVar, "zze", zzievVar});
        }
        if (iOrdinal == 3) {
            return new zzayb();
        }
        if (iOrdinal == 4) {
            return new zzaya(zzf);
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
        synchronized (zzayb.class) {
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
