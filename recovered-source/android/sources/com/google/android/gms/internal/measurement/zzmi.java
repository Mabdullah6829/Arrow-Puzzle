package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmi extends zzadu implements zzafd {
    private static final zzmi zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzmi zzmiVar = new zzmi();
        zzh = zzmiVar;
        zzadu.m9561u(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    /* JADX INFO: renamed from: G */
    public static zzmh m10499G() {
        return (zzmh) zzh.m9571q();
    }

    /* JADX INFO: renamed from: H */
    public static zzmi m10500H() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final String m10501A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final long m10502B() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10503C() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final double m10504D() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: E */
    public final String m10505E() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: F */
    public final zzacr m10506F() {
        return this.zze == 5 ? (zzacr) this.zzf : zzacr.f21972t;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10507I(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10508J(long j2) {
        this.zze = 1;
        this.zzf = Long.valueOf(j2);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10509K(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10510L(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10511M(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10512N(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 5;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: O */
    public final int m10513O() {
        int i2 = this.zze;
        if (i2 == 0) {
            return 6;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        i3 = 5;
                        if (i2 != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i3 == 3) {
            return new zzmi();
        }
        if (i3 == 4) {
            return new zzmh(zzh);
        }
        if (i3 == 5) {
            return zzh;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzi;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmi.class) {
            try {
                zzadqVar = zzi;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzh);
                    zzi = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
