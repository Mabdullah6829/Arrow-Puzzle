package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbei extends zziep implements zziga {
    private static final zzbei zzg;
    private static volatile zzigh zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbei zzbeiVar = new zzbei();
        zzg = zzbeiVar;
        zziep.m8338y(zzbei.class, zzbeiVar);
    }

    private zzbei() {
    }

    /* JADX INFO: renamed from: I */
    public static zzbei m4792I(zzidl zzidlVar) {
        zzbei zzbeiVar = zzg;
        zzidz zzidzVar = zzidz.f19758b;
        int i2 = zzicy.f19697a;
        zziep zziepVarM8335s = zziep.m8335s(zzbeiVar, zzidlVar, zzidz.f19759c);
        zziep.m8332C(zziepVarM8335s);
        return (zzbei) zziepVarM8335s;
    }

    /* JADX INFO: renamed from: J */
    public static zzbei m4793J(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzbei) zziep.m8335s(zzg, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: K */
    public static zzbeh m4794K() {
        return (zzbeh) zzg.m8346v();
    }

    /* JADX INFO: renamed from: L */
    public static zzbei m4795L() {
        return zzg;
    }

    /* JADX INFO: renamed from: D */
    public final String m4796D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final String m4797E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final long m4798F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final long m4799G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final long m4800H() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4801M(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4802N(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4803O(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4804P(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m4805Q(long j2) {
        this.zza |= 16;
        this.zzf = j2;
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
            return new zzigl(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzbei();
        }
        if (iOrdinal == 4) {
            return new zzbeh(zzg);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzh;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbei.class) {
            try {
                zziekVar = zzh;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzg);
                    zzh = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
