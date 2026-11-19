package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfrn extends zziep implements zziga {
    private static final zzfrn zzc;
    private static volatile zzigh zzd;
    private zzifb zza = zzigk.f19864w;
    private long zzb;

    static {
        zzfrn zzfrnVar = new zzfrn();
        zzc = zzfrnVar;
        zziep.m8338y(zzfrn.class, zzfrnVar);
    }

    private zzfrn() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfrm m6631D() {
        return (zzfrm) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m6632E(zzfqd zzfqdVar) {
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zza = zzifbVar.mo8128l(size + size);
        }
        this.zza.add(zzfqdVar);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6633F(long j2) {
        this.zzb = j2;
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
            return new zzigl(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfqd.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfrn();
        }
        if (iOrdinal == 4) {
            return new zzfrm(zzc);
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
        synchronized (zzfrn.class) {
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
