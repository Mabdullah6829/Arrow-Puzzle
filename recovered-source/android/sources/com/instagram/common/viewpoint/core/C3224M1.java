package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3224M1 extends AbstractC3518Qq<C2842Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC3998Yh A03;
    public C4439fp A04;
    public String A05;
    public List<C4332e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC4669jd A08;
    public final C3648Sx A09;
    public final C4494gi A0A;
    public final InterfaceC3784VA A0B;
    public final C3732UK A0C;
    public final C3957Y2 A0D;
    public final C22866X A0E;
    public final C2702DZ A0F;

    public C3224M1(C4494gi c4494gi, List<C4332e5> list, AbstractC4669jd abstractC4669jd, InterfaceC3784VA interfaceC3784VA, C3732UK c3732uk, InterfaceC3998Yh interfaceC3998Yh, String str, C22866X c22866x, C2702DZ c2702dz) {
        this.A0A = c4494gi;
        this.A0B = interfaceC3784VA;
        this.A0C = c3732uk;
        this.A09 = c3732uk.A14();
        this.A04 = c3732uk.A1G();
        this.A0D = c3732uk.A1E();
        this.A03 = interfaceC3998Yh;
        this.A08 = abstractC4669jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c22866x;
        this.A0F = c2702dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C2842Fq A0F(ViewGroup viewGroup, int i2) {
        return new C2842Fq(AbstractC4173bW.A00(new C4209c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C2842Fq c2842Fq, int i2) {
        C4332e5 c4332e5 = this.A06.get(i2);
        c2842Fq.A0q(this.A04);
        c2842Fq.A0p(c4332e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3518Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i2, int i3, int i4) {
        boolean needsUpdate = i2 != this.A00;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C4439fp c4439fp) {
        this.A04 = c4439fp;
    }
}
