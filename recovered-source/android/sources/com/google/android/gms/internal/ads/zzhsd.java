package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsd extends zziep implements zziga {
    private static final zzhsd zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhsf zzb;
    private int zzc;

    static {
        zzhsd zzhsdVar = new zzhsd();
        zzd = zzhsdVar;
        zziep.m8338y(zzhsd.class, zzhsdVar);
    }

    private zzhsd() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhsd m7715E(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsd) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: F */
    public static zzhsc m7716F() {
        return (zzhsc) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzhsf m7717D() {
        zzhsf zzhsfVar = this.zzb;
        return zzhsfVar == null ? zzhsf.m7720F() : zzhsfVar;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7718G(zzhsf zzhsfVar) {
        this.zzb = zzhsfVar;
        this.zza |= 1;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsd();
        }
        if (iOrdinal == 4) {
            return new zzhsc(zzd);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsd.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
