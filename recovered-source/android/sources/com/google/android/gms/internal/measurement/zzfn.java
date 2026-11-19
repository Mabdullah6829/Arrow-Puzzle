package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfn extends zzadu implements zzafd {
    private static final zzfn zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzfh zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzfn zzfnVar = new zzfn();
        zzk = zzfnVar;
        zzadu.m9561u(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    /* JADX INFO: renamed from: I */
    public static zzfm m9926I() {
        return (zzfm) zzk.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9927A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m9928B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final String m9929C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final zzfh m9930D() {
        zzfh zzfhVar = this.zzg;
        return zzfhVar == null ? zzfh.m9905I() : zzfhVar;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9931E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9932F() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9933G() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9934H() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m9935J(String str) {
        this.zzb |= 2;
        this.zzf = str;
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
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzfn();
        }
        if (i3 == 4) {
            return new zzfm(zzk);
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
        synchronized (zzfn.class) {
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
