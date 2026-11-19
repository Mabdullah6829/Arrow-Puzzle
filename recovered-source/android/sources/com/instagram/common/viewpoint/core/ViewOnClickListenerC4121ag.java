package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ag */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4121ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C3229M6 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A00.A07) && !A00(0, 11, 12).equals(this.A00.A07)) {
                Intent intent = new Intent(A00(22, 26, 51), AbstractC3904XB.A00(this.A00.A07));
                intent.addFlags(268435456);
                this.A00.A09.A0F().A9y();
                try {
                    C3889Wu.A0D(this.A00.A09, intent);
                    this.A00.A06.AF0();
                } catch (C3887Ws e) {
                    Throwable cause = e.getCause();
                    C3887Ws cause2 = e;
                    if (cause != null) {
                        cause2 = e.getCause();
                    }
                    this.A00.A09.A08().ABC(A00(11, 11, 3), AbstractC3690Td.A00, new C3691Te(cause2));
                }
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC4121ag(C3229M6 c3229m6) {
        this.A00 = c3229m6;
    }
}
