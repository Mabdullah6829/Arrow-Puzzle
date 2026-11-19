package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrl extends zziep implements zziga {
    private static final zzhrl zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrp zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhrl zzhrlVar = new zzhrl();
        zze = zzhrlVar;
        zziep.m8338y(zzhrl.class, zzhrlVar);
    }

    private zzhrl() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhrl m7667G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrl) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhrk m7668H() {
        return (zzhrk) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7669I() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7670D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhrp m7671E() {
        zzhrp zzhrpVar = this.zzc;
        return zzhrpVar == null ? zzhrp.m7682F() : zzhrpVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7672F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7673J(zzhrp zzhrpVar) {
        this.zzc = zzhrpVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7674K(zzidl zzidlVar) {
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
            return new zzhrl();
        }
        if (iOrdinal == 4) {
            return new zzhrk(zze);
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
        synchronized (zzhrl.class) {
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
