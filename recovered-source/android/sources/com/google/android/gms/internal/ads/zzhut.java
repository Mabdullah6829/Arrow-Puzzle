package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhut extends zziep implements zziga {
    private static final zzhut zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhuv zzc;

    static {
        zzhut zzhutVar = new zzhut();
        zzd = zzhutVar;
        zziep.m8338y(zzhut.class, zzhutVar);
    }

    private zzhut() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhut m7958F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhut) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhus m7959G() {
        return (zzhus) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7960D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhuv m7961E() {
        zzhuv zzhuvVar = this.zzc;
        return zzhuvVar == null ? zzhuv.m7964F() : zzhuvVar;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7962H(zzhuv zzhuvVar) {
        this.zzc = zzhuvVar;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhut();
        }
        if (iOrdinal == 4) {
            return new zzhus(zzd);
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
        synchronized (zzhut.class) {
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
