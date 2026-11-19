package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ti */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3695Ti {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 52, 60, 60, 50, 53, 60, 123, 21, 62, 47, 44, 52, 41, 48, 123, 30, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, 61, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, 27, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static JSONObject A01(C3659T8 c3659t8, long j2, long j3, long j4, long j5, int i2, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j2);
                try {
                    jSONObject.put(A00(21, 8, 54), j3 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j4);
                        try {
                            jSONObject.put(A00(79, 11, 45), j5);
                            try {
                                jSONObject.put(A00(34, 16, 56), i2);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, C1137R.styleable.ConstraintSet_pivotAnchor), exc.getMessage());
                                }
                            } catch (JSONException e) {
                                e = e;
                                c3659t8.A08().A4I(e);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                } catch (JSONException e4) {
                    e = e4;
                }
            } catch (JSONException e5) {
                e = e5;
            }
        } catch (JSONException e6) {
            e = e6;
        }
        return jSONObject;
    }

    public static void A03(C3659T8 c3659t8, long j2, long j3, long j4, long j5, int i2, Exception exc) {
        C3691Te c3691Te = new C3691Te(A00(0, 21, 43));
        c3691Te.A05(1);
        c3691Te.A07(A01(c3659t8, j2, j3, j4, j5, i2, exc));
        c3659t8.A08().ACA(A00(50, 7, 124), AbstractC3690Td.A20, c3691Te);
    }
}
