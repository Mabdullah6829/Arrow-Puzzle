package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmg extends zzadu implements zzafd {
    private static final zzmg zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = "";
    private zzacr zzf = zzacr.f21972t;
    private String zzg = "";
    private zzaef zzh;
    private zzaef zzi;
    private boolean zzj;
    private long zzk;

    static {
        zzmg zzmgVar = new zzmg();
        zzl = zzmgVar;
        zzadu.m9561u(zzmg.class, zzmgVar);
    }

    private zzmg() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
    }

    /* JADX INFO: renamed from: G */
    public static zzmf m10484G() {
        return (zzmf) zzl.m9571q();
    }

    /* JADX INFO: renamed from: A */
    public final String m10485A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10486B() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final zzacr m10487C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final String m10488D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: E */
    public final zzaef m10489E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: F */
    public final long m10490F() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10491H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10492I(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10493J(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: K */
    public final void m10494K(zzmi zzmiVar) {
        zzaef zzaefVar = this.zzh;
        if (!zzaefVar.zza()) {
            this.zzh = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzh.add(zzmiVar);
    }

    /* JADX INFO: renamed from: L */
    public final void m10495L(String str) {
        str.getClass();
        zzaef zzaefVar = this.zzi;
        if (!zzaefVar.zza()) {
            this.zzi = AbstractC1456a.m2441h(zzaefVar);
        }
        this.zzi.add(str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10496M(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10497N(long j2) {
        this.zzb |= 16;
        this.zzk = j2;
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
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", zzmi.class, "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzmg();
        }
        if (i3 == 4) {
            return new zzmf(zzl);
        }
        if (i3 == 5) {
            return zzl;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzm;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzmg.class) {
            try {
                zzadqVar = zzm;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzl);
                    zzm = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
