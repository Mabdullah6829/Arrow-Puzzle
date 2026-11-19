package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtb extends zziep implements zziga {
    private static final zzhtb zzd;
    private static volatile zzigh zze;
    private String zza = "";
    private zzidl zzb = zzidl.f19719t;
    private int zzc;

    static {
        zzhtb zzhtbVar = new zzhtb();
        zzd = zzhtbVar;
        zziep.m8338y(zzhtb.class, zzhtbVar);
    }

    private zzhtb() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhsz m7788G() {
        return (zzhsz) zzd.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzhtb m7789H() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final String m7790D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7791E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: F */
    public final zzhta m7792F() {
        zzhta zzhtaVar;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzhtaVar = zzhta.UNKNOWN_KEYMATERIAL;
        } else if (i2 == 1) {
            zzhtaVar = zzhta.SYMMETRIC;
        } else if (i2 == 2) {
            zzhtaVar = zzhta.ASYMMETRIC_PRIVATE;
        } else if (i2 != 3) {
            zzhtaVar = i2 != 4 ? null : zzhta.REMOTE;
        } else {
            zzhtaVar = zzhta.ASYMMETRIC_PUBLIC;
        }
        return zzhtaVar == null ? zzhta.UNRECOGNIZED : zzhtaVar;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7793I(String str) {
        str.getClass();
        this.zza = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7794J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7795K(zzhta zzhtaVar) {
        this.zzc = zzhtaVar.zza();
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
            return new zzhtb();
        }
        if (iOrdinal == 4) {
            return new zzhsz(zzd);
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
        synchronized (zzhtb.class) {
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
