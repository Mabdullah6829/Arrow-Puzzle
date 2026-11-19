package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhq extends zzadu implements zzafd {
    private static final zzhq zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        zzhq zzhqVar = new zzhq();
        zzg = zzhqVar;
        zzadu.m9561u(zzhq.class, zzhqVar);
    }

    private zzhq() {
    }

    /* JADX INFO: renamed from: E */
    public static zzhp m10099E() {
        return (zzhp) zzg.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10100A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m10101B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10102C() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final long m10103D() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10104F(int i2) {
        this.zzb |= 1;
        this.zze = i2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10105G(long j2) {
        this.zzb |= 2;
        this.zzf = j2;
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhq();
        }
        if (i3 == 4) {
            return new zzhp(zzg);
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
        synchronized (zzhq.class) {
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
