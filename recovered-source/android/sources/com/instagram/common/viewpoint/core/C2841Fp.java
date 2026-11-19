package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2841Fp extends AbstractC3518Qq<C2825FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC3992Yb A04;
    public InterfaceC3998Yh A05;
    public String A06;
    public List<C4332e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC4669jd A0A;
    public final C3648Sx A0B;
    public final C4494gi A0C;
    public final InterfaceC3784VA A0D;
    public final C3957Y2 A0E;
    public final C2850Fy A0F;
    public final C4439fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2841Fp(C4494gi c4494gi, List<C4332e5> list, AbstractC4669jd abstractC4669jd, InterfaceC3784VA interfaceC3784VA, C3648Sx c3648Sx, C4439fp c4439fp, C3957Y2 c3957y2, InterfaceC3998Yh interfaceC3998Yh, String str, int i2, int i3, int i4, int i5, C2850Fy c2850Fy, AbstractC3992Yb abstractC3992Yb) {
        this.A0C = c4494gi;
        this.A0D = interfaceC3784VA;
        this.A0B = c3648Sx;
        this.A0G = c4439fp;
        this.A0E = c3957y2;
        this.A05 = interfaceC3998Yh;
        this.A0A = abstractC4669jd;
        this.A07 = list;
        this.A00 = i2;
        this.A03 = i5;
        this.A06 = str;
        this.A01 = i4;
        this.A02 = i3;
        this.A0F = c2850Fy;
        this.A04 = abstractC3992Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2825FY A0F(ViewGroup viewGroup, int i2) {
        return new C2825FY(AbstractC4263cy.A00(new C4209c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2825FY c2825fy, int i2) {
        c2825fy.A0q(this.A07.get(i2), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i2 == 0) {
            c2825fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final int A0B() {
        return this.A07.size();
    }
}
