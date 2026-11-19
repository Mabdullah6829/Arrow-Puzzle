package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbee extends zziep implements zziga {
    private static final zzbee zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzbeg zzb;
    private zzidl zzc = zzidl.f19719t;

    static {
        zzbee zzbeeVar = new zzbee();
        zzd = zzbeeVar;
        zziep.m8338y(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    /* JADX INFO: renamed from: H */
    public static zzbee m4783H() {
        return zzd;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4784D() {
        return (this.zza & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final zzbeg m4785E() {
        zzbeg zzbegVar = this.zzb;
        return zzbegVar == null ? zzbeg.m4788G() : zzbegVar;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4786F() {
        return (this.zza & 2) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m4787G() {
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
            return new zzigl(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbee();
        }
        if (iOrdinal == 4) {
            return new zzbed(zzd);
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
        synchronized (zzbee.class) {
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
