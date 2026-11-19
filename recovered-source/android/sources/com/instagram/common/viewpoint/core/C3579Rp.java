package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3579Rp {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static InterfaceC3216Lt A00(Context context, InterfaceC3661TA interfaceC3661TA) {
        return A01(context, interfaceC3661TA, null);
    }

    public static InterfaceC3216Lt A01(Context context, InterfaceC3661TA interfaceC3661TA, String str) {
        C4490ge sdkContext = A09(context);
        InterfaceC3220Lx interfaceC3220LxA8C = interfaceC3661TA.A8C(sdkContext);
        if (interfaceC3220LxA8C != null) {
            return str != null ? interfaceC3220LxA8C.ACN(str) : interfaceC3220LxA8C.ACM();
        }
        return new C4724kX();
    }

    public static C4494gi A02(Activity activity) {
        return new C4494gi(activity, (InterfaceC3661TA) A0A(), A00(activity, A0A()));
    }

    public static C4494gi A03(Context context) {
        return new C4494gi(context, A0A(), new C4724kX());
    }

    public static C4494gi A04(Context context) {
        if (C3763Up.A0w(context)) {
            return new C4494gi(context, A0A(), A00(context, A0A()));
        }
        C4494gi c4494giA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c4494giA03;
    }

    public static C4494gi A05(Context context, String str) {
        InterfaceC3216Lt interfaceC3216LtA01 = A01(context, A0A(), str);
        interfaceC3216LtA01.AJT(1000);
        return new C4494gi(context, A0A(), interfaceC3216LtA01);
    }

    public static C4494gi A06(Context context, String str) {
        return new C4494gi(context, A0A(), A01(context, A0A(), str));
    }

    public static C4494gi A07(Context context, String str) {
        return new C4494gi(context, A0A(), A01(context, A0A(), str));
    }

    public static C232176 A08(Context context) {
        return new C232176(context, A0A(), A0A().A8C(A09(context)));
    }

    public static C4490ge A09(Context context) {
        return new C4490ge(context, A0A());
    }

    public static synchronized C4044ZR A0A() {
        return C4044ZR.A02();
    }
}
