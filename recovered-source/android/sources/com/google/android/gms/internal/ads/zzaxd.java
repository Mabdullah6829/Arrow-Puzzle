package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxd extends zziep implements zziga {
    private static final zzaxd zzo;
    private static volatile zzigh zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zzifb zzm = zzigk.f19864w;

    static {
        zzaxd zzaxdVar = new zzaxd();
        zzo = zzaxdVar;
        zziep.m8338y(zzaxd.class, zzaxdVar);
    }

    private zzaxd() {
    }

    /* JADX INFO: renamed from: D */
    public static zzawz m4510D() {
        return (zzawz) zzo.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4511E(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4512F(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4513G(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4514H(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4515I(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4516J(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4517K(int i2) {
        this.zzn = i2 - 1;
        this.zza |= 2048;
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
            return new zzigl(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzaxb.class, "zzn", zzaxc.f7193a});
        }
        if (iOrdinal == 3) {
            return new zzaxd();
        }
        if (iOrdinal == 4) {
            return new zzawz(zzo);
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzp;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzaxd.class) {
            try {
                zziekVar = zzp;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzo);
                    zzp = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
