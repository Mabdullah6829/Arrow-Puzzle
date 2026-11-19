package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrh extends zziep implements zziga {
    private static final zzhrh zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhrj zzb;
    private int zzc;

    static {
        zzhrh zzhrhVar = new zzhrh();
        zzd = zzhrhVar;
        zziep.m8338y(zzhrh.class, zzhrhVar);
    }

    private zzhrh() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrg m7657F() {
        return (zzhrg) zzd.m8346v();
    }

    /* JADX INFO: renamed from: G */
    public static zzhrh m7658G() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final zzhrj m7659D() {
        zzhrj zzhrjVar = this.zzb;
        return zzhrjVar == null ? zzhrj.m7664F() : zzhrjVar;
    }

    /* JADX INFO: renamed from: E */
    public final int m7660E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7661H(zzhrj zzhrjVar) {
        this.zzb = zzhrjVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7662I(int i2) {
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
            return new zzhrh();
        }
        if (iOrdinal == 4) {
            return new zzhrg(zzd);
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
        synchronized (zzhrh.class) {
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
