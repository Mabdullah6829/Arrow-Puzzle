package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdr extends zziep implements zziga {
    private static final zzbdr zzj;
    private static volatile zzigh zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private zzidl zzb = zzidl.f19719t;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbdr zzbdrVar = new zzbdr();
        zzj = zzbdrVar;
        zziep.m8338y(zzbdr.class, zzbdrVar);
    }

    private zzbdr() {
    }

    /* JADX INFO: renamed from: D */
    public static zzbdq m4758D() {
        return (zzbdq) zzj.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4759E(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4760F(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4761G(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 4;
        this.zzd = str2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4762H(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4763I(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4764J(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4765K(int i2) {
        this.zzh = 1;
        this.zza |= 64;
    }

    /* JADX INFO: renamed from: L */
    public final void m4766L(int i2) {
        this.zzi = i2 - 2;
        this.zza |= 128;
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
            return new zzigl(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzbdr();
        }
        if (iOrdinal == 4) {
            return new zzbdq(zzj);
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
        synchronized (zzbdr.class) {
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
