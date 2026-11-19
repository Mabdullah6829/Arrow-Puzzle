package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrn extends zziep implements zziga {
    private static final zzhrn zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrp zzb;
    private int zzc;

    static {
        zzhrn zzhrnVar = new zzhrn();
        zzd = zzhrnVar;
        zziep.m8338y(zzhrn.class, zzhrnVar);
    }

    private zzhrn() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrn m7675F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrn) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhrm m7676G() {
        return (zzhrm) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzhrp m7677D() {
        zzhrp zzhrpVar = this.zzb;
        return zzhrpVar == null ? zzhrp.m7682F() : zzhrpVar;
    }

    /* JADX INFO: renamed from: E */
    public final int m7678E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7679H(zzhrp zzhrpVar) {
        this.zzb = zzhrpVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7680I(int i2) {
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrn();
        }
        if (iOrdinal == 4) {
            return new zzhrm(zzd);
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
        synchronized (zzhrn.class) {
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
