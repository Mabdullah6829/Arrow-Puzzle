package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqv extends zziep implements zziga {
    private static final zzhqv zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzidl zzc = zzidl.f19719t;
    private zzhqz zzd;

    static {
        zzhqv zzhqvVar = new zzhqv();
        zze = zzhqvVar;
        zziep.m8338y(zzhqv.class, zzhqvVar);
    }

    private zzhqv() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhqv m7618G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhqv) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhqu m7619H() {
        return (zzhqu) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7620I() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7621D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7622E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzhqz m7623F() {
        zzhqz zzhqzVar = this.zzd;
        return zzhqzVar == null ? zzhqz.m7633F() : zzhqzVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7624J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7625K(zzhqz zzhqzVar) {
        this.zzd = zzhqzVar;
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqv();
        }
        if (iOrdinal == 4) {
            return new zzhqu(zze);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhqv.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
