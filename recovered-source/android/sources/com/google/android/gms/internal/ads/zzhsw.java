package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhsw extends zziep implements zziga {
    private static final zzhsw zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhsy zzb;
    private int zzc;
    private int zzd;

    static {
        zzhsw zzhswVar = new zzhsw();
        zze = zzhswVar;
        zziep.m8338y(zzhsw.class, zzhswVar);
    }

    private zzhsw() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhsw m7774G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhsw) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhsv m7775H() {
        return (zzhsv) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzhsw m7776I() {
        return zze;
    }

    /* JADX INFO: renamed from: D */
    public final zzhsy m7777D() {
        zzhsy zzhsyVar = this.zzb;
        return zzhsyVar == null ? zzhsy.m7783G() : zzhsyVar;
    }

    /* JADX INFO: renamed from: E */
    public final int m7778E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final int m7779F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7780J(zzhsy zzhsyVar) {
        this.zzb = zzhsyVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7781K(int i2) {
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhsw();
        }
        if (iOrdinal == 4) {
            return new zzhsv(zze);
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
        synchronized (zzhsw.class) {
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
