package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayq extends zziep implements zziga {
    private static final zzayq zzA;
    private static volatile zzigh zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzayq zzayqVar = new zzayq();
        zzA = zzayqVar;
        zziep.m8338y(zzayq.class, zzayqVar);
    }

    private zzayq() {
    }

    /* JADX INFO: renamed from: D */
    public static zzayp m4533D() {
        return (zzayp) zzA.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4534E(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4535F(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4536G(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4537H(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4538I() {
        this.zza &= -9;
        this.zze = -1L;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4539J(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4540K(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4541L(long j2) {
        this.zza |= 128;
        this.zzi = j2;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4542M(long j2) {
        this.zza |= 256;
        this.zzj = j2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4543N(long j2) {
        this.zza |= 512;
        this.zzk = j2;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4544O(long j2) {
        this.zza |= 2048;
        this.zzm = j2;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4545P(long j2) {
        this.zza |= 4096;
        this.zzn = j2;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m4546Q(long j2) {
        this.zza |= 8192;
        this.zzo = j2;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m4547R(long j2) {
        this.zza |= 16384;
        this.zzp = j2;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4548S(long j2) {
        this.zza |= 32768;
        this.zzu = j2;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4549T(long j2) {
        this.zza |= 65536;
        this.zzv = j2;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m4550U(long j2) {
        this.zza |= 131072;
        this.zzw = j2;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m4551V(long j2) {
        this.zza |= 262144;
        this.zzx = j2;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m4552W(int i2) {
        this.zzh = i2 - 1;
        this.zza |= 64;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m4553X(int i2) {
        this.zzl = i2 - 1;
        this.zza |= 1024;
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
            zziev zzievVar = zzazd.f7205a;
            return new zzigl(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzievVar, "zzi", "zzj", "zzk", "zzl", zzievVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iOrdinal == 3) {
            return new zzayq();
        }
        if (iOrdinal == 4) {
            return new zzayp(zzA);
        }
        if (iOrdinal == 5) {
            return zzA;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzB;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayq.class) {
            try {
                zziekVar = zzB;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzA);
                    zzB = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
