package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzijf extends zziep implements zziga {
    private static final zzijf zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzidl zzb;
    private zzidl zzc;
    private byte zzd = 2;

    static {
        zzijf zzijfVar = new zzijf();
        zze = zzijfVar;
        zziep.m8338y(zzijf.class, zzijfVar);
    }

    private zzijf() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzb = zzidlVar;
        this.zzc = zzidlVar;
    }

    /* JADX INFO: renamed from: D */
    public static zzije m8502D() {
        return (zzije) zze.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m8503E(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 1;
        this.zzb = zzidlVar;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m8504F(zzidl zzidlVar) {
        zzidlVar.getClass();
        this.zza |= 2;
        this.zzc = zzidlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        switch (zzieoVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = zziepVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new zzigl(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new zzijf();
            case 4:
                return new zzije(zze);
            case 5:
                return zze;
            case 6:
                zzigh zzighVar = zzf;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijf.class) {
                    try {
                        zziekVar = zzf;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zze);
                            zzf = zziekVar;
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
