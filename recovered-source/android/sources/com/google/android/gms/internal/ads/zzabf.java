package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabf extends zzabi {
    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: e */
    public final void mo3922e(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    /* JADX INFO: renamed from: f */
    public final zzabj mo3923f(zzne[] zzneVarArr, zzzo zzzoVar, zzxl zzxlVar, zzbf zzbfVar) {
        int[] iArr;
        zzzo zzzoVar2 = zzzoVar;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = zzzoVar2.f21491a;
            zzbgVarArr[i2] = new zzbg[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = zzneVarArr[i5].mo8596k();
        }
        int i6 = 0;
        while (i6 < zzzoVar2.f21491a) {
            zzbg zzbgVarM9066a = zzzoVar2.m9066a(i6);
            int i7 = zzbgVarM9066a.f7809c;
            zzv[] zzvVarArr = zzbgVarM9066a.f7810d;
            int i8 = zzbgVarM9066a.f7807a;
            int i9 = i4;
            int i10 = 0;
            int i11 = 0;
            boolean z = true;
            while (i10 < i4) {
                zzne zzneVar = zzneVarArr[i10];
                int iMax = 0;
                for (int i12 = 0; i12 < i8; i12++) {
                    iMax = Math.max(iMax, zzneVar.mo8769b(zzvVarArr[i12]) & 7);
                }
                boolean z2 = iArr2[i10] == 0;
                if (iMax <= i11) {
                    if (iMax == i11 && i7 == 5 && !z && z2) {
                        z = true;
                    }
                    i10++;
                    i4 = 2;
                } else {
                    z = z2;
                }
                i11 = iMax;
                i9 = i10;
                i10++;
                i4 = 2;
            }
            if (i9 == i4) {
                iArr = new int[i8];
            } else {
                zzne zzneVar2 = zzneVarArr[i9];
                int[] iArr5 = new int[i8];
                for (int i13 = 0; i13 < i8; i13++) {
                    iArr5[i13] = zzneVar2.mo8769b(zzvVarArr[i13]);
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i9];
            zzbgVarArr[i9][i14] = zzbgVarM9066a;
            iArr3[i9][i14] = iArr;
            iArr2[i9] = i14 + 1;
            i6++;
            zzzoVar2 = zzzoVar;
            i4 = 2;
        }
        int i15 = i4;
        zzzo[] zzzoVarArr = new zzzo[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzzoVarArr[i16] = new zzzo((zzbg[]) zzfm.m6513o(i17, zzbgVarArr[i16]));
            iArr3[i16] = (int[][]) zzfm.m6513o(i17, iArr3[i16]);
            strArr[i16] = zzneVarArr[i16].mo4011o();
            iArr6[i16] = zzneVarArr[i16].zza();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzabe zzabeVar = new zzabe(iArr6, zzzoVarArr, iArr4, iArr3, new zzzo((zzbg[]) zzfm.m6513o(iArr2[i18], zzbgVarArr[i18])));
        Pair pairMo3916g = mo3916g(zzabeVar, iArr3, iArr4);
        zzabg[] zzabgVarArr = (zzabg[]) pairMo3916g.second;
        int length = zzabgVarArr.length;
        List[] listArr = new List[length];
        for (int i19 = 0; i19 < zzabgVarArr.length; i19++) {
            zzabg zzabgVar = zzabgVarArr[i19];
            listArr[i19] = zzabgVar != null ? zzgwt.m7216n(zzabgVar) : zzgyo.f18355w;
        }
        zzgwq zzgwqVar = new zzgwq();
        int i20 = 0;
        while (i20 < 2) {
            zzzo zzzoVar3 = zzzoVarArr[i20];
            int i21 = 0;
            while (i21 < zzzoVar3.f21491a) {
                zzbg zzbgVarM9066a2 = zzzoVar3.m9066a(i21);
                int i22 = zzzoVarArr[i20].m9066a(i21).f7807a;
                int[] iArr7 = new int[i22];
                int i23 = 0;
                int i24 = 0;
                while (i24 < i22) {
                    List[] listArr2 = listArr;
                    if ((iArr3[i20][i21][i24] & 7) == 4) {
                        iArr7[i23] = i24;
                        i23++;
                    }
                    i24++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i23);
                String str = null;
                int iMin = 16;
                zzzo[] zzzoVarArr2 = zzzoVarArr;
                int i25 = 0;
                boolean z3 = false;
                int i26 = 0;
                while (i25 < iArrCopyOf.length) {
                    int[] iArr8 = iArrCopyOf;
                    String str2 = zzzoVarArr2[i20].m9066a(i21).f7810d[iArrCopyOf[i25]].f21061o;
                    int i27 = i26 + 1;
                    if (i26 == 0) {
                        str = str2;
                    } else {
                        z3 |= !Objects.equals(str, str2);
                    }
                    iMin = Math.min(iMin, iArr3[i20][i21][i25] & 24);
                    i25++;
                    iArrCopyOf = iArr8;
                    i26 = i27;
                }
                if (z3) {
                    iMin = Math.min(iMin, zzabeVar.f4840c[i20]);
                }
                boolean z4 = iMin != 0;
                int i28 = zzbgVarM9066a2.f7807a;
                int[] iArr9 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr9[i29] = iArr3[i20][i21][i29] & 7;
                    int i30 = 0;
                    boolean z5 = false;
                    while (i30 < length) {
                        int i31 = length;
                        List list = listArr3[i30];
                        int i32 = i28;
                        int i33 = i20;
                        int i34 = 0;
                        while (i34 < list.size()) {
                            zzabg zzabgVar2 = (zzabg) list.get(i34);
                            List list2 = list;
                            if (zzabgVar2.zza().equals(zzbgVarM9066a2) && zzabgVar2.mo3921p(i29) != -1) {
                                z5 = true;
                                break;
                            }
                            i34++;
                            list = list2;
                        }
                        i30++;
                        length = i31;
                        i28 = i32;
                        i20 = i33;
                    }
                    zArr[i29] = z5;
                }
                zzgwqVar.m7203c(new zzbm(zzbgVarM9066a2, z4, iArr9, zArr));
                i21++;
                zzzoVarArr = zzzoVarArr2;
                length = length;
                listArr = listArr3;
            }
            i20++;
        }
        int i35 = 0;
        while (true) {
            zzzo zzzoVar4 = zzabeVar.f4841d;
            if (i35 >= zzzoVar4.f21491a) {
                return new zzabj((zznf[]) pairMo3916g.first, (zzabb[]) pairMo3916g.second, new zzbn(zzgwqVar.m7214f()), zzabeVar);
            }
            zzbg zzbgVarM9066a3 = zzzoVar4.m9066a(i35);
            int i36 = zzbgVarM9066a3.f7807a;
            int[] iArr10 = new int[i36];
            Arrays.fill(iArr10, 0);
            zzgwqVar.m7203c(new zzbm(zzbgVarM9066a3, false, iArr10, new boolean[i36]));
            i35++;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Pair mo3916g(zzabe zzabeVar, int[][][] iArr, int[] iArr2);
}
