package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4357eU {
    public static int A00(DisplayMetrics displayMetrics) {
        int i2 = displayMetrics.widthPixels;
        if (i2 > 1700) {
            i2 = 1700;
        }
        int width = i2 / 448;
        return width;
    }

    public static void A01(@Nullable Context context, final View view, long j2, final View view2) {
        if (view2 != null) {
            view2.setVisibility(0);
        }
        view.setVisibility(8);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.eT
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4357eU.A02(view2, view);
            }
        }, j2);
    }

    public static /* synthetic */ void A02(View view, View view2) {
        if (view != null) {
            view.setVisibility(8);
        }
        view2.setVisibility(0);
    }
}
