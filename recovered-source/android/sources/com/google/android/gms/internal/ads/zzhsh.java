package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsh extends zziep implements zziga {
    private static final zzhsh zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhsj zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhsh zzhshVar = new zzhsh();
        zze = zzhshVar;
        zziep.m8338y(zzhsh.class, zzhshVar);
    }

    private zzhsh() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhsh m7727G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsh) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhsg m7728H() {
        return (zzhsg) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7729I() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7730D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhsj m7731E() {
        zzhsj zzhsjVar = this.zzc;
        return zzhsjVar == null ? zzhsj.m7737J() : zzhsjVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7732F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7733J(zzhsj zzhsjVar) {
        this.zzc = zzhsjVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7734K(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhsh();
        }
        if (iOrdinal == 4) {
            return new zzhsg(zze);
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
        synchronized (zzhsh.class) {
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
