package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawx extends zziep implements zziga {
    private static final zzawx zzu;
    private static volatile zzigh zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzifb zzb = zzigk.f19864w;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zziex zzn = zzieq.f19791w;

    static {
        zzawx zzawxVar = new zzawx();
        zzu = zzawxVar;
        zziep.m8338y(zzawx.class, zzawxVar);
    }

    private zzawx() {
    }

    /* JADX INFO: renamed from: D */
    public static zzaww m4493D() {
        return (zzaww) zzu.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m4494E(zzaxp zzaxpVar) {
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzaxpVar);
    }

    /* JADX INFO: renamed from: F */
    public final void m4495F() {
        this.zzb = zzigk.f19864w;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4496G(long j2) {
        this.zza |= 1;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4497H(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4498I(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4499J(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4500K(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4501L(long j2) {
        this.zza |= 64;
        this.zzi = j2;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4502M(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4503N(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4504O(long j2) {
        this.zza |= 512;
        this.zzl = j2;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4505P(long j2) {
        this.zza |= 1024;
        this.zzm = j2;
    }

    /* JADX INFO: renamed from: Q */
    public final void m4506Q(zziex zziexVar) {
        zziex zziexVar2 = this.zzn;
        if (!zziexVar2.zza()) {
            int size = zziexVar2.size();
            this.zzn = zziexVar2.mo8128l(size + size);
        }
        zzicu.m8096l(zziexVar, this.zzn);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m4507R(int i2) {
        this.zzg = i2 - 1;
        this.zza |= 16;
    }

    /* JADX INFO: renamed from: S */
    public final void m4508S(int i2) {
        this.zzo = i2 - 2;
        this.zza |= 2048;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4509T(int i2) {
        this.zzp = 1;
        this.zza |= 4096;
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
            return new zzigl(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxp.class, "zzc", "zzd", "zze", "zzf", "zzg", zzaxn.f7195a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (iOrdinal == 3) {
            return new zzawx();
        }
        if (iOrdinal == 4) {
            return new zzaww(zzu);
        }
        if (iOrdinal == 5) {
            return zzu;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzv;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzawx.class) {
            try {
                zziekVar = zzv;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzu);
                    zzv = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
