package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4341eE {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{81, 124, 102, 101, 121, 116, 108, 88, 112, 97, 103, 124, 118, 102, 53, 124, 102, 53, 123, 96, 121, 121, 59, 25, 46, 56, 36, 62, 57, 40, 46, 56, 107, 34, 56, 107, 37, 62, 39, 39, 101, 37, 18, 31, 26, 23, 18, 7, 26, 28, 29, 83, 21, 18, 26, 31, 22, 23, 93, 107, 105, 106};
    }

    static {
        A03();
        A00 = true;
    }

    public static BitmapDrawable A00(C4494gi c4494gi, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (overlayBm != null && (!A00 || A05(c4494gi, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c4494gi.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c4494gi, A02(0, 23, 41));
                    }
                } else {
                    A04(c4494gi, A02(23, 18, C1137R.styleable.ConstraintSet_quantizeMotionSteps));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th) {
            c4494gi.A08().ABC(A02(59, 3, 58), AbstractC3690Td.A1u, new C3691Te(th));
            return null;
        }
    }

    public static C4342eF A01(C4494gi c4494gi, String str) {
        BitmapDrawable bitmapDrawableA00;
        try {
            if (TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(c4494gi, str)) == null) {
                return null;
            }
            C4342eF c4342eF = new C4342eF(c4494gi);
            c4342eF.setBackground(bitmapDrawableA00);
            c4342eF.setClickable(false);
            c4342eF.setFocusable(false);
            return c4342eF;
        } catch (Throwable th) {
            c4494gi.A08().ABC(A02(59, 3, 58), AbstractC3690Td.A1u, new C3691Te(th));
            return null;
        }
    }

    public static void A04(C4494gi c4494gi, String str) {
        c4494gi.A08().ABC(A02(59, 3, 58), AbstractC3690Td.A1u, new C3691Te(str));
    }

    public static boolean A05(C4494gi c4494gi, Bitmap bitmap) {
        for (int i2 = 0; i2 < x; i2++) {
            for (int pixel = 0; pixel < x; pixel++) {
                int x = bitmap.getPixel(i2, pixel);
                if (Color.alpha(x) / 255.0f > 0.03f) {
                    A04(c4494gi, A02(41, 18, 79));
                    return false;
                }
            }
        }
        String[] strArr = A02;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD";
        strArr2[4] = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7";
        return true;
    }
}
