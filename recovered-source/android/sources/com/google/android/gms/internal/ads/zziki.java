package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziki extends zziep implements zziga {
    private static final zziki zzf;
    private static volatile zzigh zzg;
    private int zza;
    private String zzb = "";
    private zzifb zzc;
    private zzifb zzd;
    private String zze;

    static {
        zziki zzikiVar = new zziki();
        zzf = zzikiVar;
        zziep.m8338y(zziki.class, zzikiVar);
    }

    private zziki() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zzc = zzigkVar;
        this.zzd = zzigkVar;
        this.zze = "";
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zziki();
        }
        if (iOrdinal == 4) {
            return new zzikh(zzf);
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
        synchronized (zziki.class) {
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
