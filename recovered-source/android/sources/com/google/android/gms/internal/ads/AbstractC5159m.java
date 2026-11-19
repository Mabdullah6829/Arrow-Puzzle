package com.google.android.gms.internal.ads;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5159m {
    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m3844b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NetworkEvent.Builder m3845c() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ PlaybackErrorEvent.Builder m3846d() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ PlaybackMetrics.Builder m3847e() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackStateEvent.Builder m3849g() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ TrackChangeEvent.Builder m3850h(int i2) {
        return new TrackChangeEvent.Builder(i2);
    }
}
