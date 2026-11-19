package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzilv extends zziep implements zziga {
    private static final zzilv zzl;
    private static volatile zzigh zzm;
    private int zza;
    private zzidl zzb = zzidl.f19719t;
    private zziex zzc;
    private long zzd;
    private zziex zze;
    private zzifb zzf;
    private String zzg;
    private zzifb zzh;
    private zzilx zzi;
    private zzilz zzj;
    private zzibo zzk;

    static {
        zzilv zzilvVar = new zzilv();
        zzl = zzilvVar;
        zziep.m8338y(zzilv.class, zzilvVar);
    }

    private zzilv() {
        zzieq zzieqVar = zzieq.f19791w;
        this.zzc = zzieqVar;
        this.zze = zzieqVar;
        zzigk zzigkVar = zzigk.f19864w;
        this.zzf = zzigkVar;
        this.zzg = "";
        this.zzh = zzigkVar;
    }

    /* JADX INFO: renamed from: D */
    public static zzilv m8538D(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zzl, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzilv) zziepVarM8331B;
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
            return new zzigl(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzilk.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzilv();
        }
        if (iOrdinal == 4) {
            return new zzilu(zzl);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzm;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzilv.class) {
            try {
                zziekVar = zzm;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzl);
                    zzm = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
