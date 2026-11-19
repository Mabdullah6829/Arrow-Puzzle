package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyj extends zziep implements zziga {
    private static final zzfyj zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zziex zzb = zzieq.f19791w;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfyj zzfyjVar = new zzfyj();
        zzf = zzfyjVar;
        zziep.m8338y(zzfyj.class, zzfyjVar);
    }

    private zzfyj() {
    }

    /* JADX INFO: renamed from: D */
    public static zzfyi m6779D() {
        return (zzfyi) zzf.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6780E(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m6781F(int i2) {
        zziex zziexVar = this.zzb;
        if (!zziexVar.zza()) {
            int size = zziexVar.size();
            this.zzb = zziexVar.mo8128l(size + size);
        }
        this.zzb.mo8348I(2);
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
            return new zzigl(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfyh.f16808a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfyj();
        }
        if (iOrdinal == 4) {
            return new zzfyi(zzf);
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
        synchronized (zzfyj.class) {
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
