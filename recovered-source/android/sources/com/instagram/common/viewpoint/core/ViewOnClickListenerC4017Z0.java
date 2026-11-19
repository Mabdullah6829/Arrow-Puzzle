package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Z0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4017Z0 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4019Z2 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public ViewOnClickListenerC4017Z0(C4019Z2 c4019z2) {
        this.A00 = c4019z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A07.getCTAButton().A0E(A00(0, 5, C1137R.styleable.ConstraintSet_transitionEasing));
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
