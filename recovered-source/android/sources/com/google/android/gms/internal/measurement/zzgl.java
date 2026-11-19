package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl extends zzadu implements zzafd {
    private static final zzgl zzw;
    private static volatile zzafj zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private String zzk;
    private boolean zzl;
    private zzaef zzm;
    private zzaef zzn;
    private String zzo;
    private String zzp;
    private zzgf zzq;
    private zzgp zzr;
    private zzgv zzs;
    private zzgr zzt;
    private zzgn zzu;
    private zzaeb zzv;

    static {
        zzgl zzglVar = new zzgl();
        zzw = zzglVar;
        zzadu.m9561u(zzgl.class, zzglVar);
    }

    private zzgl() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzafmVar;
        this.zzk = "";
        this.zzm = zzafmVar;
        this.zzn = zzafmVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = zzadv.f22033w;
    }

    /* JADX INFO: renamed from: R */
    public static zzgk m9976R() {
        return (zzgk) zzw.m9571q();
    }

    /* JADX INFO: renamed from: S */
    public static zzgl m9977S() {
        return zzw;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m9978A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final long m9979B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m9980C() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m9981D() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: E */
    public final zzaef m9982E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final int m9983F() {
        return this.zzi.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final zzgj m9984G(int i2) {
        return (zzgj) this.zzi.get(i2);
    }

    /* JADX INFO: renamed from: H */
    public final List m9985H() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: I */
    public final zzaef m9986I() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: J */
    public final int m9987J() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: K */
    public final zzaef m9988K() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: L */
    public final String m9989L() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9990M() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final zzgf m9991N() {
        zzgf zzgfVar = this.zzq;
        return zzgfVar == null ? zzgf.m9959G() : zzgfVar;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m9992O() {
        return (this.zzb & 512) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final zzgv m9993P() {
        zzgv zzgvVar = this.zzs;
        return zzgvVar == null ? zzgv.m10000C() : zzgvVar;
    }

    /* JADX INFO: renamed from: Q */
    public final zzaeb m9994Q() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: T */
    public final void m9995T(int i2, zzgj zzgjVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzi.set(i2, zzgjVar);
    }

    /* JADX INFO: renamed from: U */
    public final void m9996U() {
        this.zzj = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: V */
    public final void m9997V() {
        this.zzm = zzafm.f22097w;
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
            return new zzafn(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzgt.class, "zzi", zzgj.class, "zzj", zzfd.class, "zzk", "zzl", "zzm", zzja.class, "zzn", zzgh.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i3 == 3) {
            return new zzgl();
        }
        if (i3 == 4) {
            return new zzgk(zzw);
        }
        if (i3 == 5) {
            return zzw;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzx;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzgl.class) {
            try {
                zzadqVar = zzx;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzw);
                    zzx = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
