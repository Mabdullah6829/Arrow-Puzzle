package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzii extends zzadu implements zzafd {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb;
    private zzaee zze;
    private zzaef zzf;
    private zzaef zzg;

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.m9561u(zzii.class, zziiVar);
    }

    private zzii() {
        zzaeq zzaeqVar = zzaeq.f22059w;
        this.zzb = zzaeqVar;
        this.zze = zzaeqVar;
        zzafm zzafmVar = zzafm.f22097w;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    /* JADX INFO: renamed from: I */
    public static zzih m10382I() {
        return (zzih) zzh.m9571q();
    }

    /* JADX INFO: renamed from: J */
    public static zzii m10383J() {
        return zzh;
    }

    /* JADX INFO: renamed from: A */
    public final List m10384A() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: B */
    public final int m10385B() {
        return this.zzb.size();
    }

    /* JADX INFO: renamed from: C */
    public final List m10386C() {
        return this.zze;
    }

    /* JADX INFO: renamed from: D */
    public final int m10387D() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: E */
    public final zzaef m10388E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: F */
    public final int m10389F() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: G */
    public final zzaef m10390G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: H */
    public final int m10391H() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: K */
    public final void m10392K(Iterable iterable) {
        zzaee zzaeeVar = this.zzb;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zzb = zzaeeVar.mo9370p(size + size);
        }
        zzacb.m9343k(iterable, this.zzb);
    }

    /* JADX INFO: renamed from: L */
    public final void m10393L() {
        this.zzb = zzaeq.f22059w;
    }

    /* JADX INFO: renamed from: M */
    public final void m10394M(Iterable iterable) {
        zzaee zzaeeVar = this.zze;
        if (!zzaeeVar.zza()) {
            int size = zzaeeVar.size();
            this.zze = zzaeeVar.mo9370p(size + size);
        }
        zzacb.m9343k(iterable, this.zze);
    }

    /* JADX INFO: renamed from: N */
    public final void m10395N() {
        this.zze = zzaeq.f22059w;
    }

    /* JADX INFO: renamed from: O */
    public final void m10396O(ArrayList arrayList) {
        zzaef zzaefVar = this.zzf;
        if (!zzaefVar.zza()) {
            this.zzf = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(arrayList, this.zzf);
    }

    /* JADX INFO: renamed from: P */
    public final void m10397P() {
        this.zzf = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: Q */
    public final void m10398Q(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: R */
    public final void m10399R() {
        this.zzg = zzafm.f22097w;
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
            return new zzafn(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i3 == 3) {
            return new zzii();
        }
        if (i3 == 4) {
            return new zzih(zzh);
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
        synchronized (zzii.class) {
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
