package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zziij extends zziep implements zziga {
    private static final zziij zzb;
    private static volatile zzigh zzc;
    private zzifb zza = zzigk.f19864w;

    static {
        zziij zziijVar = new zziij();
        zzb = zziijVar;
        zziep.m8338y(zziij.class, zziijVar);
    }

    private zziij() {
    }

    /* JADX INFO: renamed from: D */
    public static zziii m8497D() {
        return (zziii) zzb.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m8498E(zziih zziihVar) {
        zzifb zzifbVar = this.zza;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zza = zzifbVar.mo8128l(size + size);
        }
        this.zza.add(zziihVar);
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
            return new zzigl(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziih.class});
        }
        if (iOrdinal == 3) {
            return new zziij();
        }
        if (iOrdinal == 4) {
            return new zziii(zzb);
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
        synchronized (zziij.class) {
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
