package com.instagram.common.viewpoint.core;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.YH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3972YH extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC3973YI A02;
    public final /* synthetic */ ViewOnTouchListenerC3974YJ A03;

    public C3972YH(ViewOnTouchListenerC3974YJ viewOnTouchListenerC3974YJ, InterfaceC3973YI interfaceC3973YI, int i2, int i3) {
        this.A03 = viewOnTouchListenerC3974YJ;
        this.A02 = interfaceC3973YI;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y2 = motionEvent2.getY() - motionEvent.getY();
        float diffX = motionEvent2.getX() - motionEvent.getX();
        float diffY = Math.abs(y2);
        if (diffY > Math.abs(diffX) && y2 > this.A00) {
            float diffY2 = Math.abs(f3);
            if (diffY2 > this.A01) {
                this.A02.AG8();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.A02.AFx();
        return true;
    }
}
