package com.instagram.common.viewpoint.core;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3915XM {
    public static String[] A02 = {"P6MYZTOvDAaFen8GvswQ7TN6uAA4LWVv", "hYZBnkN7eg3Goj1fCi2fLRcc1xaBLP0T", "hgTfm2gsKyXruwHhjUk", "Xl5p6SNgJSz0NngEgDitAc249tQNQ8ta", "gXDmJbn0MXLGD1TV1woO3x4WUye", "irvXIfdrm7YhWQVUx8qen3XIyPBMomv3", "r42H5ZZ7hG", "IBnhtff"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C5115rN<C3770Uw, C3775V1> c5115rN) {
        if (c5115rN.A06.A05()) {
            return c5115rN.A07.A07();
        }
        if (!c5115rN.A06.A06()) {
            return true;
        }
        return c5115rN.A07.A06();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    private boolean A01(C5115rN<C3770Uw, C3775V1> c5115rN, InterfaceC5105rD interfaceC5105rD) {
        boolean z;
        int i2;
        int i3;
        float fA9X = -1.0f;
        try {
            fA9X = interfaceC5105rD.A9X(c5115rN);
        } catch (IllegalStateException unused) {
        }
        if (A02[6].length() == 7) {
            throw new RuntimeException();
        }
        A02[5] = "l0GJDJ6h98NWCV6pJLy8cxtVoo076bMe";
        if (fA9X > 0.0f && A00(c5115rN)) {
            return true;
        }
        if (c5115rN.A06.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c5115rN)) {
            return true;
        }
        interfaceC5105rD.A9W(this.A00);
        if (A02[2].length() != 2) {
            A02[2] = "WH3ZGQ";
            interfaceC5105rD.A8D(c5115rN, this.A01);
            if (this.A00.bottom - this.A00.top > 0) {
                i2 = this.A01.bottom;
                i3 = this.A00.top;
                if (A02[7].length() != 7) {
                    throw new RuntimeException();
                }
                A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
                z = i2 - i3 > 0;
            }
            return !z && A00(c5115rN);
        }
        interfaceC5105rD.A8D(c5115rN, this.A01);
        if (this.A00.bottom - this.A00.top > 0) {
            i2 = this.A01.bottom;
            i3 = this.A00.top;
            if (A02[7].length() != 7) {
                throw new RuntimeException();
            }
            A02[1] = "8dStYXDidh9UFB7oEkGa7ohf6JNszk5F";
            if (i2 - i3 > 0) {
            }
        }
        if (z) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C5115rN<C3770Uw, C3775V1> c5115rN, InterfaceC5105rD interfaceC5105rD) {
        if (c5115rN.A07.A04() && A01(c5115rN, interfaceC5105rD)) {
            c5115rN.A07.A01();
            c5115rN.A06.A02().ABx(c5115rN.A06.A03(), c5115rN.A06.A04());
        }
        if (c5115rN.A07.A05() && C3763Up.A1l(c5115rN.A06.A01())) {
            c5115rN.A07.A02();
            c5115rN.A06.A02().ABL(c5115rN.A06.A03(), c5115rN.A06.A04());
        }
    }
}
