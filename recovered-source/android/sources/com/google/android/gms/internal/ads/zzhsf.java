package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsf extends zziep implements zziga {
    private static final zzhsf zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhsf zzhsfVar = new zzhsf();
        zzd = zzhsfVar;
        zziep.m8338y(zzhsf.class, zzhsfVar);
    }

    private zzhsf() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhse m7719E() {
        return (zzhse) zzd.m8346v();
    }

    /* JADX INFO: renamed from: F */
    public static zzhsf m7720F() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final zzhss m7721D() {
        zzhss zzhssVarM7764b = zzhss.m7764b(this.zza);
        return zzhssVarM7764b == null ? zzhss.UNRECOGNIZED : zzhssVarM7764b;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7722G(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    /* JADX INFO: renamed from: H */
    public final int m7723H() {
        int i2 = this.zzb;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 2) {
                i3 = 4;
            } else if (i2 == 3) {
                i3 = 5;
            } else if (i2 != 4) {
                i3 = i2 != 5 ? 0 : 7;
            } else {
                i3 = 6;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: I */
    public final int m7724I() {
        int i2 = this.zzc;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = i2 != 2 ? 0 : 4;
            } else {
                i3 = 3;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: J */
    public final void m7725J(int i2) {
        if (i2 != 1) {
            this.zzb = i2 - 2;
        } else {
            zzifc.m8355a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m7726K(int i2) {
        if (i2 != 1) {
            this.zzc = i2 - 2;
        } else {
            zzifc.m8355a();
            throw null;
        }
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
            return new zzigl(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsf();
        }
        if (iOrdinal == 4) {
            return new zzhse(zzd);
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
        synchronized (zzhsf.class) {
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
