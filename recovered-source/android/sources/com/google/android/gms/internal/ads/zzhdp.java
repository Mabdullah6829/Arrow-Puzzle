package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdp extends zziep implements zziga {
    private static final zzhdp zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzhdm zzb;
    private zzihb zzc;
    private zzifb zzd = zzigk.f19864w;
    private zzifa zze = zzifn.f19826w;

    static {
        zzhdp zzhdpVar = new zzhdp();
        zzf = zzhdpVar;
        zziep.m8338y(zzhdp.class, zzhdpVar);
    }

    private zzhdp() {
    }

    /* JADX INFO: renamed from: D */
    public static zzhdo m7394D() {
        return (zzhdo) zzf.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7395E(zzhdm zzhdmVar) {
        this.zzb = zzhdmVar;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: F */
    public final void m7396F(ArrayDeque arrayDeque) {
        zzifa zzifaVar = this.zze;
        if (!zzifaVar.zza()) {
            int size = zzifaVar.size();
            this.zze = zzifaVar.mo8128l(size + size);
        }
        zzicu.m8096l(arrayDeque, this.zze);
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzihb.class, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhdp();
        }
        if (iOrdinal == 4) {
            return new zzhdo(zzf);
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
        synchronized (zzhdp.class) {
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
