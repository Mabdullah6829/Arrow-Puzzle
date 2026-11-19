package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqd extends zziep implements zziga {
    private static final zzfqd zzc;
    private static volatile zzigh zzd;
    private int zza;
    private long zzb;

    static {
        zzfqd zzfqdVar = new zzfqd();
        zzc = zzfqdVar;
        zziep.m8338y(zzfqd.class, zzfqdVar);
    }

    private zzfqd() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfqc m6558D() {
        return (zzfqc) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6559E(long j2) {
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6560F(int i2) {
        this.zza = i2 - 2;
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
            return new zzigl(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfqd();
        }
        if (iOrdinal == 4) {
            return new zzfqc(zzc);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfqd.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
