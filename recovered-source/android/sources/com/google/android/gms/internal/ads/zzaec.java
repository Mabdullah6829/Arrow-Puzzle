package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(33)
final class zzaec extends zzadz implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: e */
    public final Handler f5080e;

    public /* synthetic */ zzaec(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f5080e = zzfm.m6514p();
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    /* JADX INFO: renamed from: a */
    public final void mo4040a() {
        super.mo4040a();
        this.f5075a.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    /* JADX INFO: renamed from: b */
    public final void mo4041b() {
        this.f5076b.unregisterDisplayListener(this);
        this.f5080e.removeCallbacksAndMessages(null);
        this.f5075a.removeVsyncCallback(this);
        this.f5077c = -9223372036854775807L;
        this.f5078d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            this.f5075a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f5077c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f5078d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f5078d = -9223372036854775807L;
        }
        this.f5080e.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzaec zzaecVar = this.f5079s;
                zzaecVar.f5075a.postVsyncCallback(zzaecVar);
            }
        }, 500L);
    }
}
