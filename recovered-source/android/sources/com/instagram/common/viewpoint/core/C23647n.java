package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7n */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23647n extends AbstractC4669jd implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            bArrCopyOfRange[i5] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A02();
    }

    public C23647n(List<C3311NR> list) {
        super(list);
    }

    public static C23647n A00(JSONObject jSONObject, C4494gi c4494gi) {
        C23647n c23647n = new C23647n(AbstractC4669jd.A08(jSONObject, c4494gi, new C4660jS()));
        c23647n.A2I(jSONObject);
        c23647n.A1N(A01(0, 12, 9));
        return c23647n;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3310NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3310NQ
    public final int A0p() {
        return 0;
    }
}
