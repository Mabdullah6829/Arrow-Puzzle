package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhuj extends zziep implements zziga {
    private static final zzhuj zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzhul zzb;
    private int zzc;
    private zzidl zzd = zzidl.f19719t;

    static {
        zzhuj zzhujVar = new zzhuj();
        zze = zzhujVar;
        zziep.m8338y(zzhuj.class, zzhujVar);
    }

    private zzhuj() {
    }

    /* JADX INFO: renamed from: G */
    public static zzhuj m7904G(zzidl zzidlVar, zzidz zzidzVar) {
        return (zzhuj) zziep.m8335s(zze, zzidlVar, zzidzVar);
    }

    /* JADX INFO: renamed from: H */
    public static zzhui m7905H() {
        return (zzhui) zze.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final zzhul m7906D() {
        zzhul zzhulVar = this.zzb;
        return zzhulVar == null ? zzhul.m7913H() : zzhulVar;
    }

    /* JADX INFO: renamed from: E */
    public final int m7907E() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: F */
    public final zzidl m7908F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7909I(zzhul zzhulVar) {
        this.zzb = zzhulVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7910J(int i2) {
        this.zzc = i2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7911K(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zzd = zzidlVar;
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
            return new zzigl(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhuj();
        }
        if (iOrdinal == 4) {
            return new zzhui(zze);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhuj.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
