package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayx extends zziep implements zziga {
    private static final zzayx zzc;
    private static volatile zzigh zzd;
    private zzifa zza;
    private zzifa zzb;

    static {
        zzayx zzayxVar = new zzayx();
        zzc = zzayxVar;
        zziep.m8338y(zzayx.class, zzayxVar);
    }

    private zzayx() {
        zzifn zzifnVar = zzifn.f19826w;
        this.zza = zzifnVar;
        this.zzb = zzifnVar;
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
            return new zzigl(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzayx();
        }
        if (iOrdinal == 4) {
            return new zzayw(zzc);
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
        synchronized (zzayx.class) {
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
