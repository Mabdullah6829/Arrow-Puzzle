package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4155bE implements InterfaceC3217Lu {
    public static byte[] A01;
    public final C3659T8 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C4155bE(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    private void A02(int i2, String str, JSONObject jSONObject, boolean z, int i3) {
        C3691Te c3691Te = new C3691Te(A00(4, 6, 44));
        c3691Te.A07(jSONObject);
        c3691Te.A05(1);
        c3691Te.A09(z);
        c3691Te.A04(i3);
        try {
            jSONObject.put(A00(33, 13, 62), C3684TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i3);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i2 + 4000, c3691Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i2 + A00(1, 3, C1137R.styleable.ConstraintSet_polarRelativeTo) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC3219Lw enumC3219Lw) {
        for (EnumC3219Lw enumC3219Lw2 : C4036ZJ.A06) {
            if (enumC3219Lw2.equals(enumC3219Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3217Lu
    public final void ABE(EnumC3219Lw enumC3219Lw, JSONObject jSONObject, int i2) {
        A02(enumC3219Lw.A03(), enumC3219Lw.toString(), jSONObject, A03(enumC3219Lw), i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3217Lu
    public final void ABs(int i2, JSONObject jSONObject, int i3) {
        A02(i2, A00(18, 9, 111) + i2, jSONObject, false, i3);
    }
}
