package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhup extends zziep implements zziga {
    private static final zzhup zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private zzhul zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzhup zzhupVar = new zzhup();
        zzf = zzhupVar;
        zziep.m8338y(zzhup.class, zzhupVar);
    }

    private zzhup() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: H */
    public static zzhup m7939H(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhup) zziep.m8335s(zzf, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: I */
    public static zzhuo m7940I() {
        return (zzhuo) zzf.m8346v();
    }

    /* JADX INFO: renamed from: J */
    public static zzhup m7941J() {
        return zzf;
    }

    /* JADX INFO: renamed from: K */
    public static zzigh m7942K() {
        return zzf.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7943D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhul m7944E() {
        zzhul zzhulVar = this.zzc;
        return zzhulVar == null ? zzhul.m7913H() : zzhulVar;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7945F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m7946G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7947L(int i2) {
        this.zzb = 0;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m7948M(zzhul zzhulVar) {
        this.zzc = zzhulVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m7949N(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m7950O(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zze = zzidlVar;
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
            return new zzigl(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhup();
        }
        if (iOrdinal == 4) {
            return new zzhuo(zzf);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhup.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
