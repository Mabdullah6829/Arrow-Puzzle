package com.instagram.common.viewpoint.core;

import android.net.Uri;
import androidx.constraintlayout.widget.C1137R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ml */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3270Ml {
    public static byte[] A02;
    public static String[] A03 = {"TCwFA", "n8MKtp9dwzEQhpBe6BR2lxKd", "DvIgkYTRPnnTPXJJnoSR1kudzHpByEo2", "", "ukKEwC6XKRrkT9sIUNjxPleVuSFlcA27", "xINsVOhHX0SgxNuz70RgaHOI4yPeG", "tcBEB0UiUFi9btMnbz6doT8G4EON6", ""};
    public final Map<String, Object> A01 = new HashMap();
    public final List<String> A00 = new ArrayList();

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ C1137R.styleable.ConstraintSet_pathMotionArc);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {79, 82, 69, 117, 70, 79, 68, 43, 54, 33, 17, 60, 43, 42, 39, 60};
        if (A03[2].charAt(26) == 'i') {
            throw new RuntimeException();
        }
        A03[4] = "OztgjXBJYpDAKFMtRJu6AzmPW9OlK9cP";
        A02 = bArr;
    }

    static {
        A07();
    }

    public static C3270Ml A00(C3270Ml c3270Ml, long j2) {
        return c3270Ml.A03(A06(0, 7, 94), j2);
    }

    public static C3270Ml A01(C3270Ml c3270Ml, Uri uri) {
        String strA06 = A06(7, 9, 58);
        if (uri == null) {
            return c3270Ml.A02(strA06);
        }
        return c3270Ml.A05(strA06, uri.toString());
    }

    private final C3270Ml A02(String str) {
        this.A00.add(str);
        this.A01.remove(str);
        return this;
    }

    private final C3270Ml A03(String str, long j2) {
        return A04(str, Long.valueOf(j2));
    }

    private C3270Ml A04(String str, Object obj) {
        this.A01.put((String) AbstractC21273y.A01(str), AbstractC21273y.A01(obj));
        this.A00.remove(str);
        return this;
    }

    private final C3270Ml A05(String str, String str2) {
        return A04(str, str2);
    }

    public final List<String> A08() {
        return Collections.unmodifiableList(new ArrayList(this.A00));
    }

    public final Map<String, Object> A09() {
        HashMap map = new HashMap(this.A01);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof byte[];
            if (A03[2].charAt(26) == 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "";
            strArr[3] = "";
            if (z) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
