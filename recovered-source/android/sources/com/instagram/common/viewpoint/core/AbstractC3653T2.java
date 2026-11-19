package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.constraintlayout.widget.C1137R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3653T2 {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, 12, 14};
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i2) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i2 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i2 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i2, int i3) throws IOException {
        C3211Lo c3211Lo = new C3211Lo(inputStream);
        c3211Lo.mark(8192);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c3211Lo, null, options);
        c3211Lo.reset();
        if (!c3211Lo.A00()) {
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(c3211Lo, null, options);
        }
        return BitmapFactory.decodeStream(c3211Lo);
    }

    public static Bitmap A02(String str, int i2, int i3, C3659T8 c3659t8) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i3, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable t) {
            c3659t8.A08().ABC(A03(0, 5, C1137R.styleable.ConstraintSet_pathMotionArc), AbstractC3690Td.A1h, new C3691Te(t));
            return null;
        }
    }
}
