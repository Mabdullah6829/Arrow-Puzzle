package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsq extends zziep implements zziga {
    private static final zzhsq zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.f19719t;

    static {
        zzhsq zzhsqVar = new zzhsq();
        zzc = zzhsqVar;
        zziep.m8338y(zzhsq.class, zzhsqVar);
    }

    private zzhsq() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhsq m7757F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsq) zziep.m8335s(zzc, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhsp m7758G() {
        return (zzhsp) zzc.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzhsq m7759H() {
        return zzc;
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7760I() {
        return zzc.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7761D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7762E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7763J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhsq();
        }
        if (iOrdinal == 4) {
            return new zzhsp(zzc);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsq.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
