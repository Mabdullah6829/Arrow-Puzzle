package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzha extends zzadu implements zzafd {
    private static final zzha zzp;
    private static volatile zzafj zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private zzaew zzm;
    private zzaew zzn;
    private String zzo;

    static {
        zzha zzhaVar = new zzha();
        zzp = zzhaVar;
        zzadu.m9561u(zzha.class, zzhaVar);
    }

    private zzha() {
        zzaew zzaewVar = zzaew.f22069t;
        this.zzm = zzaewVar;
        this.zzn = zzaewVar;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    /* JADX INFO: renamed from: f0 */
    public static zzgx m10014f0() {
        return (zzgx) zzp.m9571q();
    }

    /* JADX INFO: renamed from: g0 */
    public static zzha m10015g0() {
        return zzp;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m10016A() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m10017B(long j2) {
        this.zzb |= 8;
        this.zzh = j2;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m10018C(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m10019D() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m10020E(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10021F() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10022G(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10023H() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m10024I(long j2) {
        this.zzb |= 128;
        this.zzl = j2;
    }

    /* JADX INFO: renamed from: J */
    public final zzaew m10025J() {
        zzaew zzaewVar = this.zzm;
        if (!zzaewVar.f22070s) {
            this.zzm = zzaewVar.m9605a();
        }
        return this.zzm;
    }

    /* JADX INFO: renamed from: K */
    public final zzaew m10026K() {
        zzaew zzaewVar = this.zzn;
        if (!zzaewVar.f22070s) {
            this.zzn = zzaewVar.m9605a();
        }
        return this.zzn;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m10027L(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10028M() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10029N() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final String m10030O() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m10031P() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final String m10032Q() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10033R() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: S */
    public final String m10034S() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m10035T() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final long m10036U() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m10037V() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final String m10038W() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m10039X() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: Y */
    public final String m10040Y() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m10041Z() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m10042a0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10043b0() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final long m10044c0() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m10045d0() {
        return (this.zzb & 256) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m10046e0() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m10047h0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m10048i0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10049j0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10050k0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m10051l0(String str) {
        this.zzb |= 4;
        this.zzg = str;
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
            return new zzafn(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgy.f22499a, "zzn", zzgz.f22500a, "zzo"});
        }
        if (i3 == 3) {
            return new zzha();
        }
        if (i3 == 4) {
            return new zzgx(zzp);
        }
        if (i3 == 5) {
            return zzp;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzq;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzha.class) {
            try {
                zzadqVar = zzq;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzp);
                    zzq = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }
}
