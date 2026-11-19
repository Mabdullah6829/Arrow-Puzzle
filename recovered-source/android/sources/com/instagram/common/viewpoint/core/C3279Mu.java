package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.widget.C1137R;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3279Mu {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{44, 23, 24, 27, 21, 28, 89, 13, 22, 89, 9, 24, 11, 10, 28, 89, 19, 10, 22, 23, 89, 29, 24, 13, 24, 89, 16, 23, 89, 56, 29, 56, 26, 13, 16, 22, 23, 63, 24, 26, 13, 22, 11, 0, 87, 114, 119, 98, 119, 51, 50, 47, 53, 40, 57, 126, 97, 116, 127, 78, 125, 120, 127, 122, 49, 32, 51, 50, 40, 47, 38, 62, 47, 61, 61, 58, 38, 60, 33, 59, 41, 38, 42, 45, 54, 43, 60, 88, 95, 68, 89, 78, 116, 94, 89, 71, 116, 92, 78, 73, 116, 77, 74, 71, 71, 73, 74, 72, 64, 50, 52, 51, 35, 76, 83, 94, 95, 85, 101, 79, 72, 86};
    }

    static {
        A03();
        A01 = C3279Mu.class.getSimpleName();
    }

    public static AbstractC3278Mt A00(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, Uri uri, Map<String, String> extraData, C3326Ng c3326Ng) {
        return A01(c4494gi, interfaceC3784VA, str, uri, extraData, true, false, c3326Ng);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    public static AbstractC3278Mt A01(final C4494gi c4494gi, final InterfaceC3784VA interfaceC3784VA, final String action, final Uri uri, final Map<String, String> map, final boolean z, boolean z2, C3326Ng c3326Ng) {
        final C3284N0 c3284n0A00;
        byte b;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 51));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 31));
        if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
            try {
                JSONObject jSONObject = new JSONObject(queryParameter2);
                Iterator<String> dataIterator = jSONObject.keys();
                while (dataIterator.hasNext()) {
                    String next = dataIterator.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e) {
                        e = e;
                        c4494gi.A08().ABC(A02(64, 7, 72), AbstractC3690Td.A23, new C3691Te(e));
                        Log.w(A01, A02(0, 45, 112), e);
                        c3284n0A00 = C3284N0.A00(interfaceC3784VA, ActivityUtils.A00());
                        switch (key.hashCode()) {
                            case -1458789996:
                                if (key.equals(A02(71, 11, 71))) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 109770977:
                                if (key.equals(A02(82, 5, 80))) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1546100943:
                                if (key.equals(A02(55, 9, 24))) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                if (queryParameter != null) {
                                    return null;
                                }
                                if (z2) {
                                }
                                break;
                            case 1:
                                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                                    return new AbstractC4708kH(c4494gi, interfaceC3784VA, action, uri, map, c3284n0A00, z) { // from class: com.facebook.ads.redexgen.X.83
                                        public static byte[] A02;
                                        public static final String A03;
                                        public final Uri A00;
                                        public final Map<String, String> A01;

                                        public static String A00(int i2, int i3, int i4) {
                                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                                            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                                                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
                                            }
                                            return new String(bArrCopyOfRange);
                                        }

                                        public static void A01() {
                                            A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
                                        }

                                        static {
                                            A01();
                                            A03 = C238083.class.getSimpleName();
                                        }

                                        {
                                            this.A00 = uri;
                                            this.A01 = map;
                                        }

                                        @Override // com.instagram.common.viewpoint.core.AbstractC4708kH
                                        public final EnumC3275Mq A0H() {
                                            EnumC3275Mq enumC3275MqA0M = EnumC3275Mq.A09;
                                            if (((AbstractC4708kH) this).A03) {
                                                enumC3275MqA0M = A0M();
                                            }
                                            A0J(this.A01, enumC3275MqA0M);
                                            return enumC3275MqA0M;
                                        }

                                        public final EnumC3275Mq A0M() {
                                            EnumC3275Mq enumC3275Mq = EnumC3275Mq.A09;
                                            try {
                                                C3899X6.A0D(new C3899X6(), ((AbstractC3278Mt) this).A01, AbstractC3904XB.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC3278Mt) this).A03);
                                                return enumC3275Mq;
                                            } catch (Exception unused) {
                                                String str = A00(0, 25, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + this.A00.toString();
                                                return EnumC3275Mq.A04;
                                            }
                                        }
                                    };
                                }
                                return z2 ? new C238285(c4494gi, interfaceC3784VA, action, uri, map) : new AbstractC4708kH(c4494gi, interfaceC3784VA, action, uri, map, c3284n0A00, z) { // from class: com.facebook.ads.redexgen.X.84
                                    public static byte[] A02;
                                    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
                                    public static final String A04;
                                    public final Uri A00;
                                    public final Map<String, String> A01;

                                    public static String A00(int i2, int i3, int i4) {
                                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 84);
                                        }
                                        return new String(bArrCopyOfRange);
                                    }

                                    public static void A01() {
                                        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
                                        if (A03[3].charAt(0) == 'g') {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr = A03;
                                        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
                                        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
                                    }

                                    static {
                                        A01();
                                        A04 = C238184.class.getSimpleName();
                                    }

                                    {
                                        this.A00 = uri;
                                        this.A01 = map;
                                    }

                                    @Override // com.instagram.common.viewpoint.core.AbstractC4708kH
                                    public final EnumC3275Mq A0H() {
                                        EnumC3275Mq enumC3275MqA0M = EnumC3275Mq.A09;
                                        if (((AbstractC4708kH) this).A03) {
                                            enumC3275MqA0M = A0M();
                                        }
                                        if (!AbstractC3966YB.A0i(((AbstractC3278Mt) this).A01, enumC3275MqA0M, this.A01)) {
                                            A0J(this.A01, enumC3275MqA0M);
                                        }
                                        return enumC3275MqA0M;
                                    }

                                    public final EnumC3275Mq A0M() {
                                        if (A0K(this.A00)) {
                                            EnumC3275Mq actionOutcome = EnumC3275Mq.A0A;
                                            return actionOutcome;
                                        }
                                        try {
                                            EnumC3275Mq actionOutcome2 = C3899X6.A06(new C3899X6(), ((AbstractC3278Mt) this).A01, AbstractC3904XB.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC3278Mt) this).A03, this.A01);
                                            return actionOutcome2;
                                        } catch (Exception unused) {
                                            String str = A00(0, 25, 2) + this.A00.toString();
                                            EnumC3275Mq actionOutcome3 = EnumC3275Mq.A04;
                                            return actionOutcome3;
                                        }
                                    }
                                };
                            case 2:
                                return new C4707kG(c4494gi, interfaceC3784VA, action, uri, map);
                            default:
                                return new C4706kE(c4494gi, interfaceC3784VA, action, uri);
                        }
                    }
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        c3284n0A00 = C3284N0.A00(interfaceC3784VA, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 71))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 80))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 24))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z2 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 34)))) ? new C238487(c4494gi, interfaceC3784VA, action, uri, map, c3284n0A00, z, c3326Ng) : new C238285(c4494gi, interfaceC3784VA, action, uri, map);
            case 1:
                if (A02(109, 4, 79).equals(uri.getQueryParameter(A02(49, 6, 85)))) {
                    return new AbstractC4708kH(c4494gi, interfaceC3784VA, action, uri, map, c3284n0A00, z) { // from class: com.facebook.ads.redexgen.X.83
                        public static byte[] A02;
                        public static final String A03;
                        public final Uri A00;
                        public final Map<String, String> A01;

                        public static String A00(int i2, int i3, int i4) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                            for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                                bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 119, 114, 117, 112, 59, 110, 105, 119, 33, 59, 67, 70, 65, 68};
                        }

                        static {
                            A01();
                            A03 = C238083.class.getSimpleName();
                        }

                        {
                            this.A00 = uri;
                            this.A01 = map;
                        }

                        @Override // com.instagram.common.viewpoint.core.AbstractC4708kH
                        public final EnumC3275Mq A0H() {
                            EnumC3275Mq enumC3275MqA0M = EnumC3275Mq.A09;
                            if (((AbstractC4708kH) this).A03) {
                                enumC3275MqA0M = A0M();
                            }
                            A0J(this.A01, enumC3275MqA0M);
                            return enumC3275MqA0M;
                        }

                        public final EnumC3275Mq A0M() {
                            EnumC3275Mq enumC3275Mq = EnumC3275Mq.A09;
                            try {
                                C3899X6.A0D(new C3899X6(), ((AbstractC3278Mt) this).A01, AbstractC3904XB.A00(this.A00.getQueryParameter(A00(25, 4, 67))), ((AbstractC3278Mt) this).A03);
                                return enumC3275Mq;
                            } catch (Exception unused) {
                                String str = A00(0, 25, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + this.A00.toString();
                                return EnumC3275Mq.A04;
                            }
                        }
                    };
                }
                if (z2) {
                }
            case 2:
                return new C4707kG(c4494gi, interfaceC3784VA, action, uri, map);
            default:
                return new C4706kE(c4494gi, interfaceC3784VA, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 80).equalsIgnoreCase(str) || A02(55, 9, 24).equalsIgnoreCase(str);
    }
}
