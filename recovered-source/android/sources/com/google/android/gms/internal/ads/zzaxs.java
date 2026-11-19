package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxs extends zziep implements zziga {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f7197s = 0;
    private static final zzaxs zzg;
    private static volatile zzigh zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zzg = zzaxsVar;
        zziep.m8338y(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
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
            return new zzigl(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxs();
        }
        if (iOrdinal == 4) {
            return new zzaxr(zzg);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzh;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxs.class) {
            try {
                zziekVar = zzh;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzg);
                    zzh = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
