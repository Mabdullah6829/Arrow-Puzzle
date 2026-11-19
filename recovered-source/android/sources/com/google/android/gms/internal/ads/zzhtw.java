package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtw extends zziep implements zziga {
    private static final zzhtw zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zzhte zzc;

    static {
        zzhtw zzhtwVar = new zzhtw();
        zzd = zzhtwVar;
        zziep.m8338y(zzhtw.class, zzhtwVar);
    }

    private zzhtw() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhtw m7853F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhtw) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhtv m7854G() {
        return (zzhtv) zzd.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzhtw m7855H() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final String m7856D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhte m7857E() {
        zzhte zzhteVar = this.zzc;
        return zzhteVar == null ? zzhte.m7802J() : zzhteVar;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7858I(String str) {
        str.getClass();
        this.zzb = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7859J(zzhte zzhteVar) {
        zzhteVar.getClass();
        this.zzc = zzhteVar;
        this.zza |= 1;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtw();
        }
        if (iOrdinal == 4) {
            return new zzhtv(zzd);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhtw.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
