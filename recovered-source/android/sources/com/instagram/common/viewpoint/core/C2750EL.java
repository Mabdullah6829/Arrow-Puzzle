package com.instagram.common.viewpoint.core;

import com.google.firebase.messaging.ServiceStarter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2750EL extends AbstractC3735UN<C21494K> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C21504L A00;

    public C2750EL(C21504L c21504l) {
        this.A00 = c21504l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C21494K c21494k) {
        int iA00 = c21494k.A00();
        int duration = c21494k.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && iA00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = iA00 + ServiceStarter.ERROR_UNKNOWN;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C21504L c21504l = this.A00;
                int currentPosition4 = this.A00.A00;
                c21504l.A0j(currentPosition4);
                return;
            }
            this.A00.A0j(duration);
            return;
        }
        C21504L c21504l2 = this.A00;
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c21504l2.A0j(iA00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    public final Class<C21494K> A01() {
        return C21494K.class;
    }
}
