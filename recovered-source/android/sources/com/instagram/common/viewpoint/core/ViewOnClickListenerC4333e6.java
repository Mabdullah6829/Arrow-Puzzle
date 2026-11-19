package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC4333e6 implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"ZORd5xFqixOFhmYOfXnO345CHw6Ta02w", "OZ", "OQ0N", "rqVhPmdjJ9FZprpIbtM3CV9Bkmueh049", "Mzz9MqA4zj", "ReAjeiyasZdcxecBPaADU26VXrhM6RJh", "r52dfcnslGQHpCZhGZGmnjgdJQXYjMBM", "zjyNvy4fEAQ51zWLeD1ZjnseIufNB9Ms"};
    public final /* synthetic */ C21594U A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[7].charAt(1) == '2') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "Q8w71E1pXjwyeJwXodLveN5DPJuDbHqJ";
            strArr[6] = "vKRTSYGBBmrLOEBfFNTayte5spFfdrra";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 55);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{107, 102, 98, 103, 102, 113};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC4333e6(C21594U c21594u) {
        this.A00 = c21594u;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02(A00(0, 6, 52));
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
