package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.q7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5053q7 implements InterfaceC201424 {
    public final C5058qC A00;

    @Deprecated
    public final C2515AW A01;
    public final C5056qA A02;
    public final C207232 A03;

    @Deprecated
    public final C5055q9 A04;
    public final C5048q2 A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C5053q7 A09 = new C20642u().A05();
    public static final InterfaceC201323<C5053q7> A08 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.qE
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5053q7.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C5053q7 A00(Bundle bundle) {
        String str = (String) AbstractC21273y.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C5056qA c5056qA = bundle2 == null ? C5056qA.A07 : (C5056qA) C5056qA.A06.A6f(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C5048q2 c5048q2 = bundle3 == null ? C5048q2.A0Z : (C5048q2) C5048q2.A0Y.A6f(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C5053q7(str, bundle4 == null ? C2515AW.A00 : (C2515AW) C5058qC.A05.A6f(bundle4), null, c5056qA, c5048q2);
    }

    public C5053q7(String str, C2515AW c2515aw, C5055q9 c5055q9, C5056qA c5056qA, C5048q2 c5048q2) {
        this.A06 = str;
        this.A03 = c5055q9;
        this.A04 = c5055q9;
        this.A02 = c5056qA;
        this.A05 = c5048q2;
        this.A00 = c2515aw;
        this.A01 = c2515aw;
    }

    public static String A02(int i2) {
        return Integer.toString(i2, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5053q7)) {
            return false;
        }
        C5053q7 c5053q7 = (C5053q7) obj;
        if (AbstractC22035C.A1E(this.A06, c5053q7.A06)) {
            C5058qC c5058qC = this.A00;
            C5058qC c5058qC2 = c5053q7.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c5058qC.equals(c5058qC2) && AbstractC22035C.A1E(this.A03, c5053q7.A03) && AbstractC22035C.A1E(this.A02, c5053q7.A02) && AbstractC22035C.A1E(this.A05, c5053q7.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i2 = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i2 + result2) * 31) + this.A02.hashCode()) * 31;
        C5058qC c5058qC = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c5058qC.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
