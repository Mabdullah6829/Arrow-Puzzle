package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzays extends zziep implements zziga {
    private static final zzays zzj;
    private static volatile zzigh zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzays zzaysVar = new zzays();
        zzj = zzaysVar;
        zziep.m8338y(zzays.class, zzaysVar);
    }

    private zzays() {
    }

    /* JADX INFO: renamed from: D */
    public static zzayr m4554D() {
        return (zzayr) zzj.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4555E(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4556F(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4557G(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4558H(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4559I(long j2) {
        this.zza |= 32;
        this.zzg = j2;
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
            return new zzigl(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzays();
        }
        if (iOrdinal == 4) {
            return new zzayr(zzj);
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
        synchronized (zzays.class) {
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
