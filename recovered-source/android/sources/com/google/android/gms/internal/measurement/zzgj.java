package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgj extends zzadu implements zzafd {
    private static final zzgj zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgj zzgjVar = new zzgj();
        zzi = zzgjVar;
        zzadu.m9561u(zzgj.class, zzgjVar);
    }

    private zzgj() {
    }

    /* JADX INFO: renamed from: A */
    public final String m9968A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m9969B() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m9970C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9971D() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9972E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9973F() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m9974G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m9975H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzgj();
        }
        if (i3 == 4) {
            return new zzgi(zzi);
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
        synchronized (zzgj.class) {
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
