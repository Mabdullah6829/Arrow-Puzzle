package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhul extends zziep implements zziga {
    private static final zzhul zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhul zzhulVar = new zzhul();
        zzd = zzhulVar;
        zziep.m8338y(zzhul.class, zzhulVar);
    }

    private zzhul() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhuk m7912G() {
        return (zzhuk) zzd.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzhul m7913H() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final zzhss m7914D() {
        zzhss zzhssVarM7764b = zzhss.m7764b(this.zza);
        return zzhssVarM7764b == null ? zzhss.UNRECOGNIZED : zzhssVarM7764b;
    }

    /* JADX INFO: renamed from: E */
    public final zzhss m7915E() {
        zzhss zzhssVarM7764b = zzhss.m7764b(this.zzb);
        return zzhssVarM7764b == null ? zzhss.UNRECOGNIZED : zzhssVarM7764b;
    }

    /* JADX INFO: renamed from: F */
    public final int m7916F() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7917I(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7918J(zzhss zzhssVar) {
        this.zzb = zzhssVar.zza();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7919K(int i2) {
        this.zzc = i2;
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
            return new zzigl(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhul();
        }
        if (iOrdinal == 4) {
            return new zzhuk(zzd);
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
        synchronized (zzhul.class) {
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
