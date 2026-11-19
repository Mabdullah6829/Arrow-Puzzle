package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhuh extends zziep implements zziga {
    private static final zzhuh zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private zzhud zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzhuh zzhuhVar = new zzhuh();
        zzf = zzhuhVar;
        zziep.m8338y(zzhuh.class, zzhuhVar);
    }

    private zzhuh() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: H */
    public static zzhuh m7893H(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhuh) zziep.m8335s(zzf, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: I */
    public static zzhug m7894I() {
        return (zzhug) zzf.m8346v();
    }

    /* JADX INFO: renamed from: J */
    public static zzhuh m7895J() {
        return zzf;
    }

    /* JADX INFO: renamed from: K */
    public static zzigh m7896K() {
        return zzf.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7897D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhud m7898E() {
        zzhud zzhudVar = this.zzc;
        return zzhudVar == null ? zzhud.m7871F() : zzhudVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7899F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m7900G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7901L(zzhud zzhudVar) {
        this.zzc = zzhudVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m7902M(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m7903N(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
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
            return new zzigl(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhuh();
        }
        if (iOrdinal == 4) {
            return new zzhug(zzf);
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
        synchronized (zzhuh.class) {
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
