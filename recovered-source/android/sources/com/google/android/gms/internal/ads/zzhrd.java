package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrd extends zziep implements zziga {
    private static final zzhrd zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrh zzb;
    private zzhsw zzc;

    static {
        zzhrd zzhrdVar = new zzhrd();
        zzd = zzhrdVar;
        zziep.m8338y(zzhrd.class, zzhrdVar);
    }

    private zzhrd() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrd m7644F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrd) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhrc m7645G() {
        return (zzhrc) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzhrh m7646D() {
        zzhrh zzhrhVar = this.zzb;
        return zzhrhVar == null ? zzhrh.m7658G() : zzhrhVar;
    }

    /* JADX INFO: renamed from: E */
    public final zzhsw m7647E() {
        zzhsw zzhswVar = this.zzc;
        return zzhswVar == null ? zzhsw.m7776I() : zzhswVar;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7648H(zzhrh zzhrhVar) {
        this.zzb = zzhrhVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7649I(zzhsw zzhswVar) {
        this.zzc = zzhswVar;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhrd();
        }
        if (iOrdinal == 4) {
            return new zzhrc(zzd);
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
        synchronized (zzhrd.class) {
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
