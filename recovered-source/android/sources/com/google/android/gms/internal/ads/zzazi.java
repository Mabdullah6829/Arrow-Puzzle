package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazi extends zziep implements zziga {
    private static final zzazi zze;
    private static volatile zzigh zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private zzidl zzd = zzidl.f19719t;

    static {
        zzazi zzaziVar = new zzazi();
        zze = zzaziVar;
        zziep.m8338y(zzazi.class, zzaziVar);
    }

    private zzazi() {
    }

    /* JADX INFO: renamed from: H */
    public static zzazi m4665H() {
        return zze;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4666D() {
        return (this.zza & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final long m4667E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: F */
    public final String m4668F() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m4669G() {
        return this.zzd;
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
            return new zzigl(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzazi();
        }
        if (iOrdinal == 4) {
            return new zzazh(zze);
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
        synchronized (zzazi.class) {
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
