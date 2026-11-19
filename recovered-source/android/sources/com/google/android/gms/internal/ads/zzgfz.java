package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfz extends zziep implements zziga {
    private static final zzgfz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzggb zzb;
    private zzidl zzc;
    private zzidl zzd;
    private int zze;

    static {
        zzgfz zzgfzVar = new zzgfz();
        zzf = zzgfzVar;
        zziep.m8338y(zzgfz.class, zzgfzVar);
    }

    private zzgfz() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: G */
    public static zzgfy m6977G() {
        return (zzgfy) zzf.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzggb m6978D() {
        zzggb zzggbVar = this.zzb;
        return zzggbVar == null ? zzggb.m6988J() : zzggbVar;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m6979E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m6980F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6981H(zzggb zzggbVar) {
        this.zzb = zzggbVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m6982I(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m6983J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: K */
    public final int m6984K() {
        int iM7002a = zzggq.m7002a(this.zze);
        if (iM7002a == 0) {
            return 1;
        }
        return iM7002a;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6985L(int i2) {
        this.zze = i2 - 1;
        this.zza |= 8;
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
            return new zzigl(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzggp.f17221a});
        }
        if (iOrdinal == 3) {
            return new zzgfz();
        }
        if (iOrdinal == 4) {
            return new zzgfy(zzf);
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
        synchronized (zzgfz.class) {
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
