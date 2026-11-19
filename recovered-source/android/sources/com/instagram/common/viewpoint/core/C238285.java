package com.instagram.common.viewpoint.core;

import android.net.Uri;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.85 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C238285 extends AbstractC4708kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public C238285(C4494gi c4494gi, InterfaceC3784VA interfaceC3784VA, String str, Uri uri, Map<String, String> mExtraData) {
        super(c4494gi, interfaceC3784VA, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4708kH
    public final EnumC3275Mq A0H() {
        A0J(this.A00, null);
        return EnumC3275Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, C1137R.styleable.ConstraintSet_transitionEasing);
        }
        return AbstractC3904XB.A00(uri);
    }
}
