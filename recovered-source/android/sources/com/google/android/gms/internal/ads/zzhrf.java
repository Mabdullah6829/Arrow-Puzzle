package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrf extends zziep implements zziga {
    private static final zzhrf zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrj zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhrf zzhrfVar = new zzhrf();
        zze = zzhrfVar;
        zziep.m8338y(zzhrf.class, zzhrfVar);
    }

    private zzhrf() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhre m7650G() {
        return (zzhre) zze.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzhrf m7651H() {
        return zze;
    }

    /* JADX INFO: renamed from: D */
    public final int m7652D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhrj m7653E() {
        zzhrj zzhrjVar = this.zzc;
        return zzhrjVar == null ? zzhrj.m7664F() : zzhrjVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7654F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7655I(zzhrj zzhrjVar) {
        this.zzc = zzhrjVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7656J(zzidl zzidlVar) {
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
            return new zzhrf();
        }
        if (iOrdinal == 4) {
            return new zzhre(zze);
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
        synchronized (zzhrf.class) {
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
