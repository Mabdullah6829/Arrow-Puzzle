package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaay extends zzaar {

    /* JADX INFO: renamed from: A */
    public final boolean f4808A;

    /* JADX INFO: renamed from: B */
    public final int f4809B;

    /* JADX INFO: renamed from: C */
    public final int f4810C;

    /* JADX INFO: renamed from: D */
    public final int f4811D;

    /* JADX INFO: renamed from: E */
    public final int f4812E;

    /* JADX INFO: renamed from: F */
    public final int f4813F;

    /* JADX INFO: renamed from: G */
    public final int f4814G;

    /* JADX INFO: renamed from: H */
    public final int f4815H;

    /* JADX INFO: renamed from: I */
    public final boolean f4816I;

    /* JADX INFO: renamed from: J */
    public final int f4817J;

    /* JADX INFO: renamed from: K */
    public final int f4818K;

    /* JADX INFO: renamed from: L */
    public final boolean f4819L;

    /* JADX INFO: renamed from: M */
    public final boolean f4820M;

    /* JADX INFO: renamed from: N */
    public final int f4821N;

    /* JADX INFO: renamed from: w */
    public final boolean f4822w;

    /* JADX INFO: renamed from: x */
    public final zzaan f4823x;

    /* JADX INFO: renamed from: y */
    public final boolean f4824y;

    /* JADX INFO: renamed from: z */
    public final boolean f4825z;

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    public zzaay(int i2, zzbg zzbgVar, int i3, zzaan zzaanVar, int i4, String str, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM3906k;
        int i6;
        byte b;
        boolean z4;
        int i7;
        zzv zzvVar;
        int i8;
        int i9;
        int i10;
        zzv zzvVar2;
        int i11;
        int i12;
        int i13;
        super(i2, zzbgVar, i3);
        this.f4823x = zzaanVar;
        boolean z5 = zzaanVar.f4785x;
        zzgwt zzgwtVar = zzaanVar.f9087i;
        zzgwt zzgwtVar2 = zzaanVar.f9089k;
        int i14 = 1;
        int i15 = true != z5 ? 16 : 24;
        if (!z || (((i11 = (zzvVar2 = this.f4801v).f21068v) != -1 && i11 > zzaanVar.f9079a) || ((i12 = zzvVar2.f21069w) != -1 && i12 > zzaanVar.f9080b))) {
            z2 = false;
        } else {
            float f2 = zzvVar2.f21072z;
            if ((f2 == -1.0f || f2 <= zzaanVar.f9081c) && ((i13 = zzvVar2.f21056j) == -1 || i13 <= zzaanVar.f9082d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f4822w = z2;
        if (!z || (((i8 = (zzvVar = this.f4801v).f21068v) != -1 && i8 < 0) || ((i9 = zzvVar.f21069w) != -1 && i9 < 0))) {
            z3 = false;
        } else {
            float f3 = zzvVar.f21072z;
            if ((f3 == -1.0f || f3 >= 0.0f) && ((i10 = zzvVar.f21056j) == -1 || i10 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f4824y = z3;
        this.f4825z = zzne.m8768m(i4, false);
        zzv zzvVar3 = this.f4801v;
        float f4 = zzvVar3.f21072z;
        this.f4808A = f4 != -1.0f && f4 >= 10.0f;
        this.f4809B = zzvVar3.f21056j;
        int i16 = zzvVar3.f21068v;
        this.f4810C = (i16 == -1 || (i7 = zzvVar3.f21069w) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= zzgwtVar2.size()) {
                iM3906k = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iM3906k = zzaaz.m3906k(this.f4801v, (String) zzgwtVar2.get(i17), false);
                if (iM3906k > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f4812E = i17;
        this.f4813F = iM3906k;
        int i18 = this.f4801v.f21052f;
        zzgyn zzgynVar = zzaaz.f4826k;
        this.f4814G = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i19 = this.f4801v.f21052f;
        this.f4816I = i19 == 0 || (i19 & 1) != 0;
        this.f4817J = zzaaz.m3906k(this.f4801v, str, zzaaz.m3905j(str) == null);
        for (int i20 = 0; i20 < zzgwtVar.size(); i20++) {
            String str2 = this.f4801v.f21061o;
            if (str2 != null && str2.equals(zzgwtVar.get(i20))) {
                i5 = i20;
                break;
            }
        }
        this.f4811D = i5;
        this.f4815H = zzaaz.m3907l(this.f4801v, zzaanVar.f9088j);
        this.f4819L = (i4 & 384) == 128;
        this.f4820M = (i4 & 64) == 64;
        zzv zzvVar4 = this.f4801v;
        String str3 = zzvVar4.f21061o;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b = 0;
                    break;
                case "video/av01":
                    b = 1;
                    break;
                case "video/hevc":
                    b = 2;
                    break;
                case "video/avc":
                    b = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i6 = 5;
            } else if (b != 1) {
                if (b == 2) {
                    i6 = 3;
                } else if (b == 3) {
                    i6 = 2;
                } else if (b != 4) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
            }
        }
        this.f4821N = i6;
        if ((zzvVar4.f21052f & 16384) != 0) {
            i14 = 0;
        } else {
            zzaan zzaanVar2 = this.f4823x;
            if (!zzne.m8768m(i4, zzaanVar2.f4780B) || (!(z4 = this.f4822w) && !zzaanVar2.f4784w)) {
                i14 = 0;
            } else if (zzne.m8768m(i4, false) && this.f4824y && z4 && zzvVar4.f21056j != -1 && (i15 & i4) != 0) {
                i14 = 2;
            }
        }
        this.f4818K = i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m3901e(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgwg zzgwgVarMo7197d = zzgwg.f18291a.mo7197d(zzaayVar.f4825z, zzaayVar2.f4825z);
        Integer numValueOf = Integer.valueOf(zzaayVar.f4812E);
        Integer numValueOf2 = Integer.valueOf(zzaayVar2.f4812E);
        zzgyl.f18354s.getClass();
        zzgyv zzgyvVar = zzgyv.f18378s;
        zzgwg zzgwgVarMo7194a = zzgwgVarMo7197d.mo7194a(numValueOf, numValueOf2, zzgyvVar).mo7195b(zzaayVar.f4813F, zzaayVar2.f4813F).mo7195b(zzaayVar.f4814G, zzaayVar2.f4814G).mo7194a(Integer.valueOf(zzaayVar.f4815H), Integer.valueOf(zzaayVar2.f4815H), zzgyvVar).mo7197d(zzaayVar.f4816I, zzaayVar2.f4816I).mo7195b(zzaayVar.f4817J, zzaayVar2.f4817J).mo7197d(zzaayVar.f4808A, zzaayVar2.f4808A).mo7197d(zzaayVar.f4822w, zzaayVar2.f4822w).mo7197d(zzaayVar.f4824y, zzaayVar2.f4824y).mo7194a(Integer.valueOf(zzaayVar.f4811D), Integer.valueOf(zzaayVar2.f4811D), zzgyvVar);
        boolean z = zzaayVar.f4819L;
        zzgwg zzgwgVarMo7197d2 = zzgwgVarMo7194a.mo7197d(z, zzaayVar2.f4819L);
        boolean z2 = zzaayVar.f4820M;
        zzgwg zzgwgVarMo7197d3 = zzgwgVarMo7197d2.mo7197d(z2, zzaayVar2.f4820M);
        if (z && z2) {
            zzgwgVarMo7197d3 = zzgwgVarMo7197d3.mo7195b(zzaayVar.f4821N, zzaayVar2.f4821N);
        }
        return zzgwgVarMo7197d3.mo7198e();
    }

    /* JADX INFO: renamed from: f */
    public static int m3902f(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgyn zzgywVar;
        if (zzaayVar.f4822w && zzaayVar.f4825z) {
            zzgywVar = zzaaz.f4826k;
        } else {
            zzgyn zzgynVar = zzaaz.f4826k;
            zzgynVar.getClass();
            zzgywVar = new zzgyw(zzgynVar);
        }
        zzgwg zzgwgVar = zzgwg.f18291a;
        zzaayVar.f4823x.getClass();
        return zzgwgVar.mo7194a(Integer.valueOf(zzaayVar.f4810C), Integer.valueOf(zzaayVar2.f4810C), zzgywVar).mo7194a(Integer.valueOf(zzaayVar.f4809B), Integer.valueOf(zzaayVar2.f4809B), zzgywVar).mo7198e();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: b */
    public final int mo3898b() {
        return this.f4818K;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo3899c(zzaar zzaarVar) {
        zzaay zzaayVar = (zzaay) zzaarVar;
        if (!Objects.equals(this.f4801v.f21061o, zzaayVar.f4801v.f21061o)) {
            return false;
        }
        this.f4823x.getClass();
        return this.f4819L == zzaayVar.f4819L && this.f4820M == zzaayVar.f4820M;
    }
}
