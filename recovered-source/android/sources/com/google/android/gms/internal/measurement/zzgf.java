package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgf extends zzadu implements zzafd {
    private static final zzgf zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private zzaef zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private zzaef zzi;

    static {
        zzgf zzgfVar = new zzgf();
        zzj = zzgfVar;
        zzadu.m9561u(zzgf.class, zzgfVar);
    }

    private zzgf() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zze = zzafmVar;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
        this.zzi = zzafmVar;
    }

    /* JADX INFO: renamed from: G */
    public static zzgf m9959G() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final List m9960A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final List m9961B() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: C */
    public final List m9962C() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m9963D() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9964E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final zzaef m9965F() {
        return this.zzi;
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
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", zzfu.class, "zzf", zzfw.class, "zzg", zzgc.class, "zzh", "zzi", zzfu.class});
        }
        if (i3 == 3) {
            return new zzgf();
        }
        if (i3 == 4) {
            return new zzfs(zzj);
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
        synchronized (zzgf.class) {
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
