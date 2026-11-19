package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzzy extends zzaar implements Comparable {

    /* JADX INFO: renamed from: A */
    public final boolean f21504A;

    /* JADX INFO: renamed from: B */
    public final int f21505B;

    /* JADX INFO: renamed from: C */
    public final int f21506C;

    /* JADX INFO: renamed from: D */
    public final int f21507D;

    /* JADX INFO: renamed from: E */
    public final int f21508E;

    /* JADX INFO: renamed from: F */
    public final boolean f21509F;

    /* JADX INFO: renamed from: G */
    public final int f21510G;

    /* JADX INFO: renamed from: H */
    public final int f21511H;

    /* JADX INFO: renamed from: I */
    public final boolean f21512I;

    /* JADX INFO: renamed from: J */
    public final int f21513J;

    /* JADX INFO: renamed from: K */
    public final int f21514K;

    /* JADX INFO: renamed from: L */
    public final int f21515L;

    /* JADX INFO: renamed from: M */
    public final int f21516M;

    /* JADX INFO: renamed from: N */
    public final boolean f21517N;

    /* JADX INFO: renamed from: O */
    public final boolean f21518O;

    /* JADX INFO: renamed from: P */
    public final boolean f21519P;

    /* JADX INFO: renamed from: w */
    public final int f21520w;

    /* JADX INFO: renamed from: x */
    public final boolean f21521x;

    /* JADX INFO: renamed from: y */
    public final String f21522y;

    /* JADX INFO: renamed from: z */
    public final zzaan f21523z;

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    public zzzy(int i2, zzbg zzbgVar, int i3, zzaan zzaanVar, int i4, boolean z, zzgts zzgtsVar) {
        int i5;
        int iM3906k;
        byte b;
        boolean z2;
        int iM3906k2;
        boolean z3;
        super(i2, zzbgVar, i3);
        this.f21523z = zzaanVar;
        boolean z4 = zzaanVar.f4787z;
        zzgwt zzgwtVar = zzaanVar.f9094p;
        zzgwt zzgwtVar2 = zzaanVar.f9090l;
        int i6 = 1;
        int i7 = true != z4 ? 16 : 24;
        this.f21522y = zzaaz.m3905j(this.f4801v.f21050d);
        this.f21504A = zzne.m8768m(i4, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzgwtVar2.size()) {
                iM3906k = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM3906k = zzaaz.m3906k(this.f4801v, (String) zzgwtVar2.get(i8), false);
                if (iM3906k > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f21506C = i8;
        this.f21505B = iM3906k;
        int i9 = this.f4801v.f21052f;
        this.f21507D = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f21508E = zzaaz.m3907l(this.f4801v, zzaanVar.f9091m);
        zzv zzvVar = this.f4801v;
        int i10 = zzvVar.f21052f;
        this.f21509F = i10 == 0 || (i10 & 1) != 0;
        this.f21512I = 1 == (zzvVar.f21051e & 1);
        String str = zzvVar.f21061o;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0 || b == 1 || b == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f21519P = z2;
        int i11 = zzvVar.f21037G;
        this.f21513J = i11;
        this.f21514K = zzvVar.f21039I;
        int i12 = zzvVar.f21056j;
        this.f21515L = i12;
        this.f21521x = (i12 == -1 || i12 <= zzaanVar.f9093o) && (i11 == -1 || i11 <= zzaanVar.f9092n) && ((zzaah) zzgtsVar).mo3897b(zzvVar);
        String str2 = zzfm.f16091a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = zzfm.m6515q(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= strArrSplit.length) {
                iM3906k2 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iM3906k2 = zzaaz.m3906k(this.f4801v, strArrSplit[i14], false);
                if (iM3906k2 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f21510G = i14;
        this.f21511H = iM3906k2;
        for (int i15 = 0; i15 < zzgwtVar.size(); i15++) {
            String str3 = this.f4801v.f21061o;
            if (str3 != null && str3.equals(zzgwtVar.get(i15))) {
                i5 = i15;
                break;
            }
        }
        this.f21516M = i5;
        this.f21517N = (i4 & 384) == 128;
        this.f21518O = (i4 & 64) == 64;
        zzaan zzaanVar2 = this.f21523z;
        if (zzne.m8768m(i4, zzaanVar2.f4780B) && ((z3 = this.f21521x) || zzaanVar2.f4786y)) {
            zzaanVar2.f9095q.getClass();
            if (zzne.m8768m(i4, false) && z3 && this.f4801v.f21056j != -1 && ((zzaanVar2.f4781C || !z) && (i7 & i4) != 0)) {
                i6 = 2;
            }
        } else {
            i6 = 0;
        }
        this.f21520w = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: b */
    public final int mo3898b() {
        return this.f21520w;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo3899c(zzaar zzaarVar) {
        String str;
        int i2;
        zzzy zzzyVar = (zzzy) zzaarVar;
        this.f21523z.getClass();
        zzv zzvVar = this.f4801v;
        int i3 = zzvVar.f21037G;
        if (i3 == -1) {
            return false;
        }
        zzv zzvVar2 = zzzyVar.f4801v;
        return i3 == zzvVar2.f21037G && (str = zzvVar.f21061o) != null && TextUtils.equals(str, zzvVar2.f21061o) && (i2 = zzvVar.f21039I) != -1 && i2 == zzvVar2.f21039I && this.f21517N == zzzyVar.f21517N && this.f21518O == zzzyVar.f21518O;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzy zzzyVar) {
        zzgyn zzgywVar;
        boolean z = this.f21504A;
        boolean z2 = this.f21521x;
        if (z2 && z) {
            zzgywVar = zzaaz.f4826k;
        } else {
            zzgyn zzgynVar = zzaaz.f4826k;
            zzgynVar.getClass();
            zzgywVar = new zzgyw(zzgynVar);
        }
        zzgwg zzgwgVarMo7197d = zzgwg.f18291a.mo7197d(z, zzzyVar.f21504A);
        Integer numValueOf = Integer.valueOf(this.f21506C);
        Integer numValueOf2 = Integer.valueOf(zzzyVar.f21506C);
        zzgyl.f18354s.getClass();
        zzgyv zzgyvVar = zzgyv.f18378s;
        zzgwg zzgwgVarMo7194a = zzgwgVarMo7197d.mo7194a(numValueOf, numValueOf2, zzgyvVar).mo7195b(this.f21505B, zzzyVar.f21505B).mo7195b(this.f21507D, zzzyVar.f21507D).mo7194a(Integer.valueOf(this.f21508E), Integer.valueOf(zzzyVar.f21508E), zzgyvVar).mo7197d(this.f21512I, zzzyVar.f21512I).mo7197d(this.f21509F, zzzyVar.f21509F).mo7194a(Integer.valueOf(this.f21510G), Integer.valueOf(zzzyVar.f21510G), zzgyvVar).mo7195b(this.f21511H, zzzyVar.f21511H).mo7197d(z2, zzzyVar.f21521x).mo7194a(Integer.valueOf(this.f21516M), Integer.valueOf(zzzyVar.f21516M), zzgyvVar);
        this.f21523z.getClass();
        zzgwg zzgwgVarMo7194a2 = zzgwgVarMo7194a.mo7197d(this.f21517N, zzzyVar.f21517N).mo7197d(this.f21518O, zzzyVar.f21518O).mo7197d(this.f21519P, zzzyVar.f21519P).mo7194a(Integer.valueOf(this.f21513J), Integer.valueOf(zzzyVar.f21513J), zzgywVar).mo7194a(Integer.valueOf(this.f21514K), Integer.valueOf(zzzyVar.f21514K), zzgywVar);
        if (Objects.equals(this.f21522y, zzzyVar.f21522y)) {
            zzgwgVarMo7194a2 = zzgwgVarMo7194a2.mo7194a(Integer.valueOf(this.f21515L), Integer.valueOf(zzzyVar.f21515L), zzgywVar);
        }
        return zzgwgVarMo7194a2.mo7198e();
    }
}
