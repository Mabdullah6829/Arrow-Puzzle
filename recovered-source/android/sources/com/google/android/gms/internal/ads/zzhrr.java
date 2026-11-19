package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhrr extends zziep implements zziga {
    private static final zzhrr zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzidl zzb = zzidl.f19719t;

    static {
        zzhrr zzhrrVar = new zzhrr();
        zzc = zzhrrVar;
        zziep.m8338y(zzhrr.class, zzhrrVar);
    }

    private zzhrr() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhrr m7685F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhrr) zziep.m8335s(zzc, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhrq m7686G() {
        return (zzhrq) zzc.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzigh m7687H() {
        return zzc.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7688D() {
        return this.zza;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m7689E() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7690I(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzb = zzidlVar;
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhrr();
        }
        if (iOrdinal == 4) {
            return new zzhrq(zzc);
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
        synchronized (zzhrr.class) {
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
