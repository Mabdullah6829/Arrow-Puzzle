package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhto extends zziep implements zziga {
    private static final zzhto zzc;
    private static volatile zzigh zzd;
    private int zza;
    private zzifb zzb = zzigk.f19864w;

    static {
        zzhto zzhtoVar = new zzhto();
        zzc = zzhtoVar;
        zziep.m8338y(zzhto.class, zzhtoVar);
    }

    private zzhto() {
    }

    /* JADX INFO: renamed from: D */
    public static zzhtl m7833D() {
        return (zzhtl) zzc.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7834E(int i2) {
        this.zza = i2;
    }

    /* JADX INFO: renamed from: F */
    public final void m7835F(zzhtn zzhtnVar) {
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzhtnVar);
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
            return new zzigl(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhtn.class});
        }
        if (iOrdinal == 3) {
            return new zzhto();
        }
        if (iOrdinal == 4) {
            return new zzhtl(zzc);
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
        synchronized (zzhto.class) {
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
