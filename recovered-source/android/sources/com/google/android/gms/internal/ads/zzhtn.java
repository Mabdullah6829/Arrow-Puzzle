package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtn extends zziep implements zziga {
    private static final zzhtn zze;
    private static volatile zzigh zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhtn zzhtnVar = new zzhtn();
        zze = zzhtnVar;
        zziep.m8338y(zzhtn.class, zzhtnVar);
    }

    private zzhtn() {
    }

    /* JADX INFO: renamed from: D */
    public static zzhtm m7828D() {
        return (zzhtm) zze.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7829E(String str) {
        str.getClass();
        this.zza = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m7830F(int i2) {
        this.zzc = i2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7831G(zzhtx zzhtxVar) {
        this.zzd = zzhtxVar.zza();
    }

    /* JADX INFO: renamed from: H */
    public final void m7832H(int i2) {
        if (i2 != 1) {
            this.zzb = i2 - 2;
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
            return new zzigl(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhtn();
        }
        if (iOrdinal == 4) {
            return new zzhtm(zze);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhtn.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
