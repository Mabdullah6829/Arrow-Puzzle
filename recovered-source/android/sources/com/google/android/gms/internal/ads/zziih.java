package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziih extends zziep implements zziga {
    private static final zziih zzd;
    private static volatile zzigh zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zziih zziihVar = new zziih();
        zzd = zziihVar;
        zziep.m8338y(zziih.class, zziihVar);
    }

    private zziih() {
    }

    /* JADX INFO: renamed from: D */
    public static zziig m8493D() {
        return (zziig) zzd.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8494E(int i2) {
        this.zza = i2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m8495F(long j2) {
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8496G(long j2) {
        this.zzc = j2;
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
            return new zzigl(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziih();
        }
        if (iOrdinal == 4) {
            return new zziig(zzd);
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
        synchronized (zziih.class) {
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
