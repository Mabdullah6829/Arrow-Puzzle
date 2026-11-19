package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdq extends zziep implements zziga {
    private static final zzhdq zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zzigk.f19864w;

    static {
        zzhdq zzhdqVar = new zzhdq();
        zzb = zzhdqVar;
        zziep.m8338y(zzhdq.class, zzhdqVar);
    }

    private zzhdq() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhdn m7397E() {
        return (zzhdn) zzb.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final int m7398D() {
        return this.zza.size();
    }

    /* JADX INFO: renamed from: F */
    public final void m7399F(zzhdp zzhdpVar) {
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zza = zzifbVar.mo8128l(size + size);
        }
        this.zza.add(zzhdpVar);
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
            return new zzigl(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhdp.class});
        }
        if (iOrdinal == 3) {
            return new zzhdq();
        }
        if (iOrdinal == 4) {
            return new zzhdn(zzb);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhdq.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
