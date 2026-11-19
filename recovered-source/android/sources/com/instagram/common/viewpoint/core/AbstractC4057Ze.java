package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4057Ze {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (AbstractC3926XX.A02 * 200.0f);
    public static final int A03 = (int) (AbstractC3926XX.A02 * 200.0f);
    public static final int A02 = (int) (AbstractC3926XX.A02 * 50.0f);

    public static EnumC3299NF A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return EnumC3299NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return EnumC3299NF.A05;
        }
        return EnumC3299NF.A03;
    }

    public static AbstractC4056Zd A01(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, View view) {
        if (view == null) {
            return null;
        }
        int w = view.getWidth();
        int height = view.getHeight();
        if (w >= A01 && height >= A01) {
            return new C3235MC(c4494gi, interfaceC3784VA, str);
        }
        if (w >= A03) {
            int i2 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i2) {
                return new C3236MD(c4494gi, interfaceC3784VA, str);
            }
        }
        return null;
    }

    public static C3237ME A02(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, C3332Nm c3332Nm, InterfaceC3999Yi interfaceC3999Yi, InterfaceC3998Yh interfaceC3998Yh) {
        return new C3237ME(c4494gi, interfaceC3784VA, str, c3332Nm, interfaceC3999Yi, interfaceC3998Yh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int i2;
        int h2;
        int w;
        int w2;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w3 = A01;
        if (width < w3) {
            i2 = A03;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[0];
            h2 = str.length();
            w = str2.length();
            if (h2 != w) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width >= i2) {
                w2 = A02;
                if (height < w2) {
                }
            }
            return true;
        }
        int w4 = A01;
        if (height < w4) {
            i2 = A03;
            String[] strArr3 = A00;
            String str3 = strArr3[1];
            String str4 = strArr3[0];
            h2 = str3.length();
            w = str4.length();
            if (h2 != w) {
                throw new RuntimeException();
            }
            String[] strArr4 = A00;
            strArr4[1] = "e";
            strArr4[0] = "I";
            if (width >= i2) {
                w2 = A02;
                if (height < w2) {
                }
            }
            return true;
        }
        return false;
    }
}
