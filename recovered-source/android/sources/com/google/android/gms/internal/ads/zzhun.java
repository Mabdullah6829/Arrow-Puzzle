package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhun extends zziep implements zziga {
    private static final zzhun zzj;
    private static volatile zzigh zzk;
    private int zza;
    private int zzb;
    private zzhup zzc;
    private zzidl zzd;
    private zzidl zze;
    private zzidl zzf;
    private zzidl zzg;
    private zzidl zzh;
    private zzidl zzi;

    static {
        zzhun zzhunVar = new zzhun();
        zzj = zzhunVar;
        zziep.m8338y(zzhun.class, zzhunVar);
    }

    private zzhun() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
        this.zzf = zzidlVar;
        this.zzg = zzidlVar;
        this.zzh = zzidlVar;
        this.zzi = zzidlVar;
    }

    /* JADX INFO: renamed from: L */
    public static zzhun m7920L(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhun) zziep.m8335s(zzj, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: M */
    public static zzhum m7921M() {
        return (zzhum) zzj.m8346v();
    }

    /* JADX INFO: renamed from: N */
    public static zzigh m7922N() {
        return zzj.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7923D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhup m7924E() {
        zzhup zzhupVar = this.zzc;
        return zzhupVar == null ? zzhup.m7941J() : zzhupVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7925F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m7926G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final zzidl m7927H() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: I */
    public final zzidl m7928I() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: J */
    public final zzidl m7929J() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: K */
    public final zzidl m7930K() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m7931O() {
        this.zzb = 0;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m7932P(zzhup zzhupVar) {
        this.zzc = zzhupVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m7933Q(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m7934R(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m7935S(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzf = zzidlVar;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m7936T(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzg = zzidlVar;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m7937U(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzh = zzidlVar;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m7938V(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzi = zzidlVar;
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
            return new zzigl(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhun();
        }
        if (iOrdinal == 4) {
            return new zzhum(zzj);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzk;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhun.class) {
            try {
                zziekVar = zzk;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzj);
                    zzk = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
