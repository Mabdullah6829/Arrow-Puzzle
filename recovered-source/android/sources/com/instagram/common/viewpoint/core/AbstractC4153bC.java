package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4153bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC4152bB viewOnClickListenerC4152bB = new ViewOnClickListenerC4152bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC4152bB);
            view.setOnTouchListener(new ViewOnTouchListenerC4151bA(viewOnClickListenerC4152bB));
        }
    }
}
