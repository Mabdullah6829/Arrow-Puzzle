package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4391f3 extends AbstractRunnableC3871Wc {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3659T8 A01;
    public final /* synthetic */ InterfaceC3683TW A02;
    public final /* synthetic */ C3691Te A03;
    public final /* synthetic */ String A04;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -97, -64, -67, -48, -62, 123, -66, -51, -68, -50, -61, 123, -67, -64, -66, -68, -48, -50, -64, 123, -50, -96, -55, -47, -60, -51, -54, -55, -56, -64, -55, -49, -97, -68, -49, -68, -85, -51, -54, -47, -60, -65, -64, -51, 123, -55, -54, -49, 123, -60, -55, -59, -64, -66, -49, -64, -65, 113, -121, -116, -119, 62, -121, -111, 62, -116, -109, -118, -118, 63, -109, -106, -106, -101, -90, -101, -95, -96, -109, -98, -111, -101, -96, -104, -95, 116, -119, 116, 124, 127, 116, 117, 127, 120, 114, 119, 124, -122, 126, 114, -122, -125, 116, 118, 120, -26, -28, -26, -21, -24, -106, -119, -121, -109, -106, -120, -125, -120, -123, -104, -123, -122, -123, -105, -119, -59, -72, -60, -56, -72, -58, -57, -78, -68, -73, -115, -113, 124, -114, -109, -118, 127, -104, -102, -121, -103, -98, -107, -118, -124, -120, -108, -119, -118};
    }

    public C4391f3(C3659T8 c3659t8, String str, int i2, C3691Te c3691Te, InterfaceC3683TW interfaceC3683TW) {
        this.A01 = c3659t8;
        this.A04 = str;
        this.A00 = i2;
        this.A03 = c3691Te;
        this.A02 = interfaceC3683TW;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        String strA03;
        Map<String, String> mapA5a;
        String strA8L;
        try {
            if (C3684TX.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C3795VL.A08(this.A01, EnumC3787VD.A0A.toString() + A00(0, 1, 50) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                strA03 = AbstractC3948Xt.A03(this.A01, cause);
            } else if (AbstractC3765Ur.A0R(this.A01)) {
                C3659T8 c3659t8 = this.A01;
                Throwable deLogExceptionCause = this.A03;
                strA03 = AbstractC3948Xt.A03(c3659t8, deLogExceptionCause);
            } else {
                strA03 = A00(0, 0, 81) + this.A03.getMessage();
            }
            if (AbstractC3765Ur.A0V(this.A01)) {
                mapA5a = this.A01.A04().A5a();
            } else if (this.A02 != null) {
                mapA5a = this.A02.A7z();
            } else if (C3684TX.A02) {
                C3684TX.A0F(new RuntimeException(A00(1, 57, 84), this.A03));
                mapA5a = new HashMap<>();
            } else {
                mapA5a = this.A01.A04().A5a();
            }
            mapA5a.put(A00(136, 7, 19), this.A04);
            mapA5a.put(A00(143, 12, 30), String.valueOf(this.A00));
            JSONObject jSONObjectA03 = this.A03.A03();
            if (jSONObjectA03 != null) {
                mapA5a.put(A00(71, 15, 43), jSONObjectA03.toString());
            }
            if ((A00(106, 5, 124).equals(this.A04) || A00(111, 15, 29).equals(this.A04)) && (strA8L = this.A01.A04().A8L()) != null) {
                mapA5a.put(A00(86, 20, 12), strA8L);
            }
            String strA0C = this.A01.A0C();
            if (strA0C != null && !TextUtils.isEmpty(strA0C)) {
                mapA5a.put(A00(126, 10, 76), strA0C);
            }
            InterfaceC3682TV interfaceC3682TV = (InterfaceC3682TV) C3684TX.A0A.get();
            if (interfaceC3682TV == null) {
                C3684TX.A0F(new RuntimeException(A00(58, 13, 23)));
            } else {
                interfaceC3682TV.AL5(strA03, mapA5a, this.A01);
            }
        } catch (Throwable t) {
            C3684TX.A0F(t);
        }
    }
}
