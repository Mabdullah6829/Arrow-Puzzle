package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayz extends zziep implements zziga {
    private static final zzayz zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzidl zzb;
    private zzidl zzc;
    private zzidl zzd;
    private zzidl zze;

    static {
        zzayz zzayzVar = new zzayz();
        zzf = zzayzVar;
        zziep.m8338y(zzayz.class, zzayzVar);
    }

    private zzayz() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzb = zzidlVar;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: H */
    public static zzayz m4633H(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zzf, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzayz) zziepVarM8331B;
    }

    /* JADX INFO: renamed from: I */
    public static zzayy m4634I() {
        return (zzayy) zzf.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzidl m4635D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final zzidl m4636E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m4637F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzidl m4638G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4639J(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4640K(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4641L(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4642M(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 8;
        this.zze = zzidlVar;
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzayz();
        }
        if (iOrdinal == 4) {
            return new zzayy(zzf);
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
        synchronized (zzayz.class) {
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
