package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggy {

    /* JADX INFO: renamed from: a */
    public long f17238a;

    /* JADX INFO: renamed from: b */
    public long f17239b;

    /* JADX INFO: renamed from: c */
    public long f17240c;

    /* JADX INFO: renamed from: d */
    public long f17241d;

    /* JADX INFO: renamed from: e */
    public double f17242e;

    /* JADX INFO: renamed from: f */
    public double f17243f;

    /* JADX INFO: renamed from: g */
    public double f17244g;

    /* JADX INFO: renamed from: h */
    public float f17245h;

    /* JADX INFO: renamed from: i */
    public float f17246i;

    /* JADX INFO: renamed from: j */
    public float f17247j;

    /* JADX INFO: renamed from: k */
    public float f17248k;

    /* JADX INFO: renamed from: a */
    public final void m7003a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17238a++;
            this.f17244g = 0.0d;
            this.f17242e = motionEvent.getRawX();
            this.f17243f = motionEvent.getRawY();
            this.f17245h = motionEvent.getX();
            this.f17246i = motionEvent.getY();
            this.f17247j = motionEvent.getRawX();
            this.f17248k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f17240c++;
            this.f17244g = Math.hypot(((double) motionEvent.getRawX()) - this.f17242e, ((double) motionEvent.getRawY()) - this.f17243f) + this.f17244g;
            this.f17242e = motionEvent.getRawX();
            this.f17243f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f17241d++;
            return;
        }
        this.f17239b += (long) (motionEvent.getHistorySize() + 1);
        this.f17244g = Math.hypot(((double) motionEvent.getRawX()) - this.f17242e, ((double) motionEvent.getRawY()) - this.f17243f) + this.f17244g;
        this.f17242e = motionEvent.getRawX();
        this.f17243f = motionEvent.getRawY();
    }
}
