package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhtj extends zziep implements zziga {
    private static final zzhtj zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzhtb zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhtj zzhtjVar = new zzhtj();
        zzf = zzhtjVar;
        zziep.m8338y(zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
    }

    /* JADX INFO: renamed from: H */
    public static zzhti m7809H() {
        return (zzhti) zzf.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7810D() {
        return (this.zza & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final zzhtb m7811E() {
        zzhtb zzhtbVar = this.zzb;
        return zzhtbVar == null ? zzhtb.m7789H() : zzhtbVar;
    }

    /* JADX INFO: renamed from: F */
    public final int m7812F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzhtx m7813G() {
        zzhtx zzhtxVarM7860b = zzhtx.m7860b(this.zze);
        return zzhtxVarM7860b == null ? zzhtx.UNRECOGNIZED : zzhtxVarM7860b;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7814I(zzhtb zzhtbVar) {
        this.zzb = zzhtbVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m7815J(int i2) {
        this.zzd = i2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7816K(zzhtx zzhtxVar) {
        this.zze = zzhtxVar.zza();
    }

    /* JADX INFO: renamed from: L */
    public final int m7817L() {
        int i2 = this.zzc;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 3;
            } else if (i2 != 2) {
                i3 = i2 != 3 ? 0 : 5;
            } else {
                i3 = 4;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: M */
    public final void m7818M(int i2) {
        if (i2 != 1) {
            this.zzc = i2 - 2;
        } else {
            zzifc.m8355a();
            throw null;
        }
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
            return new zzigl(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhtj();
        }
        if (iOrdinal == 4) {
            return new zzhti(zzf);
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
        synchronized (zzhtj.class) {
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
