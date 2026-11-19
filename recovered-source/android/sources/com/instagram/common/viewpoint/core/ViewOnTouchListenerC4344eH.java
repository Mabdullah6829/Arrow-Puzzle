package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC4344eH implements View.OnTouchListener {
    public final /* synthetic */ C4345eI A00;

    public ViewOnTouchListenerC4344eH(C4345eI c4345eI) {
        this.A00 = c4345eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C4345eI.A00(this.A00);
            this.A00.A06.ABp(this.A00.A03.A2E(), new C4150b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
