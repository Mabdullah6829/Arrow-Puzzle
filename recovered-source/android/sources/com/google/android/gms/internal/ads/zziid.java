package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziid extends zziep implements zziga {
    private static final zziid zzc;
    private static volatile zzigh zzd;
    private zziex zza;
    private zziex zzb;

    static {
        zziid zziidVar = new zziid();
        zzc = zziidVar;
        zziep.m8338y(zziid.class, zziidVar);
    }

    private zziid() {
        zzieq zzieqVar = zzieq.f19791w;
        this.zza = zzieqVar;
        this.zzb = zzieqVar;
    }

    /* JADX INFO: renamed from: D */
    public static zziid m8492D(byte[] bArr, zzidz zzidzVar) {
        return (zziid) zziep.m8336t(zzc, bArr, zzidzVar);
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
            return new zzigl(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziid();
        }
        if (iOrdinal == 4) {
            return new zziic(zzc);
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
        synchronized (zziid.class) {
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
