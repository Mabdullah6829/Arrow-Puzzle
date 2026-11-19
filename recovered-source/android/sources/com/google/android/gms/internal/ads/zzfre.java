package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfre extends zziep implements zziga {
    private static final zzfre zzi;
    private static volatile zzigh zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfre zzfreVar = new zzfre();
        zzi = zzfreVar;
        zziep.m8338y(zzfre.class, zzfreVar);
    }

    private zzfre() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfrd m6622D() {
        return (zzfrd) zzi.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6623E(String str) {
        str.getClass();
        this.zza = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6624F(long j2) {
        this.zzb = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6625G(long j2) {
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6626H(boolean z) {
        this.zzd = z;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m6627I(long j2) {
        this.zze = j2;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m6628J(long j2) {
        this.zzf = j2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m6629K(String str) {
        str.getClass();
        this.zzg = str;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6630L(int i2) {
        this.zzh = i2 - 2;
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
            return new zzigl(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfre();
        }
        if (iOrdinal == 4) {
            return new zzfrd(zzi);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzj;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfre.class) {
            try {
                zziekVar = zzj;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzi);
                    zzj = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
