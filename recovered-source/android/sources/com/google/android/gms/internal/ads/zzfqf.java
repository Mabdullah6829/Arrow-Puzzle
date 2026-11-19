package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqf extends zziep implements zziga {
    private static final zzfqf zzi;
    private static volatile zzigh zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzfqf zzfqfVar = new zzfqf();
        zzi = zzfqfVar;
        zziep.m8338y(zzfqf.class, zzfqfVar);
    }

    private zzfqf() {
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
            return new zzigl(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfqf();
        }
        if (iOrdinal == 4) {
            return new zzfqe(zzi);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzj;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfqf.class) {
            try {
                zziekVar = zzj;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzi);
                    zzj = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
