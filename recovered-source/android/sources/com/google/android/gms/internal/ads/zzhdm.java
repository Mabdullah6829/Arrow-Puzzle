package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdm extends zziep implements zziga {
    private static final zzhdm zzd;
    private static volatile zzigh zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhdm zzhdmVar = new zzhdm();
        zzd = zzhdmVar;
        zziep.m8338y(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    /* JADX INFO: renamed from: D */
    public static zzhdl m7391D() {
        return (zzhdl) zzd.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7392E(long j2) {
        this.zza |= 1;
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m7393F(int i2) {
        this.zzc = i2 - 1;
        this.zza |= 2;
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
            return new zzigl(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzhdj.f18542a});
        }
        if (iOrdinal == 3) {
            return new zzhdm();
        }
        if (iOrdinal == 4) {
            return new zzhdl(zzd);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhdm.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
