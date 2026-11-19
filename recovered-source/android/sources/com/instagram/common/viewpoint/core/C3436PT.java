package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3436PT implements InterfaceC3991Ya {
    public static String[] A02 = {"YUGwJzzikBNzfLIllCMdkir2Jyj8DuFq", "ntVfVONdyCctXWp", "AonpNDk7AlTTh7WnvPqW51ITIbVwFUJp", "NJZ9S98WzFijxyBcJxql7T6JOIFmEfw7", "8QFO", "nOxceDp", "zcnAPzBVA2CXXQsDQKs94da1Vf1b77Qu", "s6TvhQwfXdUE9Ss2QaqLkXkKVbAwWXrL"};
    public final /* synthetic */ C3568Re A00;
    public final /* synthetic */ AbstractC3426PJ A01;

    public C3436PT(AbstractC3426PJ abstractC3426PJ, C3568Re c3568Re) {
        this.A01 = abstractC3426PJ;
        this.A00 = c3568Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3991Ya
    public final void ACl(AbstractC3992Yb abstractC3992Yb) {
        if (abstractC3992Yb.getToolbarActionMode() == 8) {
            this.A01.A0d();
            return;
        }
        this.A01.A0G.A04(EnumC3791VH.A07, null);
        if (this.A01.A0l()) {
            return;
        }
        AbstractC3426PJ abstractC3426PJ = this.A01;
        if (A02[3].charAt(29) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "pLKL5MIsKfCUMWoMxvxDNCAoAO8BGlnS";
        strArr[7] = "7PsgTAKpTeXTqL7VuWAjeXRdKL6HZN4L";
        if (abstractC3426PJ.A0i()) {
            this.A01.A0h(this.A00);
        } else {
            this.A01.A0E.A0F().AB0();
            this.A00.finish(1);
        }
    }
}
