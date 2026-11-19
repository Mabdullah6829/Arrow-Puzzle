package com.instagram.common.viewpoint.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4878nG extends AbstractC2772Eh<C4878nG> implements Comparable<C4878nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C4878nG> list, List<C4878nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C4878nG(int i2, C5027pg c5027pg, int i3, C24669i c24669i, int i4, String str) {
        List<String> listA03;
        super(i2, c5027pg, i3);
        int i5 = 0;
        this.A08 = C24659h.A0S(i4, false);
        int i6 = super.A02.A0H & (~((C5023pc) c24669i).A00);
        this.A06 = (i6 & 1) != 0;
        this.A07 = (i6 & 2) != 0;
        int i7 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c24669i.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = c24669i.A0K;
        }
        for (int bestLanguageIndex = 0; bestLanguageIndex < listA03.size(); bestLanguageIndex++) {
            int iA02 = C24659h.A02(super.A02, listA03.get(bestLanguageIndex), c24669i.A0P);
            if (iA02 > 0) {
                i7 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
        }
        this.A00 = i7;
        this.A01 = bestLanguageScore;
        this.A02 = C24659h.A00(super.A02.A0E, ((C5023pc) c24669i).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C24659h.A02(super.A02, str, C24659h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c24669i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C24659h.A0S(i4, c24669i.A0B) && z) {
            i5 = 1;
        }
        this.A04 = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4878nG c4878nG) {
        AbstractC4916ns abstractC4916nsA06 = AbstractC4916ns.A01().A09(this.A08, c4878nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c4878nG.A00), AbstractC5066qK.A03().A06()).A06(this.A01, c4878nG.A01).A06(this.A02, c4878nG.A02).A09(this.A06, c4878nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c4878nG.A07), this.A01 == 0 ? AbstractC5066qK.A03() : AbstractC5066qK.A03().A06()).A06(this.A03, c4878nG.A03);
        if (this.A02 == 0) {
            abstractC4916nsA06 = abstractC4916nsA06.A0A(this.A05, c4878nG.A05);
        }
        return abstractC4916nsA06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC2570BP<C4878nG> A02(int i2, C5027pg c5027pg, C24669i c24669i, int[] iArr, String str) {
        C20302K c20302kA01 = AbstractC2570BP.A01();
        for (int i3 = 0; i3 < c5027pg.A01; i3++) {
            c20302kA01.A04(new C4878nG(i2, c5027pg, i3, c24669i, iArr[i3], str));
        }
        return c20302kA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC2772Eh
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C4878nG c4878nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2772Eh
    public final int A08() {
        return this.A04;
    }
}
