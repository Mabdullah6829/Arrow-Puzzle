package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzje extends zzadu implements zzafd {
    private static final zzje zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private zzaef zzf = zzafm.f22097w;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        zzje zzjeVar = new zzje();
        zzk = zzjeVar;
        zzadu.m9561u(zzje.class, zzjeVar);
    }

    private zzje() {
    }

    /* JADX INFO: renamed from: A */
    public final List m10445A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final String m10446B() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10447C() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m10448D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10449E() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10450F() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10451G() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final double m10452H() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: I */
    public final int m10453I() {
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

    @Override // com.google.android.gms.internal.measurement.zzadu
    /* JADX INFO: renamed from: z */
    public final Object mo9574z(int i2) {
        zzafj zzadqVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", zzjc.f22523a, "zzf", zzje.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzje();
        }
        if (i3 == 4) {
            return new zzjb(zzk);
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
        synchronized (zzje.class) {
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
