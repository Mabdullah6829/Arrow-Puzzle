package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class zzalw implements zzaga {

    /* JADX INFO: renamed from: N */
    public static final byte[] f5855N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: O */
    public static final zzv f5856O;

    /* JADX INFO: renamed from: A */
    public zzalv f5857A;

    /* JADX INFO: renamed from: B */
    public int f5858B;

    /* JADX INFO: renamed from: C */
    public int f5859C;

    /* JADX INFO: renamed from: D */
    public int f5860D;

    /* JADX INFO: renamed from: E */
    public boolean f5861E;

    /* JADX INFO: renamed from: F */
    public boolean f5862F;

    /* JADX INFO: renamed from: G */
    public zzagd f5863G;

    /* JADX INFO: renamed from: H */
    public zzahm[] f5864H;

    /* JADX INFO: renamed from: I */
    public zzahm[] f5865I;

    /* JADX INFO: renamed from: J */
    public boolean f5866J;

    /* JADX INFO: renamed from: K */
    public boolean f5867K;

    /* JADX INFO: renamed from: L */
    public long f5868L;

    /* JADX INFO: renamed from: M */
    public long f5869M;

    /* JADX INFO: renamed from: a */
    public final zzanq f5870a;

    /* JADX INFO: renamed from: b */
    public final int f5871b;

    /* JADX INFO: renamed from: c */
    public final List f5872c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f5873d;

    /* JADX INFO: renamed from: e */
    public final zzeu f5874e;

    /* JADX INFO: renamed from: f */
    public final zzeu f5875f;

    /* JADX INFO: renamed from: g */
    public final zzeu f5876g;

    /* JADX INFO: renamed from: h */
    public final byte[] f5877h;

    /* JADX INFO: renamed from: i */
    public final zzeu f5878i;

    /* JADX INFO: renamed from: j */
    public final zzajf f5879j;

    /* JADX INFO: renamed from: k */
    public final zzeu f5880k;

    /* JADX INFO: renamed from: l */
    public final ArrayDeque f5881l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f5882m;

    /* JADX INFO: renamed from: n */
    public final zzhb f5883n;

    /* JADX INFO: renamed from: o */
    public final zzafp f5884o;

    /* JADX INFO: renamed from: p */
    public zzgwt f5885p;

    /* JADX INFO: renamed from: q */
    public int f5886q;

    /* JADX INFO: renamed from: r */
    public int f5887r;

    /* JADX INFO: renamed from: s */
    public long f5888s;

    /* JADX INFO: renamed from: t */
    public int f5889t;

    /* JADX INFO: renamed from: u */
    public zzeu f5890u;

    /* JADX INFO: renamed from: v */
    public long f5891v;

    /* JADX INFO: renamed from: w */
    public int f5892w;

    /* JADX INFO: renamed from: x */
    public long f5893x;

    /* JADX INFO: renamed from: y */
    public long f5894y;

    /* JADX INFO: renamed from: z */
    public long f5895z;

    static {
        zzt zztVar = new zzt();
        zztVar.m8853e("application/x-emsg");
        f5856O = new zzv(zztVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public zzalw() {
        zzanq zzanqVar = zzanq.f6138a;
        zzgzi zzgziVar = zzgwt.f18303t;
        this(zzanqVar, 32, zzgyo.f18355w);
    }

    /* JADX INFO: renamed from: d */
    public static void m4209d(int i2) throws zzat {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i2);
        throw zzat.m4383a(null, sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m4210e(zzeu zzeuVar, int i2, zzamr zzamrVar) throws zzat {
        zzeuVar.m6363E(i2 + 8);
        int iM6376b = zzeuVar.m6376b();
        byte[] bArr = zzalo.f5828a;
        if ((iM6376b & 1) != 0) {
            throw zzat.m4384b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM6376b & 2) != 0;
        int iM6382h = zzeuVar.m6382h();
        if (iM6382h == 0) {
            Arrays.fill(zzamrVar.f6026l, 0, zzamrVar.f6019e, false);
            return;
        }
        int i3 = zzamrVar.f6019e;
        zzeu zzeuVar2 = zzamrVar.f6028n;
        if (iM6382h != i3) {
            throw zzat.m4383a(null, AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM6382h).length() + 58 + String.valueOf(i3).length()), "Senc sample count ", iM6382h, " is different from fragment sample count", i3));
        }
        Arrays.fill(zzamrVar.f6026l, 0, iM6382h, z);
        zzeuVar2.m6396y(zzeuVar.m6360B());
        zzamrVar.f6025k = true;
        zzamrVar.f6029o = true;
        zzeuVar.m6366H(zzeuVar2.f14887a, 0, zzeuVar2.f14889c);
        zzeuVar2.m6363E(0);
        zzamrVar.f6029o = false;
    }

    /* JADX INFO: renamed from: f */
    public static Pair m4211f(long j2, zzeu zzeuVar) throws zzat {
        long jM6384j;
        long jM6384j2;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.m6363E(8);
        int iM4191a = zzalo.m4191a(zzeuVar2.m6376b());
        zzeuVar2.m6365G(4);
        long jM6374P = zzeuVar2.m6374P();
        if (iM4191a == 0) {
            jM6384j = zzeuVar2.m6374P();
            jM6384j2 = zzeuVar2.m6374P();
        } else {
            jM6384j = zzeuVar2.m6384j();
            jM6384j2 = zzeuVar2.m6384j();
        }
        long j3 = jM6384j2 + j2;
        long jM6521w = zzfm.m6521w(jM6384j, 1000000L, jM6374P, RoundingMode.DOWN);
        zzeuVar2.m6365G(2);
        int iM6370L = zzeuVar2.m6370L();
        int[] iArr = new int[iM6370L];
        long[] jArr = new long[iM6370L];
        long[] jArr2 = new long[iM6370L];
        long[] jArr3 = new long[iM6370L];
        long j4 = j3;
        long j5 = jM6521w;
        int i2 = 0;
        while (i2 < iM6370L) {
            int iM6376b = zzeuVar2.m6376b();
            if ((Integer.MIN_VALUE & iM6376b) != 0) {
                throw zzat.m4383a(null, "Unhandled indirect reference");
            }
            long jM6374P2 = zzeuVar2.m6374P();
            iArr[i2] = iM6376b & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = j5;
            jM6384j += jM6374P2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jM6521w2 = zzfm.m6521w(jM6384j, 1000000L, jM6374P, RoundingMode.DOWN);
            jArr4[i2] = jM6521w2 - jArr5[i2];
            zzeuVar2.m6365G(4);
            j4 += (long) iArr[i2];
            i2++;
            iM6370L = iM6370L;
            zzeuVar2 = zzeuVar;
            j5 = jM6521w2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jM6521w), new zzafo(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: renamed from: k */
    public static zzq m4212k(List list) {
        int i2;
        UUID uuid;
        zzamk zzamkVar;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            zzga zzgaVar = (zzga) list.get(i3);
            if (zzgaVar.f16892a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzgaVar.f16879b.f14887a;
                zzeu zzeuVar = new zzeu(bArr);
                if (zzeuVar.f14889c < 32) {
                    i2 = i3;
                    zzamkVar = null;
                    uuid = null;
                } else {
                    zzeuVar.m6363E(0);
                    int iM6360B = zzeuVar.m6360B();
                    int iM6376b = zzeuVar.m6376b();
                    if (iM6376b != iM6360B) {
                        zzeh.m6211c("PsshAtomUtil", AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM6376b).length() + 52 + String.valueOf(iM6360B).length()), "Advertised atom size (", iM6376b, ") does not match buffer size: ", iM6360B));
                    } else {
                        int iM6376b2 = zzeuVar.m6376b();
                        if (iM6376b2 != 1886614376) {
                            AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM6376b2).length() + 23), "Atom type is not pssh: ", iM6376b2, "PsshAtomUtil");
                        } else {
                            int iM4191a = zzalo.m4191a(zzeuVar.m6376b());
                            if (iM4191a > 1) {
                                AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM4191a).length() + 26), "Unsupported pssh version: ", iM4191a, "PsshAtomUtil");
                            } else {
                                UUID uuid2 = new UUID(zzeuVar.m6378d(), zzeuVar.m6378d());
                                if (iM4191a == 1) {
                                    int iM6382h = zzeuVar.m6382h();
                                    UUID[] uuidArr = new UUID[iM6382h];
                                    int i4 = 0;
                                    while (i4 < iM6382h) {
                                        uuidArr[i4] = new UUID(zzeuVar.m6378d(), zzeuVar.m6378d());
                                        i4++;
                                        i3 = i3;
                                    }
                                }
                                i2 = i3;
                                uuid = null;
                                int iM6382h2 = zzeuVar.m6382h();
                                int iM6360B2 = zzeuVar.m6360B();
                                if (iM6382h2 != iM6360B2) {
                                    zzeh.m6211c("PsshAtomUtil", AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM6382h2).length() + 49 + String.valueOf(iM6360B2).length()), "Atom data size (", iM6382h2, ") does not match the bytes left: ", iM6360B2));
                                    zzamkVar = null;
                                } else {
                                    zzeuVar.m6366H(new byte[iM6382h2], 0, iM6382h2);
                                    zzamkVar = new zzamk(uuid2);
                                }
                            }
                        }
                    }
                    i2 = i3;
                    zzamkVar = null;
                    uuid = null;
                }
                UUID uuid3 = zzamkVar == null ? uuid : zzamkVar.f5973a;
                if (uuid3 == null) {
                    zzeh.m6211c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzp(uuid3, "video/mp4", bArr));
                }
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(null, false, (zzp[]) arrayList.toArray(new zzp[0]));
    }

    /* JADX INFO: renamed from: a */
    public final void m4213a() {
        this.f5886q = 0;
        this.f5889t = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0453 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0455  */
    /* JADX WARN: Code duplicated, block: B:163:0x0460  */
    /* JADX WARN: Code duplicated, block: B:166:0x0469  */
    /* JADX WARN: Code duplicated, block: B:167:0x0472  */
    /* JADX WARN: Code duplicated, block: B:170:0x047b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0482  */
    /* JADX WARN: Code duplicated, block: B:172:0x0484 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:173:0x0486  */
    /* JADX WARN: Code duplicated, block: B:174:0x048b  */
    /* JADX WARN: Code duplicated, block: B:175:0x048d A[PHI: r32
  0x048d: PHI (r32v4 int) = (r1v80 int), (r32v5 int) binds: [B:171:0x0482, B:174:0x048b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0491  */
    /* JADX WARN: Code duplicated, block: B:179:0x049e  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:186:0x04cb  */
    /* JADX INFO: renamed from: c */
    public final void m4214c(long j2) throws zzat {
        zzap zzapVar;
        int i2;
        int i3;
        long j3;
        zzalp zzalpVar;
        int i4;
        zzalp zzalpVar2;
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        boolean z;
        zzamr zzamrVar;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i13;
        long j4;
        long j5;
        int i14;
        int iM6376b;
        int iM6376b2;
        int iM6376b3;
        int iM6376b4;
        long jM6521w;
        boolean z2;
        zzamr zzamrVar2;
        int i15;
        while (true) {
            ArrayDeque arrayDeque = this.f5881l;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).f16829b != j2) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque.pop();
            int i16 = zzfzVar.f16892a;
            ArrayList arrayList3 = zzfzVar.f16830c;
            SparseArray sparseArray = this.f5873d;
            int i17 = -1;
            int i18 = 12;
            int i19 = 8;
            if (i16 == 1836019574) {
                zzq zzqVarM4212k = m4212k(arrayList3);
                zzfz zzfzVarM6801c = zzfzVar.m6801c(1836475768);
                zzfzVarM6801c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList4 = zzfzVarM6801c.f16830c;
                int size = arrayList4.size();
                int i20 = 0;
                long jM6374P = -9223372036854775807L;
                while (i20 < size) {
                    zzga zzgaVar = (zzga) arrayList4.get(i20);
                    int i21 = zzgaVar.f16892a;
                    zzeu zzeuVar = zzgaVar.f16879b;
                    if (i21 == 1953654136) {
                        zzeuVar.m6363E(i18);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzeuVar.m6376b()), new zzalp(zzeuVar.m6376b() + i17, zzeuVar.m6376b(), zzeuVar.m6376b(), zzeuVar.m6376b()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzalp) pairCreate.second);
                    } else if (i21 == 1835362404) {
                        zzeuVar.m6363E(8);
                        jM6374P = zzalo.m4191a(zzeuVar.m6376b()) == 0 ? zzeuVar.m6374P() : zzeuVar.m6384j();
                    }
                    i20++;
                    i18 = 12;
                    i17 = -1;
                }
                int i22 = 0;
                zzfz zzfzVarM6801c2 = zzfzVar.m6801c(1835365473);
                zzap zzapVarM4195e = zzfzVarM6801c2 != null ? zzalo.m4195e(zzfzVarM6801c2) : null;
                zzagt zzagtVar = new zzagt();
                zzga zzgaVarM6800b = zzfzVar.m6800b(1969517665);
                if (zzgaVarM6800b != null) {
                    zzap zzapVarM4193c = zzalo.m4193c(zzgaVarM6800b);
                    zzagtVar.m4123a(zzapVarM4193c);
                    zzapVar = zzapVarM4193c;
                } else {
                    zzapVar = null;
                }
                zzga zzgaVarM6800b2 = zzfzVar.m6800b(1836476516);
                zzgaVarM6800b2.getClass();
                zzap zzapVar2 = new zzap(zzalo.m4194d(zzgaVarM6800b2.f16879b));
                ArrayList arrayListM4192b = zzalo.m4192b(zzfzVar, zzagtVar, jM6374P, zzqVarM4212k, false, false, new zzalq());
                int size2 = arrayListM4192b.size();
                if (sparseArray.size() == 0) {
                    String strM4221a = zzalz.m4221a(arrayListM4192b);
                    int i23 = 0;
                    while (i23 < size2) {
                        zzams zzamsVar = (zzams) arrayListM4192b.get(i23);
                        zzamp zzampVar = zzamsVar.f6032a;
                        if (zzampVar.f6008m) {
                            zzagd zzagdVar = this.f5863G;
                            int i24 = zzampVar.f5997b;
                            zzahm zzahmVarMo4109f = zzagdVar.mo4109f(i23, i24);
                            int i25 = i23;
                            long j6 = zzampVar.f6000e;
                            zzahmVarMo4109f.getClass();
                            i3 = i25;
                            zzv zzvVar = zzampVar.f6002g;
                            zzvVar.getClass();
                            zzt zztVar = new zzt(zzvVar);
                            zztVar.m8852d(strM4221a);
                            if (i24 == 1) {
                                int i26 = zzagtVar.f5268a;
                                i2 = size2;
                                j3 = j6;
                                if (i26 != -1 && (i4 = zzagtVar.f5269b) != -1) {
                                    zztVar.f20784J = i26;
                                    zztVar.f20785K = i4;
                                }
                            } else {
                                i2 = size2;
                                j3 = j6;
                            }
                            zzaly.m4216a(i24, zzapVarM4195e, zztVar, zzvVar.f21058l, zzapVar, zzapVar2);
                            int i27 = zzampVar.f5996a;
                            if (sparseArray2.size() == 1) {
                                zzalpVar = (zzalp) sparseArray2.valueAt(i22);
                            } else {
                                zzalpVar = (zzalp) sparseArray2.get(i27);
                                zzalpVar.getClass();
                            }
                            sparseArray.put(i27, new zzalv(zzahmVarMo4109f, zzamsVar, zzalpVar, new zzv(zztVar)));
                            this.f5894y = Math.max(this.f5894y, j3);
                        } else {
                            i2 = size2;
                            i3 = i23;
                        }
                        i23 = i3 + 1;
                        arrayListM4192b = arrayListM4192b;
                        strM4221a = strM4221a;
                        size2 = i2;
                        i22 = 0;
                    }
                    this.f5863G.mo4110v();
                } else {
                    ArrayList arrayList5 = arrayListM4192b;
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < size2) {
                        ArrayList arrayList6 = arrayList5;
                        if (((zzams) arrayList6.get(i28)).f6032a.f6008m) {
                            i29++;
                        }
                        i28++;
                        arrayList5 = arrayList6;
                    }
                    ArrayList arrayList7 = arrayList5;
                    zzgtr.m7133f(sparseArray.size() == i29);
                    for (int i30 = 0; i30 < size2; i30++) {
                        zzams zzamsVar2 = (zzams) arrayList7.get(i30);
                        zzamp zzampVar2 = zzamsVar2.f6032a;
                        if (zzampVar2.f6008m) {
                            int i31 = zzampVar2.f5996a;
                            zzalv zzalvVar = (zzalv) sparseArray.get(i31);
                            if (sparseArray2.size() == 1) {
                                zzalpVar2 = (zzalp) sparseArray2.valueAt(0);
                            } else {
                                zzalpVar2 = (zzalp) sparseArray2.get(i31);
                                zzalpVar2.getClass();
                            }
                            zzalvVar.f5845d = zzamsVar2;
                            zzalvVar.f5846e = zzalpVar2;
                            zzalvVar.f5842a.mo4097e(zzalvVar.f5851j);
                            zzalvVar.m4204a();
                        }
                    }
                }
            } else if (i16 == 1836019558) {
                ArrayList arrayList8 = zzfzVar.f16831d;
                int size3 = arrayList8.size();
                int i32 = 0;
                while (i32 < size3) {
                    zzfz zzfzVar2 = (zzfz) arrayList8.get(i32);
                    if (zzfzVar2.f16892a == 1953653094) {
                        zzga zzgaVarM6800b3 = zzfzVar2.m6800b(1952868452);
                        zzgaVarM6800b3.getClass();
                        zzeu zzeuVar2 = zzgaVarM6800b3.f16879b;
                        zzeuVar2.m6363E(i19);
                        int iM6376b5 = zzeuVar2.m6376b();
                        byte[] bArr2 = zzalo.f5828a;
                        zzalv zzalvVar2 = (zzalv) sparseArray.get(zzeuVar2.m6376b());
                        if (zzalvVar2 == null) {
                            zzalvVar2 = null;
                        } else {
                            zzamr zzamrVar3 = zzalvVar2.f5843b;
                            if ((iM6376b5 & 1) != 0) {
                                long jM6384j = zzeuVar2.m6384j();
                                zzamrVar3.f6016b = jM6384j;
                                zzamrVar3.f6017c = jM6384j;
                            }
                            zzalp zzalpVar3 = zzalvVar2.f5846e;
                            zzamrVar3.f6015a = new zzalp((iM6376b5 & 2) != 0 ? zzeuVar2.m6376b() - 1 : zzalpVar3.f5829a, (iM6376b5 & 8) != 0 ? zzeuVar2.m6376b() : zzalpVar3.f5830b, (iM6376b5 & 16) != 0 ? zzeuVar2.m6376b() : zzalpVar3.f5831c, (iM6376b5 & 32) != 0 ? zzeuVar2.m6376b() : zzalpVar3.f5832d);
                        }
                        if (zzalvVar2 == null) {
                            arrayList = arrayList8;
                            i5 = size3;
                            arrayList2 = arrayList3;
                            i6 = i32;
                            i7 = i19;
                        } else {
                            zzamr zzamrVar4 = zzalvVar2.f5843b;
                            long j7 = zzamrVar4.f6030p;
                            boolean z3 = zzamrVar4.f6031q;
                            zzalvVar2.m4204a();
                            zzalvVar2.f5854m = true;
                            zzga zzgaVarM6800b4 = zzfzVar2.m6800b(1952867444);
                            if (zzgaVarM6800b4 != null) {
                                zzeu zzeuVar3 = zzgaVarM6800b4.f16879b;
                                zzeuVar3.m6363E(i19);
                                zzamrVar4.f6030p = zzalo.m4191a(zzeuVar3.m6376b()) == 1 ? zzeuVar3.m6384j() : zzeuVar3.m6374P();
                                zzamrVar4.f6031q = true;
                            } else {
                                zzamrVar4.f6030p = j7;
                                zzamrVar4.f6031q = z3;
                            }
                            ArrayList arrayList9 = zzfzVar2.f16830c;
                            int size4 = arrayList9.size();
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                i8 = 1953658222;
                                if (i33 >= size4) {
                                    break;
                                }
                                zzga zzgaVar2 = (zzga) arrayList9.get(i33);
                                ArrayList arrayList10 = arrayList8;
                                if (zzgaVar2.f16892a == 1953658222) {
                                    zzeu zzeuVar4 = zzgaVar2.f16879b;
                                    zzeuVar4.m6363E(12);
                                    int iM6382h = zzeuVar4.m6382h();
                                    if (iM6382h > 0) {
                                        i35 += iM6382h;
                                        i34++;
                                    }
                                }
                                i33++;
                                arrayList8 = arrayList10;
                            }
                            arrayList = arrayList8;
                            zzalvVar2.f5849h = 0;
                            zzalvVar2.f5848g = 0;
                            zzalvVar2.f5847f = 0;
                            zzamrVar4.f6018d = i34;
                            zzamrVar4.f6019e = i35;
                            if (zzamrVar4.f6021g.length < i34) {
                                zzamrVar4.f6020f = new long[i34];
                                zzamrVar4.f6021g = new int[i34];
                            }
                            if (zzamrVar4.f6022h.length < i35) {
                                int i36 = (i35 * 125) / 100;
                                zzamrVar4.f6022h = new int[i36];
                                zzamrVar4.f6023i = new long[i36];
                                zzamrVar4.f6024j = new boolean[i36];
                                zzamrVar4.f6026l = new boolean[i36];
                            }
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            while (true) {
                                long jM7303a = 0;
                                if (i37 >= size4) {
                                    break;
                                }
                                zzga zzgaVar3 = (zzga) arrayList9.get(i37);
                                if (zzgaVar3.f16892a == i8) {
                                    int i40 = i38 + 1;
                                    zzeu zzeuVar5 = zzgaVar3.f16879b;
                                    zzeuVar5.m6363E(8);
                                    int iM6376b6 = zzeuVar5.m6376b();
                                    zzamp zzampVar3 = zzalvVar2.f5845d.f6032a;
                                    zzalp zzalpVar4 = zzamrVar4.f6015a;
                                    String str = zzfm.f16091a;
                                    zzamrVar4.f6021g[i38] = zzeuVar5.m6382h();
                                    long[] jArr2 = zzamrVar4.f6020f;
                                    int i41 = i38;
                                    long j8 = zzamrVar4.f6016b;
                                    jArr2[i41] = j8;
                                    if ((iM6376b6 & 1) != 0) {
                                        jArr2[i41] = j8 + ((long) zzeuVar5.m6376b());
                                    }
                                    boolean z4 = (iM6376b6 & 4) != 0;
                                    int i42 = zzalpVar4.f5832d;
                                    int iM6376b7 = z4 ? zzeuVar5.m6376b() : i42;
                                    boolean z5 = z4;
                                    int i43 = iM6376b6 & 256;
                                    int i44 = iM6376b6 & 512;
                                    int i45 = iM6376b6 & 1024;
                                    int i46 = iM6376b6 & 2048;
                                    zzhao zzhaoVar = zzampVar3.f6004i;
                                    if (zzhaoVar != null) {
                                        i10 = i32;
                                        i11 = i42;
                                        if (zzhaoVar.f18432t == 1) {
                                            zzhao zzhaoVar2 = zzampVar3.f6005j;
                                            if (zzhaoVar2 == null) {
                                                zzamrVar = zzamrVar4;
                                                i12 = iM6376b7;
                                            } else {
                                                if (zzhaoVar.m7303a(0) == 0) {
                                                    zzamrVar2 = zzamrVar4;
                                                    i12 = iM6376b7;
                                                } else {
                                                    long jM7303a2 = zzhaoVar.m7303a(0);
                                                    long j9 = zzampVar3.f5999d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    long jM6521w2 = zzfm.m6521w(jM7303a2, 1000000L, j9, roundingMode);
                                                    i12 = iM6376b7;
                                                    zzamrVar2 = zzamrVar4;
                                                    i15 = jM6521w2 + zzfm.m6521w(zzhaoVar2.m7303a(0), 1000000L, zzampVar3.f5998c, roundingMode) >= zzampVar3.f6000e ? 0 : 0;
                                                    zzamrVar = zzamrVar2;
                                                }
                                                jM7303a = zzhaoVar2.m7303a(i15);
                                                zzamrVar = zzamrVar2;
                                            }
                                        }
                                        iArr = zzamrVar.f6022h;
                                        jArr = zzamrVar.f6023i;
                                        zArr = zzamrVar.f6024j;
                                        i13 = zzamrVar.f6021g[i41] + i39;
                                        int i47 = i39;
                                        j4 = zzampVar3.f5998c;
                                        j5 = zzamrVar.f6030p;
                                        i14 = i47;
                                        while (i14 < i13) {
                                            if (i43 != 0) {
                                                iM6376b = zzeuVar5.m6376b();
                                            } else {
                                                iM6376b = zzalpVar4.f5830b;
                                            }
                                            m4209d(iM6376b);
                                            if (i44 != 0) {
                                                iM6376b2 = zzeuVar5.m6376b();
                                            } else {
                                                iM6376b2 = zzalpVar4.f5831c;
                                            }
                                            m4209d(iM6376b2);
                                            if (i45 != 0) {
                                                iM6376b3 = zzeuVar5.m6376b();
                                            } else if (i14 != 0) {
                                                iM6376b3 = i11;
                                            } else if (z5) {
                                                iM6376b3 = i12;
                                                i14 = 0;
                                            } else {
                                                i14 = 0;
                                                iM6376b3 = i11;
                                            }
                                            if (i46 != 0) {
                                                iM6376b4 = zzeuVar5.m6376b();
                                            } else {
                                                iM6376b4 = 0;
                                            }
                                            boolean[] zArr2 = zArr;
                                            int i48 = i13;
                                            jM6521w = zzfm.m6521w((((long) iM6376b4) + j5) - jM7303a, 1000000L, j4, RoundingMode.DOWN);
                                            jArr[i14] = jM6521w;
                                            if (!zzamrVar.f6031q) {
                                                jArr[i14] = jM6521w + zzalvVar2.f5845d.f6040i;
                                            }
                                            iArr[i14] = iM6376b2;
                                            if (((iM6376b3 >> 16) & 1) == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            zArr2[i14] = z2;
                                            j5 += (long) iM6376b;
                                            i14++;
                                            iArr = iArr;
                                            zzalpVar4 = zzalpVar4;
                                            zArr = zArr2;
                                            i13 = i48;
                                        }
                                        int i49 = i13;
                                        zzamrVar.f6030p = j5;
                                        i38 = i40;
                                        i39 = i49;
                                    } else {
                                        i10 = i32;
                                        i11 = i42;
                                    }
                                    i12 = iM6376b7;
                                    zzamrVar = zzamrVar4;
                                    iArr = zzamrVar.f6022h;
                                    jArr = zzamrVar.f6023i;
                                    zArr = zzamrVar.f6024j;
                                    i13 = zzamrVar.f6021g[i41] + i39;
                                    int i410 = i39;
                                    j4 = zzampVar3.f5998c;
                                    j5 = zzamrVar.f6030p;
                                    i14 = i410;
                                    while (i14 < i13) {
                                        if (i43 != 0) {
                                            iM6376b = zzeuVar5.m6376b();
                                        } else {
                                            iM6376b = zzalpVar4.f5830b;
                                        }
                                        m4209d(iM6376b);
                                        if (i44 != 0) {
                                            iM6376b2 = zzeuVar5.m6376b();
                                        } else {
                                            iM6376b2 = zzalpVar4.f5831c;
                                        }
                                        m4209d(iM6376b2);
                                        if (i45 != 0) {
                                            iM6376b3 = zzeuVar5.m6376b();
                                        } else if (i14 != 0) {
                                            iM6376b3 = i11;
                                        } else if (z5) {
                                            iM6376b3 = i12;
                                            i14 = 0;
                                        } else {
                                            i14 = 0;
                                            iM6376b3 = i11;
                                        }
                                        if (i46 != 0) {
                                            iM6376b4 = zzeuVar5.m6376b();
                                        } else {
                                            iM6376b4 = 0;
                                        }
                                        boolean[] zArr3 = zArr;
                                        int i411 = i13;
                                        jM6521w = zzfm.m6521w((((long) iM6376b4) + j5) - jM7303a, 1000000L, j4, RoundingMode.DOWN);
                                        jArr[i14] = jM6521w;
                                        if (!zzamrVar.f6031q) {
                                            jArr[i14] = jM6521w + zzalvVar2.f5845d.f6040i;
                                        }
                                        iArr[i14] = iM6376b2;
                                        if (((iM6376b3 >> 16) & 1) == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        zArr3[i14] = z2;
                                        j5 += (long) iM6376b;
                                        i14++;
                                        iArr = iArr;
                                        zzalpVar4 = zzalpVar4;
                                        zArr = zArr3;
                                        i13 = i411;
                                    }
                                    int i412 = i13;
                                    zzamrVar.f6030p = j5;
                                    i38 = i40;
                                    i39 = i412;
                                } else {
                                    zzamrVar = zzamrVar4;
                                    i10 = i32;
                                }
                                i37++;
                                zzamrVar4 = zzamrVar;
                                size3 = size3;
                                arrayList3 = arrayList3;
                                size4 = size4;
                                i32 = i10;
                                i8 = 1953658222;
                            }
                            i5 = size3;
                            arrayList2 = arrayList3;
                            zzamr zzamrVar5 = zzamrVar4;
                            i6 = i32;
                            zzamp zzampVar4 = zzalvVar2.f5845d.f6032a;
                            zzalp zzalpVar5 = zzamrVar5.f6015a;
                            zzalpVar5.getClass();
                            int i50 = zzalpVar5.f5829a;
                            zzamq[] zzamqVarArr = zzampVar4.f6009n;
                            zzamq zzamqVar = zzamqVarArr == null ? null : zzamqVarArr[i50];
                            zzga zzgaVarM6800b5 = zzfzVar2.m6800b(1935763834);
                            if (zzgaVarM6800b5 != null) {
                                zzamqVar.getClass();
                                int i51 = zzamqVar.f6013d;
                                zzeu zzeuVar6 = zzgaVarM6800b5.f16879b;
                                zzeuVar6.m6363E(8);
                                if ((zzeuVar6.m6376b() & 1) == 1) {
                                    zzeuVar6.m6365G(8);
                                }
                                int iM6369K = zzeuVar6.m6369K();
                                int iM6382h2 = zzeuVar6.m6382h();
                                int i52 = zzamrVar5.f6019e;
                                if (iM6382h2 > i52) {
                                    throw zzat.m4383a(null, AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iM6382h2).length() + 56 + String.valueOf(i52).length()), "Saiz sample count ", iM6382h2, " is greater than fragment sample count", i52));
                                }
                                if (iM6369K == 0) {
                                    boolean[] zArr4 = zzamrVar5.f6026l;
                                    i9 = 0;
                                    for (int i53 = 0; i53 < iM6382h2; i53++) {
                                        int iM6369K2 = zzeuVar6.m6369K();
                                        i9 += iM6369K2;
                                        zArr4[i53] = iM6369K2 > i51;
                                    }
                                    z = false;
                                } else {
                                    boolean z6 = iM6369K > i51;
                                    i9 = iM6369K * iM6382h2;
                                    z = false;
                                    Arrays.fill(zzamrVar5.f6026l, 0, iM6382h2, z6);
                                }
                                Arrays.fill(zzamrVar5.f6026l, iM6382h2, zzamrVar5.f6019e, z);
                                if (i9 > 0) {
                                    zzamrVar5.f6028n.m6396y(i9);
                                    zzamrVar5.f6025k = true;
                                    zzamrVar5.f6029o = true;
                                }
                            }
                            zzga zzgaVarM6800b6 = zzfzVar2.m6800b(1935763823);
                            if (zzgaVarM6800b6 != null) {
                                zzeu zzeuVar7 = zzgaVarM6800b6.f16879b;
                                zzeuVar7.m6363E(8);
                                int iM6376b8 = zzeuVar7.m6376b();
                                if ((iM6376b8 & 1) == 1) {
                                    zzeuVar7.m6365G(8);
                                }
                                int iM6382h3 = zzeuVar7.m6382h();
                                if (iM6382h3 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iM6382h3).length() + 29);
                                    sb.append("Unexpected saio entry count: ");
                                    sb.append(iM6382h3);
                                    throw zzat.m4383a(null, sb.toString());
                                }
                                zzamrVar5.f6017c += zzalo.m4191a(iM6376b8) == 0 ? zzeuVar7.m6374P() : zzeuVar7.m6384j();
                            }
                            zzga zzgaVarM6800b7 = zzfzVar2.m6800b(1936027235);
                            if (zzgaVarM6800b7 != null) {
                                m4210e(zzgaVarM6800b7.f16879b, 0, zzamrVar5);
                            }
                            String str2 = zzamqVar != null ? zzamqVar.f6011b : null;
                            zzeu zzeuVar8 = null;
                            zzeu zzeuVar9 = null;
                            for (int i54 = 0; i54 < arrayList9.size(); i54++) {
                                zzga zzgaVar4 = (zzga) arrayList9.get(i54);
                                zzeu zzeuVar10 = zzgaVar4.f16879b;
                                int i55 = zzgaVar4.f16892a;
                                if (i55 == 1935828848) {
                                    zzeuVar10.m6363E(12);
                                    if (zzeuVar10.m6376b() == 1936025959) {
                                        zzeuVar8 = zzeuVar10;
                                    }
                                } else if (i55 == 1936158820) {
                                    zzeuVar10.m6363E(12);
                                    if (zzeuVar10.m6376b() == 1936025959) {
                                        zzeuVar9 = zzeuVar10;
                                    }
                                }
                            }
                            if (zzeuVar8 != null && zzeuVar9 != null) {
                                zzeuVar8.m6363E(8);
                                int iM4191a = zzalo.m4191a(zzeuVar8.m6376b());
                                zzeuVar8.m6365G(4);
                                if (iM4191a == 1) {
                                    zzeuVar8.m6365G(4);
                                }
                                if (zzeuVar8.m6376b() != 1) {
                                    throw zzat.m4384b("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzeuVar9.m6363E(8);
                                int iM4191a2 = zzalo.m4191a(zzeuVar9.m6376b());
                                zzeuVar9.m6365G(4);
                                if (iM4191a2 == 1) {
                                    if (zzeuVar9.m6374P() == 0) {
                                        throw zzat.m4384b("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iM4191a2 >= 2) {
                                    zzeuVar9.m6365G(4);
                                }
                                if (zzeuVar9.m6374P() != 1) {
                                    throw zzat.m4384b("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzeuVar9.m6365G(1);
                                int iM6369K3 = zzeuVar9.m6369K();
                                int i56 = (iM6369K3 & 240) >> 4;
                                int i57 = iM6369K3 & 15;
                                if (zzeuVar9.m6369K() == 1) {
                                    int iM6369K4 = zzeuVar9.m6369K();
                                    byte[] bArr3 = new byte[16];
                                    zzeuVar9.m6366H(bArr3, 0, 16);
                                    if (iM6369K4 == 0) {
                                        int iM6369K5 = zzeuVar9.m6369K();
                                        byte[] bArr4 = new byte[iM6369K5];
                                        zzeuVar9.m6366H(bArr4, 0, iM6369K5);
                                        bArr = bArr4;
                                    } else {
                                        bArr = null;
                                    }
                                    zzamrVar5.f6025k = true;
                                    zzamrVar5.f6027m = new zzamq(true, str2, iM6369K4, bArr3, i56, i57, bArr);
                                }
                            }
                            int size5 = arrayList9.size();
                            for (int i58 = 0; i58 < size5; i58++) {
                                zzga zzgaVar5 = (zzga) arrayList9.get(i58);
                                if (zzgaVar5.f16892a == 1970628964) {
                                    zzeu zzeuVar11 = zzgaVar5.f16879b;
                                    zzeuVar11.m6363E(8);
                                    byte[] bArr5 = this.f5877h;
                                    zzeuVar11.m6366H(bArr5, 0, 16);
                                    if (Arrays.equals(bArr5, f5855N)) {
                                        m4210e(zzeuVar11, 16, zzamrVar5);
                                    }
                                }
                            }
                            i7 = 8;
                        }
                    } else {
                        arrayList = arrayList8;
                        i5 = size3;
                        arrayList2 = arrayList3;
                        i6 = i32;
                        i7 = i19;
                    }
                    i32 = i6 + 1;
                    i19 = i7;
                    arrayList8 = arrayList;
                    size3 = i5;
                    arrayList3 = arrayList2;
                }
                zzq zzqVarM4212k2 = m4212k(arrayList3);
                if (zzqVarM4212k2 != null) {
                    int size6 = sparseArray.size();
                    for (int i59 = 0; i59 < size6; i59++) {
                        zzalv zzalvVar3 = (zzalv) sparseArray.valueAt(i59);
                        zzamp zzampVar5 = zzalvVar3.f5845d.f6032a;
                        zzalp zzalpVar6 = zzalvVar3.f5843b.f6015a;
                        String str3 = zzfm.f16091a;
                        int i60 = zzalpVar6.f5829a;
                        zzamq[] zzamqVarArr2 = zzampVar5.f6009n;
                        zzamq zzamqVar2 = zzamqVarArr2 == null ? null : zzamqVarArr2[i60];
                        zzq zzqVarM8828a = zzqVarM4212k2.m8828a(zzamqVar2 != null ? zzamqVar2.f6011b : null);
                        zzt zztVar2 = new zzt(zzalvVar3.f5851j);
                        zztVar2.f20806r = zzqVarM8828a;
                        zzalvVar3.f5842a.mo4097e(new zzv(zztVar2));
                    }
                }
                if (this.f5893x != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i61 = 0; i61 < size7; i61++) {
                        zzalv zzalvVar4 = (zzalv) sparseArray.valueAt(i61);
                        long j10 = this.f5893x;
                        int i62 = zzalvVar4.f5847f;
                        while (true) {
                            zzamr zzamrVar6 = zzalvVar4.f5843b;
                            if (i62 >= zzamrVar6.f6019e || zzamrVar6.f6023i[i62] > j10) {
                                break;
                            }
                            if (zzamrVar6.f6024j[i62]) {
                                zzalvVar4.f5850i = i62;
                            }
                            i62++;
                        }
                    }
                    this.f5893x = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((zzfz) arrayDeque.peek()).f16831d.add(zzfzVar);
            }
        }
        m4213a();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        SparseArray sparseArray = this.f5873d;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzalv) sparseArray.valueAt(i2)).m4204a();
        }
        this.f5882m.clear();
        this.f5892w = 0;
        this.f5883n.f18477d.clear();
        this.f5893x = j3;
        this.f5881l.clear();
        this.f5869M = -1L;
        m4213a();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        zzgwt zzgwtVarM7216n;
        zzahh zzahhVarM4224a = zzamn.m4224a(zzagbVar, true);
        if (zzahhVarM4224a != null) {
            zzgwtVarM7216n = zzgwt.m7216n(zzahhVarM4224a);
        } else {
            zzgzi zzgziVar = zzgwt.f18303t;
            zzgwtVarM7216n = zzgyo.f18355w;
        }
        this.f5885p = zzgwtVarM7216n;
        return zzahhVarM4224a == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        if ((this.f5871b & 32) == 0) {
            zzagdVar = new zzant(zzagdVar, this.f5870a);
        }
        this.f5863G = zzagdVar;
        m4213a();
        zzahm[] zzahmVarArr = new zzahm[2];
        this.f5864H = zzahmVarArr;
        int i2 = 0;
        zzahm[] zzahmVarArr2 = (zzahm[]) zzfm.m6513o(0, zzahmVarArr);
        this.f5864H = zzahmVarArr2;
        for (zzahm zzahmVar : zzahmVarArr2) {
            zzahmVar.mo4097e(f5856O);
        }
        List list = this.f5872c;
        this.f5865I = new zzahm[list.size()];
        int i3 = 100;
        while (i2 < this.f5865I.length) {
            int i4 = i3 + 1;
            zzahm zzahmVarMo4109f = this.f5863G.mo4109f(i3, 3);
            zzahmVarMo4109f.mo4097e((zzv) list.get(i2));
            this.f5865I[i2] = zzahmVarMo4109f;
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:142:0x0289  */
    /* JADX WARN: Code duplicated, block: B:416:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:423:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:426:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:428:0x08da  */
    /* JADX WARN: Code duplicated, block: B:429:0x0904  */
    /* JADX WARN: Code duplicated, block: B:431:0x0910  */
    /* JADX WARN: Code duplicated, block: B:439:0x092e  */
    /* JADX WARN: Code duplicated, block: B:447:0x095c  */
    /* JADX WARN: Code duplicated, block: B:449:0x0963 A[LOOP:2: B:448:0x0961->B:449:0x0963, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:452:0x0979  */
    /* JADX WARN: Code duplicated, block: B:453:0x0986  */
    /* JADX WARN: Code duplicated, block: B:455:0x098b  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:552:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:557:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:558:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:563:0x0ae6  */
    /* JADX WARN: Code duplicated, block: B:572:0x058d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        zzafp zzafpVar;
        ArrayDeque arrayDeque;
        zzhb zzhbVar;
        int i2;
        zzeu zzeuVar;
        ArrayDeque arrayDeque2;
        String strM6387m;
        long j2;
        long jM6374P;
        String str;
        long j3;
        long j4;
        long j5;
        char c;
        char c2;
        zzalv zzalvVar;
        boolean z;
        zzalv zzalvVar2;
        int i3;
        int iMo4122d;
        int i4;
        boolean z2;
        String strM7091l;
        byte b;
        int i5;
        int iM4207d;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        long jM6374P2;
        long j8;
        long j9;
        long j10;
        long jMo4086g;
        int i9;
        int i10;
        long j11;
        long j12;
        int size;
        int i11;
        zzagb zzagbVar2 = zzagbVar;
        loop0: while (true) {
            zzaha zzahaVar2 = zzahaVar;
            while (true) {
                int i12 = this.f5886q;
                zzafpVar = this.f5884o;
                arrayDeque = this.f5881l;
                zzhbVar = this.f5883n;
                i2 = this.f5871b;
                zzeuVar = this.f5878i;
                SparseArray sparseArray = this.f5873d;
                boolean z3 = true;
                if (i12 != 0) {
                    arrayDeque2 = this.f5882m;
                    if (i12 != 1) {
                        long j13 = LocationRequestCompat.PASSIVE_INTERVAL;
                        if (i12 != 2) {
                            c = 6;
                            c2 = 2;
                            if (i12 == 5) {
                                zzeuVar.m6396y(16);
                                if (zzagbVar2.mo4079I(zzeuVar.f14887a, 0, 16, true)) {
                                    zzeuVar.m6363E(0);
                                    int iM6376b = zzeuVar.m6376b();
                                    int iM6376b2 = zzeuVar.m6376b();
                                    if (iM6376b == 16 && iM6376b2 == 1835430511) {
                                        zzeuVar.m6365G(4);
                                        long jM6374P3 = zzeuVar.m6374P();
                                        long jMo4089j = zzagbVar2.mo4089j() - jM6374P3;
                                        if (jM6374P3 <= 0 || jM6374P3 > 2147483647L || jMo4089j < 0 || jMo4089j < this.f5869M) {
                                            m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                        } else {
                                            zzahaVar2.f5303a = jMo4089j;
                                            this.f5886q = 6;
                                        }
                                    } else {
                                        m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                    }
                                } else {
                                    m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                }
                                int i13 = this.f5886q;
                                if (i13 == 6 || i13 == 0) {
                                    return 1;
                                }
                            } else if (i12 != 6) {
                                zzalvVar = this.f5857A;
                                if (zzalvVar != null) {
                                    z = true;
                                    break loop0;
                                }
                                int size2 = sparseArray.size();
                                int i14 = 0;
                                zzalv zzalvVar3 = null;
                                while (i14 < size2) {
                                    zzalv zzalvVar4 = (zzalv) sparseArray.valueAt(i14);
                                    boolean z4 = z3;
                                    boolean z5 = zzalvVar4.f5854m;
                                    zzamr zzamrVar = zzalvVar4.f5843b;
                                    if (z5) {
                                        i6 = size2;
                                    } else {
                                        i6 = size2;
                                        if (zzalvVar4.f5847f != zzalvVar4.f5845d.f6033b) {
                                        }
                                        i14++;
                                        size2 = i6;
                                        z3 = z4;
                                    }
                                    if (!z5 || zzalvVar4.f5849h != zzamrVar.f6018d) {
                                        long j14 = !z5 ? zzalvVar4.f5845d.f6034c[zzalvVar4.f5847f] : zzamrVar.f6020f[zzalvVar4.f5849h];
                                        if (j14 < j13) {
                                            j13 = j14;
                                            zzalvVar3 = zzalvVar4;
                                        }
                                    }
                                    i14++;
                                    size2 = i6;
                                    z3 = z4;
                                }
                                z = z3;
                                if (zzalvVar3 != null) {
                                    int iMo4086g = (int) ((!zzalvVar3.f5854m ? zzalvVar3.f5845d.f6034c[zzalvVar3.f5847f] : zzalvVar3.f5843b.f6020f[zzalvVar3.f5849h]) - zzagbVar2.mo4086g());
                                    if (iMo4086g < 0) {
                                        zzeh.m6211c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        iMo4086g = 0;
                                    }
                                    zzagbVar2.mo4091o(iMo4086g);
                                    this.f5857A = zzalvVar3;
                                    zzalvVar = zzalvVar3;
                                    break loop0;
                                }
                                int iMo4086g2 = (int) (this.f5891v - zzagbVar2.mo4086g());
                                if (iMo4086g2 < 0) {
                                    throw zzat.m4383a(null, "Offset to end of mdat was negative.");
                                }
                                zzagbVar2.mo4091o(iMo4086g2);
                                m4213a();
                            } else {
                                long jMo4089j2 = zzagbVar2.mo4089j() - zzagbVar2.mo4086g();
                                zzeuVar.m6396y(8);
                                if (zzagbVar2.mo4081K(zzeuVar.f14887a, 0, 8, true)) {
                                    zzeuVar.m6363E(0);
                                    int iM6376b3 = zzeuVar.m6376b();
                                    if (zzeuVar.m6376b() != 1835430497) {
                                        m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                    } else {
                                        int i15 = (int) jMo4089j2;
                                        zzeu zzeuVar2 = new zzeu(i15);
                                        zzagbVar2.mo4076F(zzeuVar2.f14887a, 0, i15);
                                        zzeuVar2.m6363E(iM6376b3 == 1 ? 16 : 8);
                                        SparseArray sparseArray2 = new SparseArray();
                                        SparseArray sparseArray3 = new SparseArray();
                                        while (zzeuVar2.m6360B() >= 8) {
                                            int i16 = zzeuVar2.f14888b;
                                            long jM6374P4 = zzeuVar2.m6374P();
                                            int iM6376b4 = zzeuVar2.m6376b();
                                            if (jM6374P4 == 1) {
                                                if (zzeuVar2.m6360B() < 8) {
                                                    break;
                                                }
                                                jM6374P4 = zzeuVar2.m6378d();
                                            } else if (jM6374P4 == 0) {
                                                jM6374P4 = ((long) zzeuVar2.f14889c) - ((long) i16);
                                            }
                                            int i17 = jM6374P4 == 1 ? 16 : 8;
                                            if (jM6374P4 < i17) {
                                                break;
                                            }
                                            long j15 = i16;
                                            if (jM6374P4 > ((long) zzeuVar2.f14889c) - j15) {
                                                break;
                                            }
                                            if (iM6376b4 != 1952871009) {
                                                j6 = jM6374P4;
                                                j7 = j15;
                                            } else if (jM6374P4 < i17 + 16) {
                                                zzeuVar2.m6363E((int) (j15 + jM6374P4));
                                            } else {
                                                int iM4191a = zzalo.m4191a(zzeuVar2.m6376b());
                                                int iM6376b5 = zzeuVar2.m6376b();
                                                zzalv zzalvVar5 = (zzalv) sparseArray.get(iM6376b5);
                                                if (zzalvVar5 == null) {
                                                    zzeuVar2.m6363E((int) (j15 + jM6374P4));
                                                } else {
                                                    long j16 = zzalvVar5.f5845d.f6032a.f5998c;
                                                    int iM6376b6 = zzeuVar2.m6376b();
                                                    int i18 = iM6376b6 >> 4;
                                                    int i19 = iM6376b6 >> 2;
                                                    int i20 = iM6376b6 & 3;
                                                    j6 = jM6374P4;
                                                    long jM6374P5 = zzeuVar2.m6374P();
                                                    int i21 = (i18 & 3) + 1;
                                                    j7 = j15;
                                                    int i22 = (i19 & 3) + 1;
                                                    int i23 = i20 + 1;
                                                    if (((iM4191a == 1 ? 16L : 8L) + ((long) i21) + ((long) i22) + ((long) i23)) * jM6374P5 > zzeuVar2.m6360B()) {
                                                        zzeuVar2.m6363E((int) (j7 + j6));
                                                    } else {
                                                        int i24 = (int) jM6374P5;
                                                        long[] jArr = new long[i24];
                                                        long[] jArr2 = new long[i24];
                                                        int i25 = 0;
                                                        while (i25 < i24) {
                                                            int i26 = i21;
                                                            if (iM4191a == 1) {
                                                                jM6374P2 = zzeuVar2.m6384j();
                                                                iM4191a = 1;
                                                            } else {
                                                                jM6374P2 = zzeuVar2.m6374P();
                                                            }
                                                            long j17 = jM6374P2;
                                                            long jM6384j = iM4191a == 1 ? zzeuVar2.m6384j() : zzeuVar2.m6374P();
                                                            zzeuVar2.m6365G(i26 + i22 + i23);
                                                            jArr[i25] = zzfm.m6521w(j17, 1000000L, j16, RoundingMode.DOWN);
                                                            jArr2[i25] = jM6384j;
                                                            i25++;
                                                            i21 = i26;
                                                            iM4191a = iM4191a;
                                                        }
                                                        sparseArray2.put(iM6376b5, jArr);
                                                        sparseArray3.put(iM6376b5, jArr2);
                                                    }
                                                }
                                            }
                                            zzeuVar2.m6363E((int) (j7 + j6));
                                        }
                                        if (sparseArray2.size() == 0) {
                                            m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                        } else {
                                            int iKeyAt = -1;
                                            int i27 = -1;
                                            for (int i28 = 0; i28 < sparseArray2.size(); i28++) {
                                                int iKeyAt2 = sparseArray2.keyAt(i28);
                                                zzalv zzalvVar6 = (zzalv) sparseArray.get(iKeyAt2);
                                                if (zzalvVar6 != null) {
                                                    int i29 = zzalvVar6.f5845d.f6032a.f5997b;
                                                    if (iKeyAt != -1) {
                                                        i8 = iKeyAt;
                                                    } else if (i29 == 2) {
                                                        iKeyAt = iKeyAt2;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    if (i27 == -1) {
                                                        i27 = i29 == 1 ? iKeyAt2 : -1;
                                                    }
                                                    iKeyAt = i8;
                                                }
                                            }
                                            if (iKeyAt != -1) {
                                                i7 = iKeyAt;
                                            } else if (i27 != -1) {
                                                i7 = i27;
                                            } else {
                                                iKeyAt = sparseArray2.keyAt(0);
                                                i7 = iKeyAt;
                                            }
                                            m4215l(new zzalu(sparseArray2, sparseArray3, this.f5894y, this.f5869M, i7), zzahaVar2);
                                        }
                                    }
                                } else {
                                    m4215l(new zzahc(this.f5894y, this.f5869M), zzahaVar2);
                                }
                                if (this.f5886q == 0) {
                                    return 1;
                                }
                            }
                        } else {
                            int size3 = sparseArray.size();
                            zzalv zzalvVar7 = null;
                            for (int i30 = 0; i30 < size3; i30++) {
                                zzamr zzamrVar2 = ((zzalv) sparseArray.valueAt(i30)).f5843b;
                                if (zzamrVar2.f6029o) {
                                    long j18 = zzamrVar2.f6017c;
                                    if (j18 < j13) {
                                        zzalvVar7 = (zzalv) sparseArray.valueAt(i30);
                                        j13 = j18;
                                    }
                                }
                            }
                            if (zzalvVar7 == null) {
                                this.f5886q = 3;
                            } else {
                                int iMo4086g3 = (int) (j13 - zzagbVar2.mo4086g());
                                if (iMo4086g3 < 0) {
                                    throw zzat.m4383a(null, "Offset to encryption data was negative.");
                                }
                                zzagbVar2.mo4091o(iMo4086g3);
                                zzamr zzamrVar3 = zzalvVar7.f5843b;
                                zzeu zzeuVar3 = zzamrVar3.f6028n;
                                zzagbVar2.mo4076F(zzeuVar3.f14887a, 0, zzeuVar3.f14889c);
                                zzeuVar3.m6363E(0);
                                zzamrVar3.f6029o = false;
                            }
                        }
                    }
                } else {
                    int i31 = this.f5889t;
                    zzeu zzeuVar4 = this.f5880k;
                    if (i31 == 0) {
                        if (!zzagbVar2.mo4079I(zzeuVar4.f14887a, 0, 8, true)) {
                            long j19 = this.f5868L;
                            if (j19 == -1) {
                                zzhbVar.m7338c(0);
                                return -1;
                            }
                            zzahaVar.f5303a = j19;
                            this.f5868L = -1L;
                            this.f5863G.mo4108d(zzafpVar.m4074b());
                            this.f5867K = true;
                            return 1;
                        }
                        this.f5889t = 8;
                        zzeuVar4.m6363E(0);
                        this.f5888s = zzeuVar4.m6374P();
                        this.f5887r = zzeuVar4.m6376b();
                    }
                    long j20 = this.f5888s;
                    if (j20 == 1) {
                        zzagbVar2.mo4076F(zzeuVar4.f14887a, 8, 8);
                        this.f5889t += 8;
                        this.f5888s = zzeuVar4.m6384j();
                    } else {
                        if (j20 == 0) {
                            long jMo4089j3 = zzagbVar2.mo4089j();
                            if (jMo4089j3 == -1) {
                                jMo4089j3 = !arrayDeque.isEmpty() ? ((zzfz) arrayDeque.peek()).f16829b : -1L;
                            }
                            if (jMo4089j3 != -1) {
                                this.f5888s = (jMo4089j3 - zzagbVar2.mo4086g()) + ((long) this.f5889t);
                            }
                        }
                        j8 = this.f5888s;
                        int i32 = this.f5889t;
                        j9 = i32;
                        if (j8 >= j9) {
                            j10 = j9;
                        } else {
                            if (this.f5887r == 1718773093 || i32 != 8) {
                                throw zzat.m4384b("Atom size less than header length (unsupported).");
                            }
                            this.f5888s = j9;
                            j8 = j9;
                            j10 = j8;
                        }
                        if (this.f5868L != r10) {
                            if (this.f5887r == 1936286840) {
                                zzeuVar.m6396y((int) j8);
                                System.arraycopy(zzeuVar4.f14887a, 0, zzeuVar.f14887a, 0, 8);
                                zzagbVar2.mo4076F(zzeuVar.f14887a, 8, (int) (this.f5888s - ((long) this.f5889t)));
                                zzafpVar.m4073a((zzafo) m4211f(zzagbVar2.mo4084e(), zzeuVar).second);
                            } else {
                                zzagbVar2.mo4077G((int) (j8 - j10), true);
                            }
                            m4213a();
                        } else {
                            jMo4086g = zzagbVar2.mo4086g() - j10;
                            i9 = this.f5887r;
                            if ((i9 == 1836019558 && i9 != 1835295092) || this.f5866J) {
                                if (this.f5887r == 1836019558) {
                                    size = sparseArray.size();
                                    for (i11 = 0; i11 < size; i11++) {
                                        zzamr zzamrVar4 = ((zzalv) sparseArray.valueAt(i11)).f5843b;
                                        zzamrVar4.f6017c = jMo4086g;
                                        zzamrVar4.f6016b = jMo4086g;
                                    }
                                }
                                i10 = this.f5887r;
                                if (i10 == 1835295092) {
                                    this.f5857A = null;
                                    this.f5891v = jMo4086g + this.f5888s;
                                    this.f5886q = 2;
                                } else if (i10 != 1836019574) {
                                    long jMo4086g2 = zzagbVar2.mo4086g();
                                    j11 = this.f5888s;
                                    long j21 = jMo4086g2 + j11;
                                    if (j11 != this.f5889t) {
                                        zzeuVar.m6396y(8);
                                        zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                        zzalo.m4196f(zzeuVar);
                                        zzagbVar2.mo4091o(zzeuVar.f14888b);
                                        zzagbVar2.zzl();
                                    }
                                    j12 = j21 - 8;
                                    arrayDeque.push(new zzfz(this.f5887r, j12));
                                    if (this.f5888s == this.f5889t) {
                                        m4214c(j12);
                                    } else {
                                        m4213a();
                                    }
                                } else {
                                    long jMo4086g3 = zzagbVar2.mo4086g();
                                    j11 = this.f5888s;
                                    long j22 = jMo4086g3 + j11;
                                    if (j11 != this.f5889t) {
                                        zzeuVar.m6396y(8);
                                        zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                        zzalo.m4196f(zzeuVar);
                                        zzagbVar2.mo4091o(zzeuVar.f14888b);
                                        zzagbVar2.zzl();
                                    }
                                    j12 = j22 - 8;
                                    arrayDeque.push(new zzfz(this.f5887r, j12));
                                    if (this.f5888s == this.f5889t) {
                                        m4214c(j12);
                                    } else {
                                        m4213a();
                                    }
                                }
                            } else if (zzagbVar2.mo4089j() == r10 && this.f5869M == -1 && (i2 & 512) != 0) {
                                this.f5869M = jMo4086g;
                                zzahaVar.f5303a = zzagbVar2.mo4089j() - 16;
                                this.f5886q = 5;
                            } else {
                                this.f5863G.mo4108d(new zzahc(this.f5894y, jMo4086g));
                                this.f5866J = true;
                                if (this.f5887r == 1836019558) {
                                    size = sparseArray.size();
                                    while (i11 < size) {
                                        zzamr zzamrVar5 = ((zzalv) sparseArray.valueAt(i11)).f5843b;
                                        zzamrVar5.f6017c = jMo4086g;
                                        zzamrVar5.f6016b = jMo4086g;
                                    }
                                }
                                i10 = this.f5887r;
                                if (i10 == 1835295092) {
                                    this.f5857A = null;
                                    this.f5891v = jMo4086g + this.f5888s;
                                    this.f5886q = 2;
                                } else if (i10 != 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473) {
                                    long jMo4086g4 = zzagbVar2.mo4086g();
                                    j11 = this.f5888s;
                                    long j23 = jMo4086g4 + j11;
                                    if (j11 != this.f5889t && i10 == 1835365473) {
                                        zzeuVar.m6396y(8);
                                        zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                        zzalo.m4196f(zzeuVar);
                                        zzagbVar2.mo4091o(zzeuVar.f14888b);
                                        zzagbVar2.zzl();
                                    }
                                    j12 = j23 - 8;
                                    arrayDeque.push(new zzfz(this.f5887r, j12));
                                    if (this.f5888s == this.f5889t) {
                                        m4214c(j12);
                                    } else {
                                        m4213a();
                                    }
                                } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                                    if (this.f5889t != 8) {
                                        throw zzat.m4384b("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    if (this.f5888s > 2147483647L) {
                                        throw zzat.m4384b("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    zzeu zzeuVar5 = new zzeu((int) this.f5888s);
                                    System.arraycopy(zzeuVar4.f14887a, 0, zzeuVar5.f14887a, 0, 8);
                                    this.f5890u = zzeuVar5;
                                    this.f5886q = 1;
                                } else {
                                    if (this.f5888s > 2147483647L) {
                                        throw zzat.m4384b("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.f5890u = null;
                                    this.f5886q = 1;
                                }
                            }
                        }
                        if (this.f5886q == 5) {
                            return 1;
                        }
                        zzahaVar2 = zzahaVar;
                    }
                    j8 = this.f5888s;
                    int i33 = this.f5889t;
                    j9 = i33;
                    if (j8 >= j9) {
                        if (this.f5887r == 1718773093) {
                        }
                        throw zzat.m4384b("Atom size less than header length (unsupported).");
                    }
                    j10 = j9;
                    if (this.f5868L != r10) {
                        if (this.f5887r == 1936286840) {
                            zzeuVar.m6396y((int) j8);
                            System.arraycopy(zzeuVar4.f14887a, 0, zzeuVar.f14887a, 0, 8);
                            zzagbVar2.mo4076F(zzeuVar.f14887a, 8, (int) (this.f5888s - ((long) this.f5889t)));
                            zzafpVar.m4073a((zzafo) m4211f(zzagbVar2.mo4084e(), zzeuVar).second);
                        } else {
                            zzagbVar2.mo4077G((int) (j8 - j10), true);
                        }
                        m4213a();
                    } else {
                        jMo4086g = zzagbVar2.mo4086g() - j10;
                        i9 = this.f5887r;
                        if (i9 == 1836019558) {
                            if (zzagbVar2.mo4089j() == r10) {
                            }
                            this.f5863G.mo4108d(new zzahc(this.f5894y, jMo4086g));
                            this.f5866J = true;
                            if (this.f5887r == 1836019558) {
                                size = sparseArray.size();
                                while (i11 < size) {
                                    zzamr zzamrVar6 = ((zzalv) sparseArray.valueAt(i11)).f5843b;
                                    zzamrVar6.f6017c = jMo4086g;
                                    zzamrVar6.f6016b = jMo4086g;
                                }
                            }
                            i10 = this.f5887r;
                            if (i10 == 1835295092) {
                                this.f5857A = null;
                                this.f5891v = jMo4086g + this.f5888s;
                                this.f5886q = 2;
                            } else if (i10 != 1836019574) {
                                long jMo4086g5 = zzagbVar2.mo4086g();
                                j11 = this.f5888s;
                                long j24 = jMo4086g5 + j11;
                                if (j11 != this.f5889t) {
                                    zzeuVar.m6396y(8);
                                    zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                    zzalo.m4196f(zzeuVar);
                                    zzagbVar2.mo4091o(zzeuVar.f14888b);
                                    zzagbVar2.zzl();
                                }
                                j12 = j24 - 8;
                                arrayDeque.push(new zzfz(this.f5887r, j12));
                                if (this.f5888s == this.f5889t) {
                                    m4214c(j12);
                                } else {
                                    m4213a();
                                }
                            } else {
                                long jMo4086g6 = zzagbVar2.mo4086g();
                                j11 = this.f5888s;
                                long j25 = jMo4086g6 + j11;
                                if (j11 != this.f5889t) {
                                    zzeuVar.m6396y(8);
                                    zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                    zzalo.m4196f(zzeuVar);
                                    zzagbVar2.mo4091o(zzeuVar.f14888b);
                                    zzagbVar2.zzl();
                                }
                                j12 = j25 - 8;
                                arrayDeque.push(new zzfz(this.f5887r, j12));
                                if (this.f5888s == this.f5889t) {
                                    m4214c(j12);
                                } else {
                                    m4213a();
                                }
                            }
                        } else {
                            if (zzagbVar2.mo4089j() == r10) {
                            }
                            this.f5863G.mo4108d(new zzahc(this.f5894y, jMo4086g));
                            this.f5866J = true;
                            if (this.f5887r == 1836019558) {
                                size = sparseArray.size();
                                while (i11 < size) {
                                    zzamr zzamrVar7 = ((zzalv) sparseArray.valueAt(i11)).f5843b;
                                    zzamrVar7.f6017c = jMo4086g;
                                    zzamrVar7.f6016b = jMo4086g;
                                }
                            }
                            i10 = this.f5887r;
                            if (i10 == 1835295092) {
                                this.f5857A = null;
                                this.f5891v = jMo4086g + this.f5888s;
                                this.f5886q = 2;
                            } else if (i10 != 1836019574) {
                                long jMo4086g7 = zzagbVar2.mo4086g();
                                j11 = this.f5888s;
                                long j26 = jMo4086g7 + j11;
                                if (j11 != this.f5889t) {
                                    zzeuVar.m6396y(8);
                                    zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                    zzalo.m4196f(zzeuVar);
                                    zzagbVar2.mo4091o(zzeuVar.f14888b);
                                    zzagbVar2.zzl();
                                }
                                j12 = j26 - 8;
                                arrayDeque.push(new zzfz(this.f5887r, j12));
                                if (this.f5888s == this.f5889t) {
                                    m4214c(j12);
                                } else {
                                    m4213a();
                                }
                            } else {
                                long jMo4086g8 = zzagbVar2.mo4086g();
                                j11 = this.f5888s;
                                long j27 = jMo4086g8 + j11;
                                if (j11 != this.f5889t) {
                                    zzeuVar.m6396y(8);
                                    zzagbVar2.mo4078H(zzeuVar.f14887a, 0, 8);
                                    zzalo.m4196f(zzeuVar);
                                    zzagbVar2.mo4091o(zzeuVar.f14888b);
                                    zzagbVar2.zzl();
                                }
                                j12 = j27 - 8;
                                arrayDeque.push(new zzfz(this.f5887r, j12));
                                if (this.f5888s == this.f5889t) {
                                    m4214c(j12);
                                } else {
                                    m4213a();
                                }
                            }
                        }
                    }
                    if (this.f5886q == 5) {
                        return 1;
                    }
                    zzahaVar2 = zzahaVar;
                }
            }
            long j28 = this.f5888s - ((long) this.f5889t);
            zzeu zzeuVar6 = this.f5890u;
            int i34 = (int) j28;
            if (zzeuVar6 != null) {
                zzagbVar2.mo4076F(zzeuVar6.f14887a, 8, i34);
                int i35 = this.f5887r;
                zzga zzgaVar = new zzga(i35, zzeuVar6);
                if (!arrayDeque.isEmpty()) {
                    ((zzfz) arrayDeque.peek()).f16830c.add(zzgaVar);
                } else if (i35 == 1936286840) {
                    Pair pairM4211f = m4211f(zzagbVar2.mo4086g(), zzeuVar6);
                    zzafpVar.m4073a((zzafo) pairM4211f.second);
                    this.f5895z = ((Long) pairM4211f.first).longValue();
                    if (!this.f5867K) {
                        this.f5863G.mo4108d(zzafpVar.f5203a.size() == 1 ? (zzahd) pairM4211f.second : zzafpVar.m4074b());
                        this.f5866J = true;
                    }
                } else if (i35 != 1701671783 || this.f5864H.length == 0) {
                    zzagbVar2 = zzagbVar;
                } else {
                    zzeuVar6.m6363E(8);
                    int iM4191a2 = zzalo.m4191a(zzeuVar6.m6376b());
                    if (iM4191a2 == 0) {
                        strM6387m = zzeuVar6.m6387m();
                        strM6387m.getClass();
                        String strM6387m2 = zzeuVar6.m6387m();
                        strM6387m2.getClass();
                        long jM6374P6 = zzeuVar6.m6374P();
                        long jM6374P7 = zzeuVar6.m6374P();
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long jM6521w = zzfm.m6521w(jM6374P7, 1000000L, jM6374P6, roundingMode);
                        long j29 = this.f5895z;
                        long j30 = j29 != -9223372036854775807L ? j29 + jM6521w : -9223372036854775807L;
                        long jM6521w2 = zzfm.m6521w(zzeuVar6.m6374P(), 1000L, jM6374P6, roundingMode);
                        j2 = -9223372036854775807L;
                        jM6374P = zzeuVar6.m6374P();
                        str = strM6387m2;
                        j3 = j30;
                        j4 = jM6521w2;
                        j5 = jM6521w;
                    } else if (iM4191a2 != 1) {
                        AbstractC5152f.m3776h(new StringBuilder(String.valueOf(iM4191a2).length() + 35), "Skipping unsupported emsg version: ", iM4191a2, "FragmentedMp4Extractor");
                    } else {
                        long jM6374P8 = zzeuVar6.m6374P();
                        long jM6384j2 = zzeuVar6.m6384j();
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long jM6521w3 = zzfm.m6521w(jM6384j2, 1000000L, jM6374P8, roundingMode2);
                        long jM6521w4 = zzfm.m6521w(zzeuVar6.m6374P(), 1000L, jM6374P8, roundingMode2);
                        long jM6374P9 = zzeuVar6.m6374P();
                        strM6387m = zzeuVar6.m6387m();
                        strM6387m.getClass();
                        String strM6387m3 = zzeuVar6.m6387m();
                        strM6387m3.getClass();
                        j2 = -9223372036854775807L;
                        jM6374P = jM6374P9;
                        str = strM6387m3;
                        j4 = jM6521w4;
                        j5 = -9223372036854775807L;
                        j3 = jM6521w3;
                    }
                    byte[] bArr = new byte[zzeuVar6.m6360B()];
                    zzeuVar6.m6366H(bArr, 0, zzeuVar6.m6360B());
                    zzajf zzajfVar = this.f5879j;
                    ByteArrayOutputStream byteArrayOutputStream = zzajfVar.f5510a;
                    byteArrayOutputStream.reset();
                    try {
                        DataOutputStream dataOutputStream = zzajfVar.f5511b;
                        dataOutputStream.writeBytes(strM6387m);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeBytes(str);
                        dataOutputStream.writeByte(0);
                        dataOutputStream.writeLong(j4);
                        dataOutputStream.writeLong(jM6374P);
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        zzeu zzeuVar7 = new zzeu(byteArrayOutputStream.toByteArray());
                        int iM6360B = zzeuVar7.m6360B();
                        for (zzahm zzahmVar : this.f5864H) {
                            zzeuVar7.m6363E(0);
                            zzahmVar.mo4121a(iM6360B, zzeuVar7);
                        }
                        if (j3 == j2) {
                            arrayDeque2.addLast(new zzalt(iM6360B, true, j5));
                            this.f5892w += iM6360B;
                        } else if (arrayDeque2.isEmpty()) {
                            for (zzahm zzahmVar2 : this.f5864H) {
                                zzahmVar2.mo4095b(j3, 1, iM6360B, 0, null);
                            }
                        } else {
                            arrayDeque2.addLast(new zzalt(iM6360B, false, j3));
                            this.f5892w += iM6360B;
                        }
                        zzagbVar2 = zzagbVar;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                zzagbVar2.mo4091o(i34);
            }
            m4214c(zzagbVar2.mo4086g());
        }
        zzahm zzahmVar3 = zzalvVar.f5842a;
        zzamr zzamrVar8 = zzalvVar.f5843b;
        if (this.f5886q == 3) {
            this.f5858B = !zzalvVar.f5854m ? zzalvVar.f5845d.f6035d[zzalvVar.f5847f] : zzamrVar8.f6022h[zzalvVar.f5847f];
            String str2 = zzalvVar.f5845d.f6032a.f6002g.f21061o;
            this.f5861E = !((!Objects.equals(str2, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i2 & 128) == 0) : (i2 & 64) != 0) ? false : z);
            if (zzalvVar.f5847f < zzalvVar.f5850i) {
                zzagbVar2.mo4091o(this.f5858B);
                zzamq zzamqVarM4208e = zzalvVar.m4208e();
                if (zzamqVarM4208e != null) {
                    zzeu zzeuVar8 = zzamrVar8.f6028n;
                    int i36 = zzamqVarM4208e.f6013d;
                    if (i36 != 0) {
                        zzeuVar8.m6365G(i36);
                    }
                    int i37 = zzalvVar.f5847f;
                    if (zzamrVar8.f6025k && zzamrVar8.f6026l[i37]) {
                        zzeuVar8.m6365G(zzeuVar8.m6370L() * 6);
                    }
                }
                if (!zzalvVar.m4206c()) {
                    this.f5857A = null;
                }
                this.f5886q = 3;
                return 0;
            }
            if (zzalvVar.f5845d.f6032a.f6003h == z) {
                this.f5858B -= 8;
                zzagbVar2.mo4091o(8);
            }
            if ("audio/ac4".equals(zzalvVar.f5845d.f6032a.f6002g.f21061o)) {
                this.f5859C = zzalvVar.m4207d(this.f5858B, 7);
                zzafd.m4058b(this.f5858B, zzeuVar);
                zzahmVar3.mo4121a(7, zzeuVar);
                iM4207d = this.f5859C + 7;
                this.f5859C = iM4207d;
                i5 = 0;
            } else {
                i5 = 0;
                iM4207d = zzalvVar.m4207d(this.f5858B, 0);
                this.f5859C = iM4207d;
            }
            this.f5858B += iM4207d;
            this.f5886q = 4;
            this.f5860D = i5;
        }
        zzams zzamsVar = zzalvVar.f5845d;
        zzamp zzampVar = zzamsVar.f6032a;
        long j31 = !zzalvVar.f5854m ? zzamsVar.f6037f[zzalvVar.f5847f] : zzamrVar8.f6023i[zzalvVar.f5847f];
        int i38 = zzampVar.f6006k;
        zzv zzvVar = zzampVar.f6002g;
        if (i38 != 0) {
            zzeu zzeuVar9 = this.f5875f;
            byte[] bArr2 = zzeuVar9.f14887a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i39 = 4 - i38;
            while (true) {
                int i40 = i38;
                if (this.f5859C >= this.f5858B) {
                    break;
                }
                int i41 = this.f5860D;
                if (i41 == 0) {
                    if (this.f5865I.length > 0 || !this.f5861E) {
                        int iM7081b = zzgr.m7081b(zzvVar);
                        if (i40 + iM7081b > this.f5858B - this.f5859C) {
                            i4 = 0;
                        } else {
                            i4 = iM7081b;
                        }
                    } else {
                        i4 = 0;
                    }
                    zzagbVar2.mo4076F(bArr2, i39, i40 + i4);
                    zzeuVar9.m6363E(0);
                    int iM6376b7 = zzeuVar9.m6376b();
                    if (iM6376b7 < 0) {
                        throw zzat.m4383a(null, "Invalid NAL length");
                    }
                    this.f5860D = iM6376b7 - i4;
                    zzeu zzeuVar10 = this.f5874e;
                    zzalvVar2 = zzalvVar;
                    zzeuVar10.m6363E(0);
                    zzahmVar3.mo4121a(4, zzeuVar10);
                    this.f5859C += 4;
                    this.f5858B += i39;
                    if (this.f5865I.length <= 0 || i4 <= 0 || (strM7091l = zzgr.m7091l(zzvVar)) == null) {
                        i3 = i39;
                    } else {
                        int iHashCode = strM7091l.hashCode();
                        i3 = i39;
                        if (iHashCode != -1662541442) {
                            if (iHashCode != 1331836730) {
                                if (iHashCode == 1331856911 && strM7091l.equals("video/vvc")) {
                                    b = c2;
                                } else {
                                    b = -1;
                                }
                            } else if (strM7091l.equals("video/avc")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (strM7091l.equals("video/hevc")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        if (b == 0 ? (bArr2[4] & 31) == c : !(b == 1 ? ((bArr2[4] & 126) >> 1) != 39 : b != c2 || ((bArr2[5] & 248) >> 3) != 23)) {
                            z2 = true;
                        }
                        this.f5862F = z2;
                        zzahmVar3.mo4121a(i4, zzeuVar9);
                        this.f5859C += i4;
                        if (i4 <= 0 && !this.f5861E && zzgr.m7082c(bArr2, i4, zzvVar)) {
                            this.f5861E = true;
                        }
                    }
                    z2 = false;
                    this.f5862F = z2;
                    zzahmVar3.mo4121a(i4, zzeuVar9);
                    this.f5859C += i4;
                    if (i4 <= 0) {
                    }
                } else {
                    zzalvVar2 = zzalvVar;
                    i3 = i39;
                    if (this.f5862F) {
                        zzeu zzeuVar11 = this.f5876g;
                        zzeuVar11.m6396y(i41);
                        zzagbVar2.mo4076F(zzeuVar11.f14887a, 0, this.f5860D);
                        zzahmVar3.mo4121a(this.f5860D, zzeuVar11);
                        int i42 = this.f5860D;
                        int iM7080a = zzgr.m7080a(zzeuVar11.f14889c, zzeuVar11.f14887a);
                        zzeuVar11.m6363E(0);
                        zzeuVar11.m6361C(iM7080a);
                        int i43 = zzvVar.f21063q;
                        if (i43 == -1) {
                            if (zzhbVar.f18478e != 0) {
                                zzhbVar.m7336a(0);
                            }
                        } else if (zzhbVar.f18478e != i43) {
                            zzhbVar.m7336a(i43);
                        }
                        zzhbVar.m7337b(j31, zzeuVar11);
                        if ((zzalvVar2.m4205b() & 4) != 0) {
                            zzhbVar.m7338c(0);
                        }
                        iMo4122d = i42;
                    } else {
                        iMo4122d = zzahmVar3.mo4122d(zzagbVar2, i41, false);
                    }
                    this.f5859C += iMo4122d;
                    this.f5860D -= iMo4122d;
                }
                i39 = i3;
                i38 = i40;
                zzalvVar = zzalvVar2;
                c = 6;
                c2 = 2;
            }
        } else {
            while (true) {
                int i44 = this.f5859C;
                int i45 = this.f5858B;
                if (i44 >= i45) {
                    break;
                }
                this.f5859C += zzahmVar3.mo4122d(zzagbVar2, i45 - i44, false);
            }
        }
        zzalv zzalvVar8 = zzalvVar;
        int iM4205b = zzalvVar8.m4205b();
        if (!this.f5861E) {
            iM4205b |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        int i46 = iM4205b;
        zzamq zzamqVarM4208e2 = zzalvVar8.m4208e();
        long j32 = j31;
        zzahmVar3.mo4095b(j32, i46, this.f5858B, 0, zzamqVarM4208e2 != null ? zzamqVarM4208e2.f6012c : null);
        while (!arrayDeque2.isEmpty()) {
            zzalt zzaltVar = (zzalt) arrayDeque2.removeFirst();
            int i47 = this.f5892w;
            int i48 = zzaltVar.f5836c;
            this.f5892w = i47 - i48;
            long j33 = zzaltVar.f5834a;
            if (zzaltVar.f5835b) {
                j33 += j32;
            }
            long j34 = j33;
            for (zzahm zzahmVar4 : this.f5864H) {
                zzahmVar4.mo4095b(j34, 1, i48, this.f5892w, null);
            }
        }
        if (!zzalvVar8.m4206c()) {
            this.f5857A = null;
        }
        this.f5886q = 3;
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m4215l(zzahd zzahdVar, zzaha zzahaVar) {
        this.f5863G.mo4108d(zzahdVar);
        this.f5866J = true;
        zzahaVar.f5303a = this.f5869M;
        m4213a();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.f5885p;
    }

    public zzalw(zzanq zzanqVar, int i2, List list) {
        this.f5870a = zzanqVar;
        this.f5871b = i2;
        this.f5872c = Collections.unmodifiableList(list);
        this.f5879j = new zzajf();
        this.f5880k = new zzeu(16);
        this.f5874e = new zzeu(zzgr.f18091a);
        this.f5875f = new zzeu(6);
        this.f5876g = new zzeu();
        byte[] bArr = new byte[16];
        this.f5877h = bArr;
        this.f5878i = new zzeu(bArr);
        this.f5881l = new ArrayDeque();
        this.f5882m = new ArrayDeque();
        this.f5873d = new SparseArray();
        zzgzi zzgziVar = zzgwt.f18303t;
        this.f5885p = zzgyo.f18355w;
        this.f5894y = -9223372036854775807L;
        this.f5893x = -9223372036854775807L;
        this.f5895z = -9223372036854775807L;
        this.f5863G = zzagd.f5243j;
        this.f5864H = new zzahm[0];
        this.f5865I = new zzahm[0];
        this.f5883n = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzals
            @Override // com.google.android.gms.internal.ads.zzha
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo4203a(long j2, zzeu zzeuVar) {
                zzafn.m4071a(j2, zzeuVar, this.f5833a.f5865I);
            }
        });
        this.f5884o = new zzafp();
        this.f5868L = -1L;
        this.f5869M = -1L;
    }
}
