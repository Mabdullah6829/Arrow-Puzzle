package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu extends zzadu implements zzafd {
    private static final zzfu zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zzh = zzfuVar;
        zzadu.m9561u(zzfu.class, zzfuVar);
    }

    private zzfu() {
    }

    /* JADX INFO: renamed from: A */
    public final int m9945A() {
        int iM9957a = zzga.m9957a(this.zze);
        if (iM9957a == 0) {
            return 1;
        }
        return iM9957a;
    }

    /* JADX INFO: renamed from: B */
    public final int m9946B() {
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

    /* JADX INFO: renamed from: C */
    public final int m9947C() {
        int i2;
        int i3 = this.zzg;
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

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zzfz.f22492a, "zzf", zzfx.f22491a, "zzg", zzgd.f22497a});
        }
        if (i3 == 3) {
            return new zzfu();
        }
        if (i3 == 4) {
            return new zzft(zzh);
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
        synchronized (zzfu.class) {
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
