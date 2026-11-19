package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbek extends zziep implements zziga {
    private static final zzbek zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzbek zzbekVar = new zzbek();
        zzd = zzbekVar;
        zziep.m8338y(zzbek.class, zzbekVar);
    }

    private zzbek() {
    }

    /* JADX INFO: renamed from: F */
    public static zzbek m4806F() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final int m4807D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final int m4808E() {
        return this.zzc;
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
            return new zzigl(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbek();
        }
        if (iOrdinal == 4) {
            return new zzbej(zzd);
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
        synchronized (zzbek.class) {
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
