package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziib extends zziep implements zziga {
    private static final zziib zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zziex zzc = zzieq.f19791w;

    static {
        zziib zziibVar = new zziib();
        zzd = zziibVar;
        zziep.m8338y(zziib.class, zziibVar);
    }

    private zziib() {
    }

    /* JADX INFO: renamed from: D */
    public static zziia m8490D() {
        return (zziia) zzd.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8491E(int i2) {
        this.zza = 15;
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
            return new zzigl(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziib();
        }
        if (iOrdinal == 4) {
            return new zziia(zzd);
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
        synchronized (zziib.class) {
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
