package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3978YN {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC3977YM enumC3977YM) {
        byte[] bArrDecode = Base64.decode(enumC3977YM.A01(AbstractC3926XX.A02), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(EnumC3977YM enumC3977YM) {
        byte[] bArrDecode = Base64.decode(enumC3977YM.A01(AbstractC3926XX.A02), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C4494gi c4494gi, EnumC3977YM enumC3977YM) {
        return new BitmapDrawable(c4494gi.getResources(), A01(enumC3977YM));
    }
}
