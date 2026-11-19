package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfra extends zziep implements zziga {
    private static final zzfra zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzifb zzb = zzigk.f19864w;
    private zziib zzc;

    static {
        zzfra zzfraVar = new zzfra();
        zzd = zzfraVar;
        zziep.m8338y(zzfra.class, zzfraVar);
    }

    private zzfra() {
    }

    /* JADX INFO: renamed from: E */
    public static zzfqx m6618E() {
        return (zzfqx) zzd.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m6619D() {
        return this.zzb.size();
    }

    /* JADX INFO: renamed from: F */
    public final void m6620F(zzfqz zzfqzVar) {
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzfqzVar);
    }

    /* JADX INFO: renamed from: G */
    public final void m6621G() {
        this.zzb = zzigk.f19864w;
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
            return new zzigl(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfqz.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfra();
        }
        if (iOrdinal == 4) {
            return new zzfqx(zzd);
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
        synchronized (zzfra.class) {
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
