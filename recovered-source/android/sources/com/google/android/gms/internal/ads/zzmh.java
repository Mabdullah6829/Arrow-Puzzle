package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzmh {

    /* JADX INFO: renamed from: c */
    public final zzno f20395c;

    /* JADX INFO: renamed from: d */
    public final zzea f20396d;

    /* JADX INFO: renamed from: e */
    public long f20397e;

    /* JADX INFO: renamed from: f */
    public int f20398f;

    /* JADX INFO: renamed from: g */
    public boolean f20399g;

    /* JADX INFO: renamed from: h */
    public zzme f20400h;

    /* JADX INFO: renamed from: i */
    public zzme f20401i;

    /* JADX INFO: renamed from: j */
    public zzme f20402j;

    /* JADX INFO: renamed from: k */
    public zzme f20403k;

    /* JADX INFO: renamed from: l */
    public zzme f20404l;

    /* JADX INFO: renamed from: m */
    public int f20405m;

    /* JADX INFO: renamed from: n */
    public Object f20406n;

    /* JADX INFO: renamed from: o */
    public long f20407o;

    /* JADX INFO: renamed from: q */
    public final zzlp f20409q;

    /* JADX INFO: renamed from: a */
    public final zzbd f20393a = new zzbd();

    /* JADX INFO: renamed from: b */
    public final zzbe f20394b = new zzbe();

    /* JADX INFO: renamed from: p */
    public ArrayList f20408p = new ArrayList();

    public zzmh(zzno zznoVar, zzea zzeaVar, zzlp zzlpVar, zzjw zzjwVar) {
        this.f20395c = zznoVar;
        this.f20396d = zzeaVar;
        this.f20409q = zzlpVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzxl m8705a(zzbf zzbfVar, Object obj, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.mo4841o(obj, zzbdVar);
        zzbfVar.mo4736b(zzbdVar.f7634c, zzbeVar, 0L);
        zzbfVar.mo4739e(obj);
        zzbdVar.f7637f.getClass();
        zzbfVar.mo4841o(obj, zzbdVar);
        zzbdVar.f7637f.m5285a(-1);
        return new zzxl(obj, -1, j2);
    }

    /* JADX INFO: renamed from: A */
    public final zzme m8706A(zzxj zzxjVar) {
        for (int i2 = 0; i2 < this.f20408p.size(); i2++) {
            zzme zzmeVar = (zzme) this.f20408p.get(i2);
            if (zzmeVar.f20366a == zzxjVar) {
                return zzmeVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m8707B() {
        if (this.f20405m == 0) {
            return;
        }
        zzme zzmeVar = this.f20400h;
        zzmeVar.getClass();
        this.f20406n = zzmeVar.f20367b;
        this.f20407o = zzmeVar.f20372g.f20382a.f21281d;
        while (zzmeVar != null) {
            zzmeVar.m8699h();
            zzmeVar = zzmeVar.f20378m;
        }
        this.f20400h = null;
        this.f20403k = null;
        this.f20401i = null;
        this.f20402j = null;
        this.f20405m = 0;
        m8711b();
    }

    /* JADX INFO: renamed from: C */
    public final int m8708C(zzbf zzbfVar, long j2, long j3, long j4) {
        long j5;
        int i2;
        zzmf zzmfVarM8704a;
        zzme zzmeVar = this.f20400h;
        zzme zzmeVar2 = null;
        while (zzmeVar != null) {
            zzmf zzmfVar = zzmeVar.f20372g;
            zzxl zzxlVar = zzmfVar.f20382a;
            if (zzmeVar2 != null) {
                zzmf zzmfVarM8714e = m8714e(zzbfVar, zzmeVar2, j2);
                if (zzmfVarM8714e != null) {
                    long j6 = zzmfVar.f20384c;
                    if (zzxlVar.equals(zzmfVarM8714e.f20382a)) {
                        long j7 = zzmfVar.f20383b;
                        j5 = -9223372036854775807L;
                        long j8 = zzmfVarM8714e.f20383b;
                        if (j7 == j8) {
                            i2 = 0;
                        } else if (j6 != -9223372036854775807L) {
                            i2 = 0;
                            long j9 = zzmfVarM8714e.f20384c;
                            if (j9 != -9223372036854775807L) {
                                if (Math.abs((j8 - j9) - (j7 - j6)) >= 5000000) {
                                }
                            }
                        }
                        zzmfVarM8704a = j7 != j8 ? zzmfVarM8714e.m8704a(j7, j6) : zzmfVarM8714e;
                    }
                }
                return m8734y(zzmeVar2);
            }
            zzmfVarM8704a = m8709D(zzbfVar, zzmfVar);
            j5 = -9223372036854775807L;
            i2 = 0;
            long j10 = zzmfVar.f20385d;
            zzmeVar.f20372g = j10 == zzmfVarM8704a.f20385d ? zzmfVarM8704a : new zzmf(zzmfVarM8704a.f20382a, zzmfVarM8704a.f20383b, zzmfVarM8704a.f20384c, j10, zzmfVarM8704a.f20386e, zzmfVarM8704a.f20387f, zzmfVarM8704a.f20388g, zzmfVarM8704a.f20389h);
            long j11 = zzmfVar.f20386e;
            long j12 = zzmfVarM8704a.f20386e;
            if (j11 != j12) {
                long j13 = j12 == j5 ? LocationRequestCompat.PASSIVE_INTERVAL : j12 + zzmeVar.f20381p;
                int i3 = (zzmeVar != this.f20401i || (j3 != Long.MIN_VALUE && j3 < j13)) ? i2 : 1;
                int i4 = (zzmeVar != this.f20402j || (j4 != Long.MIN_VALUE && j4 < j13)) ? i2 : 1;
                int iM8734y = m8734y(zzmeVar);
                if (iM8734y != 0) {
                    return iM8734y;
                }
                int i5 = (i3 == 0 || (j11 == j5 && zzxlVar.f21282e == -1)) ? i2 : 1;
                return i4 != 0 ? i5 | 2 : i5;
            }
            zzmeVar2 = zzmeVar;
            zzmeVar = zzmeVar.f20378m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final zzmf m8709D(zzbf zzbfVar, zzmf zzmfVar) {
        zzxl zzxlVar = zzmfVar.f20382a;
        boolean zM9025b = zzxlVar.m9025b();
        int i2 = zzxlVar.f21282e;
        boolean z = !zM9025b && i2 == -1;
        boolean zM8717h = m8717h(zzbfVar, zzxlVar);
        boolean zM8718i = m8718i(zzbfVar, zzxlVar, z);
        long jM8719j = m8719j(zzbfVar, zzxlVar);
        Object obj = zzxlVar.f21278a;
        zzbd zzbdVar = this.f20393a;
        zzbfVar.mo4841o(obj, zzbdVar);
        if (zzxlVar.m9025b()) {
            zzbdVar.m4755c(zzxlVar.f21279b);
        } else if (i2 != -1) {
            zzbdVar.m4755c(i2);
        }
        return new zzmf(zzxlVar, zzmfVar.f20383b, zzmfVar.f20384c, zzmfVar.f20385d, jM8719j, z, zM8717h, zM8718i);
    }

    /* JADX INFO: renamed from: E */
    public final zzxl m8710E(zzbf zzbfVar, Object obj) {
        long jM8712c;
        int iMo4739e;
        zzbd zzbdVar = this.f20393a;
        int i2 = zzbfVar.mo4841o(obj, zzbdVar).f7634c;
        Object obj2 = this.f20406n;
        if (obj2 == null || (iMo4739e = zzbfVar.mo4739e(obj2)) == -1 || zzbfVar.mo4738d(iMo4739e, zzbdVar, false).f7634c != i2) {
            zzme zzmeVar = this.f20400h;
            while (true) {
                if (zzmeVar == null) {
                    zzme zzmeVar2 = this.f20400h;
                    while (true) {
                        if (zzmeVar2 == null) {
                            jM8712c = m8712c(obj);
                            if (jM8712c != -1) {
                                break;
                            }
                            jM8712c = this.f20397e;
                            this.f20397e = 1 + jM8712c;
                            if (this.f20400h != null) {
                                break;
                            }
                            this.f20406n = obj;
                            this.f20407o = jM8712c;
                            break;
                        }
                        int iMo4739e2 = zzbfVar.mo4739e(zzmeVar2.f20367b);
                        if (iMo4739e2 != -1 && zzbfVar.mo4738d(iMo4739e2, zzbdVar, false).f7634c == i2) {
                            jM8712c = zzmeVar2.f20372g.f20382a.f21281d;
                            break;
                        }
                        zzmeVar2 = zzmeVar2.f20378m;
                    }
                } else {
                    if (zzmeVar.f20367b.equals(obj)) {
                        jM8712c = zzmeVar.f20372g.f20382a.f21281d;
                        break;
                    }
                    zzmeVar = zzmeVar.f20378m;
                }
            }
        } else {
            jM8712c = this.f20407o;
        }
        long j2 = jM8712c;
        zzbfVar.mo4841o(obj, zzbdVar);
        int i3 = zzbdVar.f7634c;
        zzbe zzbeVar = this.f20394b;
        zzbfVar.mo4736b(i3, zzbeVar, 0L);
        for (int iMo4739e3 = zzbfVar.mo4739e(obj); iMo4739e3 >= zzbeVar.f7685k; iMo4739e3--) {
            zzbfVar.mo4738d(iMo4739e3, zzbdVar, true);
            zzbdVar.f7637f.getClass();
            zzbdVar.f7637f.m5285a(-1);
        }
        return m8705a(zzbfVar, obj, j2, zzbeVar, zzbdVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m8711b() {
        zzgzi zzgziVar = zzgwt.f18303t;
        final zzgwq zzgwqVar = new zzgwq();
        for (zzme zzmeVar = this.f20400h; zzmeVar != null; zzmeVar = zzmeVar.f20378m) {
            zzgwqVar.m7203c(zzmeVar.f20372g.f20382a);
        }
        zzme zzmeVar2 = this.f20401i;
        final zzxl zzxlVar = zzmeVar2 == null ? null : zzmeVar2.f20372g.f20382a;
        this.f20396d.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f20390s.f20395c.mo8802o(zzgwqVar.m7214f(), zzxlVar);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final long m8712c(Object obj) {
        for (int i2 = 0; i2 < this.f20408p.size(); i2++) {
            zzme zzmeVar = (zzme) this.f20408p.get(i2);
            if (zzmeVar.f20367b.equals(obj)) {
                return zzmeVar.f20372g.f20382a.f21281d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: d */
    public final int m8713d(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzme zzmeVar;
        zzme zzmeVar2 = this.f20400h;
        if (zzmeVar2 == null) {
            return 0;
        }
        int iMo4739e = zzbfVar.mo4739e(zzmeVar2.f20367b);
        while (true) {
            zzbfVar2 = zzbfVar;
            iMo4739e = zzbfVar2.m4838l(iMo4739e, this.f20393a, this.f20394b, this.f20398f, this.f20399g);
            while (true) {
                zzmeVar = zzmeVar2.f20378m;
                if (zzmeVar == null || zzmeVar2.f20372g.f20387f) {
                    break;
                }
                zzmeVar2 = zzmeVar;
            }
            if (iMo4739e == -1 || zzmeVar == null || zzbfVar2.mo4739e(zzmeVar.f20367b) != iMo4739e) {
                break;
            }
            zzmeVar2 = zzmeVar;
            zzbfVar = zzbfVar2;
        }
        int iM8734y = m8734y(zzmeVar2);
        zzmeVar2.f20372g = m8709D(zzbfVar2, zzmeVar2.f20372g);
        return iM8734y;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX INFO: renamed from: e */
    public final zzmf m8714e(zzbf zzbfVar, zzme zzmeVar, long j2) {
        int i2;
        int i3;
        zzbf zzbfVar2;
        int i4;
        zzbd zzbdVar;
        long j3;
        long jLongValue;
        long jMax;
        int i5;
        zzbe zzbeVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        long jMax2;
        long jM8712c;
        zzmf zzmfVar = zzmeVar.f20372g;
        long j7 = zzmeVar.f20381p;
        long j8 = zzmfVar.f20386e;
        long j9 = zzmfVar.f20385d;
        zzxl zzxlVar = zzmfVar.f20382a;
        boolean z = zzmfVar.f20387f;
        long j10 = (j7 + j8) - j2;
        zzbd zzbdVar2 = this.f20393a;
        long j11 = -9223372036854775807L;
        if (z) {
            Object obj2 = zzxlVar.f21278a;
            int iMo4739e = zzbfVar.mo4739e(obj2);
            int i6 = this.f20398f;
            boolean z2 = this.f20399g;
            zzbd zzbdVar3 = this.f20393a;
            zzbe zzbeVar2 = this.f20394b;
            long j12 = 0;
            int iM4838l = zzbfVar.m4838l(iMo4739e, zzbdVar3, zzbeVar2, i6, z2);
            if (iM4838l != -1) {
                int i7 = zzbfVar.mo4738d(iM4838l, zzbdVar3, true).f7634c;
                Object obj3 = zzbdVar3.f7633b;
                obj3.getClass();
                long j13 = zzxlVar.f21281d;
                if (zzbfVar.mo4736b(i7, zzbeVar2, 0L).f7685k == iM4838l) {
                    int i8 = zzbdVar3.f7634c;
                    if (zzbdVar3.f7635d == -9223372036854775807L) {
                        zzbfVar.mo4736b(i8, zzbeVar2, 0L);
                        if (!zzbeVar2.f7681g || zzbeVar2.f7683i) {
                            jMax2 = -9223372036854775807L;
                        } else {
                            jMax2 = Math.max(0L, j10);
                        }
                    } else {
                        jMax2 = -9223372036854775807L;
                    }
                    Pair pairM4840n = zzbfVar.m4840n(zzbeVar2, zzbdVar3, i7, -9223372036854775807L, jMax2);
                    if (pairM4840n != null) {
                        Object obj4 = pairM4840n.first;
                        long jLongValue2 = ((Long) pairM4840n.second).longValue();
                        zzme zzmeVar2 = zzmeVar.f20378m;
                        if (zzmeVar2 == null || !zzmeVar2.f20367b.equals(obj4)) {
                            jM8712c = m8712c(obj4);
                            if (jM8712c == -1) {
                                jM8712c = this.f20397e;
                                this.f20397e = 1 + jM8712c;
                            }
                        } else {
                            jM8712c = zzmeVar2.f20372g.f20382a.f21281d;
                        }
                        zzbeVar = zzbeVar2;
                        obj = obj4;
                        j5 = jM8712c;
                        j12 = jLongValue2;
                        j4 = jMax2;
                        j6 = -9223372036854775807L;
                    }
                } else {
                    zzbeVar = zzbeVar2;
                    obj = obj3;
                    j4 = -9223372036854775807L;
                    j5 = j13;
                    j6 = 0;
                }
                zzxl zzxlVarM8705a = m8705a(zzbfVar, obj, j5, zzbeVar, zzbdVar3);
                if (j6 != -9223372036854775807L && j9 != -9223372036854775807L) {
                    zzbfVar.mo4841o(obj2, zzbdVar3).f7637f.getClass();
                    zzbdVar3.f7637f.getClass();
                }
                Object obj5 = zzxlVarM8705a.f21278a;
                zzbfVar.mo4841o(obj5, zzbdVar2);
                return zzxlVarM8705a.m9025b() ? m8715f(zzbfVar, obj5, zzxlVarM8705a.f21279b, zzxlVarM8705a.f21280c, j6, zzxlVarM8705a.f21281d) : m8716g(zzbfVar, obj5, j12, j4, j6, zzxlVarM8705a.f21281d);
            }
            return null;
        }
        Object obj6 = zzxlVar.f21278a;
        zzbfVar.mo4841o(obj6, zzbdVar2);
        if (!zzxlVar.m9025b()) {
            int i9 = zzxlVar.f21282e;
            if (i9 != -1) {
                zzbdVar2.f7637f.getClass();
                if (i9 == -1) {
                    zzbdVar2.f7637f.m5285a(-1);
                    i2 = -1;
                } else {
                    i2 = i9;
                }
            } else {
                i2 = i9;
            }
            zza zzaVarM5285a = zzbdVar2.f7637f.m5285a(i2);
            int i10 = 0;
            while (true) {
                int[] iArr = zzaVarM5285a.f4742d;
                if (i10 >= iArr.length || (i3 = iArr[i10]) == 0 || i3 == 1) {
                    break;
                }
                i10++;
            }
            zzbdVar2.m4755c(i2);
            if (i10 != zzbdVar2.f7637f.m5285a(i2).f4739a) {
                return m8715f(zzbfVar, obj6, i2, i10, j8, zzxlVar.f21281d);
            }
            zzbfVar.mo4841o(obj6, zzbdVar2);
            zzbdVar2.f7637f.m5285a(i2).getClass();
            zzbdVar2.f7637f.m5285a(i2).getClass();
            return m8716g(zzbfVar, obj6, 0L, -9223372036854775807L, j8, zzxlVar.f21281d);
        }
        int i11 = zzxlVar.f21279b;
        if (zzbdVar2.f7637f.m5285a(i11).f4739a == -1) {
            return null;
        }
        int i12 = zzxlVar.f21280c;
        zza zzaVarM5285a2 = zzbdVar2.f7637f.m5285a(i11);
        int i13 = 1;
        int i14 = i12 + 1;
        while (true) {
            int[] iArr2 = zzaVarM5285a2.f4742d;
            if (i14 >= iArr2.length || (i5 = iArr2[i14]) == 0 || i5 == i13) {
                break;
            }
            i14++;
            i13 = 1;
        }
        if (i14 < 0) {
            return m8715f(zzbfVar, obj6, i11, i14, zzmfVar.f20385d, zzxlVar.f21281d);
        }
        if (j9 == -9223372036854775807L) {
            int i15 = zzbdVar2.f7634c;
            long j14 = zzbdVar2.f7635d;
            zzbe zzbeVar3 = this.f20394b;
            if (j14 == -9223372036854775807L) {
                zzbfVar.mo4736b(i15, zzbeVar3, 0L);
                if (!zzbeVar3.f7681g || zzbeVar3.f7683i) {
                    jMax = -9223372036854775807L;
                } else {
                    jMax = Math.max(0L, j10);
                }
            } else {
                jMax = -9223372036854775807L;
            }
            i4 = i11;
            zzbdVar = zzbdVar2;
            zzbfVar2 = zzbfVar;
            Pair pairM4840n2 = zzbfVar2.m4840n(zzbeVar3, zzbdVar, zzbdVar2.f7634c, -9223372036854775807L, jMax);
            if (pairM4840n2 == null) {
                return null;
            }
            jLongValue = ((Long) pairM4840n2.second).longValue();
            j3 = jMax;
        } else {
            zzbfVar2 = zzbfVar;
            i4 = i11;
            zzbdVar = zzbdVar2;
            j3 = -9223372036854775807L;
            jLongValue = j9;
            j11 = jLongValue;
        }
        zzbfVar2.mo4841o(obj6, zzbdVar);
        zzbdVar.f7637f.m5285a(i4).getClass();
        zzbdVar.f7637f.m5285a(i4).getClass();
        return m8716g(zzbfVar2, obj6, Math.max(0L, jLongValue), j3, j11, zzxlVar.f21281d);
    }

    /* JADX INFO: renamed from: f */
    public final zzmf m8715f(zzbf zzbfVar, Object obj, int i2, int i3, long j2, long j3) {
        int i4;
        zzxl zzxlVar = new zzxl(obj, i2, i3, j3, -1);
        zzbd zzbdVar = this.f20393a;
        long jM4754b = zzbfVar.mo4841o(obj, zzbdVar).m4754b(i2, i3);
        zza zzaVarM5285a = zzbdVar.f7637f.m5285a(i2);
        int i5 = 0;
        while (true) {
            int[] iArr = zzaVarM5285a.f4742d;
            if (i5 >= iArr.length || (i4 = iArr[i5]) == 0 || i4 == 1) {
                break;
            }
            i5++;
        }
        if (i3 == i5) {
            zzbdVar.f7637f.getClass();
        }
        zzbdVar.m4755c(i2);
        long jMax = 0;
        if (jM4754b != -9223372036854775807L && jM4754b <= 0) {
            jMax = Math.max(0L, (-1) + jM4754b);
        }
        return new zzmf(zzxlVar, jMax, -9223372036854775807L, j2, jM4754b, false, false, false);
    }

    /* JADX INFO: renamed from: g */
    public final zzmf m8716g(zzbf zzbfVar, Object obj, long j2, long j3, long j4, long j5) {
        zzbd zzbdVar = this.f20393a;
        zzbfVar.mo4841o(obj, zzbdVar);
        zzbdVar.getClass();
        zzxl zzxlVar = new zzxl(obj, -1, j5);
        boolean z = !zzxlVar.m9025b();
        boolean zM8717h = m8717h(zzbfVar, zzxlVar);
        boolean zM8718i = m8718i(zzbfVar, zzxlVar, z);
        long jM8719j = m8719j(zzbfVar, zzxlVar);
        return new zzmf(zzxlVar, (jM8719j == -9223372036854775807L || j2 < jM8719j) ? j2 : Math.max(0L, (-1) + jM8719j), j3, j4, jM8719j, z, zM8717h, zM8718i);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8717h(zzbf zzbfVar, zzxl zzxlVar) {
        if (!zzxlVar.m9025b() && zzxlVar.f21282e == -1) {
            Object obj = zzxlVar.f21278a;
            int i2 = zzbfVar.mo4841o(obj, this.f20393a).f7634c;
            if (zzbfVar.mo4736b(i2, this.f20394b, 0L).f7686l == zzbfVar.mo4739e(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8718i(zzbf zzbfVar, zzxl zzxlVar, boolean z) {
        int iMo4739e = zzbfVar.mo4739e(zzxlVar.f21278a);
        zzbd zzbdVar = this.f20393a;
        int i2 = zzbfVar.mo4738d(iMo4739e, zzbdVar, false).f7634c;
        zzbe zzbeVar = this.f20394b;
        return !zzbfVar.mo4736b(i2, zzbeVar, 0L).f7681g && zzbfVar.m4838l(iMo4739e, zzbdVar, zzbeVar, this.f20398f, this.f20399g) == -1 && z;
    }

    /* JADX INFO: renamed from: j */
    public final long m8719j(zzbf zzbfVar, zzxl zzxlVar) {
        Object obj = zzxlVar.f21278a;
        zzbd zzbdVar = this.f20393a;
        zzbfVar.mo4841o(obj, zzbdVar);
        if (zzxlVar.m9025b()) {
            return zzbdVar.m4754b(zzxlVar.f21279b, zzxlVar.f21280c);
        }
        int i2 = zzxlVar.f21282e;
        if (i2 == -1) {
            return zzbdVar.f7635d;
        }
        zzbdVar.f7637f.m5285a(i2).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public final int m8720k(zzbf zzbfVar, int i2) {
        this.f20398f = i2;
        return m8713d(zzbfVar);
    }

    /* JADX INFO: renamed from: l */
    public final int m8721l(zzbf zzbfVar, boolean z) {
        this.f20399g = z;
        return m8713d(zzbfVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m8722m(zzjw zzjwVar) {
        zzjwVar.getClass();
        m8727r();
    }

    /* JADX INFO: renamed from: n */
    public final void m8723n(long j2) {
        zzme zzmeVar = this.f20403k;
        if (zzmeVar != null) {
            zzgtr.m7133f(zzmeVar.f20378m == null);
            if (zzmeVar.f20370e) {
                zzmeVar.f20366a.mo9005b(j2 - zzmeVar.f20381p);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m8724o() {
        zzme zzmeVar = this.f20403k;
        if (zzmeVar != null) {
            return !zzmeVar.f20372g.f20389h && zzmeVar.m8693b() && this.f20403k.f20372g.f20386e != -9223372036854775807L && this.f20405m < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final zzmf m8725p(long j2, zzmu zzmuVar) {
        zzme zzmeVar = this.f20403k;
        if (zzmeVar != null) {
            return m8714e(zzmuVar.f20456a, zzmeVar, j2);
        }
        zzbf zzbfVar = zzmuVar.f20456a;
        zzxl zzxlVar = zzmuVar.f20457b;
        long j3 = zzmuVar.f20458c;
        long j4 = zzmuVar.f20473r;
        Object obj = zzxlVar.f21278a;
        zzbfVar.mo4841o(obj, this.f20393a);
        return zzxlVar.m9025b() ? m8715f(zzbfVar, obj, zzxlVar.f21279b, zzxlVar.f21280c, j3, zzxlVar.f21281d) : m8716g(zzbfVar, obj, j4, -9223372036854775807L, j3, zzxlVar.f21281d);
    }

    /* JADX INFO: renamed from: q */
    public final zzme m8726q(zzmf zzmfVar) {
        zzme zzmeVar;
        long j2 = zzmfVar.f20383b;
        zzme zzmeVar2 = this.f20403k;
        long j3 = zzmeVar2 == null ? 1000000000000L : (zzmeVar2.f20381p + zzmeVar2.f20372g.f20386e) - j2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f20408p.size()) {
                zzmeVar = null;
                break;
            }
            zzmf zzmfVar2 = ((zzme) this.f20408p.get(i2)).f20372g;
            long j4 = zzmfVar2.f20386e;
            long j5 = zzmfVar.f20386e;
            if ((j4 == -9223372036854775807L || j4 == j5) && zzmfVar2.f20383b == j2 && zzmfVar2.f20382a.equals(zzmfVar.f20382a)) {
                zzmeVar = (zzme) this.f20408p.remove(i2);
                break;
            }
            i2++;
        }
        if (zzmeVar == null) {
            zzlw zzlwVar = this.f20409q.f20280a;
            zzabm zzabmVarMo5526f = zzlwVar.f20347x.mo5526f(zzlwVar.f20306L);
            zzlwVar.f20337q0.getClass();
            zzmeVar = new zzme(zzlwVar.f20341t, j3, zzlwVar.f20345v, zzabmVarMo5526f, zzlwVar.f20304J, zzmfVar, zzlwVar.f20346w);
        } else {
            zzmeVar.f20372g = zzmfVar;
            zzmeVar.f20381p = j3;
        }
        zzme zzmeVar3 = this.f20403k;
        if (zzmeVar3 == null) {
            this.f20400h = zzmeVar;
            this.f20401i = zzmeVar;
            this.f20402j = zzmeVar;
        } else if (zzmeVar != zzmeVar3.f20378m) {
            zzmeVar3.m8703l();
            zzmeVar3.f20378m = zzmeVar;
        }
        this.f20406n = null;
        this.f20403k = zzmeVar;
        this.f20405m++;
        m8711b();
        return zzmeVar;
    }

    /* JADX INFO: renamed from: r */
    public final void m8727r() {
        if (this.f20408p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f20408p.size(); i2++) {
            ((zzme) this.f20408p.get(i2)).m8699h();
        }
        this.f20408p = arrayList;
        this.f20404l = null;
        m8735z();
    }

    /* JADX INFO: renamed from: s */
    public final zzme m8728s() {
        return this.f20400h;
    }

    /* JADX INFO: renamed from: t */
    public final zzme m8729t() {
        return this.f20401i;
    }

    /* JADX INFO: renamed from: u */
    public final zzme m8730u() {
        return this.f20402j;
    }

    /* JADX INFO: renamed from: v */
    public final zzme m8731v() {
        zzme zzmeVar = this.f20402j;
        zzme zzmeVar2 = this.f20401i;
        if (zzmeVar == zzmeVar2) {
            zzmeVar2.getClass();
            this.f20402j = zzmeVar2.f20378m;
        }
        zzmeVar2.getClass();
        this.f20401i = zzmeVar2.f20378m;
        m8711b();
        zzme zzmeVar3 = this.f20401i;
        zzmeVar3.getClass();
        return zzmeVar3;
    }

    /* JADX INFO: renamed from: w */
    public final void m8732w() {
        zzme zzmeVar;
        zzme zzmeVar2 = this.f20402j;
        if (zzmeVar2 == null || (zzmeVar = zzmeVar2.f20378m) == null) {
            throw null;
        }
        this.f20402j = zzmeVar;
        m8711b();
    }

    /* JADX INFO: renamed from: x */
    public final zzme m8733x() {
        zzme zzmeVar = this.f20400h;
        if (zzmeVar == null) {
            return null;
        }
        if (zzmeVar == this.f20401i) {
            this.f20401i = zzmeVar.f20378m;
        }
        if (zzmeVar == this.f20402j) {
            this.f20402j = zzmeVar.f20378m;
        }
        zzmeVar.m8699h();
        int i2 = this.f20405m - 1;
        this.f20405m = i2;
        if (i2 == 0) {
            this.f20403k = null;
            zzme zzmeVar2 = this.f20400h;
            this.f20406n = zzmeVar2.f20367b;
            this.f20407o = zzmeVar2.f20372g.f20382a.f21281d;
        }
        this.f20400h = this.f20400h.f20378m;
        m8711b();
        return this.f20400h;
    }

    /* JADX INFO: renamed from: y */
    public final int m8734y(zzme zzmeVar) {
        zzmeVar.getClass();
        int i2 = 0;
        if (zzmeVar.equals(this.f20403k)) {
            return 0;
        }
        this.f20403k = zzmeVar;
        int i3 = 0;
        while (true) {
            zzmeVar = zzmeVar.f20378m;
            if (zzmeVar == null) {
                break;
            }
            if (zzmeVar == this.f20401i) {
                zzme zzmeVar2 = this.f20400h;
                this.f20401i = zzmeVar2;
                this.f20402j = zzmeVar2;
                i3 = 3;
            }
            if (zzmeVar == this.f20402j) {
                this.f20402j = this.f20401i;
                i3 |= 2;
            }
            zzmeVar.m8699h();
            this.f20405m--;
        }
        zzme zzmeVar3 = this.f20403k;
        zzmeVar3.getClass();
        if (zzmeVar3.f20378m != null) {
            zzmeVar3.m8703l();
            zzmeVar3.f20378m = null;
            while (true) {
                zzabj zzabjVar = zzmeVar3.f20380o;
                if (i2 >= zzabjVar.f4844a) {
                    break;
                }
                zzabjVar.m3924a(i2);
                zzabb zzabbVar = zzmeVar3.f20380o.f4846c[i2];
                i2++;
            }
        }
        m8711b();
        return i3;
    }

    /* JADX INFO: renamed from: z */
    public final void m8735z() {
        zzme zzmeVar = this.f20404l;
        if (zzmeVar == null || zzmeVar.m8694c()) {
            this.f20404l = null;
            for (int i2 = 0; i2 < this.f20408p.size(); i2++) {
                zzme zzmeVar2 = (zzme) this.f20408p.get(i2);
                if (!zzmeVar2.m8694c()) {
                    this.f20404l = zzmeVar2;
                    return;
                }
            }
        }
    }
}
