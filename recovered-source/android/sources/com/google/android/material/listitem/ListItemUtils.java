package com.google.android.material.listitem;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes2.dex */
class ListItemUtils {
    private ListItemUtils() {
    }

    public static boolean isRightAligned(@NonNull View view) {
        int i2;
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams) || (i2 = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity) == -1) {
            i2 = GravityCompat.END;
        }
        return (GravityCompat.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5;
    }
}
