package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziir extends zziep implements zziga {
    private static final zziir zzy;
    private static volatile zzigh zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private zzifb zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzifb zzo;
    private boolean zzp;
    private long zzu;
    private zziex zzv;
    private boolean zzw;
    private zziex zzx;

    static {
        zziir zziirVar = new zziir();
        zzy = zziirVar;
        zziep.m8338y(zziir.class, zziirVar);
    }

    private zziir() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zze = zzigkVar;
        this.zzj = "";
        this.zzo = zzigkVar;
        zzieq zzieqVar = zzieq.f19791w;
        this.zzv = zzieqVar;
        this.zzx = zzieqVar;
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
            return new zzigl(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zziiq.f19938a, "zzc", "zzd", "zze", "zzf", zziio.f19936a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zziin.class, "zzp", "zzu", "zzv", zziie.f19934a, "zzw", "zzx", zziip.f19937a});
        }
        if (iOrdinal == 3) {
            return new zziir();
        }
        if (iOrdinal == 4) {
            return new zziik(zzy);
        }
        if (iOrdinal == 5) {
            return zzy;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzz;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zziir.class) {
            try {
                zziekVar = zzz;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzy);
                    zzz = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
