package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrt extends zziep implements zziga {
    private static final zzhrt zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhrt zzhrtVar = new zzhrt();
        zzc = zzhrtVar;
        zziep.m8338y(zzhrt.class, zzhrtVar);
    }

    private zzhrt() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrt m7691F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrt) zziep.m8335s(zzc, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhrs m7692G() {
        return (zzhrs) zzc.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7693D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final int m7694E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7695H(int i2) {
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhrt();
        }
        if (iOrdinal == 4) {
            return new zzhrs(zzc);
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
        synchronized (zzhrt.class) {
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
