package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbe extends zziep implements zziga {
    private static final zzgbe zzn;
    private static volatile zzigh zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private zzifa zzk;
    private zzifa zzl;
    private zzifa zzm;

    static {
        zzgbe zzgbeVar = new zzgbe();
        zzn = zzgbeVar;
        zziep.m8338y(zzgbe.class, zzgbeVar);
    }

    private zzgbe() {
        zzifn zzifnVar = zzifn.f19826w;
        this.zzk = zzifnVar;
        this.zzl = zzifnVar;
        this.zzm = zzifnVar;
    }

    /* JADX INFO: renamed from: U */
    public static zzgbe m6836U() {
        return zzn;
    }

    /* JADX INFO: renamed from: D */
    public final void m6837D(long j2) {
        zzifa zzifaVar = this.zzl;
        if (!zzifaVar.zza()) {
            int size = zzifaVar.size();
            this.zzl = zzifaVar.mo8128l(size + size);
        }
        this.zzl.mo8353f(j2);
    }

    /* JADX INFO: renamed from: E */
    public final void m6838E(long j2) {
        zzifa zzifaVar = this.zzm;
        if (!zzifaVar.zza()) {
            int size = zzifaVar.size();
            this.zzm = zzifaVar.mo8128l(size + size);
        }
        this.zzm.mo8353f(j2);
    }

    /* JADX INFO: renamed from: F */
    public final void m6839F() {
        this.zzm = zzifn.f19826w;
    }

    /* JADX INFO: renamed from: G */
    public final String m6840G() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: H */
    public final long m6841H() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: I */
    public final int m6842I() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m6843J() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m6844K() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: L */
    public final long m6845L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final long m6846M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final long m6847N() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m6848O() {
        return (this.zza & 64) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final zzifa m6849P() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: Q */
    public final int m6850Q() {
        return this.zzk.size();
    }

    /* JADX INFO: renamed from: R */
    public final int m6851R() {
        return this.zzl.size();
    }

    /* JADX INFO: renamed from: S */
    public final zzifa m6852S() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: T */
    public final int m6853T() {
        return this.zzm.size();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m6854V(String str) {
        str.getClass();
        this.zzb = str;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6855W(long j2) {
        this.zza |= 1;
        this.zzc = j2;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m6856X(int i2) {
        this.zza |= 2;
        this.zzd = i2;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m6857Y() {
        this.zza |= 4;
        this.zze = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m6858Z(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m6859a0(long j2) {
        this.zza |= 16;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m6860b0(long j2) {
        this.zzh = j2;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m6861c0(long j2) {
        this.zza |= 32;
        this.zzi = j2;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m6862d0(long j2) {
        this.zza |= 64;
        this.zzj = j2;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6863e0(long j2) {
        zzifa zzifaVar = this.zzk;
        if (!zzifaVar.zza()) {
            int size = zzifaVar.size();
            this.zzk = zzifaVar.mo8128l(size + size);
        }
        this.zzk.mo8353f(j2);
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
            return new zzigl(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzgbe();
        }
        if (iOrdinal == 4) {
            return new zzgbd(zzn);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzo;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzgbe.class) {
            try {
                zziekVar = zzo;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzn);
                    zzo = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
