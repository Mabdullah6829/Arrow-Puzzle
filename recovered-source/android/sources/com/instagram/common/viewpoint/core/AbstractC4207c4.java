package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4207c4 {
    public static String[] A00 = {"e7juOHCMVCS96MucXvvyM5upzpE0CxcL", "6Axk6XM18YFtFlcC0tEdKqjogVlmemrm", "CHYE97fUe", "94l1C", "pvrd7E3JtMrEOvPAC3lcGaqqDdvc2Rnk", "mswd2ljSuB4EOxjza27Iz7krcpdQKmDN", "x2gmwPWroRNX0socjzMaFBH0Y3mBhUE3", "1dJrelJWCcDuEHtNsp3IaM8Oqex3ZZ7a"};

    public static AbstractC4206c3 A00(C4210c7 c4210c7, Bundle bundle, boolean z) {
        AbstractC4206c3 c3129ku;
        c4210c7.A06().A0H().A00(false);
        C3311NR c3311nrA29 = c4210c7.A05().A29();
        double dA00 = AbstractC4197bu.A00(c3311nrA29);
        boolean isWatchAndBrowse = c4210c7.A05().A29().A0T();
        boolean zA06 = AbstractC4197bu.A06(c4210c7.A00(), c4210c7.A01(), dA00);
        AbstractC3278Mt abstractC3278MtA00 = C3279Mu.A00(c4210c7.A06(), c4210c7.A07(), "", AbstractC3904XB.A00(c4210c7.A05().A29().A0J().A05()), new HashMap(), c4210c7.A05().A2A());
        boolean z2 = !TextUtils.isEmpty(c3311nrA29.A0H().A09());
        if (C3763Up.A1z(c4210c7.A06())) {
            C4494gi c4494giA06 = c4210c7.A06();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "oHCvC4ERmXYMU8sW9KKIPv7pnY2wXb01";
            strArr2[7] = "G3HUaMks2xBdg2z9mSbIts1gYwx1OgmU";
            c4494giA06.A0B().AKn(c4210c7.A02(), c4210c7.A05().A2E(), z2);
        }
        if (isWatchAndBrowse && (abstractC3278MtA00 instanceof C238184)) {
            c3129ku = A01(c4210c7) ? new C3081Ji(c4210c7) : new C3113KE(c4210c7);
        } else if (z2) {
            c3129ku = new C22706H(c4210c7);
        } else {
            if (c4210c7.A05().A1c()) {
                return new C3137Kc(c4210c7);
            }
            if (c4210c7.A05().A1j()) {
                c3129ku = new C22736K(c4210c7);
            } else if (C3763Up.A2i(c4210c7.A06())) {
                c3129ku = new C22726J(c4210c7, zA06);
            } else if (zA06) {
                c3129ku = new C3134KZ(c4210c7, c4210c7.A00() == 2);
            } else {
                c3129ku = new C3129KU(c4210c7, AbstractC4197bu.A04(dA00));
            }
        }
        if (z) {
            c3129ku.A1H(c3311nrA29, c4210c7.A05().A2E(), dA00, bundle);
        }
        return c3129ku;
    }

    public static boolean A01(C4210c7 c4210c7) {
        if (!c4210c7.A05().A1y()) {
            boolean zA1c = c4210c7.A05().A1c();
            String[] strArr = A00;
            if (strArr[4].charAt(27) == strArr[6].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[5] = "BfXu055milBajq8QiXDIPY7ZZDWb7rZy";
            strArr2[7] = "zfsTxDhfKJjHYbZVz1DIv6IoDbSXcVhK";
            if (!zA1c) {
                return false;
            }
        }
        return true;
    }
}
