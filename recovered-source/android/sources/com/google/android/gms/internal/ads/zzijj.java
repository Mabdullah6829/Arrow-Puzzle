package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzijj extends zziep implements zziga {
    private static final zzijj zzh;
    private static volatile zzigh zzi;
    private int zza;
    private zziji zzb;
    private zzidl zzd;
    private zzidl zze;
    private int zzf;
    private byte zzg = 2;
    private zzifb zzc = zzigk.f19864w;

    static {
        zzijj zzijjVar = new zzijj();
        zzh = zzijjVar;
        zziep.m8338y(zzijj.class, zzijjVar);
    }

    private zzijj() {
        zzidl zzidlVar = zzidl.f19719t;
        this.zzd = zzidlVar;
        this.zze = zzidlVar;
    }

    /* JADX INFO: renamed from: D */
    public static zzijg m8505D() {
        return (zzijg) zzh.m8346v();
    }

    /* JADX INFO: renamed from: E */
    public final void m8506E(zzijf zzijfVar) {
        zzifb zzifbVar = this.zzc;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzc = zzifbVar.mo8128l(size + size);
        }
        this.zzc.add(zzijfVar);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        switch (zzieoVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = zziepVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new zzigl(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzijf.class, "zzd", "zze", "zzf"});
            case 3:
                return new zzijj();
            case 4:
                return new zzijg(zzh);
            case 5:
                return zzh;
            case 6:
                zzigh zzighVar = zzi;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzijj.class) {
                    try {
                        zziekVar = zzi;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzh);
                            zzi = zziekVar;
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
