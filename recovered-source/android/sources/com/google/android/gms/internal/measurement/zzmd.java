package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmd extends zzadu implements zzafd {
    private static final zzmd zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzmd zzmdVar = new zzmd();
        zzg = zzmdVar;
        zzadu.m9561u(zzmd.class, zzmdVar);
    }

    private zzmd() {
    }

    /* JADX INFO: renamed from: A */
    public static zzmc m10475A() {
        return (zzmc) zzg.m9571q();
    }

    /* JADX INFO: renamed from: B */
    public static zzmd m10476B() {
        return zzg;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10477C(int i2) {
        this.zze = i2 - 2;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m10478D(int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzf = i2 - 2;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzmd();
        }
        if (i3 == 4) {
            return new zzmc(zzg);
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
        synchronized (zzmd.class) {
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
