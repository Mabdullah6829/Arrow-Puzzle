package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfrz extends zziep implements zziga {
    private static final zzfrz zzf;
    private static volatile zzigh zzg;
    private long zza;
    private long zzb;
    private zzifb zzc;
    private zzifb zzd;
    private zzifb zze;

    static {
        zzfrz zzfrzVar = new zzfrz();
        zzf = zzfrzVar;
        zziep.m8338y(zzfrz.class, zzfrzVar);
    }

    private zzfrz() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zzc = zzigkVar;
        this.zzd = zzigkVar;
        this.zze = zzigkVar;
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
            return new zzigl(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfrz();
        }
        if (iOrdinal == 4) {
            return new zzfry(zzf);
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
        synchronized (zzfrz.class) {
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
