package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzijy extends zziep implements zziga {
    private static final zzijy zzf;
    private static volatile zzigh zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzidl zzd;
    private zzidl zze;

    static {
        zzijy zzijyVar = new zzijy();
        zzf = zzijyVar;
        zziep.m8338y(zzijy.class, zzijyVar);
    }

    private zzijy() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: D */
    public static zzijw m8507D() {
        return (zzijw) zzf.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8508E(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m8509F(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 4;
        this.zzd = zzidlVar;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8510G(int i2) {
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzijx.f19946a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzijy();
        }
        if (iOrdinal == 4) {
            return new zzijw(zzf);
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
        synchronized (zzijy.class) {
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
