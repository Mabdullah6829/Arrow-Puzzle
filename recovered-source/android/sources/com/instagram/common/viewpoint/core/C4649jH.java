package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4649jH implements InterfaceC3339Nt {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC4669jd A01;
    public final /* synthetic */ C4661jT A02;
    public final /* synthetic */ InterfaceC3339Nt A03;
    public final /* synthetic */ C3340Nu A04;
    public final /* synthetic */ C4494gi A05;
    public final /* synthetic */ EnumSet A06;

    public C4649jH(C3340Nu c3340Nu, C4494gi c4494gi, AbstractC4669jd abstractC4669jd, C4661jT c4661jT, int i2, InterfaceC3339Nt interfaceC3339Nt, EnumSet enumSet) {
        this.A04 = c3340Nu;
        this.A05 = c4494gi;
        this.A01 = abstractC4669jd;
        this.A02 = c4661jT;
        this.A00 = i2;
        this.A03 = interfaceC3339Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3339Nt
    public final void ACo(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3339Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            InterfaceC3339Nt interfaceC3339Nt = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC3339Nt.ACp();
        }
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3339Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3339Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}
