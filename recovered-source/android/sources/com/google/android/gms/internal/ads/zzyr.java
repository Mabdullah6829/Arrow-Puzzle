package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzyr implements zzxj, zzagd, zzabx, zzacc, zzzb {

    /* JADX INFO: renamed from: g0 */
    public static final Map f21361g0;

    /* JADX INFO: renamed from: h0 */
    public static final zzv f21362h0;

    /* JADX INFO: renamed from: A */
    public final long f21363A;

    /* JADX INFO: renamed from: B */
    public final zzacf f21364B = new zzacf();

    /* JADX INFO: renamed from: C */
    public final zzye f21365C;

    /* JADX INFO: renamed from: D */
    public final zzdt f21366D;

    /* JADX INFO: renamed from: E */
    public final Runnable f21367E;

    /* JADX INFO: renamed from: F */
    public final Runnable f21368F;

    /* JADX INFO: renamed from: G */
    public final Handler f21369G;

    /* JADX INFO: renamed from: H */
    public Object f21370H;

    /* JADX INFO: renamed from: I */
    public zzajh f21371I;

    /* JADX INFO: renamed from: J */
    public zzyh[] f21372J;

    /* JADX INFO: renamed from: K */
    public zzzc[] f21373K;

    /* JADX INFO: renamed from: L */
    public zzyp[] f21374L;

    /* JADX INFO: renamed from: M */
    public boolean f21375M;

    /* JADX INFO: renamed from: N */
    public boolean f21376N;

    /* JADX INFO: renamed from: O */
    public boolean f21377O;

    /* JADX INFO: renamed from: P */
    public boolean f21378P;

    /* JADX INFO: renamed from: Q */
    public zzyq f21379Q;

    /* JADX INFO: renamed from: R */
    public zzahd f21380R;

    /* JADX INFO: renamed from: S */
    public long f21381S;

    /* JADX INFO: renamed from: T */
    public boolean f21382T;

    /* JADX INFO: renamed from: U */
    public int f21383U;

    /* JADX INFO: renamed from: V */
    public boolean f21384V;

    /* JADX INFO: renamed from: W */
    public boolean f21385W;

    /* JADX INFO: renamed from: X */
    public boolean f21386X;

    /* JADX INFO: renamed from: Y */
    public int f21387Y;

    /* JADX INFO: renamed from: Z */
    public boolean f21388Z;

    /* JADX INFO: renamed from: a0 */
    public long f21389a0;

    /* JADX INFO: renamed from: b0 */
    public long f21390b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f21391c0;

    /* JADX INFO: renamed from: d0 */
    public int f21392d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f21393e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f21394f0;

    /* JADX INFO: renamed from: s */
    public final Uri f21395s;

    /* JADX INFO: renamed from: t */
    public final zzhr f21396t;

    /* JADX INFO: renamed from: u */
    public final zzuq f21397u;

    /* JADX INFO: renamed from: v */
    public final zzxv f21398v;

    /* JADX INFO: renamed from: w */
    public final zzul f21399w;

    /* JADX INFO: renamed from: x */
    public final zzyv f21400x;

    /* JADX INFO: renamed from: y */
    public final zzabm f21401y;

    /* JADX INFO: renamed from: z */
    public final long f21402z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f21361g0 = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.f20789a = "icy";
        zztVar.m8853e("application/x-icy");
        f21362h0 = new zzv(zztVar);
    }

    public zzyr(Uri uri, zzhr zzhrVar, zzye zzyeVar, zzuq zzuqVar, zzul zzulVar, zzxv zzxvVar, zzyv zzyvVar, zzabm zzabmVar, int i2, long j2) {
        this.f21395s = uri;
        this.f21396t = zzhrVar;
        this.f21397u = zzuqVar;
        this.f21399w = zzulVar;
        this.f21398v = zzxvVar;
        this.f21400x = zzyvVar;
        this.f21401y = zzabmVar;
        this.f21402z = i2;
        this.f21365C = zzyeVar;
        this.f21363A = j2;
        zzff zzffVar = zzdp.f12520a;
        this.f21366D = new zzdt();
        this.f21367E = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f21352s.m9042u();
            }
        };
        this.f21368F = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
            /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyr zzyrVar = this.f21348s;
                if (zzyrVar.f21394f0) {
                    return;
                }
                ?? r1 = zzyrVar.f21370H;
                r1.getClass();
                r1.mo8668c(zzyrVar);
            }
        };
        this.f21369G = zzfm.m6514p();
        this.f21374L = new zzyp[0];
        this.f21373K = new zzzc[0];
        this.f21372J = new zzyh[0];
        this.f21390b0 = -9223372036854775807L;
        this.f21383U = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m9035A() {
        zzgtr.m7133f(this.f21376N);
        this.f21379Q.getClass();
        this.f21380R.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: a */
    public final boolean mo9004a() {
        boolean z;
        if (this.f21393e0 || this.f21364B.f4898b == null) {
            return false;
        }
        zzdt zzdtVar = this.f21366D;
        synchronized (zzdtVar) {
            z = zzdtVar.f12859a;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: b */
    public final void mo9005b(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    /* JADX INFO: renamed from: c */
    public final void mo3945c() {
        for (zzzc zzzcVar : this.f21373K) {
            zzzcVar.m9059k(true);
            if (zzzcVar.f21450g != null) {
                zzzcVar.f21450g = null;
                zzzcVar.f21449f = null;
            }
        }
        this.f21365C.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: d */
    public final void mo4108d(final zzahd zzahdVar) {
        this.f21369G.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzyr zzyrVar = this.f21349s;
                zzajh zzajhVar = zzyrVar.f21371I;
                zzahd zzahdVar2 = zzahdVar;
                zzyrVar.f21380R = zzajhVar == null ? zzahdVar2 : new zzahc(-9223372036854775807L, 0L);
                zzyrVar.f21381S = zzahdVar2.zza();
                boolean z = false;
                if (!zzyrVar.f21388Z && zzahdVar2.zza() == -9223372036854775807L) {
                    z = true;
                }
                zzyrVar.f21382T = z;
                zzyrVar.f21383U = true == z ? 7 : 1;
                if (zzyrVar.f21376N) {
                    zzyrVar.f21400x.m9047f(zzyrVar.f21381S, zzahdVar2, z);
                } else {
                    zzyrVar.m9042u();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: e */
    public final void mo9007e() throws IOException {
        IOException iOException;
        int i2 = this.f21383U == 7 ? 6 : 3;
        zzacf zzacfVar = this.f21364B;
        IOException iOException2 = zzacfVar.f4899c;
        if (iOException2 != null) {
            throw iOException2;
        }
        zzaca zzacaVar = zzacfVar.f4898b;
        if (zzacaVar != null && (iOException = zzacaVar.f4888u) != null && zzacaVar.f4889v > i2) {
            throw iOException;
        }
        if (this.f21393e0 && !this.f21376N) {
            throw zzat.m4383a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: f */
    public final zzahm mo4109f(int i2, int i3) {
        return m9041t(new zzyp(i2, false));
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: g */
    public final zzzo mo9009g() {
        m9035A();
        return this.f21379Q.f21357a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: h */
    public final long mo9010h(long j2, zznk zznkVar) {
        long j3;
        boolean z;
        long j4;
        boolean z2;
        m9035A();
        if (!this.f21380R.zzb()) {
            return 0L;
        }
        zzahb zzahbVarMo4064a = this.f21380R.mo4064a(j2);
        zzahe zzaheVar = zzahbVarMo4064a.f5304a;
        zzahe zzaheVar2 = zzahbVarMo4064a.f5305b;
        long j5 = zznkVar.f20506a;
        if (j5 == 0) {
            return j2;
        }
        String str = zzfm.f16091a;
        long j6 = j2 - j5;
        boolean z3 = ((j2 ^ j6) >= 0) | ((j5 ^ j2) >= 0);
        long j7 = LocationRequestCompat.PASSIVE_INTERVAL;
        long j8 = z3 ? j6 : ((j6 >>> 63) ^ 1) + LocationRequestCompat.PASSIVE_INTERVAL;
        long j9 = Long.MIN_VALUE;
        if (j8 != Long.MIN_VALUE) {
            if (j8 == LocationRequestCompat.PASSIVE_INTERVAL) {
                if (j6 != LocationRequestCompat.PASSIVE_INTERVAL) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = Long.MAX_VALUE;
                }
            }
        } else if (j6 == Long.MIN_VALUE) {
            j6 = Long.MIN_VALUE;
            if (j8 == LocationRequestCompat.PASSIVE_INTERVAL) {
                if (j6 != LocationRequestCompat.PASSIVE_INTERVAL) {
                    j8 = Long.MIN_VALUE;
                } else {
                    j8 = Long.MAX_VALUE;
                }
            }
        } else {
            j8 = Long.MIN_VALUE;
        }
        if (j2 == Long.MIN_VALUE) {
            if (j2 == Long.MIN_VALUE) {
            }
            j3 = zzaheVar.f5309a;
            if (j8 <= j3 || j3 > j7) {
                z = false;
            } else {
                z = true;
            }
            j4 = zzaheVar2.f5309a;
            z2 = j8 > j4 && j4 <= j7;
            if (!z && z2) {
                if (Math.abs(j3 - j2) <= Math.abs(j4 - j2)) {
                    return j3;
                }
                return j4;
            }
            if (!z) {
                if (z2) {
                    return j4;
                }
                return j8;
            }
            return j3;
        }
        j9 = j2;
        if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
            int i2 = (j9 > LocationRequestCompat.PASSIVE_INTERVAL ? 1 : (j9 == LocationRequestCompat.PASSIVE_INTERVAL ? 0 : -1));
        } else {
            j7 = j2;
        }
        j3 = zzaheVar.f5309a;
        if (j8 <= j3) {
            z = false;
        } else {
            z = false;
        }
        j4 = zzaheVar2.f5309a;
        if (j8 > j4) {
        }
        if (!z) {
        }
        if (!z) {
            if (z2) {
                return j4;
            }
            return j8;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    /* JADX INFO: renamed from: i */
    public final boolean mo9006i(zzmc zzmcVar) {
        if (this.f21393e0) {
            return false;
        }
        zzacf zzacfVar = this.f21364B;
        if (zzacfVar.f4899c != null || this.f21391c0) {
            return false;
        }
        if (this.f21376N && this.f21387Y == 0) {
            return false;
        }
        boolean zM6050a = this.f21366D.m6050a();
        if (zzacfVar.f4898b != null) {
            return zM6050a;
        }
        m9043w();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: j */
    public final void mo9011j(zzxi zzxiVar, long j2) {
        this.f21370H = zzxiVar;
        this.f21366D.m6050a();
        m9043w();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[LOOP:1: B:66:0x00b8->B:67:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4 A[LOOP:2: B:71:0x00d2->B:72:0x00d4, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x00cb, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: k */
    public final long mo9012k(long j2) {
        zzacf zzacfVar;
        int i2;
        int i3;
        boolean zM9062n;
        int i4;
        int i5;
        m9035A();
        boolean[] zArr = this.f21379Q.f21358b;
        if (true != this.f21380R.zzb()) {
            j2 = 0;
        }
        this.f21385W = false;
        long j3 = this.f21389a0;
        this.f21389a0 = j2;
        if (m9046z()) {
            this.f21390b0 = j2;
            return j2;
        }
        if (this.f21383U == 7 || (!this.f21393e0 && this.f21364B.f4898b == null)) {
            this.f21391c0 = false;
            this.f21390b0 = j2;
            this.f21393e0 = false;
            this.f21386X = false;
            zzacfVar = this.f21364B;
            if (zzacfVar.f4898b != null) {
                zzacfVar.f4899c = null;
                for (zzzc zzzcVar : this.f21373K) {
                    zzzcVar.m9059k(false);
                }
                break;
            }
            for (zzzc zzzcVar2 : this.f21373K) {
                zzzcVar2.m9063o();
            }
            zzaca zzacaVar = zzacfVar.f4898b;
            zzacaVar.getClass();
            zzacaVar.m3943a(false);
            return j2;
        }
        int length = this.f21373K.length;
        for (int i6 = 0; i6 < length; i6++) {
            zzzc zzzcVar3 = this.f21373K[i6];
            if (this.f21372J[i6].f21334d.get() == zzyg.f21328s) {
                int i7 = zzzcVar3.f21459p;
                if (zzzcVar3.f21461r + i7 != 0 || j3 != j2) {
                    if (this.f21378P) {
                        synchronized (zzzcVar3) {
                            synchronized (zzzcVar3) {
                                zzzcVar3.f21461r = 0;
                                zzyx zzyxVar = zzzcVar3.f21444a;
                                zzyxVar.f21426d = zzyxVar.f21425c;
                            }
                        }
                        int i8 = zzzcVar3.f21459p;
                        if (i7 < i8 || i7 > zzzcVar3.f21458o + i8 || (((i4 = zzzcVar3.f21466w) != -1 && i7 >= i4) || ((i5 = zzzcVar3.f21467x) != -1 && i7 >= i5))) {
                            zM9062n = false;
                        } else {
                            zzzcVar3.f21462s = Long.MIN_VALUE;
                            zzzcVar3.f21461r = i7 - i8;
                            zM9062n = true;
                        }
                    } else {
                        zM9062n = zzzcVar3.m9062n(this.f21393e0, j2);
                    }
                    if (!zM9062n && (zArr[i6] || !this.f21377O)) {
                        this.f21391c0 = false;
                        this.f21390b0 = j2;
                        this.f21393e0 = false;
                        this.f21386X = false;
                        zzacfVar = this.f21364B;
                        if (zzacfVar.f4898b != null) {
                            zzacfVar.f4899c = null;
                            while (i2 < r2) {
                                zzzcVar.m9059k(false);
                            }
                            break;
                            break;
                        }
                        while (i3 < r3) {
                            zzzcVar2.m9063o();
                        }
                        zzaca zzacaVar2 = zzacfVar.f4898b;
                        zzacaVar2.getClass();
                        zzacaVar2.m3943a(false);
                        return j2;
                    }
                }
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: l */
    public final long mo9013l(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j2) {
        zzabb zzabbVar;
        m9035A();
        zzyq zzyqVar = this.f21379Q;
        zzzo zzzoVar = zzyqVar.f21357a;
        boolean[] zArr3 = zzyqVar.f21359c;
        int i2 = this.f21387Y;
        for (int i3 = 0; i3 < zzabbVarArr.length; i3++) {
            zzzd zzzdVar = zzzdVarArr[i3];
            if (zzzdVar != null && (zzabbVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzyo) zzzdVar).f21353a;
                zzgtr.m7133f(zArr3[i4]);
                this.f21387Y--;
                zArr3[i4] = false;
                zzzdVarArr[i3] = null;
            }
        }
        boolean z = !this.f21384V ? j2 == 0 || this.f21378P : i2 != 0;
        for (int i5 = 0; i5 < zzabbVarArr.length; i5++) {
            if (zzzdVarArr[i5] == null && (zzabbVar = zzabbVarArr[i5]) != null) {
                zzgtr.m7133f(zzabbVar.mo3918a() == 1);
                zzgtr.m7133f(zzabbVar.mo3920o(0) == 0);
                int iIndexOf = zzzoVar.f21492b.indexOf(zzabbVar.zza());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                zzgtr.m7133f(!zArr3[iIndexOf]);
                this.f21387Y++;
                zArr3[iIndexOf] = true;
                this.f21386X = zzabbVar.zzc().f21067u | this.f21386X;
                zzzdVarArr[i5] = new zzyo(this, iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    zzzc zzzcVar = this.f21373K[iIndexOf];
                    z = (zzzcVar.f21459p + zzzcVar.f21461r == 0 || zzzcVar.m9062n(true, j2)) ? false : true;
                }
            }
        }
        if (this.f21387Y == 0) {
            this.f21391c0 = false;
            this.f21385W = false;
            this.f21386X = false;
            zzacf zzacfVar = this.f21364B;
            if (zzacfVar.f4898b != null) {
                for (zzzc zzzcVar2 : this.f21373K) {
                    zzzcVar2.m9063o();
                }
                zzaca zzacaVar = zzacfVar.f4898b;
                zzacaVar.getClass();
                zzacaVar.m3943a(false);
            } else {
                this.f21393e0 = false;
                for (zzzc zzzcVar3 : this.f21373K) {
                    zzzcVar3.m9059k(false);
                }
            }
        } else if (z) {
            j2 = mo9012k(j2);
            for (int i6 = 0; i6 < zzzdVarArr.length; i6++) {
                if (zzzdVarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f21384V = true;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: m */
    public final void mo9014m(long j2) {
        long j3;
        long jM9057i;
        int i2;
        if (this.f21378P) {
            return;
        }
        m9035A();
        if (m9046z()) {
            return;
        }
        boolean[] zArr = this.f21379Q.f21359c;
        int length = this.f21373K.length;
        int i3 = 0;
        while (i3 < length) {
            zzzc zzzcVar = this.f21373K[i3];
            boolean z = zArr[i3];
            zzyx zzyxVar = zzzcVar.f21444a;
            synchronized (zzzcVar) {
                try {
                    int i4 = zzzcVar.f21458o;
                    if (i4 != 0) {
                        long[] jArr = zzzcVar.f21456m;
                        int i5 = zzzcVar.f21460q;
                        if (j2 < jArr[i5]) {
                            j3 = j2;
                        } else {
                            j3 = j2;
                            int iM9056h = zzzcVar.m9056h(i5, (!z || (i2 = zzzcVar.f21461r) == i4) ? i4 : i2 + 1, j3, false);
                            jM9057i = iM9056h != -1 ? zzzcVar.m9057i(iM9056h) : -1L;
                        }
                    } else {
                        j3 = j2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzyxVar.m9052a(jM9057i);
            i3++;
            j2 = j3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    /* JADX INFO: renamed from: n */
    public final long mo9015n() {
        if (this.f21386X) {
            this.f21386X = false;
        } else {
            if (!this.f21385W) {
                return -9223372036854775807L;
            }
            if (!this.f21393e0 && m9044x() <= this.f21392d0) {
                return -9223372036854775807L;
            }
            this.f21385W = false;
        }
        return this.f21389a0;
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public final void m9036o(zzacb zzacbVar, boolean z) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        Uri uri = zzyiVar.f21336b.f20024b;
        zzxc zzxcVar = new zzxc();
        zzxh zzxhVar = new zzxh(-1, null, zzfm.m6518t(zzyiVar.f21343i), zzfm.m6518t(this.f21381S));
        zzxv zzxvVar = this.f21398v;
        zzxvVar.m9029a(new zzxq(zzxvVar, zzxcVar, zzxhVar));
        if (z) {
            return;
        }
        for (zzzc zzzcVar : this.f21373K) {
            zzzcVar.m9059k(false);
        }
        if (this.f21387Y > 0) {
            ?? r14 = this.f21370H;
            r14.getClass();
            r14.mo8668c(this);
        }
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final void m9037p(zzacb zzacbVar) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        if (this.f21381S == -9223372036854775807L && this.f21380R != null) {
            long jM9045y = m9045y(true);
            long j2 = jM9045y == Long.MIN_VALUE ? 0L : jM9045y + WorkRequest.MIN_BACKOFF_MILLIS;
            this.f21381S = j2;
            this.f21400x.m9047f(j2, this.f21380R, this.f21382T);
        }
        Uri uri = zzyiVar.f21336b.f20024b;
        zzxc zzxcVar = new zzxc();
        zzxh zzxhVar = new zzxh(-1, null, zzfm.m6518t(zzyiVar.f21343i), zzfm.m6518t(this.f21381S));
        zzxv zzxvVar = this.f21398v;
        zzxvVar.m9029a(new zzxp(zzxvVar, zzxcVar, zzxhVar));
        this.f21393e0 = true;
        ?? r15 = this.f21370H;
        r15.getClass();
        r15.mo8668c(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m9038q(int i2) {
        m9035A();
        zzyq zzyqVar = this.f21379Q;
        boolean[] zArr = zzyqVar.f21360d;
        if (zArr[i2]) {
            return;
        }
        zzv zzvVar = zzyqVar.f21357a.m9066a(i2).f7810d[0];
        zzxh zzxhVar = new zzxh(zzas.m4354f(zzvVar.f21061o), zzvVar, zzfm.m6518t(this.f21389a0), -9223372036854775807L);
        zzxv zzxvVar = this.f21398v;
        zzxvVar.m9029a(new zzxs(zzxvVar, zzxhVar));
        zArr[i2] = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzze, java.lang.Object] */
    /* JADX INFO: renamed from: r */
    public final void m9039r(int i2) {
        m9035A();
        if (this.f21391c0) {
            if ((!this.f21377O || this.f21379Q.f21358b[i2]) && !this.f21373K[i2].m9061m(false)) {
                this.f21390b0 = 0L;
                this.f21391c0 = false;
                this.f21385W = true;
                this.f21389a0 = 0L;
                this.f21392d0 = 0;
                for (zzzc zzzcVar : this.f21373K) {
                    zzzcVar.m9059k(false);
                }
                ?? r5 = this.f21370H;
                r5.getClass();
                r5.mo8668c(this);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m9040s() {
        return this.f21385W || m9046z();
    }

    /* JADX INFO: renamed from: t */
    public final zzahm m9041t(zzyp zzypVar) {
        int length = this.f21373K.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zzypVar.equals(this.f21374L[i2])) {
                return this.f21373K[i2];
            }
        }
        if (this.f21375M) {
            int i3 = zzypVar.f21355a;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i3);
            sb.append(") after finishing tracks.");
            zzeh.m6211c("ProgressiveMediaPeriod", sb.toString());
            return new zzafx();
        }
        zzzc zzzcVar = new zzzc(this.f21401y, this.f21397u, this.f21399w);
        zzyh zzyhVar = new zzyh(zzzcVar);
        zzzcVar.f21448e = this;
        int i4 = length + 1;
        zzyp[] zzypVarArr = (zzyp[]) Arrays.copyOf(this.f21374L, i4);
        zzypVarArr[length] = zzypVar;
        String str = zzfm.f16091a;
        this.f21374L = zzypVarArr;
        zzzc[] zzzcVarArr = (zzzc[]) Arrays.copyOf(this.f21373K, i4);
        zzzcVarArr[length] = zzzcVar;
        this.f21373K = zzzcVarArr;
        zzyh[] zzyhVarArr = (zzyh[]) Arrays.copyOf(this.f21372J, i4);
        zzyhVarArr[length] = zzyhVar;
        this.f21372J = zzyhVarArr;
        return zzyhVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.zzxi, java.lang.Object] */
    /* JADX INFO: renamed from: u */
    public final void m9042u() {
        int i2;
        char c;
        if (this.f21394f0 || this.f21376N || !this.f21375M || this.f21380R == null) {
            return;
        }
        for (zzzc zzzcVar : this.f21373K) {
            if (zzzcVar.m9060l() == null) {
                return;
            }
        }
        zzdt zzdtVar = this.f21366D;
        synchronized (zzdtVar) {
            zzdtVar.f12859a = false;
        }
        int length = this.f21373K.length;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            char c2 = 1;
            if (i4 >= length) {
                break;
            }
            zzv zzvVarM9060l = this.f21373K[i4].m9060l();
            zzvVarM9060l.getClass();
            int iM4354f = zzas.m4354f(zzvVarM9060l.f21061o);
            if (iM4354f == 1) {
                c = 3;
            } else if (iM4354f == 2) {
                c = 4;
            } else if (iM4354f != 3) {
                c = iM4354f != 4 ? (char) 0 : (char) 2;
            } else {
                c = 1;
            }
            if (i3 == 1) {
                c2 = 3;
            } else if (i3 == 2) {
                c2 = 4;
            } else if (i3 != 3) {
                c2 = i3 != 4 ? (char) 0 : (char) 2;
            }
            if (c > c2) {
                i3 = iM4354f;
            }
            if (c > c2) {
                i5 = i4;
            }
            i4++;
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i6 = 0; i6 < length; i6++) {
            zzv zzvVarM9060l2 = this.f21373K[i6].m9060l();
            zzvVarM9060l2.getClass();
            String str = zzvVarM9060l2.f21061o;
            boolean zM4349a = zzas.m4349a(str);
            boolean z = zM4349a || zzas.m4350b(str);
            zArr[i6] = z;
            this.f21377O = z | this.f21377O;
            this.f21378P = this.f21363A != -9223372036854775807L && length == 1 && zzas.m4351c(str);
            zzajh zzajhVar = this.f21371I;
            if (zzajhVar != null) {
                if (zM4349a || this.f21374L[i6].f21356b) {
                    zzap zzapVar = zzvVarM9060l2.f21058l;
                    zzap zzapVar2 = zzapVar == null ? new zzap(zzajhVar) : zzapVar.m4289d(zzajhVar);
                    zzt zztVar = new zzt(zzvVarM9060l2);
                    zztVar.f20799k = zzapVar2;
                    zzvVarM9060l2 = new zzv(zztVar);
                }
                if (zM4349a && zzvVarM9060l2.f21054h == -1 && zzvVarM9060l2.f21055i == -1 && (i2 = zzajhVar.f5520a) != -1) {
                    zzt zztVar2 = new zzt(zzvVarM9060l2);
                    zztVar2.f20796h = i2;
                    zzvVarM9060l2 = new zzv(zztVar2);
                }
            }
            int iMo8906b = this.f21397u.mo8906b(zzvVarM9060l2);
            zzt zztVar3 = new zzt(zzvVarM9060l2);
            zztVar3.f20788N = iMo8906b;
            zzv zzvVar = new zzv(zztVar3);
            if (i6 != i5) {
                zzt zztVar4 = new zzt(zzvVar);
                zztVar4.f20800l = Integer.toString(i5);
                zzvVar = new zzv(zztVar4);
            }
            zzbgVarArr[i6] = new zzbg(Integer.toString(i6), zzvVar);
            this.f21386X = zzvVar.f21067u | this.f21386X;
            zzzc zzzcVar2 = this.f21373K[i6];
            synchronized (zzzcVar2) {
                if (zzzcVar2.f21463t != Long.MIN_VALUE) {
                    zzzcVar2.f21463t = Long.MIN_VALUE;
                    zzzcVar2.f21466w = -1;
                    zzzcVar2.f21467x = -1;
                }
            }
        }
        this.f21379Q = new zzyq(new zzzo(zzbgVarArr), zArr);
        if (this.f21378P && this.f21381S == -9223372036854775807L) {
            this.f21381S = this.f21363A;
            this.f21380R = new zzyf(this, this.f21380R);
        }
        this.f21400x.m9047f(this.f21381S, this.f21380R, this.f21382T);
        this.f21376N = true;
        ?? r0 = this.f21370H;
        r0.getClass();
        r0.mo8669d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: v */
    public final void mo4110v() {
        this.f21375M = true;
        this.f21369G.post(this.f21367E);
    }

    /* JADX INFO: renamed from: w */
    public final void m9043w() {
        zzyi zzyiVar = new zzyi(this, this.f21395s, this.f21396t, this.f21365C, this, this.f21366D);
        if (this.f21376N) {
            zzgtr.m7133f(m9046z());
            long j2 = this.f21381S;
            if (j2 != -9223372036854775807L && this.f21390b0 > j2) {
                this.f21393e0 = true;
                this.f21390b0 = -9223372036854775807L;
                return;
            }
            zzahd zzahdVar = this.f21380R;
            zzahdVar.getClass();
            zzahe zzaheVar = zzahdVar.mo4064a(this.f21390b0).f5304a;
            long j3 = this.f21390b0;
            zzyiVar.f21340f.f5303a = zzaheVar.f5310b;
            zzyiVar.f21343i = j3;
            zzyiVar.f21342h = true;
            zzyiVar.f21346l = false;
            for (zzzc zzzcVar : this.f21373K) {
                zzzcVar.f21462s = this.f21390b0;
            }
            this.f21390b0 = -9223372036854775807L;
        }
        this.f21392d0 = m9044x();
        zzacf zzacfVar = this.f21364B;
        zzacfVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        zzacfVar.f4899c = null;
        zzaca zzacaVar = new zzaca(zzacfVar, looperMyLooper, zzyiVar, this, SystemClock.elapsedRealtime());
        zzacf zzacfVar2 = zzacaVar.f4893z;
        zzgtr.m7133f(zzacfVar2.f4898b == null);
        zzacfVar2.f4898b = zzacaVar;
        zzacaVar.m3944b();
    }

    /* JADX INFO: renamed from: x */
    public final int m9044x() {
        int i2 = 0;
        for (zzzc zzzcVar : this.f21373K) {
            i2 += zzzcVar.f21459p + zzzcVar.f21458o;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: y */
    public final long m9045y(boolean z) {
        zzzc zzzcVar;
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzzc[] zzzcVarArr = this.f21373K;
            if (i2 >= zzzcVarArr.length) {
                return jMax;
            }
            if (z) {
                zzzcVar = zzzcVarArr[i2];
                synchronized (zzzcVar) {
                    jMax = Math.max(jMax, zzzcVar.f21465v);
                }
            } else {
                zzyq zzyqVar = this.f21379Q;
                zzyqVar.getClass();
                if (zzyqVar.f21359c[i2]) {
                    zzzcVar = zzzcVarArr[i2];
                    synchronized (zzzcVar) {
                    }
                    jMax = Math.max(jMax, zzzcVar.f21465v);
                } else {
                    continue;
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m9046z() {
        return this.f21390b0 != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jM9045y;
        boolean z;
        long j2;
        m9035A();
        if (this.f21393e0 || this.f21387Y == 0) {
            return Long.MIN_VALUE;
        }
        if (m9046z()) {
            return this.f21390b0;
        }
        if (this.f21377O) {
            int length = this.f21373K.length;
            jM9045y = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                zzyq zzyqVar = this.f21379Q;
                if (zzyqVar.f21358b[i2] && zzyqVar.f21359c[i2]) {
                    zzzc zzzcVar = this.f21373K[i2];
                    synchronized (zzzcVar) {
                        z = zzzcVar.f21468y;
                    }
                    if (z) {
                        continue;
                    } else {
                        zzzc zzzcVar2 = this.f21373K[i2];
                        synchronized (zzzcVar2) {
                            j2 = zzzcVar2.f21465v;
                        }
                        jM9045y = Math.min(jM9045y, j2);
                    }
                }
            }
        } else {
            jM9045y = Long.MAX_VALUE;
        }
        if (jM9045y == LocationRequestCompat.PASSIVE_INTERVAL) {
            jM9045y = m9045y(false);
        }
        return jM9045y == Long.MIN_VALUE ? this.f21389a0 : jM9045y;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return zzb();
    }
}
