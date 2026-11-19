package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC4369eh implements View.OnTouchListener {
    public final /* synthetic */ C2775Ek A00;

    public ViewOnTouchListenerC4369eh(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C2723Du(view, motionEvent));
        return false;
    }
}
