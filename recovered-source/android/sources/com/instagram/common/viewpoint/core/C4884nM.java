package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4884nM extends AbstractC2772Eh<C4884nM> implements Comparable<C4884nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C24669i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C4884nM(int i2, C5027pg c5027pg, int i3, C24669i c24669i, int i4, boolean z, InterfaceC4735kj<C5064qI> interfaceC4735kj) {
        super(i2, c5027pg, i3);
        this.A0A = c24669i;
        this.A0B = C24659h.A0K(super.A02.A0V);
        this.A0F = C24659h.A0S(i4, false);
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < c24669i.A0I.size(); i7++) {
            int iA02 = C24659h.A02(super.A02, c24669i.A0I.get(i7), false);
            if (iA02 > 0) {
                i6 = i7;
                i5 = iA02;
                break;
            }
        }
        this.A04 = i6;
        this.A05 = i5;
        this.A07 = C24659h.A00(super.A02.A0E, ((C5023pc) c24669i).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C5023pc) c24669i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C5023pc) c24669i).A02) && interfaceC4735kj.A4C(super.A02);
        String[] strArrA1L = AbstractC22035C.A1L();
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        for (int i10 = 0; i10 < strArrA1L.length; i10++) {
            int iA03 = C24659h.A02(super.A02, strArrA1L[i10], false);
            if (iA03 > 0) {
                i8 = i10;
                i9 = iA03;
                break;
            }
        }
        this.A02 = i8;
        this.A03 = i9;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < c24669i.A0J.size(); i12++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c24669i.A0J.get(i12))) {
                i11 = i12;
                break;
            }
        }
        this.A06 = i11;
        this.A0H = AbstractC23597i.A02(i4) == 128;
        this.A0G = AbstractC23597i.A04(i4) == 64;
        this.A09 = A00(i4, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C4884nM> list, List<C4884nM> list2) {
        return ((C4884nM) Collections.max(list)).compareTo((C4884nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC2570BP<C4884nM> A03(int i2, C5027pg c5027pg, C24669i c24669i, int[] iArr, boolean z, InterfaceC4735kj<C5064qI> interfaceC4735kj) {
        C20302K c20302kA01 = AbstractC2570BP.A01();
        for (int i3 = 0; i3 < c5027pg.A01; i3++) {
            c20302kA01.A04(new C4884nM(i2, c5027pg, i3, c24669i, iArr[i3], z, interfaceC4735kj));
        }
        return c20302kA01.A05();
    }

    private int A00(int i2, boolean z) {
        if (!C24659h.A0S(i2, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C24659h.A0S(i2, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4884nM c4884nM) {
        AbstractC5066qK abstractC5066qKA06;
        AbstractC5066qK abstractC5066qKA07 = (this.A0E && this.A0F) ? C24659h.A09 : C24659h.A09.A06();
        AbstractC4916ns abstractC4916nsA08 = AbstractC4916ns.A01().A09(this.A0F, c4884nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c4884nM.A04), AbstractC5066qK.A03().A06()).A06(this.A05, c4884nM.A05).A06(this.A07, c4884nM.A07).A09(this.A0D, c4884nM.A0D).A09(this.A0C, c4884nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c4884nM.A02), AbstractC5066qK.A03().A06()).A06(this.A03, c4884nM.A03).A09(this.A0E, c4884nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c4884nM.A06), AbstractC5066qK.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(c4884nM.A00);
        if (this.A0A.A0O) {
            abstractC5066qKA06 = C24659h.A09.A06();
        } else {
            abstractC5066qKA06 = C24659h.A0A;
        }
        AbstractC4916ns abstractC4916nsA09 = abstractC4916nsA08.A08(numValueOf, numValueOf2, abstractC5066qKA06).A09(this.A0H, c4884nM.A0H).A09(this.A0G, c4884nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c4884nM.A01), abstractC5066qKA07).A08(Integer.valueOf(this.A08), Integer.valueOf(c4884nM.A08), abstractC5066qKA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(c4884nM.A00);
        if (!AbstractC22035C.A1E(this.A0B, c4884nM.A0B)) {
            abstractC5066qKA07 = C24659h.A0A;
        }
        return abstractC4916nsA09.A08(numValueOf3, numValueOf4, abstractC5066qKA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // com.instagram.common.viewpoint.core.AbstractC2772Eh
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C4884nM c4884nM) {
        if (this.A0A.A00) {
            if ((!this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC2772Eh) c4884nM).A02.A0W))) && ((this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC2772Eh) c4884nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c4884nM.A0H && this.A0G == c4884nM.A0G)))) {
            }
        } else if (super.A02.A06 != -1) {
            int i2 = super.A02.A06;
            String[] strArr = A0I;
            if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
            strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            if (i2 == ((AbstractC2772Eh) c4884nM).A02.A06) {
                return !this.A0A.A02 ? true : true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2772Eh
    public final int A08() {
        return this.A09;
    }
}
