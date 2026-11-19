package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsb extends zziep implements zziga {
    private static final zzhsb zza;
    private static volatile zzigh zzb;

    static {
        zzhsb zzhsbVar = new zzhsb();
        zza = zzhsbVar;
        zziep.m8338y(zzhsb.class, zzhsbVar);
    }

    private zzhsb() {
    }

    /* JADX INFO: renamed from: D */
    public static void m7713D(zzidl zzidlVar, zzidz zzidzVar) {
    }

    /* JADX INFO: renamed from: E */
    public static zzhsb m7714E() {
        return zza;
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
            return new zzigl(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhsb();
        }
        if (iOrdinal == 4) {
            return new zzhsa(zza);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzb;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsb.class) {
            try {
                zziekVar = zzb;
                if (zziekVar == null) {
                    zziekVar = new zziek(zza);
                    zzb = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
