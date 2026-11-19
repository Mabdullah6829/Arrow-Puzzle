package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzis extends zzadu implements zzafd {
    private static final zzis zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzis zzisVar = new zzis();
        zzh = zzisVar;
        zzadu.m9561u(zzis.class, zzisVar);
    }

    private zzis() {
    }

    /* JADX INFO: renamed from: B */
    public static zzil m10410B() {
        return (zzil) zzh.m9571q();
    }

    /* JADX INFO: renamed from: C */
    public static zzis m10411C() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final zzin m10412A() {
        zzin zzinVarM10409b = zzin.m10409b(this.zzf);
        return zzinVarM10409b == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarM10409b;
    }

    /* JADX INFO: renamed from: D */
    public final void m10413D(zzin zzinVar) {
        this.zzf = zzinVar.f22519s;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: E */
    public final int m10414E() {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r3
  0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: F */
    public final int m10415F() {
        int i2;
        int i3 = this.zzg;
        if (i3 != 0) {
            i2 = 2;
            if (i3 != 1) {
                int i4 = 3;
                if (i3 != 2) {
                    i2 = 4;
                    if (i3 != 3) {
                        i4 = 5;
                        if (i3 != 4) {
                            i2 = i3 != 5 ? 0 : 6;
                        } else {
                            i2 = i4;
                        }
                    }
                } else {
                    i2 = i4;
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

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10416G(int i2) {
        this.zze = i2 - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10417H(int i2) {
        this.zzg = i2 - 1;
        this.zzb |= 4;
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
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", zziq.f22521a, "zzf", zzim.f22505a, "zzg", zzio.f22520a});
        }
        if (i3 == 3) {
            return new zzis();
        }
        if (i3 == 4) {
            return new zzil(zzh);
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
        synchronized (zzis.class) {
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
