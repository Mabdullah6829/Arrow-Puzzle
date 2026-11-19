package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsm extends zziep implements zziga {
    private static final zzhsm zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhsm zzhsmVar = new zzhsm();
        zzb = zzhsmVar;
        zziep.m8338y(zzhsm.class, zzhsmVar);
    }

    private zzhsm() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhsm m7746E(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsm) zziep.m8335s(zzb, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: F */
    public static zzhsm m7747F() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final int m7748D() {
        return this.zza;
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhsm();
        }
        if (iOrdinal == 4) {
            return new zzhsl(zzb);
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
        synchronized (zzhsm.class) {
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
