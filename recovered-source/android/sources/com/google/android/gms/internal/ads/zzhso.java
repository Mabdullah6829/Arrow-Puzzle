package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhso extends zziep implements zziga {
    private static final zzhso zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzidl zzc = zzidl.f19719t;
    private zzhsq zzd;

    static {
        zzhso zzhsoVar = new zzhso();
        zze = zzhsoVar;
        zziep.m8338y(zzhso.class, zzhsoVar);
    }

    private zzhso() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhso m7749G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhso) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhsn m7750H() {
        return (zzhsn) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7751I() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7752D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7753E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzhsq m7754F() {
        zzhsq zzhsqVar = this.zzd;
        return zzhsqVar == null ? zzhsq.m7759H() : zzhsqVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7755J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7756K(zzhsq zzhsqVar) {
        this.zzd = zzhsqVar;
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
            return new zzhso();
        }
        if (iOrdinal == 4) {
            return new zzhsn(zze);
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
        synchronized (zzhso.class) {
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
