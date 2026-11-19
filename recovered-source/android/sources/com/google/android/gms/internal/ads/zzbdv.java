package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdv extends zziep implements zziga {
    private static final zzbdv zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzawx zzb;

    static {
        zzbdv zzbdvVar = new zzbdv();
        zzc = zzbdvVar;
        zziep.m8338y(zzbdv.class, zzbdvVar);
    }

    private zzbdv() {
    }

    /* JADX INFO: renamed from: D */
    public static zzbdu m4770D() {
        return (zzbdu) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4771E(zzawx zzawxVar) {
        this.zzb = zzawxVar;
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
            return new zzigl(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzbdv();
        }
        if (iOrdinal == 4) {
            return new zzbdu(zzc);
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
        synchronized (zzbdv.class) {
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
