package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhud extends zziep implements zziga {
    private static final zzhud zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhud zzhudVar = new zzhud();
        zzb = zzhudVar;
        zziep.m8338y(zzhud.class, zzhudVar);
    }

    private zzhud() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhuc m7870E() {
        return (zzhuc) zzb.m8346v();
    }

    /* JADX INFO: renamed from: F */
    public static zzhud m7871F() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final zzhss m7872D() {
        zzhss zzhssVarM7764b = zzhss.m7764b(this.zza);
        return zzhssVarM7764b == null ? zzhss.UNRECOGNIZED : zzhssVarM7764b;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7873G(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhud();
        }
        if (iOrdinal == 4) {
            return new zzhuc(zzb);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhud.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
