package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxw extends zziep implements zziga {
    private static final zzaxw zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzc = zzaxwVar;
        zziep.m8338y(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
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
            return new zzigl(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zza", "zzb", zzaxz.f7201a});
        }
        if (iOrdinal == 3) {
            return new zzaxw();
        }
        if (iOrdinal == 4) {
            return new zzaxv(zzc);
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
        synchronized (zzaxw.class) {
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
