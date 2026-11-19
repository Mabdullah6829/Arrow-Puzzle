package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(int i2) {
        return new ColorDrawable(i2);
    }

    public static final ColorDrawable toDrawable(Color color) {
        return new ColorDrawable(color.toArgb());
    }
}
