package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtq extends zziep implements zziga {
    private static final zzhtq zzd;
    private static volatile zzigh zze;
    private int zza;
    private int zzb;
    private zzhts zzc;

    static {
        zzhtq zzhtqVar = new zzhtq();
        zzd = zzhtqVar;
        zziep.m8338y(zzhtq.class, zzhtqVar);
    }

    private zzhtq() {
    }

    /* JADX INFO: renamed from: F */
    public static zzhtq m7836F(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhtq) zziep.m8335s(zzd, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: G */
    public static zzhtp m7837G() {
        return (zzhtp) zzd.m8346v();
    }

    /* JADX INFO: renamed from: H */
    public static zzigh m7838H() {
        return zzd.mo8341e();
    }

    /* JADX INFO: renamed from: D */
    public final int m7839D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzhts m7840E() {
        zzhts zzhtsVar = this.zzc;
        return zzhtsVar == null ? zzhts.m7844G() : zzhtsVar;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7841I(zzhts zzhtsVar) {
        this.zzc = zzhtsVar;
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
            return new zzhtq();
        }
        if (iOrdinal == 4) {
            return new zzhtp(zzd);
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
        synchronized (zzhtq.class) {
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
