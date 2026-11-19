package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4676jk extends AbstractC3287N3 {
    public static byte[] A02;

    @Nullable
    public final C4674ji A00;
    public final InterfaceC3784VA A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C4676jk(C4494gi c4494gi, AbstractC3288N4 abstractC3288N4, C4439fp c4439fp, InterfaceC3784VA interfaceC3784VA, C4674ji c4674ji) {
        super(c4494gi, abstractC3288N4, c4439fp);
        this.A01 = interfaceC3784VA;
        this.A00 = c4674ji;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3287N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC3382Oa.A02(this.A00.A0a(), AbstractC3941Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C3763Up.A1A(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C3880Wl c3880WlA00 = C3880Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                c3880WlA00.A0E(string, placementType);
            }
        }
    }
}
