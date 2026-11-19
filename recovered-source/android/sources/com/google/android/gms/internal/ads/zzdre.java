package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdre implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final zzdpw f12719a;

    /* JADX INFO: renamed from: b */
    public final zzdqw f12720b;

    public zzdre(zzdpw zzdpwVar, zzdqw zzdqwVar) {
        this.f12719a = zzdpwVar;
        this.f12720b = zzdqwVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int y2;
        int iMo5959k;
        try {
            zzdpw zzdpwVar = this.f12719a;
            if (zzdpwVar != null) {
                int i2 = -1;
                if (Math.abs(f2) > Math.abs(f3)) {
                    if (f2 > 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f2) * 1000.0f);
                        i2 = 1;
                    } else if (f2 < 0.0f) {
                        y2 = (int) (((motionEvent2.getX() - motionEvent.getX()) / f2) * 1000.0f);
                        i2 = 2;
                    } else {
                        y2 = 0;
                    }
                } else if (f3 > 0.0f) {
                    y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f3) * 1000.0f);
                    i2 = 8;
                } else if (f3 < 0.0f) {
                    y2 = (int) (((motionEvent2.getY() - motionEvent.getY()) / f3) * 1000.0f);
                    i2 = 4;
                } else {
                    y2 = 0;
                }
                synchronized (zzdpwVar) {
                    iMo5959k = zzdpwVar.f12569n.mo5959k();
                }
                if (i2 == iMo5959k) {
                    zzdpwVar.m5978c(this.f12720b.f12684v, y2);
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
