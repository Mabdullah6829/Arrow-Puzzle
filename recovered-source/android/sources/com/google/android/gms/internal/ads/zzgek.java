package com.google.android.gms.internal.ads;

import com.google.firebase.firestore.util.ExponentialBackoff;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgek extends zziep implements zziga {
    private static final zzgek zzl;
    private static volatile zzigh zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS;

    static {
        zzgek zzgekVar = new zzgek();
        zzl = zzgekVar;
        zziep.m8338y(zzgek.class, zzgekVar);
    }

    private zzgek() {
    }

    /* JADX INFO: renamed from: K */
    public static zzgej m6954K() {
        return (zzgej) zzl.m8346v();
    }

    /* JADX INFO: renamed from: L */
    public static zzgek m6955L() {
        return zzl;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6956D() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: E */
    public final long m6957E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: F */
    public final String m6958F() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final long m6959G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m6960H() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: I */
    public final long m6961I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: J */
    public final long m6962J() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m6963M(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m6964N(long j2) {
        this.zza |= 64;
        this.zzh = j2;
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
            return new zzigl(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzgek();
        }
        if (iOrdinal == 4) {
            return new zzgej(zzl);
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
        synchronized (zzgek.class) {
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
