package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4677jl extends AbstractC3287N3 {
    public static byte[] A06;
    public static final String A07;
    public C4679jn A00;
    public EnumC3823Vp A01;
    public boolean A02;
    public final C4494gi A03;
    public final InterfaceC3784VA A04;
    public final AbstractC4139ay A05;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C4677jl.class.getSimpleName();
    }

    public C4677jl(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, AbstractC4139ay abstractC4139ay, C4439fp c4439fp, AbstractC3288N4 abstractC3288N4, EnumC3823Vp enumC3823Vp) {
        super(c4494gi, abstractC3288N4, c4439fp);
        this.A04 = interfaceC3784VA;
        this.A05 = abstractC4139ay;
        this.A03 = c4494gi;
        this.A01 = enumC3823Vp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3287N3
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC3382Oa.A02(this.A00.A05(), AbstractC3941Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C3763Up.A1A(this.A03)) {
                if (this.A01 == EnumC3823Vp.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C3880Wl c3880WlA00 = C3880Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                c3880WlA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC3959Y4.A00(new C4678jm(this));
            }
        }
    }

    public final void A0A(C4679jn c4679jn) {
        this.A00 = c4679jn;
    }
}
