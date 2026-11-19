package com.instagram.common.viewpoint.core;

import android.view.View;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4228cP implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C3113KE A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 69, 72, 73, 67};
    }

    public ViewOnClickListenerC4228cP(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0M) {
                this.A00.A0K.A02(A00(0, 5, C1137R.styleable.ConstraintSet_pathMotionArc));
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
