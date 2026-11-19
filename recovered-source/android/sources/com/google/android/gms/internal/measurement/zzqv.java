package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqv extends zzadu implements zzafd {
    private static final zzqv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private zzacr zzf = zzacr.f21972t;
    private String zzg = "";
    private zzaef zzi = zzafm.f22097w;

    static {
        zzqv zzqvVar = new zzqv();
        zzj = zzqvVar;
        zzadu.m9561u(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    /* JADX INFO: renamed from: G */
    public static zzqu m10594G() {
        return (zzqu) zzj.m9571q();
    }

    /* JADX INFO: renamed from: H */
    public static zzqv m10595H() {
        return zzj;
    }

    /* JADX INFO: renamed from: A */
    public final String m10596A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final zzacr m10597B() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: C */
    public final String m10598C() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final long m10599D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final zzaef m10600E() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: F */
    public final int m10601F() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10602I(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10603J(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10604K(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10605L(long j2) {
        this.zzb |= 8;
        this.zzh = j2;
    }

    /* JADX INFO: renamed from: M */
    public final void m10606M(zzqx zzqxVar) {
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzi.add(zzqxVar);
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
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzqx.class});
        }
        if (i3 == 3) {
            return new zzqv();
        }
        if (i3 == 4) {
            return new zzqu(zzj);
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
        synchronized (zzqv.class) {
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
