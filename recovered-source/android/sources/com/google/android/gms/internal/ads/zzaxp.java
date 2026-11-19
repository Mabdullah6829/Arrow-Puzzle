package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxp extends zziep implements zziga {
    private static final zzaxp zzi;
    private static volatile zzigh zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzaxp zzaxpVar = new zzaxp();
        zzi = zzaxpVar;
        zziep.m8338y(zzaxp.class, zzaxpVar);
    }

    private zzaxp() {
    }

    /* JADX INFO: renamed from: D */
    public static zzaxo m4522D() {
        return (zzaxo) zzi.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4523E(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4524F(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4525G(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4526H(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4527I(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4528J(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4529K(int i2) {
        this.zzd = i2 - 1;
        this.zza |= 4;
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
            return new zzigl(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxq.f7196a, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzaxp();
        }
        if (iOrdinal == 4) {
            return new zzaxo(zzi);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzj;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxp.class) {
            try {
                zziekVar = zzj;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzi);
                    zzj = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
