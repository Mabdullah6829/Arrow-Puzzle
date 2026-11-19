package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw extends zzadu implements zzafd {
    private static final zzfw zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzfw zzfwVar = new zzfw();
        zzg = zzfwVar;
        zzadu.m9561u(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    /* JADX INFO: renamed from: A */
    public final int m9948A() {
        int iM9957a = zzga.m9957a(this.zze);
        if (iM9957a == 0) {
            return 1;
        }
        return iM9957a;
    }

    /* JADX INFO: renamed from: B */
    public final int m9949B() {
        int iM9957a = zzga.m9957a(this.zzf);
        if (iM9957a == 0) {
            return 1;
        }
        return iM9957a;
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
            zzadz zzadzVar = zzfz.f22492a;
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzadzVar, "zzf", zzadzVar});
        }
        if (i3 == 3) {
            return new zzfw();
        }
        if (i3 == 4) {
            return new zzfv(zzg);
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
        synchronized (zzfw.class) {
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
