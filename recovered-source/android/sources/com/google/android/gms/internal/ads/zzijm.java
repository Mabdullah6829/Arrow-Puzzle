package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzijm extends zziep implements zziga {
    private static final zzijm zze;
    private static volatile zzigh zzf;
    private int zza;
    private int zzb;
    private zzidl zzc;
    private zzidl zzd;

    static {
        zzijm zzijmVar = new zzijm();
        zze = zzijmVar;
        zziep.m8338y(zzijm.class, zzijmVar);
    }

    private zzijm() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
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
            return new zzigl(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzijm();
        }
        if (iOrdinal == 4) {
            return new zzijl(zze);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzijm.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
