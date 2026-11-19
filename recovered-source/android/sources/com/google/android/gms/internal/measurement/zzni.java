package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzni extends zzadu implements zzafd {
    private static final zzaec zzl = new zzng();
    private static final zzni zzq;
    private static volatile zzafj zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzaeb zzk;
    private zznm zzm;
    private boolean zzn;
    private boolean zzo;
    private zznf zzp;
    private zzacr zze = zzacr.f21972t;
    private String zzg = "";

    static {
        zzni zzniVar = new zzni();
        zzq = zzniVar;
        zzadu.m9561u(zzni.class, zzniVar);
    }

    private zzni() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzi = zzafmVar;
        this.zzj = zzafmVar;
        this.zzk = zzadv.f22033w;
    }

    /* JADX INFO: renamed from: N */
    public static zznh m10535N() {
        return (zznh) zzq.m9571q();
    }

    /* JADX INFO: renamed from: O */
    public static zzni m10536O() {
        return zzq;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10537A() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final zzacr m10538B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10539C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final String m10540D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: E */
    public final long m10541E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final zzaef m10542F() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: G */
    public final zzaef m10543G() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: H */
    public final List m10544H() {
        return new zzaed.zza(this.zzk, zzl);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m10545I() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final zznm m10546J() {
        zznm zznmVar = this.zzm;
        return zznmVar == null ? zznm.m10552C() : zznmVar;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10547K() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m10548L() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: M */
    public final zznf m10549M() {
        zznf zznfVar = this.zzp;
        return zznfVar == null ? zznf.m10533B() : zznfVar;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10550P(long j2) {
        this.zzb |= 8;
        this.zzh = j2;
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
            return new zzafn(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaby.f21943a, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i3 == 3) {
            return new zzni();
        }
        if (i3 == 4) {
            return new zznh(zzq);
        }
        if (i3 == 5) {
            return zzq;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzr;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzni.class) {
            try {
                zzadqVar = zzr;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzq);
                    zzr = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
