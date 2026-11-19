package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazm extends zziep implements zziga {
    private static final zzazm zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzifb zzb = zzigk.f19864w;
    private zzidl zzc = zzidl.f19719t;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzazm zzazmVar = new zzazm();
        zzf = zzazmVar;
        zziep.m8338y(zzazm.class, zzazmVar);
    }

    private zzazm() {
    }

    /* JADX INFO: renamed from: D */
    public static zzazl m4670D() {
        return (zzazl) zzf.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m4671E(zzidl zzidlVar) {
        zzidlVar.getClass();
        zzifb zzifbVar = this.zzb;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzb = zzifbVar.mo8128l(size + size);
        }
        this.zzb.add(zzidlVar);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4672F(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4673G(int i2) {
        this.zzd = 4;
        this.zza |= 2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4674H(int i2) {
        this.zze = i2 - 1;
        this.zza |= 4;
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzazg.f7206a, "zze", zzazc.f7204a});
        }
        if (iOrdinal == 3) {
            return new zzazm();
        }
        if (iOrdinal == 4) {
            return new zzazl(zzf);
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
        synchronized (zzazm.class) {
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
