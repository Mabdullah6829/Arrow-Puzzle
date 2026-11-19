package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfl extends zzadu implements zzafd {
    private static final zzfl zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfl zzflVar = new zzfl();
        zzj = zzflVar;
        zzadu.m9561u(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    /* JADX INFO: renamed from: J */
    public static zzfl m9915J() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9916A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9917B() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m9918C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9919D() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final String m9920E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9921F() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final String m9922G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9923H() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final String m9924I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final int m9925K() {
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
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", zzfj.f22489a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzfl();
        }
        if (i3 == 4) {
            return new zzfi(zzj);
        }
        if (i3 == 5) {
            return zzj;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzk;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfl.class) {
            try {
                zzadqVar = zzk;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzj);
                    zzk = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
