package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfym extends zziep implements zziga {
    private static final zzfym zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfyj zze;

    static {
        zzfym zzfymVar = new zzfym();
        zzf = zzfymVar;
        zziep.m8338y(zzfym.class, zzfymVar);
    }

    private zzfym() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfyk m6782D() {
        return (zzfyk) zzf.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6783E(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6784F(zzfyj zzfyjVar) {
        this.zze = zzfyjVar;
        this.zza |= 8;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6785G(int i2) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfyl.f16809a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfym();
        }
        if (iOrdinal == 4) {
            return new zzfyk(zzf);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfym.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
