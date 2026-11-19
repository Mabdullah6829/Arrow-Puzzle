package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggb extends zziep implements zziga {
    private static final zzggb zzf;
    private static volatile zzigh zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private zziex zze = zzieq.f19791w;

    static {
        zzggb zzggbVar = new zzggb();
        zzf = zzggbVar;
        zziep.m8338y(zzggb.class, zzggbVar);
    }

    private zzggb() {
    }

    /* JADX INFO: renamed from: H */
    public static zzggb m6986H(zzidl zzidlVar) {
        zzggb zzggbVar = zzf;
        zzidz zzidzVar = zzidz.f19758b;
        int i2 = zzicy.f19697a;
        zziep zziepVarM8335s = zziep.m8335s(zzggbVar, zzidlVar, zzidz.f19759c);
        zziep.m8332C(zziepVarM8335s);
        return (zzggb) zziepVarM8335s;
    }

    /* JADX INFO: renamed from: I */
    public static zzgga m6987I() {
        return (zzgga) zzf.m8346v();
    }

    /* JADX INFO: renamed from: J */
    public static zzggb m6988J() {
        return zzf;
    }

    /* JADX INFO: renamed from: D */
    public final zzbei m6989D() {
        return this.zzb == 1 ? (zzbei) this.zzc : zzbei.m4795L();
    }

    /* JADX INFO: renamed from: E */
    public final zzbeg m6990E() {
        return this.zzb == 2 ? (zzbeg) this.zzc : zzbeg.m4788G();
    }

    /* JADX INFO: renamed from: F */
    public final zzbdz m6991F() {
        zzbdz zzbdzVarM4775b = zzbdz.m4775b(this.zzd);
        return zzbdzVarM4775b == null ? zzbdz.UNSUPPORTED : zzbdzVarM4775b;
    }

    /* JADX INFO: renamed from: G */
    public final List m6992G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m6993K(zzbei zzbeiVar) {
        zzbeiVar.getClass();
        this.zzc = zzbeiVar;
        this.zzb = 1;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6994L(zzbeg zzbegVar) {
        zzbegVar.getClass();
        this.zzc = zzbegVar;
        this.zzb = 2;
    }

    /* JADX INFO: renamed from: M */
    public final void m6995M(zzbdz zzbdzVar) {
        this.zzd = zzbdzVar.f7672s;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: N */
    public final void m6996N(zziex zziexVar) {
        zziex zziexVar2 = this.zze;
        if (!zziexVar2.zza()) {
            int size = zziexVar2.size();
            this.zze = zziexVar2.mo8128l(size + size);
        }
        zzicu.m8096l(zziexVar, this.zze);
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
            return new zzigl(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", zzbei.class, zzbeg.class, "zzd", zzbdy.f7663a, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzggb();
        }
        if (iOrdinal == 4) {
            return new zzgga(zzf);
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
        synchronized (zzggb.class) {
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
