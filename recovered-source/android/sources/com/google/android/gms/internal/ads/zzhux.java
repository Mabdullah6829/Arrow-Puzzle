package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhux extends zziep implements zziga {
    private static final zzhux zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.f19719t;

    static {
        zzhux zzhuxVar = new zzhux();
        zzc = zzhuxVar;
        zziep.m8338y(zzhux.class, zzhuxVar);
    }

    private zzhux() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhux m7967F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhux) zziep.m8335s(zzc, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhuw m7968G() {
        return (zzhuw) zzc.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzigh m7969H() {
        return zzc.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7970D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7971E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7972I(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhux();
        }
        if (iOrdinal == 4) {
            return new zzhuw(zzc);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhux.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
