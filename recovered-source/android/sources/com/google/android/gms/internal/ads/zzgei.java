package com.google.android.gms.internal.ads;

import com.google.firebase.firestore.util.ExponentialBackoff;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgei extends zziep implements zziga {
    private static final zzgei zzf;
    private static volatile zzigh zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS;

    static {
        zzgei zzgeiVar = new zzgei();
        zzf = zzgeiVar;
        zziep.m8338y(zzgei.class, zzgeiVar);
    }

    private zzgei() {
    }

    /* JADX INFO: renamed from: H */
    public static zzgeh m6947H() {
        return (zzgeh) zzf.m8346v();
    }

    /* JADX INFO: renamed from: I */
    public static zzgei m6948I() {
        return zzf;
    }

    /* JADX INFO: renamed from: D */
    public final String m6949D() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: E */
    public final float m6950E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final long m6951F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final long m6952G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m6953J(float f2) {
        this.zza |= 2;
        this.zzc = f2;
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
            return new zzigl(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgei();
        }
        if (iOrdinal == 4) {
            return new zzgeh(zzf);
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
        synchronized (zzgei.class) {
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
