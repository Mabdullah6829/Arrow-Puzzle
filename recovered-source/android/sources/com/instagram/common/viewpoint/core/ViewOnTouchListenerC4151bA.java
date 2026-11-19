package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC4151bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC4152bB A00;

    public ViewOnTouchListenerC4151bA(ViewOnClickListenerC4152bB viewOnClickListenerC4152bB) {
        this.A00 = viewOnClickListenerC4152bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
