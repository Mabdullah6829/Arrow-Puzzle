package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzikd extends zziep implements zziga {
    private static final zzikd zzl;
    private static volatile zzigh zzm;
    private int zza;
    private int zzb;
    private zzijj zzd;
    private zzijn zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zziex zzg = zzieq.f19791w;
    private String zzh = "";
    private zzifb zzj = zzigk.f19864w;

    static {
        zzikd zzikdVar = new zzikd();
        zzl = zzikdVar;
        zziep.m8338y(zzikd.class, zzikdVar);
    }

    private zzikd() {
    }

    /* JADX INFO: renamed from: F */
    public static zzikc m8511F() {
        return (zzikc) zzl.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final String m8512D() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: E */
    public final int m8513E() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m8514G(int i2) {
        this.zza |= 1;
        this.zzb = i2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m8515H(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m8516I(zzijj zzijjVar) {
        this.zzd = zzijjVar;
        this.zza |= 4;
    }

    /* JADX INFO: renamed from: J */
    public final void m8517J(String str) {
        str.getClass();
        zzifb zzifbVar = this.zzj;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzj = zzifbVar.mo8128l(size + size);
        }
        this.zzj.add(str);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m8518K(int i2) {
        this.zzi = i2 - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        switch (zzieoVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = zziepVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new zzigl(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzika.f19948a, "zzj"});
            case 3:
                return new zzikd();
            case 4:
                return new zzikc(zzl);
            case 5:
                return zzl;
            case 6:
                zzigh zzighVar = zzm;
                if (zzighVar != null) {
                    return zzighVar;
                }
                synchronized (zzikd.class) {
                    try {
                        zziekVar = zzm;
                        if (zziekVar == null) {
                            zziekVar = new zziek(zzl);
                            zzm = zziekVar;
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
