package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzaap extends zzaar implements Comparable {

    /* JADX INFO: renamed from: A */
    public final int f4788A;

    /* JADX INFO: renamed from: B */
    public final int f4789B;

    /* JADX INFO: renamed from: C */
    public final int f4790C;

    /* JADX INFO: renamed from: D */
    public final int f4791D;

    /* JADX INFO: renamed from: E */
    public final int f4792E;

    /* JADX INFO: renamed from: F */
    public final boolean f4793F;

    /* JADX INFO: renamed from: w */
    public final int f4794w;

    /* JADX INFO: renamed from: x */
    public final boolean f4795x;

    /* JADX INFO: renamed from: y */
    public final boolean f4796y;

    /* JADX INFO: renamed from: z */
    public final boolean f4797z;

    public zzaap(int i2, zzbg zzbgVar, int i3, zzaan zzaanVar, int i4, String str, String str2) {
        int iM3906k;
        super(i2, zzbgVar, i3);
        int i5 = 0;
        this.f4795x = zzne.m8768m(i4, false);
        int i6 = this.f4801v.f21051e;
        zzaanVar.getClass();
        zzgwt zzgwtVar = zzaanVar.f9096r;
        this.f4796y = 1 == (i6 & 1);
        this.f4797z = (i6 & 2) != 0;
        zzgwt zzgwtVarM7216n = str2 != null ? zzgwt.m7216n(str2) : zzgwtVar.isEmpty() ? zzgwt.m7216n("") : zzgwtVar;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgwtVarM7216n.size()) {
                iM3906k = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iM3906k = zzaaz.m3906k(this.f4801v, (String) zzgwtVarM7216n.get(i7), false);
                if (iM3906k > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f4788A = i7;
        this.f4789B = iM3906k;
        int i8 = str2 != null ? 1088 : 0;
        int i9 = this.f4801v.f21052f;
        zzgyn zzgynVar = zzaaz.f4826k;
        int iBitCount = (i9 == 0 || i9 != i8) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
        this.f4790C = iBitCount;
        zzv zzvVar = this.f4801v;
        this.f4793F = (1088 & zzvVar.f21052f) != 0;
        int iM3907l = zzaaz.m3907l(zzvVar, zzaanVar.f9097s);
        this.f4791D = iM3907l;
        int iM3906k2 = zzaaz.m3906k(this.f4801v, str, zzaaz.m3905j(str) == null);
        this.f4792E = iM3906k2;
        boolean z = iM3906k > 0 || (zzgwtVar.isEmpty() && iBitCount > 0) || ((zzgwtVar.isEmpty() && iM3907l != Integer.MAX_VALUE) || this.f4796y || (this.f4797z && iM3906k2 > 0));
        if (zzne.m8768m(i4, zzaanVar.f4780B) && z) {
            i5 = 1;
        }
        this.f4794w = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: b */
    public final int mo3898b() {
        return this.f4794w;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo3899c(zzaar zzaarVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaap zzaapVar) {
        zzgwg zzgwgVarMo7197d = zzgwg.f18291a.mo7197d(this.f4795x, zzaapVar.f4795x);
        Integer numValueOf = Integer.valueOf(this.f4788A);
        Integer numValueOf2 = Integer.valueOf(zzaapVar.f4788A);
        Comparator comparator = zzgyl.f18354s;
        comparator.getClass();
        zzgyv zzgyvVar = zzgyv.f18378s;
        zzgwg zzgwgVarMo7194a = zzgwgVarMo7197d.mo7194a(numValueOf, numValueOf2, zzgyvVar);
        int i2 = zzaapVar.f4789B;
        int i3 = this.f4789B;
        zzgwg zzgwgVarMo7195b = zzgwgVarMo7194a.mo7195b(i3, i2);
        int i4 = zzaapVar.f4790C;
        int i5 = this.f4790C;
        zzgwg zzgwgVarMo7197d2 = zzgwgVarMo7195b.mo7195b(i5, i4).mo7194a(Integer.valueOf(this.f4791D), Integer.valueOf(zzaapVar.f4791D), zzgyvVar).mo7197d(this.f4796y, zzaapVar.f4796y);
        Boolean boolValueOf = Boolean.valueOf(this.f4797z);
        Boolean boolValueOf2 = Boolean.valueOf(zzaapVar.f4797z);
        if (i3 != 0) {
            comparator = zzgyvVar;
        }
        zzgwg zzgwgVarMo7195b2 = zzgwgVarMo7197d2.mo7194a(boolValueOf, boolValueOf2, comparator).mo7195b(this.f4792E, zzaapVar.f4792E);
        if (i5 == 0) {
            zzgwgVarMo7195b2 = zzgwgVarMo7195b2.mo7196c(this.f4793F, zzaapVar.f4793F);
        }
        return zzgwgVarMo7195b2.mo7198e();
    }
}
