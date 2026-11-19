package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhg extends zzadu implements zzafd {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.m9561u(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    /* JADX INFO: renamed from: H */
    public static zzhf m10075H() {
        return (zzhf) zzi.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10076A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m10077B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final zzii m10078C() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.m10383J() : zziiVar;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10079D() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final zzii m10080E() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.m10383J() : zziiVar;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10081F() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10082G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10083I(int i2) {
        this.zzb |= 1;
        this.zze = i2;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10084J(zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10085K(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10086L(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzhg();
        }
        if (i3 == 4) {
            return new zzhf(zzi);
        }
        if (i3 == 5) {
            return zzi;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhg.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
