package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrj extends zziep implements zziga {
    private static final zzhrj zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhrj zzhrjVar = new zzhrj();
        zzb = zzhrjVar;
        zziep.m8338y(zzhrj.class, zzhrjVar);
    }

    private zzhrj() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhri m7663E() {
        return (zzhri) zzb.m8346v();
    }

    /* JADX INFO: renamed from: F */
    public static zzhrj m7664F() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final int m7665D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7666G(int i2) {
        this.zza = i2;
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhrj();
        }
        if (iOrdinal == 4) {
            return new zzhri(zzb);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhrj.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
