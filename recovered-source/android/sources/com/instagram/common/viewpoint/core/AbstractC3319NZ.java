package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.NZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3319NZ {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{24, 26, 9, 20, 14, 8, 30, 23, 100, 117, 102, 103, 125, 122, 115, 85, 74, 71, 70, 76, 124, 86, 81, 79};
    }

    public static List<C3311NR> A01(JSONArray jSONArray, JSONObject jSONObject, C4494gi c4494gi, InterfaceC3324Ne interfaceC3324Ne) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (i2 == 0) {
                    A03(jSONObject2, jSONObject);
                }
                C3311NR c3311nrA00 = C3311NR.A00(jSONObject2);
                interfaceC3324Ne.A3y(c3311nrA00, jSONObject2);
                arrayList.add(c3311nrA00);
            } catch (JSONException e) {
                c4494gi.A08().ABC(A00(8, 7, 90), AbstractC3690Td.A2B, new C3691Te(e));
            }
        }
        return arrayList;
    }

    public static void A03(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals(A00(15, 9, 109)) && !next.equals(A00(0, 8, 53)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
