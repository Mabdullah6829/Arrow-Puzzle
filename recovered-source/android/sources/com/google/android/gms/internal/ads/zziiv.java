package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziiv extends zziep implements zziga {
    private static final zziiv zzc;
    private static volatile zzigh zzd;
    private int zza;
    private String zzb = "";

    static {
        zziiv zziivVar = new zziiv();
        zzc = zziivVar;
        zziep.m8338y(zziiv.class, zziivVar);
    }

    private zziiv() {
    }

    /* JADX INFO: renamed from: D */
    public static zziiu m8499D() {
        return (zziiu) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8500E(String str) {
        this.zza |= 1;
        this.zzb = str;
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
            return new zzigl(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zziiv();
        }
        if (iOrdinal == 4) {
            return new zziiu(zzc);
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
        synchronized (zziiv.class) {
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
