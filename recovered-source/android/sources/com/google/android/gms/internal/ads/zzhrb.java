package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrb extends zziep implements zziga {
    private static final zzhrb zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzhrf zzc;
    private zzhsu zzd;

    static {
        zzhrb zzhrbVar = new zzhrb();
        zze = zzhrbVar;
        zziep.m8338y(zzhrb.class, zzhrbVar);
    }

    private zzhrb() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhrb m7636G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrb) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhra m7637H() {
        return (zzhra) zze.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzigh m7638I() {
        return zze.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7639D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhrf m7640E() {
        zzhrf zzhrfVar = this.zzc;
        return zzhrfVar == null ? zzhrf.m7651H() : zzhrfVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzhsu m7641F() {
        zzhsu zzhsuVar = this.zzd;
        return zzhsuVar == null ? zzhsu.m7767I() : zzhsuVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7642J(zzhrf zzhrfVar) {
        this.zzc = zzhrfVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7643K(zzhsu zzhsuVar) {
        this.zzd = zzhsuVar;
        this.zza |= 2;
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhrb();
        }
        if (iOrdinal == 4) {
            return new zzhra(zze);
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
        synchronized (zzhrb.class) {
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
