package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzadz implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final Choreographer f5075a;

    /* JADX INFO: renamed from: b */
    public final DisplayManager f5076b;

    /* JADX INFO: renamed from: c */
    public volatile long f5077c = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public volatile long f5078d = -9223372036854775807L;

    public /* synthetic */ zzadz(Choreographer choreographer, DisplayManager displayManager) {
        this.f5075a = choreographer;
        this.f5076b = displayManager;
    }

    /* JADX INFO: renamed from: a */
    public void mo4040a() {
        this.f5076b.registerDisplayListener(this, zzfm.m6514p());
    }

    /* JADX INFO: renamed from: b */
    public void mo4041b() {
        throw null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
