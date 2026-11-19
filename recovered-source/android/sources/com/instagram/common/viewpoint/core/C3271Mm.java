package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3271Mm implements InterfaceC3574Rk {
    public static String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ C3255MW A00;

    public C3271Mm(C3255MW c3255mw) {
        this.A00 = c3255mw;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3574Rk
    public final boolean AAI() {
        if (this.A00.A0E) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                AbstractC3992Yb abstractC3992Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC3992Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                this.A00.A0L.A04(EnumC3791VH.A07, null);
                this.A00.A0O.A4j(this.A00.A0P.A7w());
            } else if (this.A00.A09 != null && this.A00.A09.A0h()) {
                this.A00.A0L.A04(EnumC3791VH.A07, null);
                this.A00.A0O.A4j(this.A00.A0P.A7w());
            }
            return true;
        }
        return false;
    }
}
