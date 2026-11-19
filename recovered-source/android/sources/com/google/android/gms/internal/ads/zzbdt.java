package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdt extends zziep implements zziga {
    private static final zzbdt zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzbee zzb;
    private zziex zzc = zzieq.f19791w;

    static {
        zzbdt zzbdtVar = new zzbdt();
        zzd = zzbdtVar;
        zziep.m8338y(zzbdt.class, zzbdtVar);
    }

    private zzbdt() {
    }

    /* JADX INFO: renamed from: F */
    public static zzbdt m4767F(byte[] bArr, zzidz zzidzVar) {
        zziep zziepVarM8331B = zziep.m8331B(zzd, bArr, bArr.length, zzidzVar);
        zziep.m8332C(zziepVarM8331B);
        return (zzbdt) zziepVarM8331B;
    }

    /* JADX INFO: renamed from: D */
    public final zzbee m4768D() {
        zzbee zzbeeVar = this.zzb;
        return zzbeeVar == null ? zzbee.m4783H() : zzbeeVar;
    }

    /* JADX INFO: renamed from: E */
    public final List m4769E() {
        return this.zzc;
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
            return new zzigl(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbdt();
        }
        if (iOrdinal == 4) {
            return new zzbds(zzd);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbdt.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
