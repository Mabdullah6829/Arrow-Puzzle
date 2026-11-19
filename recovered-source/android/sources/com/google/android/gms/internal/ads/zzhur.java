package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhur extends zziep implements zziga {
    private static final zzhur zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhuv zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhur zzhurVar = new zzhur();
        zze = zzhurVar;
        zziep.m8338y(zzhur.class, zzhurVar);
    }

    private zzhur() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhur m7951G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhur) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhuq m7952H() {
        return (zzhuq) zze.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7953D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhuv m7954E() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.m7964F() : zzhuvVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7955F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7956I(zzhuv zzhuvVar) {
        this.zzc = zzhuvVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7957J(zzidl zzidlVar) {
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
            return new zzhur();
        }
        if (iOrdinal == 4) {
            return new zzhuq(zze);
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
        synchronized (zzhur.class) {
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
