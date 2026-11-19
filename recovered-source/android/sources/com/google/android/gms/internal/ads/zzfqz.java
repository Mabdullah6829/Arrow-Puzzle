package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqz extends zziep implements zziga {
    private static final zzfqz zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzfqw zzb;

    static {
        zzfqz zzfqzVar = new zzfqz();
        zzc = zzfqzVar;
        zziep.m8338y(zzfqz.class, zzfqzVar);
    }

    private zzfqz() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfqy m6615D() {
        return (zzfqy) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6616E(zzfqw zzfqwVar) {
        this.zzb = zzfqwVar;
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
            return new zzigl(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqz();
        }
        if (iOrdinal == 4) {
            return new zzfqy(zzc);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfqz.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
