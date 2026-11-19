package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrx extends zziep implements zziga {
    private static final zzhrx zzc;
    private static volatile zzigh zzd;
    private int zza;
    private int zzb;

    static {
        zzhrx zzhrxVar = new zzhrx();
        zzc = zzhrxVar;
        zziep.m8338y(zzhrx.class, zzhrxVar);
    }

    private zzhrx() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrx m7702F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrx) zziep.m8335s(zzc, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhrw m7703G() {
        return (zzhrw) zzc.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7704D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final int m7705E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m7706H(int i2) {
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhrx();
        }
        if (iOrdinal == 4) {
            return new zzhrw(zzc);
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
        synchronized (zzhrx.class) {
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
