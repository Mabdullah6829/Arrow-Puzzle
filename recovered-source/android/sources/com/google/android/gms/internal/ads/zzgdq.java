package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdq extends zziep implements zziga {
    private static final zzgdq zzE;
    private static volatile zzigh zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private zzgei zzj;
    private boolean zzk;
    private zzgek zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        zzgdq zzgdqVar = new zzgdq();
        zzE = zzgdqVar;
        zziep.m8338y(zzgdq.class, zzgdqVar);
    }

    private zzgdq() {
    }

    /* JADX INFO: renamed from: n0 */
    public static zzgdo m6903n0() {
        return (zzgdo) zzE.m8346v();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m6904D(boolean z) {
        this.zza |= 16;
        this.zzf = z;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6905E(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6906F(zzgei zzgeiVar) {
        this.zzj = zzgeiVar;
        this.zza |= 256;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6907G(long j2) {
        this.zza |= 1024;
        this.zzl = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6908H(long j2) {
        this.zza |= 2048;
        this.zzm = j2;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m6909I(zzgek zzgekVar) {
        this.zzn = zzgekVar;
        this.zza |= 4096;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m6910J(long j2) {
        this.zza |= 524288;
        this.zzy = j2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m6911K(boolean z) {
        this.zza |= 1048576;
        this.zzz = z;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6912L(boolean z) {
        this.zza |= 16777216;
        this.zzD = z;
    }

    /* JADX INFO: renamed from: M */
    public final int m6913M() {
        int iM6942a = zzgds.m6942a(this.zzb);
        if (iM6942a == 0) {
            return 1;
        }
        return iM6942a;
    }

    /* JADX INFO: renamed from: N */
    public final int m6914N() {
        int iM6942a = zzgds.m6942a(this.zzc);
        if (iM6942a == 0) {
            return 2;
        }
        return iM6942a;
    }

    /* JADX INFO: renamed from: O */
    public final int m6915O() {
        int i2 = this.zzh;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 3;
            } else if (i2 != 2) {
                i3 = i2 != 3 ? 0 : 5;
            } else {
                i3 = 4;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m6916P(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }

    /* JADX INFO: renamed from: Q */
    public final void m6917Q() {
        this.zzh = 1;
        this.zza |= 64;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m6918R() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m6919S() {
        return this.zze;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m6920T() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: U */
    public final String m6921U() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m6922V() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: W */
    public final zzgei m6923W() {
        zzgei zzgeiVar = this.zzj;
        return zzgeiVar == null ? zzgei.m6948I() : zzgeiVar;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m6924X() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: Y */
    public final long m6925Y() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: Z */
    public final long m6926Z() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: a0 */
    public final zzgek m6927a0() {
        zzgek zzgekVar = this.zzn;
        return zzgekVar == null ? zzgek.m6955L() : zzgekVar;
    }

    /* JADX INFO: renamed from: b0 */
    public final long m6928b0() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: c0 */
    public final long m6929c0() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: d0 */
    public final long m6930d0() {
        return this.zzu;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m6931e0() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m6932f0() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: g0 */
    public final long m6933g0() {
        return this.zzx;
    }

    /* JADX INFO: renamed from: h0 */
    public final long m6934h0() {
        return this.zzy;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m6935i0() {
        return this.zzz;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m6936j0() {
        return this.zzA;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m6937k0() {
        return this.zzB;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m6938l0() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m6939m0() {
        return this.zzD;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m6940o0(boolean z) {
        this.zza |= 4;
        this.zzd = z;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m6941p0(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    /* JADX INFO: renamed from: z */
    public final Object mo4492z(zzieo zzieoVar, zziep zziepVar) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziev zzievVar = zzgdr.f17045a;
            return new zzigl(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", zzievVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", zzievVar, "zze", "zzf", "zzh", "zzD"});
        }
        if (iOrdinal == 3) {
            return new zzgdq();
        }
        if (iOrdinal == 4) {
            return new zzgdo(zzE);
        }
        if (iOrdinal == 5) {
            return zzE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzF;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgdq.class) {
            try {
                zziekVar = zzF;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzE);
                    zzF = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
