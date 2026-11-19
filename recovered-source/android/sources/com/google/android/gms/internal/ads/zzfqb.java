package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqb extends zziep implements zziga {
    private static final zzfqb zzg;
    private static volatile zzigh zzh;
    private long zza;
    private zziex zzb = zzieq.f19791w;
    private zzifb zzc;
    private zzifb zzd;
    private zzifb zze;
    private zzifb zzf;

    static {
        zzfqb zzfqbVar = new zzfqb();
        zzg = zzfqbVar;
        zziep.m8338y(zzfqb.class, zzfqbVar);
    }

    private zzfqb() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zzc = zzigkVar;
        this.zzd = zzigkVar;
        this.zze = zzigkVar;
        this.zzf = zzigkVar;
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
            return new zzigl(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfqb();
        }
        if (iOrdinal == 4) {
            return new zzfqa(zzg);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzh;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfqb.class) {
            try {
                zziekVar = zzh;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzg);
                    zzh = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
