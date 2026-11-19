package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhte extends zziep implements zziga {
    private static final zzhte zzd;
    private static volatile zzigh zze;
    private String zza = "";
    private zzidl zzb = zzidl.f19719t;
    private int zzc;

    static {
        zzhte zzhteVar = new zzhte();
        zzd = zzhteVar;
        zziep.m8338y(zzhte.class, zzhteVar);
    }

    private zzhte() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhte m7799G(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zzd, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzhte) zziepVarM8331B;
    }

    /* JADX INFO: renamed from: H */
    public static zzhtd m7800H() {
        return (zzhtd) zzd.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzhtd m7801I(zzhte zzhteVar) {
        zziej zziejVarM8346v = zzd.m8346v();
        zziejVarM8346v.m8329p(zzhteVar);
        return (zzhtd) zziejVarM8346v;
    }

    /* JADX INFO: renamed from: J */
    public static zzhte m7802J() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final String m7803D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7804E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: F */
    public final zzhtx m7805F() {
        zzhtx zzhtxVarM7860b = zzhtx.m7860b(this.zzc);
        return zzhtxVarM7860b == null ? zzhtx.UNRECOGNIZED : zzhtxVarM7860b;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7806K(String str) {
        str.getClass();
        this.zza = str;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7807L(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m7808M(zzhtx zzhtxVar) {
        this.zzc = zzhtxVar.zza();
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
            return new zzigl(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhte();
        }
        if (iOrdinal == 4) {
            return new zzhtd(zzd);
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
        synchronized (zzhte.class) {
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
