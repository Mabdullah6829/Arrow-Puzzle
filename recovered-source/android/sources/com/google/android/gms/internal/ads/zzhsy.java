package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsy extends zziep implements zziga {
    private static final zzhsy zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhsy zzhsyVar = new zzhsy();
        zzc = zzhsyVar;
        zziep.m8338y(zzhsy.class, zzhsyVar);
    }

    private zzhsy() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhsx m7782F() {
        return (zzhsx) zzc.m8346v();
    }

    /* JADX INFO: renamed from: G */
    public static zzhsy m7783G() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final zzhss m7784D() {
        zzhss zzhssVarM7764b = zzhss.m7764b(this.zza);
        return zzhssVarM7764b == null ? zzhss.UNRECOGNIZED : zzhssVarM7764b;
    }

    /* JADX INFO: renamed from: E */
    public final int m7785E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7786H(zzhss zzhssVar) {
        this.zza = zzhssVar.zza();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7787I(int i2) {
        this.zzb = i2;
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhsy();
        }
        if (iOrdinal == 4) {
            return new zzhsx(zzc);
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
        synchronized (zzhsy.class) {
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
