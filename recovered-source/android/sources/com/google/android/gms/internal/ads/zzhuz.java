package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhuz extends zziep implements zziga {
    private static final zzhuz zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhuz zzhuzVar = new zzhuz();
        zzb = zzhuzVar;
        zziep.m8338y(zzhuz.class, zzhuzVar);
    }

    private zzhuz() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhuz m7973E(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhuz) zziep.m8335s(zzb, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: F */
    public static zzhuz m7974F() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final int m7975D() {
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
            return new zzhuz();
        }
        if (iOrdinal == 4) {
            return new zzhuy(zzb);
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
        synchronized (zzhuz.class) {
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
