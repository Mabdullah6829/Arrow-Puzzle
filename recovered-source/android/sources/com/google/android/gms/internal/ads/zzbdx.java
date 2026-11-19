package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdx extends zziep implements zziga {
    private static final zzbdx zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzifb zzb = zzigk.f19864w;
    private zziib zzc;

    static {
        zzbdx zzbdxVar = new zzbdx();
        zzd = zzbdxVar;
        zziep.m8338y(zzbdx.class, zzbdxVar);
    }

    private zzbdx() {
    }

    /* JADX INFO: renamed from: D */
    public static zzbdw m4772D() {
        return (zzbdw) zzd.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m4773E(zzbdv zzbdvVar) {
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzbdvVar);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4774F(zziib zziibVar) {
        zziibVar.getClass();
        this.zzc = zziibVar;
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
            return new zzigl(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzbdv.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdx();
        }
        if (iOrdinal == 4) {
            return new zzbdw(zzd);
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
        synchronized (zzbdx.class) {
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
