package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsu extends zziep implements zziga {
    private static final zzhsu zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhsy zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zze = zzhsuVar;
        zziep.m8338y(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhsu m7765G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsu) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhst m7766H() {
        return (zzhst) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzhsu m7767I() {
        return zze;
    }

    /* JADX INFO: renamed from: J */
    public static zzigh m7768J() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7769D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhsy m7770E() {
        zzhsy zzhsyVar = this.zzc;
        return zzhsyVar == null ? zzhsy.m7783G() : zzhsyVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7771F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7772K(zzhsy zzhsyVar) {
        this.zzc = zzhsyVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7773L(zzidl zzidlVar) {
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
            return new zzhsu();
        }
        if (iOrdinal == 4) {
            return new zzhst(zze);
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
        synchronized (zzhsu.class) {
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
