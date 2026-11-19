package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqx extends zzadu implements zzafd {
    private static final zzqx zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzh = zzqxVar;
        zzadu.m9561u(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    /* JADX INFO: renamed from: G */
    public static zzqw m10607G() {
        return (zzqw) zzh.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final String m10608A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final long m10609B() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10610C() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final double m10611D() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: E */
    public final String m10612E() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    /* JADX INFO: renamed from: F */
    public final zzacr m10613F() {
        return this.zze == 6 ? (zzacr) this.zzf : zzacr.f21972t;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10614H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10615I(long j2) {
        this.zze = 2;
        this.zzf = Long.valueOf(j2);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10616J(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10617K(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10618L(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10619M(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zze = 6;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: N */
    public final int m10620N() {
        int i2 = this.zze;
        if (i2 == 0) {
            return 6;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 != 5) {
            return i2 != 6 ? 0 : 5;
        }
        return 4;
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
            return new zzafn(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i3 == 3) {
            return new zzqx();
        }
        if (i3 == 4) {
            return new zzqw(zzh);
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
        synchronized (zzqx.class) {
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
