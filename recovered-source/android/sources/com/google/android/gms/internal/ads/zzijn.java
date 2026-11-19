package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzijn extends zziep implements zziga {
    private static final zzijn zzi;
    private static volatile zzigh zzj;
    private int zza;
    private zzijm zzb;
    private zzidl zzd;
    private zzidl zze;
    private int zzf;
    private zzidl zzg;
    private byte zzh = 2;
    private zzifb zzc = zzigk.f19864w;

    static {
        zzijn zzijnVar = new zzijn();
        zzi = zzijnVar;
        zziep.m8338y(zzijn.class, zzijnVar);
    }

    private zzijn() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
        this.zzg = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        switch (zzieoVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = zziepVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new zzigl(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzijf.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzijn();
            case 4:
                return new zzijk(zzi);
            case 5:
                return zzi;
            case 6:
                zzigh zzighVar = zzj;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijn.class) {
                    try {
                        zziekVar = zzj;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzi);
                            zzj = zziekVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zziekVar;
            default:
                throw null;
        }
    }
}
