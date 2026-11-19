package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzid extends zzadu implements zzafd {
    private static final zzid zzaw;
    private static volatile zzafj zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private zzaef zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private zzig zzR;
    private zzaeb zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private zzhy zzab;
    private String zzac;
    private zzaef zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private zzhe zzam;
    private int zzan;
    private zzha zzao;
    private String zzap;
    private zzis zzaq;
    private long zzar;
    private String zzas;
    private zzho zzat;
    private String zzau;
    private zzaef zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private zzaef zzg;
    private zzaef zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        zzid zzidVar = new zzid();
        zzaw = zzidVar;
        zzadu.m9561u(zzid.class, zzidVar);
    }

    private zzid() {
        zzafm zzafmVar = zzafm.f22097w;
        this.zzg = zzafmVar;
        this.zzh = zzafmVar;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = zzafmVar;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = zzadv.f22033w;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = zzafmVar;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = zzafmVar;
    }

    /* JADX INFO: renamed from: f0 */
    public static zzic m10218f0() {
        return (zzic) zzaw.m9571q();
    }

    /* JADX INFO: renamed from: g0 */
    public static zzic m10219g0(zzid zzidVar) {
        zzadp zzadpVarM9571q = zzaw.m9571q();
        zzadpVarM9571q.m9556s(zzidVar);
        return (zzic) zzadpVarM9571q;
    }

    /* JADX INFO: renamed from: A */
    public final String m10220A() {
        return this.zzt;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m10221A0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m10222A1(zzho zzhoVar) {
        this.zzat = zzhoVar;
        this.zze |= 536870912;
    }

    /* JADX INFO: renamed from: A2 */
    public final int m10223A2() {
        return this.zzr;
    }

    /* JADX INFO: renamed from: B */
    public final String m10224B() {
        return this.zzu;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m10225B0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m10226B1(String str) {
        str.getClass();
        this.zze |= BasicMeasure.EXACTLY;
        this.zzau = str;
    }

    /* JADX INFO: renamed from: B2 */
    public final String m10227B2() {
        return this.zzs;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10228C() {
        return (this.zzb & 16384) != 0;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m10229C0() {
        return this.zzP;
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m10230C1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    /* JADX INFO: renamed from: D */
    public final long m10231D() {
        return this.zzv;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m10232D0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m10233D1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m10234E() {
        return (this.zzb & 32768) != 0;
    }

    /* JADX INFO: renamed from: E0 */
    public final long m10235E0() {
        return this.zzT;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m10236E1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    /* JADX INFO: renamed from: F */
    public final long m10237F() {
        return this.zzw;
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m10238F0() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m10239F1(int i2) {
        this.zzb |= 1024;
        this.zzr = i2;
    }

    /* JADX INFO: renamed from: G */
    public final String m10240G() {
        return this.zzx;
    }

    /* JADX INFO: renamed from: G0 */
    public final String m10241G0() {
        return this.zzW;
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m10242G1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10243H() {
        return (this.zzb & 131072) != 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m10244H0() {
        return (this.zze & 8192) != 0;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m10245H1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzt = str;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m10246I() {
        return this.zzy;
    }

    /* JADX INFO: renamed from: I0 */
    public final String m10247I0() {
        return this.zzac;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m10248I1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    /* JADX INFO: renamed from: J */
    public final String m10249J() {
        return this.zzz;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m10250J0() {
        return (this.zze & 32768) != 0;
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m10251J1(long j2) {
        this.zzb |= 16384;
        this.zzv = j2;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10252K() {
        return (this.zzb & 524288) != 0;
    }

    /* JADX INFO: renamed from: K0 */
    public final long m10253K0() {
        return this.zzaf;
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m10254K1() {
        this.zzb |= 32768;
        this.zzw = 161000L;
    }

    /* JADX INFO: renamed from: L */
    public final long m10255L() {
        return this.zzA;
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m10256L0() {
        return this.zzag;
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m10257L1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m10258M() {
        return (this.zzb & 1048576) != 0;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m10259M0() {
        return (this.zze & 131072) != 0;
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m10260M1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    /* JADX INFO: renamed from: N */
    public final int m10261N() {
        return this.zzB;
    }

    /* JADX INFO: renamed from: N0 */
    public final String m10262N0() {
        return this.zzah;
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m10263N1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    /* JADX INFO: renamed from: O */
    public final String m10264O() {
        return this.zzC;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m10265O0() {
        return (this.zze & 262144) != 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m10266O1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    /* JADX INFO: renamed from: P */
    public final String m10267P() {
        return this.zzD;
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m10268P0() {
        return this.zzai;
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m10269P1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzz = str;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10270Q() {
        return (this.zzb & 8388608) != 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m10271Q0() {
        return (this.zze & 524288) != 0;
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m10272Q1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10273R() {
        return this.zzE;
    }

    /* JADX INFO: renamed from: R0 */
    public final String m10274R0() {
        return this.zzaj;
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m10275R1(long j2) {
        this.zzb |= 524288;
        this.zzA = j2;
    }

    /* JADX INFO: renamed from: S */
    public final zzaef m10276S() {
        return this.zzF;
    }

    /* JADX INFO: renamed from: S0 */
    public final int m10277S0() {
        return this.zzak;
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m10278S1(int i2) {
        this.zzb |= 1048576;
        this.zzB = i2;
    }

    /* JADX INFO: renamed from: T */
    public final String m10279T() {
        return this.zzG;
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m10280T0() {
        return (this.zze & 4194304) != 0;
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m10281T1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m10282U() {
        return (this.zzb & 33554432) != 0;
    }

    /* JADX INFO: renamed from: U0 */
    public final zzhe m10283U0() {
        zzhe zzheVar = this.zzam;
        return zzheVar == null ? zzhe.m10060I() : zzheVar;
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m10284U1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    /* JADX INFO: renamed from: V */
    public final int m10285V() {
        return this.zzH;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m10286V0() {
        return (this.zze & 8388608) != 0;
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m10287V1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m10288W() {
        return (this.zzb & 536870912) != 0;
    }

    /* JADX INFO: renamed from: W0 */
    public final int m10289W0() {
        return this.zzan;
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m10290W1(boolean z) {
        this.zzb |= 8388608;
        this.zzE = z;
    }

    /* JADX INFO: renamed from: X */
    public final long m10291X() {
        return this.zzL;
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m10292X0() {
        return (this.zze & 16777216) != 0;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m10293X1(Iterable iterable) {
        zzaef zzaefVar = this.zzF;
        if (!zzaefVar.zza()) {
            this.zzF = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(iterable, this.zzF);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m10294Y() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: Y0 */
    public final zzha m10295Y0() {
        zzha zzhaVar = this.zzao;
        return zzhaVar == null ? zzha.m10015g0() : zzhaVar;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m10296Y1() {
        this.zzF = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: Z */
    public final String m10297Z() {
        return this.zzN;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m10298Z0() {
        return (this.zze & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m10299Z1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m10300a0() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: a1 */
    public final zzis m10301a1() {
        zzis zzisVar = this.zzaq;
        return zzisVar == null ? zzis.m10411C() : zzisVar;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m10302a2(int i2) {
        this.zzb |= 33554432;
        this.zzH = i2;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10303b0() {
        return (this.zze & 134217728) != 0;
    }

    /* JADX INFO: renamed from: b1 */
    public final int m10304b1() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m10305b2() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    /* JADX INFO: renamed from: c0 */
    public final long m10306c0() {
        return this.zzar;
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m10307c1(long j2) {
        this.zzb |= 536870912;
        this.zzL = j2;
    }

    /* JADX INFO: renamed from: c2 */
    public final List m10308c2() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m10309d0() {
        return (this.zze & 536870912) != 0;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m10310d1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m10311d2() {
        zzaef zzaefVar = this.zzg;
        if (zzaefVar.zza()) {
            return;
        }
        this.zzg = AbstractC1456a.m2441h(zzaefVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final zzho m10312e0() {
        zzho zzhoVar = this.zzat;
        return zzhoVar == null ? zzho.m10096C() : zzhoVar;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m10313e1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m10314e2() {
        zzaef zzaefVar = this.zzh;
        if (zzaefVar.zza()) {
            return;
        }
        this.zzh = AbstractC1456a.m2441h(zzaefVar);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m10315f1(int i2) {
        this.zze |= 2;
        this.zzP = i2;
    }

    /* JADX INFO: renamed from: f2 */
    public final void m10316f2(List list) {
        zzaef zzaefVar = this.zzav;
        if (!zzaefVar.zza()) {
            this.zzav = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(list, this.zzav);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m10317g1(zzig zzigVar) {
        this.zzR = zzigVar;
        this.zze |= 8;
    }

    /* JADX INFO: renamed from: g2 */
    public final int m10318g2() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m10319h0() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m10320h1(List list) {
        zzaeb zzaebVar = this.zzS;
        if (!zzaebVar.zza()) {
            int size = zzaebVar.size();
            this.zzS = zzaebVar.mo9370p(size + size);
        }
        zzacb.m9343k(list, this.zzS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public final zzhs m10321h2(int i2) {
        return (zzhs) this.zzg.get(i2);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m10322i0(int i2, zzhs zzhsVar) {
        m10311d2();
        this.zzg.set(i2, zzhsVar);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m10323i1(long j2) {
        this.zze |= 16;
        this.zzT = j2;
    }

    /* JADX INFO: renamed from: i2 */
    public final zzaef m10324i2() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10325j0(zzhs zzhsVar) {
        m10311d2();
        this.zzg.add(zzhsVar);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m10326j1(long j2) {
        this.zze |= 32;
        this.zzU = j2;
    }

    /* JADX INFO: renamed from: j2 */
    public final int m10327j2() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10328k0(Iterable iterable) {
        m10311d2();
        zzacb.m9343k(iterable, this.zzg);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m10329k1(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final zziu m10330k2(int i2) {
        return (zziu) this.zzh.get(i2);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10331l0() {
        this.zzg = zzafm.f22097w;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m10332l1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m10333l2() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m10334m0(int i2) {
        m10311d2();
        this.zzg.remove(i2);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m10335m1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    /* JADX INFO: renamed from: m2 */
    public final long m10336m2() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m10337n0(int i2, zziu zziuVar) {
        m10314e2();
        this.zzh.set(i2, zziuVar);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m10338n1(Set set) {
        zzaef zzaefVar = this.zzad;
        if (!zzaefVar.zza()) {
            this.zzad = AbstractC1456a.m2441h(zzaefVar);
        }
        zzacb.m9343k(set, this.zzad);
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m10339n2() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m10340o0(zziu zziuVar) {
        m10314e2();
        this.zzh.add(zziuVar);
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m10341o1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    /* JADX INFO: renamed from: o2 */
    public final long m10342o2() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m10343p0(List list) {
        m10314e2();
        zzacb.m9343k(list, this.zzh);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m10344p1(long j2) {
        this.zze |= 32768;
        this.zzaf = j2;
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m10345p2() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m10346q0(int i2) {
        m10314e2();
        this.zzh.remove(i2);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m10347q1(boolean z) {
        this.zze |= 65536;
        this.zzag = z;
    }

    /* JADX INFO: renamed from: q2 */
    public final long m10348q2() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m10349r0(long j2) {
        this.zzb |= 2;
        this.zzi = j2;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m10350r1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m10351r2() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10352s0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m10353s1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    /* JADX INFO: renamed from: s2 */
    public final long m10354s2() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m10355t0(long j2) {
        this.zzb |= 4;
        this.zzj = j2;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m10356t1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    /* JADX INFO: renamed from: t2 */
    public final boolean m10357t2() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m10358u0(long j2) {
        this.zzb |= 8;
        this.zzk = j2;
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m10359u1(int i2) {
        this.zze |= 1048576;
        this.zzak = i2;
    }

    /* JADX INFO: renamed from: u2 */
    public final long m10360u2() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m10361v0(long j2) {
        this.zzb |= 16;
        this.zzl = j2;
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m10362v1(zzhe zzheVar) {
        this.zzam = zzheVar;
        this.zze |= 4194304;
    }

    /* JADX INFO: renamed from: v2 */
    public final String m10363v2() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m10364w0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m10365w1(int i2) {
        this.zze |= 8388608;
        this.zzan = i2;
    }

    /* JADX INFO: renamed from: w2 */
    public final String m10366w2() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m10367x0(long j2) {
        this.zzb |= 32;
        this.zzm = j2;
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m10368x1(zzha zzhaVar) {
        this.zzao = zzhaVar;
        this.zze |= 16777216;
    }

    /* JADX INFO: renamed from: x2 */
    public final String m10369x2() {
        return this.zzp;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m10370y0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m10371y1(zzis zzisVar) {
        this.zzaq = zzisVar;
        this.zze |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    /* JADX INFO: renamed from: y2 */
    public final String m10372y2() {
        return this.zzq;
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
            return new zzafn(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzhs.class, "zzh", zziu.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", zzhg.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", zzgw.f22498a, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", zzfb.class});
        }
        if (i3 == 3) {
            return new zzid();
        }
        if (i3 == 4) {
            return new zzic(zzaw);
        }
        if (i3 == 5) {
            return zzaw;
        }
        if (i3 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzax;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zzid.class) {
            try {
                zzadqVar = zzax;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzaw);
                    zzax = zzadqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzadqVar;
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m10373z0() {
        this.zzb |= 64;
        this.zzn = "android";
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m10374z1(long j2) {
        this.zze |= 134217728;
        this.zzar = j2;
    }

    /* JADX INFO: renamed from: z2 */
    public final boolean m10375z2() {
        return (this.zzb & 1024) != 0;
    }
}
