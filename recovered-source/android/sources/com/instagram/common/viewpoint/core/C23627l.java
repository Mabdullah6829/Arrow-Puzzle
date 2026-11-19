package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7l */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23627l extends AbstractC4669jd implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{51, 38, 56, 34, 51, 37, 38, 37, 32, 55, 42, 37, 38, 48};
    }

    static {
        A02();
    }

    public C23627l(List<C3311NR> list) {
        super(list);
    }

    public static C23627l A00(JSONObject jSONObject, C4494gi c4494gi) {
        C23627l c23627l = new C23627l(AbstractC4669jd.A08(jSONObject, c4494gi, new C4652jK()));
        c23627l.A2I(jSONObject);
        c23627l.A1N(A01(0, 14, 106));
        return c23627l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3310NQ
    public final int A0o() {
        if (A1Z()) {
            return 3;
        }
        C3334No c3334NoA07 = A29().A0H().A07();
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
        if (c3334NoA07 != null) {
            C3311NR c3311nrA29 = A29();
            String[] strArr2 = A01;
            if (strArr2[5].charAt(18) == strArr2[3].charAt(18)) {
                throw new RuntimeException();
            }
            A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
            if (c3311nrA29.A0H().A07().A0c() || A1n()) {
                return 4;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3310NQ
    public final int A0p() {
        return A29().A0H().A05();
    }
}
