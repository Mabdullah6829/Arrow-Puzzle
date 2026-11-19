package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbeg extends zziep implements zziga {
    private static final zzbeg zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzbek zzb;
    private zzidl zzc = zzidl.f19719t;
    private long zzd;
    private long zze;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzf = zzbegVar;
        zziep.m8338y(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    /* JADX INFO: renamed from: G */
    public static zzbeg m4788G() {
        return zzf;
    }

    /* JADX INFO: renamed from: D */
    public final zzbek m4789D() {
        zzbek zzbekVar = this.zzb;
        return zzbekVar == null ? zzbek.m4806F() : zzbekVar;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m4790E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final long m4791F() {
        return this.zze;
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
            return new zzigl(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbeg();
        }
        if (iOrdinal == 4) {
            return new zzbef(zzf);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbeg.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
