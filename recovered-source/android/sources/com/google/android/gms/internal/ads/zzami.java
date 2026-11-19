package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzami implements zzaga {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ int f5939G = 0;

    /* JADX INFO: renamed from: A */
    public int f5940A;

    /* JADX INFO: renamed from: B */
    public long f5941B;

    /* JADX INFO: renamed from: C */
    public zzagd f5942C;

    /* JADX INFO: renamed from: D */
    public zzamh[] f5943D;

    /* JADX INFO: renamed from: E */
    public long[][] f5944E;

    /* JADX INFO: renamed from: F */
    public int f5945F;

    /* JADX INFO: renamed from: a */
    public final zzanq f5946a;

    /* JADX INFO: renamed from: b */
    public final int f5947b;

    /* JADX INFO: renamed from: c */
    public final zzeu f5948c;

    /* JADX INFO: renamed from: d */
    public final zzeu f5949d;

    /* JADX INFO: renamed from: e */
    public final zzeu f5950e;

    /* JADX INFO: renamed from: f */
    public final zzeu f5951f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f5952g;

    /* JADX INFO: renamed from: h */
    public final zzamm f5953h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f5954i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f5955j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f5956k;

    /* JADX INFO: renamed from: l */
    public zzgwt f5957l;

    /* JADX INFO: renamed from: m */
    public int f5958m;

    /* JADX INFO: renamed from: n */
    public int f5959n;

    /* JADX INFO: renamed from: o */
    public long f5960o;

    /* JADX INFO: renamed from: p */
    public int f5961p;

    /* JADX INFO: renamed from: q */
    public zzeu f5962q;

    /* JADX INFO: renamed from: r */
    public int f5963r;

    /* JADX INFO: renamed from: s */
    public int f5964s;

    /* JADX INFO: renamed from: t */
    public int f5965t;

    /* JADX INFO: renamed from: u */
    public int f5966u;

    /* JADX INFO: renamed from: v */
    public boolean f5967v;

    /* JADX INFO: renamed from: w */
    public boolean f5968w;

    /* JADX INFO: renamed from: x */
    public boolean f5969x;

    /* JADX INFO: renamed from: y */
    public boolean f5970y;

    /* JADX INFO: renamed from: z */
    public int f5971z;

    @Deprecated
    public zzami() {
        this(16, zzanq.f6138a);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x02da  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x031f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0327  */
    /* JADX WARN: Code duplicated, block: B:149:0x0339 A[LOOP:5: B:145:0x0325->B:149:0x0339, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x033c A[EDGE_INSN: B:150:0x033c->B:151:0x0340 BREAK  A[LOOP:5: B:145:0x0325->B:149:0x0339], PHI: r32
  0x033c: PHI (r32v1 java.util.ArrayList) = (r32v0 java.util.ArrayList), (r32v2 java.util.ArrayList) binds: [B:143:0x031d, B:234:0x033c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0344  */
    /* JADX WARN: Code duplicated, block: B:234:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0337 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m4223a(long j2) {
        zzap zzapVarM4195e;
        zzap zzapVarM4193c;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        long j3;
        int i6;
        int i7;
        zzap zzapVar;
        ArrayList arrayList3;
        zzap zzapVar2;
        zzap zzapVar3;
        zzap zzapVar4;
        String str;
        zzv zzvVar;
        boolean zEquals;
        int i8;
        ArrayList arrayList4;
        boolean z;
        zzamh zzamhVar;
        int size;
        ArrayList arrayList5;
        int size2;
        int i9;
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        while (true) {
            ArrayDeque arrayDeque = this.f5952g;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).f16829b != j2) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque.pop();
            if (zzfzVar.f16892a == 1836019574) {
                zzfz zzfzVarM6801c = zzfzVar.m6801c(1835365473);
                ArrayList arrayList6 = new ArrayList();
                if (zzfzVarM6801c != null) {
                    zzapVarM4195e = zzalo.m4195e(zzfzVarM6801c);
                    if (this.f5970y) {
                        zzapVarM4195e.getClass();
                        zzfx zzfxVar = (zzfx) zzapVarM4195e.m4286a(zzfx.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzamb
                            @Override // com.google.android.gms.internal.ads.zzgts
                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ boolean mo3897b(Object obj2) {
                                int i14 = zzami.f5939G;
                                return ((zzfx) obj2).f16731a.equals("auxiliary.tracks.interleaved");
                            }
                        });
                        if (zzfxVar != null && zzfxVar.f16732b[0] == 0) {
                            this.f5941B = 16 + 0;
                        }
                        zzfx zzfxVar2 = (zzfx) zzapVarM4195e.m4286a(zzfx.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzamc
                            @Override // com.google.android.gms.internal.ads.zzgts
                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ boolean mo3897b(Object obj2) {
                                int i14 = zzami.f5939G;
                                return ((zzfx) obj2).f16731a.equals("auxiliary.tracks.map");
                            }
                        });
                        zzfxVar2.getClass();
                        ArrayList arrayListM6754b = zzfxVar2.m6754b();
                        ArrayList arrayList7 = new ArrayList(arrayListM6754b.size());
                        for (int i14 = 0; i14 < arrayListM6754b.size(); i14++) {
                            int iIntValue = ((Integer) arrayListM6754b.get(i14)).intValue();
                            if (iIntValue == 0) {
                                i13 = 1;
                            } else if (iIntValue != 1) {
                                i13 = 3;
                                if (iIntValue != 2) {
                                    i13 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i13 = 2;
                            }
                            arrayList7.add(Integer.valueOf(i13));
                        }
                        arrayList6 = arrayList7;
                    }
                } else {
                    zzapVarM4195e = null;
                }
                ArrayList arrayList8 = new ArrayList();
                int i15 = this.f5945F;
                ArrayList arrayList9 = arrayList6;
                zzagt zzagtVar = new zzagt();
                zzga zzgaVarM6800b = zzfzVar.m6800b(1969517665);
                if (zzgaVarM6800b != null) {
                    zzapVarM4193c = zzalo.m4193c(zzgaVarM6800b);
                    zzagtVar.m4123a(zzapVarM4193c);
                } else {
                    zzapVarM4193c = null;
                }
                long j4 = 0;
                zzga zzgaVarM6800b2 = zzfzVar.m6800b(1836476516);
                zzgaVarM6800b2.getClass();
                boolean z2 = 1 == i15;
                zzap zzapVar5 = new zzap(zzalo.m4194d(zzgaVarM6800b2.f16879b));
                ArrayList arrayList10 = arrayList8;
                ArrayList arrayList11 = arrayList9;
                zzap zzapVar6 = zzapVarM4193c;
                ArrayList arrayListM4192b = zzalo.m4192b(zzfzVar, zzagtVar, -9223372036854775807L, null, false, z2, new zzgti() { // from class: com.google.android.gms.internal.ads.zzamf
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj2) {
                        zzamp zzampVar = (zzamp) obj2;
                        int i16 = zzami.f5939G;
                        return zzampVar;
                    }
                });
                if (this.f5970y) {
                    boolean z3 = arrayList11.size() == arrayListM4192b.size();
                    Locale locale = Locale.US;
                    zzgtr.m7134g("The number of auxiliary track types from metadata (" + arrayList11.size() + ") is not same as the number of auxiliary tracks (" + arrayListM4192b.size() + ")", z3);
                }
                ArrayList arrayList12 = new ArrayList();
                int size3 = arrayListM4192b.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj2 = arrayListM4192b.get(i16);
                    i16++;
                    int i17 = ((zzams) obj2).f6032a.f6007l;
                    if (i17 != -1) {
                        Integer numValueOf = Integer.valueOf(i17);
                        if (!arrayList12.contains(numValueOf)) {
                            arrayList12.add(numValueOf);
                        }
                    }
                }
                ArrayList arrayList13 = this.f5955j;
                arrayList13.clear();
                int size4 = arrayListM4192b.size();
                int i18 = 0;
                while (i18 < size4) {
                    Object obj3 = arrayListM4192b.get(i18);
                    i18++;
                    zzams zzamsVar = (zzams) obj3;
                    if (arrayList12.contains(Integer.valueOf(zzamsVar.f6032a.f5996a))) {
                        arrayList13.add(zzamsVar);
                    }
                }
                String strM4221a = zzalz.m4221a(arrayListM4192b);
                int i19 = -1;
                int i20 = 0;
                int i21 = 0;
                long j5 = -9223372036854775807L;
                while (i20 < arrayListM4192b.size()) {
                    zzams zzamsVar2 = (zzams) arrayListM4192b.get(i20);
                    int i22 = zzamsVar2.f6033b;
                    ArrayDeque arrayDeque2 = arrayDeque;
                    long[] jArr = zzamsVar2.f6037f;
                    int[] iArr = zzamsVar2.f6039h;
                    int i23 = zzamsVar2.f6036e;
                    if (i22 == 0) {
                        arrayList = arrayListM4192b;
                    } else {
                        zzamp zzampVar = zzamsVar2.f6032a;
                        arrayList = arrayListM4192b;
                        if (zzampVar.f6008m) {
                            ArrayList arrayList14 = arrayList13;
                            zzagd zzagdVar = this.f5942C;
                            i2 = i21 + 1;
                            String str2 = strM4221a;
                            int i24 = zzampVar.f5997b;
                            zzahm zzahmVarMo4109f = zzagdVar.mo4109f(i21, i24);
                            zzamh zzamhVar2 = new zzamh(zzampVar, zzamsVar2, zzahmVarMo4109f);
                            zzap zzapVar7 = zzapVarM4195e;
                            zzap zzapVar8 = zzapVar6;
                            long j6 = zzampVar.f6000e;
                            if (j6 == -9223372036854775807L) {
                                j6 = zzamsVar2.f6040i;
                            }
                            zzahmVarMo4109f.getClass();
                            long jMax = Math.max(j5, j6);
                            zzv zzvVar2 = zzampVar.f6002g;
                            String str3 = zzvVar2.f21061o;
                            int i25 = "audio/true-hd".equals(str3) ? i23 * 16 : i23 + 30;
                            zzt zztVar = new zzt(zzvVar2);
                            zztVar.f20803o = i25;
                            if (i24 == 2) {
                                int i26 = zzvVar2.f21052f;
                                if ((this.f5947b & 8) != 0) {
                                    i3 = i19;
                                    i26 |= i3 == -1 ? 1 : 2;
                                } else {
                                    i3 = i19;
                                }
                                int i27 = i26;
                                if (this.f5970y) {
                                    zztVar.f20795g = ((Integer) arrayList11.get(i20)).intValue();
                                    i12 = i27 | 32768;
                                } else {
                                    i12 = i27;
                                }
                                zztVar.f20794f = i12;
                                i24 = 2;
                            } else {
                                i3 = i19;
                            }
                            if (zzas.m4350b(str3)) {
                                i4 = i20;
                                boolean z4 = zzamsVar2.f6041j;
                                int iMin = Math.min(!z4 ? iArr.length : i22, 20);
                                zzgtr.m7133f(j6 != -9223372036854775807L);
                                i5 = i3;
                                arrayList2 = arrayList11;
                                long jMin = Math.min(j6, 10000000L);
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = -1;
                                while (i28 < iMin) {
                                    int i31 = z4 ? i28 : iArr[i28];
                                    long j7 = jArr[i31];
                                    if (j7 > jMin) {
                                        break;
                                    }
                                    if (j7 >= 0) {
                                        i6 = iMin;
                                        int i32 = zzamsVar2.f6035d[i31];
                                        if (i32 > i29) {
                                            i29 = i32;
                                            i30 = i31;
                                        }
                                    } else {
                                        i6 = iMin;
                                    }
                                    i28++;
                                    iMin = i6;
                                }
                                if (i30 != -1) {
                                    j3 = jArr[i30];
                                }
                                if (j3 != -9223372036854775807L) {
                                    i7 = 1;
                                    zzapVar = new zzap(new zzajd(j3));
                                } else {
                                    i7 = 1;
                                    zzapVar = null;
                                }
                                if (i24 == i7 && (i10 = zzagtVar.f5268a) != -1 && (i11 = zzagtVar.f5269b) != -1) {
                                    zztVar.f20784J = i10;
                                    zztVar.f20785K = i11;
                                }
                                zzap zzapVar9 = zzvVar2.f21058l;
                                arrayList3 = this.f5954i;
                                if (arrayList3.isEmpty()) {
                                    zzapVar2 = null;
                                } else {
                                    zzapVar2 = new zzap(arrayList3);
                                }
                                zzapVar3 = zzapVar8;
                                zzap[] zzapVarArr = {zzapVar2, zzapVar3, zzapVar5, zzapVar};
                                zzapVar4 = zzapVar7;
                                zzaly.m4216a(i24, zzapVar4, zztVar, zzapVar9, zzapVarArr);
                                str = str2;
                                zztVar.m8852d(str);
                                zzvVar = new zzv(zztVar);
                                zEquals = Objects.equals(str3, "audio/mpeg");
                                i8 = zzampVar.f6007l;
                                if (i8 != -1) {
                                    arrayList4 = arrayList14;
                                    z = false;
                                    break;
                                }
                                size2 = arrayList14.size();
                                i9 = 0;
                                while (true) {
                                    if (i9 < size2) {
                                        arrayList4 = arrayList14;
                                        z = false;
                                        break;
                                    }
                                    arrayList4 = arrayList14;
                                    obj = arrayList4.get(i9);
                                    i9++;
                                    if (((zzams) obj).f6032a.f5996a == i8) {
                                        z = true;
                                        break;
                                    }
                                    arrayList14 = arrayList4;
                                }
                                if (!zEquals || z) {
                                    zzamhVar = zzamhVar2;
                                    zzamhVar.f5938f = zzvVar;
                                } else {
                                    zzahmVarMo4109f.mo4097e(zzvVar);
                                    zzamhVar = zzamhVar2;
                                }
                                int i33 = i5;
                                size = (i24 == 2 || i33 != -1) ? i33 : arrayList10.size();
                                arrayList5 = arrayList10;
                                arrayList5.add(zzamhVar);
                                j5 = jMax;
                            } else {
                                i4 = i20;
                                i5 = i3;
                                arrayList2 = arrayList11;
                            }
                            j3 = -9223372036854775807L;
                            if (j3 != -9223372036854775807L) {
                                i7 = 1;
                                zzapVar = new zzap(new zzajd(j3));
                            } else {
                                i7 = 1;
                                zzapVar = null;
                            }
                            if (i24 == i7) {
                                zztVar.f20784J = i10;
                                zztVar.f20785K = i11;
                            }
                            zzap zzapVar10 = zzvVar2.f21058l;
                            arrayList3 = this.f5954i;
                            if (arrayList3.isEmpty()) {
                                zzapVar2 = null;
                            } else {
                                zzapVar2 = new zzap(arrayList3);
                            }
                            zzapVar3 = zzapVar8;
                            zzap[] zzapVarArr2 = {zzapVar2, zzapVar3, zzapVar5, zzapVar};
                            zzapVar4 = zzapVar7;
                            zzaly.m4216a(i24, zzapVar4, zztVar, zzapVar10, zzapVarArr2);
                            str = str2;
                            zztVar.m8852d(str);
                            zzvVar = new zzv(zztVar);
                            zEquals = Objects.equals(str3, "audio/mpeg");
                            i8 = zzampVar.f6007l;
                            if (i8 != -1) {
                                arrayList4 = arrayList14;
                                z = false;
                                break;
                            }
                            size2 = arrayList14.size();
                            i9 = 0;
                            while (true) {
                                if (i9 < size2) {
                                    arrayList4 = arrayList14;
                                    z = false;
                                    break;
                                }
                                arrayList4 = arrayList14;
                                obj = arrayList4.get(i9);
                                i9++;
                                if (((zzams) obj).f6032a.f5996a == i8) {
                                    z = true;
                                    break;
                                }
                                arrayList14 = arrayList4;
                            }
                            if (zEquals) {
                                zzamhVar = zzamhVar2;
                                zzamhVar.f5938f = zzvVar;
                            } else {
                                zzamhVar = zzamhVar2;
                                zzamhVar.f5938f = zzvVar;
                            }
                            int i34 = i5;
                            if (i24 == 2) {
                            }
                            arrayList5 = arrayList10;
                            arrayList5.add(zzamhVar);
                            j5 = jMax;
                        }
                        int i35 = i4 + 1;
                        zzapVarM4195e = zzapVar4;
                        i19 = size;
                        arrayList10 = arrayList5;
                        zzapVar6 = zzapVar3;
                        arrayList13 = arrayList4;
                        arrayListM4192b = arrayList;
                        i21 = i2;
                        strM4221a = str;
                        arrayList11 = arrayList2;
                        arrayDeque = arrayDeque2;
                        i20 = i35;
                    }
                    str = strM4221a;
                    i2 = i21;
                    arrayList5 = arrayList10;
                    size = i19;
                    zzapVar3 = zzapVar6;
                    i4 = i20;
                    arrayList2 = arrayList11;
                    zzapVar4 = zzapVarM4195e;
                    arrayList4 = arrayList13;
                    int i36 = i4 + 1;
                    zzapVarM4195e = zzapVar4;
                    i19 = size;
                    arrayList10 = arrayList5;
                    zzapVar6 = zzapVar3;
                    arrayList13 = arrayList4;
                    arrayListM4192b = arrayList;
                    i21 = i2;
                    strM4221a = str;
                    arrayList11 = arrayList2;
                    arrayDeque = arrayDeque2;
                    i20 = i36;
                }
                ArrayDeque arrayDeque3 = arrayDeque;
                ArrayList arrayList15 = arrayList13;
                int i37 = i19;
                int i38 = -1;
                zzamh[] zzamhVarArr = (zzamh[]) arrayList10.toArray(new zzamh[0]);
                this.f5943D = zzamhVarArr;
                int length = zzamhVarArr.length;
                long[][] jArr2 = new long[length][];
                int[] iArr2 = new int[length];
                long[] jArr3 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i39 = 0; i39 < zzamhVarArr.length; i39++) {
                    jArr2[i39] = new long[zzamhVarArr[i39].f5934b.f6033b];
                    jArr3[i39] = zzamhVarArr[i39].f5934b.f6037f[0];
                }
                int i40 = 0;
                while (i40 < zzamhVarArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i41 = i38;
                    for (int i42 = 0; i42 < zzamhVarArr.length; i42++) {
                        if (!zArr[i42]) {
                            long j9 = jArr3[i42];
                            if (j9 <= j8) {
                                i41 = i42;
                                j8 = j9;
                            }
                        }
                    }
                    int i43 = iArr2[i41];
                    long[] jArr4 = jArr2[i41];
                    jArr4[i43] = j4;
                    zzams zzamsVar3 = zzamhVarArr[i41].f5934b;
                    zzamh[] zzamhVarArr2 = zzamhVarArr;
                    j4 += (long) zzamsVar3.f6035d[i43];
                    int i44 = i43 + 1;
                    iArr2[i41] = i44;
                    if (i44 < jArr4.length) {
                        jArr3[i41] = zzamsVar3.f6037f[i44];
                    } else {
                        zArr[i41] = true;
                        i40++;
                    }
                    zzamhVarArr = zzamhVarArr2;
                    i38 = -1;
                }
                this.f5944E = jArr2;
                this.f5942C.mo4110v();
                this.f5942C.mo4108d(new zzamg(j5, this.f5943D, i37));
                arrayDeque3.clear();
                if (!this.f5969x) {
                    this.f5958m = true != arrayList15.isEmpty() ? 4 : 2;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfz) arrayDeque.peek()).f16831d.add(zzfzVar);
            }
        }
        int i45 = this.f5958m;
        if (i45 == 4 || i45 == 2) {
            return;
        }
        this.f5958m = 0;
        this.f5961p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f5952g.clear();
        this.f5961p = 0;
        this.f5963r = -1;
        this.f5964s = 0;
        this.f5965t = 0;
        this.f5966u = 0;
        this.f5967v = false;
        this.f5971z = 0;
        this.f5940A = 0;
        this.f5955j.clear();
        this.f5956k.clear();
        if (j2 == 0) {
            if (this.f5958m != 3) {
                this.f5958m = 0;
                this.f5961p = 0;
                return;
            } else {
                zzamm zzammVar = this.f5953h;
                zzammVar.f5978a.clear();
                zzammVar.f5979b = 0;
                this.f5954i.clear();
                return;
            }
        }
        for (zzamh zzamhVar : this.f5943D) {
            zzams zzamsVar = zzamhVar.f5934b;
            int iM4225a = zzamsVar.m4225a(j3);
            if (iM4225a == -1) {
                iM4225a = zzamsVar.m4226b(j3);
            }
            zzamhVar.f5937e = iM4225a;
            zzahn zzahnVar = zzamhVar.f5936d;
            if (zzahnVar != null) {
                zzahnVar.f5328b = false;
                zzahnVar.f5329c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        zzgwt zzgwtVarM7216n;
        zzahh zzahhVarM4224a = zzamn.m4224a(zzagbVar, false);
        if (zzahhVarM4224a != null) {
            zzgwtVarM7216n = zzgwt.m7216n(zzahhVarM4224a);
        } else {
            zzgzi zzgziVar = zzgwt.f18303t;
            zzgwtVarM7216n = zzgyo.f18355w;
        }
        this.f5957l = zzgwtVarM7216n;
        return zzahhVarM4224a == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        if ((this.f5947b & 16) == 0) {
            zzagdVar = new zzant(zzagdVar, this.f5946a);
        }
        this.f5942C = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:221:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:223:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:295:0x0665 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x066e A[EDGE_INSN: B:409:0x066e->B:299:0x066e BREAK  A[LOOP:0: B:3:0x0006->B:428:0x0006], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x065b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0669 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x04d0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        char c;
        int i2;
        int i3;
        int iM7081b;
        int iM6376b;
        int i4;
        zzeu zzeuVar;
        byte b;
        char c2;
        boolean z;
        boolean z2;
        int i5;
        while (true) {
            int i6 = this.f5958m;
            ArrayDeque arrayDeque = this.f5952g;
            zzeu zzeuVar2 = this.f5950e;
            boolean z3 = true;
            if (i6 == 0) {
                int i7 = this.f5961p;
                zzeu zzeuVar3 = this.f5951f;
                if (i7 == 0) {
                    if (!zzagbVar.mo4079I(zzeuVar3.f14887a, 0, 8, true)) {
                        return -1;
                    }
                    this.f5961p = 8;
                    zzeuVar3.m6363E(0);
                    this.f5960o = zzeuVar3.m6374P();
                    this.f5959n = zzeuVar3.m6376b();
                }
                long j2 = this.f5960o;
                if (j2 == 1) {
                    zzagbVar.mo4076F(zzeuVar3.f14887a, 8, 8);
                    this.f5961p += 8;
                    this.f5960o = zzeuVar3.m6384j();
                } else if (j2 == 0) {
                    long jMo4089j = zzagbVar.mo4089j();
                    if (jMo4089j == -1) {
                        zzfz zzfzVar = (zzfz) arrayDeque.peek();
                        jMo4089j = zzfzVar != null ? zzfzVar.f16829b : -1L;
                    }
                    if (jMo4089j != -1) {
                        this.f5960o = (jMo4089j - zzagbVar.mo4086g()) + ((long) this.f5961p);
                    }
                }
                long j3 = this.f5960o;
                int i8 = this.f5961p;
                long j4 = i8;
                if (j3 < j4) {
                    if (this.f5959n != 1718773093 || i8 != 8) {
                        throw zzat.m4384b("Atom size less than header length (unsupported).");
                    }
                    this.f5960o = j4;
                    i8 = 8;
                }
                int i9 = this.f5959n;
                if (i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1701082227 || i9 == 1835365473 || i9 == 1635284069 || i9 == 1953654118) {
                    long jMo4086g = zzagbVar.mo4086g();
                    long j5 = this.f5960o;
                    long j6 = jMo4086g + j5;
                    long j7 = this.f5961p;
                    if (j5 != j7 && this.f5959n == 1835365473) {
                        zzeuVar2.m6396y(8);
                        zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 8);
                        zzalo.m4196f(zzeuVar2);
                        zzagbVar.mo4091o(zzeuVar2.f14888b);
                        zzagbVar.zzl();
                    }
                    long j8 = j6 - j7;
                    arrayDeque.push(new zzfz(this.f5959n, j8));
                    if (this.f5960o == this.f5961p) {
                        m4223a(j8);
                    } else {
                        this.f5958m = 0;
                        this.f5961p = 0;
                    }
                } else {
                    if (i9 == 1835296868 || i9 == 1836476516 || i9 == 1751411826 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1937011571 || i9 == 1668576371 || i9 == 1701606260 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1953196132 || i9 == 1718909296 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124 || i9 == 1667785072) {
                        zzgtr.m7133f(i8 == 8);
                        zzgtr.m7133f(this.f5960o <= 2147483647L);
                        zzeu zzeuVar4 = new zzeu((int) this.f5960o);
                        System.arraycopy(zzeuVar3.f14887a, 0, zzeuVar4.f14887a, 0, 8);
                        this.f5962q = zzeuVar4;
                    } else {
                        this.f5962q = null;
                    }
                    this.f5958m = 1;
                }
            } else if (i6 == 1) {
                long j9 = this.f5960o - ((long) this.f5961p);
                long jMo4086g2 = zzagbVar.mo4086g() + j9;
                zzeu zzeuVar5 = this.f5962q;
                if (zzeuVar5 == null) {
                    if (!this.f5968w && this.f5959n == 1835295092) {
                        this.f5945F = 1;
                    }
                    if (j9 < 262144) {
                        zzagbVar.mo4091o((int) j9);
                    } else {
                        zzahaVar.f5303a = zzagbVar.mo4086g() + j9;
                        z2 = true;
                    }
                    m4223a(jMo4086g2);
                    i4 = 1;
                    if (this.f5969x) {
                        this.f5970y = true;
                        zzahaVar.f5303a = 0L;
                        this.f5969x = false;
                    } else if (!z2) {
                        continue;
                    }
                    if (this.f5958m != 2) {
                        break;
                    }
                } else {
                    zzagbVar.mo4076F(zzeuVar5.f14887a, this.f5961p, (int) j9);
                    if (this.f5959n == 1718909296) {
                        this.f5968w = true;
                        zzeuVar5.m6363E(8);
                        if (zzeuVar5.m6376b() == 1903435808) {
                            i5 = 1;
                            break;
                        }
                        zzeuVar5.m6365G(4);
                        while (true) {
                            if (zzeuVar5.m6360B() <= 0) {
                                i5 = 0;
                                break;
                            }
                            if (zzeuVar5.m6376b() == 1903435808) {
                                i5 = 1;
                                break;
                            }
                        }
                        this.f5945F = i5;
                    } else if (!arrayDeque.isEmpty()) {
                        ((zzfz) arrayDeque.peek()).f16830c.add(new zzga(this.f5959n, zzeuVar5));
                    }
                }
                z2 = false;
                m4223a(jMo4086g2);
                i4 = 1;
                if (this.f5969x) {
                    this.f5970y = true;
                    zzahaVar.f5303a = 0L;
                    this.f5969x = false;
                } else if (!z2) {
                    continue;
                }
                if (this.f5958m != 2) {
                    break;
                    break;
                }
            } else {
                if (i6 == 2) {
                    long jMo4086g3 = zzagbVar.mo4086g();
                    int i10 = this.f5963r;
                    if (i10 == -1) {
                        boolean z4 = true;
                        boolean z5 = true;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        long j10 = LocationRequestCompat.PASSIVE_INTERVAL;
                        long j11 = LocationRequestCompat.PASSIVE_INTERVAL;
                        long j12 = LocationRequestCompat.PASSIVE_INTERVAL;
                        while (true) {
                            zzamh[] zzamhVarArr = this.f5943D;
                            if (i13 >= zzamhVarArr.length) {
                                break;
                            }
                            zzamh zzamhVar = zzamhVarArr[i13];
                            int i14 = zzamhVar.f5937e;
                            zzams zzamsVar = zzamhVar.f5934b;
                            if (i14 != zzamsVar.f6033b) {
                                long j13 = zzamsVar.f6034c[i14];
                                long[][] jArr = this.f5944E;
                                jArr.getClass();
                                long j14 = jArr[i13][i14];
                                long j15 = j13 - jMo4086g3;
                                boolean z6 = j15 < 0 || j15 >= 262144;
                                if (z6) {
                                    if (z6 == z5 && j15 < j12) {
                                        z5 = z6;
                                        j11 = j14;
                                        i12 = i13;
                                        j12 = j15;
                                    }
                                } else if (z5) {
                                    z5 = z6;
                                    j11 = j14;
                                    i12 = i13;
                                    j12 = j15;
                                } else {
                                    z5 = false;
                                    if (z6 == z5) {
                                        z5 = z6;
                                        j11 = j14;
                                        i12 = i13;
                                        j12 = j15;
                                    }
                                }
                                if (j14 < j10) {
                                    z4 = z6;
                                    j10 = j14;
                                    i11 = i13;
                                }
                            }
                            i13++;
                        }
                        i10 = (j10 == LocationRequestCompat.PASSIVE_INTERVAL || !z4 || j11 < j10 + 10485760) ? i12 : i11;
                        this.f5963r = i10;
                        if (i10 == -1) {
                            return -1;
                        }
                    }
                    zzamh zzamhVar2 = this.f5943D[i10];
                    zzahm zzahmVar = zzamhVar2.f5935c;
                    int i15 = zzamhVar2.f5937e;
                    zzams zzamsVar2 = zzamhVar2.f5934b;
                    long j16 = zzamsVar2.f6034c[i15] + this.f5941B;
                    int[] iArr = zzamsVar2.f6035d;
                    int i16 = iArr[i15];
                    zzahn zzahnVar = zzamhVar2.f5936d;
                    long j17 = (j16 - jMo4086g3) + ((long) this.f5964s);
                    if (j17 < 0 || j17 >= 262144) {
                        int i17 = 1;
                        zzahaVar.f5303a = j16;
                        return i17;
                    }
                    zzamp zzampVar = zzamhVar2.f5933a;
                    if (zzampVar.f6003h == 1) {
                        j17 += 8;
                        i16 -= 8;
                    }
                    zzagbVar.mo4091o((int) j17);
                    zzv zzvVar = zzampVar.f6002g;
                    String str = zzvVar.f21061o;
                    boolean zEquals = Objects.equals(str, "video/avc");
                    int i18 = this.f5947b;
                    if (!zEquals ? !Objects.equals(str, "video/hevc") ? Objects.equals(str, "video/apv") : (i18 & 128) != 0 : (i18 & 32) != 0) {
                        c = 1;
                    } else {
                        c = 1;
                        this.f5967v = true;
                    }
                    int i19 = zzampVar.f6006k;
                    if (i19 == 0) {
                        if ("audio/ac4".equals(str)) {
                            if (this.f5965t == 0) {
                                zzafd.m4058b(i16, zzeuVar2);
                                zzahmVar.mo4121a(7, zzeuVar2);
                                this.f5965t += 7;
                            }
                            i16 += 7;
                        } else if (zzamhVar2.f5938f != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVar2 = zzamhVar2.f5938f;
                            zzeuVar2.m6396y(4);
                            zzagbVar.mo4078H(zzeuVar2.f14887a, 0, 4);
                            zzagbVar.zzl();
                            zzagx zzagxVar = new zzagx();
                            if (zzagxVar.m4127a(zzeuVar2.m6376b()) && !Objects.equals(zzvVar2.f21061o, zzagxVar.f5290b)) {
                                zzt zztVar = new zzt(zzvVar2);
                                String str2 = zzagxVar.f5290b;
                                str2.getClass();
                                zztVar.m8853e(str2);
                                zzvVar2 = new zzv(zztVar);
                            }
                            zzahmVar.mo4097e(zzvVar2);
                            zzamhVar2.f5938f = null;
                        } else if (zzahnVar != null) {
                            zzahnVar.m4129a(zzagbVar);
                        }
                        while (true) {
                            int i20 = this.f5965t;
                            if (i20 >= i16) {
                                break;
                            }
                            int iMo4122d = zzahmVar.mo4122d(zzagbVar, i16 - i20, false);
                            this.f5964s += iMo4122d;
                            this.f5965t += iMo4122d;
                            this.f5966u -= iMo4122d;
                        }
                    } else {
                        zzeu zzeuVar6 = this.f5949d;
                        byte[] bArr = zzeuVar6.f14887a;
                        bArr[0] = 0;
                        bArr[c] = 0;
                        bArr[2] = 0;
                        int i21 = 4 - i19;
                        i16 += i21;
                        while (this.f5965t < i16) {
                            int i22 = this.f5966u;
                            if (i22 == 0) {
                                if (this.f5967v) {
                                    i2 = i19;
                                } else {
                                    i2 = i19;
                                    if (zzgr.m7081b(zzvVar) + i19 <= iArr[i15] - this.f5964s) {
                                        iM7081b = zzgr.m7081b(zzvVar);
                                        i3 = i2 + iM7081b;
                                    }
                                    zzagbVar.mo4076F(bArr, i21, i3);
                                    this.f5964s += i3;
                                    zzeuVar6.m6363E(0);
                                    iM6376b = zzeuVar6.m6376b();
                                    if (iM6376b >= 0) {
                                        throw zzat.m4383a(null, "Invalid NAL length");
                                    }
                                    this.f5966u = iM6376b - iM7081b;
                                    zzeu zzeuVar7 = this.f5948c;
                                    zzeuVar7.m6363E(0);
                                    zzahmVar.mo4121a(4, zzeuVar7);
                                    this.f5965t += 4;
                                    if (iM7081b > 0) {
                                        zzahmVar.mo4121a(iM7081b, zzeuVar6);
                                        this.f5965t += iM7081b;
                                        if (zzgr.m7082c(bArr, iM7081b, zzvVar)) {
                                            this.f5967v = true;
                                        }
                                    }
                                }
                                i3 = i2;
                                iM7081b = 0;
                                zzagbVar.mo4076F(bArr, i21, i3);
                                this.f5964s += i3;
                                zzeuVar6.m6363E(0);
                                iM6376b = zzeuVar6.m6376b();
                                if (iM6376b >= 0) {
                                    throw zzat.m4383a(null, "Invalid NAL length");
                                }
                                this.f5966u = iM6376b - iM7081b;
                                zzeu zzeuVar8 = this.f5948c;
                                zzeuVar8.m6363E(0);
                                zzahmVar.mo4121a(4, zzeuVar8);
                                this.f5965t += 4;
                                if (iM7081b > 0) {
                                    zzahmVar.mo4121a(iM7081b, zzeuVar6);
                                    this.f5965t += iM7081b;
                                    if (zzgr.m7082c(bArr, iM7081b, zzvVar)) {
                                        this.f5967v = true;
                                    }
                                }
                            } else {
                                i2 = i19;
                                int iMo4122d2 = zzahmVar.mo4122d(zzagbVar, i22, false);
                                this.f5964s += iMo4122d2;
                                this.f5965t += iMo4122d2;
                                this.f5966u -= iMo4122d2;
                            }
                            i19 = i2;
                        }
                    }
                    int i23 = i16;
                    long j18 = zzamsVar2.f6037f[i15];
                    int i24 = zzamsVar2.f6038g[i15];
                    if (!this.f5967v) {
                        i24 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    int i25 = i24;
                    if (zzahnVar != null) {
                        zzahnVar.m4130b(zzahmVar, j18, i25, i23, 0, null);
                        if (i15 + 1 == zzamsVar2.f6033b) {
                            zzahnVar.m4131c(zzahmVar, null);
                        }
                    } else {
                        zzahmVar.mo4095b(j18, i25, i23, 0, null);
                    }
                    zzamhVar2.f5937e++;
                    this.f5963r = -1;
                    this.f5964s = 0;
                    this.f5965t = 0;
                    this.f5966u = 0;
                    this.f5967v = false;
                    return 0;
                }
                if (i6 != 3) {
                    int i26 = this.f5971z;
                    ArrayList arrayList = this.f5955j;
                    zzams zzamsVar3 = (zzams) arrayList.get(i26);
                    int i27 = this.f5940A;
                    int i28 = zzamsVar3.f6033b;
                    ArrayList arrayList2 = this.f5956k;
                    if (i27 < i28) {
                        long j19 = zzamsVar3.f6034c[i27];
                        if (zzagbVar.mo4086g() != j19) {
                            zzahaVar.f5303a = j19;
                            return 1;
                        }
                        int i29 = zzamsVar3.f6035d[this.f5940A];
                        zzeuVar2.m6396y(i29);
                        zzagbVar.mo4076F(zzeuVar2.f14887a, 0, i29);
                        String strM6385k = zzeuVar2.m6385k(Math.min(zzeuVar2.m6370L(), zzeuVar2.m6360B()), StandardCharsets.UTF_8);
                        long[] jArr2 = zzamsVar3.f6037f;
                        long jM6518t = zzfm.m6518t(jArr2[this.f5940A]);
                        int i30 = this.f5940A + 1;
                        long jM6518t2 = i30 < i28 ? zzfm.m6518t(jArr2[i30]) : zzfm.m6518t(zzamsVar3.f6040i);
                        zzaiy zzaiyVar = new zzaiy();
                        zzaiyVar.f5496a = jM6518t;
                        zzaiyVar.f5497b = jM6518t2;
                        zzx zzxVar = new zzx(null, strM6385k);
                        zzaiyVar.f5499d = zzxVar;
                        arrayList2.add(new zzaja(zzaiyVar.f5496a, zzaiyVar.f5497b, zzaiyVar.f5498c, zzxVar));
                        this.f5940A++;
                        return 0;
                    }
                    zzamh[] zzamhVarArr2 = this.f5943D;
                    int length = zzamhVarArr2.length;
                    int i31 = 0;
                    while (i31 < length) {
                        zzamh zzamhVar3 = zzamhVarArr2[i31];
                        if (zzamhVar3.f5933a.f6007l == zzamsVar3.f6032a.f5996a) {
                            zzv zzvVar3 = zzamhVar3.f5938f;
                            zzvVar3.getClass();
                            zzap zzapVar = zzvVar3.f21058l;
                            ArrayList arrayList3 = new ArrayList();
                            z = z3;
                            if (zzapVar != null) {
                                arrayList3.addAll(zzapVar.m4287b(zzao.class, new zzgts() { // from class: com.google.android.gms.internal.ads.zzamd
                                    @Override // com.google.android.gms.internal.ads.zzgts
                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ boolean mo3897b(Object obj) {
                                        int i32 = zzami.f5939G;
                                        return !(((zzao) obj) instanceof zzaiz);
                                    }
                                }));
                            }
                            arrayList3.addAll(arrayList2);
                            zzt zztVar2 = new zzt(zzvVar3);
                            zztVar2.f20799k = new zzap(arrayList3);
                            zzv zzvVar4 = new zzv(zztVar2);
                            if (Objects.equals(zzvVar4.f21061o, "audio/mpeg")) {
                                zzamhVar3.f5938f = zzvVar4;
                            } else {
                                zzamhVar3.f5935c.mo4097e(zzvVar4);
                                zzamhVar3.f5938f = null;
                            }
                        } else {
                            z = z3;
                        }
                        i31++;
                        z3 = z;
                    }
                    this.f5971z++;
                    this.f5940A = 0;
                    arrayList2.clear();
                    if (this.f5971z != arrayList.size()) {
                        return 0;
                    }
                    this.f5958m = 2;
                    return 0;
                }
                zzamm zzammVar = this.f5953h;
                ArrayList arrayList4 = zzammVar.f5978a;
                int i32 = zzammVar.f5979b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        short s2 = 2819;
                        int i33 = 8;
                        short s3 = 2192;
                        if (i32 != 2) {
                            long jMo4086g4 = zzagbVar.mo4086g();
                            int iMo4089j = (int) ((zzagbVar.mo4089j() - zzagbVar.mo4086g()) - ((long) zzammVar.f5980c));
                            zzeu zzeuVar9 = new zzeu(iMo4089j);
                            zzagbVar.mo4076F(zzeuVar9.f14887a, 0, iMo4089j);
                            for (int i34 = 0; i34 < arrayList4.size(); i34++) {
                                zzaml zzamlVar = (zzaml) arrayList4.get(i34);
                                zzeuVar9.m6363E((int) (zzamlVar.f5974a - jMo4086g4));
                                zzeuVar9.m6365G(4);
                                int iM6377c = zzeuVar9.m6377c();
                                Charset charset = StandardCharsets.UTF_8;
                                switch (zzeuVar9.m6385k(iM6377c, charset)) {
                                    case "SlowMotion_Data":
                                        b = 0;
                                        break;
                                    case "Super_SlowMotion_Edit_Data":
                                        b = 3;
                                        break;
                                    case "Super_SlowMotion_Data":
                                        b = 1;
                                        break;
                                    case "Super_SlowMotion_Deflickering_On":
                                        b = 4;
                                        break;
                                    case "Super_SlowMotion_BGM":
                                        b = 2;
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                if (b == 0) {
                                    c2 = 2192;
                                } else if (b == 1) {
                                    c2 = 2816;
                                } else if (b == 2) {
                                    c2 = 2817;
                                } else if (b == 3) {
                                    c2 = 2819;
                                } else {
                                    if (b != 4) {
                                        throw zzat.m4383a(null, "Invalid SEF name");
                                    }
                                    c2 = 2820;
                                }
                                int i35 = zzamlVar.f5975b - (iM6377c + 8);
                                if (c2 == 2192) {
                                    ArrayList arrayList5 = new ArrayList();
                                    List listM7147e = zzamm.f5977e.m7147e(zzeuVar9.m6385k(i35, charset));
                                    for (int i36 = 0; i36 < listM7147e.size(); i36++) {
                                        List listM7147e2 = zzamm.f5976d.m7147e((CharSequence) listM7147e.get(i36));
                                        if (listM7147e2.size() != 3) {
                                            throw zzat.m4383a(null, null);
                                        }
                                        try {
                                            arrayList5.add(new zzajz(Long.parseLong((String) listM7147e2.get(0)), Long.parseLong((String) listM7147e2.get(1)), 1 << (Integer.parseInt((String) listM7147e2.get(2)) - 1)));
                                        } catch (NumberFormatException e) {
                                            throw zzat.m4383a(e, null);
                                        }
                                    }
                                    this.f5954i.add(new zzaka(arrayList5));
                                } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                    throw new IllegalStateException();
                                }
                            }
                            zzahaVar.f5303a = 0L;
                        } else {
                            long jMo4089j2 = zzagbVar.mo4089j();
                            int i37 = zzammVar.f5980c - 20;
                            zzeu zzeuVar10 = new zzeu(i37);
                            zzagbVar.mo4076F(zzeuVar10.f14887a, 0, i37);
                            int i38 = 0;
                            while (i38 < i37 / 12) {
                                zzeuVar10.m6365G(2);
                                zzeuVar10.m6395v(2);
                                byte[] bArr2 = zzeuVar10.f14887a;
                                int i39 = zzeuVar10.f14888b;
                                int i40 = i39 + 1;
                                zzeuVar10.f14888b = i40;
                                int i41 = bArr2[i39] & 255;
                                zzeuVar10.f14888b = i39 + 2;
                                short s4 = (short) (((bArr2[i40] & 255) << 8) | i41);
                                if (s4 != s3 && s4 != 2816 && s4 != 2817 && s4 != s2) {
                                    if (s4 != 2820) {
                                        zzeuVar10.m6365G(i33);
                                        zzeuVar = zzeuVar10;
                                    }
                                    i38++;
                                    zzeuVar10 = zzeuVar;
                                    s3 = 2192;
                                    s2 = 2819;
                                    i33 = 8;
                                }
                                zzeuVar = zzeuVar10;
                                arrayList4.add(new zzaml((jMo4089j2 - ((long) zzammVar.f5980c)) - ((long) zzeuVar.m6377c()), zzeuVar.m6377c()));
                                i38++;
                                zzeuVar10 = zzeuVar;
                                s3 = 2192;
                                s2 = 2819;
                                i33 = 8;
                            }
                            if (arrayList4.isEmpty()) {
                                zzahaVar.f5303a = 0L;
                            } else {
                                zzammVar.f5979b = 3;
                                zzahaVar.f5303a = ((zzaml) arrayList4.get(0)).f5974a;
                            }
                        }
                    } else {
                        zzeu zzeuVar11 = new zzeu(8);
                        zzagbVar.mo4076F(zzeuVar11.f14887a, 0, 8);
                        zzammVar.f5980c = zzeuVar11.m6377c() + 8;
                        if (zzeuVar11.m6376b() != 1397048916) {
                            zzahaVar.f5303a = 0L;
                        } else {
                            zzahaVar.f5303a = zzagbVar.mo4086g() - ((long) (zzammVar.f5980c - 12));
                            zzammVar.f5979b = 2;
                        }
                    }
                    i4 = 1;
                } else {
                    long jMo4089j3 = zzagbVar.mo4089j();
                    zzahaVar.f5303a = (jMo4089j3 == -1 || jMo4089j3 < 8) ? 0L : jMo4089j3 - 8;
                    i4 = 1;
                    zzammVar.f5979b = 1;
                }
                if (zzahaVar.f5303a == 0) {
                    this.f5958m = 0;
                    this.f5961p = 0;
                    return i4;
                }
            }
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.f5957l;
    }

    public zzami(int i2, zzanq zzanqVar) {
        this.f5946a = zzanqVar;
        this.f5947b = i2;
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f5957l = zzgyo.f18355w;
        this.f5958m = 0;
        this.f5953h = new zzamm();
        this.f5954i = new ArrayList();
        this.f5951f = new zzeu(16);
        this.f5952g = new ArrayDeque();
        this.f5948c = new zzeu(zzgr.f18091a);
        this.f5949d = new zzeu(6);
        this.f5950e = new zzeu();
        this.f5963r = -1;
        this.f5942C = zzagd.f5243j;
        this.f5943D = new zzamh[0];
        this.f5955j = new ArrayList();
        this.f5956k = new ArrayList();
    }
}
