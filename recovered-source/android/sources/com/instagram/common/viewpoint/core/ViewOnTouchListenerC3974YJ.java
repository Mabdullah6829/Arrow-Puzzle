package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnTouchListenerC3974YJ implements View.OnTouchListener {
    public final GestureDetector A00;

    public ViewOnTouchListenerC3974YJ(int i2, int i3, Context context, InterfaceC3973YI interfaceC3973YI) {
        this.A00 = new GestureDetector(context, new C3972YH(this, interfaceC3973YI, i2, i3));
    }

    public final void A00(View view) {
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
