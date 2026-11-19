package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class zah extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: s */
    public int f21554s;

    /* JADX INFO: renamed from: t */
    public long f21555t;

    /* JADX INFO: renamed from: u */
    public int f21556u;

    /* JADX INFO: renamed from: v */
    public int f21557v;

    /* JADX INFO: renamed from: w */
    public boolean f21558w;

    /* JADX INFO: renamed from: x */
    public zag f21559x;

    /* JADX INFO: renamed from: a */
    public final boolean m9081a() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i2 = this.f21554s;
        boolean z = false;
        boolean z2 = true;
        if (i2 != 1) {
            if (i2 == 2 && this.f21555t >= 0) {
                float f2 = 0;
                float fUptimeMillis = (SystemClock.uptimeMillis() - this.f21555t) / f2;
                z2 = fUptimeMillis >= 1.0f;
                if (z2) {
                    this.f21554s = 0;
                }
                this.f21557v = (int) ((Math.min(fUptimeMillis, 1.0f) * f2) + 0.0f);
            }
            z = z2;
        } else {
            this.f21555t = SystemClock.uptimeMillis();
            this.f21554s = 2;
        }
        int i3 = this.f21557v;
        boolean z3 = this.f21558w;
        if (!z) {
            if (!z3) {
                throw null;
            }
            throw null;
        }
        if (!z3 || i3 == 0 || i3 == this.f21556u) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zag zagVar = this.f21559x;
        return changingConfigurations | zagVar.f21552a | zagVar.f21553b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        zag zagVar = this.f21559x;
        if (!m9081a()) {
            return null;
        }
        zagVar.f21552a = getChangingConfigurations();
        return zagVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (super.mutate() != this) {
            return this;
        }
        if (m9081a()) {
            throw null;
        }
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f21557v == this.f21556u) {
            this.f21557v = i2;
        }
        this.f21556u = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
