package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zziu extends zzadu implements zzafd {
    private static final zziu zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zziu zziuVar = new zziu();
        zzk = zziuVar;
        zzadu.m9561u(zziu.class, zziuVar);
    }

    private zziu() {
    }

    /* JADX INFO: renamed from: L */
    public static zzit m10418L() {
        return (zzit) zzk.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10419A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final long m10420B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final String m10421C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10422D() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final String m10423E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10424F() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final long m10425G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10426H() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final float m10427I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m10428J() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final double m10429K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10430M(long j2) {
        this.zzb |= 1;
        this.zze = j2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10431N(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10432O(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10433P() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10434Q(long j2) {
        this.zzb |= 8;
        this.zzh = j2;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m10435R() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10436S(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10437T() {
        this.zzb &= -33;
        this.zzj = 0.0d;
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
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zziu();
        }
        if (i3 == 4) {
            return new zzit(zzk);
        }
        if (i3 == 5) {
            return zzk;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzl;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zziu.class) {
            try {
                zzadqVar = zzl;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzk);
                    zzl = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
