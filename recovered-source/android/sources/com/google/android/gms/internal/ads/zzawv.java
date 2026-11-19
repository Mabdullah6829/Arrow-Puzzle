package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawv extends zziep implements zziga {
    private static final zzawv zzj;
    private static volatile zzigh zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzaxm zzg;
    private zzaxs zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzawv zzawvVar = new zzawv();
        zzj = zzawvVar;
        zziep.m8338y(zzawv.class, zzawvVar);
    }

    private zzawv() {
    }

    /* JADX INFO: renamed from: H */
    public static zzawu m4485H() {
        return (zzawu) zzj.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final String m4486D() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4487E() {
        return this.zze;
    }

    /* JADX INFO: renamed from: F */
    public final zzaxm m4488F() {
        zzaxm zzaxmVar = this.zzg;
        return zzaxmVar == null ? zzaxm.m4518G() : zzaxmVar;
    }

    /* JADX INFO: renamed from: G */
    public final void m4489G() {
        if (this.zzh == null) {
            int i2 = zzaxs.f7197s;
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4490I(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4491J(boolean z) {
        this.zza |= 8;
        this.zze = z;
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
            return new zzigl(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzawy.f7191a, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzawv();
        }
        if (iOrdinal == 4) {
            return new zzawu(zzj);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzk;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzawv.class) {
            try {
                zziekVar = zzk;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzj);
                    zzk = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
