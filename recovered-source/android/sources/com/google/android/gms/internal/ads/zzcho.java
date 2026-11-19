package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcho {

    /* JADX INFO: renamed from: b */
    public long f10042b;

    /* JADX INFO: renamed from: a */
    public final long f10041a = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8657n0)).longValue());

    /* JADX INFO: renamed from: c */
    public boolean f10043c = true;

    /* JADX INFO: renamed from: a */
    public final void m5452a(SurfaceTexture surfaceTexture, final zzchi zzchiVar) {
        if (zzchiVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f10043c) {
            long j2 = timestamp - this.f10042b;
            if (Math.abs(j2) < this.f10041a) {
                return;
            }
        }
        this.f10043c = false;
        this.f10042b = timestamp;
        com.google.android.gms.ads.internal.util.zzs.f3626l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzchiVar.zzi();
            }
        });
    }
}
