package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayt extends zziep implements zziga {
    private static final zzayt zzbo;
    private static volatile zzigh zzbp;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private zzayv zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private zzifb zzaC;
    private int zzaD;
    private zzifb zzaE;
    private zzayo zzaF;
    private zzaym zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private zzayd zzaR;
    private zzayf zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private zzayq zzag;
    private zzifb zzah;
    private zzays zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzazk zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private zzayb zzbb;
    private boolean zzbc;
    private long zzbd;
    private String zzbe;
    private int zzbf;
    private boolean zzbg;
    private String zzbh;
    private long zzbi;
    private zzazi zzbj;
    private long zzbk;
    private String zzbl;
    private zziex zzbm;
    private long zzbn;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;

    static {
        zzayt zzaytVar = new zzayt();
        zzbo = zzaytVar;
        zziep.m8338y(zzayt.class, zzaytVar);
    }

    private zzayt() {
        zzigk zzigkVar = zzigk.f19864w;
        this.zzah = zzigkVar;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = 1000;
        this.zzaA = 1000;
        this.zzaB = "D";
        this.zzaC = zzigkVar;
        this.zzaD = 1000;
        this.zzaE = zzigkVar;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbe = "";
        this.zzbf = 2;
        this.zzbh = "";
        this.zzbk = -1L;
        this.zzbl = "";
        this.zzbm = zzieq.f19791w;
        this.zzbn = -1L;
    }

    /* JADX INFO: renamed from: E0 */
    public static zzayt m4560E0(byte[] bArr, zzidz zzidzVar) {
        return (zzayt) zziep.m8336t(zzbo, bArr, zzidzVar);
    }

    /* JADX INFO: renamed from: F0 */
    public static zzaxt m4561F0() {
        return (zzaxt) zzbo.m8346v();
    }

    /* JADX INFO: renamed from: G0 */
    public static zzayt m4562G0() {
        return zzbo;
    }

    /* JADX INFO: renamed from: A0 */
    public final long m4563A0() {
        return this.zzaj;
    }

    /* JADX INFO: renamed from: B0 */
    public final long m4564B0() {
        return this.zzan;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m4565C0() {
        return (this.zzd & 64) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m4566D(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    /* JADX INFO: renamed from: D0 */
    public final zzazi m4567D0() {
        zzazi zzaziVar = this.zzbj;
        return zzaziVar == null ? zzazi.m4665H() : zzaziVar;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4568E(long j2) {
        this.zza |= 33554432;
        this.zzH = j2;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4569F(long j2) {
        this.zza |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.zzI = j2;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4570G(long j2) {
        this.zza |= 134217728;
        this.zzJ = j2;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4571H(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m4572H0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4573I(long j2) {
        this.zza |= 536870912;
        this.zzL = j2;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m4574I0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4575J(long j2) {
        this.zza |= BasicMeasure.EXACTLY;
        this.zzM = j2;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m4576J0(long j2) {
        this.zza |= 4;
        this.zzg = j2;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4577K(long j2) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j2;
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m4578K0(long j2) {
        this.zza |= 16;
        this.zzi = j2;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4579L(long j2) {
        this.zzb |= 2;
        this.zzP = j2;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m4580L0(long j2) {
        this.zza |= 32;
        this.zzj = j2;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4581M(long j2) {
        this.zzb |= 4;
        this.zzQ = j2;
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m4582M0(long j2) {
        this.zza |= 1024;
        this.zzo = j2;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4583N(long j2) {
        this.zzb |= 8;
        this.zzR = j2;
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m4584N0(long j2) {
        this.zza |= 2048;
        this.zzp = j2;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4585O(long j2) {
        this.zzb |= 16;
        this.zzS = j2;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m4586O0(long j2) {
        this.zza |= 8192;
        this.zzv = j2;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4587P(long j2) {
        this.zzb |= 32;
        this.zzT = j2;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m4588P0(long j2) {
        this.zza |= 16384;
        this.zzw = j2;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m4589Q(long j2) {
        this.zzb |= 64;
        this.zzU = j2;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m4590Q0(long j2) {
        this.zza |= 32768;
        this.zzx = j2;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m4591R(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m4592R0(long j2) {
        this.zza |= 65536;
        this.zzy = j2;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4593S(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m4594S0(long j2) {
        this.zza |= 524288;
        this.zzB = j2;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4595T(long j2) {
        this.zzb |= 4096;
        this.zzaa = j2;
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m4596T0(long j2) {
        this.zza |= 1048576;
        this.zzC = j2;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m4597U(long j2) {
        this.zzb |= 8192;
        this.zzab = j2;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m4598U0(long j2) {
        this.zza |= 2097152;
        this.zzD = j2;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m4599V(long j2) {
        this.zzb |= 16384;
        this.zzac = j2;
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m4600V0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m4601W(zzayq zzayqVar) {
        this.zzag = zzayqVar;
        this.zzb |= 262144;
    }

    /* JADX INFO: renamed from: X */
    public final void m4602X(zzayq zzayqVar) {
        zzifb zzifbVar = this.zzah;
        if (!zzifbVar.zza()) {
            int size = zzifbVar.size();
            this.zzah = zzifbVar.mo8128l(size + size);
        }
        this.zzah.add(zzayqVar);
    }

    /* JADX INFO: renamed from: Y */
    public final void m4603Y() {
        this.zzah = zzigk.f19864w;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m4604Z(zzays zzaysVar) {
        this.zzai = zzaysVar;
        this.zzb |= 524288;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m4605a0(long j2) {
        this.zzb |= 1048576;
        this.zzaj = j2;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4606b0(long j2) {
        this.zzb |= 2097152;
        this.zzak = j2;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m4607c0(long j2) {
        this.zzb |= 4194304;
        this.zzal = j2;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m4608d0() {
        return (this.zza & 4194304) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m4609e0(long j2) {
        this.zzb |= 8388608;
        this.zzam = j2;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4610f0(long j2) {
        this.zzb |= 16777216;
        this.zzan = j2;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4611g0(long j2) {
        this.zzb |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        this.zzap = j2;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4612h0(long j2) {
        this.zzb |= 134217728;
        this.zzaq = j2;
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m4613i0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m4614j0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m4615k0(long j2) {
        this.zzc |= 2048;
        this.zzaI = j2;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m4616l0(long j2) {
        this.zzc |= 4096;
        this.zzaJ = j2;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m4617m0(long j2) {
        this.zzc |= 8192;
        this.zzaK = j2;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m4618n0(long j2) {
        this.zzc |= 16384;
        this.zzaL = j2;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m4619o0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m4620p0(long j2) {
        this.zzc |= 8388608;
        this.zzaU = j2;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m4621q0(long j2) {
        this.zzd |= 32;
        this.zzbi = j2;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m4622r0(zzazi zzaziVar) {
        zzaziVar.getClass();
        this.zzbj = zzaziVar;
        this.zzd |= 64;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m4623s0(int i2) {
        this.zzY = i2 - 1;
        this.zzb |= 1024;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m4624t0(int i2) {
        this.zzZ = i2 - 1;
        this.zzb |= 2048;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m4625u0(int i2) {
        this.zzaf = i2 - 1;
        this.zzb |= 131072;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m4626v0(int i2) {
        this.zzaz = i2 - 1;
        this.zzc |= 16;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m4627w0(int i2) {
        this.zzaA = i2 - 1;
        this.zzc |= 32;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m4628x0(int i2) {
        this.zzaV = i2 - 1;
        this.zzc |= 16777216;
    }

    /* JADX INFO: renamed from: y0 */
    public final String m4629y0() {
        return this.zzE;
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
            zziev zzievVar = zzaxx.f7199a;
            zziev zzievVar2 = zzazd.f7205a;
            return new zzigl(zzbo, "\u0001n\u0000\u0004\u0001Įn\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂiÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", zzievVar, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", zzayq.class, "zzT", "zzU", "zzV", "zzW", "zzY", zzievVar2, "zzZ", zzievVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", zzievVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", zzazc.f7204a, "zzau", zzazg.f7206a, "zzar", "zzaw", zzaxu.f7198a, "zzax", "zzay", "zzan", "zzao", "zzaz", zzievVar2, "zzX", "zzF", "zzaA", zzievVar2, "zzaB", "zzaC", zzayk.class, "zzaD", zzievVar2, "zzaE", zzaxw.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", zzayg.f7202a, "zzav", zzaxy.f7200a, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", zzayi.f7203a, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbj", "zzbk", "zzbl"});
        }
        if (iOrdinal == 3) {
            return new zzayt();
        }
        if (iOrdinal == 4) {
            return new zzaxt(zzbo);
        }
        if (iOrdinal == 5) {
            return zzbo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzbp;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzayt.class) {
            try {
                zziekVar = zzbp;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzbo);
                    zzbp = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m4630z0() {
        return (this.zzb & 1048576) != 0;
    }
}
