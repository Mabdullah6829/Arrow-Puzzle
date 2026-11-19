package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzik extends zzadu implements zzafd {
    private static final zzik zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private zzaee zzf = zzaeq.f22059w;

    static {
        zzik zzikVar = new zzik();
        zzg = zzikVar;
        zzadu.m9561u(zzik.class, zzikVar);
    }

    private zzik() {
    }

    /* JADX INFO: renamed from: F */
    public static zzij m10400F() {
        return (zzij) zzg.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10401A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m10402B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final List m10403C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final int m10404D() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: E */
    public final long m10405E(int i2) {
        return this.zzf.mo9596A(i2);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10406G(int i2) {
        this.zzb |= 1;
        this.zze = i2;
    }

    /* JADX INFO: renamed from: H */
    public final void m10407H(List list) {
        zzaee zzaeeVar = this.zzf;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzf = zzaeeVar.mo9370p(size + size);
        }
        zzacb.m9343k(list, this.zzf);
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzik();
        }
        if (i3 == 4) {
            return new zzij(zzg);
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
        synchronized (zzik.class) {
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
