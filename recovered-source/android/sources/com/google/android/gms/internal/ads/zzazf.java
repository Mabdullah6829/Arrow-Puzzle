package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazf extends zziep implements zziga {
    private static final zzazf zzi;
    private static volatile zzigh zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        zzazf zzazfVar = new zzazf();
        zzi = zzazfVar;
        zziep.m8338y(zzazf.class, zzazfVar);
    }

    private zzazf() {
    }

    /* JADX INFO: renamed from: D */
    public static zzaze m4657D() {
        return (zzaze) zzi.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4658E(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4659F(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4660G(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4661H(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4662I(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4663J(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4664K(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
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
            return new zzigl(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzazf();
        }
        if (iOrdinal == 4) {
            return new zzaze(zzi);
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
        synchronized (zzazf.class) {
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
