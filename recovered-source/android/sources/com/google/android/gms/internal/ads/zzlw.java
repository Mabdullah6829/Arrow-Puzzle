package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzlw implements Handler.Callback, zzxi, zzabh, zzms, zzjj, zzmw, zzcc, zzadt {

    /* JADX INFO: renamed from: v0 */
    public static final long f20293v0 = zzfm.m6518t(WorkRequest.MIN_BACKOFF_MILLIS);

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ int f20294w0 = 0;

    /* JADX INFO: renamed from: A */
    public final Looper f20295A;

    /* JADX INFO: renamed from: B */
    public final zzbe f20296B;

    /* JADX INFO: renamed from: C */
    public final zzbd f20297C;

    /* JADX INFO: renamed from: D */
    public final long f20298D;

    /* JADX INFO: renamed from: E */
    public final zzjk f20299E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f20300F;

    /* JADX INFO: renamed from: G */
    public final zzdp f20301G;

    /* JADX INFO: renamed from: H */
    public final zzlu f20302H;

    /* JADX INFO: renamed from: I */
    public final zzmh f20303I;

    /* JADX INFO: renamed from: J */
    public final zzmt f20304J;

    /* JADX INFO: renamed from: K */
    public final long f20305K;

    /* JADX INFO: renamed from: L */
    public final zzqh f20306L;

    /* JADX INFO: renamed from: M */
    public final boolean f20307M;

    /* JADX INFO: renamed from: N */
    public final zzno f20308N;

    /* JADX INFO: renamed from: O */
    public final zzea f20309O;

    /* JADX INFO: renamed from: P */
    public final boolean f20310P;

    /* JADX INFO: renamed from: Q */
    public final zzcd f20311Q;

    /* JADX INFO: renamed from: R */
    public zznk f20312R;

    /* JADX INFO: renamed from: T */
    public boolean f20314T;

    /* JADX INFO: renamed from: U */
    public boolean f20315U;

    /* JADX INFO: renamed from: V */
    public zzlv f20316V;

    /* JADX INFO: renamed from: W */
    public int f20317W;

    /* JADX INFO: renamed from: X */
    public zzmu f20318X;

    /* JADX INFO: renamed from: Y */
    public zzlt f20319Y;

    /* JADX INFO: renamed from: Z */
    public boolean f20320Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f20322b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f20323c0;

    /* JADX INFO: renamed from: e0 */
    public boolean f20325e0;

    /* JADX INFO: renamed from: h0 */
    public boolean f20328h0;

    /* JADX INFO: renamed from: i0 */
    public int f20329i0;

    /* JADX INFO: renamed from: j0 */
    public zzlv f20330j0;

    /* JADX INFO: renamed from: k0 */
    public long f20331k0;

    /* JADX INFO: renamed from: l0 */
    public long f20332l0;

    /* JADX INFO: renamed from: m0 */
    public int f20333m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f20334n0;

    /* JADX INFO: renamed from: o0 */
    public zzjm f20335o0;

    /* JADX INFO: renamed from: q0 */
    public zzjw f20337q0;

    /* JADX INFO: renamed from: s */
    public final zzng[] f20339s;

    /* JADX INFO: renamed from: s0 */
    public boolean f20340s0;

    /* JADX INFO: renamed from: t */
    public final zzne[] f20341t;

    /* JADX INFO: renamed from: u */
    public final boolean[] f20343u;

    /* JADX INFO: renamed from: u0 */
    public final zzjf f20344u0;

    /* JADX INFO: renamed from: v */
    public final zzabi f20345v;

    /* JADX INFO: renamed from: w */
    public final zzabj f20346w;

    /* JADX INFO: renamed from: x */
    public final zzma f20347x;

    /* JADX INFO: renamed from: y */
    public final zzea f20348y;

    /* JADX INFO: renamed from: z */
    public final zzmv f20349z;

    /* JADX INFO: renamed from: r0 */
    public long f20338r0 = -9223372036854775807L;

    /* JADX INFO: renamed from: f0 */
    public int f20326f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public boolean f20327g0 = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f20321a0 = false;

    /* JADX INFO: renamed from: t0 */
    public float f20342t0 = 1.0f;

    /* JADX INFO: renamed from: S */
    public zznj f20313S = zznj.f20502b;

    /* JADX INFO: renamed from: p0 */
    public long f20336p0 = -9223372036854775807L;

    /* JADX INFO: renamed from: d0 */
    public long f20324d0 = -9223372036854775807L;

    public zzlw(Context context, zznc[] zzncVarArr, zznc[] zzncVarArr2, zzabi zzabiVar, zzabj zzabjVar, zzma zzmaVar, zzabr zzabrVar, zzpt zzptVar, zznk zznkVar, zzjf zzjfVar, long j2, boolean z, Looper looper, zzdp zzdpVar, zzlu zzluVar, zzqh zzqhVar, zzjw zzjwVar, final zzadt zzadtVar) {
        Looper looper2;
        this.f20302H = zzluVar;
        this.f20345v = zzabiVar;
        this.f20346w = zzabjVar;
        this.f20347x = zzmaVar;
        boolean z2 = false;
        this.f20312R = zznkVar;
        this.f20344u0 = zzjfVar;
        this.f20305K = j2;
        this.f20307M = z;
        this.f20301G = zzdpVar;
        this.f20306L = zzqhVar;
        this.f20337q0 = zzjwVar;
        this.f20308N = zzptVar;
        this.f20298D = zzmaVar.mo5522b();
        zzmaVar.mo5523c();
        zzbf zzbfVar = zzbf.f7725a;
        zzmu zzmuVarM8756a = zzmu.m8756a(zzabjVar);
        this.f20318X = zzmuVarM8756a;
        this.f20319Y = new zzlt(zzmuVarM8756a);
        int length = zzncVarArr.length;
        this.f20341t = new zzne[2];
        this.f20343u = new boolean[2];
        zznd zzndVarMo3915d = zzabiVar.mo3915d();
        this.f20339s = new zzng[2];
        boolean z3 = false;
        for (int i2 = 0; i2 < 2; i2++) {
            zzncVarArr[i2].mo8589b0(i2, zzqhVar, zzdpVar);
            this.f20341t[i2] = zzncVarArr[i2].zzb();
            this.f20341t[i2].mo8597l(zzndVarMo3915d);
            zznc zzncVar = zzncVarArr2[i2];
            if (zzncVar != null) {
                zzncVar.mo8589b0(i2, zzqhVar, zzdpVar);
                z3 = true;
            }
            this.f20339s[i2] = new zzng(zzncVarArr[i2], zzncVarArr2[i2], i2);
        }
        this.f20310P = z3;
        this.f20299E = new zzjk(this);
        this.f20300F = new ArrayList();
        this.f20296B = new zzbe();
        this.f20297C = new zzbd();
        zzgtr.m7133f(zzabiVar.f4842a == null);
        zzabiVar.f4842a = this;
        zzabiVar.f4843b = zzabrVar;
        this.f20334n0 = true;
        zzea zzeaVarMo5975a = zzdpVar.mo5975a(looper, null);
        this.f20309O = zzeaVarMo5975a;
        this.f20303I = new zzmh(zzptVar, zzeaVarMo5975a, new zzlp(this), zzjwVar);
        this.f20304J = new zzmt(this, zzptVar, zzeaVarMo5975a, zzqhVar, zzabrVar);
        zzmv zzmvVar = new zzmv(0);
        this.f20349z = zzmvVar;
        synchronized (zzmvVar.f20475a) {
            try {
                if (zzmvVar.f20476b == null) {
                    if (zzmvVar.f20478d == 0 && zzmvVar.f20477c == null) {
                        z2 = true;
                    }
                    zzgtr.m7133f(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    zzmvVar.f20477c = handlerThread;
                    handlerThread.start();
                    zzmvVar.f20476b = zzmvVar.f20477c.getLooper();
                }
                zzmvVar.f20478d++;
                looper2 = zzmvVar.f20476b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20295A = looper2;
        zzea zzeaVarMo5975a2 = zzdpVar.mo5975a(looper2, this);
        this.f20348y = zzeaVarMo5975a2;
        this.f20311Q = new zzcd(context, looper2, this);
        ((zzfg) ((zzfh) zzeaVarMo5975a2).mo6124i(35, new zzadt() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzadt
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo3949b(long j3, long j4, zzv zzvVar, MediaFormat mediaFormat) {
                this.f20274s.mo3949b(j3, j4, zzvVar, mediaFormat);
            }
        })).m6435a();
    }

    /* JADX INFO: renamed from: A */
    public static Pair m8643A(zzbf zzbfVar, zzlv zzlvVar, int i2, boolean z, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2 = zzlvVar.f20290a;
        if (zzbfVar.m4833g()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.m4833g() ? zzbfVar : zzbfVar2;
        try {
            Pair pairM4839m = zzbfVar3.m4839m(zzbeVar, zzbdVar, zzlvVar.f20291b, zzlvVar.f20292c);
            if (!zzbfVar.equals(zzbfVar3)) {
                if (zzbfVar.mo4739e(pairM4839m.first) == -1) {
                    int iM8645X = m8645X(zzbeVar, zzbdVar, i2, z, pairM4839m.first, zzbfVar3, zzbfVar);
                    if (iM8645X != -1) {
                        return zzbfVar.m4839m(zzbeVar, zzbdVar, iM8645X, -9223372036854775807L);
                    }
                    return null;
                }
                if (zzbfVar3.mo4841o(pairM4839m.first, zzbdVar).f7636e && zzbfVar3.mo4736b(zzbdVar.f7634c, zzbeVar, 0L).f7685k == zzbfVar3.mo4739e(pairM4839m.first)) {
                    return zzbfVar.m4839m(zzbeVar, zzbdVar, zzbfVar.mo4841o(pairM4839m.first, zzbdVar).f7634c, zzlvVar.f20292c);
                }
            }
            return pairM4839m;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m8644B(zzme zzmeVar) {
        if (zzmeVar != null) {
            try {
                zzxd zzxdVar = zzmeVar.f20366a;
                if (zzmeVar.f20370e) {
                    zzzd[] zzzdVarArr = zzmeVar.f20368c;
                    for (int i2 = 0; i2 < 2; i2++) {
                        zzzd zzzdVar = zzzdVarArr[i2];
                        if (zzzdVar != null) {
                            zzzdVar.zzb();
                        }
                    }
                } else {
                    zzxdVar.mo9007e();
                }
                if ((!zzmeVar.f20370e ? 0L : zzxdVar.zzc()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public static int m8645X(zzbe zzbeVar, zzbd zzbdVar, int i2, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.mo4736b(zzbfVar3.mo4841o(obj, zzbdVar).f7634c, zzbeVar, 0L).f7675a;
        for (int i3 = 0; i3 < zzbfVar2.mo4735a(); i3++) {
            if (zzbfVar2.mo4736b(i3, zzbeVar, 0L).f7675a.equals(obj2)) {
                return i3;
            }
        }
        int iMo4739e = zzbfVar3.mo4739e(obj);
        int iMo4737c = zzbfVar3.mo4737c();
        int iMo4739e2 = -1;
        int i4 = 0;
        while (i4 < iMo4737c && iMo4739e2 == -1) {
            zzbf zzbfVar4 = zzbfVar3;
            int iM4838l = zzbfVar4.m4838l(iMo4739e, zzbdVar, zzbeVar, i2, z);
            if (iM4838l == -1) {
                iMo4739e2 = -1;
                break;
            }
            iMo4739e2 = zzbfVar2.mo4739e(zzbfVar4.mo4740f(iM4838l));
            i4++;
            zzbfVar3 = zzbfVar4;
            iMo4739e = iM4838l;
        }
        if (iMo4739e2 == -1) {
            return -1;
        }
        return zzbfVar2.mo4738d(iMo4739e2, zzbdVar, false).f7634c;
    }

    /* JADX INFO: renamed from: C */
    public final void m8646C() {
        for (int i2 = 0; i2 < 2; i2++) {
            zzng[] zzngVarArr = this.f20339s;
            int iM8788q = zzngVarArr[i2].m8788q();
            zzng zzngVar = zzngVarArr[i2];
            zznc zzncVar = zzngVar.f20495a;
            zznc zzncVar2 = zzngVar.f20497c;
            zzjk zzjkVar = this.f20299E;
            zzngVar.m8781i(zzncVar, zzjkVar);
            if (zzncVar2 != null) {
                boolean z = (zzncVar2.mo8587a() == 0 || zzngVar.f20498d == 3) ? false : true;
                zzngVar.m8781i(zzncVar2, zzjkVar);
                zzngVar.m8782j(false);
                if (z) {
                    zznc zzncVar3 = zzngVar.f20495a;
                    zzncVar2.getClass();
                    zzncVar2.mo4007j(17, zzncVar3);
                }
            }
            zzngVar.f20498d = 0;
            m8679n(i2, false);
            this.f20329i0 -= iM8788q;
        }
        this.f20338r0 = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[Catch: RuntimeException -> 0x0038, TryCatch #0 {RuntimeException -> 0x0038, blocks: (B:21:0x0035, B:26:0x003e, B:24:0x003a, B:28:0x0043), top: B:41:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    public final void m8647D() {
        boolean z;
        zznc zzncVar;
        if (!this.f20310P || !m8666W()) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (i2 >= 2) {
                this.f20338r0 = -9223372036854775807L;
                return;
            }
            zzng zzngVar = this.f20339s[i2];
            int iM8788q = zzngVar.m8788q();
            zzjk zzjkVar = this.f20299E;
            if (zzngVar.m8787p()) {
                int i4 = zzngVar.f20498d;
                try {
                    if (i4 != 4) {
                        if (i4 != 2) {
                            i3 = i4;
                            z = false;
                        }
                        if (z) {
                            try {
                                zzncVar = zzngVar.f20495a;
                            } catch (RuntimeException e) {
                                zzeh.m6214f("RendererHolder", "Disable prewarming failed.", e);
                            }
                        } else {
                            zzncVar = zzngVar.f20497c;
                            if (zzncVar == null) {
                                throw null;
                            }
                        }
                        zzngVar.m8781i(zzncVar, zzjkVar);
                        zzngVar.m8782j(z);
                        zzngVar.f20498d = i3 != 4 ? 0 : 1;
                    } else {
                        i3 = i4;
                    }
                    zzngVar.m8782j(z);
                } catch (RuntimeException e2) {
                    zzeh.m6214f("RendererHolder", "Reset prewarming failed.", e2);
                }
                z = true;
                if (z) {
                    zzncVar = zzngVar.f20495a;
                } else {
                    zzncVar = zzngVar.f20497c;
                    if (zzncVar == null) {
                        throw null;
                    }
                }
                zzngVar.m8781i(zzncVar, zzjkVar);
                zzngVar.f20498d = i3 != 4 ? 0 : 1;
            }
            this.f20329i0 -= iM8788q - zzngVar.m8788q();
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    public final void m8648E() throws zzjm {
        int i2;
        int i3;
        int i4;
        zzjk zzjkVar = this.f20299E;
        float f2 = zzjkVar.zzj().f6970a;
        zzmh zzmhVar = this.f20303I;
        zzme zzmeVar = zzmhVar.f20400h;
        zzme zzmeVar2 = zzmhVar.f20401i;
        zzabj zzabjVar = null;
        zzme zzmeVar3 = zzmeVar;
        boolean z = true;
        while (zzmeVar3 != null && zzmeVar3.f20370e) {
            zzabj zzabjVarM8697f = zzmeVar3.m8697f(this.f20318X.f20456a);
            zzabj zzabjVar2 = zzmeVar3 == zzmhVar.f20400h ? zzabjVarM8697f : zzabjVar;
            zzabj zzabjVar3 = zzmeVar3.f20380o;
            boolean z2 = false;
            if (zzabjVar3 != null) {
                zzabb[] zzabbVarArr = zzabjVarM8697f.f4846c;
                if (zzabjVar3.f4846c.length == zzabbVarArr.length) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= zzabbVarArr.length) {
                            if (zzmeVar3 != zzmeVar2) {
                                z2 = true;
                            }
                            z &= z2;
                            zzmeVar3 = zzmeVar3.f20378m;
                            zzabjVar = zzabjVar2;
                        } else if (zzabjVarM8697f.m3925b(zzabjVar3, i5)) {
                            i5++;
                        }
                    }
                }
            }
            if (!z) {
                i2 = 4;
                zzmhVar.m8734y(zzmeVar3);
                if (zzmeVar3.f20370e) {
                    long jMax = Math.max(zzmeVar3.f20372g.f20383b, this.f20331k0 - zzmeVar3.f20381p);
                    if (this.f20310P && m8666W() && zzmhVar.f20402j == zzmeVar3) {
                        m8647D();
                    }
                    i3 = 4;
                    i4 = 2;
                    zzmeVar3.m8698g(zzabjVarM8697f, jMax, false, new boolean[2]);
                }
                m8661R(true);
                if (this.f20318X.f20460e != i3) {
                    m8656M();
                    m8678m();
                    this.f20348y.mo6125l(i4);
                    return;
                }
                return;
            }
            zzme zzmeVar4 = zzmhVar.f20400h;
            int iM8734y = zzmhVar.m8734y(zzmeVar4) & 1;
            zzng[] zzngVarArr = this.f20339s;
            boolean[] zArr = new boolean[2];
            zzabjVar2.getClass();
            long jM8698g = zzmeVar4.m8698g(zzabjVar2, this.f20318X.f20473r, 1 == iM8734y, zArr);
            zzmu zzmuVar = this.f20318X;
            boolean z3 = (zzmuVar.f20460e == 4 || jM8698g == zzmuVar.f20473r) ? false : true;
            zzmu zzmuVar2 = this.f20318X;
            boolean z4 = z3;
            i2 = 4;
            this.f20318X = m8658O(zzmuVar2.f20457b, jM8698g, zzmuVar2.f20458c, zzmuVar2.f20459d, z4, 5);
            if (z4) {
                m8685t(true, jM8698g);
            }
            m8647D();
            boolean[] zArr2 = new boolean[2];
            int i6 = 0;
            for (int i7 = 2; i6 < i7; i7 = 2) {
                int iM8788q = zzngVarArr[i6].m8788q();
                zArr2[i6] = zzngVarArr[i6].m8779g();
                zzng zzngVar = zzngVarArr[i6];
                zzzd zzzdVar = zzmeVar4.f20368c[i6];
                long j2 = this.f20331k0;
                boolean z5 = zArr[i6];
                zznc zzncVar = zzngVar.f20495a;
                if (zzng.m8770l(zzncVar)) {
                    if (zzzdVar != zzncVar.mo8588a0()) {
                        zzngVar.m8781i(zzncVar, zzjkVar);
                    } else if (z5) {
                        zzncVar.mo8585Y(true, j2);
                    }
                }
                zznc zzncVar2 = zzngVar.f20497c;
                if (zzncVar2 != null && zzng.m8770l(zzncVar2)) {
                    if (zzzdVar != zzncVar2.mo8588a0()) {
                        zzngVar.m8781i(zzncVar2, zzjkVar);
                    } else if (z5) {
                        zzncVar2.mo8585Y(true, j2);
                    }
                }
                if (iM8788q - zzngVarArr[i6].m8788q() > 0) {
                    m8679n(i6, false);
                }
                this.f20329i0 -= iM8788q - zzngVarArr[i6].m8788q();
                i6++;
            }
            m8659P(zArr2, this.f20331k0);
            zzmeVar4.f20373h = true;
            i3 = i2;
            i4 = 2;
            m8661R(true);
            if (this.f20318X.f20460e != i3) {
                m8656M();
                m8678m();
                this.f20348y.mo6125l(i4);
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m8649F() {
        zzme zzmeVar = this.f20303I.f20400h;
        long j2 = zzmeVar.f20372g.f20386e;
        if (zzmeVar.f20370e) {
            return j2 == -9223372036854775807L || this.f20318X.f20473r < j2 || !m8664U();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x022e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    /* JADX WARN: Code duplicated, block: B:120:0x025a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x028a  */
    /* JADX WARN: Code duplicated, block: B:136:0x029b  */
    /* JADX WARN: Code duplicated, block: B:142:0x02af  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02de  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:238:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:243:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x0401  */
    /* JADX WARN: Code duplicated, block: B:246:0x0409  */
    /* JADX WARN: Code duplicated, block: B:250:0x042e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0444  */
    /* JADX WARN: Code duplicated, block: B:256:0x0447  */
    /* JADX WARN: Code duplicated, block: B:259:0x0451  */
    /* JADX WARN: Code duplicated, block: B:261:0x0459 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x045b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0460  */
    /* JADX WARN: Code duplicated, block: B:268:0x0485  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:72:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.zzmu] */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.zzlw] */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v19 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: G */
    public final void m8650G(zzbf zzbfVar, boolean z) throws Throwable {
        long j2;
        boolean z2;
        long j3;
        zzbe zzbeVar;
        int iMo4837k;
        zzbd zzbdVar;
        zzxl zzxlVar;
        long j4;
        Object obj;
        zzbf zzbfVar2;
        zzbf zzbfVar3;
        boolean z3;
        zzbf zzbfVar4;
        long j5;
        Object obj2;
        boolean z4;
        boolean z5;
        long jMax;
        int iM8645X;
        boolean z6;
        zzbf zzbfVar5;
        zzbd zzbdVar2;
        long jMin;
        zzxl zzxlVarM8710E;
        boolean zEquals;
        boolean z7;
        zzxl zzxlVar2;
        zza zzaVarM5285a;
        long j6;
        int i2;
        int i3;
        long j7;
        boolean z8;
        Object obj3;
        boolean z9;
        boolean z10;
        boolean z11;
        ?? r8;
        zzxl zzxlVar3;
        ?? r12;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        zza zzaVarM5285a2;
        int i7;
        int[] iArr2;
        int i8;
        Pair pairM8643A;
        long j8;
        long jLongValue;
        int iMo4837k2;
        boolean z12;
        boolean z13;
        ?? r35;
        ?? r13;
        ?? r14;
        ?? r11;
        zzxl zzxlVar4;
        Throwable th;
        long j9;
        zzxl zzxlVar5;
        long j10;
        long j11;
        zzbf zzbfVar6;
        ?? r15;
        ?? r36;
        ?? r16;
        ?? r17;
        long j12;
        zzxl zzxlVar6;
        long j13;
        long j14;
        ?? r37;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r38;
        Object obj4;
        boolean z14;
        zzmu zzmuVar = this.f20318X;
        zzlv zzlvVar = this.f20330j0;
        zzbd zzbdVar3 = this.f20297C;
        int i9 = this.f20326f0;
        boolean z15 = this.f20327g0;
        int i10 = 4;
        long jM8652I = 0;
        if (zzbfVar.m4833g()) {
            zzxl zzxlVar7 = zzmu.f20455t;
            zzxl zzxlVar8 = zzmuVar.f20457b;
            boolean z16 = (zzxlVar7.equals(zzxlVar8) && zzmuVar.f20473r == 0) ? false : true;
            if (!z16 || z == 0) {
                z14 = false;
            } else {
                zzbf zzbfVar7 = zzmuVar.f20456a;
                if (zzbfVar7.m4833g() || zzbfVar7.mo4841o(zzxlVar8.f21278a, zzbdVar3).f7636e) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            }
            z10 = z14;
            zzxlVar3 = zzxlVar7;
            r12 = z16;
            jM8652I = 0;
            z11 = false;
            r8 = 0;
            j2 = -9223372036854775807L;
            j4 = -9223372036854775807L;
            z5 = true;
            zzbfVar5 = zzbfVar;
        } else {
            zzxl zzxlVar9 = zzmuVar.f20457b;
            Object obj5 = zzxlVar9.f21278a;
            zzbf zzbfVar8 = zzmuVar.f20456a;
            if (zzbfVar8.m4833g()) {
                j2 = -9223372036854775807L;
            } else {
                j2 = -9223372036854775807L;
                if (!zzbfVar8.mo4841o(zzxlVar9.f21278a, zzbdVar3).f7636e) {
                    z2 = false;
                }
                j3 = (!zzxlVar9.m9025b() || z2) ? zzmuVar.f20458c : zzmuVar.f20473r;
                zzbeVar = this.f20296B;
                iMo4837k = -1;
                if (zzlvVar != null) {
                    zzxlVar = zzxlVar9;
                    obj = obj5;
                    zzbdVar = zzbdVar3;
                    pairM8643A = m8643A(zzbfVar, zzlvVar, i9, z15, zzbeVar, zzbdVar);
                    if (pairM8643A == null) {
                        iMo4837k2 = zzbfVar.mo4837k(z15);
                        obj2 = obj;
                        jLongValue = j3;
                        j8 = jLongValue;
                        z12 = false;
                        z13 = false;
                        z5 = true;
                    } else {
                        j8 = j3;
                        if (zzlvVar.f20292c == j2) {
                            iMo4837k2 = zzbfVar.mo4841o(pairM8643A.first, zzbdVar).f7634c;
                            obj2 = obj;
                            jLongValue = j8;
                            z12 = false;
                        } else {
                            Object obj6 = pairM8643A.first;
                            jLongValue = ((Long) pairM8643A.second).longValue();
                            obj2 = obj6;
                            iMo4837k2 = -1;
                            z12 = true;
                        }
                        if (zzmuVar.f20460e == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z5 = false;
                    }
                    boolean z17 = z13;
                    z4 = z12;
                    z3 = z17;
                    long j15 = jLongValue;
                    zzbfVar4 = zzbfVar;
                    iMo4837k = iMo4837k2;
                    j5 = j8;
                    j4 = j15;
                } else {
                    zzbdVar = zzbdVar3;
                    zzxlVar = zzxlVar9;
                    j4 = j3;
                    obj = obj5;
                    zzbfVar2 = zzbfVar;
                    zzbfVar3 = zzmuVar.f20456a;
                    if (zzbfVar3.m4833g()) {
                        iMo4837k = zzbfVar2.mo4837k(z15);
                        obj2 = obj;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    } else if (zzbfVar2.mo4739e(obj) == -1) {
                        z3 = false;
                        iM8645X = m8645X(zzbeVar, zzbdVar, i9, z15, obj, zzbfVar3, zzbfVar2);
                        if (iM8645X == -1) {
                            zzbeVar = zzbeVar;
                            zzbfVar2 = zzbfVar2;
                            obj = obj;
                            iM8645X = zzbfVar2.mo4837k(z15);
                            z6 = true;
                        } else {
                            zzbeVar = zzbeVar;
                            zzbfVar2 = zzbfVar2;
                            obj = obj;
                            z6 = false;
                        }
                        z5 = z6;
                        obj2 = obj;
                        z4 = false;
                        iMo4837k = iM8645X;
                    } else {
                        z3 = false;
                        if (j4 == j2) {
                            iMo4837k = zzbfVar2.mo4841o(obj, zzbdVar).f7634c;
                            obj2 = obj;
                            z4 = false;
                            z5 = false;
                        } else {
                            if (z2 != 0) {
                                zzbfVar3.mo4841o(obj, zzbdVar);
                                if (zzbfVar3.mo4736b(zzbdVar.f7634c, zzbeVar, 0L).f7685k == zzbfVar3.mo4739e(obj)) {
                                    Pair pairM4839m = zzbfVar2.m4839m(zzbeVar, zzbdVar, zzbfVar2.mo4841o(obj, zzbdVar).f7634c, j4);
                                    zzbfVar4 = zzbfVar2;
                                    zzbeVar = zzbeVar;
                                    zzbdVar = zzbdVar;
                                    j5 = j4;
                                    obj2 = pairM4839m.first;
                                    jMax = ((Long) pairM4839m.second).longValue();
                                } else {
                                    zzbfVar4 = zzbfVar2;
                                    zzbdVar = zzbdVar;
                                    j5 = j4;
                                    if (zzbfVar4.mo4841o(obj, zzbdVar).f7635d != j2) {
                                        long j16 = zzbdVar.f7635d - 1;
                                        String str = zzfm.f16091a;
                                        jMax = Math.max(0L, Math.min(j5, j16));
                                    } else {
                                        jMax = j5;
                                    }
                                    obj2 = obj;
                                }
                                j4 = jMax;
                                z3 = false;
                                z4 = true;
                            } else {
                                zzbfVar4 = zzbfVar2;
                                zzbdVar = zzbdVar;
                                j5 = j4;
                                obj2 = obj;
                                z3 = false;
                                z4 = false;
                            }
                            z5 = false;
                        }
                    }
                    zzbfVar4 = zzbfVar2;
                    j5 = j4;
                }
                if (iMo4837k != -1) {
                    zzbdVar2 = zzbdVar;
                    zzbfVar5 = zzbfVar;
                    Pair pairM4839m2 = zzbfVar5.m4839m(zzbeVar, zzbdVar2, iMo4837k, -9223372036854775807L);
                    obj2 = pairM4839m2.first;
                    jMin = ((Long) pairM4839m2.second).longValue();
                    j4 = j2;
                } else {
                    zzbfVar5 = zzbfVar4;
                    zzbdVar2 = zzbdVar;
                    jMin = j4;
                }
                zzxlVarM8710E = this.f20303I.m8710E(zzbfVar5, obj2);
                zEquals = obj.equals(obj2);
                if (zEquals || zzxlVar.m9025b() || zzxlVarM8710E.m9025b()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                zzbd zzbdVarMo4841o = zzbfVar5.mo4841o(obj2, zzbdVar2);
                if (z2 && j5 == j4 && obj.equals(zzxlVarM8710E.f21278a)) {
                    if (zzxlVar.m9025b()) {
                        zzxlVar2 = zzxlVar;
                        zzbdVarMo4841o.m4755c(zzxlVar2.f21279b);
                    } else {
                        zzxlVar2 = zzxlVar;
                    }
                    if (zzxlVarM8710E.m9025b()) {
                        zzbdVarMo4841o.m4755c(-1);
                    }
                } else {
                    zzxlVar2 = zzxlVar;
                }
                if (true == z7) {
                    zzxlVarM8710E = zzxlVar2;
                }
                if (zzxlVarM8710E.m9025b()) {
                    if (zzxlVarM8710E.equals(zzxlVar2)) {
                        jMin = zzmuVar.f20473r;
                    } else {
                        zzbfVar5.mo4841o(zzxlVarM8710E.f21278a, zzbdVar2);
                        i6 = zzxlVarM8710E.f21280c;
                        zzaVarM5285a2 = zzbdVar2.f7637f.m5285a(zzxlVarM8710E.f21279b);
                        i7 = 0;
                        while (true) {
                            iArr2 = zzaVarM5285a2.f4742d;
                            if (i7 < iArr2.length || (i8 = iArr2[i7]) == 0 || i8 == 1) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i6 == i7) {
                            zzbdVar2.f7637f.getClass();
                        }
                        jMin = 0;
                    }
                } else if (zEquals && zzxlVar2.m9025b()) {
                    zzaVarM5285a = zzbfVar5.mo4841o(obj2, zzbdVar2).f7637f.m5285a(zzxlVar2.f21279b);
                    zzaVarM5285a.getClass();
                    j6 = zzmuVar.f20458c;
                    if (j6 != j2 || j6 < jM8652I) {
                        i2 = zzaVarM5285a.f4739a;
                        i3 = zzxlVar2.f21280c;
                        if (i2 > i3 && zzaVarM5285a.f4742d[i3] == 2) {
                            j7 = zzbfVar5.mo4841o(obj2, zzbdVar2).f7635d;
                            if (j7 != j2) {
                                jMin = Math.min(j7 - 1, jMin);
                            }
                            j4 = jMin;
                        }
                    }
                }
                if (zzxlVarM8710E.equals(zzxlVar2) || jMin != zzmuVar.f20473r) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (zzbfVar5.mo4739e(obj) == -1) {
                    i10 = 4;
                } else {
                    i10 = 3;
                }
                obj3 = zzxlVarM8710E.f21278a;
                if (obj3.equals(obj) && (i4 = zzxlVarM8710E.f21279b) != -1) {
                    zza zzaVarM5285a3 = zzbfVar5.mo4841o(obj3, zzbdVar2).f7637f.m5285a(i4);
                    i5 = zzxlVarM8710E.f21280c;
                    iArr = zzaVarM5285a3.f4742d;
                    if (i5 < iArr.length || iArr[i5] != 2) {
                        i10 = 0;
                    }
                }
                if (z8 || z == 0) {
                    z9 = false;
                } else {
                    zzbf zzbfVar9 = zzmuVar.f20456a;
                    if (zzbfVar9.m4833g() || zzbfVar9.mo4841o(obj, zzbdVar2).f7636e) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                }
                jM8652I = jMin;
                z10 = z9;
                z11 = z3;
                r8 = z4;
                zzxlVar3 = zzxlVarM8710E;
                r12 = z8;
            }
            z2 = true;
            if (zzxlVar9.m9025b()) {
            }
            zzbeVar = this.f20296B;
            iMo4837k = -1;
            if (zzlvVar != null) {
                zzxlVar = zzxlVar9;
                obj = obj5;
                zzbdVar = zzbdVar3;
                pairM8643A = m8643A(zzbfVar, zzlvVar, i9, z15, zzbeVar, zzbdVar);
                if (pairM8643A == null) {
                    iMo4837k2 = zzbfVar.mo4837k(z15);
                    obj2 = obj;
                    jLongValue = j3;
                    j8 = jLongValue;
                    z12 = false;
                    z13 = false;
                    z5 = true;
                } else {
                    j8 = j3;
                    if (zzlvVar.f20292c == j2) {
                        iMo4837k2 = zzbfVar.mo4841o(pairM8643A.first, zzbdVar).f7634c;
                        obj2 = obj;
                        jLongValue = j8;
                        z12 = false;
                    } else {
                        Object obj7 = pairM8643A.first;
                        jLongValue = ((Long) pairM8643A.second).longValue();
                        obj2 = obj7;
                        iMo4837k2 = -1;
                        z12 = true;
                    }
                    if (zzmuVar.f20460e == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z5 = false;
                }
                boolean z18 = z13;
                z4 = z12;
                z3 = z18;
                long j17 = jLongValue;
                zzbfVar4 = zzbfVar;
                iMo4837k = iMo4837k2;
                j5 = j8;
                j4 = j17;
            } else {
                zzbdVar = zzbdVar3;
                zzxlVar = zzxlVar9;
                j4 = j3;
                obj = obj5;
                zzbfVar2 = zzbfVar;
                zzbfVar3 = zzmuVar.f20456a;
                if (zzbfVar3.m4833g()) {
                    iMo4837k = zzbfVar2.mo4837k(z15);
                    obj2 = obj;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                } else if (zzbfVar2.mo4739e(obj) == -1) {
                    z3 = false;
                    iM8645X = m8645X(zzbeVar, zzbdVar, i9, z15, obj, zzbfVar3, zzbfVar2);
                    if (iM8645X == -1) {
                        zzbeVar = zzbeVar;
                        zzbfVar2 = zzbfVar2;
                        obj = obj;
                        iM8645X = zzbfVar2.mo4837k(z15);
                        z6 = true;
                    } else {
                        zzbeVar = zzbeVar;
                        zzbfVar2 = zzbfVar2;
                        obj = obj;
                        z6 = false;
                    }
                    z5 = z6;
                    obj2 = obj;
                    z4 = false;
                    iMo4837k = iM8645X;
                } else {
                    z3 = false;
                    if (j4 == j2) {
                        iMo4837k = zzbfVar2.mo4841o(obj, zzbdVar).f7634c;
                        obj2 = obj;
                        z4 = false;
                        z5 = false;
                    } else {
                        if (z2 != 0) {
                            zzbfVar3.mo4841o(obj, zzbdVar);
                            if (zzbfVar3.mo4736b(zzbdVar.f7634c, zzbeVar, 0L).f7685k == zzbfVar3.mo4739e(obj)) {
                                Pair pairM4839m3 = zzbfVar2.m4839m(zzbeVar, zzbdVar, zzbfVar2.mo4841o(obj, zzbdVar).f7634c, j4);
                                zzbfVar4 = zzbfVar2;
                                zzbeVar = zzbeVar;
                                zzbdVar = zzbdVar;
                                j5 = j4;
                                obj2 = pairM4839m3.first;
                                jMax = ((Long) pairM4839m3.second).longValue();
                            } else {
                                zzbfVar4 = zzbfVar2;
                                zzbdVar = zzbdVar;
                                j5 = j4;
                                if (zzbfVar4.mo4841o(obj, zzbdVar).f7635d != j2) {
                                    long j18 = zzbdVar.f7635d - 1;
                                    String str2 = zzfm.f16091a;
                                    jMax = Math.max(0L, Math.min(j5, j18));
                                } else {
                                    jMax = j5;
                                }
                                obj2 = obj;
                            }
                            j4 = jMax;
                            z3 = false;
                            z4 = true;
                        } else {
                            zzbfVar4 = zzbfVar2;
                            zzbdVar = zzbdVar;
                            j5 = j4;
                            obj2 = obj;
                            z3 = false;
                            z4 = false;
                        }
                        z5 = false;
                    }
                }
                zzbfVar4 = zzbfVar2;
                j5 = j4;
            }
            if (iMo4837k != -1) {
                zzbdVar2 = zzbdVar;
                zzbfVar5 = zzbfVar;
                Pair pairM4839m4 = zzbfVar5.m4839m(zzbeVar, zzbdVar2, iMo4837k, -9223372036854775807L);
                obj2 = pairM4839m4.first;
                jMin = ((Long) pairM4839m4.second).longValue();
                j4 = j2;
            } else {
                zzbfVar5 = zzbfVar4;
                zzbdVar2 = zzbdVar;
                jMin = j4;
            }
            zzxlVarM8710E = this.f20303I.m8710E(zzbfVar5, obj2);
            zEquals = obj.equals(obj2);
            if (zEquals) {
                z7 = false;
            } else {
                z7 = false;
            }
            zzbd zzbdVarMo4841o2 = zzbfVar5.mo4841o(obj2, zzbdVar2);
            if (z2) {
                zzxlVar2 = zzxlVar;
            } else {
                zzxlVar2 = zzxlVar;
            }
            if (true == z7) {
                zzxlVarM8710E = zzxlVar2;
            }
            if (zzxlVarM8710E.m9025b()) {
                if (zzxlVarM8710E.equals(zzxlVar2)) {
                    jMin = zzmuVar.f20473r;
                } else {
                    zzbfVar5.mo4841o(zzxlVarM8710E.f21278a, zzbdVar2);
                    i6 = zzxlVarM8710E.f21280c;
                    zzaVarM5285a2 = zzbdVar2.f7637f.m5285a(zzxlVarM8710E.f21279b);
                    i7 = 0;
                    while (true) {
                        iArr2 = zzaVarM5285a2.f4742d;
                        if (i7 < iArr2.length) {
                            break;
                        } else {
                            break;
                        }
                        i7++;
                    }
                    if (i6 == i7) {
                        zzbdVar2.f7637f.getClass();
                    }
                    jMin = 0;
                }
            } else if (zEquals) {
                zzaVarM5285a = zzbfVar5.mo4841o(obj2, zzbdVar2).f7637f.m5285a(zzxlVar2.f21279b);
                zzaVarM5285a.getClass();
                j6 = zzmuVar.f20458c;
                if (j6 != j2) {
                    i2 = zzaVarM5285a.f4739a;
                    i3 = zzxlVar2.f21280c;
                    if (i2 > i3) {
                        j7 = zzbfVar5.mo4841o(obj2, zzbdVar2).f7635d;
                        if (j7 != j2) {
                            jMin = Math.min(j7 - 1, jMin);
                        }
                        j4 = jMin;
                    }
                } else {
                    i2 = zzaVarM5285a.f4739a;
                    i3 = zzxlVar2.f21280c;
                    if (i2 > i3) {
                        j7 = zzbfVar5.mo4841o(obj2, zzbdVar2).f7635d;
                        if (j7 != j2) {
                            jMin = Math.min(j7 - 1, jMin);
                        }
                        j4 = jMin;
                    }
                }
            }
            if (zzxlVarM8710E.equals(zzxlVar2)) {
                z8 = true;
            } else {
                z8 = true;
            }
            if (zzbfVar5.mo4739e(obj) == -1) {
                i10 = 4;
            } else {
                i10 = 3;
            }
            obj3 = zzxlVarM8710E.f21278a;
            if (obj3.equals(obj)) {
                zza zzaVarM5285a4 = zzbfVar5.mo4841o(obj3, zzbdVar2).f7637f.m5285a(i4);
                i5 = zzxlVarM8710E.f21280c;
                iArr = zzaVarM5285a4.f4742d;
                if (i5 < iArr.length) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            }
            if (z8) {
                z9 = false;
            } else {
                z9 = false;
            }
            jM8652I = jMin;
            z10 = z9;
            z11 = z3;
            r8 = z4;
            zzxlVar3 = zzxlVarM8710E;
            r12 = z8;
        }
        int i11 = i10;
        if (z5) {
            try {
                if (this.f20318X.f20460e != 1) {
                    m8671f(4);
                }
                m8688w(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                zzxl zzxlVar10 = zzxlVar3;
                zzbfVar6 = zzbfVar5;
                zzxlVar4 = zzxlVar10;
                r14 = 0;
                r11 = zzbfVar6;
                r13 = r8;
                r35 = r12;
                zzmu zzmuVar2 = this.f20318X;
                zzbf zzbfVar10 = zzmuVar2.f20456a;
                zzxl zzxlVar11 = zzmuVar2.f20457b;
                if (1 != r13) {
                    j9 = j2;
                } else {
                    j9 = jM8652I;
                }
                zzxlVar5 = zzxlVar4;
                m8651H(r11, zzxlVar5, zzbfVar10, zzxlVar11, j9, false);
                if (r35 == 0) {
                    if (z10) {
                        j11 = jM8652I;
                        j10 = j11;
                    } else {
                        j10 = this.f20318X.f20459d;
                        j11 = jM8652I;
                    }
                    this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                } else {
                    if (z10) {
                        j11 = jM8652I;
                        j10 = j11;
                    } else {
                        j10 = this.f20318X.f20459d;
                        j11 = jM8652I;
                    }
                    this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                }
                m8654K();
                m8690y(r11, this.f20318X.f20456a);
                this.f20318X = this.f20318X.m8758c(r11);
                if (!r11.m4833g()) {
                    this.f20330j0 = r14;
                }
                m8661R(false);
                this.f20348y.mo6125l(2);
                throw th;
            }
        }
        zzng[] zzngVarArr = this.f20339s;
        int i12 = 0;
        while (true) {
            r15 = 2;
            if (i12 < 2) {
                zzng zzngVar = zzngVarArr[i12];
                zzngVar.f20495a.mo8584V(zzbfVar5);
                zznc zzncVar = zzngVar.f20497c;
                if (zzncVar != null) {
                    zzncVar.mo8584V(zzbfVar5);
                }
                i12++;
            } else {
                try {
                    break;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (r12 != 0) {
            r110 = r8;
            r38 = r12;
            zzbf zzbfVar11 = zzbfVar5;
            obj4 = null;
            if (!zzbfVar11.m4833g()) {
                try {
                    r19 = obj4;
                    r18 = r110;
                    r37 = r38;
                    zzmh zzmhVar = this.f20303I;
                    for (zzme zzmeVar = zzmhVar.f20400h; zzmeVar != null; zzmeVar = zzmeVar.f20378m) {
                        if (zzmeVar.f20372g.f20382a.equals(zzxlVar3)) {
                            zzmeVar.f20372g = zzmhVar.m8709D(zzbfVar11, zzmeVar.f20372g);
                        }
                    }
                    zzmh zzmhVar2 = this.f20303I;
                    zzxlVar4 = zzxlVar3;
                    long j19 = jM8652I;
                    try {
                        jM8652I = m8684s(zzxlVar4, j19, zzmhVar2.f20400h != zzmhVar2.f20401i, z11);
                        r17 = obj4;
                        r16 = r110;
                        r36 = r38;
                    } catch (Throwable th4) {
                        th = th4;
                        jM8652I = j19;
                        r11 = zzbfVar11;
                        z10 = z10;
                        i11 = i11;
                        r14 = obj4;
                        r13 = r110;
                        r35 = r38;
                        zzmu zzmuVar3 = this.f20318X;
                        zzbf zzbfVar12 = zzmuVar3.f20456a;
                        zzxl zzxlVar12 = zzmuVar3.f20457b;
                        if (1 != r13) {
                            j9 = j2;
                        } else {
                            j9 = jM8652I;
                        }
                        zzxlVar5 = zzxlVar4;
                        m8651H(r11, zzxlVar5, zzbfVar12, zzxlVar12, j9, false);
                        if (r35 == 0) {
                            if (z10) {
                                j11 = jM8652I;
                                j10 = j11;
                            } else {
                                j10 = this.f20318X.f20459d;
                                j11 = jM8652I;
                            }
                            this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                        } else {
                            if (z10) {
                                j11 = jM8652I;
                                j10 = j11;
                            } else {
                                j10 = this.f20318X.f20459d;
                                j11 = jM8652I;
                            }
                            this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                        }
                        m8654K();
                        m8690y(r11, this.f20318X.f20456a);
                        this.f20318X = this.f20318X.m8758c(r11);
                        if (!r11.m4833g()) {
                            this.f20330j0 = r14;
                        }
                        m8661R(false);
                        this.f20348y.mo6125l(2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zzxlVar4 = zzxlVar3;
                }
            }
            zzmu zzmuVar4 = this.f20318X;
            zzbf zzbfVar13 = zzmuVar4.f20456a;
            zzxl zzxlVar13 = zzmuVar4.f20457b;
            if (1 != r16) {
                j12 = j2;
            } else {
                j12 = jM8652I;
            }
            zzxlVar6 = zzxlVar4;
            m8651H(zzbfVar, zzxlVar6, zzbfVar13, zzxlVar13, j12, false);
            if (r36 == 0 || j4 != this.f20318X.f20458c) {
                if (z10) {
                    j14 = jM8652I;
                    j13 = j14;
                } else {
                    j13 = this.f20318X.f20459d;
                    j14 = jM8652I;
                }
                this.f20318X = m8658O(zzxlVar6, j14, j4, j13, z10, i11);
            }
            m8654K();
            m8690y(zzbfVar, this.f20318X.f20456a);
            this.f20318X = this.f20318X.m8758c(zzbfVar);
            if (!zzbfVar.m4833g()) {
                this.f20330j0 = r17;
            }
            m8661R(false);
            this.f20348y.mo6125l(2);
        }
        try {
            zzmh zzmhVar3 = this.f20303I;
            zzme zzmeVar2 = zzmhVar3.f20401i;
            long jM8652I2 = zzmeVar2 == null ? jM8652I : m8652I(zzmeVar2);
            if (m8666W()) {
                try {
                    zzme zzmeVar3 = zzmhVar3.f20402j;
                    if (zzmeVar3 != null) {
                        jM8652I = m8652I(zzmeVar3);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zzxlVar4 = zzxlVar3;
                    zzbfVar6 = zzbfVar;
                    r14 = 0;
                    r11 = zzbfVar6;
                    r13 = r8;
                    r35 = r12;
                    zzmu zzmuVar5 = this.f20318X;
                    zzbf zzbfVar14 = zzmuVar5.f20456a;
                    zzxl zzxlVar14 = zzmuVar5.f20457b;
                    if (1 != r13) {
                        j9 = j2;
                    } else {
                        j9 = jM8652I;
                    }
                    zzxlVar5 = zzxlVar4;
                    m8651H(r11, zzxlVar5, zzbfVar14, zzxlVar14, j9, false);
                    if (r35 == 0) {
                        if (z10) {
                            j11 = jM8652I;
                            j10 = j11;
                        } else {
                            j10 = this.f20318X.f20459d;
                            j11 = jM8652I;
                        }
                        this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                    } else {
                        if (z10) {
                            j11 = jM8652I;
                            j10 = j11;
                        } else {
                            j10 = this.f20318X.f20459d;
                            j11 = jM8652I;
                        }
                        this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                    }
                    m8654K();
                    m8690y(r11, this.f20318X.f20456a);
                    this.f20318X = this.f20318X.m8758c(r11);
                    if (!r11.m4833g()) {
                        this.f20330j0 = r14;
                    }
                    m8661R(false);
                    this.f20348y.mo6125l(2);
                    throw th;
                }
            }
            r15 = r8;
            z = r12;
            r12 = 0;
            try {
                int iM8708C = zzmhVar3.m8708C(zzbfVar, this.f20331k0, jM8652I2, jM8652I);
                if ((iM8708C & 1) != 0) {
                    m8675j(false);
                    r19 = r12;
                    r18 = r15;
                    r37 = z;
                } else if ((iM8708C & 2) != 0) {
                    r19 = r12;
                    r18 = r15;
                    r37 = z;
                    m8647D();
                    r19 = r12;
                    r18 = r15;
                    r37 = z;
                }
            } catch (Throwable th7) {
                th = th7;
                r8 = zzbfVar;
                z10 = z10;
                zzxlVar4 = zzxlVar3;
                i11 = i11;
                r11 = r8;
                r14 = r12;
                r13 = r15;
                r35 = z;
                zzmu zzmuVar6 = this.f20318X;
                zzbf zzbfVar15 = zzmuVar6.f20456a;
                zzxl zzxlVar15 = zzmuVar6.f20457b;
                if (1 != r13) {
                    j9 = j2;
                } else {
                    j9 = jM8652I;
                }
                zzxlVar5 = zzxlVar4;
                m8651H(r11, zzxlVar5, zzbfVar15, zzxlVar15, j9, false);
                if (r35 == 0 || j4 != this.f20318X.f20458c) {
                    if (z10) {
                        j11 = jM8652I;
                        j10 = j11;
                    } else {
                        j10 = this.f20318X.f20459d;
                        j11 = jM8652I;
                    }
                    this.f20318X = m8658O(zzxlVar5, j11, j4, j10, z10, i11);
                }
                m8654K();
                m8690y(r11, this.f20318X.f20456a);
                this.f20318X = this.f20318X.m8758c(r11);
                if (!r11.m4833g()) {
                    this.f20330j0 = r14;
                }
                m8661R(false);
                this.f20348y.mo6125l(2);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            r15 = r8;
            z = r12;
            r8 = zzbfVar;
            r12 = 0;
        }
        r19 = r12;
        r18 = r15;
        r37 = z;
        r19 = obj4;
        r18 = r110;
        r37 = r38;
        zzxlVar4 = zzxlVar3;
        r17 = r19;
        r16 = r18;
        r36 = r37;
        zzmu zzmuVar7 = this.f20318X;
        zzbf zzbfVar16 = zzmuVar7.f20456a;
        zzxl zzxlVar16 = zzmuVar7.f20457b;
        if (1 != r16) {
            j12 = j2;
        } else {
            j12 = jM8652I;
        }
        zzxlVar6 = zzxlVar4;
        m8651H(zzbfVar, zzxlVar6, zzbfVar16, zzxlVar16, j12, false);
        if (r36 == 0) {
            if (z10) {
                j14 = jM8652I;
                j13 = j14;
            } else {
                j13 = this.f20318X.f20459d;
                j14 = jM8652I;
            }
            this.f20318X = m8658O(zzxlVar6, j14, j4, j13, z10, i11);
        } else {
            if (z10) {
                j14 = jM8652I;
                j13 = j14;
            } else {
                j13 = this.f20318X.f20459d;
                j14 = jM8652I;
            }
            this.f20318X = m8658O(zzxlVar6, j14, j4, j13, z10, i11);
        }
        m8654K();
        m8690y(zzbfVar, this.f20318X.f20456a);
        this.f20318X = this.f20318X.m8758c(zzbfVar);
        if (!zzbfVar.m4833g()) {
            this.f20330j0 = r17;
        }
        m8661R(false);
        this.f20348y.mo6125l(2);
    }

    /* JADX INFO: renamed from: H */
    public final void m8651H(zzbf zzbfVar, zzxl zzxlVar, zzbf zzbfVar2, zzxl zzxlVar2, long j2, boolean z) {
        if (!m8681p(zzbfVar, zzxlVar)) {
            zzav zzavVar = zzxlVar.m9025b() ? zzav.f6969d : this.f20318X.f20470o;
            zzjk zzjkVar = this.f20299E;
            if (zzjkVar.zzj().equals(zzavVar)) {
                return;
            }
            this.f20348y.mo6115E(16);
            zzjkVar.mo8619i(zzavVar);
            m8655L(this.f20318X.f20470o, zzavVar.f6970a, false, false);
            return;
        }
        Object obj = zzxlVar.f21278a;
        zzbd zzbdVar = this.f20297C;
        int i2 = zzbfVar.mo4841o(obj, zzbdVar).f7634c;
        zzbe zzbeVar = this.f20296B;
        zzbfVar.mo4736b(i2, zzbeVar, 0L);
        zzaf zzafVar = zzbeVar.f7682h;
        String str = zzfm.f16091a;
        zzjf zzjfVar = this.f20344u0;
        zzjfVar.getClass();
        zzafVar.getClass();
        long jM6519u = zzfm.m6519u(-9223372036854775807L);
        zzjfVar.f20095c = jM6519u;
        zzjfVar.f20098f = jM6519u;
        zzjfVar.f20099g = jM6519u;
        zzjfVar.m8612c();
        if (j2 != -9223372036854775807L) {
            zzjfVar.f20096d = m8680o(zzbfVar, obj, j2);
            zzjfVar.m8612c();
            return;
        }
        if (!Objects.equals(!zzbfVar2.m4833g() ? zzbfVar2.mo4736b(zzbfVar2.mo4841o(zzxlVar2.f21278a, zzbdVar).f7634c, zzbeVar, 0L).f7675a : null, zzbeVar.f7675a) || z) {
            zzjfVar.f20096d = -9223372036854775807L;
            zzjfVar.m8612c();
        }
    }

    /* JADX INFO: renamed from: I */
    public final long m8652I(zzme zzmeVar) {
        if (zzmeVar == null) {
            return 0L;
        }
        long jMax = zzmeVar.f20381p;
        if (zzmeVar.f20370e) {
            for (int i2 = 0; i2 < 2; i2++) {
                zzng[] zzngVarArr = this.f20339s;
                if (zzngVarArr[i2].m8784m(zzmeVar) != null) {
                    zznc zzncVarM8784m = zzngVarArr[i2].m8784m(zzmeVar);
                    Objects.requireNonNull(zzncVarM8784m);
                    long jZzk = zzncVarM8784m.zzk();
                    if (jZzk == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(jZzk, jMax);
                }
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: J */
    public final void m8653J() {
        boolean z;
        zzmh zzmhVar = this.f20303I;
        zzmhVar.m8735z();
        zzme zzmeVar = zzmhVar.f20404l;
        if (zzmeVar != null) {
            zzxd zzxdVar = zzmeVar.f20366a;
            if ((!zzmeVar.f20369d || zzmeVar.f20370e) && !zzxdVar.mo9004a()) {
                zzbf zzbfVar = this.f20318X.f20456a;
                if (zzmeVar.f20370e) {
                    zzxdVar.zzb();
                }
                if (this.f20347x.zzj()) {
                    if (!zzmeVar.f20369d) {
                        long j2 = zzmeVar.f20372g.f20383b;
                        zzmeVar.f20369d = true;
                        zzxdVar.mo9011j(this, j2);
                        return;
                    }
                    zzmb zzmbVar = new zzmb();
                    zzmbVar.f20360a = this.f20331k0 - zzmeVar.f20381p;
                    float f2 = this.f20299E.zzj().f6970a;
                    zzgtr.m7128a(f2 > 0.0f || f2 == -3.4028235E38f);
                    zzmbVar.f20361b = f2;
                    long j3 = this.f20324d0;
                    if (j3 >= 0) {
                        z = true;
                    } else if (j3 == -9223372036854775807L) {
                        j3 = -9223372036854775807L;
                        z = true;
                    } else {
                        z = false;
                    }
                    zzgtr.m7128a(z);
                    zzmbVar.f20362c = j3;
                    zzmc zzmcVar = new zzmc(zzmbVar);
                    zzgtr.m7133f(zzmeVar.f20378m == null);
                    zzxdVar.mo9006i(zzmcVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m8654K() {
        zzme zzmeVar = this.f20303I.f20400h;
        boolean z = false;
        if (zzmeVar != null && zzmeVar.f20372g.f20388g && this.f20321a0) {
            z = true;
        }
        this.f20322b0 = z;
    }

    /* JADX INFO: renamed from: L */
    public final void m8655L(zzav zzavVar, float f2, boolean z, boolean z2) {
        int i2;
        if (z) {
            if (z2) {
                this.f20319Y.m8642a(1);
            }
            zzmu zzmuVar = this.f20318X;
            this.f20318X = new zzmu(zzmuVar.f20456a, zzmuVar.f20457b, zzmuVar.f20458c, zzmuVar.f20459d, zzmuVar.f20460e, zzmuVar.f20461f, zzmuVar.f20462g, zzmuVar.f20463h, zzmuVar.f20464i, zzmuVar.f20465j, zzmuVar.f20466k, zzmuVar.f20467l, zzmuVar.f20468m, zzmuVar.f20469n, zzavVar, zzmuVar.f20471p, zzmuVar.f20472q, zzmuVar.f20473r, zzmuVar.f20474s);
        }
        float f3 = zzavVar.f6970a;
        zzme zzmeVar = this.f20303I.f20400h;
        while (true) {
            i2 = 0;
            if (zzmeVar == null) {
                break;
            }
            zzabb[] zzabbVarArr = zzmeVar.f20380o.f4846c;
            int length = zzabbVarArr.length;
            while (i2 < length) {
                zzabb zzabbVar = zzabbVarArr[i2];
                i2++;
            }
            zzmeVar = zzmeVar.f20378m;
        }
        zzng[] zzngVarArr = this.f20339s;
        while (i2 < 2) {
            zzng zzngVar = zzngVarArr[i2];
            zzngVar.f20495a.mo4000X(f2, f3);
            zznc zzncVar = zzngVar.f20497c;
            if (zzncVar != null) {
                zzncVar.mo4000X(f2, f3);
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX INFO: renamed from: M */
    public final void m8656M() {
        long j2;
        long j3;
        boolean zMo5528h;
        boolean z;
        zzmh zzmhVar = this.f20303I;
        long j4 = -9223372036854775807L;
        if (m8644B(zzmhVar.f20403k)) {
            zzme zzmeVar = zzmhVar.f20403k;
            long jM8662S = m8662S(!zzmeVar.f20370e ? 0L : zzmeVar.f20366a.zzc());
            if (zzmeVar == zzmhVar.f20400h) {
                j2 = this.f20331k0;
                j3 = zzmeVar.f20381p;
            } else {
                j2 = this.f20331k0 - zzmeVar.f20381p;
                j3 = zzmeVar.f20372g.f20383b;
            }
            long j5 = j2 - j3;
            long j6 = m8681p(this.f20318X.f20456a, zzmeVar.f20372g.f20382a) ? this.f20344u0.f20100h : -9223372036854775807L;
            zzqh zzqhVar = this.f20306L;
            zzbf zzbfVar = this.f20318X.f20456a;
            zzxl zzxlVar = zzmeVar.f20372g.f20382a;
            float f2 = this.f20299E.zzj().f6970a;
            boolean z2 = this.f20318X.f20467l;
            zzlz zzlzVar = new zzlz(zzqhVar, zzbfVar, zzxlVar, j5, jM8662S, f2, this.f20323c0, j6);
            zzma zzmaVar = this.f20347x;
            zMo5528h = zzmaVar.mo5528h(zzlzVar);
            zzme zzmeVar2 = zzmhVar.f20400h;
            if (!zMo5528h && zzmeVar2.f20370e && jM8662S < 500000 && this.f20298D > 0) {
                zzmeVar2.f20366a.mo9014m(this.f20318X.f20473r);
                zMo5528h = zzmaVar.mo5528h(zzlzVar);
            }
        } else {
            zMo5528h = false;
        }
        this.f20325e0 = zMo5528h;
        if (zMo5528h) {
            zzme zzmeVar3 = zzmhVar.f20403k;
            zzmeVar3.getClass();
            zzmb zzmbVar = new zzmb();
            zzmbVar.f20360a = this.f20331k0 - zzmeVar3.f20381p;
            float f3 = this.f20299E.zzj().f6970a;
            zzgtr.m7128a(f3 > 0.0f || f3 == -3.4028235E38f);
            zzmbVar.f20361b = f3;
            long j7 = this.f20324d0;
            if (j7 < 0) {
                if (j7 != -9223372036854775807L) {
                    z = false;
                    j4 = j7;
                }
                zzgtr.m7128a(z);
                zzmbVar.f20362c = j4;
                zzmc zzmcVar = new zzmc(zzmbVar);
                zzgtr.m7133f(zzmeVar3.f20378m == null);
                zzmeVar3.f20366a.mo9006i(zzmcVar);
            } else {
                j4 = j7;
            }
            z = true;
            zzgtr.m7128a(z);
            zzmbVar.f20362c = j4;
            zzmc zzmcVar2 = new zzmc(zzmbVar);
            zzgtr.m7133f(zzmeVar3.f20378m == null);
            zzmeVar3.f20366a.mo9006i(zzmcVar2);
        }
        m8657N();
    }

    /* JADX INFO: renamed from: N */
    public final void m8657N() {
        zzme zzmeVar = this.f20303I.f20403k;
        boolean z = true;
        if (!this.f20325e0 && (zzmeVar == null || !zzmeVar.f20366a.mo9004a())) {
            z = false;
        }
        zzmu zzmuVar = this.f20318X;
        if (z != zzmuVar.f20462g) {
            this.f20318X = zzmuVar.m8761f(z);
        }
    }

    /* JADX INFO: renamed from: O */
    public final zzmu m8658O(zzxl zzxlVar, long j2, long j3, long j4, boolean z, int i2) {
        zzzo zzzoVar;
        zzabj zzabjVar;
        List list;
        zzgwt zzgwtVarM7214f;
        this.f20334n0 = (!this.f20334n0 && j2 == this.f20318X.f20473r && zzxlVar.equals(this.f20318X.f20457b)) ? false : true;
        m8654K();
        zzmu zzmuVar = this.f20318X;
        zzzo zzzoVar2 = zzmuVar.f20463h;
        zzabj zzabjVar2 = zzmuVar.f20464i;
        List list2 = zzmuVar.f20465j;
        if (this.f20304J.f20453k) {
            zzmh zzmhVar = this.f20303I;
            zzme zzmeVar = zzmhVar.f20400h;
            zzzo zzzoVar3 = zzmeVar == null ? zzzo.f21490d : zzmeVar.f20379n;
            zzabj zzabjVar3 = zzmeVar == null ? this.f20346w : zzmeVar.f20380o;
            zzabb[] zzabbVarArr = zzabjVar3.f4846c;
            zzgwq zzgwqVar = new zzgwq();
            boolean z2 = false;
            for (zzabb zzabbVar : zzabbVarArr) {
                if (zzabbVar != null) {
                    zzap zzapVar = zzabbVar.mo3919b(0).f21058l;
                    if (zzapVar == null) {
                        zzgwqVar.m7203c(new zzap(new zzao[0]));
                    } else {
                        zzgwqVar.m7203c(zzapVar);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                zzgwtVarM7214f = zzgwqVar.m7214f();
            } else {
                zzgzi zzgziVar = zzgwt.f18303t;
                zzgwtVarM7214f = zzgyo.f18355w;
            }
            if (zzmeVar != null) {
                zzmf zzmfVar = zzmeVar.f20372g;
                long j5 = zzmfVar.f20385d;
                if (j5 != j3) {
                    if (j3 != j5) {
                        zzmfVar = new zzmf(zzmfVar.f20382a, zzmfVar.f20383b, zzmfVar.f20384c, j3, zzmfVar.f20386e, zzmfVar.f20387f, zzmfVar.f20388g, zzmfVar.f20389h);
                    }
                    zzmeVar.f20372g = zzmfVar;
                }
            }
            zzme zzmeVar2 = zzmhVar.f20400h;
            if (zzmeVar2 == zzmhVar.f20401i && zzmeVar2 != null) {
                zzabj zzabjVar4 = zzmeVar2.f20380o;
                int i3 = 0;
                while (true) {
                    zzng[] zzngVarArr = this.f20339s;
                    if (i3 >= 2) {
                        break;
                    }
                    if (zzabjVar4.m3924a(i3)) {
                        if (zzngVarArr[i3].f20495a.zza() != 1) {
                            break;
                        }
                        zzabjVar4.f4845b[i3].getClass();
                    }
                    i3++;
                }
            }
            zzzoVar = zzzoVar3;
            zzabjVar = zzabjVar3;
            list = zzgwtVarM7214f;
        } else {
            if (!zzxlVar.equals(zzmuVar.f20457b)) {
                zzabjVar2 = this.f20346w;
                zzzoVar2 = zzzo.f21490d;
                list2 = zzgyo.f18355w;
            }
            zzzoVar = zzzoVar2;
            zzabjVar = zzabjVar2;
            list = list2;
        }
        if (z) {
            zzlt zzltVar = this.f20319Y;
            if (!zzltVar.f20288d || zzltVar.f20289e == 5) {
                zzltVar.f20285a = true;
                zzltVar.f20288d = true;
                zzltVar.f20289e = i2;
            } else {
                zzgtr.m7128a(i2 == 5);
            }
        }
        zzmu zzmuVar2 = this.f20318X;
        return zzmuVar2.m8757b(zzxlVar, j2, j3, j4, m8662S(zzmuVar2.f20471p), zzzoVar, zzabjVar, list);
    }

    /* JADX INFO: renamed from: P */
    public final void m8659P(boolean[] zArr, long j2) throws zzjm {
        zzng[] zzngVarArr;
        long j3;
        zzme zzmeVar = this.f20303I.f20401i;
        zzabj zzabjVar = zzmeVar.f20380o;
        int i2 = 0;
        while (true) {
            zzngVarArr = this.f20339s;
            if (i2 >= 2) {
                break;
            }
            if (!zzabjVar.m3924a(i2)) {
                zzngVarArr[i2].m8774b();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < 2) {
            if (zzabjVar.m3924a(i3) && zzngVarArr[i3].m8784m(zzmeVar) == null) {
                j3 = j2;
                m8660Q(zzmeVar, i3, zArr[i3], j3);
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m8660Q(zzme zzmeVar, int i2, boolean z, long j2) throws zzjm {
        zzng zzngVar = this.f20339s[i2];
        if (zzngVar.m8779g()) {
            return;
        }
        boolean z2 = zzmeVar == this.f20303I.f20400h;
        zzabj zzabjVar = zzmeVar.f20380o;
        zznf zznfVar = zzabjVar.f4845b[i2];
        zzabb zzabbVar = zzabjVar.f4846c[i2];
        boolean z3 = m8664U() && this.f20318X.f20460e == 3;
        boolean z4 = !z && z3;
        this.f20329i0++;
        zzzd zzzdVar = zzmeVar.f20368c[i2];
        long j3 = zzmeVar.f20381p;
        zzxl zzxlVar = zzmeVar.f20372g.f20382a;
        int iMo3918a = zzabbVar != null ? zzabbVar.mo3918a() : 0;
        zzv[] zzvVarArr = new zzv[iMo3918a];
        for (int i3 = 0; i3 < iMo3918a; i3++) {
            zzabbVar.getClass();
            zzvVarArr[i3] = zzabbVar.mo3919b(i3);
        }
        int i4 = zzngVar.f20498d;
        zzjk zzjkVar = this.f20299E;
        if (i4 == 0 || i4 == 2 || i4 == 4) {
            zzngVar.f20499e = true;
            zznc zzncVar = zzngVar.f20495a;
            zzncVar.mo8583T(zznfVar, zzvVarArr, zzzdVar, z4, z2, j2, j3, zzxlVar);
            zzjkVar.m8617a(zzncVar);
        } else {
            zzngVar.f20500f = true;
            zznc zzncVar2 = zzngVar.f20497c;
            zzncVar2.getClass();
            zzncVar2.mo8583T(zznfVar, zzvVarArr, zzzdVar, z4, z2, j2, j3, zzxlVar);
            zzjkVar.m8617a(zzncVar2);
        }
        zzlk zzlkVar = new zzlk(this);
        zznc zzncVarM8784m = zzngVar.m8784m(zzmeVar);
        zzncVarM8784m.getClass();
        zzncVarM8784m.mo4007j(11, zzlkVar);
        if (z3 && z2) {
            zzngVar.m8772B();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m8661R(boolean z) {
        zzme zzmeVar = this.f20303I.f20403k;
        zzxl zzxlVar = zzmeVar == null ? this.f20318X.f20457b : zzmeVar.f20372g.f20382a;
        boolean zEquals = this.f20318X.f20466k.equals(zzxlVar);
        if (!zEquals) {
            this.f20318X = this.f20318X.m8762g(zzxlVar);
        }
        zzmu zzmuVar = this.f20318X;
        zzmuVar.f20471p = zzmeVar == null ? zzmuVar.f20473r : zzmeVar.m8695d();
        zzmu zzmuVar2 = this.f20318X;
        zzmuVar2.f20472q = m8662S(zzmuVar2.f20471p);
        if ((!zEquals || z) && zzmeVar != null && zzmeVar.f20370e) {
            m8663T(zzmeVar.f20372g.f20382a, zzmeVar.f20379n, zzmeVar.f20380o);
        }
    }

    /* JADX INFO: renamed from: S */
    public final long m8662S(long j2) {
        zzme zzmeVar = this.f20303I.f20403k;
        if (zzmeVar == null) {
            return 0L;
        }
        return Math.max(0L, j2 - (this.f20331k0 - zzmeVar.f20381p));
    }

    /* JADX INFO: renamed from: T */
    public final void m8663T(zzxl zzxlVar, zzzo zzzoVar, zzabj zzabjVar) {
        long j2;
        long j3;
        zzmh zzmhVar = this.f20303I;
        zzme zzmeVar = zzmhVar.f20403k;
        zzmeVar.getClass();
        if (zzmeVar == zzmhVar.f20400h) {
            j2 = this.f20331k0;
            j3 = zzmeVar.f20381p;
        } else {
            j2 = this.f20331k0 - zzmeVar.f20381p;
            j3 = zzmeVar.f20372g.f20383b;
        }
        long j4 = j2 - j3;
        long jM8662S = m8662S(zzmeVar.m8695d());
        long j5 = m8681p(this.f20318X.f20456a, zzmeVar.f20372g.f20382a) ? this.f20344u0.f20100h : -9223372036854775807L;
        zzbf zzbfVar = this.f20318X.f20456a;
        float f2 = this.f20299E.zzj().f6970a;
        boolean z = this.f20318X.f20467l;
        this.f20347x.mo5525e(new zzlz(this.f20306L, zzbfVar, zzxlVar, j4, jM8662S, f2, this.f20323c0, j5), zzabjVar.f4846c);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m8664U() {
        zzmu zzmuVar = this.f20318X;
        return zzmuVar.f20467l && zzmuVar.f20469n == 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m8665V(int i2) {
        zzng zzngVar = this.f20339s[i2];
        try {
            zzme zzmeVar = this.f20303I.f20400h;
            if (zzmeVar == null) {
                throw null;
            }
            zznc zzncVarM8784m = zzngVar.m8784m(zzmeVar);
            zzncVarM8784m.getClass();
            zzncVarM8784m.mo8594g();
        } catch (IOException | RuntimeException e) {
            zzngVar.f20495a.getClass();
            throw e;
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m8666W() {
        if (!this.f20310P) {
            return false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f20339s[i2].m8787p()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    /* JADX INFO: renamed from: a */
    public final void mo8667a(zzmy zzmyVar) {
        if (!this.f20320Z && this.f20295A.getThread().isAlive()) {
            ((zzfg) this.f20348y.mo6124i(14, zzmyVar)).m6435a();
        } else {
            zzeh.m6211c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmyVar.m8766a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    /* JADX INFO: renamed from: b */
    public final void mo3949b(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.f20315U) {
            ((zzfg) this.f20348y.mo6114A(37)).m6435a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzze
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8668c(zzzf zzzfVar) {
        ((zzfg) this.f20348y.mo6124i(9, (zzxj) zzzfVar)).m6435a();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    /* JADX INFO: renamed from: d */
    public final void mo8669d(zzxj zzxjVar) {
        ((zzfg) this.f20348y.mo6124i(8, zzxjVar)).m6435a();
    }

    /* JADX INFO: renamed from: e */
    public final void m8670e(IOException iOException, int i2) {
        zzjm zzjmVar = new zzjm(0, iOException, i2);
        zzme zzmeVar = this.f20303I.f20400h;
        if (zzmeVar != null) {
            zzjmVar = zzjmVar.m8620a(zzmeVar.f20372g.f20382a);
        }
        zzeh.m6214f("ExoPlayerImplInternal", "Playback error", zzjmVar);
        m8687v(false, false);
        this.f20318X = this.f20318X.m8760e(zzjmVar);
    }

    /* JADX INFO: renamed from: f */
    public final void m8671f(int i2) {
        zzmu zzmuVar = this.f20318X;
        if (zzmuVar.f20460e != i2) {
            if (i2 != 2) {
                this.f20336p0 = -9223372036854775807L;
            }
            this.f20318X = zzmuVar.m8759d(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8672g(int i2) {
        zzlt zzltVar = this.f20319Y;
        zzmu zzmuVar = this.f20318X;
        boolean z = zzltVar.f20285a | (zzltVar.f20286b != zzmuVar);
        zzltVar.f20285a = z;
        zzltVar.f20286b = zzmuVar;
        if (z) {
            if (!zzmuVar.f20456a.m4833g()) {
                zzmu zzmuVar2 = this.f20318X;
                boolean z2 = zzmuVar2.f20456a.mo4739e(zzmuVar2.f20457b.f21278a) != -1;
                Locale locale = Locale.US;
                zzmu zzmuVar3 = this.f20318X;
                zzgtr.m7134g(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", zzmuVar3.f20457b.f21278a, zzmuVar3.f20456a.getClass().getName(), Integer.valueOf(this.f20318X.f20456a.mo4735a()), Integer.valueOf(i2)), z2);
            }
            ((zzkg) this.f20302H).m8623a(this.f20319Y);
            this.f20319Y = new zzlt(this.f20318X);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8673h(float f2) {
        this.f20342t0 = f2;
        float f3 = f2 * this.f20311Q.f9753g;
        for (int i2 = 0; i2 < 2; i2++) {
            zzng zzngVar = this.f20339s[i2];
            zznc zzncVar = zzngVar.f20495a;
            if (zzncVar.zza() == 1) {
                Float fValueOf = Float.valueOf(f3);
                zzncVar.mo4007j(2, fValueOf);
                zznc zzncVar2 = zzngVar.f20497c;
                if (zzncVar2 != null) {
                    zzncVar2.mo4007j(2, fValueOf);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:328:0x067d  */
    /* JADX WARN: Code duplicated, block: B:418:0x07f2 A[Catch: IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, RuntimeException -> 0x0956, zzjm -> 0x095a, TRY_ENTER, TRY_LEAVE, TryCatch #47 {zzjm -> 0x095a, RuntimeException -> 0x0956, blocks: (B:431:0x0812, B:456:0x087f, B:459:0x088c, B:461:0x0890, B:463:0x0896, B:465:0x089c, B:467:0x08a6, B:473:0x08b1, B:475:0x08b9, B:486:0x08e8, B:414:0x07e8, B:418:0x07f2), top: B:773:0x07e8 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x07f7 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TRY_ENTER, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:423:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:424:0x0802  */
    /* JADX WARN: Code duplicated, block: B:426:0x0805 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:427:0x0806 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:441:0x0832 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, LOOP:11: B:439:0x082e->B:441:0x0832, LOOP_END, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0854  */
    /* JADX WARN: Code duplicated, block: B:445:0x0857 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:447:0x085d A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:449:0x0865  */
    /* JADX WARN: Code duplicated, block: B:450:0x0868  */
    /* JADX WARN: Code duplicated, block: B:452:0x086b A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:494:0x0924 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, LOOP:14: B:493:0x0922->B:494:0x0924, LOOP_END, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:497:0x0932 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:501:0x0942 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:503:0x0948 A[Catch: RuntimeException -> 0x054c, IOException -> 0x054e, zzwn -> 0x0550, zzhs -> 0x0552, zzat -> 0x0554, zzui -> 0x0556, zzjm -> 0x0558, TryCatch #44 {zzjm -> 0x0558, RuntimeException -> 0x054c, blocks: (B:241:0x0514, B:243:0x051e, B:245:0x0526, B:270:0x056b, B:272:0x0571, B:273:0x0576, B:267:0x055a, B:269:0x055e, B:276:0x057d, B:281:0x0590, B:283:0x0594, B:285:0x0598, B:287:0x059e, B:289:0x05a4, B:291:0x05aa, B:293:0x05b0, B:295:0x05b8, B:297:0x05da, B:299:0x05e4, B:300:0x05e9, B:302:0x05ed, B:304:0x05f3, B:306:0x05fb, B:308:0x0603, B:310:0x0622, B:311:0x0628, B:313:0x0636, B:315:0x0644, B:433:0x0818, B:435:0x081e, B:438:0x0823, B:439:0x082e, B:441:0x0832, B:445:0x0857, B:447:0x085d, B:452:0x086b, B:453:0x0873, B:454:0x0876, B:512:0x0961, B:521:0x0979, B:533:0x09b5, B:471:0x08ad, B:477:0x08cb, B:479:0x08d4, B:481:0x08dc, B:488:0x0907, B:490:0x0919, B:492:0x091f, B:494:0x0924, B:495:0x092c, B:497:0x0932, B:498:0x0935, B:499:0x093e, B:501:0x0942, B:503:0x0948, B:504:0x094d, B:511:0x0960, B:334:0x0691, B:339:0x06a2, B:343:0x06b4, B:348:0x06ca, B:359:0x072c, B:370:0x0748, B:372:0x074e, B:374:0x076d, B:384:0x0785, B:386:0x078b, B:387:0x0793, B:389:0x0799, B:377:0x0776, B:393:0x07ab, B:416:0x07ee, B:421:0x07f7, B:427:0x0806, B:429:0x080c), top: B:777:0x0514 }] */
    /* JADX WARN: Code duplicated, block: B:815:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:830:0x094d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r40v0, types: [com.google.android.gms.internal.ads.zzlw, com.google.android.gms.internal.ads.zzxi] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:457:0x0883
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r41) {
        /*
            Method dump skipped, instruction units count: 3542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.handleMessage(android.os.Message):boolean");
    }

    /* JADX INFO: renamed from: i */
    public final void m8674i(int i2, int i3, int i4, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i2 != -1) {
            z2 = true;
        } else {
            i2 = -1;
            z2 = false;
        }
        if (i2 == -1) {
            i4 = 2;
        } else if (i4 == 2) {
            i4 = 1;
        }
        boolean z3 = this.f20314T;
        if (i2 == 0) {
            i3 = 1;
        } else if (i3 == 1) {
            i3 = z3 ? 4 : 0;
        }
        zzmu zzmuVar = this.f20318X;
        if (zzmuVar.f20467l == z2 && zzmuVar.f20469n == i3 && zzmuVar.f20468m == i4) {
            return;
        }
        this.f20318X = zzmuVar.m8763h(i4, i3, z2);
        m8691z(false, false);
        zzmh zzmhVar = this.f20303I;
        for (zzme zzmeVar = zzmhVar.f20400h; zzmeVar != null; zzmeVar = zzmeVar.f20378m) {
            for (zzabb zzabbVar : zzmeVar.f20380o.f4846c) {
            }
        }
        if (!m8664U()) {
            m8677l();
            m8678m();
            this.f20318X.getClass();
            zzmhVar.m8723n(this.f20331k0);
            return;
        }
        int i5 = this.f20318X.f20460e;
        zzea zzeaVar = this.f20348y;
        if (i5 != 3) {
            if (i5 == 2) {
                zzeaVar.mo6125l(2);
                return;
            }
            return;
        }
        zzjk zzjkVar = this.f20299E;
        zzjkVar.f20133x = true;
        zznn zznnVar = zzjkVar.f20128s;
        if (!zznnVar.f20510s) {
            zznnVar.f20512u = SystemClock.elapsedRealtime();
            zznnVar.f20510s = true;
        }
        m8676k();
        zzeaVar.mo6125l(2);
    }

    /* JADX INFO: renamed from: j */
    public final void m8675j(boolean z) throws zzjm {
        zzxl zzxlVar = this.f20303I.f20400h.f20372g.f20382a;
        long jM8684s = m8684s(zzxlVar, this.f20318X.f20473r, true, false);
        if (jM8684s != this.f20318X.f20473r) {
            zzmu zzmuVar = this.f20318X;
            this.f20318X = m8658O(zzxlVar, jM8684s, zzmuVar.f20458c, zzmuVar.f20459d, z, 5);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8676k() {
        zzme zzmeVar = this.f20303I.f20400h;
        if (zzmeVar == null) {
            return;
        }
        zzabj zzabjVar = zzmeVar.f20380o;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzabjVar.m3924a(i2)) {
                this.f20339s[i2].m8772B();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8677l() {
        zzjk zzjkVar = this.f20299E;
        zzjkVar.f20133x = false;
        zznn zznnVar = zzjkVar.f20128s;
        if (zznnVar.f20510s) {
            zznnVar.m8800a(zznnVar.mo8618c());
            zznnVar.f20510s = false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            zzng zzngVar = this.f20339s[i2];
            zznc zzncVar = zzngVar.f20495a;
            if (zzng.m8770l(zzncVar) && zzncVar.mo8587a() == 2) {
                zzncVar.mo8593f();
            }
            zznc zzncVar2 = zzngVar.f20497c;
            if (zzncVar2 != null && zzncVar2.mo8587a() != 0 && zzncVar2.mo8587a() == 2) {
                zzncVar2.mo8593f();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m8678m() {
        long j2;
        char c;
        long j3;
        zzav zzavVarZzj;
        long j4;
        float f2;
        long jMax;
        zzmh zzmhVar = this.f20303I;
        zzme zzmeVar = zzmhVar.f20400h;
        if (zzmeVar == null) {
            return;
        }
        long jMo9015n = zzmeVar.f20370e ? zzmeVar.f20366a.mo9015n() : -9223372036854775807L;
        if (jMo9015n != -9223372036854775807L) {
            if (!zzmeVar.m8693b()) {
                zzmhVar.m8734y(zzmeVar);
                m8661R(false);
                m8656M();
            }
            m8685t(true, jMo9015n);
            if (jMo9015n != this.f20318X.f20473r) {
                zzmu zzmuVar = this.f20318X;
                c = 0;
                j2 = -9223372036854775807L;
                this.f20318X = m8658O(zzmuVar.f20457b, jMo9015n, zzmuVar.f20458c, jMo9015n, true, 5);
                j3 = 0;
            } else {
                j2 = -9223372036854775807L;
                j3 = 0;
                c = 0;
            }
        } else {
            j2 = -9223372036854775807L;
            char c2 = 0;
            zzjk zzjkVar = this.f20299E;
            boolean z = zzmeVar != zzmhVar.f20401i;
            zznn zznnVar = zzjkVar.f20128s;
            zznc zzncVar = zzjkVar.f20130u;
            if (zzncVar == null || zzncVar.mo3982G() || ((z && zzjkVar.f20130u.mo8587a() != 2) || (!zzjkVar.f20130u.mo3994Q() && (z || zzjkVar.f20130u.mo8590c0())))) {
                zzjkVar.f20132w = true;
                if (zzjkVar.f20133x && !zznnVar.f20510s) {
                    zznnVar.f20512u = SystemClock.elapsedRealtime();
                    zznnVar.f20510s = true;
                }
            } else {
                zzmd zzmdVar = zzjkVar.f20131v;
                zzmdVar.getClass();
                long jMo8618c = zzmdVar.mo8618c();
                if (!zzjkVar.f20132w) {
                    zznnVar.m8800a(jMo8618c);
                    zzavVarZzj = zzmdVar.zzj();
                    if (!zzavVarZzj.equals(zznnVar.f20513v)) {
                        zznnVar.mo8619i(zzavVarZzj);
                        ((zzfg) ((zzlw) zzjkVar.f20129t).f20348y.mo6124i(16, zzavVarZzj)).m6435a();
                    }
                } else if (jMo8618c >= zznnVar.mo8618c()) {
                    zzjkVar.f20132w = false;
                    if (zzjkVar.f20133x && !zznnVar.f20510s) {
                        zznnVar.f20512u = SystemClock.elapsedRealtime();
                        zznnVar.f20510s = true;
                    }
                    zznnVar.m8800a(jMo8618c);
                    zzavVarZzj = zzmdVar.zzj();
                    if (!zzavVarZzj.equals(zznnVar.f20513v)) {
                        zznnVar.mo8619i(zzavVarZzj);
                        ((zzfg) ((zzlw) zzjkVar.f20129t).f20348y.mo6124i(16, zzavVarZzj)).m6435a();
                    }
                } else if (zznnVar.f20510s) {
                    zznnVar.m8800a(zznnVar.mo8618c());
                    zznnVar.f20510s = false;
                }
            }
            long jMo8618c2 = zzjkVar.mo8618c();
            this.f20331k0 = jMo8618c2;
            long j5 = jMo8618c2 - zzmeVar.f20381p;
            long j6 = this.f20318X.f20473r;
            ArrayList arrayList = this.f20300F;
            if (arrayList.isEmpty() || this.f20318X.f20457b.m9025b()) {
                c = 0;
                j3 = 0;
            } else {
                if (this.f20334n0) {
                    j6--;
                    this.f20334n0 = false;
                }
                zzmu zzmuVar2 = this.f20318X;
                int iMo4739e = zzmuVar2.f20456a.mo4739e(zzmuVar2.f20457b.f21278a);
                int iMin = Math.min(this.f20333m0, arrayList.size());
                zzls zzlsVar = iMin > 0 ? (zzls) arrayList.get(iMin - 1) : null;
                while (true) {
                    if (zzlsVar != null) {
                        if (iMo4739e < 0) {
                            c = c2;
                        } else if (iMo4739e == 0) {
                            c = c2;
                            j3 = 0;
                            if (j6 >= 0) {
                                break;
                            }
                        }
                        int i2 = iMin - 1;
                        zzlsVar = i2 > 0 ? (zzls) arrayList.get(iMin - 2) : null;
                        iMin = i2;
                        c2 = c;
                    }
                    c = c2;
                    j3 = 0;
                    break;
                }
                if (iMin < arrayList.size()) {
                }
                this.f20333m0 = iMin;
            }
            if (zzjkVar.zzh()) {
                boolean z2 = !this.f20319Y.f20288d;
                zzmu zzmuVar3 = this.f20318X;
                this.f20318X = m8658O(zzmuVar3.f20457b, j5, zzmuVar3.f20458c, j5, z2, 6);
            } else {
                zzmu zzmuVar4 = this.f20318X;
                zzmuVar4.f20473r = j5;
                zzmuVar4.f20474s = SystemClock.elapsedRealtime();
            }
        }
        this.f20318X.f20471p = zzmhVar.f20403k.m8695d();
        zzmu zzmuVar5 = this.f20318X;
        zzmuVar5.f20472q = m8662S(zzmuVar5.f20471p);
        zzmu zzmuVar6 = this.f20318X;
        if (zzmuVar6.f20467l && zzmuVar6.f20460e == 3 && m8681p(zzmuVar6.f20456a, zzmuVar6.f20457b)) {
            zzmu zzmuVar7 = this.f20318X;
            float fMax = 1.0f;
            if (zzmuVar7.f20470o.f6970a == 1.0f) {
                zzjf zzjfVar = this.f20344u0;
                long jM8680o = m8680o(zzmuVar7.f20456a, zzmuVar7.f20457b.f21278a, zzmuVar7.f20473r);
                long j7 = this.f20318X.f20472q;
                if (zzjfVar.f20095c != j2) {
                    long j8 = jM8680o - j7;
                    long j9 = zzjfVar.f20103k;
                    if (j9 == j2) {
                        zzjfVar.f20103k = j8;
                        zzjfVar.f20104l = j3;
                    } else {
                        long jMax2 = Math.max(j8, (long) ((j8 * 9.999871E-4f) + (j9 * 0.999f)));
                        zzjfVar.f20103k = jMax2;
                        zzjfVar.f20104l = (long) ((Math.abs(j8 - jMax2) * 9.999871E-4f) + (zzjfVar.f20104l * 0.999f));
                    }
                    if (zzjfVar.f20102j == j2 || SystemClock.elapsedRealtime() - zzjfVar.f20102j >= 1000) {
                        zzjfVar.f20102j = SystemClock.elapsedRealtime();
                        long j10 = (zzjfVar.f20104l * 3) + zzjfVar.f20103k;
                        if (zzjfVar.f20100h > j10) {
                            long jM6519u = zzfm.m6519u(1000L);
                            float f3 = zzjfVar.f20101i - 1.0f;
                            f2 = 1.0E-7f;
                            long j11 = zzjfVar.f20097e;
                            float f4 = jM6519u;
                            j4 = jM8680o;
                            long j12 = zzjfVar.f20100h - (((long) (f3 * f4)) + ((long) (0.029999971f * f4)));
                            long[] jArr = new long[3];
                            jArr[c] = j10;
                            jArr[1] = j11;
                            jArr[2] = j12;
                            jMax = jArr[c];
                            for (int i3 = 1; i3 < 3; i3++) {
                                long j13 = jArr[i3];
                                if (j13 > jMax) {
                                    jMax = j13;
                                }
                            }
                            zzjfVar.f20100h = jMax;
                        } else {
                            j4 = jM8680o;
                            f2 = 1.0E-7f;
                            long jMax3 = j4 - ((long) (Math.max(0.0f, zzjfVar.f20101i - 1.0f) / 1.0E-7f));
                            long j14 = zzjfVar.f20100h;
                            String str = zzfm.f16091a;
                            jMax = Math.max(j14, Math.min(jMax3, j10));
                            zzjfVar.f20100h = jMax;
                            long j15 = zzjfVar.f20099g;
                            if (j15 != j2 && jMax > j15) {
                                zzjfVar.f20100h = j15;
                                jMax = j15;
                            }
                        }
                        long j16 = j4 - jMax;
                        if (Math.abs(j16) < zzjfVar.f20093a) {
                            zzjfVar.f20101i = 1.0f;
                            fMax = 1.0f;
                        } else {
                            fMax = Math.max(0.97f, Math.min((j16 * f2) + 1.0f, 1.03f));
                            zzjfVar.f20101i = fMax;
                        }
                    } else {
                        fMax = zzjfVar.f20101i;
                    }
                }
                zzjk zzjkVar2 = this.f20299E;
                if (zzjkVar2.zzj().f6970a != fMax) {
                    zzav zzavVar = new zzav(fMax, this.f20318X.f20470o.f6971b);
                    this.f20348y.mo6115E(16);
                    this.f20299E.mo8619i(zzavVar);
                    boolean z3 = c;
                    m8655L(this.f20318X.f20470o, zzjkVar2.zzj().f6970a, z3, z3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8679n(final int i2, final boolean z) {
        boolean[] zArr = this.f20343u;
        if (zArr[i2] != z) {
            zArr[i2] = z;
            this.f20309O.mo6122g(new Runnable(i2, z) { // from class: com.google.android.gms.internal.ads.zzlm

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ int f20277t;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = this.f20277t;
                    zzlw zzlwVar = this.f20276s;
                    zzlwVar.f20339s[i3].f20495a.getClass();
                    zzlwVar.f20308N.mo8803t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final long m8680o(zzbf zzbfVar, Object obj, long j2) {
        int i2 = zzbfVar.mo4841o(obj, this.f20297C).f7634c;
        zzbe zzbeVar = this.f20296B;
        zzbfVar.mo4736b(i2, zzbeVar, 0L);
        if (zzbeVar.f7678d == -9223372036854775807L || !zzbeVar.m4777b() || !zzbeVar.f7681g) {
            return -9223372036854775807L;
        }
        long j3 = zzbeVar.f7679e;
        String str = zzfm.f16091a;
        return zzfm.m6519u((j3 == -9223372036854775807L ? System.currentTimeMillis() : j3 + SystemClock.elapsedRealtime()) - zzbeVar.f7678d) - j2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8681p(zzbf zzbfVar, zzxl zzxlVar) {
        if (zzxlVar.m9025b() || zzbfVar.m4833g()) {
            return false;
        }
        int i2 = zzbfVar.mo4841o(zzxlVar.f21278a, this.f20297C).f7634c;
        zzbe zzbeVar = this.f20296B;
        zzbfVar.mo4736b(i2, zzbeVar, 0L);
        return zzbeVar.m4777b() && zzbeVar.f7681g && zzbeVar.f7678d != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX INFO: renamed from: q */
    public final void m8682q(long j2) {
        int i2;
        zzme zzmeVar;
        zzme zzmeVar2;
        long j3;
        long j4;
        zznc zzncVar;
        long jMin;
        zznc zzncVar2;
        boolean z = this.f20307M;
        long jMin2 = 1000;
        long j5 = f20293v0;
        if (z) {
            jMin2 = this.f20318X.f20460e != 3 ? j5 : 1000L;
            for (i2 = 0; i2 < 2; i2++) {
                zzng zzngVar = this.f20339s[i2];
                j3 = this.f20331k0;
                j4 = this.f20332l0;
                zzncVar = zzngVar.f20495a;
                if (zzng.m8770l(zzncVar)) {
                    jMin = zzncVar.mo8767U(j3, j4);
                } else {
                    jMin = LocationRequestCompat.PASSIVE_INTERVAL;
                }
                zzncVar2 = zzngVar.f20497c;
                if (zzncVar2 == null && zzncVar2.mo8587a() != 0) {
                    jMin = Math.min(jMin, zzncVar2.mo8767U(j3, j4));
                }
                jMin2 = Math.min(jMin2, zzfm.m6518t(jMin));
            }
            if (this.f20318X.m8764i()) {
                zzmeVar = this.f20303I.f20400h;
                if (zzmeVar != null) {
                    zzmeVar2 = zzmeVar.f20378m;
                } else {
                    zzmeVar2 = null;
                }
                if (zzmeVar2 != null) {
                    if (this.f20331k0 + (zzfm.m6519u(jMin2) * this.f20318X.f20470o.f6970a) >= zzmeVar2.m8692a()) {
                        jMin2 = Math.min(jMin2, j5);
                    }
                }
            }
        } else if (this.f20314T) {
            this.f20313S.getClass();
            if (this.f20318X.f20460e != 3) {
            }
            while (i2 < 2) {
                zzng zzngVar2 = this.f20339s[i2];
                j3 = this.f20331k0;
                j4 = this.f20332l0;
                zzncVar = zzngVar2.f20495a;
                if (zzng.m8770l(zzncVar)) {
                    jMin = zzncVar.mo8767U(j3, j4);
                } else {
                    jMin = LocationRequestCompat.PASSIVE_INTERVAL;
                }
                zzncVar2 = zzngVar2.f20497c;
                if (zzncVar2 == null) {
                }
                jMin2 = Math.min(jMin2, zzfm.m6518t(jMin));
            }
            if (this.f20318X.m8764i()) {
                zzmeVar = this.f20303I.f20400h;
                if (zzmeVar != null) {
                    zzmeVar2 = zzmeVar.f20378m;
                } else {
                    zzmeVar2 = null;
                }
                if (zzmeVar2 != null) {
                    if (this.f20331k0 + (zzfm.m6519u(jMin2) * this.f20318X.f20470o.f6970a) >= zzmeVar2.m8692a()) {
                        jMin2 = Math.min(jMin2, j5);
                    }
                }
            }
        } else if (this.f20318X.f20460e != 3 || m8664U()) {
            jMin2 = j5;
        }
        this.f20348y.mo6123h(j2 + jMin2);
    }

    /* JADX INFO: renamed from: r */
    public final void m8683r(zzlv zzlvVar) throws Throwable {
        long jLongValue;
        zzxl zzxlVarM8710E;
        boolean z;
        int i2;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long j6;
        long jMo9010h;
        zzmu zzmuVar;
        int i3;
        if (this.f20315U) {
            if (this.f20316V != null) {
                this.f20317W++;
                this.f20319Y.m8642a(1);
            }
            this.f20316V = zzlvVar;
            return;
        }
        this.f20319Y.m8642a(1);
        zzbf zzbfVar = this.f20318X.f20456a;
        int i4 = this.f20326f0;
        boolean z4 = this.f20327g0;
        zzbe zzbeVar = this.f20296B;
        zzbd zzbdVar = this.f20297C;
        Pair pairM8643A = m8643A(zzbfVar, zzlvVar, i4, z4, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairM8643A == null) {
            Pair pairM8689x = m8689x(this.f20318X.f20456a);
            zzxl zzxlVar = (zzxl) pairM8689x.first;
            jLongValue = ((Long) pairM8689x.second).longValue();
            z = !this.f20318X.f20456a.m4833g();
            zzxlVarM8710E = zzxlVar;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairM8643A.first;
            jLongValue = ((Long) pairM8643A.second).longValue();
            long j7 = zzlvVar.f20292c;
            if (j7 != -9223372036854775807L) {
                jMax = jLongValue;
            }
            zzxlVarM8710E = this.f20303I.m8710E(this.f20318X.f20456a, obj);
            if (zzxlVarM8710E.m9025b()) {
                this.f20318X.f20456a.mo4841o(zzxlVarM8710E.f21278a, zzbdVar);
                zza zzaVarM5285a = zzbdVar.f7637f.m5285a(-1);
                int i5 = 0;
                while (true) {
                    int[] iArr = zzaVarM5285a.f4742d;
                    if (i5 >= iArr.length || (i2 = iArr[i5]) == 0 || i2 == 1) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    zzbdVar.f7637f.getClass();
                }
                zzbdVar.f7637f.m5285a(-1).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j7 != -9223372036854775807L) {
                z = false;
            }
            z = true;
        }
        try {
            if (this.f20318X.f20456a.m4833g()) {
                this.f20330j0 = zzlvVar;
            } else if (pairM8643A == null) {
                if (this.f20318X.f20460e != 1) {
                    m8671f(4);
                }
                m8688w(false, true, false, true);
            } else {
                if (zzxlVarM8710E.equals(this.f20318X.f20457b)) {
                    zzme zzmeVar = this.f20303I.f20400h;
                    if (zzmeVar == null || !zzmeVar.f20370e || jLongValue == 0) {
                        jMo9010h = jLongValue;
                    } else {
                        zzxd zzxdVar = zzmeVar.f20366a;
                        long j8 = zzbeVar.f7684j;
                        if (this.f20314T && j8 != jMax) {
                            this.f20313S.getClass();
                        }
                        jMo9010h = zzxdVar.mo9010h(jLongValue, this.f20312R);
                    }
                    long j9 = jMo9010h;
                    if (zzfm.m6518t(jMo9010h) == zzfm.m6518t(this.f20318X.f20473r) && ((i3 = (zzmuVar = this.f20318X).f20460e) == 2 || i3 == 3)) {
                        jLongValue = zzmuVar.f20473r;
                    } else {
                        j4 = j9;
                    }
                } else {
                    j4 = jLongValue;
                }
                if (this.f20314T) {
                    zzng[] zzngVarArr = this.f20339s;
                    for (int i6 = 0; i6 < 2; i6++) {
                        zzng zzngVar = zzngVarArr[i6];
                        if (zzngVar.m8779g() && zzngVar.f20495a.zza() == 2) {
                            this.f20315U = true;
                            break;
                        }
                    }
                }
                boolean z5 = this.f20318X.f20460e == 4;
                zzmh zzmhVar = this.f20303I;
                long jM8684s = m8684s(zzxlVarM8710E, j4, zzmhVar.f20400h != zzmhVar.f20401i, z5);
                boolean z6 = z | (jLongValue != jM8684s);
                try {
                    zzmu zzmuVar2 = this.f20318X;
                    zzxl zzxlVar2 = zzxlVarM8710E;
                    try {
                        zzbf zzbfVar2 = zzmuVar2.f20456a;
                        long j10 = jMax;
                        try {
                            m8651H(zzbfVar2, zzxlVar2, zzbfVar2, zzmuVar2.f20457b, j10, true);
                            zzxlVarM8710E = zzxlVar2;
                            j5 = j10;
                            z3 = z6;
                            j6 = jM8684s;
                            this.f20318X = m8658O(zzxlVarM8710E, j6, j5, j6, z3, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzxlVarM8710E = zzxlVar2;
                            j2 = j10;
                            z2 = z6;
                            j3 = jM8684s;
                            this.f20318X = m8658O(zzxlVarM8710E, j3, j2, j3, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzxlVarM8710E = zzxlVar2;
                        j2 = jMax;
                        z2 = z6;
                        j3 = jM8684s;
                        this.f20318X = m8658O(zzxlVarM8710E, j3, j2, j3, z2, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            j5 = jMax;
            j6 = jLongValue;
            z3 = z;
            this.f20318X = m8658O(zzxlVarM8710E, j6, j5, j6, z3, 2);
        } catch (Throwable th4) {
            th = th4;
            j2 = jMax;
            z2 = z;
            j3 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX INFO: renamed from: s */
    public final long m8684s(zzxl zzxlVar, long j2, boolean z, boolean z2) throws zzjm {
        m8677l();
        boolean z3 = true;
        m8691z(false, true);
        if (z2 || this.f20318X.f20460e == 3) {
            m8671f(2);
        }
        zzmh zzmhVar = this.f20303I;
        zzme zzmeVar = zzmhVar.f20400h;
        zzme zzmeVar2 = zzmeVar;
        while (zzmeVar2 != null && !zzxlVar.equals(zzmeVar2.f20372g.f20382a)) {
            zzmeVar2 = zzmeVar2.f20378m;
        }
        if (z || zzmeVar != zzmeVar2 || (zzmeVar2 != null && zzmeVar2.f20381p + j2 < 0)) {
            m8646C();
            if (zzmeVar2 != null) {
                while (zzmhVar.f20400h != zzmeVar2) {
                    zzmhVar.m8733x();
                }
                zzmhVar.m8734y(zzmeVar2);
                zzmeVar2.f20381p = 1000000000000L;
                m8659P(new boolean[2], this.f20303I.f20401i.m8692a());
                zzmeVar2.f20373h = true;
            }
        }
        m8647D();
        if (zzmeVar2 != null) {
            zzmhVar.m8734y(zzmeVar2);
            if (!zzmeVar2.f20370e) {
                zzmeVar2.f20372g = zzmeVar2.f20372g.m8704a(j2, -9223372036854775807L);
            } else if (zzmeVar2.f20371f) {
                if (this.f20314T) {
                    this.f20313S.getClass();
                    if (this.f20318X.f20456a.m4833g() || !zzmeVar2.f20372g.f20382a.equals(this.f20318X.f20457b)) {
                        zzxd zzxdVar = zzmeVar2.f20366a;
                        j2 = zzxdVar.mo9012k(j2);
                        zzxdVar.mo9014m(j2 - this.f20298D);
                    } else {
                        long j3 = zzmeVar2.f20381p + j2;
                        zzng[] zzngVarArr = this.f20339s;
                        boolean z4 = true;
                        for (int i2 = 0; i2 < 2; i2++) {
                            zzng zzngVar = zzngVarArr[i2];
                            if (zzngVar.m8779g()) {
                                zznc zzncVarM8784m = zzngVar.m8784m(zzmeVar2);
                                z4 &= zzncVarM8784m != null && zzncVarM8784m.mo3999W(j3);
                            }
                        }
                        if (z4) {
                            zzxd zzxdVar2 = zzmeVar2.f20366a;
                            long j4 = this.f20318X.f20473r;
                            zznk zznkVar = zznk.f20504b;
                            if (zzxdVar2.mo9010h(j4, zznkVar) == zzxdVar2.mo9010h(j2, zznkVar)) {
                                z3 = false;
                            } else {
                                zzxd zzxdVar3 = zzmeVar2.f20366a;
                                j2 = zzxdVar3.mo9012k(j2);
                                zzxdVar3.mo9014m(j2 - this.f20298D);
                            }
                        } else {
                            zzxd zzxdVar4 = zzmeVar2.f20366a;
                            j2 = zzxdVar4.mo9012k(j2);
                            zzxdVar4.mo9014m(j2 - this.f20298D);
                        }
                    }
                } else {
                    zzxd zzxdVar5 = zzmeVar2.f20366a;
                    j2 = zzxdVar5.mo9012k(j2);
                    zzxdVar5.mo9014m(j2 - this.f20298D);
                }
            }
            m8685t(z3, j2);
            m8656M();
        } else {
            zzmhVar.m8707B();
            m8685t(true, j2);
        }
        m8661R(false);
        this.f20348y.mo6125l(2);
        return j2;
    }

    /* JADX INFO: renamed from: t */
    public final void m8685t(boolean z, long j2) {
        zzme zzmeVar = this.f20303I.f20400h;
        long j3 = j2 + (zzmeVar == null ? 1000000000000L : zzmeVar.f20381p);
        this.f20331k0 = j3;
        this.f20299E.f20128s.m8800a(j3);
        for (int i2 = 0; i2 < 2; i2++) {
            zzng zzngVar = this.f20339s[i2];
            long j4 = this.f20331k0;
            zznc zzncVarM8784m = zzngVar.m8784m(zzmeVar);
            if (zzncVarM8784m != null) {
                zzncVarM8784m.mo8585Y(z, j4);
            }
        }
        for (zzme zzmeVar2 = r0.f20400h; zzmeVar2 != null; zzmeVar2 = zzmeVar2.f20378m) {
            for (zzabb zzabbVar : zzmeVar2.f20380o.f4846c) {
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8686u() {
        for (int i2 = 0; i2 < 2; i2++) {
            zzng zzngVar = this.f20339s[i2];
            zznj zznjVar = this.f20314T ? this.f20313S : null;
            zzngVar.f20495a.mo4007j(18, zznjVar);
            zznc zzncVar = zzngVar.f20497c;
            if (zzncVar != null) {
                zzncVar.mo4007j(18, zznjVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8687v(boolean z, boolean z2) {
        m8688w(z || !this.f20328h0, false, true, false);
        this.f20319Y.m8642a(z2 ? 1 : 0);
        this.f20347x.mo5524d(this.f20306L);
        this.f20311Q.m5343b(1, this.f20318X.f20467l);
        m8671f(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[PHI: r2 r7 r9
  0x00b9: PHI (r2v2 com.google.android.gms.internal.ads.zzxl) = (r2v1 com.google.android.gms.internal.ads.zzxl), (r2v8 com.google.android.gms.internal.ads.zzxl) binds: [B:33:0x008f, B:35:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r7v4 long) = (r7v3 long), (r7v17 long) binds: [B:33:0x008f, B:35:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:33:0x008f, B:35:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX INFO: renamed from: w */
    public final void m8688w(boolean z, boolean z2, boolean z3, boolean z4) {
        long j2;
        boolean z5;
        zzxl zzxlVar;
        zzbf zzbfVar;
        List list;
        this.f20348y.mo6115E(2);
        this.f20315U = false;
        if (this.f20316V != null) {
            this.f20319Y.m8642a(1);
            this.f20316V = null;
        }
        this.f20335o0 = null;
        m8691z(false, true);
        zzjk zzjkVar = this.f20299E;
        zzjkVar.f20133x = false;
        zznn zznnVar = zzjkVar.f20128s;
        if (zznnVar.f20510s) {
            zznnVar.m8800a(zznnVar.mo8618c());
            zznnVar.f20510s = false;
        }
        this.f20331k0 = 1000000000000L;
        try {
            m8646C();
        } catch (zzjm | RuntimeException e) {
            zzeh.m6214f("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzng[] zzngVarArr = this.f20339s;
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    zzngVarArr[i2].m8774b();
                } catch (RuntimeException e2) {
                    zzeh.m6214f("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.f20329i0 = 0;
        zzmu zzmuVar = this.f20318X;
        zzxl zzxlVar2 = zzmuVar.f20457b;
        long jLongValue = zzmuVar.f20473r;
        if (this.f20318X.f20457b.m9025b()) {
            j2 = this.f20318X.f20458c;
        } else {
            zzmu zzmuVar2 = this.f20318X;
            zzbd zzbdVar = this.f20297C;
            zzxl zzxlVar3 = zzmuVar2.f20457b;
            zzbf zzbfVar2 = zzmuVar2.f20456a;
            if (zzbfVar2.m4833g() || zzbfVar2.mo4841o(zzxlVar3.f21278a, zzbdVar).f7636e) {
                j2 = this.f20318X.f20458c;
            } else {
                j2 = this.f20318X.f20473r;
            }
        }
        if (z2) {
            this.f20330j0 = null;
            Pair pairM8689x = m8689x(this.f20318X.f20456a);
            zzxlVar2 = (zzxl) pairM8689x.first;
            jLongValue = ((Long) pairM8689x.second).longValue();
            j2 = -9223372036854775807L;
            z5 = zzxlVar2.equals(this.f20318X.f20457b) ? false : true;
        }
        long j3 = jLongValue;
        long j4 = j2;
        zzmh zzmhVar = this.f20303I;
        zzmhVar.m8707B();
        this.f20325e0 = false;
        zzbf zzbfVar3 = this.f20318X.f20456a;
        if (z3 && (zzbfVar3 instanceof zzna)) {
            zzna zznaVar = (zzna) zzbfVar3;
            zzzg zzzgVar = this.f20304J.f20454l;
            zzbf[] zzbfVarArr = zznaVar.f20491h;
            zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
            for (int i3 = 0; i3 < zzbfVarArr.length; i3++) {
                zzbfVarArr2[i3] = new zzmz(zznaVar, zzbfVarArr[i3]);
            }
            zzna zznaVar2 = new zzna(zzbfVarArr2, zznaVar.f20492i, zzzgVar);
            if (zzxlVar2.f21279b != -1) {
                Object obj = zzxlVar2.f21278a;
                zzbd zzbdVar2 = this.f20297C;
                zznaVar2.mo4841o(obj, zzbdVar2);
                zzbe zzbeVar = this.f20296B;
                zznaVar2.mo4736b(zzbdVar2.f7634c, zzbeVar, 0L);
                if (zzbeVar.m4777b()) {
                    zzbfVar = zznaVar2;
                    zzxlVar = new zzxl(zzxlVar2.f21281d, obj);
                } else {
                    zzxlVar = zzxlVar2;
                    zzbfVar = zznaVar2;
                }
            } else {
                zzxlVar = zzxlVar2;
                zzbfVar = zznaVar2;
            }
        } else {
            zzxlVar = zzxlVar2;
            zzbfVar = zzbfVar3;
        }
        zzmu zzmuVar3 = this.f20318X;
        int i4 = zzmuVar3.f20460e;
        zzjm zzjmVar = z4 ? null : zzmuVar3.f20461f;
        zzzo zzzoVar = z5 ? zzzo.f21490d : zzmuVar3.f20463h;
        zzabj zzabjVar = z5 ? this.f20346w : zzmuVar3.f20464i;
        if (z5) {
            zzgzi zzgziVar = zzgwt.f18303t;
            list = zzgyo.f18355w;
        } else {
            list = zzmuVar3.f20465j;
        }
        this.f20318X = new zzmu(zzbfVar, zzxlVar, j4, j3, i4, zzjmVar, false, zzzoVar, zzabjVar, list, zzxlVar, zzmuVar3.f20467l, zzmuVar3.f20468m, zzmuVar3.f20469n, zzmuVar3.f20470o, j3, 0L, j3, 0L);
        if (z3) {
            zzmhVar.m8727r();
            zzmt zzmtVar = this.f20304J;
            HashMap map = zzmtVar.f20449g;
            for (zzmp zzmpVar : map.values()) {
                try {
                    zzmpVar.f20434a.mo8990v(zzmpVar.f20435b);
                } catch (RuntimeException e3) {
                    zzeh.m6214f("MediaSourceList", "Failed to release child source.", e3);
                }
                zzxn zzxnVar = zzmpVar.f20434a;
                zzmo zzmoVar = zzmpVar.f20436c;
                zzxnVar.mo8979A(zzmoVar);
                zzxnVar.mo8984F(zzmoVar);
            }
            map.clear();
            zzmtVar.f20450h.clear();
            zzmtVar.f20453k = false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final Pair m8689x(zzbf zzbfVar) {
        int i2;
        long j2 = 0;
        if (zzbfVar.m4833g()) {
            return Pair.create(zzmu.f20455t, 0L);
        }
        int iMo4837k = zzbfVar.mo4837k(this.f20327g0);
        zzbe zzbeVar = this.f20296B;
        zzbd zzbdVar = this.f20297C;
        Pair pairM4839m = zzbfVar.m4839m(zzbeVar, zzbdVar, iMo4837k, -9223372036854775807L);
        zzxl zzxlVarM8710E = this.f20303I.m8710E(zzbfVar, pairM4839m.first);
        long jLongValue = ((Long) pairM4839m.second).longValue();
        if (zzxlVarM8710E.m9025b()) {
            zzbfVar.mo4841o(zzxlVarM8710E.f21278a, zzbdVar);
            zza zzaVarM5285a = zzbdVar.f7637f.m5285a(-1);
            int i3 = 0;
            while (true) {
                int[] iArr = zzaVarM5285a.f4742d;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            if (-1 == i3) {
                zzbdVar.f7637f.getClass();
            }
        } else {
            j2 = jLongValue;
        }
        return Pair.create(zzxlVarM8710E, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: y */
    public final void m8690y(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.m4833g() && zzbfVar2.m4833g()) {
            return;
        }
        ArrayList arrayList = this.f20300F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((zzls) arrayList.get(size)).getClass();
            String str = zzfm.f16091a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8691z(boolean z, boolean z2) {
        this.f20323c0 = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f20324d0 = jElapsedRealtime;
    }
}
