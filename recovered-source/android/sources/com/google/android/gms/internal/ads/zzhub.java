package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhub extends zziep implements zziga {
    private static final zzhub zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhud zzb;
    private int zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhub zzhubVar = new zzhub();
        zze = zzhubVar;
        zziep.m8338y(zzhub.class, zzhubVar);
    }

    private zzhub() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhub m7862G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhub) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhua m7863H() {
        return (zzhua) zze.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzhud m7864D() {
        zzhud zzhudVar = this.zzb;
        return zzhudVar == null ? zzhud.m7871F() : zzhudVar;
    }

    /* JADX INFO: renamed from: E */
    public final int m7865E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7866F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7867I(zzhud zzhudVar) {
        this.zzb = zzhudVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7868J(int i2) {
        this.zzc = i2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7869K(zzidl zzidlVar) {
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhub();
        }
        if (iOrdinal == 4) {
            return new zzhua(zze);
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
        synchronized (zzhub.class) {
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
