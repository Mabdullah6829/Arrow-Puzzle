package com.google.android.gms.internal.ads;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
final class zzaea extends zzadz implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.zzadz
    /* JADX INFO: renamed from: a */
    public final void mo4040a() {
        long refreshRate;
        super.mo4040a();
        this.f5075a.postFrameCallback(this);
        Display display = this.f5076b.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            zzeh.m6211c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f5078d = refreshRate;
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    /* JADX INFO: renamed from: b */
    public final void mo4041b() {
        this.f5076b.unregisterDisplayListener(this);
        this.f5075a.removeFrameCallback(this);
        this.f5077c = -9223372036854775807L;
        this.f5078d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f5077c = j2;
        this.f5075a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        long refreshRate;
        if (i2 == 0) {
            this.f5075a.postFrameCallback(this);
            Display display = this.f5076b.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                zzeh.m6211c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f5078d = refreshRate;
        }
    }
}
