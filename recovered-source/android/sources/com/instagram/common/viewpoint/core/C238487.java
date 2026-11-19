package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.87 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C238487 extends AbstractC4708kH {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public C3921XS A00;
    public final Uri A01;
    public final C3326Ng A02;
    public final Map<String, String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<C3283My> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<C3283My> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, 61, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, 22, 3, 3, 72, 73, 88, 77, 69, 64, 95, 19, 69, 72, 17, 9, 95, 27, 4, 17, 26, 17, 16, 43, 16, 17, 17, 4, 24, 29, 26, 31, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, 20, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, 64, 125, 68, 67, 78, 78, 64, 67, 65, 73, 59, 42, 35, 117, 23, 6, 15, 19, 17, 12, 14, 19, 23, 89};
    }

    static {
        A07();
        A06 = C238487.class.getSimpleName();
    }

    public C238487(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, Uri uri, Map<String, String> extraData, C3284N0 c3284n0, boolean z, C3326Ng c3326Ng) {
        super(c4494gi, interfaceC3784VA, str, c3284n0, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c3326Ng;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(com.instagram.common.viewpoint.core.C3283My r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C238487.A00(com.facebook.ads.redexgen.X.My):android.content.Intent");
    }

    private Intent A01(C3283My c3283My) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c3283My.A05()) && !TextUtils.isEmpty(c3283My.A04())) {
            intent.setComponent(new ComponentName(c3283My.A05(), c3283My.A04()));
        }
        if (!TextUtils.isEmpty(c3283My.A03())) {
            intent.setData(AbstractC3904XB.A00(c3283My.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(219, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return AbstractC3904XB.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(211, 8, 11);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 5);
        return AbstractC3904XB.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC3275Mq A03() throws C3887Ws {
        C3899X6 c3899x6 = new C3899X6();
        try {
            return C3899X6.A06(c3899x6, ((AbstractC3278Mt) this).A01, A02(), ((AbstractC3278Mt) this).A03, this.A03);
        } catch (C3887Ws unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                C3899X6.A0E(c3899x6, ((AbstractC3278Mt) this).A01, AbstractC3904XB.A00(queryParameter), ((AbstractC3278Mt) this).A03);
            }
            return EnumC3275Mq.A09;
        }
    }

    private List<C3283My> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    C3283My c3283MyA00 = C3283My.A00(jSONArrayOptJSONArray.optJSONObject(i2));
                    if (c3283MyA00 != null) {
                        arrayList.add(c3283MyA00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC3689Tc interfaceC3689TcA08 = ((AbstractC3278Mt) this).A01.A08();
            int i3 = AbstractC3690Td.A24;
            C3691Te c3691Te = new C3691Te(e);
            String appsiteDataString3 = A04(204, 7, 61);
            interfaceC3689TcA08.ABC(appsiteDataString3, i3, c3691Te);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            try {
                if (C3889Wu.A0D(((AbstractC3278Mt) this).A01, it.next())) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean A09(C4494gi c4494gi, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C3763Up.A29(c4494gi);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4708kH
    public final EnumC3275Mq A0H() {
        EnumC3275Mq enumC3275MqA0M = EnumC3275Mq.A09;
        if (((AbstractC4708kH) this).A03) {
            enumC3275MqA0M = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, enumC3275MqA0M);
        C3326Ng.A06(this.A02, ((AbstractC3278Mt) this).A01);
        return enumC3275MqA0M;
    }

    public final EnumC3275Mq A0M() {
        EnumC3275Mq enumC3275MqA03 = EnumC3275Mq.A09;
        String strA04 = A04(148, 15, 93);
        boolean zA0K = A0K(this.A01);
        if (!zA0K) {
            zA0K = A08();
        }
        if (!zA0K) {
            try {
                enumC3275MqA03 = A03();
                if (enumC3275MqA03 != EnumC3275Mq.A09) {
                    strA04 = A04(188, 16, 61);
                } else {
                    strA04 = A04(163, 25, 59);
                }
            } catch (Exception unused) {
                enumC3275MqA03 = EnumC3275Mq.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(strA04, redirectionAction);
        return enumC3275MqA03;
    }

    public final void A0N(C3921XS c3921xs) {
        this.A00 = c3921xs;
    }
}
