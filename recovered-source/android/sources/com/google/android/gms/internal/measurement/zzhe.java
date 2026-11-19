package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhe extends zzadu implements zzafd {
    private static final zzhe zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhe zzheVar = new zzhe();
        zzl = zzheVar;
        zzadu.m9561u(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    /* JADX INFO: renamed from: H */
    public static zzhd m10059H() {
        return (zzhd) zzl.m9571q();
    }

    /* JADX INFO: renamed from: I */
    public static zzhe m10060I() {
        return zzl;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m10061A() {
        return this.zze;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10062B() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10063C() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10064D() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10065E() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10066F() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m10067G() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10068J(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10069K(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10070L(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10071M(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10072N(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10073O(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10074P(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
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
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzhe();
        }
        if (i3 == 4) {
            return new zzhd(zzl);
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
        synchronized (zzhe.class) {
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
