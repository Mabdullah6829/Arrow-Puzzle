package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7m */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23637m extends AbstractC4669jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public C23637m(List<C3311NR> list) {
        super(list);
    }

    public static C23637m A00(JSONObject jSONObject, C4494gi c4494gi) {
        C23637m c23637m = new C23637m(AbstractC4669jd.A08(jSONObject, c4494gi, new C4659jR()));
        c23637m.A2I(jSONObject);
        c23637m.A1N(A01(0, 6, 107));
        return c23637m;
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
