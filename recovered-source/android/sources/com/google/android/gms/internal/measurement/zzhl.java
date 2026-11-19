package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhl extends zzadu implements zzafd {
    private static final zzhl zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzhl zzhlVar = new zzhl();
        zzg = zzhlVar;
        zzadu.m9561u(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    /* JADX INFO: renamed from: A */
    public static zzhk m10090A() {
        return (zzhk) zzg.m9571q();
    }

    /* JADX INFO: renamed from: B */
    public final int m10091B() {
        int i2;
        int i3 = this.zze;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    i2 = 4;
                    if (i3 != 3) {
                        i2 = i3 != 4 ? 0 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 1;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public final int m10092C() {
        int i2;
        int i3 = this.zzf;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1) {
                i2 = i3 != 2 ? 0 : 3;
            }
        } else {
            i2 = 1;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m10093D(int i2) {
        this.zze = i2 - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10094E(int i2) {
        this.zzf = i2 - 1;
        this.zzb |= 2;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzhi.f22501a, "zzf", zzhm.f22502a});
        }
        if (i3 == 3) {
            return new zzhl();
        }
        if (i3 == 4) {
            return new zzhk(zzg);
        }
        if (i3 == 5) {
            return zzg;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzhl.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
