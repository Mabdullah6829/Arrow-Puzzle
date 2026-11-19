package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhts extends zziep implements zziga {
    private static final zzhts zzb;
    private static volatile zzigh zzc;
    private String zza = "";

    static {
        zzhts zzhtsVar = new zzhts();
        zzb = zzhtsVar;
        zziep.m8338y(zzhts.class, zzhtsVar);
    }

    private zzhts() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhts m7842E(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhts) zziep.m8335s(zzb, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: F */
    public static zzhtr m7843F() {
        return (zzhtr) zzb.m8346v();
    }

    /* JADX INFO: renamed from: G */
    public static zzhts m7844G() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final String m7845D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7846H(String str) {
        str.getClass();
        this.zza = str;
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhts();
        }
        if (iOrdinal == 4) {
            return new zzhtr(zzb);
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
        synchronized (zzhts.class) {
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
