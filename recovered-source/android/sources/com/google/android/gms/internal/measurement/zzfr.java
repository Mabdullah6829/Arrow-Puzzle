package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfr extends zzadu implements zzafd {
    private static final zzfr zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzaef zzh = zzafm.f22097w;

    static {
        zzfr zzfrVar = new zzfr();
        zzi = zzfrVar;
        zzadu.m9561u(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    /* JADX INFO: renamed from: H */
    public static zzfr m9936H() {
        return zzi;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9937A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9938B() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final String m9939C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9940D() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9941E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: F */
    public final zzaef m9942F() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: G */
    public final int m9943G() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: I */
    public final int m9944I() {
        int i2;
        switch (this.zze) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", zzfp.f22490a, "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfr();
        }
        if (i3 == 4) {
            return new zzfo(zzi);
        }
        if (i3 == 5) {
            return zzi;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzj;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzfr.class) {
            try {
                zzadqVar = zzj;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzi);
                    zzj = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
