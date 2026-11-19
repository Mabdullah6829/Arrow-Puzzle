package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfh extends zzadu implements zzafd {
    private static final zzfh zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private zzfr zze;
    private zzfl zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzfh zzfhVar = new zzfh();
        zzi = zzfhVar;
        zzadu.m9561u(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    /* JADX INFO: renamed from: I */
    public static zzfh m9905I() {
        return zzi;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9906A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final zzfr m9907B() {
        zzfr zzfrVar = this.zze;
        return zzfrVar == null ? zzfr.m9936H() : zzfrVar;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m9908C() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final zzfl m9909D() {
        zzfl zzflVar = this.zzf;
        return zzflVar == null ? zzfl.m9915J() : zzflVar;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9910E() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9911F() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9912G() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final String m9913H() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m9914J(String str) {
        this.zzb |= 8;
        this.zzh = str;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzfh();
        }
        if (i3 == 4) {
            return new zzfg(zzi);
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
        synchronized (zzfh.class) {
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
