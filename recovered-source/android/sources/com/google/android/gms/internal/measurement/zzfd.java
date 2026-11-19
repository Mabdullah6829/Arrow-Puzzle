package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfd extends zzadu implements zzafd {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.m9561u(zzfd.class, zzfdVar);
    }

    private zzfd() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9880A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m9881B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final List m9882C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final int m9883D() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final zzfn m9884E(int i2) {
        return (zzfn) this.zzf.get(i2);
    }

    /* JADX INFO: renamed from: F */
    public final zzaef m9885F() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final int m9886G() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final zzff m9887H(int i2) {
        return (zzff) this.zzg.get(i2);
    }

    /* JADX INFO: renamed from: I */
    public final void m9888I(int i2, zzfn zzfnVar) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzf.set(i2, zzfnVar);
    }

    /* JADX INFO: renamed from: J */
    public final void m9889J(int i2, zzff zzffVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzg.set(i2, zzffVar);
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
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzfd();
        }
        if (i3 == 4) {
            return new zzfc(zzj);
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
        synchronized (zzfd.class) {
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
