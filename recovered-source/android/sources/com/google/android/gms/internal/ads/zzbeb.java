package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbeb extends zziep implements zziga {
    private static final zzbeb zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzbei zzb;
    private zzidl zzc;
    private zzidl zzd;

    static {
        zzbeb zzbebVar = new zzbeb();
        zze = zzbebVar;
        zziep.m8338y(zzbeb.class, zzbebVar);
    }

    private zzbeb() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: G */
    public static zzbeb m4778G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzbeb) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzbeb m4779H(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zze, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzbeb) zziepVarM8331B;
    }

    /* JADX INFO: renamed from: D */
    public final zzbei m4780D() {
        zzbei zzbeiVar = this.zzb;
        return zzbeiVar == null ? zzbei.m4795L() : zzbeiVar;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m4781E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m4782F() {
        return this.zzd;
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
            return new zzigl(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbeb();
        }
        if (iOrdinal == 4) {
            return new zzbea(zze);
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
        synchronized (zzbeb.class) {
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
