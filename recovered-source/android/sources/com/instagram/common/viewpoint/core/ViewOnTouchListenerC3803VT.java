package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.VT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC3803VT implements View.OnTouchListener {
    public final /* synthetic */ C3833Vz A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public ViewOnTouchListenerC3803VT(C3833Vz c3833Vz, boolean z, boolean z2) {
        this.A00 = c3833Vz;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A02) {
            return false;
        }
        if (this.A01 && C3763Up.A1X(this.A00.A04)) {
            return false;
        }
        return true;
    }
}
