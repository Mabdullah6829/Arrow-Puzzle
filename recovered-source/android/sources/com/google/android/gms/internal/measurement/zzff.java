package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff extends zzadu implements zzafd {
    private static final zzff zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzaef zzg = zzafm.f22097w;
    private boolean zzh;
    private zzfl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzff zzffVar = new zzff();
        zzm = zzffVar;
        zzadu.m9561u(zzff.class, zzffVar);
    }

    private zzff() {
    }

    /* JADX INFO: renamed from: M */
    public static zzfe m9890M() {
        return (zzfe) zzm.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9891A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final int m9892B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final String m9893C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final List m9894D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: E */
    public final int m9895E() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final zzfh m9896F(int i2) {
        return (zzfh) this.zzg.get(i2);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9897G() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final zzfl m9898H() {
        zzfl zzflVar = this.zzi;
        return zzflVar == null ? zzfl.m9915J() : zzflVar;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9899I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9900J() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9901K() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m9902L() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m9903N(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: O */
    public final void m9904O(int i2, zzfh zzfhVar) {
        zzaef zzaefVar = this.zzg;
        if (!zzaefVar.zza()) {
            this.zzg = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzg.set(i2, zzfhVar);
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
            return new zzafn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzfh.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new zzff();
        }
        if (i3 == 4) {
            return new zzfe(zzm);
        }
        if (i3 == 5) {
            return zzm;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzn;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzff.class) {
            try {
                zzadqVar = zzn;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzm);
                    zzn = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
