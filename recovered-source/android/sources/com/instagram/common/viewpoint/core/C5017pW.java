package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5017pW implements InterfaceC201424 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public static String[] A04 = {"W5WZRfo3traFBsuJqUeacov", "AOz8vYfc0kUMyRrWtsrS4pOQsYE8BP6P", "ocEUeDJ9UZl7Q6o8h21wMsDJowBHj84j", "pkgO1YjXdbsvKDgws3J49uWJB6yyqkG7", "vCvp8tg1JPxrxhdMnot9YI84PFBkssaD", "Dazl9IXOnyCH5QLsvPseWpscLh5D5M0t", "ZYJ1zYUUdaXBOvkE2t6KLICz8MhT9p2M", "ySOVjFSAiUWhoASiDo2jZct"};
    public static final C5017pW A06 = new C5017pW(0, 0);
    public static final String A0A = AbstractC22035C.A0h(0);
    public static final String A07 = AbstractC22035C.A0h(1);
    public static final String A09 = AbstractC22035C.A0h(2);
    public static final String A08 = AbstractC22035C.A0h(3);
    public static final InterfaceC201323<C5017pW> A05 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.pX
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return C5017pW.A00(bundle);
        }
    };

    public C5017pW(int i2, int i3) {
        this(i2, i3, 0, 1.0f);
    }

    public C5017pW(int i2, int i3, int i4, float f2) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = f2;
    }

    public static /* synthetic */ C5017pW A00(Bundle bundle) {
        int i2 = bundle.getInt(A0A, 0);
        int i3 = bundle.getInt(A07, 0);
        int height = bundle.getInt(A09, 0);
        return new C5017pW(i2, i3, height, bundle.getFloat(A08, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof C5017pW;
        String[] strArr = A04;
        if (strArr[4].charAt(6) == strArr[2].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "xwJKUsQcskzDCgeEWIG9ozPdTsTzWcW9";
        strArr2[2] = "cRblKPLDWf1oyG1RJoVr7n5QNKGN7idl";
        if (!z) {
            return false;
        }
        C5017pW c5017pW = (C5017pW) obj;
        return this.A03 == c5017pW.A03 && this.A01 == c5017pW.A01 && this.A02 == c5017pW.A02 && this.A00 == c5017pW.A00;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((7 * 31) + result) * 31) + this.A01) * 31;
        int result3 = this.A02;
        return ((result2 + result3) * 31) + Float.floatToRawIntBits(this.A00);
    }
}
