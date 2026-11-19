package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhuv extends zziep implements zziga {
    private static final zzhuv zzb;
    private static volatile zzigh zzc;
    private int zza;

    static {
        zzhuv zzhuvVar = new zzhuv();
        zzb = zzhuvVar;
        zziep.m8338y(zzhuv.class, zzhuvVar);
    }

    private zzhuv() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhuu m7963E() {
        return (zzhuu) zzb.m8346v();
    }

    /* JADX INFO: renamed from: F */
    public static zzhuv m7964F() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public final int m7965D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7966G(int i2) {
        this.zza = i2;
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhuv();
        }
        if (iOrdinal == 4) {
            return new zzhuu(zzb);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhuv.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
