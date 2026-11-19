package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4536hO extends AbstractRunnableC3858WP {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C4534hM A00;

    public C4536hO(C4534hM c4534hM) {
        this.A00 = c4534hM;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3858WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            C3567Rd c3567Rd = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            c3567Rd.A06().onAdClicked(this.A00.A01.A07());
        }
    }
}
