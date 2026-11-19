package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqx extends zziep implements zziga {
    private static final zzhqx zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhqz zzc;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zziep.m8338y(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhqx m7626F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhqx) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhqw m7627G() {
        return (zzhqw) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7628D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhqz m7629E() {
        zzhqz zzhqzVar = this.zzc;
        return zzhqzVar == null ? zzhqz.m7633F() : zzhqzVar;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7630H(int i2) {
        this.zzb = i2;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7631I(zzhqz zzhqzVar) {
        this.zzc = zzhqzVar;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqx();
        }
        if (iOrdinal == 4) {
            return new zzhqw(zzd);
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
        synchronized (zzhqx.class) {
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
