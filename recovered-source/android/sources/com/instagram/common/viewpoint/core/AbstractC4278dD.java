package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4278dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C4277dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C4277dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C4277dC A01(C4494gi c4494gi, AbstractC4669jd abstractC4669jd, int i2, InterfaceC4275dA interfaceC4275dA) {
        C4277dC c4277dC = new C4277dC(c4494gi, abstractC4669jd, c4494gi.A02().A0A(), i2);
        c4277dC.A0b(interfaceC4275dA);
        c4277dC.A0X();
        A01.put(abstractC4669jd.A1D(), new WeakReference<>(c4277dC));
        return c4277dC;
    }

    public static C4277dC A02(String str) {
        WeakReference<C4277dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC4669jd abstractC4669jd, C4277dC c4277dC) {
        A01.put(abstractC4669jd.A1D(), new WeakReference<>(c4277dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
