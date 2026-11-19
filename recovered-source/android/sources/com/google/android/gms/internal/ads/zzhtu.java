package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtu extends zziep implements zziga {
    private static final zzhtu zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhtw zzc;

    static {
        zzhtu zzhtuVar = new zzhtu();
        zzd = zzhtuVar;
        zziep.m8338y(zzhtu.class, zzhtuVar);
    }

    private zzhtu() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhtu m7847F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhtu) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhtt m7848G() {
        return (zzhtt) zzd.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzigh m7849H() {
        return zzd.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7850D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhtw m7851E() {
        zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? zzhtw.m7855H() : zzhtwVar;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7852I(zzhtw zzhtwVar) {
        this.zzc = zzhtwVar;
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
            return new zzigl(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhtu();
        }
        if (iOrdinal == 4) {
            return new zzhtt(zzd);
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
        synchronized (zzhtu.class) {
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
